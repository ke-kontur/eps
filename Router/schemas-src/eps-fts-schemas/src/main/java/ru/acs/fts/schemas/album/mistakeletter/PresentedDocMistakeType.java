
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * Комплексный тип для описания выявленной ошибки в реквизитах представленного документа
 */
public class PresentedDocMistakeType
{
    private String prDocumentOrderNumber;
    private DocModeCodeMistakeType docModeCodeMistake;
    private DocNameMistakeType docNameMistake;
    private DocNumberMistakeType docNumberMistake;
    private DocDateMistakeType docDateMistake;

    /** 
     * Get the 'PrDocumentOrderNumber' element value. Порядковый номер документа в соответствующем списке документов отчета о принятии по форме ДО-1
     * 
     * @return value
     */
    public String getPrDocumentOrderNumber() {
        return prDocumentOrderNumber;
    }

    /** 
     * Set the 'PrDocumentOrderNumber' element value. Порядковый номер документа в соответствующем списке документов отчета о принятии по форме ДО-1
     * 
     * @param prDocumentOrderNumber
     */
    public void setPrDocumentOrderNumber(String prDocumentOrderNumber) {
        this.prDocumentOrderNumber = prDocumentOrderNumber;
    }

    /** 
     * Get the 'DocModeCodeMistake' element value. Ошибка в коде вида документа
     * 
     * @return value
     */
    public DocModeCodeMistakeType getDocModeCodeMistake() {
        return docModeCodeMistake;
    }

    /** 
     * Set the 'DocModeCodeMistake' element value. Ошибка в коде вида документа
     * 
     * @param docModeCodeMistake
     */
    public void setDocModeCodeMistake(DocModeCodeMistakeType docModeCodeMistake) {
        this.docModeCodeMistake = docModeCodeMistake;
    }

    /** 
     * Get the 'DocNameMistake' element value. Ошибка в наименовании документа
     * 
     * @return value
     */
    public DocNameMistakeType getDocNameMistake() {
        return docNameMistake;
    }

    /** 
     * Set the 'DocNameMistake' element value. Ошибка в наименовании документа
     * 
     * @param docNameMistake
     */
    public void setDocNameMistake(DocNameMistakeType docNameMistake) {
        this.docNameMistake = docNameMistake;
    }

    /** 
     * Get the 'DocNumberMistake' element value. Ошибка в номере документа
     * 
     * @return value
     */
    public DocNumberMistakeType getDocNumberMistake() {
        return docNumberMistake;
    }

    /** 
     * Set the 'DocNumberMistake' element value. Ошибка в номере документа
     * 
     * @param docNumberMistake
     */
    public void setDocNumberMistake(DocNumberMistakeType docNumberMistake) {
        this.docNumberMistake = docNumberMistake;
    }

    /** 
     * Get the 'DocDateMistake' element value. Ошибка в дате документа
     * 
     * @return value
     */
    public DocDateMistakeType getDocDateMistake() {
        return docDateMistake;
    }

    /** 
     * Set the 'DocDateMistake' element value. Ошибка в дате документа
     * 
     * @param docDateMistake
     */
    public void setDocDateMistake(DocDateMistakeType docDateMistake) {
        this.docDateMistake = docDateMistake;
    }
}
