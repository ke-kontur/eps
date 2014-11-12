package ru.acs.fts.eps2.engine.processing.checks;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;

public class ChecksBlock implements ICheck // NO_UCD (use default)
{
	private List< ChecksBlockClause > checks;
	
	@Required
	public void setChecks( List< ChecksBlockClause > checks ) { this.checks = checks; }
	public List< ChecksBlockClause > getChecks( ) { return checks; }
	
	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext )
		throws Exception
	{
		boolean satisfied = false;
		
		for ( int i = 0; i < checks.size( ); ++i )
		{
			ChecksBlockClause clause = checks.get( i );
			boolean op = clause.evaluate( envelope, jobBatchContext );
			
			if ( i == 0 )
				satisfied = op;
			else
			{
				String cl = clause.getClause( );
				if ( cl.equalsIgnoreCase( ChecksBlockClause.CLAUSE_OR ) )
					satisfied = satisfied || op;
				else if ( cl.equalsIgnoreCase( ChecksBlockClause.CLAUSE_AND ) )
					satisfied = satisfied && op;
				else
					throw new UnsupportedOperationException( String.format(
						"Не поддерживаемая логическая операция %s", cl
					) );
			}
		}
		
		return satisfied;
	}
}
