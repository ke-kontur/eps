package ru.acs.fts.eps2.model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.persistence.queries.CursoredStream;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Notuniq_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info_Ids;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;

@SuppressWarnings( "deprecation" )
public class EnvelopeService implements IGenericService
{
	private BaseStorage< Edecl_Messages > _edeclMessages;
	private BaseStorage< Edecl_Msg_Doc > _edeclMsgDocs; 
	private BaseStorage< Edecl_Notuniq_Msg_Doc > _edeclNotUniqMsgDoc;
	private BaseStorage< Edecl_Result > _edeclResults;
	private BaseStorage< Edecl_Reqdoc_Info > _edeclReqDocInfo;
	private BaseStorage< MessageLineage > _messageLineages;
	
	public EnvelopeService( )
	{
		_edeclMessages = new BaseStorage< Edecl_Messages >( Edecl_Messages.class );
		_edeclMsgDocs = new BaseStorage< Edecl_Msg_Doc >( Edecl_Msg_Doc.class );
		_edeclNotUniqMsgDoc = new BaseStorage< Edecl_Notuniq_Msg_Doc >( Edecl_Notuniq_Msg_Doc.class );
		_edeclResults = new BaseStorage< Edecl_Result >( Edecl_Result.class );
		_edeclReqDocInfo = new BaseStorage< Edecl_Reqdoc_Info >( Edecl_Reqdoc_Info.class );
		_messageLineages = new BaseStorage< MessageLineage >( MessageLineage.class );
	}
	
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclMessages.setJpaTemplate( jpaTemplate );
		_edeclMsgDocs.setJpaTemplate( jpaTemplate );
		_edeclNotUniqMsgDoc.setJpaTemplate( jpaTemplate );
		_edeclResults.setJpaTemplate( jpaTemplate );
		_edeclReqDocInfo.setJpaTemplate( jpaTemplate );
		_messageLineages.setJpaTemplate( jpaTemplate );
	}
	
	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _edeclMessages.getJpaTemplate( );
	}
	
	public void merge( Edecl_Msg_Doc doc ) 
		throws DatabaseException
	{
		_edeclMsgDocs.mergeAndFlush( doc );
	}
	
	public void merge( Edecl_Messages dbMsg ) 
		throws DatabaseException
	{
		_edeclMessages.mergeAndFlush( dbMsg );
	}
	
	public void merge( Edecl_Reqdoc_Info reqDocInfo ) 
		throws DatabaseException
	{
		_edeclReqDocInfo.mergeAndFlush( reqDocInfo );
	}

	public void persist( Edecl_Messages dbMsg ) 
		throws DatabaseException
	{
		_edeclMessages.persistAndFlush( dbMsg );
	}
	
	public void persist( Edecl_Msg_Doc document ) 
		throws DatabaseException
	{
		_edeclMsgDocs.persistAndFlush( document );
	}
	
	public void persist( Edecl_Result edeclResult ) 
		throws DatabaseException
	{
		_edeclResults.persistAndFlush( edeclResult );
	}
	
	public void persist( Edecl_Notuniq_Msg_Doc notUniqDocument ) 
		throws DatabaseException
	{
		_edeclNotUniqMsgDoc.persistAndFlush( notUniqDocument );
	}
	
	public void persist( Edecl_Reqdoc_Info rdocInfo )
		throws DatabaseException
	{
		_edeclReqDocInfo.persistAndFlush( rdocInfo );
	}
	
	public void persist( MessageLineage ml ) 
		throws DatabaseException
	{
		_messageLineages.persistAndFlush( ml );
	}
	
	public boolean envelopeExists( String envelopeId )
		throws DatabaseException
	{
		return ( null != _edeclMessages.get( envelopeId ) );		
	}
	
	public boolean documentExists( String documentId )
		throws DatabaseException
	{
		return ( null != _edeclMsgDocs.get( documentId ) );
	}
	
	public void updateDocuments( String query, HashMap< String, Object > args ) 
		throws DatabaseException
	{
		_edeclMsgDocs.update( query, args );
	}
	
	public Integer updateDocumentsWithCount( String query, Map< String, Object > args )
		throws DatabaseException
	{
		return _edeclMsgDocs.updateWithCount( query, args );
	}
	
	public Edecl_Messages getEnvelope( String envelopeId )
		throws DatabaseException
	{
		return _edeclMessages.get( envelopeId );
	}
	
	public Edecl_Msg_Doc getDocument( String documentId )
		throws DatabaseException
	{
		return _edeclMsgDocs.get( documentId );
	}
		
	public List< Edecl_Msg_Doc > getContainerDocuments( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select d from Edecl_Msg_Doc d " );
		q.append( "where d.refMainDoc = :refMainDoc " );
		
		HashMap< String, Object > args = new HashMap< String, Object >( );
		args.put( "refMainDoc", documentId );
		
		return _edeclMsgDocs.select( q.toString( ), args );		
	}
	
	public String getDocumentIdByProcessIdForCMN00307( String processId )
		throws DatabaseException
	{
		StringBuilder request = new StringBuilder( );
		
		request.append( "select message from Edecl_Messages message " );
		request.append( "where message.processId = :processId " );
			request.append( " and ( message.messageType = 'CMN.11033' " );
				request.append( " or message.messageType = 'CMN.11042' " );
				request.append( " or message.messageType = 'MSG.11023' ) " );
			request.append( " and not ( message.receiveDate is null ) " );
			request.append( " and exists ( " );
				request.append( " select resMessage from Edecl_Messages resMessage " );
				request.append( "where ( resMessage.messageType = 'CMN.00004' " );
						request.append( " or resMessage.messageType = 'ADM.00006' ) " );
					request.append( " and ( resMessage.initialEnvelopeId = message.envelopeId " );
						request.append( " or resMessage.incomeEnvelopeId = message.envelopeId ) ) " );
				request.append( "order by message.receiveDate desc " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "processId", processId );
		
		List< Edecl_Messages > msgs = _edeclMessages.select( request.toString( ), arguments );
		
		if ( null == msgs || 0 == msgs.size( ) )
			return null;
		
		return msgs.get( 0 ).getDocumentId( );
	}	
	
	public String getGlobalDocumentId( String refDocumentId ) 
		throws DatabaseException
	{
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			return UUIDGen.getUUID( ).toString( );
		else
		{
			Edecl_Msg_Doc doc = getJpaTemplate( ).find( Edecl_Msg_Doc.class, refDocumentId );
			return ( null != doc ) ? doc.getAjdGlobalDocId( ) : null;
		}
	}
	

	public Edecl_Messages getEnvelope( String processId, String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.processId = :processId " );
			q.append( " and msg.documentId = :documentId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public Edecl_Messages getEnvelope_RefDocumentId( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.documentId = :documentId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}

	public List< Edecl_Messages > getEnvelopes_RefDocumentId( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.documentId = :documentId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Edecl_Messages >( );
		
		return res;
	}

	public Edecl_Messages getEnvelope( String envelopeId, String processId, String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.envelopeId = :envelopeId " );
			q.append( " and msg.processId = :processId " );
			q.append( " and msg.documentId = :documentId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		args.put( "processId", processId );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public Edecl_Messages getEnvelope_InitialEnvelopeID_RefDocumentID( String envelopeId, String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.envelopeId = :envelopeId " );
			q.append( " and msg.documentId = :documentId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public List< Edecl_Result > getResultDocumentInformation( String processId, String envelopeId )
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select res from Edecl_Messages mes, Edecl_Result res " );
		bld.append( "where mes.envelopeId = res.envelopeId " );
			bld.append( " and mes.envelopeId = :envelopeId " );
			bld.append( "and mes.processId = :processId" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "processId", processId );
		arguments.put( "envelopeId", envelopeId );
		
		return _edeclResults.select( bld.toString( ), arguments );
	}
	
	public Edecl_Result getResultInfoByDocument( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ri from Edecl_Result ri " );
		q.append( "where ri.documentId = :documentId " );
		q.append( "order by ri.id desc " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< Edecl_Result > res = _edeclResults.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public String getIncomeEnvelopeIdByInitialEnvelopeId( String initialEnvelopeId )
		throws DatabaseException
	{
		Edecl_Messages msg = getIncomeEnvelopeByInitialEnvelopeId( initialEnvelopeId );
		if ( null == msg )
			return null;
		
		return msg.getIncomeEnvelopeId( );
	}
	
	public Edecl_Messages getIncomeEnvelopeByInitialEnvelopeId( String initialEnvelopeId )
		throws DatabaseException
	{
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
			return null;

		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select em from Edecl_Messages em " );
		bld.append( "where em.envelopeId = :envelopeId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "envelopeId", initialEnvelopeId );
		
		List< Edecl_Messages > msgs = _edeclMessages.select( bld.toString( ), arguments );
		if ( msgs.size( ) == 0 ) 
			return null;
		
		return msgs.get( 0 );
	}

	public Edecl_Reqdoc_Info getReqDocInfo( String requestPositionId, String initialEnvelopeId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select rdoc from Edecl_Reqdoc_Info rdoc " );
		q.append( "where rdoc.positionId = :requestPositionId " );
			q.append( " and rdoc.envelopeId = :initialEnvelopeId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "requestPositionId", requestPositionId );
		args.put( "initialEnvelopeId", initialEnvelopeId );
		
		List< Edecl_Reqdoc_Info > rdocs = _edeclReqDocInfo.select( q.toString( ), args );
		if ( null == rdocs || 0 == rdocs.size( ) )
			return null;
		
		return rdocs.get( 0 );
	}
	
	public Edecl_Messages getEnvelopeByDocumentId( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where  msg.documentId = :documentId" );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< Edecl_Messages > res = _edeclMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public List< Edecl_Messages > getEnvelopesByProcessId( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		return _edeclMessages.select( q.toString( ), args );
	}

	public CursoredStream getEnvelopesForRzdReport( String participantId, Calendar from, Calendar to, Set< String > messageTypes )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.participantId = :participantId " );
			q.append( "and msg.preparationDatetime >= :from " );
			q.append( "and msg.preparationDatetime <= :to " );
			q.append( "and msg.messageType in :msgTypes " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "participantId", participantId );
		args.put( "from", from );
		args.put( "to", to );
		args.put( "msgTypes", messageTypes );
		
		return _edeclMessages.selectCursor( q.toString( ), args	);
	}

	public List< Edecl_Messages > getForwardedMessages( String incomeEnvId, String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select msg from Edecl_Messages msg " );
		q.append( "where msg.processId = :processId " );
			q.append( " and msg.incomeEnvelopeId = :incomeEnvId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "incomeEnvId", incomeEnvId );
		
		List< Edecl_Messages > msgs = _edeclMessages.select( q.toString( ), args );
		if ( null == msgs )
			return new ArrayList< Edecl_Messages >( );
			
		return msgs;
	}
	
	public List< Edecl_Messages > findByInitialOrIncomeEnvelopes( List< Edecl_Messages > envelopes )
		throws DatabaseException
	{
		List< Edecl_Messages > res = new ArrayList< Edecl_Messages >( );
		Set< String > ids = new HashSet< String >( );
		
		for ( Edecl_Messages env : envelopes )
		{
			ids.add( env.getEnvelopeId( ) );
		}
		
		for ( Edecl_Messages env : envelopes )
		{
			String initialId = env.getInitialEnvelopeId( );
			if ( ! ids.contains( initialId ) )
			{			
				Edecl_Messages e = _edeclMessages.get( initialId );
				if ( null != e )
				{
					res.add( e );
					ids.add( initialId );
				}
			}
			
			String incomeId = env.getIncomeEnvelopeId( );
			if ( ! ids.contains( incomeId ) )
			{
				Edecl_Messages e = _edeclMessages.get( incomeId );
				if ( null != e )
				{
					res.add( e );
					ids.add( incomeId );
				}
			}
		}
		
		return res;
	}	
	
	public Edecl_Reqdoc_Info getReqDocInfo( String envelopeId, String documentId, String positionId )
		throws DatabaseException
	{
		Edecl_Reqdoc_Info_Ids id = new Edecl_Reqdoc_Info_Ids( );
		id.setEnvelopeId( envelopeId );
		id.setPositionId( positionId );
		id.setReqDocId( documentId );
		
		return _edeclReqDocInfo.get( id );
	}
	
	public List< Edecl_Msg_Doc > selectDocuments( String query, Map< String, Object > args )
		throws DatabaseException
	{
		return _edeclMsgDocs.select( query, args );
	}
	
	public MessageLineage getLineage( String envelopeId ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ml from MessageLineage ml " );
		q.append( "where ml.envelopeId = :envelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		List< MessageLineage > res = _messageLineages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
}
