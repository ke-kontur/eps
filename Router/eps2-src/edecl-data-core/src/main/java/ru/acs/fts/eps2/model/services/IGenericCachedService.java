package ru.acs.fts.eps2.model.services;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

@SuppressWarnings( "deprecation" )
interface IGenericCachedService
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
