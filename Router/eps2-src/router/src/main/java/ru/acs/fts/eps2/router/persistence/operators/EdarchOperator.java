package ru.acs.fts.eps2.router.persistence.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_WithContent;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.model.services.G44Service;
import ru.acs.fts.eps2.model.services.ead.ArchiveStageStatuses;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.CollectionHelper;
import ru.acs.fts.eps2.utils.StringUtil;

public class EdarchOperator extends BaseOperator
{
	private static final Logger log = LoggerFactory.getLogger( EdarchOperator.class );
	
	private static final String FORWARD_DIRECTION = "forward";
	private static final String BACKWARD_DIRECTION = "backward";
	
	private EdarchService _edarchService;	
	private G44Service _g44Service;	
	private Marshaller _marshaller;
	
	// @formatter:off
	@Required
	public void setEdarchService( EdarchService service ) { _edarchService = service; }
	public EdarchService getEdarchService( ) { return _edarchService; }
	
	@Required
	public void setG44Service( G44Service service ) { _g44Service = service; }
	public G44Service getG44Service( ) { return _g44Service; }
	
	@Required
	public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	// @formatter:on
	
	public Edarch_Archive_Docs createDocument( String customsCode, LocalDate endDate ) 
		throws DatabaseException
	{
		Edarch_Archive_Docs doc = new Edarch_Archive_Docs( );
		doc.setArdocIdinternal( generateArchDocId( customsCode ) );
		fillArdocStageStatus( doc, endDate );
		
		return doc;
	}
	
	public Edarch_Archive createArchive( String declId, String archiveName, String customsCode )
	{
		Edarch_Archive archive = new Edarch_Archive( );
		archive.setCreateDate( new Date( ) );
		archive.setDecl( declId );
		archive.setArchName( archiveName );
		archive.setStageStatus( ArchiveStageStatuses.ARCH_STATUS_NEW );
		archive.setIdInternal( generateArchInternalId( customsCode ) );
		
		return archive;
	}
	
	public Edarch_Archive createAndPersistArchive( String declId, String name, String customsCode ) 
		throws DatabaseException
	{
		Edarch_Archive archive = createArchive( declId, name, customsCode );
		_edarchService.persist( archive );
		
		return archive;
	}
	
	public void fillDsData( Edarch_Archive_Docs doc, byte[ ] data )
		throws DatabaseException
	{
		if ( null == doc )
			return ;
		
		Edarch_Archive_Docs_WithContent contentDoc = _edarchService.getDocumentWithContent( 
			doc.getArdocArchIdinternal( ), 
			doc.getArdocIdinternal( ) 
		);
		
		if ( null == contentDoc )
			return ;

		contentDoc.setArdocDsDate( data );
		_edarchService.persist( contentDoc );
	}
	
	public void fillDsData( Edarch_Archive_Docs doc, Object any )
		throws BaseProcessingException, DatabaseException
	{
		if ( null == any )
			return ;
			
		fillDsData( doc, marshall( any, _marshaller, null ) );
	}
	
	public void fillDsData( Edarch_Archive_Docs doc, XStringMarshallableClass xstr )
		throws DatabaseException
	{
		if ( null != xstr )
			fillDsData( doc, xstr.getByteArray( ) );
	}
	
	public void fillDataFromAny( Edarch_Archive_Docs doc, Object any ) 
		throws DatabaseException, BaseProcessingException
	{
		if ( null == any )
			return ;
		
		fillDsData( doc, marshall( any, _marshaller, null ) );
		
		EDDocument tmp = new EDDocument( any );
		
		doc.setArdocDocType( tmp.getDocumentModeID( ) );
		doc.setArdocDocumentid( tmp.getDocumentID( ) );
	}
	
	public boolean isDocCodeCorrespondsDocModeId( String docCode, String docModeId ) 
		throws DatabaseException
	{
		return null != _g44Service.getG44Relation( docCode, docModeId );
	}
			
	public Edarch_Archive_Docs_WithContent getDocumentWithContent( Edarch_Archive_Docs archDoc ) 
		throws DatabaseException
	{
		return _edarchService.getDocumentWithContent( 
			archDoc.getArdocArchIdinternal( ), 
			archDoc.getArdocIdinternal( ) 
		);
	}
	
