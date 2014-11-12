package ru.acs.fts.eps2.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionHelper
{
	private ReflectionHelper( ) { }
	
	/**
	 * <b>ATTENTION!</b> Статические методы не достать!
	 * @param obj
	 * @param name
	 * @param paramsCount
	 * @return
	 */
	public static Method getMethodByName( Object obj, String name, int paramsCount )
	{
		Class< ? > clz = obj.getClass( );
		for ( Method m : clz.getMethods( ) )
		{
			if ( m.getName( ).equals( name ) && m.getParameterTypes( ).length == paramsCount
					&& !Modifier.isStatic( m.getModifiers( ) ) )
				return m;
		}

		return null;
	}
}
