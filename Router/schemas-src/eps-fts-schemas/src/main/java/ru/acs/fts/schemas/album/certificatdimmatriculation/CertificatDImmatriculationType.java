
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������������� � ����������� ������������� ��������
 */
public class CertificatDImmatriculationType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private String PTSNumber;
    private RegistrationType registration;
    private UnRegistrationType unRegistration;
    private CDITransportMeansType CDITransportMeans;
    private CDIAutomobileownerType CDIAutomobileowner;
    private String documentModeID;

    /** 
     * Get the list of 'Comment' element items. ������ �������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. ������ �������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'PTSNumber' element value. ��������������� ����� �������� ��
     * 
     * @return value
     */
    public String getPTSNumber() {
        return PTSNumber;
    }

    /** 
     * Set the 'PTSNumber' element value. ��������������� ����� �������� ��
     * 
     * @param PTSNumber
     */
    public void setPTSNumber(String PTSNumber) {
        this.PTSNumber = PTSNumber;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ �������������
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ �������������
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'UnRegistration' element value. ������ � ������ � ����� ��
     * 
     * @return value
     */
    public UnRegistrationType getUnRegistration() {
        return unRegistration;
    }

    /** 
     * Set the 'UnRegistration' element value. ������ � ������ � ����� ��
     * 
     * @param unRegistration
     */
    public void setUnRegistration(UnRegistrationType unRegistration) {
        this.unRegistration = unRegistration;
    }

    /** 
     * Get the 'CDITransportMeans' element value. �������� � ������������ �������� 
     * 
     * @return value
     */
    public CDITransportMeansType getCDITransportMeans() {
        return CDITransportMeans;
    }

    /** 
     * Set the 'CDITransportMeans' element value. �������� � ������������ �������� 
     * 
     * @param CDITransportMeans
     */
    public void setCDITransportMeans(CDITransportMeansType CDITransportMeans) {
        this.CDITransportMeans = CDITransportMeans;
    }

    /** 
     * Get the 'CDIAutomobileowner' element value. �������� � ������������ ������������� ��������
     * 
     * @return value
     */
    public CDIAutomobileownerType getCDIAutomobileowner() {
        return CDIAutomobileowner;
    }

    /** 
     * Set the 'CDIAutomobileowner' element value. �������� � ������������ ������������� ��������
     * 
     * @param CDIAutomobileowner
     */
    public void setCDIAutomobileowner(CDIAutomobileownerType CDIAutomobileowner) {
        this.CDIAutomobileowner = CDIAutomobileowner;
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
