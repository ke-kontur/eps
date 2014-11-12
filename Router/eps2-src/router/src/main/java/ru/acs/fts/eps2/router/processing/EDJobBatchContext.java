package ru.acs.fts.eps2.router.processing;

import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.ProcedureChangeInformation;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.router.errors.EDErrors;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class EDJobBatchContext extends JobBatchContext
{
	private static final String INCOME_MESSAGE = "__incomeMessage";
	private static final String INCOME_MESSAGE_TRIED = "__incomeMessageTried";
	private static final String INCOME_MESSAGE_DOCUMENT = "__incomeMessageDocument";
	private static final String INCOME_MESSAGE_DOCUMENT_TRIED = "__incomeMessageDocumentTried";
	
	/**
	 * Информация о смене состояния процедуры
	 * Требуется для того, чтобы разнести во времени ChangeProcessState и UpdateProcessState
	 */
	private ProcedureChangeInformation _procedureChangeInformation = new ProcedureChangeInformation( );
	
	private String _senderSystem;

	public EDJobBatchContext( Configurator configurator, ServiceHolder serviceHolder )
	{
		super( configurator, serviceHolder, new EDErrors( ) );
	}
	
	// @formatter:off
	public void setProcedureChangeInformation( ProcedureChangeInformation procedureChangeInformation ) { _procedureChangeInformation = procedureChangeInformation; }
	public ProcedureChangeInformation getProcedureChangeInformation( ) { return _procedureChangeInformation; }
	
	public void setSenderSystem( String senderSystem ) { _senderSystem = senderSystem; }
	public String getSenderSystem( ) { return _senderSystem; }
	// @formatter:on
	
	public EDEnvelope getReceivedEnvelope( ) { return ( EDEnvelope )super.getReceivedEnvelope( ); }
	
	public EDServiceHolder getServiceHolder( ) { return ( EDServiceHolder )super.getServiceHolder( ); }
	
	@Override
	public EDConfigurator getConfigurator( ) { return ( EDConfigurator ) super.getConfigurator( ); }
	
	/**
	 * Вспомогательные функции
	 */
	
	
	public Edecl_Messages getIncomeMessage( ) 
		throws DatabaseException
	{
		/** Если уже достали, возвращаем */
		if ( contains( INCOME_MESSAGE ) )
			return ( Edecl_Messages )get( INCOME_MESSAGE );
		
		/** Если уже пытались и не нашли, то наверное не найдем вовсе */
		if ( contains( INCOME_MESSAGE_TRIED ) && getBoolean( INCOME_MESSAGE_TRIED ) )
			return null;
		
		String initialEnvelopeId = getReceivedEnvelope( ).getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
			return null;
		
		String incomeEnvelopeId = getServiceHolder( )
			.getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
			return null;
		
		Edecl_Messages incomeMessage = getServiceHolder( ).getEnvelopeService( ).getEnvelope( incomeEnvelopeId );
		put( INCOME_MESSAGE, incomeMessage );
		put( INCOME_MESSAGE_TRIED, true );
		
		return incomeMessage;
	}

	public void doNotUseThis_setIncomeMessage( Edecl_Messages msg )
	{
		put( INCOME_MESSAGE, msg );
		put( INCOME_MESSAGE_TRIED, true );
	}
	
	public Edecl_Msg_Doc getIncomeMessageDocument( ) 
		throws DatabaseException
	{
		if ( contains( INCOME_MESSAGE_DOCUMENT ) )
			return ( Edecl_Msg_Doc )get( INCOME_MESSAGE_DOCUMENT );
		
		if ( contains( INCOME_MESSAGE_DOCUMENT_TRIED ) && getBoolean( INCOME_MESSAGE_DOCUMENT_TRIED ) )
			return null;
		
		Edecl_Messages incomeMsg = getIncomeMessage( );
		if ( null == incomeMsg )
			return null;
		
		Edecl_Msg_Doc incomeDoc = getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeMsg.getDocumentId( ) );
		
		if ( null == incomeDoc )
			return null;
		
		put( INCOME_MESSAGE_DOCUMENT, incomeDoc );
		put( INCOME_MESSAGE_DOCUMENT_TRIED, true );
		
		return incomeDoc;
	}
	
	public Edecl_Proc_Information getProcInfo( ) 
		throws DatabaseException
	{
		ProcedureService procServ = getServiceHolder( ).getProcedureService( );
		String processId = getReceivedEnvelope( ).getProcessID( );
		return procServ.getProcInformation( processId );
	}
	
	// TODO: функция хаков, ее быть не должно вовсе
	@Override
	public Object getSpecialField( String fieldName ) 
		throws DatabaseException
	{
		if ( fieldName.equalsIgnoreCase( "IncomeMessage" ) )
			return getIncomeMessage( );
		else if ( fieldName.equalsIgnoreCase( "ProcInfo" ) )
		{
			ProcedureService procServ = getServiceHolder( ).getProcedureService( );
			String processId = getReceivedEnvelope( ).getProcessID( );
			return procServ.getProcInformation( processId );
		}
		
		return null;
	}
}
