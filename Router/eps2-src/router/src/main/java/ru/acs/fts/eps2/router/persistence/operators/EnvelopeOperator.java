package ru.acs.fts.eps2.router.persistence.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Notuniq_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.persistence.mappers.BodyToDbMapper;
import ru.acs.fts.eps2.router.persistence.mappers.EnvelopeToDbMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultType;

public class EnvelopeOperator extends BaseOperator
{
	private static final Logger log = LoggerFactory.getLogger( EnvelopeOperator.class );
	
	private EnvelopeService _envelopeService;
	private ErrListService _errListService;	
	private Marshaller _envelopeMarshaller;
	
	// @formatter:off
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { _envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return _envelopeService; }
	
	@Required
	public void setErrListService( ErrListService errListService ) { _errListService = errListService; }
	public ErrListService getErrListService( ) { return _errListService; }
	
	@Required
	public void setEnvelopeMarshaller( Marshaller envelopeMarshaller ) { _envelopeMarshaller = envelopeMarshaller; }
	public Marshaller getEnvelopeMarshaller( ) { return _envelopeMarshaller; }
	// @formatter:on
	
	public void persistEnvelope( EDEnvelope envelope )
		throws DatabaseException
	{
		log.debug( String.format( "Сохраняем конверт %s в базу данных", envelope.getEnvelopeID( ) ) );
				
		Edecl_Messages test = _envelopeService.getEnvelope( envelope.getEnvelopeID( ) );
		
		if ( envelope.getSaveDocument( ) )
			persistBody( envelope );
		
		Edecl_Messages dbMsg = EnvelopeToDbMapper.mapEnvelope( envelope );
		if ( null == test )
			_envelopeService.persist( dbMsg );
		else
			_envelopeService.merge( dbMsg );
		
		checkAndPersistResultType( envelope );
		persistLineage( envelope );
		
		log.debug( String.format( "Закончили сохранять конверт %s в базу данных", envelope.getEnvelopeID( ) ) );
	}
	
	public void persistBody( EDEnvelope env )  // NO_UCD (use private)
		throws DatabaseException
	{
		EDDocument doc = env.getDocument( );
		
		if ( doc.isContainer( ) )
			persistContainer( doc );
		else
		{
			persistDocument( doc );
			
			if ( doc.getContainerDocuments( ).size( ) > 0 )
			{
				for ( String cDocId : doc.getContainerDocuments( ).keySet( ) )
				{
					EDDocument cdoc = doc.getDocumentInContainer( cDocId );
					persistSubDocument( doc, cdoc );
				}
			}
		}
		
		log.debug( String.format( "Закончили сохранять тело конверта %s в базу данных", doc.getDocumentID( ) ) );		
	}
	
	public Edecl_Messages getIncomeEnvelope( EDEnvelope env )
		throws DatabaseException
	{
		return _envelopeService.getIncomeEnvelopeByInitialEnvelopeId( env.getInitialEnvelopeID( ) );
	}
	
	public Edecl_Messages getIncomeEnvelope( Edecl_Messages msg )
		throws DatabaseException
	{
		return _envelopeService.getIncomeEnvelopeByInitialEnvelopeId( msg.getInitialEnvelopeId( ) );
	}
	
	private void persistResult( ResultType object, String initialEnvelopeId )
		throws DatabaseException
	{
		String refDocID = object.getRefDocumentID( );
		if ( refDocID == null )
			refDocID = "";
		
		for ( ResponseType response : object.getResponseList( ) )
		{
			String refDocumentId = response.getRefDocumentID( );
			if ( ! StringUtil.isNullOrEmpty( refDocumentId ) )
				refDocID = refDocumentId;
			
			if ( ! _envelopeService.envelopeExists( initialEnvelopeId ) ||
				 ! _envelopeService.documentExists( refDocID ) )
			{
				log.info( String.format(
					"Внимание! Внимание! Не сохранили EDECL_RESULT_INFO ввиду того, что" +
					"документ %s или конверт %s на который он ссылается не существует в БД",
					refDocID, initialEnvelopeId
				) );
				continue;
			}
			
			Edecl_Result result = new Edecl_Result( );
			result.setDocumentId( refDocID );
			result.setEnvelopeId( initialEnvelopeId );			
			result.setResultCode( response.getResultInformationList( ).get( 0 ).getResultCode( ) );
			
			_envelopeService.persist( result );
		}
	}
	
