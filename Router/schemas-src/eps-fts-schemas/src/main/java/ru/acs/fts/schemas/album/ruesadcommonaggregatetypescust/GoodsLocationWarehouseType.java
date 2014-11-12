
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ДТ и ТД. Сведения о местонахождении товаров. Сведения о таможенном складе.
 */
public class GoodsLocationWarehouseType
{
    private String documentModeCode;
    private String certificateNumber;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа. 1- Лицензия 2 - Свидетельство.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа. 1- Лицензия 2 - Свидетельство.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

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
}
