
package ru.acs.fts.schemas.album.exchangecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о полученном документе
 */
public class RecipDocumentType extends DocumentBaseType
{
    private String recipDocumentID;
    private String recipDocumentModeID;
    private String recipDocTime;
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
     * Get the 'RecipDocumentModeID' element value. Код вида полученного документа
     * 
     * @return value
     */
    public String getRecipDocumentModeID() {
        return recipDocumentModeID;
    }

    /** 
     * Set the 'RecipDocumentModeID' element value. Код вида полученного документа
     * 
     * @param recipDocumentModeID
     */
    public void setRecipDocumentModeID(String recipDocumentModeID) {
        this.recipDocumentModeID = recipDocumentModeID;
    }

    /** 
     * Get the 'RecipDocTime' element value. Время создания полученного документа.
     * 
     * @return value
     */
    public String getRecipDocTime() {
        return recipDocTime;
    }

    /** 
     * Set the 'RecipDocTime' element value. Время создания полученного документа.
     * 
     * @param recipDocTime
     */
    public void setRecipDocTime(String recipDocTime) {
        this.recipDocTime = recipDocTime;
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
