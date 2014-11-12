package ru.acs.fts.eps2.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Edecl_Statemodel_Type;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class StateModelTypeService implements IGenericService
{
	private BaseStorage< Edecl_Statemodel_Type > _edeclStateModelTypes;

	public StateModelTypeService( )
	{
		_edeclStateModelTypes = new BaseStorage< Edecl_Statemodel_Type >(
				Edecl_Statemodel_Type.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclStateModelTypes.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _edeclStateModelTypes.getJpaTemplate( );
	}

	public Edecl_Statemodel_Type getStateModelTypeByCode( String code ) throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );

		query.append( "select smt from Edecl_Statemodel_Type smt " );
		query.append( "where smt.code = :code " );

		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "code", code );

		List< Edecl_Statemodel_Type > res = _edeclStateModelTypes.select( query.toString( ),
				arguments );
		if ( null == res || res.isEmpty( ) )
			return null;

		return res.get( 0 );
	}
}
