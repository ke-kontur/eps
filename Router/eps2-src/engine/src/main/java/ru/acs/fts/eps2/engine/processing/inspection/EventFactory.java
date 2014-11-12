package ru.acs.fts.eps2.engine.processing.inspection;

import org.slf4j.Logger;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;

public interface EventFactory
{
	void log( JobBatchContext jobBatchContext, int category, String info, int code, Logger log );
}
