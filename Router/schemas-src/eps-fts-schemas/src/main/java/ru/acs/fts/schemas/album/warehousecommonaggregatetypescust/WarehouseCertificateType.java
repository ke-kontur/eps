
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonleaftypescust.WareHouseCertificateKind;

/** 
 * Комплексный тип для описания документа, на основании которого осуществляет свою деятельность владелец склада
 */
public class WarehouseCertificateType
{
    private WareHouseCertificateKind certificateKind;
    private String certificateNumber;
    private LocalDate certificateDate;

    /** 
     * Get the 'CertificateKind' element value. Вид документа, на основании которого осуществляет свою деятельность владелец склада
     * 
     * @return value
     */
    public WareHouseCertificateKind getCertificateKind() {
        return certificateKind;
    }

    /** 
     * Set the 'CertificateKind' element value. Вид документа, на основании которого осуществляет свою деятельность владелец склада
     * 
     * @param certificateKind
     */
    public void setCertificateKind(WareHouseCertificateKind certificateKind) {
        this.certificateKind = certificateKind;
    }

    /** 
     * Get the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии / Номер приказа о создании ЗТК
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер Свидетельства о включении в Реестр / Номер лицензии / Номер приказа о создании ЗТК
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateDate' element value. Дата документа, на основании которого разрешено хранение
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. Дата документа, на основании которого разрешено хранение
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
