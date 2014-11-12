package ru.acs.fts.eps2.router.processing.checks;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.checks.ICheck;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class ContainerCheck implements ICheck // NO_UCD (used by CompoundChecksParser)
{
	private static final int DOC_COUNT_MUST_BE_EQ_OR_MORE_THAN_ONE = -2;
	private static final int DOC_COUNT_MUST_BE_EQ_ZERO_OR_ONE = -3;
	
	private Map< String, Integer > completeness;
	private Map< String, String > equivalence;
	
	@Required
	public void setCompleteness( Map< String, Integer > completeness ) { this.completeness = completeness; }
	public Map< String, Integer > getCompleteness( ) { return completeness; }
	
	@Required
	public void setEquivalence( Map< String, String > equivalence ) { this.equivalence = equivalence; }
	public Map< String, String > getEquivalence( ) { return equivalence; }

	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext ) 
		throws Exception
	{
		Object obj = envelope.getDocument( ).getNakedDocument( );
		
		if ( null == obj || ! ( obj instanceof EDContainerType ) )
			return false;
		
		EDContainerType container = ( EDContainerType )obj;
		
		Map< String, Integer > docCount = new HashMap< String, Integer >( );
		
		for ( ContainerDocType cdoc : container.getContainerDocList( ) )
		{
			Object innerDoc = cdoc.getDocBody( ).getAny( );
			if ( null == innerDoc )
				continue;
			
			if ( innerDoc instanceof SignatureType )
			{
				SignatureType sig = ( SignatureType )innerDoc;
				innerDoc = sig.getObject( ).getAny( );
			}

			try
			{
				Class<?> clz = innerDoc.getClass( );
				Method mGet = clz.getMethod( "getDocumentModeID", ( Class<?>[ ] )null );
				if ( null != mGet )
				{
					String documentModeId = mGet.invoke( innerDoc, ( Object[ ] )null ).toString( );
					if ( null != documentModeId )
					{
						Integer cnt = docCount.get( documentModeId );
						if ( null == cnt ) cnt = 0;
						cnt++;
						docCount.put( documentModeId, cnt );
					}
				}
			}
			catch ( Exception exc )
			{
				
			}
		}
		
		boolean satisfied = true;
		
		// Проверяем наличие нужных документов
		for ( String docModeId : completeness.keySet( ) )
		{
			Integer reqCountObj = completeness.get( docModeId );
			Integer resCountObj = docCount.get( docModeId );
			int reqCount = ( null != reqCountObj ) ? reqCountObj.intValue( ) : 0;
			int resCount = ( null != resCountObj ) ? resCountObj.intValue( ) : 0;
			if ( reqCount > 0 )
			{
				if ( reqCount != resCount )
				{
					satisfied = false;
					break;
				}
			}
			else if ( 0 == reqCount )
			{
				if ( resCount > 0 )
				{
					satisfied = false;
					break;
				}
			} else 
			{
				// здесь проверять особые требования к количеству документов 
				if ( DOC_COUNT_MUST_BE_EQ_OR_MORE_THAN_ONE == reqCount) 
				{
					// кол-во документов должно быть либо один либо больше
					if ( resCount < 1 )
					{
						satisfied = false;
						break;
					}
				}
				if ( DOC_COUNT_MUST_BE_EQ_ZERO_OR_ONE == reqCount) 
				{
					// кол-во документов должно быть либо ноль либо один
					if ( resCount != 0 && resCount != 1)
					{
						satisfied = false;
						break;
					}
				}
			}
		}
		
		// Проверяем равенство документов
		for ( String tagDocModeId : equivalence.keySet( ) )
		{
			String tagValue = equivalence.get( tagDocModeId );
			String[ ] valueDocModeIds = tagValue.split( "\\+" );
			Integer valueCount = 0;
			for ( String valueDocModeId : valueDocModeIds )
			{
				valueDocModeId = valueDocModeId.replaceAll( "id", "" );
				Integer tmp = docCount.get( valueDocModeId );
				if ( null == tmp )
					tmp = 0;

				valueCount += tmp;
			} // посчитали общее кол-во документов описанных между тегами

			Integer tagCount = docCount.get( tagDocModeId );
			if ( null == tagCount )
				tagCount = 0;
			
			if ( valueCount.compareTo( tagCount ) != 0 )
			{
				satisfied = false;
				break;
			}
		}
		
		// Проверяем отсутствие лишних документов
		for ( String docModeId : completeness.keySet( ) )
		{
			docCount.remove( docModeId );
		}
		if ( docCount.keySet( ).size( ) > 0 )
		{
			satisfied = false;
		}
		
		return satisfied;
	}

}
