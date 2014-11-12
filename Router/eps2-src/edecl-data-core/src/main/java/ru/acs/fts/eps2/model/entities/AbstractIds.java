/**
 * 
 */
package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Создаете свой класс - уникальный идентификатор с требуемыми полями и
 * сеттерами/геттерами наследуетесь от этого абстрактного класса и используете.
 * 
 * ATTENTION!!! Имя геттера должно быть строго равно get + имя переменной, у
 * которой первая буква прописная. Иногда генератор сеттеров/геттеров не всегда
 * так создает имена методов, например для bDate создаст getbDate, когда
 * ожидаемо getBDate
 * 
 * @author mns
 * 
 * @since 5.0.12/3.0.9
 * @created 18.06.2013
 */
public abstract class AbstractIds implements Serializable // NO_UCD (use default)
{

	private static final long serialVersionUID = 9221190594057549062L;

	private static String upperFirstLetter( String s )
	{
		if ( s != null && s.length( ) > 0 )
		{
			return s.substring( 0, 1 ).toUpperCase( ) + s.substring( 1 );
		}
		return s;
	}

	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;

		if ( obj == this )
			return true;

		if ( obj.getClass( ) != getClass( ) )
			return false;

		EqualsBuilder equalsBuilder = new EqualsBuilder( );

		Field[ ] fields = this.getClass( ).getDeclaredFields( );
		Method[ ] methods = this.getClass( ).getMethods( );

		for ( Field field : fields )
		{
			if ( "serialVersionUID".equalsIgnoreCase( field.getName( ) ) )
				continue;

			Method method = null;
			for ( Method m : methods )
			{
				if ( m.getName( ).equalsIgnoreCase(
						"get" + upperFirstLetter( field.getName( ) ) ) )
				{
					method = m;
					break;
				}
			}
			equalsBuilder.append( field, method );
		}

		return equalsBuilder.isEquals( );
	}

	public int hashCode( )
	{

		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder( 17, 31 );

		Field[ ] fields = this.getClass( ).getDeclaredFields( );
		for ( Field field : fields )
		{
			if ( "serialVersionUID".equalsIgnoreCase( field.getName( ) ) )
				continue;

			hashCodeBuilder.append( field );
		}

		return hashCodeBuilder.toHashCode( );
	}
}
