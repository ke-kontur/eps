package ru.acs.fts.eps2.engine.processing;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * Замена JobBatchStorage предыдущего поколения. В отличии от JobBatchStorage предыдущего 
 * поколения использует механизм селекторов, вместо JobBatchDescriptor'ов. 
 */
public class BaseWarehouse< T extends JobBatchContext, D, S extends BaseSelector< D, T > >
{
	private List< S > selectors;
	
	// @formatter:off
	@Required
	public void setSelectors( List< S > jobBatchSelectors ) { this.selectors = jobBatchSelectors; }
	public List< S > getSelectors( ) { return selectors; }
	// @formatter:on

	/**
	 * Получает JobBatch согласно своему списку селекторов. 
	 * 
	 * @param jobBatchContext контекст для которого может быть есть JobBatch
	 * @return JobBatch для переданного контекста, если он есть. Если нет подходящего - null
	 * @throws Exception 
	 */
	public D getSelected( T jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		for ( S selector : selectors )
		{
			D selected = selector.select( jobBatchContext );
			if ( null != selected )
				return selected;
		}

		return null;
	}
}
