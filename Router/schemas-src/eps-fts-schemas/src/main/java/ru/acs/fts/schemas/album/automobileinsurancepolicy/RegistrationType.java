
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import org.joda.time.LocalDate;

/** 
 * ��������������� ������ ���������� ������ ������������ ��������������� 
 */
public class RegistrationType
{
    private String seriesCode;
    private String polNumber;
    private LocalDate issueDate;
    private LocalDate insurContractDate;

    /** 
     * Get the 'SeriesCode' element value. ����� ������
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' element value. ����� ������
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    /** 
     * Get the 'PolNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getPolNumber() {
        return polNumber;
    }

    /** 
     * Set the 'PolNumber' element value. ����� ������
     * 
     * @param polNumber
     */
    public void setPolNumber(String polNumber) {
        this.polNumber = polNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'InsurContractDate' element value. ���� �������� �����������
     * 
     * @return value
     */
    public LocalDate getInsurContractDate() {
        return insurContractDate;
    }

    /** 
     * Set the 'InsurContractDate' element value. ���� �������� �����������
     * 
     * @param insurContractDate
     */
    public void setInsurContractDate(LocalDate insurContractDate) {
        this.insurContractDate = insurContractDate;
    }
}
