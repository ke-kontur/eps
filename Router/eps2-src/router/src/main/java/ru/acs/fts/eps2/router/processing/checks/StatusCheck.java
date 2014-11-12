package ru.acs.fts.eps2.router.processing.checks;

import java.util.List;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.checks.ICheck;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.utils.CollectionHelper;
import ru.acs.fts.eps2.utils.StringUtil;

public class StatusCheck implements ICheck
{
	private List< String > _statusExps;

	// @formatter:off
	public void setStatusExps( List< String > regExps ) { _statusExps = regExps; }
	public List< String > getStatusExps( ) { return _statusExps; }
	// @formatter:on

	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext ) throws Exception
	{
		EDEnvelope env = ( EDEnvelope )envelope;
		String processId = env.getProcessID( );
		
		if ( !StringUtil.isNullOrEmpty( processId ) )
		{
			EDServiceHolder serviceHolder = ( EDServiceHolder )jobBatchContext.getServiceHolder( );
	
			Edecl_Proc_Information procInfo = serviceHolder.getProcedureService( ).getProcInformation( processId );
	
			if ( null != procInfo )
			{
				String procStatus = procInfo.getCurrentState( );

				if ( !CollectionHelper.isNullOrEmpty( _statusExps ) )
				{
					for ( String statusExp : _statusExps )
					{
						if ( procStatus.matches( statusExp ) )
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
