
package ru.acs.fts.schemas.album.drugpurpconfirmperm;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������������� �������� ���������� ������������� ������������� ������� ��������� �� �� � ��������������� ��� �������� ������������ ������ (����������) ��� ������ ��� �� � ������������ � ��������� ������ ������������� ������� � ������������ �������, ��������������� ��� �������� ������������ ������ (����������) ��� ������ ��� ��
 */
public class DrugPurpConfirmPermType extends BaseDocType
{
    private String purpose;
    private String sheetsCount;
    private String BDRDID;
    private CUOrganizationType applicantOrg;
    private PermissionType permission;
    private ItemDescriptionType itemDescription;
    private PersonSignatureType authorizedPerson;
    private CUCustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'Purpose' element value. ���� �����/������
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. ���� �����/������
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the 'SheetsCount' element value. ���������� ������ � ����������
     * 
     * @return value
     */
    public String getSheetsCount() {
        return sheetsCount;
    }

    /** 
     * Set the 'SheetsCount' element value. ���������� ������ � ����������
     * 
     * @param sheetsCount
     */
    public void setSheetsCount(String sheetsCount) {
        this.sheetsCount = sheetsCount;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'ApplicantOrg' element value. �����������-���������
     * 
     * @return value
     */
    public CUOrganizationType getApplicantOrg() {
        return applicantOrg;
    }

    /** 
     * Set the 'ApplicantOrg' element value. �����������-���������
     * 
     * @param applicantOrg
     */
    public void setApplicantOrg(CUOrganizationType applicantOrg) {
        this.applicantOrg = applicantOrg;
    }

    /** 
     * Get the 'Permission' element value. ����������
     * 
     * @return value
     */
    public PermissionType getPermission() {
        return permission;
    }

    /** 
     * Set the 'Permission' element value. ����������
     * 
     * @param permission
     */
    public void setPermission(PermissionType permission) {
        this.permission = permission;
    }

    /** 
     * Get the 'ItemDescription' element value. �������� �������������� ��������
     * 
     * @return value
     */
    public ItemDescriptionType getItemDescription() {
        return itemDescription;
    }

    /** 
     * Set the 'ItemDescription' element value. �������� �������������� ��������
     * 
     * @param itemDescription
     */
    public void setItemDescription(ItemDescriptionType itemDescription) {
        this.itemDescription = itemDescription;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. ����������� ����, ����������� ����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
