
package ru.acs.fts.schemas.album.correctiondecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Ќабор ссылок на документы, которыми руководствовалс€ инспектор таможни при прин€тии решени€ по мере
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
     * Get the 'CusDesDocumentID' element value. —сылка на DocumentID того документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @return value
     */
    public String getCusDesDocumentID() {
        return cusDesDocumentID;
    }

    /** 
     * Set the 'CusDesDocumentID' element value. —сылка на DocumentID того документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @param cusDesDocumentID
     */
    public void setCusDesDocumentID(String cusDesDocumentID) {
        this.cusDesDocumentID = cusDesDocumentID;
    }

    /** 
     * Get the 'DocCode' element value.  од вида документа. ѕри наличии документа в  лассификаторе видов документов, используемых при за€влении сведений в графе 44 ƒ“, указываетс€ этот код.
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value.  од вида документа. ѕри наличии документа в  лассификаторе видов документов, используемых при за€влении сведений в графе 44 ƒ“, указываетс€ этот код.
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. ¬ид документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. ¬ид документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'SectionNumber' element value. Ќомер раздела документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @return value
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /** 
     * Set the 'SectionNumber' element value. Ќомер раздела документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @param sectionNumber
     */
    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. ѕор€дковый номер записи в разделе документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ѕор€дковый номер записи в разделе документа, которым руководствовалс€ инспектор таможни при прин€тии решени€ по мере
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Note' element value.  омментарий инспектора
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value.  омментарий инспектора
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}
