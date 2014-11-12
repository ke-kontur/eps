package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Ecop;
import ru.acs.fts.eps2.model.entities.Ecop2;
import ru.acs.fts.eps2.model.entities.Ecop3;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EcopService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.gtdobligation.GTDObligationType;

public class MessageCMN11076BusinessProcess extends BusinessProcess // NO_UCD (use default)
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		checkGtdObligation( jobBatchContext, recvEnv );

		// устанавливаем статус CURRENT у контейнера и вложенных документов
		Edecl_Msg_Doc container = _serviceHolder.getEnvelopeService( )
			.getDocument( recvEnv.getDocument( ).getDocumentID( ) );
		
		container.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( container );

		List< Edecl_Msg_Doc > containerDocuments = _serviceHolder
			.getEnvelopeService( ).getContainerDocuments( recvEnv.getDocument( ).getDocumentID( ) );
		
		for ( Edecl_Msg_Doc containerDocument : containerDocuments )
		{
			containerDocument.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( containerDocument );
		}

		// устанавливаем флаг у процедуры
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );

		procInfo.setUdFlag( ProcedureUdFlags.ECONOMIC_OPERATORS );
		_serviceHolder.getProcedureService( ).merge( procInfo );

	}

	protected void checkGtdObligation( 
			EDJobBatchContext jobBatchContext, EDEnvelope recvEnv ) 
		throws Exception
	{
		EcopService ecopService = _serviceHolder.getEcopService( );

		// 1
		GTDObligationType gtdObligation = recvEnv.getDocument( )
			.getDocumentInContainer( GTDObligationType.class )
			.getDocumentAsClass( GTDObligationType.class );

		String inn = gtdObligation.getObligationDeclarant( ).getChoice( )
			.getRFOrganizationFeatures( ).getINN( );

		// 2
		List< String > simplification = gtdObligation.getSimplificationList( );
		
		if ( null == simplification || simplification.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00109_04,
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		// 3
		Ecop ecopRecord = ecopService.getEcopByInnConsideringCurrentDate( inn );
		if ( ecopRecord != null )
		{
			checkEcop( recvEnv, simplification, ecopRecord, jobBatchContext );
		}
		else
		{
			// 8
			inn = gtdObligation.getConsignee( ).getChoice( ).getRFOrganizationFeatures( ).getINN( );
			ecopRecord = ecopService.getEcopByInnConsideringCurrentDate( inn );
			if ( ecopRecord != null )
			{
				checkEcop( recvEnv, simplification, ecopRecord, jobBatchContext );
			}
			else
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00109_03, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
		}

	}

	private void checkEcop( 
			EDEnvelope recvEnv, 
			List< String > simplification, Ecop ecopRecord,
			EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EcopService ecopService = _serviceHolder.getEcopService( );

		// 4
		List< Ecop2 > ecop2Records = ecopService.getEcop2( 
			ecopRecord.getSt( ), ecopRecord.getNlic( ), 
			ecopRecord.getPrPer( ), ecopRecord.getDBegin( ) 
		);

		// 5
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService
			.getProcInformation( recvEnv.getProcessID( ) );
		
		String customsCode = procInfo.getCustCode( );

		boolean kodTamFound = false;
		for ( Ecop2 ecop2 : ecop2Records )
		{
			if ( customsCode.equalsIgnoreCase( ecop2.getKodTam( ) ) )
			{
				kodTamFound = true;
				break;
			}
		}

		if ( ! kodTamFound )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00109_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		// 6
		List< Ecop3 > ecop3Records = ecopService.getEcop3( 
			ecopRecord.getSt( ), ecopRecord.getNlic( ), 
			ecopRecord.getPrPer( ), ecopRecord.getDBegin( ) 
		);

		// 7
		boolean simplificationFound = false;
		for ( String string : simplification )
		{
			simplificationFound = false;
			for ( Ecop3 ecop3 : ecop3Records )
			{
				if ( string.equalsIgnoreCase( ecop3.getSpSimpl( ) ) )
				{
					simplificationFound = true;
					break;
				}
			}
			if ( ! simplificationFound )
				break;
		}

		if ( ! simplificationFound )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00109_02, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

	}

}