	private void checkAndPersistResultType( EDEnvelope envelope )
		throws DatabaseException
	{
		if ( envelope.getOrigin( ) == EnvelopeOrigins.GENERATED )
		{
			String initialEnvelopeId = envelope.getInitialEnvelopeID( );
			
			if ( envelope.getDocument( ).isDocumentOfClass( ResultType.class ) )
			{
				try
				{
					ResultType rt = envelope.getDocument( ).getDocumentAsClass( ResultType.class );				
					persistResult( rt, initialEnvelopeId );
				}
				catch ( Exception exc )
				{
					throw new DatabaseException( "Not able to cast to ResultType", exc );
				}
			}
		}				
	}

	private void persistLineage( EDEnvelope envelope )
		throws DatabaseException
	{
		try
		{
			MessageLineage ml = new MessageLineage( );
			ml.setEnvelopeId( envelope.getEnvelopeID( ) );
			ml.setLineageId( envelope.getLineageId( ) );
			_envelopeService.persist( ml );
		}
		catch ( Exception exc )
		{
			/**
			 * Если уже есть такая связка - ну и ладно
			 */
		}
	}

	private void persistDocument( EDDocument doc )
		throws DatabaseException
	{
		switch ( doc.getSaveType( ) )
		{
			case INSERT:
					insertDocument( doc );
				break;
				
			case UPDATE:
				updateDocument( doc );
				break;
				
			case UPSERT:
				upsertDocument( doc );
				break;
				
			default:
			{
				String errorMsg = String.format(
					"На сохранение в БД передан одиночный документ с указанием неподдерживаемого" +
					" способа помещения изменений в БД = %s",
					doc.getSaveType( ).toString( )
				);
				
				log.error( errorMsg );
				throw new DatabaseException( errorMsg );
			}
		}
		
		doc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
	}
	
	private void upsertDocument( EDDocument doc ) 
		throws DatabaseException
	{
		String documentId = doc.getDocumentID( );
		
		Edecl_Msg_Doc dbdoc = _envelopeService.getDocument( documentId );
		if ( null == dbdoc )
			insertDocument( doc );
		else
			updateDocument( doc );
	}
	
	private void persistSubDocument( EDDocument doc, EDDocument subDoc )
		throws DatabaseException 
	{
		subDoc.setUniqueness( doc.getUniqueness( ) );
		subDoc.setSaveType( doc.getSaveType( ) );
		subDoc.setRefMainDoc( doc.getDocumentID( ) );
		
		persistDocument( subDoc );
	}	

	private void persistContainer( EDDocument cnt )
		throws DatabaseException
	{
		switch ( cnt.getSaveType( ) )
		{
			case INSERT:
				insertContainer( cnt );
				break;
					
			case UPDATE:
				updateContainer( cnt );
				break;
					
			case INSERT_WITH_UPDATE_OLD:
				insertWithUpdateContainer( cnt );
				break;
					
			default:
			{
				String errorMsg = String.format(
					"На сохранение в БД передан документ-контейнер с указанием неподдерживаемого" +
					" способа помещения изменений в БД = %s",
					cnt.getSaveType( ).toString( )
				);
				
				log.error( errorMsg );
				throw new DatabaseException( errorMsg );
			}
		}
		
		cnt.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		for ( String cDocId : cnt.getContainerDocuments( ).keySet( ) )
		{
			EDDocument cntDoc = cnt.getDocumentInContainer( cDocId );
			cntDoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}
	}
	
	private void insertContainer( EDDocument cnt ) 
		throws DatabaseException
	{
		insertDocument( cnt );
			
		for ( String cDocId : cnt.getContainerDocuments( ).keySet( ) )
		{
			EDDocument cntDoc = cnt.getDocumentInContainer( cDocId );
			cntDoc.setRefMainDoc( cnt.getDocumentID( ) );

			insertDocument( cntDoc );
		}
	}
	
