package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRemoting;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.schemas.album.result.EADInfoType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

public class MessageADM00004_OezDestrBusinessProcess extends BusinessProcess
{
	private Map< String, ManifestCompletedProcessor > _manifestProcessors;

	@Required
	public void setManifestProcessors( Map< String, ManifestCompletedProcessor > manifestProcessors ) { _manifestProcessors = manifestProcessors; }
	public Map< String, ManifestCompletedProcessor > getManifestProcessors( ) { return _manifestProcessors; }
		
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		ResultType resDocument = recvEnv.getDocument( ).getDocumentAsClass( ResultType.class ); 
		
		String reqEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		
		List< ExtEadManifest > manifests = _serviceHolder.getEdarchService( ).getExternalEadManifests( reqEnvelopeId );
		
		EADInfoType eadInfo = getEadInfo( resDocument );
		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getRequestArchId( ).equalsIgnoreCase( eadInfo.getArchID( ) ) &&
				 mf.getRequestArchDocId( ).equalsIgnoreCase( eadInfo.getArchDocID( ) ) )
			{				
				mf.setStatus( ExtEadManifest.STATUS_RECEIVED );
				mf.setData( null );
				mf.setResultCode( ResultCodes._00_00000_00 );
				
				_serviceHolder.getEdarchService( ).merge( mf );
			}
		}
		
		EadRemoting.processManifests( manifests, _manifestProcessors, jobBatchContext, jobContext );		
	}
	
	private EADInfoType getEadInfo( ResultType resDocument ) 
		throws Exception
	{
		List< ResponseType > responseList = resDocument.getResponseList( );
		if ( null == responseList || 0 == responseList.size( ) )
			throw new Exception( "Странный ответ" );
		
		ResponseType response = responseList.get( 0 );
		
		List< ResultInformationType > resInfoList = response.getResultInformationList( );
		if ( null == resInfoList || 0 == resInfoList.size( ) )
			throw new Exception( "Странный ответ" );
		
		ResultInformationType resInfo = resInfoList.get( 0 );

		List< EADInfoType > eadInfoList = resInfo.getEADInfoList( );
		
		if ( null == eadInfoList || 0 == eadInfoList.size( ) )
			throw new Exception( "Странный ответ" );
		
		EADInfoType eadInfo = eadInfoList.get( 0 );
		
		if ( null == eadInfo )
			throw new Exception( "Странный ответ" );
		
		return eadInfo;
	}
}
