package ru.acs.fts.eps2.model.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Ecop;
import ru.acs.fts.eps2.model.entities.Ecop1;
import ru.acs.fts.eps2.model.entities.Ecop2;
import ru.acs.fts.eps2.model.entities.Ecop3;
import ru.acs.fts.eps2.model.entities.Ecop4;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class EcopService implements IGenericService
{
	private BaseStorage< Ecop > _ecop;
	private BaseStorage< Ecop1 > _ecop1;
	private BaseStorage< Ecop2 > _ecop2;
	private BaseStorage< Ecop3 > _ecop3;
	private BaseStorage< Ecop4 > _ecop4;

	public EcopService( )
	{
		_ecop = new BaseStorage< Ecop >( Ecop.class );
		_ecop1 = new BaseStorage< Ecop1 >( Ecop1.class );
		_ecop2 = new BaseStorage< Ecop2 >( Ecop2.class );
		_ecop3 = new BaseStorage< Ecop3 >( Ecop3.class );
		_ecop4 = new BaseStorage< Ecop4 >( Ecop4.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_ecop.setJpaTemplate( jpaTemplate );
		_ecop1.setJpaTemplate( jpaTemplate );
		_ecop2.setJpaTemplate( jpaTemplate );
		_ecop3.setJpaTemplate( jpaTemplate );
		_ecop4.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _ecop.getJpaTemplate( );
	}

	public Ecop getEcopByInnConsideringCurrentDate( String inn )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select eo from Ecop eo " );
		q.append( "where eo.inn = :inn " );
			q.append( " and CURRENT_TIMESTAMP >= eo.dBegin " );
			q.append( " and ( CURRENT_TIMESTAMP <= eo.dEnd or ( eo.dEnd is null ) ) " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "inn", inn );

		List< Ecop > res = _ecop.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return null;

		return res.get( 0 );
	}

	public List< Ecop2 > getEcop2( String st, String nlic, String prPer, Date dBegin )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select eo2 from Ecop2 eo2 " );
		q.append( "where eo2.st = :st " );
			q.append( "and eo2.nlic = :nlic " );
			q.append( "and eo2.prPer = :prPer " );
			q.append( "and eo2.dBegin = :dBegin " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "st", st );
		args.put( "nlic", nlic );
		args.put( "prPer", prPer );
		args.put( "dBegin", dBegin );

		return _ecop2.select( q.toString( ), args );
	}

	public List< Ecop3 > getEcop3( String st, String nlic, String prPer, Date dBegin )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select eo3 from Ecop3 eo3 " );
		q.append( "where eo3.st = :st " );
			q.append( "and eo3.nlic = :nlic " );
			q.append( "and eo3.prPer = :prPer " );
			q.append( "and eo3.dBegin = :dBegin " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "st", st );
		args.put( "nlic", nlic );
		args.put( "prPer", prPer );
		args.put( "dBegin", dBegin );

		return _ecop3.select( q.toString( ), args );
	}

}
