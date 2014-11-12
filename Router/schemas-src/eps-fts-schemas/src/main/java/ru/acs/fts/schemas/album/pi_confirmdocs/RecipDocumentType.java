
package ru.acs.fts.schemas.album.pi_confirmdocs;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о полученных документах.
 */
public class RecipDocumentType extends DocumentBaseType
{
    private String recipDocumentID;
    private LocalDate recipDocDate;
    private LocalDate recipDate;
    private String recipTime;

    /** 
     * Get the 'RecipDocumentID' element value. Уникальный идентификатор полученного документа
     * 
     * @return value
     */
    public String getRecipDocumentID() {
        return recipDocumentID;
    }

    /** 
     * Set the 'RecipDocumentID' element value. Уникальный идентификатор полученного документа
     * 
     * @param recipDocumentID
     */
    public void setRecipDocumentID(String recipDocumentID) {
        this.recipDocumentID = recipDocumentID;
    }

    /** 
     * Get the 'RecipDocDate' element value. Дата создания полученного документа.
     * 
     * @return value
     */
    public LocalDate getRecipDocDate() {
        return recipDocDate;
    }

    /** 
     * Set the 'RecipDocDate' element value. Дата создания полученного документа.
     * 
     * @param recipDocDate
     */
    public void setRecipDocDate(LocalDate recipDocDate) {
        this.recipDocDate = recipDocDate;
    }

    /** 
     * Get the 'RecipDate' element value. Дата получения документа.
     * 
     * @return value
     */
    public LocalDate getRecipDate() {
        return recipDate;
    }

    /** 
     * Set the 'RecipDate' element value. Дата получения документа.
     * 
     * @param recipDate
     */
    public void setRecipDate(LocalDate recipDate) {
        this.recipDate = recipDate;
    }

    /** 
     * Get the 'RecipTime' element value. Время получения документа.
     * 
     * @return value
     */
    public String getRecipTime() {
        return recipTime;
    }

    /** 
     * Set the 'RecipTime' element value. Время получения документа.
     * 
     * @param recipTime
     */
    public void setRecipTime(String recipTime) {
        this.recipTime = recipTime;
    }
}
