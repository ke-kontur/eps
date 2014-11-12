package ru.acs.fts.eps2.engine.processing.checks;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;

public class ChecksBlockClause // NO_UCD (use default)
{
	public static final String CLAUSE_OR = "OR"; // NO_UCD (use default)
	public static final String CLAUSE_AND = "AND"; // NO_UCD (use default)
	
	private String clause; // OR | AND
	private Boolean negation; // true | false = null
	private ICheck check;
	
	@Required
	public void setClause( String clause ) { this.clause = clause; }
	public String getClause( ) { return clause; }
	
	public void setNegation( Boolean negation ) { this.negation = negation; }
	public Boolean getNegation( ) { return negation; }
	
	@Required
	public void setCheck( ICheck check ) { this.check = check; }
	public ICheck getCheck( ) { return check; }

	public boolean evaluate( Envelope envelope, JobBatchContext jobBatchContext ) // NO_UCD (use default)
		throws Exception
	{
		boolean res = false;
		
		if ( null != check )
			res = check.check( envelope, jobBatchContext );
		
		if ( null != negation && negation.booleanValue( ) )
			res = ! res;
		
		return res;
	}
}
