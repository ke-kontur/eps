package ru.acs.fts.eps2.ws.crypto.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.ResultInformation;

public class ResultProcessor
{
	private static final int DESCRIPTION_PART_LENGTH = 250;
	private static final int SOURCE = 11;
	
	public static final String SIGNATURE_VALID = "00.00000.00";
	
	public static final String SIGNATURE_NOT_VALID = "01.00051.01";	
	
	public static final String CERTIFICATE_NOT_VALID = "01.00052.01";
	public static final String CERT_TRUST_IS_NOT_TIME_VALID = "01.00052.02";
	public static final String CERT_TRUST_IS_NOT_TIME_NESTED = "01.00052.03";
	public static final String CERT_TRUST_IS_REVOKED = "01.00052.04";
	public static final String CERT_TRUST_IS_NOT_SIGNATURE_VALID = "01.00052.05";
	public static final String CERT_TRUST_IS_NOT_VALID_FOR_USAGE = "01.00052.06";
	public static final String CERT_TRUST_IS_UNTRUSTED_ROOT = "01.00052.07";
	public static final String CERT_TRUST_REVOCATION_STATUS_UNKNOWN = "01.00052.08";
	public static final String CERT_TRUST_IS_CYCLIC = "01.00052.09";
	public static final String CERT_TRUST_INVALID_EXTENSION = "01.00052.10";
	public static final String CERT_TRUST_INVALID_POLICY_CONSTRAINTS = "01.00052.11";
	public static final String CERT_TRUST_INVALID_BASIC_CONSTRAINTS = "01.00052.12";
	public static final String CERT_TRUST_INVALID_NAME_CONSTRAINTS = "01.00052.13";
	public static final String CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT = "01.00052.14";
	public static final String CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT = "01.00052.16";
	public static final String CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT = "01.00052.17";
	public static final String CERT_TRUST_IS_OFFLINE_REVOCATION = "01.00052.18";
	public static final String CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY = "01.00052.19";
	public static final String CERT_TRUST_IS_PARTIAL_CHAIN = "01.00052.20";
	public static final String CERT_TRUST_CTL_IS_NOT_TIME_VALID = "01.00052.21";
	public static final String CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID = "01.00052.22";
	public static final String CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE = "01.00052.23";
	public static final String CANT_CREATE_CERT_CHAIN_ENGINE = "01.00052.24";
	public static final String CANT_GET_CERT_CHAIN = "01.00052.25";
	public static final String CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT = "01.00052.26";
	
	public static final String CCSE_CANT_LOAD_LIB = "01.00053.01";
	public static final String CCSE_CANT_GET_OBJECT = "01.00053.02";
	public static final String CCSE_AUTHTYPE_DENAID = "01.00053.03";
	public static final String CCSE_PROXY_AUTHTYPE_DENAID = "01.00053.04";
	public static final String CCSE_ADDRESS_DENAID = "01.00053.05";
	public static final String CCSE_ADITIONS_DENAID = "01.00053.06";
	public static final String CCSE_SREQUEST_DENAID = "01.00053.07";
	public static final String CCSE_NSREQUEST_DENAID = "01.00053.08";
	public static final String CCSE_TIME_NOTVALID = "01.00053.09";
	public static final String CCSE_SERVICE_ADDRESS_NOTVALID = "01.00053.10";
	public static final String CCSE_RESPONSE_NOTVALID = "01.00053.11";
	public static final String CCSE_THEUPDATE_NOTVALID = "01.00053.12";
	public static final String CCSE_NEXTUPDATE_LESS_THISUPDATE = "01.00053.13";
	public static final String CCSE_ANKNOWN_ERROR = "01.00053.14";
	
	public static final String CR_UNKNOWN = "01.00054.01";
	public static final String CR_CERT_COMPROMATE = "01.00054.02";
	public static final String CR_ROOT_COMPROMATE = "01.00054.03";
	public static final String CR_CERTINFO_CHANGE = "01.00054.04";
	public static final String CR_CERT_CHANGE = "01.00054.05";
	public static final String CR_NOT_NEED = "01.00054.06";
	public static final String CR_CERT_PAUSED = "01.00054.07";
	public static final String CR_REMOVE_FROM_CRL = "01.00054.08";
	public static final String CR_CERT_PREV_RECALL = "01.00054.09";
	public static final String CR_ATRROOT_COMPROMATE = "01.00054.10";
	public static final String CR_CERT_STATUS_UNKNOWN = "01.00054.11";
	public static final String CR_CERT_STATUS_VALUE_UNKNOWN = "01.00054.12";
	
