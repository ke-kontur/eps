
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;

/** 
 * Свидетельство о регистрации ТС
 */
public class CertificateRegistrationType
{
    private String series;
    private String number;
    private String regSign;
    private LocalDate regData;
    private String issuedGIBDD;
    private String regionCode;

    /** 
     * Get the 'Series' element value. Серия
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'Number' element value. Номер
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'RegSign' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegSign() {
        return regSign;
    }

    /** 
     * Set the 'RegSign' element value. Регистрационный номер
     * 
     * @param regSign
     */
    public void setRegSign(String regSign) {
        this.regSign = regSign;
    }

    /** 
     * Get the 'RegData' element value. Дата регистрации
     * 
     * @return value
     */
    public LocalDate getRegData() {
        return regData;
    }

    /** 
     * Set the 'RegData' element value. Дата регистрации
     * 
     * @param regData
     */
    public void setRegData(LocalDate regData) {
        this.regData = regData;
    }

    /** 
     * Get the 'IssuedGIBDD' element value. Выдано ГИБДД
     * 
     * @return value
     */
    public String getIssuedGIBDD() {
        return issuedGIBDD;
    }

    /** 
     * Set the 'IssuedGIBDD' element value. Выдано ГИБДД
     * 
     * @param issuedGIBDD
     */
    public void setIssuedGIBDD(String issuedGIBDD) {
        this.issuedGIBDD = issuedGIBDD;
    }

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
}
