package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.ProcedureChangeInformation;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.gtdoutcustomsmark.GTDOutCustomsMarkType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.*;

/**
 *
 * <p>Параметры контекста задачи (JobContext):</p>
 * 
 * <ul>
 * <li><b>envelopes</b> - имя списка конвертов, где будут храниться конверты для отправки</li>
 * </ul>
 */
public class MessageCMN11122BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN11122BusinessProcess.class );
	
	private final static String cmnTransitName = "cmnTransit";	
	private final static String cmn00004notifName = "cmn00004notif";	
	private final static String msgLocalTransitName = "msgLocalTransit";	
	private final static String msgRemoteTransitName = "msgRemoteTransit";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		Edecl_Proc_Information process = getProcess( recvEnv );		
		
		if ( isRemoteImport( process ) )
		{
			String borderCustCode = process.getBorderCustCode( );
			String senderCustCode = recvEnv.getSenderCustoms( ).getCustomsCode( );

			if ( RemotenessHelper.areCustomsLocal( senderCustCode, borderCustCode ) )
			{
				envelopes.add( prepareCmnTransit( jobBatchContext ) );
				envelopes.add( prepareMsgLocalTransit( jobBatchContext, recvEnv, process ) );
				envelopes.add( prepareCmn00004Notif( jobBatchContext ) );
			}
			else
			{
				envelopes.add( prepareMsgRemoteTransit( jobBatchContext, recvEnv, process ) );
			}
		}
		else
		{
			envelopes.add( prepareCmnTransit( jobBatchContext ) );
			envelopes.add( prepareCmn00004Notif( jobBatchContext ) );
		}

	}

	private EDEnvelope prepareCmnTransit( EDJobBatchContext jobBatchContext )
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( cmnTransitName );
		
		transit.setSaveEnvelope( true );
		
		return transit;
	}
	
	private EDEnvelope prepareCmn00004Notif( EDJobBatchContext jobBatchContext )
	{
		EDEnvelope notif = ( EDEnvelope ) jobBatchContext.get( cmn00004notifName );
		
		return notif;
	}

    private Edecl_Proc_Information getProcess( EDEnvelope recvEnv )
            throws DatabaseException
    {
        String processId = recvEnv.getProcessID( );

        return _serviceHolder.getProcedureService( ).getProcInformation( processId );
    }
	
	private EDEnvelope prepareMsgLocalTransit( 
			EDJobBatchContext jobBatchContext, 
			EDEnvelope recvEnv, Edecl_Proc_Information process ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsService customsService = _serviceHolder.getCustomsService( );
		CustomsOperator customsOperator = _serviceHolder.getCustomsOperator( );
		
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( msgLocalTransitName );
		
		String code = process.getBorderCustCode( );
		String exchType = String.valueOf( process.getExchType( ) );
		
		Edecl_Customs customs = customsService.getCustoms( code, exchType );
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		CustomsType receiverCustoms = customsOperator.mapCustomsToCustomsType( customs );
		
		EnvelopeCreator.reRouteMessage( 
			transit, senderCustoms, 
			BusinessSystems.CUSTOMS, receiverCustoms, 
			null, transit.getIncomeEnvelopeID( ) 
		);
						
		transit.setSaveEnvelope( true );
				
		return transit;
	}
	
	private EDEnvelope prepareMsgRemoteTransit( 
			EDJobBatchContext jobBatchContext, 
			EDEnvelope recvEnv,
			Edecl_Proc_Information process ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( msgRemoteTransitName );
		
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( process.getBorderCustCode( ) );
		receiverCustoms.setExchType( Integer.toString( process.getExchType( ) ) );

		EnvelopeCreator.reRouteMessage( 
			transit, senderCustoms, 
			BusinessSystems.EPS, receiverCustoms, 
			null, transit.getIncomeEnvelopeID( ) 
		);
		
		transit.setSaveEnvelope( true );
				
		return transit;
	}
	
	private boolean isRemoteImport( Edecl_Proc_Information process )
	{
		return null != process && ! StringUtil.isNullOrEmpty( process.getBorderCustCode( ) );
	}
		

}
