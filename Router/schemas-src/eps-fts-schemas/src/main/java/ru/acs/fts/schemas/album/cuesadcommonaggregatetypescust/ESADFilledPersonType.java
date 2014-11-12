
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о лице, заполнившем декларацию
 */
public class ESADFilledPersonType extends PersonBaseType
{
    private String qualificationCertificate;
    private AuthoritesDocumentType authoritesDocument;
    private IdentityCardType identityCard;
    private ContactType contact;

    /** 
     * Get the 'QualificationCertificate' element value. Номер квалификационного аттестата специалиста по таможенному оформлению. Для РБ
     * 
     * @return value
     */
    public String getQualificationCertificate() {
        return qualificationCertificate;
    }

    /** 
     * Set the 'QualificationCertificate' element value. Номер квалификационного аттестата специалиста по таможенному оформлению. Для РБ
     * 
     * @param qualificationCertificate
     */
    public void setQualificationCertificate(String qualificationCertificate) {
        this.qualificationCertificate = qualificationCertificate;
    }

    /** 
     * Get the 'AuthoritesDocument' element value. Сведения о документе, удостоверяющем полномочия, о доверенности на совершение действий
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. Сведения о документе, удостоверяющем полномочия, о доверенности на совершение действий
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Contact' element value. Контактная информация
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. Контактная информация
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
