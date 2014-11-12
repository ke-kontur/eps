package ru.acs.fts.aud.router.processing.definitions;

public class LogMessageSourceKeys
{
	public static final String LOG_COMMON_1000 = "LOG-COMMON-1000";
	public static final String LOG_COMMON_1001 = "LOG-COMMON-1001";
	
	public static final String LOG_PUT_DOC_1000 = "LOG-PUT_DOC-1000";
	
	/**
	 * PrevVersionArchiveDocumentId пуст
	 */
	public static final String LOG_PUT_DOC_1001 = "LOG-PUT_DOC-1001";
	
	/**
	 * Журналируем PrevVersionArchiveDocumentId
	 */
	public static final String LOG_PUT_DOC_1002 = "LOG-PUT_DOC-1002";
	
	/**
	 * PrevVersionArchiveDocumentId документа вложенного в контейнер пуст
	 */
	public static final String LOG_PUT_DOC_1003 = "LOG-PUT_DOC-1003";
	
	/**
	 * Журналируем PrevVersionArchiveDocumentId документа, вложенного в контейнер
	 */
	public static final String LOG_PUT_DOC_1004 = "LOG-PUT_DOC-1004";
	
	public static final String LOG_PUT_DOC_1005 = "LOG-PUT_DOC-1005";
	public static final String LOG_PUT_DOC_1006 = "LOG-PUT_DOC-1006";
	public static final String LOG_PUT_DOC_1007 = "LOG-PUT_DOC-1007";
	public static final String LOG_PUT_DOC_1008 = "LOG-PUT_DOC-1008";
	
	public static final String LOG_GET_PACKET_1000 = "LOG-GET_PACKET-1000"; // NO_UCD (unused code)
	public static final String LOG_GET_PACKET_1001 = "LOG-GET_PACKET-1001"; // NO_UCD (unused code)
	public static final String LOG_GET_PACKET_1002 = "LOG-GET_PACKET-1002"; // NO_UCD (unused code)
	
	public static final String LOG_GET_DOC_1000 = "LOG-GET_DOC-1000";
	
	public static final String LOG_DOCUMENT_1001 = "LOG-DOCUMENT-1001"; // NO_UCD (unused code)
	
	public static final String LOG_RESULT_1000 = "LOG-RESULT-1000"; // NO_UCD (unused code)
	
	public static final String LOG_GET_RPSNT_1000 = "LOG-GET_RPSNT-1000"; // NO_UCD (unused code)
	
	public static final String LOG_PUT_DOC_SYNC_1000 = "LOG-PUT_DOC_SYNC-1000"; // NO_UCD (unused code)
	
	// @formatter:off
	private LogMessageSourceKeys( ) { } 
	// @formatter:on
}
