package ru.acs.fts.eps2.engine.processing;

/**
 * User: CAA
 * Date: 07.11.11
 */

/**
 * Ключи контекста задачи.
 */
public class ContextConstants
{
	/**
	 * "Тип сообщения
	 */
	public final static String MESSAGE_TYPE = "messageType";
	
	/**
	 * Имя конверта
	 */
	public final static String ENVELOPE_NAME = "envelopeName";
	
	/**
	 * Объект, подлежащий сохранению в БД
	 */
	public final static String OBJECT_TO_SAVE = "objectToSave";
	
	/**
	 * Тип системы получения
	 */
	public final static String RECV_SYSTEM = "recvSystem";
	
	/**
	 * Имя документа.
	 */
	public final static String DOCUMENT_NAME = "documentName";
	
	/**
	 * Тип авторизации
	 */
	public final static String AUTH_TYPE = "authType";
	
	/**
	 * Нужно ли сохранение ( да да именно сохранение, а не сброс результатов в базу
	 * как это можно предположить из названия, flush := сброс )
	 */
	public final static String NEED_FLUSH = "needFlush";
	
	/**
	 * Конфигуратор
	 */
	public final static String CONFIGURATOR = "configurator";
	
	/**
	 * Сообщение-уведомление
	 */
	public final static String NOTIFICIATION_MESSAGE = "notification";
	
	/**
	 * Тип применяемого преобразования к сообщению
	 */
	public final static String TRANSFORMATION_TYPE = "transformationType";
		
	/**
	 * Проверять наличие идентификатора изначального сообщения job:
	 * CheckMessageContent
	 */
	public final static String NEED_INITIAL_ENVELOPE_ID = "needInitialEnvelopeId";

	/**
	 * Ключ для идентификатора процедуры
	 */
	public final static String PROCESS_ID = "processId";

	/**
	 * Информация о текущем состоянии процедуры
	 */
	public final static String CURRENT_PROCESS_INFORMATION = "currentProcInfo";
	
	/**
	 * Информация о версии текущей процедуры
	 */
	public final static String CURRENT_PROCESS_SOFT_VERSION = "currentProcSoftVersion";
	
	/**
	 * Информация о версии текущей процедуры
	 */
	public final static String CURRENT_PROCESS_ID = "currentProcessId";

	/**
	 * Идентификатор категории для вызова сервиса логирования ( EventService )
	 */
	public final static String CATEGORY_ID = "categoryId";

	/**
	 * Идентификатор события
	 */
	public final static String EVENT_CODE = "eventCode";

	/**
	 * Информация о событии
	 */
	public final static String EVENT_INFO = "eventInfo";

	/**
	 * Имя существующей системы ?
	 */
	public final static String EXISTING_SYSTEM_NAME = "existingSystemName";

	/**
	 * Идентификатор источника для сервиса логирования ( EventService )
	 */
	public final static String SOURCE_ID = "sourceId";

	/**
	 * Ключ для номера версии для MessageVersionTransformation при отсутствии
	 * процедуры
	 */
	public final static String ANSWER_SOFT_VERSION = "softVersion";

	/**
	 * Флаг необходимости подписи внутренних документов, используется в 
	 * задаче подписи документов
	 */
	public final static String SIGN_SUB_DOCUMENTS = "signSubDocuments";

	/**
	 * Признак "удаленности" процедуры
	 */
	public final static String IS_REMOTE = "remote";

	/**
	 * Ключ для флага "не заполнять идентификатор процедуры"
	 */
	public final static String CLEAR_PROCESS_ID = "clearProcessId";

	/**
	 * Ключ для типа удаленности
	 */
	public final static String REMOTENESS_TYPE = "remotenessType";

	/**
	 * Сложная проверка для использования в данной задаче сложных проверок
	 */
	public final static String CHECK_SENTENCE = "checkSentece";

	/**
	 * DOM представление документа
	 */
	public final static String XML_DOM_DOCUMENT = "xmlDomDocument";

	/**
	 * В некоторых задачах - код ошибки который следует вернуть в случае неверного выполнения
	 */
	public final static String RESULT_CODE = "resultCode";

	/**
	 * Иногда надо подменить код таможни отправителя, тогда стоит использовать именно этот ключ
	 */
	public final static String SENDER_CUSTOMS_CODE_FROM_PROC_INFO = "senderCustomsCodeFromProcInfo";

