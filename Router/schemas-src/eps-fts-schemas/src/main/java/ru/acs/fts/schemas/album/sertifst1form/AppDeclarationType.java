
package ru.acs.fts.schemas.album.sertifst1form;

import org.joda.time.LocalDate;

/** 
 * Декларация заявителя
 */
public class AppDeclarationType
{
    private LocalDate dateInf;
    private String appCountry;
    private String FIO;
    private String signPlace;

    /** 
     * Get the 'DateInf' element value. Дата удостоверения документа
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата удостоверения документа
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'AppCountry' element value. Наименование страны в декларации заявителя сертификата
     * 
     * @return value
     */
    public String getAppCountry() {
        return appCountry;
    }

    /** 
     * Set the 'AppCountry' element value. Наименование страны в декларации заявителя сертификата
     * 
     * @param appCountry
     */
    public void setAppCountry(String appCountry) {
        this.appCountry = appCountry;
    }

    /** 
     * Get the 'FIO' element value. ФИО заявителя
     * 
     * @return value
     */
    public String getFIO() {
        return FIO;
    }

    /** 
     * Set the 'FIO' element value. ФИО заявителя
     * 
     * @param FIO
     */
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    /** 
     * Get the 'SignPlace' element value. Место  подписи
     * 
     * @return value
     */
    public String getSignPlace() {
        return signPlace;
    }

    /** 
     * Set the 'SignPlace' element value. Место  подписи
     * 
     * @param signPlace
     */
    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }
}
