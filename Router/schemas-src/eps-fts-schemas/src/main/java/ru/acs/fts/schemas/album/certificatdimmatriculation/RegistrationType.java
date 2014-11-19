
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import org.joda.time.LocalDate;

/** 
 * ��������������� ������ ������������� ��
 */
public class RegistrationType
{
    private String regionCode;
    private String seriesCode;
    private String documentNumber;
    private LocalDate issueDate;
    private String GAIName;

    /** 
     * Get the 'RegionCode' element value. ��� �������
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. ��� �������
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /** 
     * Get the 'SeriesCode' element value. ����� �������������
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' element value. ����� �������������
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� �������������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� �������������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ �������������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ �������������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'GAIName' element value. ������������ ���, ��������� ������������� � ����������� ��
     * 
     * @return value
     */
    public String getGAIName() {
        return GAIName;
    }

    /** 
     * Set the 'GAIName' element value. ������������ ���, ��������� ������������� � ����������� ��
     * 
     * @param GAIName
     */
    public void setGAIName(String GAIName) {
        this.GAIName = GAIName;
    }
}
