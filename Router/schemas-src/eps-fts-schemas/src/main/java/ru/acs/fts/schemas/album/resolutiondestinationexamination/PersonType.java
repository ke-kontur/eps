
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения о физ. лице
 */
public class PersonType extends PersonSignatureType
{
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'AuthoritesDocument' element value. Сведения о документе, удостоверяющем полномочия.
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. Сведения о документе, удостоверяющем полномочия.
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
