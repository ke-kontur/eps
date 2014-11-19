
package ru.acs.fts.schemas.album.notifreservation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о резервировании/о невозможности резервирования суммы обеспечения
 */
public class NotifReservationType extends BaseDocType
{
    private String documentDateTime;
    private String docSign;
    private String reservedAmount;
    private String requiredAmount;
    private String currencyCode;
    private List<String> commentList = new ArrayList<String>();
    private CustomsPersonType customsPerson;
    private GTDIDType declRegNumber;
    private CustomsType customs;
    private List<ReasonsType> reasonList = new ArrayList<ReasonsType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'DocSign' element value. Признак документа: 0 - уведомление об успешном резервировании; 1 - уведомление о частичном резервировании; 2 - уведомление о невозможности резервирования
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 0 - уведомление об успешном резервировании; 1 - уведомление о частичном резервировании; 2 - уведомление о невозможности резервирования
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ReservedAmount' element value. Зарезервированная сумма обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getReservedAmount() {
        return reservedAmount;
    }

    /** 
     * Set the 'ReservedAmount' element value. Зарезервированная сумма обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param reservedAmount
     */
    public void setReservedAmount(String reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    /** 
     * Get the 'RequiredAmount' element value. Сумма обеспечения, которая не может быть зарезервирована из-за отсутствия неиспользованного (свободного) остатка
     * 
     * @return value
     */
    public String getRequiredAmount() {
        return requiredAmount;
    }

    /** 
     * Set the 'RequiredAmount' element value. Сумма обеспечения, которая не может быть зарезервирована из-за отсутствия неиспользованного (свободного) остатка
     * 
     * @param requiredAmount
     */
    public void setRequiredAmount(String requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'Comment' element items. Примечание
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. Примечание
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
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
     * Get the 'DeclRegNumber' element value. Регистрационный номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getDeclRegNumber() {
        return declRegNumber;
    }

    /** 
     * Set the 'DeclRegNumber' element value. Регистрационный номер таможенной декларации
     * 
     * @param declRegNumber
     */
    public void setDeclRegNumber(GTDIDType declRegNumber) {
        this.declRegNumber = declRegNumber;
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
     * Get the list of 'Reasons' element items. Описание обстоятельств, послуживших причиной невозможности резервирования суммы обеспечения
     * 
     * @return list
     */
    public List<ReasonsType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. Описание обстоятельств, послуживших причиной невозможности резервирования суммы обеспечения
     * 
     * @param list
     */
    public void setReasonList(List<ReasonsType> list) {
        reasonList = list;
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
