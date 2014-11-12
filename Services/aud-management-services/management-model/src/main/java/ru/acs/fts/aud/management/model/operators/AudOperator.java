package ru.acs.fts.aud.management.model.operators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclProcInformation;
import ru.acs.fts.aud.management.model.exceptions.PersistenceException;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.model.services.EdeclService;

public class AudOperator
{
	private static final Logger log = LoggerFactory.getLogger( AudOperator.class );
	
	private AudService _audService;
	private EdeclService _edeclService;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setEdeclService( EdeclService edeclService ) { _edeclService = edeclService; }
	public EdeclService getEdeclService( ) { return _edeclService; }
	// @formatter:on
	
	/**
	 * Получаем информацию о процедуре (AUD). В случае если записи о такой процедуре в EDECL_AUD_PROCINFO не
	 * существует, делаем выборку из основной базы процедур АПС ЭПС (EDECL_PROC_INFORMATION)
	 */
	public EdeclAudProcInfo getAudProcedureInfo( String processId ) 
		throws PersistenceException
	{
		EdeclAudProcInfo procInfo = _audService.getAudProcInfo( processId );
		if ( null != procInfo )
			return procInfo;
		
		log.info( String.format( "Создаем новую запись в таблице EDECL_AUD_PROCINFO для процедуры %s", processId ) );
		
		EdeclProcInformation edeclProcInfo = _edeclService.getProcInformation( processId );
		if ( null == edeclProcInfo )
			throw new PersistenceException( String.format( "Не найдено в БД процедуры с ProcessID = %s", processId ) );
		
		procInfo = new EdeclAudProcInfo( );
		procInfo.setProcessId( processId );
		procInfo.setGtdCustomsCode( edeclProcInfo.getGtdidCustCode( ) );
		procInfo.setGtdRegistrationDate( edeclProcInfo.getGtdidDate( ) );
		procInfo.setGtdNumber( edeclProcInfo.getGtdidRegNum( ) );
		procInfo.setPacketId( null );
		procInfo.setPkCreateDateTime( null );
		procInfo.setPkChangeDateTime( null );

		_audService.persist( procInfo );
		return procInfo;
	}
}
