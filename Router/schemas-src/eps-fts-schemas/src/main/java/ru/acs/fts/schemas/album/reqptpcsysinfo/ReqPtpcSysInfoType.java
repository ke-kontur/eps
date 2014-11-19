
package ru.acs.fts.schemas.album.reqptpcsysinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * ������ �� �������������� ��������������� �������� �� �������������� ������� ��������� ���
 */
public class ReqPtpcSysInfoType extends BaseDocType
{
    private String certificateNumber;
    private RFOrganizationFeaturesType organizationFeatures;
    private String documentModeID;

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'OrganizationFeatures' element value. �������� �� �����������.
     * 
     * @return value
     */
    public RFOrganizationFeaturesType getOrganizationFeatures() {
        return organizationFeatures;
    }

    /** 
     * Set the 'OrganizationFeatures' element value. �������� �� �����������.
     * 
     * @param organizationFeatures
     */
    public void setOrganizationFeatures(
            RFOrganizationFeaturesType organizationFeatures) {
        this.organizationFeatures = organizationFeatures;
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
