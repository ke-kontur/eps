
package ru.acs.fts.schemas.album.roskomradio;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * Сведения о документе
 */
public class DocInfoType extends DocumentType
{
    private String docId;
    private String docType;
    private LocalDate changeDate;
    private String status;

    /** 
     * Get the 'DocId' element value. Идентификатор документа
     * 
     * @return value
     */
    public String getDocId() {
        return docId;
    }

    /** 
     * Set the 'DocId' element value. Идентификатор документа
     * 
     * @param docId
     */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /** 
     * Get the 'DocType' element value. Тип документа. 1 -  Временный ввоз РЭС; 2 - Ввоз РЭС для личного использования;
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. Тип документа. 1 -  Временный ввоз РЭС; 2 - Ввоз РЭС для личного использования;
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /** 
     * Get the 'ChangeDate' element value. Дата последней модификации разрешения на ввоз
     * 
     * @return value
     */
    public LocalDate getChangeDate() {
        return changeDate;
    }

    /** 
     * Set the 'ChangeDate' element value. Дата последней модификации разрешения на ввоз
     * 
     * @param changeDate
     */
    public void setChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
    }

    /** 
     * Get the 'Status' element value. Статус разрешения на ввоз
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус разрешения на ввоз
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
