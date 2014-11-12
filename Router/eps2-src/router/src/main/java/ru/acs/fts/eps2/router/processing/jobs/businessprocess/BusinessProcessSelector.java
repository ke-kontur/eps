package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.selectors.EDSelectorCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * Содержит в себе бизнес процесс и условия его отдачи. При вызове метода select проверяет условие
 * и если оно выполняется, отдает свой бизнес процесс. В противном случае возвращает null
 */
public class BusinessProcessSelector extends BaseSelector< BusinessProcess, EDJobBatchContext > // NO_UCD (use default)
{
	private EDSelectorCondition condition;
	private BusinessProcess businessProcess;
	
	@Required
	public void setCondition( EDSelectorCondition condition ) { this.condition = condition; }
	public EDSelectorCondition getCondition( ) { return condition; }
	
	@Required
	public void setBusinessProcess( BusinessProcess businessProcess ) { this.businessProcess = businessProcess; }
	public BusinessProcess getBusinessProcess( ) { return businessProcess; }
	
	/**
	 * Проверяет свое условие, и если оно выполняется возвращает хранимый бизнес процесс.
	 * Иначе возвращает null
	 * 
	 * @param jobBatchContext контекст пакета задач для проверки условия
	 * @return бизнес процесс если условие выполняется, null - в противном случае
	 * @throws Exception 
	 */
	public BusinessProcess select( EDJobBatchContext jobBatchContext ) // NO_UCD (use default)
		throws BaseProcessingException, DatabaseException
	{
		if ( null != condition && condition.check( jobBatchContext ) )
			return businessProcess;
		
		return null;
	}
}
