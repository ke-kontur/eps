package ru.acs.fts.eps2.engine.processing;

import ru.acs.fts.eps2.engine.objects.GeneralPurposeContext;

import java.util.Map;

public class JobContext extends GeneralPurposeContext
{
	public JobContext( )
	{
	}

	public JobContext( Map< String, Object > context )
	{
		_context = context;
	}
}
