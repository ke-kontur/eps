
package ru.acs.fts.schemas.album.reqwhdoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;

/** 
 * Запрос на предоставление документов
 */
public class ReqWHDocType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private List<WhPresentDocType> requestedDocList = new ArrayList<WhPresentDocType>();
    private PersonBaseType SVHPerson;
    private GTDIDType regNumberConfirmDoc;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления запроса
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления запроса
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления запроса
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления запроса
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the list of 'RequestedDoc' element items. Список запрашиваемых документов
     * 
     * @return list
     */
    public List<WhPresentDocType> getRequestedDocList() {
        return requestedDocList;
    }

    /** 
     * Set the list of 'RequestedDoc' element items. Список запрашиваемых документов
     * 
     * @param list
     */
    public void setRequestedDocList(List<WhPresentDocType> list) {
        requestedDocList = list;
    }

    /** 
     * Get the 'SVHPerson' element value. Представить СВХ
     * 
     * @return value
     */
    public PersonBaseType getSVHPerson() {
        return SVHPerson;
    }

    /** 
     * Set the 'SVHPerson' element value. Представить СВХ
     * 
     * @param SVHPerson
     */
    public void setSVHPerson(PersonBaseType SVHPerson) {
        this.SVHPerson = SVHPerson;
    }

    /** 
     * Get the 'RegNumberConfirmDoc' element value. Регистрационный номер представления документов для помещения товаров на ВХ
     * 
     * @return value
     */
    public GTDIDType getRegNumberConfirmDoc() {
        return regNumberConfirmDoc;
    }

    /** 
     * Set the 'RegNumberConfirmDoc' element value. Регистрационный номер представления документов для помещения товаров на ВХ
     * 
     * @param regNumberConfirmDoc
     */
    public void setRegNumberConfirmDoc(GTDIDType regNumberConfirmDoc) {
        this.regNumberConfirmDoc = regNumberConfirmDoc;
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
