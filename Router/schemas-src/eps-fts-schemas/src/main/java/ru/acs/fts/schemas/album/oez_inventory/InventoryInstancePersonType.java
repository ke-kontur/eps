
package ru.acs.fts.schemas.album.oez_inventory;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * —ведени€ о лице, подающем опись.
 */
public class InventoryInstancePersonType extends PersonBaseType
{
    private IdentityCardType identityCard;
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

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
