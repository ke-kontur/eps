package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.List;

/**
 *
 * <p>Параметры контекста задачи (JobContext):</p>
 * 
 * <ul>
 * <li><b>envelopes</b> - имя списка конвертов, где будут храниться конверты для отправки</li>
 * </ul>
 */
public class MessageCMN11095BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN11095BusinessProcess.class );
	
	private final static String cmnTransitName = "transitMessage";
	private final static String cmn00004notifName = "cmn00004notif";
	private final static String adm11095RemoteTransitName = "adm11095Transit";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		Edecl_Proc_Information process = getProcess( recvEnv );		
		
		if ( ProcedureUdFlags.isRrwTransit(process.getUdFlag()) ) {
			envelopes.add( prepareAdmRemoteTransit(jobBatchContext, recvEnv, process) );
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
	


	private EDEnvelope prepareAdmRemoteTransit(
			EDJobBatchContext jobBatchContext,
			EDEnvelope recvEnv,
			Edecl_Proc_Information process )
			throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( adm11095RemoteTransitName );

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

}
