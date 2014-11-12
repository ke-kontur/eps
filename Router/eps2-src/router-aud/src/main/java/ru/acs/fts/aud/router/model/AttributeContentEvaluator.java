package ru.acs.fts.aud.router.model;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import ru.acs.fts.aud.model.entities.AttributeContent;
import ru.acs.fts.aud.router.processing.definitions.AttributeTypes;
import ru.acs.fts.eps2.util.time.TimeUtil;

public class AttributeContentEvaluator
{
	private static Map< String, IValueType > _valueTypes;
	
	static
	{
		_valueTypes = new HashMap< String, IValueType >( );
		_valueTypes.put( AttributeTypes.STRING, new StringValueType( ) );
		_valueTypes.put( AttributeTypes.INTEGER, new IntegerValueType( ) );
		_valueTypes.put( AttributeTypes.REAL, new DoubleValueType( ) );
		_valueTypes.put( AttributeTypes.DATETIME, new DateTimeValueType( ) );
		_valueTypes.put( AttributeTypes.DATE, new DateValueType( ) );
		_valueTypes.put( AttributeTypes.TIME, new TimeValueType( ) );
		_valueTypes.put( AttributeTypes.BOOLEAN, new BooleanValueType( ) );
	}
	
	public static void evaluate( AttributeContent attributeContent, Object value )
	{
		if ( null != attributeContent )
		{
			String type = attributeContent.getAttributeVersion( ).getAttribute( ).getType( ).toLowerCase( );
			IValueType valueType = _valueTypes.get( type );
			if ( null != valueType )
				valueType.setValue( attributeContent, value );
		}
	}
	
	private static interface IValueType
	{
		void setValue( AttributeContent content, Object value );
	}
	
	private static class StringValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			content.setValueString( ( String ) value );
		}
	}
	
	private static class IntegerValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value ) 
		{
			if ( value instanceof String )
				content.setValueInteger( Integer.valueOf( ( String ) value ) );
			else
				content.setValueInteger( ( Integer ) value );
		}
	}
	
	private static class DoubleValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			if ( value instanceof String )
				content.setValueDouble( Double.valueOf( ( String ) value ) );
			else
				content.setValueDouble( ( Double ) value );
		}
	}
	
	private static class DateTimeValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			content.setValueDateTime( TimeUtil.convertToTimestamp( new DateTime( value ) ) );
		}
	}
	
	private static class DateValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			content.setValueDate( TimeUtil.convertToSqlDate( new LocalDate( value ) ) );
		}
	}
	
	private static class TimeValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			content.setValueTime( TimeUtil.convertToTimestamp( new LocalTime( value ) ) );
		}
	}
	
	private static class BooleanValueType implements IValueType
	{
		@Override
		public void setValue( AttributeContent content, Object value )
		{
			Boolean bValue = value instanceof String ? Boolean.valueOf( ( String ) value ) : ( Boolean ) value;
			content.setValueBoolean( ( short ) ( null != bValue && bValue.booleanValue( ) ? 1 : 0 ) );
		}
	}
}
