package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Locale;

import org.joda.time.DateTime;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.notifconfirmdt.NotifConfirmDTType;

public class MessageCMN11072BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		NotifConfirmDTType doc = recvEnv.getDocument( ).getDocumentAsClass( NotifConfirmDTType.class );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );
		
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}

		if ( procInfo.getUdFlag( ) == ProcedureUdFlags.ECONOMIC_OPERATORS && null == procInfo.getDeadline( ) )
		{
			if ( null == doc.getObligationDeadline( ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._03_00100_02, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}

			procInfo.setDeadline( new DateTime( doc.getObligationDeadline( ) ).toCalendar( Locale.getDefault( ) ) );
			_serviceHolder.getProcedureService( ).persist( procInfo );
		}
	}
}
