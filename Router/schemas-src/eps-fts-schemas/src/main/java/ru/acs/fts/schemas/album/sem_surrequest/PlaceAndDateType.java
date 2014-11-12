
package ru.acs.fts.schemas.album.sem_surrequest;

import org.joda.time.LocalDate;

/** 
 * Место и дата гр.54
 */
public class PlaceAndDateType
{
    private String documentModeCode;
    private String certificateNumber;
    private LocalDate issueCertificateDate;
    private String agreemenNumber;
    private LocalDate conclusionAgreemenDate;
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа: 1 - Лицензия, 2 - Свидетельство
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа: 1 - Лицензия, 2 - Свидетельство
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'CertificateNumber' element value. Номер свидетельства о включении в реестр таможенных представителей (брокеров)
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о включении в реестр таможенных представителей (брокеров)
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'IssueCertificateDate' element value. Дата выдачи свидетельства о включении в реестр таможенных представителей (брокеров)
     * 
     * @return value
     */
    public LocalDate getIssueCertificateDate() {
        return issueCertificateDate;
    }

    /** 
     * Set the 'IssueCertificateDate' element value. Дата выдачи свидетельства о включении в реестр таможенных представителей (брокеров)
     * 
     * @param issueCertificateDate
     */
    public void setIssueCertificateDate(LocalDate issueCertificateDate) {
        this.issueCertificateDate = issueCertificateDate;
    }

    /** 
     * Get the 'AgreemenNumber' element value. Номер договора таможенного представителя (брокера) с декларантом
     * 
     * @return value
     */
    public String getAgreemenNumber() {
        return agreemenNumber;
    }

    /** 
     * Set the 'AgreemenNumber' element value. Номер договора таможенного представителя (брокера) с декларантом
     * 
     * @param agreemenNumber
     */
    public void setAgreemenNumber(String agreemenNumber) {
        this.agreemenNumber = agreemenNumber;
    }

    /** 
     * Get the 'ConclusionAgreemenDate' element value. дата заключения договора таможенного представителя (брокера) с декларантом
     * 
     * @return value
     */
    public LocalDate getConclusionAgreemenDate() {
        return conclusionAgreemenDate;
    }

    /** 
     * Set the 'ConclusionAgreemenDate' element value. дата заключения договора таможенного представителя (брокера) с декларантом
     * 
     * @param conclusionAgreemenDate
     */
    public void setConclusionAgreemenDate(LocalDate conclusionAgreemenDate) {
        this.conclusionAgreemenDate = conclusionAgreemenDate;
    }

    /** 
     * Get the 'INNID' element value. ИНН таможенного представителя (брокера) 
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. ИНН таможенного представителя (брокера) 
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. КПП таможенного представителя (брокера)
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. КПП таможенного представителя (брокера)
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}
