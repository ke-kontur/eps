
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import org.joda.time.LocalDate;

/** 
 * Регистрационные данные свидетельства ТС
 */
public class RegistrationType
{
    private String regionCode;
    private String seriesCode;
    private String documentNumber;
    private LocalDate issueDate;
    private String GAIName;

    /** 
     * Get the 'RegionCode' element value. Код региона
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. Код региона
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /** 
     * Get the 'SeriesCode' element value. Серия свидетельства
     * 
     * @return value
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /** 
     * Set the 'SeriesCode' element value. Серия свидетельства
     * 
     * @param seriesCode
     */
    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер свидетельства
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер свидетельства
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи свидетельства
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи свидетельства
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'GAIName' element value. Наименование ГАИ, выдавшего свидетельство о регистрации ТС
     * 
     * @return value
     */
    public String getGAIName() {
        return GAIName;
    }

    /** 
     * Set the 'GAIName' element value. Наименование ГАИ, выдавшего свидетельство о регистрации ТС
     * 
     * @param GAIName
     */
    public void setGAIName(String GAIName) {
        this.GAIName = GAIName;
    }
}
