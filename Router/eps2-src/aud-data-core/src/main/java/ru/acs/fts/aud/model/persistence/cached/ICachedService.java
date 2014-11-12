package ru.acs.fts.aud.model.persistence.cached;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

/**
 * Код бережно позаимствован из EPS2JAVA
 */
@SuppressWarnings( "deprecation" )
public interface ICachedService // NO_UCD (use default)
{
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate );
	
	/**
	 * @param updateTimeoutDays допустимое время жизни кэшируемого объекта 
	 * 		  без обновления. Указывается в <b>днях</b>
	 */
	@Required
	public void setUpdateTimeout( int updateTimeoutDays );
}
