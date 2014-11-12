
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ����, ����������� ����������
 */
public class ESADFilledPersonType extends PersonBaseType
{
    private String qualificationCertificate;
    private AuthoritesDocumentType authoritesDocument;
    private IdentityCardType identityCard;
    private ContactType contact;

    /** 
     * Get the 'QualificationCertificate' element value. ����� ����������������� ��������� ����������� �� ����������� ����������. ��� ��
     * 
     * @return value
     */
    public String getQualificationCertificate() {
        return qualificationCertificate;
    }

    /** 
     * Set the 'QualificationCertificate' element value. ����� ����������������� ��������� ����������� �� ����������� ����������. ��� ��
     * 
     * @param qualificationCertificate
     */
    public void setQualificationCertificate(String qualificationCertificate) {
        this.qualificationCertificate = qualificationCertificate;
    }

    /** 
     * Get the 'AuthoritesDocument' element value. �������� � ���������, �������������� ����������, � ������������ �� ���������� ��������
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. �������� � ���������, �������������� ����������, � ������������ �� ���������� ��������
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Contact' element value. ���������� ����������
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. ���������� ����������
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
