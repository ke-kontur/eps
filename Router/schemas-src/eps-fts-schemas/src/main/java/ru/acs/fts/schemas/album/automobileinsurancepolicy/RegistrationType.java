
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import org.joda.time.LocalDate;

/** 
 * Регистрационные данные страхового полиса гражданского автострахования 
 */
public class RegistrationType
{
    private String seriesCode;
    private String polNumber;
    private LocalDate issueDate;
    private LocalDate insurContractDate;

    /** 
     * Get the 'SeriesCode' element value. Серия полиса
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' element value. Серия полиса
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    /** 
     * Get the 'PolNumber' element value. Номер полиса
     * 
     * @return value
     */
    public String getPolNumber() {
        return polNumber;
    }

    /** 
     * Set the 'PolNumber' element value. Номер полиса
     * 
     * @param polNumber
     */
    public void setPolNumber(String polNumber) {
        this.polNumber = polNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи полиса
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи полиса
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'InsurContractDate' element value. Дата договора страхования
     * 
     * @return value
     */
    public LocalDate getInsurContractDate() {
        return insurContractDate;
    }

    /** 
     * Set the 'InsurContractDate' element value. Дата договора страхования
     * 
     * @param insurContractDate
     */
    public void setInsurContractDate(LocalDate insurContractDate) {
        this.insurContractDate = insurContractDate;
    }
}