	private void insertDocument( EDDocument doc ) 
		throws DatabaseException
	{
		switch ( doc.getUniqueness( ) )
		{
			case UNIQ:
				insertSingleUniqDocument( doc );
				break;
					
			case PRESENCE_DEPENDED:
				if ( _envelopeService.documentExists( doc.getDocumentID( ) ) )
					insertSingleNotUniqDocument( doc );
				else
					insertSingleUniqDocument( doc );
				break;
					
			case NOT_UNIQ:
				insertSingleNotUniqDocument( doc );
				break;
					
			default:
			{
				String errorMsg = String.format(
					"На сохранение в БД передан документ с указанием неподдерживаемого " +
					"способа идентификации уникальности документа = %s",
					doc.getUniqueness( ).toString( )
				);
					
				log.error( errorMsg );
				throw new DatabaseException( errorMsg );
			}
		}
	}
	
	private void insertSingleUniqDocument( EDDocument doc ) 
		throws DatabaseException
	{
		Edecl_Msg_Doc uniqDocument = BodyToDbMapper.mapUniqDocument( doc );	
		_envelopeService.persist( uniqDocument );
	}
	
	private void insertSingleNotUniqDocument( EDDocument doc ) 
		throws DatabaseException
	{
		Edecl_Notuniq_Msg_Doc notUniqDocument = BodyToDbMapper.mapNotUniqDocument( doc );
		_envelopeService.persist( notUniqDocument );
	}
		
	private void updateContainer( EDDocument doc ) 
		throws DatabaseException
	{
		globalDocumentIdNotNullCheck( doc );
			
		// Обновляем документы:
		updateDocument( doc );
		
		for ( String cDocId : doc.getContainerDocuments( ).keySet( ) )
		{
			EDDocument cDoc = doc.getDocumentInContainer( cDocId );
			
			updateDocument( cDoc );
		}
	}
	
	private void globalDocumentIdNotNullCheck( EDDocument cnt ) 
		throws DatabaseException
	{
		String globalDocumentId = _envelopeService.getGlobalDocumentId( cnt.getRefDocumentID( ) );
		
		if ( globalDocumentId == null )
		{
			String errorMsg = String.format(
				"Не удалось получить глобальный Id для документа-контейнера с id = %s",
				cnt.getDocumentID( )
			);
			
			log.error( errorMsg );
			throw new DatabaseException( errorMsg );
		}
		
		for ( String cDocId : cnt.getContainerDocuments( ).keySet( ) )
		{
			EDDocument cDoc = cnt.getDocumentInContainer( cDocId );
			
			String refDocumentId = cDoc.getRefDocumentID( );
			globalDocumentId = _envelopeService.getGlobalDocumentId( refDocumentId );
			
			if ( globalDocumentId == null )
			{
				String errorMsg = String.format(
					"Не удалось получить глобальный Id для документа-контейнера с id = %s",
					cnt.getDocumentID( )
				);
				
				log.error( errorMsg );
				throw new DatabaseException( errorMsg );
			}
		}
	}
	
	private void updateDocument( EDDocument doc ) 
		throws DatabaseException
	{
		String currentState = doc.getCurrentState( );
		String oldState = doc.getOldState( ); 
	
		if ( ! StringUtil.isNullOrEmpty( currentState ) &&
			 ! StringUtil.isNullOrEmpty( oldState ) &&
			 ! currentState.equals( oldState ) )
		{
			Map< String, Object > requestParameters = new HashMap< String, Object >( );
			requestParameters.put( "documentId", doc.getDocumentID( ) );
			requestParameters.put( "state", currentState );
				
			Integer rowModified = _envelopeService.updateDocumentsWithCount(
				"update Edecl_Msg_Doc doc " +
					"set doc.state = :state " +
					"where doc.documentID = :documentId",
				requestParameters 
			);
				
			if ( rowModified != 1 )
			{
				String errorMsg = String.format(
					"Ошибка обновления статуса прикладного документа. " +
					"Необходимое число записей не обновлено. Число измененных строк = %d",
					rowModified
				);
				
				log.error( errorMsg );
				throw new DatabaseException( errorMsg );
			}
				
			if ( currentState.equalsIgnoreCase( DocumentStates.CURRENT ) && 
				 oldState.equalsIgnoreCase( DocumentStates.WAITABLE ) )
			{
				// Принят контейнер, необходимо установить статус всех входящих
				// в контейнер документов на "удаленный"
				if ( doc.isContainer( ) )
				{
					deleteContainer( doc );
				}
				
				setStateAndModificationId( doc );
			}
		}
	}
	
