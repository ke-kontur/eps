
package ru.acs.fts.schemas.album.participantsysinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * ���������� �� ������� ������ ��������� ���
 */
public class ParticipantSysInfoType extends BaseDocType
{
    private String participantID;
    private String organizationName;
    private String participantName;
    private String SVHName;
    private String certificateNumber;
    private RFOrganizationFeaturesType organizationFeatures;
    private String documentModeID;

    /** 
     * Get the 'ParticipantID' element value. ������������� ���������
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. ������������� ���������
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ParticipantName' element value. ������������ ����� �����������
     * 
     * @return value
     */
    public String getParticipantName() {
        return participantName;
    }

    /** 
     * Set the 'ParticipantName' element value. ������������ ����� �����������
     * 
     * @param participantName
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /** 
     * Get the 'SVHName' element value. ������������ ���
     * 
     * @return value
     */
    public String getSVHName() {
        return SVHName;
    }

    /** 
     * Set the 'SVHName' element value. ������������ ���
     * 
     * @param SVHName
     */
    public void setSVHName(String SVHName) {
        this.SVHName = SVHName;
    }

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