	public List< Edarch_Archive_Docs > getDocumentHistory( Edarch_Archive_Docs lastDoc, String direction )
		throws ResultTypeException, DatabaseException
	{
		List< Edarch_Archive_Docs > docs = new ArrayList< Edarch_Archive_Docs >( );
		if ( null == lastDoc )
		{
			ErrorHelper.throwException( 
				"Некорректный формат сообщения. Отсутствует архивный идентификатор документа / документ", 
				"<unknown>", ResultCodes._10_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		while ( null != lastDoc )
		{
			if ( docs.contains( lastDoc ) )
			{
				log.error( "Ошибка при выборке документа с id = {}", lastDoc.getArdocIdinternal( ) );
				log.error( Arrays.toString( docs.toArray( ) ) );
				break;
			}
			docs.add( lastDoc );
			
			String documentId = "";
			if ( FORWARD_DIRECTION.equalsIgnoreCase( direction ) )
				documentId = lastDoc.getArdocRefNextDocumentid( );
			else if ( BACKWARD_DIRECTION.equalsIgnoreCase( direction ) )
				documentId = lastDoc.getArdocRefdocumentid( );
			
			List< Edarch_Archive_Docs > historyDocs = 
				_edarchService.getDocumentsByDocumentId( documentId );
			
			if ( CollectionHelper.isNullOrEmpty( historyDocs ) )
				break;
			lastDoc = CollectionHelper.getFirst( historyDocs );
		}
		
		return docs;
	}
	
	public List< Edarch_Archive_Docs > getDocumentForwardHistory( Edarch_Archive_Docs lastDoc )  // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		return getDocumentHistory( lastDoc, FORWARD_DIRECTION );
	}
	
	public List< Edarch_Archive_Docs > getDocumentBackwardHistory( Edarch_Archive_Docs lastDoc )  // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		return getDocumentHistory( lastDoc, BACKWARD_DIRECTION );
	}
	
	@Deprecated
	public List< Edarch_Archive_Docs > getDocumentAllHistory( String archId, String archDocId )  // NO_UCD (deprecated added)
		throws ResultTypeException, DatabaseException
	{
		Edarch_Archive_Docs lastDoc = _edarchService.getDocument( archId, archDocId );
		
		return getDocumentAllHistory( lastDoc );
	}
	
	public List< Edarch_Archive_Docs > getDocumentAllHistory( Edarch_Archive_Docs lastDoc )  // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		List< Edarch_Archive_Docs > backwardHistoryDocs = 
			CollectionHelper.getReversed( getDocumentBackwardHistory( lastDoc ) );
		List< Edarch_Archive_Docs > forwardHistoryDocs = 
			getDocumentForwardHistory( lastDoc );
		
		if ( CollectionHelper.isNullOrEmpty( backwardHistoryDocs ) )
			return new ArrayList< Edarch_Archive_Docs >( );
			
		CollectionHelper.removeLast( backwardHistoryDocs );
		backwardHistoryDocs.addAll( forwardHistoryDocs );
		
