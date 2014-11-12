package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.BaseWarehouse;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

/**
 * Замена для BusinessProcessStorage который использует enum'ы для выбора бизнес-процессинга
 * нам enum'ы не подходят, кроме того, могут быть дополнительные условия
 */
public class BusinessProcessWarehouse extends BaseWarehouse< EDJobBatchContext, BusinessProcess, BusinessProcessSelector >
{
	// Empty
}
