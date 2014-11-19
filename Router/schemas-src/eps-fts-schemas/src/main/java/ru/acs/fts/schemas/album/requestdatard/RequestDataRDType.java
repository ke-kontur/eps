
package ru.acs.fts.schemas.album.requestdatard;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос перечня разрешительных документов
 */
public class RequestDataRDType extends BaseDocType
{
    private String docNumber;
    private String docCode;
    private String docType;
    private LocalDate docDate;
    private String formNumber;
    private ContractType contract;
    private String documentModeID;

    /** 
     * Get the 'DocNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocNumber() {
        return docNumber;
    }

    /** 
     * Set the 'DocNumber' element value. Номер документа
     * 
     * @param docNumber
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    /** 
     * Get the 'DocCode' element value. Код вида документа
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида документа
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocType' element value. Тип документа, если true- квотируемый, false - неквотируемый.
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. Тип документа, если true- квотируемый, false - неквотируемый.
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /** 
     * Get the 'DocDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. Дата документа
     * 
     * @param docDate
     */
    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'Contract' element value. Контракт
     * 
     * @return value
     */
    public ContractType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Контракт
     * 
     * @param contract
     */
    public void setContract(ContractType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
