package ru.acs.fts.eps2.router.processing.ead;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToManifestMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class EadRequest2Results
{
	private static final Logger log = LoggerFactory.getLogger( EadRequest2Results.class );
	
	private Map< EadRequest, EadResponse > _mappings;
	
	public void setMappings( Map< EadRequest, EadResponse > mappings ) { _mappings = mappings; }
	public Map< EadRequest, EadResponse > getMappings( )
	{
		if ( null == _mappings )
			_mappings = new HashMap< EadRequest, EadResponse >( );
		
		return _mappings;
	}
	
	public void persist( String envelopeId, String documentId, EDServiceHolder serviceHolder ) 
		throws DatabaseException
	{
		getMappings( );
	
		for ( EadRequest request : _mappings.keySet( ) )
		{
			log.info( String.format(
				"EXT_EAD_MANIFEST[ %s; %s ]",
				envelopeId, request.getLineId( )
			) );
			
			EadResponse response = _mappings.get( request );
			ExtEadManifest manifest = EadToManifestMapper.map2Manifest( envelopeId, documentId, request, response );
			
			serviceHolder.getEdarchService( ).persist( manifest );
		}		
	}
}
