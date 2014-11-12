
package ru.acs.fts.schemas.album.correctiondecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Набор ссылок на документы, которыми руководствовался инспектор таможни при принятии решения по мере
 */
public class RefDocumentListType extends DocumentBaseType
{
    private String cusDesDocumentID;
    private String docCode;
    private String docName;
    private String sectionNumber;
    private String recordNumber;
    private String note;

    /** 
     * Get the 'CusDesDocumentID' element value. Ссылка на DocumentID того документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @return value
     */
    public String getCusDesDocumentID() {
        return cusDesDocumentID;
    }

    /** 
     * Set the 'CusDesDocumentID' element value. Ссылка на DocumentID того документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @param cusDesDocumentID
     */
    public void setCusDesDocumentID(String cusDesDocumentID) {
        this.cusDesDocumentID = cusDesDocumentID;
    }

    /** 
     * Get the 'DocCode' element value. Код вида документа. При наличии документа в Классификаторе видов документов, используемых при заявлении сведений в графе 44 ДТ, указывается этот код.
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида документа. При наличии документа в Классификаторе видов документов, используемых при заявлении сведений в графе 44 ДТ, указывается этот код.
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. Вид документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. Вид документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'SectionNumber' element value. Номер раздела документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @return value
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /** 
     * Set the 'SectionNumber' element value. Номер раздела документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @param sectionNumber
     */
    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в разделе документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в разделе документа, которым руководствовался инспектор таможни при принятии решения по мере
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Note' element value. Комментарий инспектора
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Комментарий инспектора
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}
