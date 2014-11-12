
package ru.acs.fts.schemas.album.confirmdocsrecip;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.exchangecommonaggregatetypescust.RecipDocumentType;

/** 
 * Подтверждение получения должностным лицом таможенного органа электронных документов
 */
public class ConfirmDocsRecipType extends BaseDocType
{
    private LocalDate sendDate;
    private String comments;
    private String numberOfDocs;
    private List<RecipDocumentType> recipDocList = new ArrayList<RecipDocumentType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'NumberOfDocs' element value. Количество полученных документов.
     * 
     * @return value
     */
    public String getNumberOfDocs() {
        return numberOfDocs;
    }

    /** 
     * Set the 'NumberOfDocs' element value. Количество полученных документов.
     * 
     * @param numberOfDocs
     */
    public void setNumberOfDocs(String numberOfDocs) {
        this.numberOfDocs = numberOfDocs;
    }

    /** 
     * Get the list of 'RecipDoc' element items. Полученный документ
     * 
     * @return list
     */
    public List<RecipDocumentType> getRecipDocList() {
        return recipDocList;
    }

    /** 
     * Set the list of 'RecipDoc' element items. Полученный документ
     * 
     * @param list
     */
    public void setRecipDocList(List<RecipDocumentType> list) {
        recipDocList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
