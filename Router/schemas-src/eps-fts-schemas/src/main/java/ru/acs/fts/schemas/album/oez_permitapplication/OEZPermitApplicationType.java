
package ru.acs.fts.schemas.album.oez_permitapplication;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� �� ��������� ���������� �� ����/����� ������� �� (�) ���������� (��) ����
 */
public class OEZPermitApplicationType extends BaseDocType
{
    private String applicationDetails;
    private LocalDate planDate;
    private CUOrganizationType applicant;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'ApplicationDetails' element value. ��������, ������������ � ��������� �� ����� ����������
     * 
     * @return value
     */
    public String getApplicationDetails() {
        return applicationDetails;
    }

    /** 
     * Set the 'ApplicationDetails' element value. ��������, ������������ � ��������� �� ����� ����������
     * 
     * @param applicationDetails
     */
    public void setApplicationDetails(String applicationDetails) {
        this.applicationDetails = applicationDetails;
    }

    /** 
     * Get the 'PlanDate' element value. ����������� ���� �����/������ �������
     * 
     * @return value
     */
    public LocalDate getPlanDate() {
        return planDate;
    }

    /** 
     * Set the 'PlanDate' element value. ����������� ���� �����/������ �������
     * 
     * @param planDate
     */
    public void setPlanDate(LocalDate planDate) {
        this.planDate = planDate;
    }

    /** 
     * Get the 'Applicant' element value. ��������� (�������� ���� ���� ����, ����������� �� ��� ���������)
     * 
     * @return value
     */
    public CUOrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. ��������� (�������� ���� ���� ����, ����������� �� ��� ���������)
     * 
     * @param applicant
     */
    public void setApplicant(CUOrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
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
