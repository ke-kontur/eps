package ru.acs.fts.aud.model.persistence.cached;

import ru.acs.fts.aud.model.entities.BusinessDocumentKind;

/*
 * XXX Данный класс нигде не используется, но может пригодиться
 */
public class BusinessDocumentKindService extends AbstractCachedService< BusinessDocumentKind >
{
	@Override
	public Class< BusinessDocumentKind > getEntityClass( )
	{
		return BusinessDocumentKind.class;
	}
}
