package ru.acs.fts.aud.wmq.router.jndi;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

import ru.acs.fts.aud.management.utils.shared.GenericUtils;

/*
 * 	<jee:jndi-lookup id="sSenderInformation" jndi-name="${bindingsPrefix}awmqrCtxConfig/SenderInformation" expected-type="java.lang.String" />
	<jee:jndi-lookup id="sReceiverInformation" jndi-name="${bindingsPrefix}awmqrCtxConfig/ReceiverInformation" expected-type="java.lang.String" />
	<jee:jndi-lookup id="sArchiveClientId" jndi-name="${bindingsPrefix}awmqrCtxConfig/ArchiveClientId" expected-type="java.lang.String" />
	<jee:jndi-lookup id="sCustomsCode" jndi-name="${bindingsPrefix}awmqrCtxConfig/CustomsCode" expected-type="java.lang.Integer" />
	
	<jee:jndi-lookup id="sRestCryptoSrvUrl" jndi-name="${bindingsPrefix}awmqrCtxConfig/RestCryptoSrvUrl" expected-type="java.lang.String" />
	
	<jee:jndi-lookup id="sQueueToSend" jndi-name="${bindingsPrefix}awmqrCtxConfig/sQueueToSend" expected-type="java.lang.String" />
	<jee:jndi-lookup id="sQueueManagerToSend" jndi-name="${bindingsPrefix}awmqrCtxConfig/sQueueManagerToSend" expected-type="java.lang.String" />

 */

public class Settings implements Referenceable
{
	public static final String REF_ADDR_SENDER_INFORMATION = "senderInformation";
	public static final String REF_ADDR_RECEIVER_INFORMATION = "receiverInformation";
	public static final String REF_ADDR_ARCHIVE_CLIENT_ID = "archiveClientId";
	public static final String REF_ADDR_CUSTOMS_CODE = "customsCode";
	public static final String REF_ADDR_REST_CRYPTO_SRV_URL = "restCryptoSrvUrl";
	public static final String REF_ADDR_RESULT_DISPATCHER_URL = "resultDispatcherUrl";
	public static final String REF_ADDR_QUEUE_TO_SEND = "queueToSend";
	public static final String REF_ADDR_QUEUE_MANAGER_TO_SEND = "queueManagerToSend";
	public static final String REF_ADDR_QUEUE_ERROR = "queueError";
	public static final String REF_ADDR_QUEUE_MANAGER_ERROR = "queueManagerError";
	
	private String _senderInformation;
	private String _receiverInformation;
	private String _archiveClientId;
	private String _customsCode;
	private String _restCryptoSrvUrl;
	private String _resultDispatcherUrl;
	private String _queueToSend;
	private String _queueManagerToSend;
	private String _queueError;
	private String _queueManagerError;
	
	// @formatter:off
	public void setSenderInformation( String senderInformation ) { _senderInformation = senderInformation; }
	public String getSenderInformation( ) { return _senderInformation; }
	
	public void setReceiverInformation( String receiverInformation ) { _receiverInformation = receiverInformation; }
	public String getReceiverInformation( ) { return _receiverInformation; }
	
	public void setArchiveClientId( String archiveClientId ) { _archiveClientId = archiveClientId; }
	public String getArchiveClientId( ) { return _archiveClientId; }
	
	public void setCustomsCode( Integer customsCode ) { _customsCode = customsCode.toString( ); }
	public Integer getCustomsCode( ) { return Integer.parseInt( _customsCode ); }
	
	public void setRestCryptoSrvUrl( String restCryptoSrvUrl ) { _restCryptoSrvUrl = restCryptoSrvUrl; }
	public String getRestCryptoSrvUrl( ) { return _restCryptoSrvUrl; }
	
	public void setResultDispatcherUrl( String resultDispatcherUrl ) { _resultDispatcherUrl = resultDispatcherUrl; }
	public String getResultDispatcherUrl( ) { return _resultDispatcherUrl; } 
	
	public void setQueueToSend( String queueToSend ) { _queueToSend = queueToSend; }
	public String getQueueToSend( ) { return _queueToSend; }
	
	public void setQueueManagerToSend( String queueManagerToSend ) { _queueManagerToSend = queueManagerToSend; }
	public String getQueueManagerToSend( ) { return _queueManagerToSend; }
	
	public void setQueueError( String queueError ) { _queueError = queueError; }
	public String getQueueError( ) { return _queueError; }
	
	public void setQueueManagerError( String queueManagerError ) { _queueManagerError = queueManagerError; }
	public String getQueueManagerError( ) { return _queueManagerError; }
	// @formatter:on

