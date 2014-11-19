package ru.acs.fts.eps2.util.jndi;

import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class JNDIProperty implements Referenceable // NO_UCD (use default)
{ 
	private String value; 

	public JNDIProperty( )
	{
	}

	public JNDIProperty( String value ) // NO_UCD (use default)
	{ 
		this.value = value;
	}

	public static final String ADDR_TYPE = "property"; // NO_UCD (use default)

	@Override
	public Reference getReference( ) throws NamingException
	{
		return new Reference( 
			this.getClass( ).getName( ), 
			new StringRefAddr( ADDR_TYPE, value ),
			JNDIPropertyFactory.class.getName( ), 
			null 
		);
	}

	public String getValue( )
	{
		return value;
	}
	
	public static JNDIProperty fromReference( Reference ref )
	{
		if ( ref.getClassName( ).equals( JNDIProperty.class.getName( ) ) )
		{
			RefAddr refProperty = ref.get( ADDR_TYPE );
			
			if ( null != refProperty )
			{
				JNDIProperty prop = new JNDIProperty( refProperty.getContent( ).toString( ) );
				return prop;
			}
		}

		return null;
	}
	
	public static JNDIProperty fromReference( JNDIProperty property )
	{
		return property;
	}
	
}
