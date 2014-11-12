
package ru.acs.fts.schemas.album.regconfirmdocrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������ �������� �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ����/� ��������������� �������������� �� ������� ������������ ����������, �������� ����������������/� ������� �������� �� ����� ������������� ��������� ������������/�� ���������������� ������� ������������ ���� ������������� ������� ��/� ����������� ������������� �������/� ������� ���������� ��� ��������/�� ������� ������������� � ���������� ��������� �������� ������
 */
public class RegConfirmDocRequestType extends BaseDocType
{
    private String docSign;
    private String applicationSourceSystemID;
    private String applicationID;
    private OrganizationType organization;
    private ObjectDescriptionType objectDescription;
    private DocumentBaseType documentDetails;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������ ��������: 1 - �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ����; 2 - � ��������������� �������������� �� ������� ������������ ����������, �������� ����������������; 3 - � ������� �������� �� ����� ������������� ��������� ������������; 4 - �� ���������������� ������� ������������ ���� ������������� ������� ��; 5 - � ����������� ������������� �������; 6 - � ������� ���������� ��� ��������; 7 - �� ������� ������������� � �� �������� ������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������ ��������: 1 - �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ����; 2 - � ��������������� �������������� �� ������� ������������ ����������, �������� ����������������; 3 - � ������� �������� �� ����� ������������� ��������� ������������; 4 - �� ���������������� ������� ������������ ���� ������������� ������� ��; 5 - � ����������� ������������� �������; 6 - � ������� ���������� ��� ��������; 7 - �� ������� ������������� � �� �������� ������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'ObjectDescription' element value. �������� ������������/������/�������
     * 
     * @return value
     */
    public ObjectDescriptionType getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. �������� ������������/������/�������
     * 
     * @param objectDescription
     */
    public void setObjectDescription(ObjectDescriptionType objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'DocumentDetails' element value. �������� � ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. �������� � ���������
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentBaseType documentDetails) {
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