	@Override
	public Reference getReference( ) 
		throws NamingException
	{
		Reference ref = new Reference(
			Settings.class.getName( ),
			new StringRefAddr( REF_ADDR_SENDER_INFORMATION, _senderInformation ),
			SettingsFactory.class.getName( ),
			null
		);
		
		ref.add( new StringRefAddr( REF_ADDR_RECEIVER_INFORMATION, _receiverInformation ) );
		ref.add( new StringRefAddr( REF_ADDR_ARCHIVE_CLIENT_ID, _archiveClientId ) );
		ref.add( new StringRefAddr( REF_ADDR_CUSTOMS_CODE, _customsCode ) );
		ref.add( new StringRefAddr( REF_ADDR_REST_CRYPTO_SRV_URL, _restCryptoSrvUrl ) );
		ref.add( new StringRefAddr( REF_ADDR_RESULT_DISPATCHER_URL, _resultDispatcherUrl ) );
		ref.add( new StringRefAddr( REF_ADDR_QUEUE_TO_SEND, _queueToSend ) );
		ref.add( new StringRefAddr( REF_ADDR_QUEUE_MANAGER_TO_SEND, _queueManagerToSend ) );
		ref.add( new StringRefAddr( REF_ADDR_QUEUE_ERROR, _queueError ) );
		ref.add( new StringRefAddr( REF_ADDR_QUEUE_MANAGER_ERROR, _queueManagerError ) );
		
		return ref;
	}
	
	public List< String > getReceiverInformationList( )
	{
		List< String > res = new ArrayList< String >( );
		res.add( _receiverInformation );
		return res;
	}
	
	public static Settings fromReference( Reference ref )
	{
		if ( ref.getClassName( ).equals( Settings.class.getName( ) ) )
		{
			RefAddr addrSenderInformation = ref.get( Settings.REF_ADDR_SENDER_INFORMATION );
			RefAddr addrReceiverInformation = ref.get( Settings.REF_ADDR_RECEIVER_INFORMATION );
			RefAddr addrArchiveClientId = ref.get( Settings.REF_ADDR_ARCHIVE_CLIENT_ID );
			RefAddr addrCustomsCode = ref.get( Settings.REF_ADDR_CUSTOMS_CODE );
			RefAddr addrRestCryptoSrvUrl = ref.get( Settings.REF_ADDR_REST_CRYPTO_SRV_URL );
			RefAddr addrResultDispatcherUrl = ref.get( Settings.REF_ADDR_RESULT_DISPATCHER_URL );
			RefAddr addrQueueToSend = ref.get( Settings.REF_ADDR_QUEUE_TO_SEND );
			RefAddr addrQueueManagerToSend = ref.get( Settings.REF_ADDR_QUEUE_MANAGER_TO_SEND );
			RefAddr addrQueueError = ref.get( Settings.REF_ADDR_QUEUE_ERROR );
			RefAddr addrQueueManagerError = ref.get( Settings.REF_ADDR_QUEUE_MANAGER_ERROR );
			
			boolean areNotNull = true;
			areNotNull = GenericUtils.areNotNull( addrSenderInformation, addrReceiverInformation ) && areNotNull;
			areNotNull = GenericUtils.areNotNull( addrArchiveClientId, addrCustomsCode ) && areNotNull;
			areNotNull = GenericUtils.areNotNull( addrRestCryptoSrvUrl, addrResultDispatcherUrl ) && areNotNull;
			areNotNull = GenericUtils.areNotNull( addrQueueToSend, addrQueueManagerToSend ) && areNotNull;
			areNotNull = GenericUtils.areNotNull( addrQueueError, addrQueueManagerError ) && areNotNull;
			
			if ( areNotNull )
			{
				Settings settings = new Settings( );
				
				settings.setSenderInformation( addrSenderInformation.getContent( ).toString( ) );
				settings.setReceiverInformation( addrReceiverInformation.getContent( ).toString( ) );
				settings.setArchiveClientId( addrArchiveClientId.getContent( ).toString( ) );
				settings.setCustomsCode( Integer.parseInt( addrCustomsCode.getContent( ).toString( ) ) );
				settings.setRestCryptoSrvUrl( addrRestCryptoSrvUrl.getContent( ).toString( ) );
				settings.setResultDispatcherUrl( addrResultDispatcherUrl.getContent( ).toString( ) );
				settings.setQueueToSend( addrQueueToSend.getContent( ).toString( ) );
				settings.setQueueManagerToSend( addrQueueManagerToSend.getContent( ).toString( ) );
				settings.setQueueError( addrQueueError.getContent( ).toString( ) );
				settings.setQueueManagerError( addrQueueManagerError.getContent( ).toString( ) );
				
				return settings;
			}
		}
		
		return null;
	}
	
	public static Settings fromReference( Settings settings )
	{
		return settings;
	}

}
