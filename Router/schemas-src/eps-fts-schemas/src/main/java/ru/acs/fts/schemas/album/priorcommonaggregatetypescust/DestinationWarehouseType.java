
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * СВХ места назначения
 */
public class DestinationWarehouseType
{
    private String certificateNumber;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии 
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии 
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateDate' element value. Дата выдачи свидетельства о включении в Реестр владельцев СВХ / ТС / Дата выдачи лицензии 
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. Дата выдачи свидетельства о включении в Реестр владельцев СВХ / ТС / Дата выдачи лицензии 
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
