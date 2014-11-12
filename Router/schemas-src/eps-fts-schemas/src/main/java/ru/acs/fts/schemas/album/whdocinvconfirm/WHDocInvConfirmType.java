
package ru.acs.fts.schemas.album.whdocinvconfirm;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Подтверждение о получении перечня запрошенных документов
 */
public class WHDocInvConfirmType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private LocalDate recDate;
    private String recTime;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private PersonBaseType person;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления подтверждения
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления подтверждения
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления подтверждения
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления подтверждения
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'RecDate' element value. Дата получения перечня
     * 
     * @return value
     */
    public LocalDate getRecDate() {
        return recDate;
    }

    /** 
     * Set the 'RecDate' element value. Дата получения перечня
     * 
     * @param recDate
     */
    public void setRecDate(LocalDate recDate) {
        this.recDate = recDate;
    }

    /** 
     * Get the 'RecTime' element value. Время получения перечня
     * 
     * @return value
     */
    public String getRecTime() {
        return recTime;
    }

    /** 
     * Set the 'RecTime' element value. Время получения перечня
     * 
     * @param recTime
     */
    public void setRecTime(String recTime) {
        this.recTime = recTime;
    }

    /** 
     * Get the list of 'InventDocument' element items. Документ из описи
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. Документ из описи
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }

    /** 
     * Get the 'Person' element value. Лицо, получившее перечень запрошенных документов
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Лицо, получившее перечень запрошенных документов
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
