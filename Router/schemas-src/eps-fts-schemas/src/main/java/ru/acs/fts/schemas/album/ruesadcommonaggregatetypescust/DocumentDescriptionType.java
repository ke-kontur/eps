
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Описание документов, которые предполагается представить в определенный срок
 */
public class DocumentDescriptionType
{
    private String position;
    private String docCode;
    private String docName;
    private LocalDate suggDate;
    private String note;

    /** 
     * Get the 'Position' element value. Порядковый номер записи
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер записи
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'DocCode' element value. Код вида документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. Вид документа
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. Вид документа
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'SuggDate' element value. Дата предоставления документа
     * 
     * @return value
     */
    public LocalDate getSuggDate() {
        return suggDate;
    }

    /** 
     * Set the 'SuggDate' element value. Дата предоставления документа
     * 
     * @param suggDate
     */
    public void setSuggDate(LocalDate suggDate) {
        this.suggDate = suggDate;
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
}
