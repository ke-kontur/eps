package ru.acs.fts.eps2.model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Procstate;
import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;
import ru.acs.fts.eps2.model.entities.Edecl_Statuslist;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.model.entities.M_Edecl_Procinf;
import ru.acs.fts.eps2.model.entities.ProcParticipantAccess;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class ProcedureService implements IGenericService
{
	private BaseStorage< Edecl_Proc_Information > _edeclProcInformations;
	private BaseStorage< Edecl_Procstate > _edeclProcStates;
	private BaseStorage< M_Edecl_Procinf > _edeclProcInf;
	private BaseStorage< Edecl_Substatus_State > _edeclSubstatusStates;
	private BaseStorage< ProcParticipantAccess > _procParticipantAccesses;
	private BaseStorage< Edecl_Statuslist > _edeclStatusLists;
	private BaseStorage< Edecl_State_Transmissions > _edeclStateTransmissions;
	
	private ArrayList< String > _exceptionMessageTypes;
	private String _softVersion;
	
	// @formatter:off
	@Required
	public void setExceptionMessageTypes( ArrayList< String > exceptionMessageTypes ) { _exceptionMessageTypes = exceptionMessageTypes; }
	public ArrayList< String > getExceptionMessageTypes( ) { return _exceptionMessageTypes; }
	
	@Required
	public void setSoftVersion( String softVersion ) { _softVersion = softVersion; }
	public String getSoftVersion( ) { return _softVersion; }
	// @formatter:on

	public ProcedureService( )
	{
		_edeclProcInformations = new BaseStorage< Edecl_Proc_Information >( Edecl_Proc_Information.class );
		_edeclProcStates = new BaseStorage< Edecl_Procstate >( Edecl_Procstate.class );
		_edeclProcInf = new BaseStorage< M_Edecl_Procinf >( M_Edecl_Procinf.class );
		_edeclSubstatusStates = new BaseStorage< Edecl_Substatus_State >( Edecl_Substatus_State.class );
		_procParticipantAccesses = new BaseStorage< ProcParticipantAccess >( ProcParticipantAccess.class );
		_edeclStatusLists = new BaseStorage< Edecl_Statuslist >( Edecl_Statuslist.class );
		_edeclStateTransmissions = new BaseStorage< Edecl_State_Transmissions >( Edecl_State_Transmissions.class );
	}
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclProcInformations.setJpaTemplate( jpaTemplate );
		_edeclProcStates.setJpaTemplate( jpaTemplate );
		_edeclProcInf.setJpaTemplate( jpaTemplate );
		_edeclSubstatusStates.setJpaTemplate( jpaTemplate );
		_procParticipantAccesses.setJpaTemplate( jpaTemplate );
		_edeclStatusLists.setJpaTemplate( jpaTemplate );
		_edeclStateTransmissions.setJpaTemplate( jpaTemplate );
	}
	
	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _edeclProcInformations.getJpaTemplate( );
	}	
	
	public void persist( Edecl_Proc_Information procInfo ) 
		throws DatabaseException
	{
		_edeclProcInformations.persistAndFlush( procInfo );
	}
	
	public void persist( Edecl_Proc_Information procInfo, boolean flush )
		throws DatabaseException
	{
		_edeclProcInformations.persist( procInfo );
		if ( flush )
			_edeclProcInformations.flush( );
	}
	
	public void persist( Edecl_Procstate procState, boolean flush )
		throws DatabaseException
	{
		_edeclProcStates.persist( procState );
		if ( flush )
			_edeclProcStates.flush( );
	}
	
	public void persist( Edecl_Substatus_State substatus ) 
		throws DatabaseException
	{
		_edeclSubstatusStates.persistAndFlush( substatus );
	}
	
	public void persist( ProcParticipantAccess ppa ) 
		throws DatabaseException
	{
		_procParticipantAccesses.persistAndFlush( ppa );
	}
	
	public void persist( Edecl_Statuslist statusList )
		throws DatabaseException
	{
		_edeclStatusLists.persistAndFlush( statusList );
	}

	public void persist( Edecl_State_Transmissions stateTransmissions )
		throws DatabaseException
	{
		_edeclStateTransmissions.persistAndFlush( stateTransmissions );
	}
	
	public void merge( Edecl_Proc_Information procInfo )
		throws DatabaseException
	{
		_edeclProcInformations.mergeAndFlush( procInfo );
	}
	
	public void remove( ProcParticipantAccess ppa )
		throws DatabaseException
	{
		_procParticipantAccesses.remove( ppa );
	}

	public void remove( Edecl_Substatus_State objectToRemove  )
		throws DatabaseException
	{
		_edeclSubstatusStates.remove( objectToRemove );
	}
	
	public Edecl_Proc_Information getProcInformation( String processId )
		throws DatabaseException
	{
		return _edeclProcInformations.get( processId );
	}
	
	public Edecl_Proc_Information getProcessIdByGtdNumber( 
			String gtdNumber, String customsCode, Date registrationDate ) 
		throws DatabaseException
	{
		StringBuilder request = new StringBuilder( );
		
		request.append( "select pi from Edecl_Proc_Information pi " );
		request.append( "where pi.gtdIdCustCode = :gtdidCustCode " );
		request.append( " and pi.gtdIdDate = :gtdidDate " );
		request.append( " and pi.gtdIdRegNum = :gtdidRegNum " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "gtdidCustCode", customsCode );
		arguments.put( "gtdidDate", registrationDate );
		arguments.put( "gtdidRegNum", gtdNumber );
		
		List< Edecl_Proc_Information > res = _edeclProcInformations.select( request.toString( ), arguments );
		if ( res.size( ) == 0 )
			return null;
		
		return res.get( 0 );
	}	
	
	public List< M_Edecl_Procinf > getProcedureInformation( String processId, String transportInformation )
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select inf from M_Edecl_Procinf inf " );
		bld.append( "where ( inf.processId = :processId " );
		bld.append( " and ( inf.senderInformation = :transportInfo " );
		bld.append( " or inf.recieverInformation = :transportInfo ) ) " );
		bld.append( "order by inf.processTime" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "processId", processId );
		arguments.put( "transportInfo", transportInformation );
		
		return ( List< M_Edecl_Procinf > )_edeclProcInf.select( bld.toString( ), arguments );
	}

	public boolean isExistProcessByParticipantID( String participantId, String processID ) 
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select pi from Edecl_Proc_Information pi " );
		bld.append( "where pi.participantId = :participantId " );
		bld.append( " and pi.processId = :processId " );
			
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "participantId", participantId );
		arguments.put( "processId", processID );
		
		List< Edecl_Proc_Information > infos = _edeclProcInformations.select( bld.toString( ), arguments );
		return ( infos.size( ) > 0 );
	}

	public List< Edecl_Proc_Information > selectProcedures( String query, Map< String, Object > args )
		throws DatabaseException
	{
		return _edeclProcInformations.select( query, args );
	}
	
	public Edecl_Proc_Information getProcedureInfo( 
			String processId, String customCode, 
			String participantId, String softVersion )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from Edecl_Proc_Information pi " );
		q.append( "where pi.processId = :processId " );
		q.append( " and pi.custCode = :custCode " );
		q.append( " and pi.participantId = :participantId " );
		q.append( " and pi.softVersion = :softVersion " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "custCode", customCode );
		args.put( "participantId", participantId );
		args.put( "softVersion", softVersion );
		
		List< Edecl_Proc_Information > res = _edeclProcInformations.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return checkAccess( processId, participantId, softVersion );
		
		return res.get( 0 );
	}

	public Edecl_Proc_Information getProcedureInfo( 
			String processId, String participantId, String softVersion )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from Edecl_Proc_Information pi " );
		q.append( "where pi.processId = :processId " );
		q.append( " and pi.participantId = :participantId " );
		q.append( " and pi.softVersion = :softVersion " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "participantId", participantId );
		args.put( "softVersion", softVersion );
		
		List< Edecl_Proc_Information > res = _edeclProcInformations.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return checkAccess( processId, participantId, softVersion );
		
		return res.get( 0 );
	}

	public ProcParticipantAccess getParticipantAccess( String processId, String participantId, String softVersion )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ppa from ProcParticipantAccess ppa " );
		q.append( "where ppa.processId = :processId " );
		q.append( " and ppa.participantId = :participantId " );
		q.append( " and ppa.softVersion = :softVersion " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "participantId", participantId );
		args.put( "softVersion", softVersion );
		
		List< ProcParticipantAccess > res = _procParticipantAccesses.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public Edecl_Proc_Information checkAccess( String processId, String participantId, String softVersion )
		throws DatabaseException
	{
		ProcParticipantAccess ppa = getParticipantAccess( processId, participantId, softVersion );
		if ( null == ppa )
			return null;
		
		return getProcInformation( processId );
	}

	public List< Edecl_Substatus_State > getProcSubStatuses( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select ss from Edecl_Substatus_State ss " );
		q.append( "where ss.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< Edecl_Substatus_State > res = _edeclSubstatusStates.select( q.toString( ), args );
		return res;
	}
	
	public List< Edecl_Substatus_State > getProcSubstatuses( String docId, String stCode )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select ss from Edecl_Substatus_State ss " );
		q.append( "where ss.documentId = :documentId " );
		q.append( "and ss.stCode = :stCode " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", docId );
		args.put( "stCode", stCode );
		
		List< Edecl_Substatus_State > res = _edeclSubstatusStates.select( q.toString( ), args );
		return res;
	}

	public List< Edecl_Substatus_State > getProcSubstatuses( String processId, String docId, String stCode )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select ss from Edecl_Substatus_State ss " );
		q.append( "where ss.processId = :processId " );		
		q.append( "and ss.documentId = :documentId " );
		q.append( "and ss.stCode = :stCode " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "documentId", docId );
		args.put( "stCode", stCode );
		
		List< Edecl_Substatus_State > res = _edeclSubstatusStates.select( q.toString( ), args );
		return res;
	}
	
	public Edecl_Proc_Information getProcedureInformation( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from Edecl_Proc_Information pi " );
		q.append( "where pi.processId = :processId " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< Edecl_Proc_Information > res = _edeclProcInformations.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public List< Object > selectTimeOutProcesses( Date lastDate, String softVersion )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( "select ST.processId, ST.id, ST.setStatusTime, ST.code, " );
		query.append( "SL.description, PI.custCode,  PI.exchType, PI.participantId, PI.borderCustCode " );
		query.append( "from Edecl_Proc_Information PI, Edecl_Procstate ST, Edecl_Statuslist SL " );
		query.append( "where ST.processId = PI.processId and ST.code = SL.code " );
		query.append( "and PI.currentState = 'AEO_DTWaitable' " );
		query.append( "and PI.softVersion = :softVersion " );
		query.append( "and PI.gtdIdDate <= :lastDate and PI.softVersion = :softVersion" );
		
		Map< String, Object > params = new HashMap< String, Object >( );
		params.put( "lastDate", lastDate );
		params.put( "softVersion", softVersion );
		
		return _edeclProcInf.selectObjects( query.toString( ), params );
	}
	
	public List< Object > selectTimeOutProcesses( int timeout )
		throws DatabaseException
	{
		Calendar date = new GregorianCalendar( );
		date.add( Calendar.DATE, -timeout );
		date.set( Calendar.HOUR_OF_DAY, 0 );
		date.set( Calendar.MINUTE, 0 );
		date.set( Calendar.SECOND, 0 );
		date.set( Calendar.MILLISECOND, 0 );
		
		return selectTimeOutProcesses( date.getTime( ), _softVersion );
	}
	
	public List< Object > selectPreviousStateInfo( int recordId, String processId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( "select PS.id, PS.code, SL.description" );
		query.append( " from Edecl_Procstate PS, Edecl_Statuslist SL" );
		query.append( " where PS.id < :recordId and PS.processId = :processId" );
		query.append( " and PS.code = SL.code order by PS.id desc" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "recordId", recordId );
		args.put( "processId", processId );
		
		return _edeclProcStates.selectObjects( query.toString( ), args );
	}
	
	public List< Object > selectTimeOutProcessesForCmn11047( Calendar lastDate, String softVersion )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( "select PS.processId, PS.id, " );
		query.append( "PS.setStatusTime ,PS.code, " );
		query.append( "SL.description, PI.custCode, " );
		query.append( "PI.exchType, PI.participantId, PI.borderCustCode " );
		query.append( "from Edecl_Proc_Information PI, Edecl_Procstate PS, Edecl_Statuslist SL " );
		query.append( "where PS.processId = PI.processId and PS.code = SL.code " );
		query.append( "and ( PS.code = 'PTD_Registrated' or PS.code = 'UD_PTD_Decl_Registrated' ) " );
		query.append( "and PS.setStatusTime < :lastDate " );
		query.append( "and PI.softVersion = :softVersion " );
		query.append( "and  (PI.currentState ='PTD_ExaminationEnd' or PI.currentState ='UD_PTD_ExaminationEnd' )" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "lastDate", lastDate );
		args.put( "softVersion", softVersion );
		
		return _edeclProcInf.selectObjects( query.toString( ), args );
	}
	
	public List< Edecl_Procstate > getProcStates( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pc from Edecl_Procstate pc " );
		q.append( "where pc.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< Edecl_Procstate > res = _edeclProcStates.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Edecl_Procstate >( );
			
		return res;
	}
	
	public List< Object > selectTimeOutProcessesForCmn11047( int timeout )
		throws DatabaseException
	{
		Calendar date = new GregorianCalendar( );
		date.add( Calendar.DATE, -timeout );
		date.set( Calendar.HOUR_OF_DAY, 0 );
		date.set( Calendar.MINUTE, 0 );
		date.set( Calendar.SECOND, 0 );
		date.set( Calendar.MILLISECOND, 0 );
		
		return selectTimeOutProcessesForCmn11047( date, _softVersion );
	}
}
