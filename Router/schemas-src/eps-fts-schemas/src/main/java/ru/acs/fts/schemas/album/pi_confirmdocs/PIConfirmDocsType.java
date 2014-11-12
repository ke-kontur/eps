
package ru.acs.fts.schemas.album.pi_confirmdocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Подтверждение получения документа
 */
public class PIConfirmDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private List<RecipDocumentType> recipDocumentList = new ArrayList<RecipDocumentType>();
    private PersonBaseType declPerson;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата создания подтверждения
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата создания подтверждения
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время создания подтверждения
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время создания подтверждения
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the list of 'RecipDocument' element items. Информация о полученных документах.
     * 
     * @return list
     */
    public List<RecipDocumentType> getRecipDocumentList() {
        return recipDocumentList;
    }

    /** 
     * Set the list of 'RecipDocument' element items. Информация о полученных документах.
     * 
     * @param list
     */
    public void setRecipDocumentList(List<RecipDocumentType> list) {
        recipDocumentList = list;
    }

    /** 
     * Get the 'DeclPerson' element value. Сведения о лице, создавшем подтверждение
     * 
     * @return value
     */
    public PersonBaseType getDeclPerson() {
        return declPerson;
    }

    /** 
     * Set the 'DeclPerson' element value. Сведения о лице, создавшем подтверждение
     * 
     * @param declPerson
     */
    public void setDeclPerson(PersonBaseType declPerson) {
        this.declPerson = declPerson;
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
