package ru.acs.fts.aud.wmq.router.jndi;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

import ru.acs.fts.aud.management.utils.shared.GenericUtils;

public class SettingsFactory implements ObjectFactory
{

	@Override
	public Object getObjectInstance( Object obj, Name name, Context nameCtx, Hashtable< ?, ? > environment ) 
		throws Exception
	{
		if ( obj instanceof Reference )
		{
			Reference ref = ( Reference )obj;
			
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
		}
		
		return null;
	}

}
