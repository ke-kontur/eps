package ru.acs.fts.eps2.engine.processing;

import ru.acs.fts.eps2.model.entities.Edecl_Procstate;

import java.util.ArrayList;
import java.util.List;

public class ProcedureChangeInformation
{
	/**
	 * Список переходов состояний процедуры для сохранения в базу данных
	 */
	private List< Edecl_Procstate > _procStates = new ArrayList< Edecl_Procstate >( );
	
	/**
	 * Новое состояние процедуры для сохранения в базу данных
	 */
	private String _newProcedureState;
	
	/**
	 * Флаги, которые следует установить процедуре
	 */
	private int _newFlags;
	
	// @formatter:off
	public List< Edecl_Procstate > getProcStates( ) { return _procStates; }

	public String getNewProcedureState( ) { return _newProcedureState; }
	public void setNewProcedureState( String newProcedureState ) { _newProcedureState = newProcedureState; }
	
	public void setNewFlags( int newFlags ) { _newFlags = newFlags; }
	public int getNewFlags( ) { return _newFlags; }
	// @formatter:on

	public ProcedureChangeInformation( )
	{

	}

	public ProcedureChangeInformation( String newProcedureState, Edecl_Procstate procStates )
	{
		_newProcedureState = newProcedureState;
		addProcState( procStates );
	}

	public void addProcState( Edecl_Procstate procState )
	{
		_procStates.add( procState );
	}
}
