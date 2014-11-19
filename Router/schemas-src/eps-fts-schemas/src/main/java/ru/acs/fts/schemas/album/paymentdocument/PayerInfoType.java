
package ru.acs.fts.schemas.album.paymentdocument;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * �������� � �����������
 */
public class PayerInfoType
{
    private String organizationName;
    private String classification;
    private String residenceStatus;
    private String ITN;
    private String OGRNID;
    private IdentityCardType identityCard;
    private AccountType account;

    /** 
     * Get the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Classification' element value. ������������� �����������/��� �������� �����: "1" - "����������� ����"; "2" - "���������� ����"; "3" - "���������� �������������". 
     * 
     * @return value
     */
    public String getClassification() {
        return classification;
    }

    /** 
     * Set the 'Classification' element value. ������������� �����������/��� �������� �����: "1" - "����������� ����"; "2" - "���������� ����"; "3" - "���������� �������������". 
     * 
     * @param classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /** 
     * Get the 'ResidenceStatus' element value. ������ �����������: "true" - ��������; "false" - ����������.
     * 
     * @return value
     */
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /** 
     * Set the 'ResidenceStatus' element value. ������ �����������: "true" - ��������; "false" - ����������.
     * 
     * @param residenceStatus
     */
    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    /** 
     * Get the 'ITN' element value. ��� �����������
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ��� �����������
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'OGRNID' element value. ����/������ �����������
     * 
     * @return value
     */
    public String getOGRNID() {
        return OGRNID;
    }

    /** 
     * Set the 'OGRNID' element value. ����/������ �����������
     * 
     * @param OGRNID
     */
    public void setOGRNID(String OGRNID) {
        this.OGRNID = OGRNID;
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
     * Get the 'Account' element value. ����� �������� ����� �����������
     * 
     * @return value
     */
    public AccountType getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. ����� �������� ����� �����������
     * 
     * @param account
     */
    public void setAccount(AccountType account) {
        this.account = account;
    }
}
