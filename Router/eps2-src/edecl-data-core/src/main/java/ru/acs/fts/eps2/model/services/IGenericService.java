package ru.acs.fts.eps2.model.services;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

@SuppressWarnings( "deprecation" )
public interface IGenericService // NO_UCD (use default)
{
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate );
	public JpaTemplate getJpaTemplate( );
}
