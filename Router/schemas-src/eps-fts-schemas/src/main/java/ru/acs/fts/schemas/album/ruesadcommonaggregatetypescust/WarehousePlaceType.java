
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
 */
public class WarehousePlaceType
{
    private String certificateNumber;
    private String customsOfficeID;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateNumber' element value. Номер документа, свидетельствующего о включении в Реестр
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер документа, свидетельствующего о включении в Реестр
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. Код таможенного органа в зоне деятельности которого находится СВХ.
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. Код таможенного органа в зоне деятельности которого находится СВХ.
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }

    /** 
     * Get the 'CertificateDate' element value. Дата выдачи документа, свидетельствующего о включении в Реестр владельцев СВХ / ТС 
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. Дата выдачи документа, свидетельствующего о включении в Реестр владельцев СВХ / ТС 
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
