package ru.acs.fts.eps2.router.persistence.operators;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.persistence.entities.CustomsRouting;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Wmqaddress;
import ru.acs.fts.eps2.model.entities.ExtRtuRouting;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.ExtRtuRoutingService;
import ru.acs.fts.eps2.model.services.IpslistService;
import ru.acs.fts.eps2.model.services.IpstechService;
import ru.acs.fts.eps2.model.services.UdCustListService;
import ru.acs.fts.eps2.model.services.WmqAddressService;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CustomsOperator implements IOperator
{
	private CustomsService _customsService;	
	private UdCustListService _udCustListService;	
	private IpslistService _ipslistService;	
	private IpstechService _ipsTechService;	
	private WmqAddressService _wmqAddressService;	
	private ExtRtuRoutingService _extRtuRoutingService;
	
	// @formatter:off
	@Required
	public void setCustomsService( CustomsService service ) { _customsService = service; }
	public CustomsService getCustomsService( ) { return _customsService; }
	
	@Required
	public void setUdCustListService( UdCustListService service ) { _udCustListService = service; }
	public UdCustListService getUdCustListService( ) { return _udCustListService; }
	
	@Required
	public void setIpslistService( IpslistService service ) { _ipslistService = service; }
	public IpslistService getIpslistService( ) { return _ipslistService; }
	
	@Required
	public void setIpsTechService( IpstechService service ) { _ipsTechService = service; }
	public IpstechService getIpstechService( ) { return _ipsTechService; }
	
	@Required
	public void setWmqAddressService( WmqAddressService service ) { _wmqAddressService = service; }
	public WmqAddressService getWmqAddressService( ) { return _wmqAddressService; }
	
	@Required
	public void setExtRtuRoutingService( ExtRtuRoutingService service ) { _extRtuRoutingService = service; }
	public ExtRtuRoutingService getExtRtuRoutingService( ) { return _extRtuRoutingService; }
	// @formatter:on
	
	public CustomsType mapCustomsToCustomsType( Edecl_Customs customs )
	{
		CustomsType custType = new CustomsType( );
		custType.setCustomsCode( customs.getCustomCode( ) );
		custType.setExchType( customs.getCustomExchange( ) );		
		
		return custType;
	}
	
	public CustomsRouting getCustomsRouting( String customCode, String exchType )
		throws DatabaseException
	{
		Edecl_Customs custom = _customsService.getCustoms( customCode, exchType );
		if ( null == custom )
			return null;
		
		Edecl_Wmqaddress wmqAddress = _wmqAddressService.get( custom.getWmqAddress( ) );
		if ( null == wmqAddress )
			return null;
		
		CustomsRouting routing = new CustomsRouting( );
		routing.setTransportAddress( custom.getTransportAddress( ) );
		routing.setTransportServer( wmqAddress.getTransportServer( ) );
		routing.setLocalManager( wmqAddress.getLocalManager( ) );
		routing.setLocalQueue( wmqAddress.getLocalQueue( ) );
		routing.setRemoteManager( wmqAddress.getRemoteManager( ) );
		routing.setRemoteQueue( wmqAddress.getRemoteQueue( ) );
		routing.setIsLocal( true );
		
		return routing;
	}
	
	public ExtRtuRouting getExternalRouting( String customCode, int exchType )
	{
		return _extRtuRoutingService.getExternalRouting( customCode, exchType );
	}
	
	public ExtRtuRouting getExternalRouting( Edecl_Customs customs ) // NO_UCD (unused code)
	{
		int exchType =  Integer.valueOf( customs.getCustomExchange( ) );
		String customsCode = customs.getCustomCode( );
		
		return getExternalRouting( customsCode, exchType );
	}
	
	public boolean isExtRtuRoutingWithCustomsCodeExist( String custCode, int exchType ) // NO_UCD (unused code)
	{
		return _extRtuRoutingService.isExtRtuRoutingWithCustomsCodeExist( custCode, exchType );
	}
	
	public boolean checkRtuMask( String customsCode, int exchType )
	{
		return _extRtuRoutingService.checkRtuMask( customsCode, exchType );
	}	
}
