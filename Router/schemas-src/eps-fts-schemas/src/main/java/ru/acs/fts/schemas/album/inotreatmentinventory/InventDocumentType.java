
package ru.acs.fts.schemas.album.inotreatmentinventory;

import org.joda.time.LocalDate;

/** 
 * Документ из описи
 */
public class InventDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String invDocNumber;
    private String invDocPresentation;
    private String invDocLists;
    private String invDocCopies;
    private String note;
    private LocalDate docDate;

    /** 
     * Get the 'InvDocCode' element value. Код вида представляемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. Код вида представляемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param invDocCode
     */
    public void setInvDocCode(String invDocCode) {
        this.invDocCode = invDocCode;
    }

    /** 
     * Get the 'InvDocName' element value. Вид документа
     * 
     * @return value
     */
    public String getInvDocName() {
        return invDocName;
    }

    /** 
     * Set the 'InvDocName' element value. Вид документа
     * 
     * @param invDocName
     */
    public void setInvDocName(String invDocName) {
        this.invDocName = invDocName;
    }

    /** 
     * Get the 'InvDocNumber' element value. Номер документа. При отсутствии номера заполняется "Б/Н"
     * 
     * @return value
     */
    public String getInvDocNumber() {
        return invDocNumber;
    }

    /** 
     * Set the 'InvDocNumber' element value. Номер документа. При отсутствии номера заполняется "Б/Н"
     * 
     * @param invDocNumber
     */
    public void setInvDocNumber(String invDocNumber) {
        this.invDocNumber = invDocNumber;
    }

    /** 
     * Get the 'InvDocPresentation' element value. Вид представления документа: "О" - оригинал, "К" - копия (заполняется прописными буквами кириллицы)
     * 
     * @return value
     */
    public String getInvDocPresentation() {
        return invDocPresentation;
    }

    /** 
     * Set the 'InvDocPresentation' element value. Вид представления документа: "О" - оригинал, "К" - копия (заполняется прописными буквами кириллицы)
     * 
     * @param invDocPresentation
     */
    public void setInvDocPresentation(String invDocPresentation) {
        this.invDocPresentation = invDocPresentation;
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
     * Get the 'InvDocCopies' element value. Количество экземпляров
     * 
     * @return value
     */
    public String getInvDocCopies() {
        return invDocCopies;
    }

    /** 
     * Set the 'InvDocCopies' element value. Количество экземпляров
     * 
     * @param invDocCopies
     */
    public void setInvDocCopies(String invDocCopies) {
        this.invDocCopies = invDocCopies;
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
}
