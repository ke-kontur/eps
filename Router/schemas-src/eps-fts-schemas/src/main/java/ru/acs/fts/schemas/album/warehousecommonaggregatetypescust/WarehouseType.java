
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Комплексный тип для описания склада, на котором находятся товары
 */
public class WarehouseType extends WHOrganizationBaseType
{
    private String certificateNumber;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии / Номер разрешения таможни на ОХ / Номер приказа о создании ЗТК
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии / Номер разрешения таможни на ОХ / Номер приказа о создании ЗТК
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
