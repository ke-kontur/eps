
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * —ведени€ о физ. лице
 */
public class PersonType extends PersonSignatureType
{
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'AuthoritesDocument' element value. —ведени€ о документе, удостовер€ющем полномочи€.
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. —ведени€ о документе, удостовер€ющем полномочи€.
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
