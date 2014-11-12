package ru.acs.fts.eps2.router.objects;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.archadddocrequest.ArchAddDocRequestType;
import ru.acs.fts.schemas.album.archdocupdate.ArchDocUpdateType;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;

public class EDDocument extends Document
{	
	private static final Logger log = LoggerFactory.getLogger( EDDocument.class );
	
	private static final String ED_CONTAINER_NAME = "ED_Container";
	
	/**
	 * Тип сохранения документа, управляет тем какая операция над базой данных будет выполнена
	 */
	private DocumentSaveTypes _saveType = DocumentSaveTypes.INSERT;
	
	/**
	 * Признак уникальности документа, определяет таблицу в которую документ будет сохранен
	 */
	private DocumentUniquenesses _uniqueness = DocumentUniquenesses.UNIQ;
	
	/**
	 * Если документ был извлечен из базы данных, то это то состояние которое он имел при извлечении
	 * из базы данных
	 */
	private String _oldState = DocumentStates.NOTSET;
	
	/**
	 * Состояние документа в ходе обработки могло измениться, поэтому это то состояние, которое мы установили 
	 * при обработке
	 */
	private String _currentState = DocumentStates.NOTSET;
	
	
	/**
	 * При сохранении вложенного в контейнер документа это ссылка на документ контейнер.
	 * Важная!
	 */
	private String _refMainDoc = null;
	
	/**
	 * Идентификатор модификации документа. Используется например при замене пакета документов
	 * ( смена CURRENT )
	 */
	private String _modificationId = null;
	
	/**
	 * Идентификатор документа, который прошел транзитом через нас и мы его заменили документов
	 * с другим DocumentID
	 */
	private String _incomeDocumentId = null;
	
	public EDDocument( Object rawDocument ) throws BaseProcessingException, DatabaseException
	{
		super( rawDocument );
	}
	
	// @formatter:off
	public void setSaveType( DocumentSaveTypes saveType ) { _saveType = saveType; }
	public DocumentSaveTypes getSaveType( ) { return _saveType; }
	
	public void setUniqueness( DocumentUniquenesses uniqueness ) { _uniqueness = uniqueness; }
	public DocumentUniquenesses getUniqueness( ) { return _uniqueness; }
	
	public void setOldState( String oldState ) { _oldState = oldState; }
	public String getOldState( ) { return _oldState; }
	
	public void setCurrentState( String currentState ) { _currentState = currentState; }
	public String getCurrentState( ) { return _currentState; }
	
	public void setRefMainDoc( String refMainDoc ) { _refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return _refMainDoc; }
	
	public void setModificationID( String modificationId ) { _modificationId = modificationId; }
	public String getModificationID( ) { return _modificationId; }
	
	public void setIncomeDocumentID( String incomeDocumentId ) { _incomeDocumentId = incomeDocumentId; }
	public String getIncomeDocumentID( ) { return _incomeDocumentId; }
	// @formatter:on

	/**
	 * Общие операции
	 */
	
