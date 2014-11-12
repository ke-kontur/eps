
package ru.acs.fts.schemas.album.cwquitance;

/** 
 * Класс документа, характеризующий его номер и версию
 */
public class CommonDocumentType
{
    private String documentNumber;
    private String orderNumberOfEdition;

    /** 
     * Get the 'DocumentNumber' element value. Номер подтверждаемого/ошибочного документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер подтверждаемого/ошибочного документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'OrderNumberOfEdition' element value. Номер версии подтверждаемого/ошибочного документа
     * 
     * @return value
     */
    public String getOrderNumberOfEdition() {
        return orderNumberOfEdition;
    }

    /** 
     * Set the 'OrderNumberOfEdition' element value. Номер версии подтверждаемого/ошибочного документа
     * 
     * @param orderNumberOfEdition
     */
    public void setOrderNumberOfEdition(String orderNumberOfEdition) {
        this.orderNumberOfEdition = orderNumberOfEdition;
    }
}