	private void deleteContainer( EDDocument doc ) 
		throws DatabaseException
	{
		HashMap< String, Object > requestParameters = new HashMap< String, Object >( );
		requestParameters.put( "documentId", doc.getRefDocumentID( ) );
		requestParameters.put( "state", DocumentStates.DELETED );
			
		_envelopeService.updateDocuments( 
			"update Edecl_Msg_Doc doc " +
				"set doc.state = :state "+
				"where doc.refMainDoc=:documentId",
			requestParameters 
		);
	}
	
	private void setStateAndModificationId( EDDocument doc ) 
		throws DatabaseException
	{
		/**
		 *  Обновляем статус документов на которые пришли изменяющие документы.
		 *  У вновь добавляемых в первоначальный набор документов не заполнен
		 *  идентификатор RefDocumentID
		 */
		String refDocumentId = doc.getRefDocumentID( );
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			return;
	
		Map< String, Object > requestParameters = new HashMap< String, Object >( );
		requestParameters.put( "documentId", refDocumentId );
		requestParameters.put( "state", DocumentStates.CHANGED );
		requestParameters.put( "modId", doc.getDocumentID( ) );
		
		Integer rowModified = _envelopeService.updateDocumentsWithCount(
			"update Edecl_Msg_Doc doc " +
				"set doc.state = :state, " + 
					"doc.modificationId = :modId " +
				"where doc.documentID=:documentId",
			requestParameters 
		);
		
		if ( rowModified != 1 )
		{
			String errorMsg = String.format(
				"Ошибка обновления статуса прикладного документа. " +
				"Необходимое число записей не обновлено. Число измененных строк = %s",
				rowModified
			);
			
			log.error( errorMsg );
			throw new DatabaseException( errorMsg );
		}
	}
	
	private void insertWithUpdateContainer( EDDocument cnt ) 
		throws DatabaseException
	{
		globalDocumentIdNotNullCheck( cnt );
			
		// Помещаем документ в БД:
		insertContainer( cnt );
			
		// Обновляем контейнер, на который ссылается входящий контейнер:
		deleteContainer( cnt );
			
		// Обновляем статус документов, на которые пришли изменяющие документы:
		setStateAndModificationId( cnt );
		
		for ( String cDocId : cnt.getContainerDocuments( ).keySet( ) )
		{
			EDDocument cDoc = cnt.getDocumentInContainer( cDocId );			
			setStateAndModificationId( cDoc );
		}	
	}
	
	public List< Edecl_Msg_Doc > getProcessDocuments_Msg11026( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Edecl_Msg_Doc d " );
		q.append( "where d.documentID in ( " );
				q.append( " select msg.documentId from Edecl_Messages msg where msg.processId = :processId " );
			q.append( " ) and ( "	);
				q.append( " ( d.documentModeId = :containerDocModeId and d.state = :stateCurrent ) " );
					q.append( " or d.documentModeId = :cmn11001DocModeId " );
			q.append( " ) " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "containerDocModeId", DocumentModeIDs.ED_CONTAINER );
		args.put( "cmn11001DocModeId", DocumentModeIDs.NOTIF_GTD_REGISTRATION );
		args.put( "stateCurrent", DocumentStates.CURRENT );
		
		List< Edecl_Msg_Doc > res = _envelopeService.selectDocuments( q.toString( ), args ); 
		if ( null == res )
			return new ArrayList< Edecl_Msg_Doc >( );
			
		return res;
	}

	public Edecl_Msg_Doc getProcessDocuments_Msg11058( String processId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Edecl_Msg_Doc d " );
		q.append( "where d.documentID in ( " );
				q.append( " select msg.documentId from Edecl_Messages msg where msg.processId = :processId " );
			q.append( " ) and ( " );
				q.append( " d.documentModeId = :msg11058DocModeId " );
			q.append( " ) " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		args.put( "msg11058DocModeId", DocumentModeIDs.NOTIF_MEASURES );
		
		List< Edecl_Msg_Doc > res = _envelopeService.selectDocuments( q.toString( ), args );
		if ( null == res )
			return null;
		
		for ( Edecl_Msg_Doc dbdoc : res )
		{
			Edecl_Messages msg = _envelopeService.getEnvelopeByDocumentId( dbdoc.getDocumentID( ) );
			if ( msg.getMessageType( ).equals( MessageType.MSG_11058 ) )
				return dbdoc;
		}
			
		return null;		
	}
	
}
