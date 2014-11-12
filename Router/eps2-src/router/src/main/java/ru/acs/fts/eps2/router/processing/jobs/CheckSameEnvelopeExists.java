package ru.acs.fts.eps2.router.processing.jobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class CheckSameEnvelopeExists extends EDJob
{
	private static final String action = "Проверка существования конверта с таким EnvelopeID и документа с таким DocumentID";
	private static final String PRECHECK = "PRECHECK";
	
	private Map< String, List< String > > _notUniqDocuments;
	private Map< String, List< String > > _notDiffDocuments;
	
	// @formatter:off
	@Required
	public void setNotUniqDocuments( Map< String, List< String > > notUniqDocuments ) { _notUniqDocuments = notUniqDocuments; }
	public Map< String, List< String > > getNotUniqDocuments( ) { return _notUniqDocuments; }

	@Required
	public void setNotDiffDocuments( Map< String, List< String > > notDiffDocuments ) { _notDiffDocuments = notDiffDocuments; }
	public Map< String, List< String > > getNotDiffDocuments( ) { return _notDiffDocuments; }
	// @formatter:on

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		ErrListService errSrv = jobBatchContext.getServiceHolder( ).getErrListService( );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String envelopeId = recvEnv.getEnvelopeID( );
		String documentId = recvEnv.getDocument( ).getDocumentID( );

		checkEnvelopeIds( envelopeId, documentId, recvEnv, envSrv, errSrv, jobBatchContext );
		checkDocumentIds( envelopeId, documentId, recvEnv, envSrv, errSrv, jobBatchContext );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private void checkEnvelopeIds( 
			String envelopeId, String documentId,
			EDEnvelope recvEnv, 
			EnvelopeService envSrv, ErrListService errSrv,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		if ( StringUtil.isNullOrEmpty( envelopeId ) || envSrv.envelopeExists( envelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00000_99, 
				PRECHECK 
			);
		}		
	}
	
	private void checkDocumentIds( 
			String envelopeId, String documentId, EDEnvelope recvEnv,
			EnvelopeService envSrv, ErrListService errSrv,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		List< String > sDocModeIds = _notUniqDocuments.get( recvEnv.getMessageType( ) );
		List< String > docModeIds = new ArrayList< String >( );

		if ( null != sDocModeIds )
		{
			for ( String key : sDocModeIds )
			{
				if ( key.startsWith( "bp" ) )
				{
					key = key.substring( 2 );
					if ( key.startsWith( recvEnv.getSenderSystem( ) ) )
					{					
						key = key.substring( recvEnv.getSenderSystem( ).length( ) + 1 );
						docModeIds.add( key );
					}
				}
				else
				{
					docModeIds.add( key );
				}
			}
		}
		
		String documentModeId = recvEnv.getDocument( ).getDocumentModeID( );
		if ( null != docModeIds && docModeIds.contains( documentModeId ) )
		{
			recvEnv.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
			recvEnv.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
			
			if ( StringUtil.isNullOrEmpty( documentId ) || ! envSrv.documentExists( documentId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00043_01, 
					PRECHECK 
				);
			}
		}
		else
		{
			if ( StringUtil.isNullOrEmpty( documentId ) || envSrv.documentExists( documentId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00029_01, 
					PRECHECK 
				);
			}
		}
		
		if ( recvEnv.getDocument( ).getContainerDocuments( ).size( ) > 0 ) 
		{
			List< String > notDiffIds = _notDiffDocuments.get( recvEnv.getMessageType( ) );
			
			for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );				
				String cDocModeId = cdoc.getDocumentModeID( );
				
				if ( null != docModeIds && docModeIds.contains( cDocModeId ) )
				{
					cdoc.setSaveType( DocumentSaveTypes.INSERT );
					cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
					
					if ( ! envSrv.documentExists( cDocId ) )
					{
						ErrorHelper.throwException( 
							jobBatchContext, ResultCodes._03_00043_01, PRECHECK 
						);
					}
					
					continue;
				}
				
				if ( null != notDiffIds && 
					 ( notDiffIds.contains( cDocModeId ) || notDiffIds.contains( "all" ) ) )
				{
					cdoc.setSaveType( DocumentSaveTypes.INSERT );
					cdoc.setUniqueness( DocumentUniquenesses.PRESENCE_DEPENDED );
					
					continue;
				}
				
				if ( envSrv.documentExists( cDocId ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00029_01, 
						PRECHECK 
					);					
				}
			}
		}
	}
}
