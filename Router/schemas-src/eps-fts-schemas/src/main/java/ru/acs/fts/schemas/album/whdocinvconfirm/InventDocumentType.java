
package ru.acs.fts.schemas.album.whdocinvconfirm;

import org.joda.time.LocalDate;

/** 
 * Документ из описи
 */
public class InventDocumentType
{
    private String invDocCode;
    private String invDocNumber;
    private LocalDate invDocDate;
    private String invDocLists;
    private String note;
    private String archID;
    private String archDocID;
    private String inventDocumentID;
    private String inventLineID;

    /** 
     * Get the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ. 
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ. 
     * 
     * @param invDocCode
     */
    public void setInvDocCode(String invDocCode) {
        this.invDocCode = invDocCode;
    }

    /** 
     * Get the 'InvDocNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getInvDocNumber() {
        return invDocNumber;
    }

    /** 
     * Set the 'InvDocNumber' element value. Номер документа
     * 
     * @param invDocNumber
     */
    public void setInvDocNumber(String invDocNumber) {
        this.invDocNumber = invDocNumber;
    }

    /** 
     * Get the 'InvDocDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getInvDocDate() {
        return invDocDate;
    }

    /** 
     * Set the 'InvDocDate' element value. Дата документа
     * 
     * @param invDocDate
     */
    public void setInvDocDate(LocalDate invDocDate) {
        this.invDocDate = invDocDate;
    }

    /** 
     * Get the 'InvDocLists' element value. Количество листов в документе
     * 
     * @return value
     */
    public String getInvDocLists() {
        return invDocLists;
    }

    /** 
     * Set the 'InvDocLists' element value. Количество листов в документе
     * 
     * @param invDocLists
     */
    public void setInvDocLists(String invDocLists) {
        this.invDocLists = invDocLists;
    }

    /** 
     * Get the 'Note' element value. Примечание
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Примечание
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'ArchID' element value. Идентификатор электронного архива декларанта
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. Идентификатор электронного архива декларанта
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. Идентификатор документа в электронном архиве декларанта
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Идентификатор документа в электронном архиве декларанта
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'InventDocumentID' element value. Уникальный идентификатор документа, представленного в описи. Заполняется при использовании в системах электронного декларирования в случае наличия на момент составления описи указанного документа в электронном виде.
     * 
     * @return value
     */
    public String getInventDocumentID() {
        return inventDocumentID;
    }

    /** 
     * Set the 'InventDocumentID' element value. Уникальный идентификатор документа, представленного в описи. Заполняется при использовании в системах электронного декларирования в случае наличия на момент составления описи указанного документа в электронном виде.
     * 
     * @param inventDocumentID
     */
    public void setInventDocumentID(String inventDocumentID) {
        this.inventDocumentID = inventDocumentID;
    }

    /** 
     * Get the 'InventLineID' element value. Уникальный идентификатор строки в описи. GUID. Обязателен для заполнения при использовании в системах электронного декларирования.
     * 
     * @return value
     */
    public String getInventLineID() {
        return inventLineID;
    }

    /** 
     * Set the 'InventLineID' element value. Уникальный идентификатор строки в описи. GUID. Обязателен для заполнения при использовании в системах электронного декларирования.
     * 
     * @param inventLineID
     */
    public void setInventLineID(String inventLineID) {
        this.inventLineID = inventLineID;
    }
}
