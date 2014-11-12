
package ru.acs.fts.schemas.album.exchangecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Декларант, представитель декларанта.
 */
public class DeclPersonType extends PersonBaseType
{
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'AuthoritesDocument' element value. Документ, подтверждающий полномочия. 
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. Документ, подтверждающий полномочия. 
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
