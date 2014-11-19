package ru.acs.fts.eps2.ws.struct.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.ResultInformation;

public class ResultProcessor
{
	private static final int DESCRIPTION_PART_LENGTH = 250;
	private static final int SOURCE = 11;
	
	public static final String VALID_DOCUMENT = "00.00000.00";
	public static final String SIGNATURE_VALID = "00.00000.00";
	public static final String NOT_VALID_DOC = "01.00071.01";
	public static final String XMLNS_EMPTY = "01.00071.02";
	public static final String NOT_VALID_ALBUM_VERSION = "01.00071.03";
	public static final String SCHEMA_FILE_NOT_FOUND = "01.00071.04";
	public static final String FATAL = "09.96669.99";
		
	private static HashMap< String, ErrorDescription > _errorDescs;
	
	static
	{
		_errorDescs = new HashMap< String, ErrorDescription >( );
		
		_errorDescs.put( "00.00000.00", new ErrorDescription( "00.00000.00", 4, "Процедура успешно завершена. Документ соответствует схеме." ) );
		
		_errorDescs.put( "01.00071.01", new ErrorDescription( "01.00071.01", 3, "Документ не соответствует схеме." ) );
		_errorDescs.put( "01.00071.02", new ErrorDescription( "01.00071.02", 3, "Документ не соответствует схеме. Не задан атрибут xmlns документа." ) );
		_errorDescs.put( "01.00071.03", new ErrorDescription( "01.00071.03", 3, "Не указана или указана не поддерживаемая версия альбома форматов." ) );
		_errorDescs.put( "01.00071.04", new ErrorDescription( "01.00071.04", 3, "Документ отсутствует в альбоме форматов." ) );
		
		_errorDescs.put( "09.96669.99", new ErrorDescription( "09.96669.99", 1, "Общая  ошибка  обработки сообщения." ) );
		
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
