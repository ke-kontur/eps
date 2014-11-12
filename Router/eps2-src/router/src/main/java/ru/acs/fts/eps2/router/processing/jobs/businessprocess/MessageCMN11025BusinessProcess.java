package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;

public class MessageCMN11025BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN11025BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( "Начали бизнес-обработку сообщения 11025" );

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDContainerType incomingContainer = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );
		
		/** проверяем InitialEnvelopeID для случая корректировки таможенной стоимости после выпуска ДТ */
		checkInitialEnvelopeId( recvEnv, jobBatchContext );

		/** проверяем не ставили ли мы уже такой субстатус */
		checkSubstatusPresence( recvEnv, jobBatchContext );
		
		/** проверка самого контейнера */
		checkContainerDocument( incomingContainer, recvEnv, jobBatchContext );
		
		/** проверка вложенных документов */
		checkInnerDocuments( incomingContainer, recvEnv, jobBatchContext );

		/** формируем ответное сообщение */
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );
		
		/**
		 * Сохраняем новые статусы контейнера и документов
		 */
		List< Edecl_Msg_Doc > savedIncomingContainerDocs = _serviceHolder
			.getEnvelopeService( ).getContainerDocuments( incomingContainer.getDocumentID( ) );

		Edecl_Msg_Doc containerDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( incomingContainer.getDocumentID( ) );
		
		containerDoc.setState( DocumentStates.WAITABLE );
		_serviceHolder.getEnvelopeService( ).merge( containerDoc );

		for ( Edecl_Msg_Doc doc : savedIncomingContainerDocs )
		{
			doc.setRefMainDoc( incomingContainer.getDocumentID( ) );
			doc.setState( DocumentStates.WAITABLE );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}

		Edecl_Substatus_State substatusState = new Edecl_Substatus_State( );
		substatusState.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		substatusState.setProcessId( recvEnv.getProcessID( ) );
		substatusState.setStCode( SpecialProcedureSubStates.GTD_EDITING  );
		_serviceHolder.getProcedureService( ).persist( substatusState );

		log.info( "Успешно закончили бизнес-обработку сообщения 11025" );
	}
	
	private void checkInitialEnvelopeId( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Set< String > specialStates = new HashSet< String >( );
		specialStates.add( SpecialProcedureStates.DECL_CORREC_CC );
		specialStates.add( SpecialProcedureStates.PTD_DECL_CORREC_CC );
		specialStates.add( SpecialProcedureStates.AEO_DECL_CORREC_CC );
		specialStates.add( SpecialProcedureStates.EXP_DECL_CORREC_CC );
		
		String currState = procInfo.getCurrentState( );
		if ( ! specialStates.contains( currState ) )
			return ; /** Процедура не в том состоянии чтобы контроллировать InitialEnvelopeID */
		
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		Edecl_Messages initialEnvelope = _serviceHolder.getEnvelopeService( )
			.getEnvelope( initialEnvelopeId );
		if ( null == initialEnvelope )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		if ( ! initialEnvelope.getMessageType( ).equalsIgnoreCase( MessageType.CMN_11107 ) ||
			 ! initialEnvelope.getProcessId( ).equalsIgnoreCase( procInfo.getProcessId( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);						
		}
	}
	
	private void checkSubstatusPresence( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		List< Edecl_Substatus_State > substates = _serviceHolder.getProcedureService( )
			.getProcSubStatuses( recvEnv.getProcessID( ) );
		for ( Edecl_Substatus_State substate : substates )
		{
			if ( substate.getStCode( ).equalsIgnoreCase( SpecialProcedureSubStates.GTD_EDITING ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._03_00021_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
		}
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

		/**
		 * Контейнер должен содержать ссылочную связанность на заменяемый контейнер
		 */
		if ( null == containerRefDocId || containerRefDocId.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		Edecl_Msg_Doc refContainer = _serviceHolder.getEnvelopeService( )
				.getDocument( containerRefDocId );

		/**
		 * Заменяемый контейнер должен быть текущим
		 */
		if ( ! refContainer.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_08, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		/**
		 * Оба документа должны быть одинаковыми контейнерами
		 */
		if ( ! incomingContainer.getDocumentModeID( ).equalsIgnoreCase( refContainer.getDocumentModeId( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00016_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
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
		throws ResultTypeException, DatabaseException
	{
		List< Edecl_Msg_Doc > previousInnerDocs = _serviceHolder.getEnvelopeService( )
				.getContainerDocuments( incomingContainer.getRefDocumentID( ) );	
		
		/**
		 * Считаем какие и сколько документов есть в предыдущем контейнере
		 */
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
		
		/**
		 * Строим связку типов документов и их количества в текущем контейнере
		 * docModeIds - типы документов для которых есть RefDocumentID
		 * docModeIdCounts - количество документов определенного типа в этом контейнере
		 */
		Map< String, String > docModeIds = new HashMap< String, String >( );
		Map< String, Integer > docModeIdCounts = new HashMap< String, Integer >( );
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String crefDocId = cdoc.getRefDocumentID( );
			String docModeId = cdoc.getDocumentModeID( );
			if ( ! StringUtil.isNullOrEmpty( crefDocId ) )
				docModeIds.put( cdoc.getDocumentModeID( ), crefDocId );
				
			if ( docModeIdCounts.containsKey( docModeId ) )
			{
				int count = docModeIdCounts.get( docModeId ).intValue( );
				count++;
				docModeIdCounts.put( docModeId, count );
			}
			else
				docModeIdCounts.put( docModeId, 1 );
		}

		/**
		 * Проверяем
		 */
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String docRef = cdoc.getRefDocumentID( );
			
			if ( DocumentModeIDs.KDT_OUT_CU.equals( cdoc.getDocumentModeID( ) ) || DocumentModeIDs.DECL_CHANGE_REQUEST.equals(cdoc.getDocumentModeID()))
				continue;

			/**
			 * Текущий документ не ссылается на документ в предыдущем контейнере
			 */
			if ( StringUtil.isNullOrEmpty( docRef ) )
			{
				/**
				 * Если в предыдущем контейнере такого документа не было - то все хорошо
				 */
				if ( ! isPreviousDocsContainsDocWithSameType( previousInnerDocs, cdoc ) )
					continue;
					
				String docModeId = cdoc.getDocumentModeID( );
				
				/**
				 * В данном контейнере нет больше документов такого типа, которые
				 * ссылаются на документ в предыдущем контейнере.
				 * 
				 * Это плохо, так как в текущем контейнере не должно быть новых документов,
				 * которых не было в предыдущем контейнере
				 */
				if ( ! docModeIds.containsKey( docModeId ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00027_09, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}
					
				int prevCount = prevDocModeIdCounts.containsKey( docModeId ) ? prevDocModeIdCounts.get( docModeId ) : 0;
				int currCount = docModeIdCounts.containsKey( docModeId ) ? docModeIdCounts.get( docModeId ) : 0;
				if ( currCount <= prevCount )
				{
					/**
					 * В текущем контейнере есть документ без ссылочной связности, при этом в текущем
					 * контейнере есть ровно столько же или меньше подобных документов со ссылочной 
					 * связностью.
					 * 
					 * Это плохо, так как в текущем контейнере новый документ может только добавляться,
					 * при условии наличия всех подобных документов со ссылочной связностью.
					 */
					
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00016_02, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}
			}
			else
			{
				Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( )
					.getDocument( docRef );

				if ( ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
				{
					/**
					 * Документ из предыдущего контейнера на который ссылается документ из этого контейнера
					 * не является текущим, так нельзя.
					 */
					
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00027_08, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}

				if ( ! cdoc.getDocumentModeID( ).equalsIgnoreCase( refDoc.getDocumentModeId( ) ) )
				{
					/**
					 * Документ из предыдущего контейнера на который ссылается документ из этого контейнера
					 * другого типа, так нельзя.
					 */
					
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00016_01, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}
			}
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
