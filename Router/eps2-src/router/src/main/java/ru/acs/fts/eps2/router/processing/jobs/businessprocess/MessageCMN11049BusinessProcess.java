package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;

public class MessageCMN11049BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN11049BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( "Начали бизнес-обработку сообщения 11049" );

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDContainerType incomingContainer = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class ); 

		// проверка самого контейнера
		checkContainerDocument( incomingContainer, recvEnv, jobBatchContext );
		
		// проверка вложенных документов
		checkInnerDocuments( incomingContainer, recvEnv, jobBatchContext );

		// формируем ответное сообщение
		EDEnvelope transitEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		envelopes.add( transitEnvelope );
				
		// EnvelopeContextEnterprise respCtx = 
		//	EnvelopeContextEnterprise.getEnvelopeContext( transitEnvelope );

		List< Edecl_Msg_Doc > currentInnerDocs = 
			makeCurrentContainerCurrent( incomingContainer.getDocumentID( ) );
		
		changePreviousContainerStates( 
			incomingContainer.getRefDocumentID( ),
			currentInnerDocs 
		);		
		
		log.info( "Успешно закончили бизнес-обработку сообщения 11049" );
	}
	
	/**
	 * проверка документа-контейнера
	 * @throws DatabaseException 
	 */
	private void checkContainerDocument( 
			EDContainerType incomingContainer,
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		String containerRefDocId = incomingContainer.getRefDocumentID( );

		if ( null == containerRefDocId || containerRefDocId.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		Edecl_Msg_Doc refContainer = _serviceHolder.getEnvelopeService( )
			.getDocument( containerRefDocId );

		if ( ! refContainer.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( jobBatchContext, 
					ResultCodes._03_00030_02, ProcessingConstants.ERROR_TYPE_CHECK );
		}

		if ( !incomingContainer.getDocumentModeID( ).equalsIgnoreCase( refContainer.getDocumentModeId( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00016_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
	}

	/**
	 * проверка вложенных документов 
	 * @throws DatabaseException 
	 */
	private void checkInnerDocuments( 
			EDContainerType incomingContainer,
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		List< Edecl_Msg_Doc > previousInnerDocs = _serviceHolder.getEnvelopeService( )
			.getContainerDocuments( incomingContainer.getRefDocumentID( ) );	
		
		Map< String, Integer > prevDocModeIdCounts = new HashMap< String, Integer >( );
		for ( Edecl_Msg_Doc prevDoc : previousInnerDocs )
		{
			String docModeId = prevDoc.getDocumentModeId( );
			if ( prevDocModeIdCounts.containsKey( docModeId ) )
			{
				int count = prevDocModeIdCounts.get( docModeId ).intValue( );
				count++;
				prevDocModeIdCounts.put( docModeId, count );
			}
			else
				prevDocModeIdCounts.put( docModeId, 1 );
		}		
		
		Map< String, String > docModeIds = new HashMap< String, String >( );
		Map< String, Integer > docModeIdCounts = new HashMap< String, Integer >( );
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String crefDocId = cdoc.getRefDocumentID( );
			String docModeId = cdoc.getDocumentModeID( );
			if ( ! StringUtil.isNullOrEmpty( crefDocId ) )
				docModeIds.put( docModeId, crefDocId );
				
			if ( docModeIdCounts.containsKey( docModeId ) )
			{
				int count = docModeIdCounts.get( docModeId ).intValue( );
				count++;
				docModeIdCounts.put( docModeId, count );
			}
			else
				docModeIdCounts.put( docModeId, 1 );
		}
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String crefDoc = cdoc.getRefDocumentID( );
			
			if ( DocumentModeIDs.KDT_OUT_CU.equals( cdoc.getDocumentModeID( ) ) )
				continue;

			if ( StringUtil.isNullOrEmpty( crefDoc ) )
			{
				if ( ! isPreviousDocsContainsDocWithSameType( previousInnerDocs, cdoc ) )
						continue;
					
				String docModeId = cdoc.getDocumentModeID( );

				if ( ! docModeIds.containsKey( docModeId ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00027_09, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
					
				int prevCount = prevDocModeIdCounts.containsKey( docModeId ) ? prevDocModeIdCounts.get( docModeId ) : 0;
				int currCount = docModeIdCounts.containsKey( docModeId ) ? docModeIdCounts.get( docModeId ) : 0;
				if ( currCount <= prevCount )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00016_02, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
					
				continue;
			}
			else
			{
				Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( crefDoc );
	
				if ( ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
				{
					ErrorHelper.throwException( jobBatchContext, 
							ResultCodes._03_00030_02, ProcessingConstants.ERROR_TYPE_CHECK );
				}
	
				if ( ! cdoc.getDocumentModeID( ).equalsIgnoreCase( refDoc.getDocumentModeId( ) ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00016_01, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
			}
		}
	}
	
	private List< Edecl_Msg_Doc > makeCurrentContainerCurrent( String currentDocumentId ) 
		throws DatabaseException
	{
		// По значению RefDocumentID вложенного в CMN.11049 документа находим
		// документ-контейнер исходного запроса на внесение изменений.
		Edecl_Msg_Doc currentContainerDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( currentDocumentId );

		// В поле DOC_STATE для найденного документа-контейнера и всех вложенных
		// в него документов записывается значение CURRENT. Иными
		// словами – делаем комплект документов актуальным.
		currentContainerDoc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( currentContainerDoc );

		List< Edecl_Msg_Doc > currentInnerDocs = 
			_serviceHolder.getEnvelopeService( ).getContainerDocuments( currentDocumentId );
		
		for ( Edecl_Msg_Doc doc : currentInnerDocs )
		{
			doc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}		
		
		return currentInnerDocs;
	}

	/**
	 * По значению RefDocumentID документа-контейнера (а также каждого
	 * вложенного в контейнер документа), вложенного в сообщение
	 * CMN.11049 в таблице EDECL_MESSAGES находим документы, у которых 
	 * стоит пометка CURENT в поле DOC_STATE. У тех документов, которые были 
	 * удалены - значение CURRENT изменяется на DELETED. У тех документов, 
	 * которые были изменены - значение CURRENT изменяется на CHANGED. 
	 * Иными словами – делаем предыдущий комплект документов – устаревшим, 
	 * измененным.
	 */
	private void changePreviousContainerStates( 
			String previousContainerId, List< Edecl_Msg_Doc > currentInnerDocs ) 
		throws DatabaseException
	{

		Edecl_Msg_Doc previousContainerDoc = 
			_serviceHolder.getEnvelopeService( ).getDocument( previousContainerId );
		
		previousContainerDoc.setState( DocumentStates.CHANGED );
		
		_serviceHolder.getEnvelopeService( ).merge( previousContainerDoc );

		List< Edecl_Msg_Doc > previousInnerDocs = 
			_serviceHolder.getEnvelopeService( ).getContainerDocuments( previousContainerId );
		
		for ( Edecl_Msg_Doc doc : previousInnerDocs )
		{
			boolean found = false;
			for ( Edecl_Msg_Doc prevDoc : currentInnerDocs )
			{
				if ( prevDoc.getDocumentID( ).equalsIgnoreCase( doc.getDocumentID( ) ) )
				{
					found = true;
					break;
				}
			}

			if ( found )
			{
				doc.setState( DocumentStates.CHANGED );
			}
			else
			{
				doc.setState( DocumentStates.DELETED );
			}
			
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}
	}
	
	private boolean isPreviousDocsContainsDocWithSameType( 
			List< Edecl_Msg_Doc > previous, EDDocument doc )
	{
		String documentModeId = doc.getDocumentModeID( );
		
		for ( Edecl_Msg_Doc cdoc : previous )
		{
			if ( cdoc.getDocumentModeId( ).equalsIgnoreCase( documentModeId ) )
				return true;
		}
		
		return false;
	}
}