		return backwardHistoryDocs;
	}
	
	public Edarch_Archive_Docs getActualDocumentByPrevious( Edarch_Archive_Docs oldDoc, Map< String, Object > args ) 
		throws ResultTypeException, DatabaseException
	{
		if ( null == oldDoc || StringUtil.isNullOrEmpty( oldDoc.getArdocRefNextDocumentid( ) ) )
			return oldDoc;
		
		Edarch_Archive_Docs actDoc = oldDoc;
		while ( null != actDoc && ! StringUtil.isNullOrEmpty( actDoc.getArdocRefNextDocumentid( ) ) )
		{
			if ( ArchiveDocumentStatuses.isActive( actDoc.getArdocStageStatus( ) ) )
				args.put( "ACTIVE", Boolean.valueOf( true ) );
			
			String refNextDocumentId = actDoc.getArdocRefNextDocumentid( );
			
			actDoc = _edarchService.getArchDocument( refNextDocumentId, oldDoc.getArdocArchIdinternal( ) );
			if ( null == actDoc )
				actDoc = _edarchService.getArchDocument_ED( refNextDocumentId, oldDoc.getArdocArchIdinternal( ) );
		}

		if ( null != actDoc )
		{
			if ( ArchiveDocumentStatuses.isActive( actDoc.getArdocStageStatus( ) ) )
				args.put( "ACTIVE", Boolean.valueOf( true ) );
		}
		
		return actDoc;
	}

	public Edarch_Archive_Docs getInitDocumentBySuccessor( Edarch_Archive_Docs oldDoc, Map< String, Object > args ) 
		throws ResultTypeException, DatabaseException
	{
		if ( null == oldDoc || StringUtil.isNullOrEmpty( oldDoc.getArdocRefdocumentid( ) ) )
			return oldDoc;
		
		Edarch_Archive_Docs actDoc = oldDoc;
		while ( null != actDoc && ! StringUtil.isNullOrEmpty( actDoc.getArdocRefdocumentid( ) ) )
		{
			if ( ArchiveDocumentStatuses.isActive( actDoc.getArdocStageStatus( ) ) )
				args.put( "ACTIVE", Boolean.valueOf( true ) );
			
			String refDocumentId = actDoc.getArdocRefdocumentid( );
			
			actDoc = _edarchService.getArchDocument( refDocumentId, oldDoc.getArdocArchIdinternal( ) );
			if ( null == actDoc )
				actDoc = _edarchService.getArchDocument_ED( refDocumentId, oldDoc.getArdocArchIdinternal( ) );
		}

		if ( ArchiveDocumentStatuses.isActive( actDoc.getArdocStageStatus( ) ) )
			args.put( "ACTIVE", Boolean.valueOf( true ) );		
		
		return actDoc;
	}
	
	public void recurseRemoveDocument( Edarch_Archive_Docs initialDocument ) 
		throws DatabaseException
	{
		Edarch_Archive_Docs cdoc = initialDocument;
		String archId = initialDocument.getArdocArchIdinternal( );
		
		do
		{
			String refNextDocumentId = cdoc.getArdocRefNextDocumentid( );
			
			_edarchService.remove( cdoc );
			
			cdoc = _edarchService.getArchDocument( refNextDocumentId, archId );
			if ( null == cdoc )
				cdoc = _edarchService.getArchDocument_ED( refNextDocumentId, archId );
			
		} while ( null != cdoc && ! StringUtil.isNullOrEmpty( cdoc.getArdocRefNextDocumentid( ) ) );
	}
	
	public boolean isStageStatusActual( String status )
	{
		return ArchiveDocumentStatuses.isActiveActual( status ) 
				|| ArchiveDocumentStatuses.isNewActual( status );
	}
	
	public void fillArdocStageStatus( Edarch_Archive_Docs doc, LocalDate endDate ) // NO_UCD (use private)
	{
		if ( null != endDate )
			// endDate.add( 11, 24 );
			endDate = endDate.withFieldAdded( DurationFieldType.days( ), 1 );
		
		LocalDate curDate = LocalDate.now( );
		
		if ( null == endDate || curDate.isBefore(  endDate ) )
			doc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_ACTUAL );
		else if ( curDate.isAfter( endDate ) )
			doc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_EXPIRE );
	}
	
	public Edarch_Archive_Docs getInitialDocument( String archDocId, String archDocumentId, Map< String, Object > args ) 
		throws DatabaseException, ResultTypeException
	{
		Edarch_Archive_Docs initDoc = null;
		
		if ( ! StringUtil.isNullOrEmpty( archDocId ) )
		{
			initDoc = _edarchService.getArchDocument( archDocId );
			if ( null != initDoc )
				initDoc = getInitDocumentBySuccessor( initDoc, args );
		}
		
		if ( null == initDoc && ! StringUtil.isNullOrEmpty( archDocumentId ) )
		{
			initDoc = _edarchService.getArchDocument_ED( archDocumentId );
			if ( null != initDoc )
				initDoc = getInitDocumentBySuccessor( initDoc, args );
		}
		
		return initDoc;
	}
	
	public String getArchDeclIdFromArchive( String archId ) 
		throws DatabaseException
	{
		Edarch_Archive archive = _edarchService.getArchive( archId );
		if ( null == archive )
			return null;
		
		return archive.getDecl( );
	}
			
	private String generateArchDocId( String customsCode )
	{
		return String.format( "%s-%s", customsCode, generateRandomNumber( 
				EdarchService.ARCH_ID_LENGTH ) );
	}
	
	public String generateArchInternalId( String customsCode )
	{
		return String.format( "%s-%s", customsCode,
				UUIDGen.getUUID( ).toString( ).replace( "-", "" ) );
	}
	
	public String generateRandomNumber( int charAmount )
	{
		StringBuffer sb = new StringBuffer( "" );
		if ( charAmount > 0 )
		{
			Random r = new Random( );
			for ( int i = 0; i < charAmount; i++ )
			{
				int current = Math.abs( r.nextInt( ) ) % 10;
				if ( i == 0 )
				{
					if ( current != 0 )
						sb.append( current );
					else
						i--;
				}
				else
					sb.append( current );
			}
		}
		return sb.toString( );
	}
	
	public boolean isClosedOrRemoved( Edarch_Archive archive )
	{
		return ArchiveStageStatuses.isClosedOrRemoved( archive.getStageStatus( ) );
	}
}
