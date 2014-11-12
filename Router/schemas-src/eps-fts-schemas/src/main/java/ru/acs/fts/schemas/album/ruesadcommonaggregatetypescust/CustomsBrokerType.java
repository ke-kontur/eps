
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения о  таможенном представителе (брокере). Гр. 54 ДТ.
 */
public class CustomsBrokerType
{
    private String documentModeCode;
    private String certificateNumber;
    private LocalDate issueCertificateDate;
    private String agreementNumber;
    private LocalDate conclusionAgreementDate;
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа: 1-Лицензия, 2-Свидетельство  
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа: 1-Лицензия, 2-Свидетельство  
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'CertificateNumber' element value. Номер свидетельства о включении в Реестр таможенных представителей (брокеров).
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о включении в Реестр таможенных представителей (брокеров).
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'IssueCertificateDate' element value. Дата выдачи свидетельства о включении в Реестр таможенных представителей (брокеров)
     * 
     * @return value
     */
    public LocalDate getIssueCertificateDate() {
        return issueCertificateDate;
    }

    /** 
     * Set the 'IssueCertificateDate' element value. Дата выдачи свидетельства о включении в Реестр таможенных представителей (брокеров)
     * 
     * @param issueCertificateDate
     */
    public void setIssueCertificateDate(LocalDate issueCertificateDate) {
        this.issueCertificateDate = issueCertificateDate;
    }

    /** 
     * Get the 'AgreementNumber' element value. Номер договора таможенного представителя (брокера) с декларантом.
     * 
     * @return value
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /** 
     * Set the 'AgreementNumber' element value. Номер договора таможенного представителя (брокера) с декларантом.
     * 
     * @param agreementNumber
     */
    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    /** 
     * Get the 'ConclusionAgreementDate' element value. Дата заключения договора таможенного представителя (брокера) с декларантом.
     * 
     * @return value
     */
    public LocalDate getConclusionAgreementDate() {
        return conclusionAgreementDate;
    }

    /** 
     * Set the 'ConclusionAgreementDate' element value. Дата заключения договора таможенного представителя (брокера) с декларантом.
     * 
     * @param conclusionAgreementDate
     */
    public void setConclusionAgreementDate(LocalDate conclusionAgreementDate) {
        this.conclusionAgreementDate = conclusionAgreementDate;
    }

    /** 
     * Get the 'INNID' element value. ИНН таможенного представителя (брокера).
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. ИНН таможенного представителя (брокера).
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. КПП таможенного представителя (брокера).
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. КПП таможенного представителя (брокера).
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}
