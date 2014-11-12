package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.inventory.InventoryType;
import ru.acs.fts.schemas.album.notifgtdregistration.NotifGTDRegistrationType;

public class MessageMSG11020BusinessProcess extends BusinessProcess
{
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( BusinessSystems.isSuchSystem( BusinessSystems.EPS, recvEnv.getSenderSystem( ) ) )
			executeRemoteRtu( recvEnv, jobBatchContext, jobContext );
		else
			executeLocalRtu( recvEnv, jobBatchContext, jobContext );
	}
	
	private void executeRemoteRtu(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		// Сохранение информации о типе декларации:

		String processId = recvEnv.getProcessID( );

		Edecl_Proc_Information procInfo = _serviceHolder
			.getProcedureService( ).getProcInformation( processId );
		
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		ESADoutCUType esadOut = recvEnv.getDocument( )
			.getDocumentInContainer( ESADoutCUType.class )
			.getDocumentAsClass( ESADoutCUType.class );
		
		NotifGTDRegistrationType notifGtdRegistration = recvEnv.getDocument( )
			.getDocumentInContainer( NotifGTDRegistrationType.class )
			.getDocumentAsClass( NotifGTDRegistrationType.class );

		procInfo.setTransferType( esadOut.getCustomsProcedure( ) );
		procInfo.setCustProcedureCode( esadOut.getCustomsModeCode( ) );

		// и регистрационном номере ДТ:

		procInfo.setGtdIdCustCode( notifGtdRegistration.getGTDID( ).getCustomsCode( ) );
		procInfo.setGtdIdDate( notifGtdRegistration.getGTDID( ).getRegistrationDate( ).toDate( ) );

		if ( null != notifGtdRegistration.getDocSign( ) && 
			 notifGtdRegistration.getDocSign( ).equals( "1" ) )
		{
			procInfo.setGtdIdRegNum( String.format( 
				"ОБ%s", notifGtdRegistration.getGTDID( ).getGTDNumber( ) 
			) );
		}
		else
		{
			procInfo.setGtdIdRegNum( 
				notifGtdRegistration.getGTDID( ).getGTDNumber( ) 
			);
		}

		_serviceHolder.getProcedureService( ).merge( procInfo );		
	}
	
	private void executeLocalRtu(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		checkContainerCurrent( recvEnv, jobBatchContext, jobContext );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		if ( RemotenessHelper.isCustomsLocal( recvEnv.getReceiverCustoms( ).getCustomsCode( ) ) )
		{
			EDEnvelope msg11020 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
			);
			
			envelopes.add( msg11020 );
			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}
		else
		{
			EDEnvelope msg11020 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.EPS, recvEnv.getReceiverCustoms( ) 
			);
			
			envelopes.add( msg11020 );
		}
	}
	
	private void checkContainerCurrent( 
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, DatabaseException
	{
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( cdoc.isDocumentOfClass( InventoryType.class ) ||
				 cdoc.isDocumentOfClass( ESADoutCUType.class ) )
			{
				Edecl_Msg_Doc dbdoc = _serviceHolder.getEnvelopeService( ).getDocument( cDocId );
				if ( null == dbdoc )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._02_00001_01, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);						
				}
					
				if ( ! dbdoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00031_03, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);						
				}
			}
		}		
	}
	
	public void ededexecuteProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		boolean remoteRtu = 
			RemotenessHelper.isCustomsRemote( recvEnv.getSenderCustoms( ).getCustomsCode( ) );

		ESADoutCUType esadOut = null;
		NotifGTDRegistrationType notifGTDRegistration = null;
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( cdoc.isDocumentOfClass( ESADoutCUType.class ) )
				esadOut = cdoc.getDocumentAsClass( ESADoutCUType.class );
			else if ( cdoc.isDocumentOfClass( NotifGTDRegistrationType.class ) )
				notifGTDRegistration = cdoc.getDocumentAsClass( NotifGTDRegistrationType.class );
			
			if ( cdoc.isDocumentOfClass( InventoryType.class ) ||
				 cdoc.isDocumentOfClass( ESADoutCUType.class ) )
			{
				if ( ! remoteRtu )
				{
					Edecl_Msg_Doc dbdoc = _serviceHolder.getEnvelopeService( )
						.getDocument( cDocId );
					if ( null == dbdoc )
					{
						ErrorHelper.throwException( 
							jobBatchContext, 
							ResultCodes._02_00001_01, 
							ProcessingConstants.ERROR_TYPE_BUSINESS 
						);						
					}
					
					if ( ! dbdoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
					{
						ErrorHelper.throwException( 
							jobBatchContext, 
							ResultCodes._03_00031_03, 
							ProcessingConstants.ERROR_TYPE_BUSINESS 
						);						
					}
				}
			}
		}

		// обработка на удаленном РТУ
		if ( remoteRtu )
		{

			// Сохранение информации о типе декларации:

			String processId = recvEnv.getProcessID( );

			Edecl_Proc_Information procInfo = _serviceHolder
				.getProcedureService( ).getProcInformation( processId );
			
			if ( null == procInfo )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._01_00041_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}

			procInfo.setTransferType( esadOut.getCustomsProcedure( ) );
			procInfo.setCustProcedureCode( esadOut.getCustomsModeCode( ) );

			// и регистрационном номере ДТ:

			procInfo.setGtdIdCustCode( notifGTDRegistration.getGTDID( ).getCustomsCode( ) );
			procInfo.setGtdIdDate( notifGTDRegistration.getGTDID( ).getRegistrationDate( ).toDate( ) );

			if ( null != notifGTDRegistration.getDocSign( ) && 
				 notifGTDRegistration.getDocSign( ).equals( "1" ) )
			{
				procInfo.setGtdIdRegNum( String.format( 
					"ОБ%s", notifGTDRegistration.getGTDID( ).getGTDNumber( ) 
				) );
			}
			else
			{
				procInfo.setGtdIdRegNum( 
					notifGTDRegistration.getGTDID( ).getGTDNumber( ) 
				);
			}

			_serviceHolder.getProcedureService( ).merge( procInfo );
		}
	}
}
