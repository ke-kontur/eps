
package ru.acs.fts.schemas.album.reqgoodspresent;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос сведений о местонахождении товаров/реквизитах ТО, в зоне деятельности которого находятся товары/Уведомление о необходимости предоставления товаров в ТО
 */
public class ReqGoodsPresentType extends BaseDocType
{
    private LocalDate reqDate;
    private String reqTime;
    private String docSign;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ReqDate' element value. Дата формирования запроса
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. Дата формирования запроса
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'ReqTime' element value. Время формирования запроса
     * 
     * @return value
     */
    public String getReqTime() {
        return reqTime;
    }

    /** 
     * Set the 'ReqTime' element value. Время формирования запроса
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - запрос сведений о местонахождении товаров; 2 - запрос сведений о реквизитах ТО, в зоне деятельности которого находятся товары; 3 - уведомление о необходимости предоставления товаров в ТО
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - запрос сведений о местонахождении товаров; 2 - запрос сведений о реквизитах ТО, в зоне деятельности которого находятся товары; 3 - уведомление о необходимости предоставления товаров в ТО
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
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
     * Get the 'GTDID' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
