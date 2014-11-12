package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRemoting;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;

public class MessageADM00010BusinessProcess extends BusinessProcess
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
		EPSDocResponseType doc = recvEnv.getDocument( ).getDocumentAsClass( EPSDocResponseType.class );
		
		String reqEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		
		List< ExtEadManifest > manifests = _serviceHolder.getEdarchService( )
			.getExternalEadManifests( reqEnvelopeId );
		
		String reqPosition = doc.getDocResponse( ).getRequestPositionID( );
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getRequestLineId( ).equalsIgnoreCase( reqPosition ) )
			{				
				EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
				byte[ ] docData = envMarshaller.marshalBaseDocOrSignature( 
					doc.getDocResponse( ).getDocResponseBody( ).getAny( ), 
					_serviceHolder.getMarshaller( ) 
				).getByteArray( );
				
				EDDocument tmp = new EDDocument( doc.getDocResponse( ).getDocResponseBody( ).getAny( ) );
				
				mf.setStatus( ExtEadManifest.STATUS_RECEIVED );
				mf.setData( docData );
				mf.setAlbumVersion( doc.getArchiveInformation( ).getArchDocAlbum( ) );
				mf.setCreateDate( doc.getArchiveInformation( ).getArchDocDate( ).toDate( ) );
				mf.setResultCode( ResultCodes._00_00000_00 );
				mf.setDocumentModeId( tmp.getDocumentModeID( ) );
				
				_serviceHolder.getEdarchService( ).merge( mf );
			}
		}
		
		EadRemoting.processManifests( manifests, _manifestProcessors, jobBatchContext, jobContext );
	}
}