	/**
	 * Иногда надо подменить код таможни получателя, тогда стоит использовать именно этот ключ
	 */
	public final static String RECEIVER_CUSTOMS_CODE_FROM_PROC_INFO = "receiverCustomsCodeFromProcInfo";

	/**
	 * Иногда надо подменить код обмена в получателе, тогда стоит использовать именно этот ключ
	 */
	public final static String RECEIVER_EXCH_TYPE_FROM_PROC_INFO = "receiverExchTypeFromProcInfo";

	/**
	 * Требуемые субстатусы процедуры
	 */
	public final static String NEED_PROCESS_SUB_STATUSES = "needProcessSubStatuses";

	/**
	 * Субстатусы которых процедура не должна иметь
	 */
	public final static String FORBID_PROCESS_SUB_STATUSES = "forbidProcessSubStatuses";

	/**
	 * Код ошибки для некоторых задач
	 */
	public final static String ERROR_CODE = "errorCode";

	/**
	 * Ключ для списка конвертов
	 */
	public final static String ENVELOPES = "envelopes";
	public final static String ENVELOPES_UNSIGNED = "envelopesUnsigned";
	public final static String ENVELOPES_VERSIONS = "envelopesVersions";

	/**
	 * Положить ли в список
	 */
	public final static String PUT_INTO_LIST = "putIntoList";

	/**
	 * Имя события
	 */
	public final static String EVENT_NAME = "eventName";

	/**
	 * Внутренний транзит, используется как идентификатор конверта(ов) в JobBatchContext
	 */
	public final static String INT_TRANZIT = "intTranzit";

	/**
	 * Не переводить статус процедуры (имя свойства в контексте)
	 */
	public final static String IGNORE_CHANGE_STATE = "ignoreChangeState";
	
	/**
	 * Получающая система
	 */
	public final static String RECEIVING_SYSTEM = "receivingSystem";

	/**
	 * Не требовать проверку наличия InitialEnvelopeID в задачах, которые его требуют
	 */
	public final static String NO_REQUIRED_INITIAL_ENVELOPE_ID = "noRequiredInitialEnvelopeId";
	
	/**
	 * Не требовать проверку наличия ProccessID в задачах, которые его требуют
	 */
	public final static String NO_REQUIRED_PROCESS_ID = "noRequiredProcessId";

	/**
	 * Вспомогательный пакет задач для выполнения
	 */
	public final static String SUB_BATCH = "subBatch"; // NO_UCD (use default)

	/**
	 * Отправить во входящие очереди контроллера, используется для посылки сообщений в "прошлое"
	 * и "будущее" ( обмен между одним и тем же РТУ, но разных версий )
	 */
	public final static String SEND_TO_CONTROLLER = "sendToController";
	
	/**
	 * Нужно ли заполнять идентификатор процесса
	 */
	public final static String FILL_PROCESS_ID = "fillProcessId";
	
	public final static String MESSAGE_TYPES = "messageTypes";
	
	/**
	 * Иногда нам надо перевести статус процедуры, которая задана не в заголовке, а в теле 
	 * сообщения. Тогда мы должна сами ( в бизнес процессе ) выковырять Edecl_Proc_Information
	 * и поместить в JobBatchContext в эту переменную, затем ChangeProcessState проверит
	 * и переведет 
	 */
	public final static String KEEPED_PROC_INFO = "keepedProcInfo";
	
	/**
	 * См. KEEPED_PROC_INFO, это тип сообщения, по которому надо делать переход
	 */
	public final static String KEEPED_PROC_INFO_MSG_TYPE = "keepedProcInfoMsgType";
	
	/**
	 * Ошибка анмаршаллера
	 */
	public final static String UNMARSHALLER_EXCEPTION = "unmarshallerException";
	
	/**
	 * Рекурсивный сброс подписи
	 */
	public final static String CLEAR_SIGN_SUB_DOCUMENTS = "clearSignSubDocuments";
	
	public final static String NO_NEED_SAVE_BODY = "noNeedSaveBody";
	
	public final static String SELECTED_AUTHORIZATION = "selectedAuthorization";
	
	public final static String SENDER_CUSTOMS_AS_EPS = "senderCustomsAsEps";
	
	public final static String INCOME_DOCUMENT_ID = "incomeDocumentId";
	
	public final static String SET_REF_AS_INCOME_DOCUMENT_ID = "setRefAsIncomeDocumentId";
}
