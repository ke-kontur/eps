package ru.acs.fts.aud.router.processing.definitions;

public class ErrorMessageSourceKeys
{
	/**
	 * Общая ошибка архива ?
	 */
	public static final String ERROR_ARCHIVE_1001 = "ERROR-ARCHIVE-1001";
	public static final String ERROR_ARCHIVE_1002 = "ERROR-ARCHIVE-1002"; // NO_UCD (unused code)
	public static final String ERROR_ARCHIVE_1003 = "ERROR-ARCHIVE-1003";
	
	/**
	 * Для запрошенного документа не найден в базе данных предыдущий документ
	 */
	public static final String ERROR_ARCHIVE_1004 = "ERROR-ARCHIVE-1004";
	public static final String ERROR_ARCHIVE_1007 = "ERROR-ARCHIVE-1007";
	// public static final String ERROR_ARCHIVE_1008 = "ERROR-ARCHIVE-1008";
	
	/**
	 * В прикладном документе указана RefArchivePacketId, однако такого
	 * пакета (Packet) в базе данных не существует
	 */
	public static final String ERROR_ARCHIVE_1101 = "ERROR-ARCHIVE-1101";
	
	public static final String ERROR_ARCHIVE_1102 = "ERROR-ARCHIVE-1102"; // NO_UCD (unused code)
	
	/**
	 * В запросе указан архивный идентификатор пакета (RefExtArchiveDocumentId)
	 * однако в базе данных указанного документа не существует
	 */
	public static final String ERROR_ARCHIVE_1103 = "ERROR-ARCHIVE-1103";
	
	public static final String ERROR_ARCHIVE_1104 = "ERROR-ARCHIVE-1104"; // NO_UCD (unused code)
	public static final String ERROR_ARCHIVE_1106 = "ERROR-ARCHIVE-1106"; // NO_UCD (unused code)
	
	/**
	 * Для прикладного документа при запросе на размещение в архив (AUDPutDocRequest)
	 * не найден в базе данных DocumentKind
	 */
	public static final String ERROR_ARCHIVE_1107 = "ERROR-ARCHIVE-1107";
	
	/**
	 * Список идентификаторов декларации (GTDIDs) в прикладном документе
	 * пуст
	 */
	public static final String ERROR_ARCHIVE_1108 = "ERROR-ARCHIVE-1108";
	
	/**
	 * В прикладном документе указан тип декларации не GTD, но указаны
	 * идентификаторы декларации
	 */
	public static final String ERROR_ARCHIVE_1109 = "ERROR-ARCHIVE-1109";
	
	/**
	 * Указан ссылочный идентификатор (RefArchivePacketId), однако для указанного
	 * в прикладном документе номера декларации (GTDID) пакета в базе данных
	 * не существует
	 */
	public static final String ERROR_ARCHIVE_1110 = "ERROR-ARCHIVE-1110";
	
	/**
	 * По номеру декларации (GTDID) в базе данных найден соответствующий пакет 
	 * (PacketGTD), но в прикладном документе не указана ссылочная связанность
	 * (RefArchivePacketId)
	 */
	public static final String ERROR_ARCHIVE_1111 = "ERROR-ARCHIVE-1111";
	
	public static final String ERROR_ARCHIVE_1201 = "ERROR-ARCHIVE-1201"; // NO_UCD (unused code)
	
	/**
	 * Уже существует запрос (ArchiveRequest) с идентификатором входящего
	 * конверта (EnvelopeID)
	 */
	public static final String ERROR_ARCHIVE_1300 = "ERROR-ARCHIVE-1300";
	
	/**
	 * Уже существует запрос (ArchiveRequest) с идентификатором входящего
	 * документа (DocumentID)
	 */
	public static final String ERROR_ARCHIVE_1301 = "ERROR-ARCHIVE-1301";
	
	public static final String ERROR_ARCHIVE_1303 = "ERROR-ARCHIVE-1303"; // NO_UCD (unused code)
	
	/**
	 * В запросе на размещение документа в архиве AUD(PutDocRequest) не
	 * задан прикладной документ и в то же время нет ссылочного идентификатора
	 * (RefArchivePacketId) 
	 */
	public static final String ERROR_FORMAT_1001 = "ERROR-FORMAT-1001";
	
	public static final String ERROR_FORMAT_1004 = "ERROR-FORMAT-1004"; // NO_UCD (unused code)
	
	/**
	 * ApplicationInfo.MessageKind не соответствует документу, который 
	 * расположен в Envelope.Body
	 */
	public static final String ERROR_FORMAT_1005 = "ERROR-FORMAT-1005";
	
	/**
	 * В базе данных не найден клиент архива (Client) с переданным идентификатором
	 * клиента (ArchiveClientID)
	 */
	public static final String ERROR_ACCESS_1001 = "ERROR-ACCESS-1001";
	
	public static final String ERROR_ACCESS_1002 = "ERROR-ACCESS-1002";
	public static final String ERROR_ACCESS_1003 = "ERROR-ACCESS-1003";
	
	/**
	 * У клиента с переданным идентификатором (AppliedClientID) нет прав на
	 * размещение в архиве такого (DocumentModeID) документа.
	 */
	public static final String ERROR_ACCESS_1004 = "ERROR-ACCESS-1004";
	
	/**
	 * Клиенту архива (Client) с переданным идентификатором ArchiveClientID
	 * Не разрешен доступ
	 */
	public static final String ERROR_ACCESS_1005 = "ERROR-ACCESS-1005";
	
	public static final String ERROR_ACCESS_1006 = "ERROR-ACCESS-1006";
	
	public static final String ERROR_WDSIG_1002 = "ERROR-WDSIG-1002";
	
	/**
	 * Не удалось получить подпись (SignatureType) элемента 
	 * AUDAppliedDocumentWithBody из запроса на хранение документа
	 */
	public static final String ERROR_WDSIG_1005 = "ERROR-WDSIG-1005";
	
	public static final String ERROR_XML_1005 = "ERROR-XML-1005";
	
	/**
	 * Ошибка при работе с XML при вычленении вложенных в контейнер
	 * прикладных документов
	 */
	public static final String ERROR_XML_1008 = "ERROR-XML-1008";
	
	/**
	 * Ошибка работы с базой данных
	 */
	public static final String ERROR_DATABASE_1000 = "ERROR-DATABASE-1000";
}