	public static final String FATAL = "09.96669.99";
		
	private static HashMap< String, ErrorDescription > _errorDescs;
	private static HashMap< Long, String > _certCheckErrors;
	private static HashMap< Long, String > _certCheckServiceErrors;
	private static HashMap< Long, String > _certNotValidReasons;
	
	static
	{
		_errorDescs = new HashMap< String, ErrorDescription >( );
		
		_errorDescs.put( "00.00000.00", new ErrorDescription( "00.00000.00", 4, "Проверка успешно завершена. Наложенная ЭЦП корректна." ) );
		
		_errorDescs.put( "01.00051.01", new ErrorDescription( "01.00051.01", 3, "Некорректная ЭЦП." ) );
		
		_errorDescs.put( "01.00052.01", new ErrorDescription( "01.00052.01", 3, "Ошибка проверки сертификата." ) );
		_errorDescs.put( "01.00052.02", new ErrorDescription( "01.00052.02", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_TIME_VALID" ) );
		_errorDescs.put( "01.00052.03", new ErrorDescription( "01.00052.03", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_TIME_NESTED" ) );
		_errorDescs.put( "01.00052.04", new ErrorDescription( "01.00052.04", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_REVOKED" ) );
		_errorDescs.put( "01.00052.05", new ErrorDescription( "01.00052.05", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_SIGNATURE_VALID" ) );
		_errorDescs.put( "01.00052.06", new ErrorDescription( "01.00052.06", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_NOT_VALID_FOR_USAGE" ) );
		_errorDescs.put( "01.00052.07", new ErrorDescription( "01.00052.07", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_UNTRUSTED_ROOT" ) );
		_errorDescs.put( "01.00052.08", new ErrorDescription( "01.00052.08", 3, "Ошибка проверки сертификата. CERT_TRUST_REVOCATION_STATUS_UNKNOWN" ) );
		_errorDescs.put( "01.00052.09", new ErrorDescription( "01.00052.09", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_CYCLIC" ) );
		_errorDescs.put( "01.00052.10", new ErrorDescription( "01.00052.10", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_EXTENSION" ) );
		_errorDescs.put( "01.00052.11", new ErrorDescription( "01.00052.11", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_POLICY_CONSTRAINTS" ) );
		_errorDescs.put( "01.00052.12", new ErrorDescription( "01.00052.12", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_BASIC_CONSTRAINTS" ) );
		_errorDescs.put( "01.00052.13", new ErrorDescription( "01.00052.13", 3, "Ошибка проверки сертификата. CERT_TRUST_INVALID_NAME_CONSTRAINTS" ) );
		_errorDescs.put( "01.00052.14", new ErrorDescription( "01.00052.14", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT" ) );
		_errorDescs.put( "01.00052.16", new ErrorDescription( "01.00052.16", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT" ) );
		_errorDescs.put( "01.00052.17", new ErrorDescription( "01.00052.17", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT" ) );
		_errorDescs.put( "01.00052.18", new ErrorDescription( "01.00052.18", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_OFFLINE_REVOCATION" ) );
		_errorDescs.put( "01.00052.19", new ErrorDescription( "01.00052.19", 3, "Ошибка проверки сертификата. CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY" ) );
		_errorDescs.put( "01.00052.20", new ErrorDescription( "01.00052.20", 3, "Ошибка проверки сертификата. CERT_TRUST_IS_PARTIAL_CHAIN" ) );
		_errorDescs.put( "01.00052.21", new ErrorDescription( "01.00052.21", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_TIME_VALID" ) );
		_errorDescs.put( "01.00052.22", new ErrorDescription( "01.00052.22", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID" ) );
		_errorDescs.put( "01.00052.23", new ErrorDescription( "01.00052.23", 3, "Ошибка проверки сертификата. CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE" ) );
		_errorDescs.put( "01.00052.24", new ErrorDescription( "01.00052.24", 3, "Ошибка проверки сертификата. CANT_CREATE_CERT_CHAIN_ENGINE" ) );
		_errorDescs.put( "01.00052.25", new ErrorDescription( "01.00052.25", 3, "Ошибка проверки сертификата. CANT_GET_CERT_CHAIN" ) );
		_errorDescs.put( "01.00052.26", new ErrorDescription( "01.00052.26", 3, "Ошибка проверки сертификата. CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT" ) );
		
		_errorDescs.put( "01.00053.01", new ErrorDescription( "01.00053.01", 2, "Ошибка проверки сертификата." ) ); // Не удалось загрузить библиотеку, используемую для обращения к СПС (OCSPProxy.dll) (0x21000001).
		_errorDescs.put( "01.00053.02", new ErrorDescription( "01.00053.02", 2, "Ошибка проверки сертификата." ) ); // Не удалось получить объект, используемый для запроса на СПС (0x21000002).
		_errorDescs.put( "01.00053.03", new ErrorDescription( "01.00053.03", 2, "Ошибка проверки сертификата." ) ); // Указанный тип аутентификации запрещен групповой политикой (0x22000001).
		_errorDescs.put( "01.00053.04", new ErrorDescription( "01.00053.04", 2, "Ошибка проверки сертификата." ) ); // Указанный тип аутентификации на прокси-сервере запрещен групповой политикой (0x22000002).
		_errorDescs.put( "01.00053.05", new ErrorDescription( "01.00053.05", 2, "Ошибка проверки сертификата." ) ); // Указанный адрес СПС запрещен групповой политикой (0x22000003).
		_errorDescs.put( "01.00053.06", new ErrorDescription( "01.00053.06", 2, "Ошибка проверки сертификата." ) ); // Обнаруженное расширение(AcceptableTypes или Nonce) запрещено групповой политикой (0x22000004).
		_errorDescs.put( "01.00053.07", new ErrorDescription( "01.00053.07", 2, "Ошибка проверки сертификата." ) ); // Подписанные запросы на СПС запрещены групповой политикой (0x22000005).
		_errorDescs.put( "01.00053.08", new ErrorDescription( "01.00053.08", 2, "Ошибка проверки сертификата." ) ); // Неподписанные запросы на СПС запрещены групповой политикой (0x22000006).
		_errorDescs.put( "01.00053.09", new ErrorDescription( "01.00053.09", 2, "Ошибка проверки сертификата." ) ); // Значения расширений текущего времени у запроса на СПС и ответа не равны (0x22000007).
		_errorDescs.put( "01.00053.10", new ErrorDescription( "01.00053.10", 2, "Ошибка проверки сертификата." ) ); // Не указан адрес СПС (0x22000008).
		_errorDescs.put( "01.00053.11", new ErrorDescription( "01.00053.11", 2, "Ошибка проверки сертификата." ) ); // Ответ СПС не является актуальным (0x22000009).
		_errorDescs.put( "01.00053.12", new ErrorDescription( "01.00053.12", 2, "Ошибка проверки сертификата." ) ); // Значение поля ThisUpdate не является актуальным (0x2200000A).
		_errorDescs.put( "01.00053.13", new ErrorDescription( "01.00053.13", 2, "Ошибка проверки сертификата." ) ); // Значение поля NextUpdate меньше, чем поля ThisUpdate (0x2200000B).
		_errorDescs.put( "01.00053.14", new ErrorDescription( "01.00053.14", 2, "Ошибка проверки сертификата." ) ); // Во время запроса статуса сертификата возникла неизвестная ошибка, код которой записан в LastError (0x22FFFFFF).
		
		_errorDescs.put( "01.00054.01", new ErrorDescription( "01.00054.01", 3, "Сертификат отозван. Причина отзыва не определена." ) );
		_errorDescs.put( "01.00054.02", new ErrorDescription( "01.00054.02", 3, "Сертификат скомпрометирован." ) );
		_errorDescs.put( "01.00054.03", new ErrorDescription( "01.00054.03", 3, "Центр сертификации скомпрометирован." ) );		
		_errorDescs.put( "01.00054.04", new ErrorDescription( "01.00054.04", 3, "В сертификате изменилась информация." ) );
		_errorDescs.put( "01.00054.05", new ErrorDescription( "01.00054.05", 3, "Сертификат замещен." ) );
		_errorDescs.put( "01.00054.06", new ErrorDescription( "01.00054.06", 3, "Сертификат больше не нужен для тех целей, для которых выпускался." ) );
		_errorDescs.put( "01.00054.07", new ErrorDescription( "01.00054.07", 3, "Действие сертификата приостановлено." ) );
		_errorDescs.put( "01.00054.08", new ErrorDescription( "01.00054.08", 3, "Убрать сертификат из CRL (используется только в разностных CRL)." ) );
		_errorDescs.put( "01.00054.09", new ErrorDescription( "01.00054.09", 3, "Привилегия, подтверждаемая данным сертификатом, была отозвана." ) );
		_errorDescs.put( "01.00054.10", new ErrorDescription( "01.00054.10", 3, "Скомпрометирован центр, выпускающий атрибутные сертификаты." ) );
		_errorDescs.put( "01.00054.11", new ErrorDescription( "01.00054.11", 3, "Статус сертификата неизвестен." ) );
		_errorDescs.put( "01.00054.12", new ErrorDescription( "01.00054.12", 3, "Неизвестное значение статуса." ) );
				
		_errorDescs.put( "09.96669.99", new ErrorDescription( "09.96669.99", 1, "Общая  ошибка  обработки сообщения." ) );
		
		_certCheckErrors = new HashMap< Long, String >( );
		_certCheckErrors.put( ( long )0x50000001, CERT_TRUST_IS_NOT_TIME_VALID );
		_certCheckErrors.put( ( long )0x50000002, CERT_TRUST_IS_NOT_TIME_NESTED );
		_certCheckErrors.put( ( long )0x50000004, CERT_TRUST_IS_REVOKED );
		_certCheckErrors.put( ( long )0x50000008, CERT_TRUST_IS_NOT_SIGNATURE_VALID );
		_certCheckErrors.put( ( long )0x50000010, CERT_TRUST_IS_NOT_VALID_FOR_USAGE );
		_certCheckErrors.put( ( long )0x50000020, CERT_TRUST_IS_UNTRUSTED_ROOT );
		_certCheckErrors.put( ( long )0x50000040, CERT_TRUST_REVOCATION_STATUS_UNKNOWN );
		_certCheckErrors.put( ( long )0x50000080, CERT_TRUST_IS_CYCLIC );
		_certCheckErrors.put( ( long )0x50000100, CERT_TRUST_INVALID_EXTENSION );
		_certCheckErrors.put( ( long )0x50000200, CERT_TRUST_INVALID_POLICY_CONSTRAINTS );
		_certCheckErrors.put( ( long )0x50000400, CERT_TRUST_INVALID_BASIC_CONSTRAINTS );
		_certCheckErrors.put( ( long )0x50000800, CERT_TRUST_INVALID_NAME_CONSTRAINTS );
		_certCheckErrors.put( ( long )0x50001000, CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT );
		_certCheckErrors.put( ( long )0x50002000, CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT );
		_certCheckErrors.put( ( long )0x50004000, CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT );
		_certCheckErrors.put( ( long )0x50008000, CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT );
		_certCheckErrors.put( ( long )0x51000000, CERT_TRUST_IS_OFFLINE_REVOCATION );
		_certCheckErrors.put( ( long )0x52000000, CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY );
		_certCheckErrors.put( ( long )0x50010000, CERT_TRUST_IS_PARTIAL_CHAIN );
		_certCheckErrors.put( ( long )0x50020000, CERT_TRUST_CTL_IS_NOT_TIME_VALID );
		_certCheckErrors.put( ( long )0x50040000, CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID );
		_certCheckErrors.put( ( long )0x50080000, CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE );
		_certCheckErrors.put( ( long )0x53000001, CANT_CREATE_CERT_CHAIN_ENGINE );
		_certCheckErrors.put( ( long )0x53000002, CANT_GET_CERT_CHAIN );
		
		_certCheckServiceErrors = new HashMap< Long, String >( );
		_certCheckServiceErrors.put( ( long )0x21000001, CCSE_CANT_LOAD_LIB );
		_certCheckServiceErrors.put( ( long )0x21000002, CCSE_CANT_GET_OBJECT );
		_certCheckServiceErrors.put( ( long )0x22000001, CCSE_AUTHTYPE_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000002, CCSE_PROXY_AUTHTYPE_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000003, CCSE_ADDRESS_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000004, CCSE_ADITIONS_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000005, CCSE_SREQUEST_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000006, CCSE_NSREQUEST_DENAID );
		_certCheckServiceErrors.put( ( long )0x22000007, CCSE_TIME_NOTVALID );
		_certCheckServiceErrors.put( ( long )0x22000008, CCSE_SERVICE_ADDRESS_NOTVALID );
		_certCheckServiceErrors.put( ( long )0x22000009, CCSE_RESPONSE_NOTVALID );
		_certCheckServiceErrors.put( ( long )0x2200000A, CCSE_THEUPDATE_NOTVALID );
		_certCheckServiceErrors.put( ( long )0x2200000B, CCSE_NEXTUPDATE_LESS_THISUPDATE );
		_certCheckServiceErrors.put( ( long )0x22FFFFFF, CCSE_ANKNOWN_ERROR );
		
		_certNotValidReasons = new HashMap< Long, String >( );
		_certNotValidReasons.put( ( long )0x40000000, CR_UNKNOWN );
		_certNotValidReasons.put( ( long )0x40000001, CR_CERT_COMPROMATE );
		_certNotValidReasons.put( ( long )0x40000002, CR_ROOT_COMPROMATE );
		_certNotValidReasons.put( ( long )0x40000003, CR_CERTINFO_CHANGE );
		_certNotValidReasons.put( ( long )0x40000004, CR_CERT_CHANGE );
		_certNotValidReasons.put( ( long )0x40000005, CR_NOT_NEED );
		_certNotValidReasons.put( ( long )0x40000006, CR_CERT_PAUSED );
		_certNotValidReasons.put( ( long )0x40000008, CR_REMOVE_FROM_CRL );
		_certNotValidReasons.put( ( long )0x40000009, CR_CERT_PREV_RECALL );
		_certNotValidReasons.put( ( long )0x40000010, CR_ATRROOT_COMPROMATE );
		_certNotValidReasons.put( ( long )0xFFFFFFFF, CR_CERT_STATUS_UNKNOWN );
		_certNotValidReasons.put( ( long )0xFFFFFFFE, CR_CERT_STATUS_VALUE_UNKNOWN );
		
	}
	
	private static ErrorDescription getErrorDesc( String errorCode )
	{
		ErrorDescription desc = _errorDescs.get( errorCode );
		if ( null == desc )
			desc = new ErrorDescription( errorCode, 1, "FATAL ERROR." );
		
		return desc;
	}
	
	public static DocumentCheckResult createResult( String errorCode, String refDocumentId )
	{
		ErrorDescription desc = getErrorDesc( errorCode );
		
		return createResult( errorCode, desc.category, refDocumentId, desc.description );
	}
	
	public static DocumentCheckResult createResult( String errorCode, String refDocumentId, String validationError )
	{
		ErrorDescription desc = getErrorDesc( errorCode );

		return createResult(
			errorCode, desc.category, refDocumentId,
			String.format( "%s; %s", desc.description, validationError )
		);
	}
	
	public static DocumentCheckResult createResult( String errorCode, int errorCategory, String refDocumentId, String description )
	{
		DocumentCheckResult res = new DocumentCheckResult( );		
		res.setRefDocumentId( refDocumentId );
		
		List< ResultInformation > infos = new ArrayList< ResultInformation >( );
		res.setInformation( infos );
		
		ResultInformation info = new ResultInformation( );
		info.setCode( errorCode );
		info.setCategory( errorCategory );
		info.setDescription( splitDescription( description ) );
		info.setSource( SOURCE );
		infos.add( info );
		
		return res;
	}
	
    public static String parseCheckSignCryptoCode( int returnCode )
    {
        //проверяем находится ли код среди кодов ошибок проверки сертификата
    	for ( Long key : _certCheckErrors.keySet( ) )
    	{
    		long lkey = key.longValue( );
    		if ( returnCode == ( returnCode & lkey ) )
    		{
    			return _certCheckErrors.get( key );
    		}
    	}

    	for ( Long key : _certCheckServiceErrors.keySet( ) )
    	{
    		long lkey = key.longValue( );
    		if ( returnCode == ( returnCode & lkey ) )
    		{
    			return _certCheckServiceErrors.get( key );
    		}
    	}

    	for ( Long key : _certNotValidReasons.keySet( ) )
    	{
    		long lkey = key.longValue( );
    		if ( returnCode == ( returnCode & lkey ) )
    		{
    			return _certNotValidReasons.get( key );
    		}
    	}
    	
    	return CERTIFICATE_NOT_VALID;
    }	
	
	private static List< String > splitDescription( String description )
	{
		List< String > res = new ArrayList< String >( );
		
		String part = description;
		while ( part.length( ) > 0 )
		{
			if ( part.length( ) < DESCRIPTION_PART_LENGTH )
			{
				res.add( part );
				part = "";
			}
			else
			{
				res.add( part.substring( 0, DESCRIPTION_PART_LENGTH ) );
				part = part.substring( DESCRIPTION_PART_LENGTH );
			}
		}
		
		return res;
	}
	
	private static class ErrorDescription
	{
		@SuppressWarnings( "unused" )
		public String code;
		public int category;
		public String description;
		
		@SuppressWarnings( "unused" )
		public ErrorDescription( ) { }
		
		public ErrorDescription( String code, int category, String description )
		{
			this.code = code;
			this.category = category;
			this.description = description;
		}
	}	
}