	public boolean isContainer( )
	{
		Object doc = getNakedDocument( );
		
		if ( ( doc instanceof EDContainerType ) || 
			 ( doc instanceof ArchAddDocRequestType ) || 
			 ( doc instanceof ArchDocUpdateType ) || 
			 ( doc instanceof EPSDocResponseType ) )
		{
			return true;
		}
		else if ( doc instanceof XStringMarshallableClass )
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )doc;
			try
			{
				String dstr = new String( xstr.getByteArray( ), Configurator.WORKING_ENCODING );
				if ( dstr.contains( ED_CONTAINER_NAME ) )
					return true;
			}
			catch ( UnsupportedEncodingException exc )
			{
				log.error( ":'(", exc );
			}
		}
		
		return false;
	}
	
	public EDDocument getDocumentInContainer( String documentId )
	{
		return ( EDDocument )super.getDocumentInContainer( documentId );
	}
	
	public < T > EDDocument getDocumentInContainer( Class< T > cls )
	{
		return ( EDDocument )super.getDocumentInContainer( cls );
	}	

	private void mapProperties( EDDocument from, EDDocument to )
	{
		to.setSaveBody( from.getSaveBody( ) );
		to.setSaveType( from.getSaveType( ) );
		to.setUniqueness( from.getUniqueness( ) );
		to.setOldState( from.getOldState( ) );
		to.setCurrentState( from.getCurrentState( ) );
		to.setRefMainDoc( from.getRefMainDoc( ) );
		to.setModificationID( from.getModificationID( ) );
		to.setIncomeDocumentID( from.getIncomeDocumentID( ) );
	}
	
	@Override
	public Document cloneWithoutSignature( ) 
		throws BaseProcessingException, DatabaseException
	{
		Object doc = getNakedDocument( );
		Object resObj = doc;
		
		EDDocument result = new EDDocument( resObj );
		mapProperties( this, result );
		
		if ( doc instanceof EDContainerType )
		{
			try
			{
				EDContainerType cnt = result.getDocumentAsClass( EDContainerType.class ); 
	
				for ( ContainerDocType cdoc : cnt.getContainerDocList( ) )
				{
					EDDocument tmp = new EDDocument( cdoc.getDocBody( ).getAny( ) );
					String cDocId = tmp.getDocumentID( );
					
					EDDocument edcdoc = result.getDocumentInContainer( cDocId );
					
					cdoc.getDocBody( ).setAny( edcdoc.getNakedDocument( ) );
					edcdoc.doNotUseThis_setRawDocument( cdoc.getDocBody( ).getAny( ) );
					
					EDDocument sedcdoc = getDocumentInContainer( cDocId );
					
					mapProperties( sedcdoc, edcdoc );
				}
			}
			catch ( Exception exc )
			{
				log.info( ":(", exc );
			}
		}
		/*
		else if ( doc instanceof ArchAddDocRequestType )
		{
			ArchAddDocRequestType src = ( ArchAddDocRequestType )doc;
			ArchAddDocRequestType dst = new ArchAddDocRequestType( );
			
			dst.setDocumentModeID( src.getDocumentModeID( ) );
			dst.setDocumentID( src.getDocumentID( ) );
			dst.setRefDocumentID( src.getRefDocumentID( ) );
			
			DocumentBaseType srcDb = src.getDocBaseInfo( );
			DocumentBaseType dstDb = new DocumentBaseType( );
			
			dstDb.setPrDocumentName( srcDb.getPrDocumentName( ) );
			dstDb.setPrDocumentNumber( srcDb.getPrDocumentNumber( ) );
			dstDb.setPrDocumentDate( srcDb.getPrDocumentDate( ) );
			dst.setDocBaseInfo( dstDb );
			
			dst.setArchDeclID( src.getArchDeclID( ) );
			dst.setArchID( src.getArchID( ) );
			dst.setDocumentBeginDate( src.getDocumentBeginDate( ) );
			dst.setDocumentEndDate( src.getDocumentEndDate( ) );
			dst.setDocCode( src.getDocCode( ) );
			
			ArchDocType srcDoc = src.getArchDoc( );
			ArchDocType dstDoc = new ArchDocType( );
			
			EDDocument tmp = new EDDocument( srcDoc.getAny( ) );
			dstDoc.setAny( tmp.getNakedDocument( ) );
			
			dst.setArchDoc( dstDoc );
			
			resObj = dst;
		}
		else if ( doc instanceof ArchDocUpdateType )
		{
			ArchDocUpdateType src = ( ArchDocUpdateType )doc;
			ArchDocUpdateType dst = new ArchDocUpdateType( );

			dst.setDocumentModeID( src.getDocumentModeID( ) );
			dst.setDocumentID( src.getDocumentID( ) );
			dst.setRefDocumentID( src.getRefDocumentID( ) );
			dst.setArchDeclID( src.getArchDeclID( ) );
			dst.setArchID( src.getArchID( ) );
			dst.setArchDocID( src.getArchDocID( ) );
			dst.setArchDocumentID( src.getArchDocumentID( ) );
			dst.setDocumentBeginDate( src.getDocumentBeginDate( ) );
			dst.setDocumentEndDate( src.getDocumentEndDate( ) );
			
			ru.acs.fts.schemas.album.archdocupdate.ArcDocType srcDoc = src.getArchDoc( );
			ru.acs.fts.schemas.album.archdocupdate.ArcDocType dstDoc = new ru.acs.fts.schemas.album.archdocupdate.ArcDocType( );
			
			EDDocument tmp = new EDDocument( srcDoc.getAny( ) );
			dstDoc.setAny( tmp.getNakedDocument( ) );
			
			dst.setArchDoc( dstDoc );
			
			resObj = dst;
		}
		else if ( doc instanceof EPSDocResponseType )
		{
			EPSDocResponseType src = ( EPSDocResponseType )doc;
			EPSDocResponseType dst = new EPSDocResponseType( );
			
			dst.setDocumentModeID( src.getDocumentModeID( ) );
			dst.setDocumentID( src.getDocumentID( ) );
			dst.setRefDocumentID( src.getRefDocumentID( ) );
			
				ArchDocInfoType srcDi = src.getArchDocumentInfo( );
				ArchDocInfoType dstDi = new ArchDocInfoType( );
					dstDi.setArchID( srcDi.getArchID( ) );
					dstDi.setArchDeclID( srcDi.getArchDeclID( ) );
					dstDi.setArchDocID( srcDi.getArchDocID( ) );
					dstDi.setArchDocStatus( srcDi.getArchDocStatus( ) );
				dst.setArchDocumentInfo( dstDi );

				DocResponseType srcDr = src.getDocResponse( );
				DocResponseType dstDr = new DocResponseType( );
					dstDr.setRequestPositionID( srcDr.getRequestPositionID( ) );
				
					DocResponseBodyType srcDrb = srcDr.getDocResponseBody( );
					DocResponseBodyType dstDrb = new DocResponseBodyType( );
					
					EDDocument tmp = new EDDocument( srcDrb.getAny( ) );
					dstDrb.setAny( tmp.getNakedDocument( ) );
				dstDr.setDocResponseBody( dstDrb );
				
				PersonBaseType srcPs = src.getResponcePerson( );
				PersonBaseType dstPs = new PersonBaseType( );
				
					dstPs.setPersonSurname( srcPs.getPersonSurname( ) );
					dstPs.setPersonName( srcPs.getPersonName( ) );
					dstPs.setPersonMiddleName( srcPs.getPersonMiddleName( ) );
					dstPs.setPersonPost( srcPs.getPersonPost( ) );
				dst.setResponcePerson( dstPs );
				
				ArchiveInformationType srcAi = src.getArchiveInformation( );
				ArchiveInformationType dstAi = new ArchiveInformationType( );
				
					dstAi.setArchDocAlbum( srcAi.getArchDocAlbum( ) );
					dstAi.setArchDocDate( srcAi.getArchDocDate( ) );
				dst.setArchiveInformation( dstAi );

			resObj = dst;
		}
		*/
		
		return result;
	}
	
	@Override
	public void setSigned( Object signed ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( null == signed )
			return ;
		
		doNotUseThis_setRawDocument( signed );
		
		if ( signed instanceof EDContainerType )
		{
			EDContainerType cnt = ( EDContainerType )signed;
			
			for ( ContainerDocType ocdoc : cnt.getContainerDocList( ) )
			{
				if ( null == ocdoc.getDocBody( ) || null == ocdoc.getDocBody( ).getAny( ) )
					continue;
				
				EDDocument tmp = new EDDocument( ocdoc.getDocBody( ).getAny( ) );
				String documentId = tmp.getDocumentID( );
				
				if ( getContainerDocuments( ).containsKey( documentId ) )
				{
					EDDocument cdoc = getDocumentInContainer( documentId );
					cdoc.doNotUseThis_setRawDocument( tmp.getRawDocument( ) );
				}
				else
				{
					getContainerDocuments( ).put( documentId, tmp );
				}
			}
		}
		else if ( signed instanceof ArchAddDocRequestType )
		{
			ArchAddDocRequestType cnt = ( ArchAddDocRequestType )signed;
			
			EDDocument tmp = new EDDocument( cnt.getArchDoc( ).getAny( ) );
			String documentId = tmp.getDocumentID( );
			
			if ( getContainerDocuments( ).containsKey( documentId ) )
			{
				EDDocument cdoc = getDocumentInContainer( documentId );
				cdoc.doNotUseThis_setRawDocument( tmp.getRawDocument( ) );
			}
			else
			{
				getContainerDocuments( ).put( documentId, tmp );
			}
		}
		else if ( signed instanceof ArchDocUpdateType )
		{
			ArchDocUpdateType cnt = ( ArchDocUpdateType )signed;
			
			EDDocument tmp = new EDDocument( cnt.getArchDoc( ).getAny( ) );
			String documentId = tmp.getDocumentID( );
			
			if ( getContainerDocuments( ).containsKey( documentId ) )
			{
				EDDocument cdoc = getDocumentInContainer( documentId );
				cdoc.doNotUseThis_setRawDocument( tmp.getRawDocument( ) );
			}
			else
			{
				getContainerDocuments( ).put( documentId, tmp );
			}
		}
		else if ( signed instanceof EPSDocResponseType )
		{
			EPSDocResponseType cnt = ( EPSDocResponseType )signed;
			
			EDDocument tmp = new EDDocument( cnt.getDocResponse( ).getDocResponseBody( ).getAny( ) );
			String documentId = tmp.getDocumentID( );
			
			if ( getContainerDocuments( ).containsKey( documentId ) )
			{
				EDDocument cdoc = getDocumentInContainer( documentId );
				cdoc.doNotUseThis_setRawDocument( tmp.getRawDocument( ) );
			}
			else
			{
				getContainerDocuments( ).put( documentId, tmp );
			}			
		}
	}
	
	@Override
	public List< String > getSubDocumentsXPathes( )
	{
		List< String > res = new ArrayList< String >( );
		
		Object doc = getNakedDocument( );
		
		if ( doc instanceof EDContainerType )
		{
			res.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );
		}
		else if ( doc instanceof ArchAddDocRequestType )
		{
			res.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
		}
		else if ( doc instanceof ArchDocUpdateType )
		{
			res.add( "//*[local-name()='ArchDocUpdate']/*[local-name()='ArchDoc']" );
		}
		else if ( doc instanceof EPSDocResponseType )
		{
			res.add( "//*[local-name()='EPS_DocResponse']/*[local-name()='DocResponse']/*[local-name()='DocResponseBody']" );
		}
		else if ( doc instanceof XStringMarshallableClass )
		{
			/**
			 * Мы точно не знаем что внутри, поэтому безопаснее всего проверять как контейнер
			 * по всем возможным ( известным нам ) xPath'ам
			 */
			res.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );			
			res.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
			res.add( "//*[local-name()='ArchDocUpdate']/*[local-name()='ArchDoc']" );
			res.add( "//*[local-name()='EPS_DocResponse']/*[local-name()='DocResponse']/*[local-name()='DocResponseBody']" );
		}		
		
		return res;
	}
	
	@Override
	// TODO: Сделать чтоб работало для всех документов
	public String getXmlNamespace( ) throws Exception
	{
		Object doc = getNakedDocument( );
		if ( ! ( doc instanceof XStringMarshallableClass ) )
			return null;
		
		XStringMarshallableClass xstr = ( XStringMarshallableClass )doc;
		return xstr.getXmlNamespace( );
	}
	
	public void setNotUniqRecursive( )
	{
		setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		for ( String cDocId : getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}
	}
	
	/**
	 * Закрытые методы
	 * @throws DatabaseException 
	 */
	
	@Override
	protected void extractContainerDocuments( ) 
		throws BaseProcessingException, DatabaseException
	{
		Map< String, Document > cntdocs = new HashMap< String, Document >( );
		Object cdoc = getNakedDocument( );
		
		if ( cdoc instanceof EDContainerType )
		{
			EDContainerType cnt = ( EDContainerType )cdoc;
			Set< String > ids = new HashSet< String >( );
			for ( ContainerDocType contDoc : cnt.getContainerDocList( ) )
			{
				if ( null == contDoc.getDocBody( ) || null == contDoc.getDocBody( ).getAny( ) )
					continue;
				
				EDDocument cntdoc = new EDDocument( contDoc.getDocBody( ).getAny( ) );
				String documentId = cntdoc.getDocumentID( );
				if ( ids.contains( documentId ) )
				{
					ErrorHelper.throwException( 
						"В контейнере обнаружены документы с повторяющимися DocumentID", 
						getDocumentID( ), ResultCodes._03_00029_01, "PRECHECK" 
					);
				}
				
				cntdoc.setRefMainDoc( getDocumentID( ) );
				
				if ( null != documentId )
					cntdocs.put( documentId, cntdoc );
			}
		}
		else if ( cdoc instanceof ArchAddDocRequestType )
		{
			ArchAddDocRequestType aadr = ( ArchAddDocRequestType )cdoc;
			EDDocument subDoc = new EDDocument( aadr.getArchDoc( ).getAny( ) );
			String documentId = subDoc.getDocumentID( );
			
			subDoc.setRefMainDoc( getDocumentID( ) );
			
			if ( null != documentId )
				cntdocs.put( documentId, subDoc );
		}
		else if ( cdoc instanceof ArchDocUpdateType )
		{
			ArchDocUpdateType adu = ( ArchDocUpdateType )cdoc;
			EDDocument subDoc = new EDDocument( adu.getArchDoc( ).getAny( ) );
			String documentId = subDoc.getDocumentID( );
			
			subDoc.setRefMainDoc( getDocumentID( ) );
			
			if ( null != documentId )
				cntdocs.put( documentId, subDoc );
		}
		else if ( cdoc instanceof EPSDocResponseType )
		{
			EPSDocResponseType edr = ( EPSDocResponseType )cdoc;
			EDDocument subDoc = new EDDocument( edr.getDocResponse( ).getDocResponseBody( ).getAny( ) );
			String documentId = subDoc.getDocumentID( );
			
			subDoc.setRefMainDoc( getDocumentID( ) );
			
			if ( null != documentId )
				cntdocs.put( documentId, subDoc );
		}
		
		setContainerDocuments( cntdocs );		
	}
}
