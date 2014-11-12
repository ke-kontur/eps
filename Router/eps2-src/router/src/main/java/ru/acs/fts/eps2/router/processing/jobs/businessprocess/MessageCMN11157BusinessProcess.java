package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.ProcedureChangeInformation;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.*;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.gtdoutcustomsmark.GTDOutCustomsMarkType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.*;

/**
 *
 * <p>Параметры контекста задачи (JobContext):</p>
 * 
 * <ul>
 * <li><b>envelopes</b> - имя списка конвертов, где будут храниться конверты для отправки</li>
 * </ul>
 */
public class MessageCMN11157BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN11157BusinessProcess.class );
	
	private final static String cmnTransitName = "cmnTransit";	
	private final static String cmn00004notifName = "cmn00004notif";	

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
        EnvelopeService eserv = _serviceHolder.getEnvelopeService();


        List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		envelopes.add( prepareCmnTransit( jobBatchContext ) );
        envelopes.add( prepareCmn00004Notif( jobBatchContext ) );

        EDContainerType incomingContainer = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );

        /** проверка самого контейнера */
        checkContainerDocument( incomingContainer, recvEnv, jobBatchContext );

        /** проверка вложенных документов */
        checkInnerDocuments( incomingContainer, recvEnv, jobBatchContext );

        /**
         * Сохраняем новые статусы контейнера и документов
         */
        List< Edecl_Msg_Doc > savedIncomingContainerDocs = _serviceHolder
                .getEnvelopeService( ).getContainerDocuments( incomingContainer.getDocumentID( ) );

        EDContainerType currentCnt = extractContainer( jobBatchContext.getReceivedEnvelope( ) );
        String refCnt = currentCnt.getRefDocumentID( );
        Edecl_Msg_Doc dbcnt = eserv.getDocument( currentCnt.getDocumentID( ) );
        if ( null == dbcnt )
        {
            ErrorHelper.throwException(
                    jobBatchContext, ResultCodes._02_00001_01,
                    ProcessingConstants.ERROR_TYPE_CHECK
            );
        }

        dbcnt.setState( DocumentStates.CURRENT );
        eserv.merge( dbcnt );
        if ( ! StringUtil.isNullOrEmpty( refCnt ) )
        {
            dbcnt = eserv.getDocument( refCnt );
            if ( null == dbcnt )
            {
                ErrorHelper.throwException(
                        jobBatchContext, ResultCodes._02_00001_01,
                        ProcessingConstants.ERROR_TYPE_CHECK
                );
            }

            dbcnt.setState( DocumentStates.CHANGED );
            eserv.merge( dbcnt );
        }

        List<String> documentIds=new ArrayList<String>();
        for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
        {
            EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
            String documentId = cdoc.getDocumentID( );
            Edecl_Msg_Doc dbdoc = eserv.getDocument( documentId );
            if ( null == dbdoc )
            {
                ErrorHelper.throwException(
                        jobBatchContext, ResultCodes._02_00001_01,
                        ProcessingConstants.ERROR_TYPE_CHECK
                );
            }
            if(dbdoc.getDocumentModeId().equals(DocumentModeIDs.GTD_OUT_CUSTOMS_MARK)||
                    dbdoc.getDocumentModeId().equals(DocumentModeIDs.DTS_OUT_CUSTOMS_MARK)){
                dbdoc.setState( DocumentStates.NOTSET );
            }
            dbdoc.setState( DocumentStates.CURRENT );
            eserv.merge(dbdoc);

            dbdoc.setRefMainDoc(currentCnt.getDocumentID( ));
            eserv.merge( dbdoc );

            String refDocumentId = cdoc.getRefDocumentID( );
            if ( StringUtil.isNullOrEmpty( refDocumentId ) ) {
                continue;
            }
            documentIds.add(refDocumentId.toLowerCase());

            dbdoc = eserv.getDocument( refDocumentId );
            if ( null == dbdoc )
            {
                ErrorHelper.throwException(
                        jobBatchContext, ResultCodes._02_00001_01,
                        ProcessingConstants.ERROR_TYPE_CHECK
                );
            }

            dbdoc.setState( DocumentStates.CHANGED );
            eserv.merge( dbdoc );

            if ( ! StringUtil.isNullOrEmpty( dbdoc.getRefMainDoc( ) ) )
            {
                Edecl_Msg_Doc cnt = eserv.getDocument( dbdoc.getRefMainDoc( ) );
                if ( null == cnt )
                {
                    ErrorHelper.throwException(
                            jobBatchContext, ResultCodes._02_00001_01,
                            ProcessingConstants.ERROR_TYPE_CHECK
                    );
                }

                cnt.setState( DocumentStates.CHANGED );
                eserv.merge( dbdoc );
            }
        }
        List< Edecl_Msg_Doc > currentInnerDocs = _serviceHolder.getEnvelopeService( )
                .getContainerDocuments( currentCnt.getDocumentID() );
        for(Edecl_Msg_Doc  dd: currentInnerDocs){
            if(dd.getDocumentModeId().equals(DocumentModeIDs.INVENTORY)){
                dd.setRefMainDoc(currentCnt.getDocumentID());
                dd.setState(DocumentStates.CURRENT);
                eserv.merge(dd);
            }
        }
        changePreviousContainerStates(
                currentCnt.getRefDocumentID( ), currentInnerDocs, documentIds
        );
        log.info( "Успешно закончили бизнес-обработку сообщения 11025" );
    }

    private void changePreviousContainerStates(
            String previousContainerId, List<Edecl_Msg_Doc> currentInnerDocs, List<String> documentIds)
            throws DatabaseException
    {

        Edecl_Msg_Doc previousContainerDoc = _serviceHolder.getEnvelopeService( ).getDocument( previousContainerId );

        previousContainerDoc.setState( DocumentStates.CHANGED );
        _serviceHolder.getEnvelopeService( ).merge( previousContainerDoc );

        List< Edecl_Msg_Doc > previousInnerDocs = _serviceHolder.getEnvelopeService( )
                .getContainerDocuments( previousContainerId );

        for ( Edecl_Msg_Doc doc : previousInnerDocs )
        {

            /*boolean found = false;
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
            }*/
            if(doc.getDocumentModeId().equals(DocumentModeIDs.INVENTORY)){
                continue;
            }
            if(!documentIds.contains(doc.getDocumentID().toLowerCase())) {
                doc.setState( DocumentStates.DELETED );
                _serviceHolder.getEnvelopeService().merge(doc);
            }
        }
    }

    private EDEnvelope prepareCmnTransit( EDJobBatchContext jobBatchContext )
    {
        EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( cmnTransitName );

        transit.setSaveEnvelope( true );

        return transit;
    }

    private EDEnvelope prepareCmn00004Notif( EDJobBatchContext jobBatchContext )
    {
        EDEnvelope notif = ( EDEnvelope ) jobBatchContext.get( cmn00004notifName );

        return notif;
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

            if ( DocumentModeIDs.KDT_OUT_CU.equals( cdoc.getDocumentModeID( ) ) )
                continue;

            Edecl_Msg_Doc doc = _serviceHolder.getEnvelopeService( )
                    .getDocument( cdoc.getDocumentID() );
            if(!doc.getRefMainDoc().equals(incomingContainer.getDocumentID())){
                continue;
            }
            /**
             * Текущий документ не ссылается на документ в предыдущем контейнере
             */
            if ( StringUtil.isNullOrEmpty( docRef ) )
            {

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
        String documentModeId = doc.getDocumentModeID();

        for ( Edecl_Msg_Doc cdoc : previous )
        {
            if ( cdoc.getDocumentModeId( ).equalsIgnoreCase( documentModeId ) )
                return true;
        }

        return false;
    }
}
