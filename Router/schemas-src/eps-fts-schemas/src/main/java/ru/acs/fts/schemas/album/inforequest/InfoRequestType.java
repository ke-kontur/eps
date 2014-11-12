
package ru.acs.fts.schemas.album.inforequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������ �������� �� ������������� ������� � ������������� ������������� ������������� ���������/�� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������/� ��. ����/� ������� ��������� � ����������� ��. ����/�� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������/�� ������� ������������ �� ����� ������ ���������� ��������� � ���������� ��/�� �������� �� ������������ � ������ ����������� �������
 */
public class InfoRequestType extends BaseDocType
{
    private String docSign;
    private String additionalInfo;
    private String applicationSourceSystemID;
    private String applicationID;
    private OrganizationType organization;
    private CUOrganizationType requestOrg;
    private PersonSignatureType requestPerson;
    private DocumentDetailsType documentDetails;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������ ��������: 1 - �� ������������� ������� � ������������� ������������� ������������� ���������; 2 - �� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������; 3 - � ��. ����; 4 - � ������� ��������� � ����������� ��. ����; 5 - �� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������; 6 - �� ������� ������������ �� ����� ������ ���������� ��������� � ���������� ��; 7 - �� �������� �� ������������ � ������ ����������� �������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������ ��������: 1 - �� ������������� ������� � ������������� ������������� ������������� ���������; 2 - �� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������; 3 - � ��. ����; 4 - � ������� ��������� � ����������� ��. ����; 5 - �� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������; 6 - �� ������� ������������ �� ����� ������ ���������� ��������� � ���������� ��; 7 - �� �������� �� ������������ � ������ ����������� �������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ApplicationSourceSystemID' element value. ������������� ��������� �� ����
     * 
     * @return value
     */
    public String getApplicationSourceSystemID() {
        return applicationSourceSystemID;
    }

    /** 
     * Set the 'ApplicationSourceSystemID' element value. ������������� ��������� �� ����
     * 
     * @param applicationSourceSystemID
     */
    public void setApplicationSourceSystemID(String applicationSourceSystemID) {
        this.applicationSourceSystemID = applicationSourceSystemID;
    }

    /** 
     * Get the 'ApplicationID' element value. ������������� ������ � ��� "����������� ���������-2"
     * 
     * @return value
     */
    public String getApplicationID() {
        return applicationID;
    }

    /** 
     * Set the 'ApplicationID' element value. ������������� ������ � ��� "����������� ���������-2"
     * 
     * @param applicationID
     */
    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /** 
     * Get the 'Organization' element value. �������� �� �����������/���. ���� (��. ����/��)
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� �����������/���. ���� (��. ����/��)
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'RequestOrg' element value. �������� �� �����������, �������������� ������
     * 
     * @return value
     */
    public CUOrganizationType getRequestOrg() {
        return requestOrg;
    }

    /** 
     * Set the 'RequestOrg' element value. �������� �� �����������, �������������� ������
     * 
     * @param requestOrg
     */
    public void setRequestOrg(CUOrganizationType requestOrg) {
        this.requestOrg = requestOrg;
    }

    /** 
     * Get the 'RequestPerson' element value. ��� ����, ������������ ������
     * 
     * @return value
     */
    public PersonSignatureType getRequestPerson() {
        return requestPerson;
    }

    /** 
     * Set the 'RequestPerson' element value. ��� ����, ������������ ������
     * 
     * @param requestPerson
     */
    public void setRequestPerson(PersonSignatureType requestPerson) {
        this.requestPerson = requestPerson;
    }

    /** 
     * Get the 'DocumentDetails' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentDetailsType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. ��������� ���������
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentDetailsType documentDetails) {
        this.documentDetails = documentDetails;
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
