
package ru.acs.fts.schemas.album.pi_notifviolation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Уведомление о нарушении вывоза товаров с таможенной территории Таможенного союза
 */
public class PINotifViolationType extends BaseDocType
{
    private String violationNumber;
    private String violationTime;
    private LocalDate violationDate;
    private String URN;
    private List<ViolationInfoType> violationInfoList = new ArrayList<ViolationInfoType>();
    private CustomsPersonType customsPerson;
    private CUCustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'ViolationNumber' element value. Исходящий номер уведомления
     * 
     * @return value
     */
    public String getViolationNumber() {
        return violationNumber;
    }

    /** 
     * Set the 'ViolationNumber' element value. Исходящий номер уведомления
     * 
     * @param violationNumber
     */
    public void setViolationNumber(String violationNumber) {
        this.violationNumber = violationNumber;
    }

    /** 
     * Get the 'ViolationTime' element value. Время создания уведомления
     * 
     * @return value
     */
    public String getViolationTime() {
        return violationTime;
    }

    /** 
     * Set the 'ViolationTime' element value. Время создания уведомления
     * 
     * @param violationTime
     */
    public void setViolationTime(String violationTime) {
        this.violationTime = violationTime;
    }

    /** 
     * Get the 'ViolationDate' element value. Дата  создания уведомления
     * 
     * @return value
     */
    public LocalDate getViolationDate() {
        return violationDate;
    }

    /** 
     * Set the 'ViolationDate' element value. Дата  создания уведомления
     * 
     * @param violationDate
     */
    public void setViolationDate(LocalDate violationDate) {
        this.violationDate = violationDate;
    }

    /** 
     * Get the 'URN' element value. Уникальный идентификационный номер пакета электронных документов
     * 
     * @return value
     */
    public String getURN() {
        return URN;
    }

    /** 
     * Set the 'URN' element value. Уникальный идентификационный номер пакета электронных документов
     * 
     * @param URN
     */
    public void setURN(String URN) {
        this.URN = URN;
    }

    /** 
     * Get the list of 'ViolationInfo' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @return list
     */
    public List<ViolationInfoType> getViolationInfoList() {
        return violationInfoList;
    }

    /** 
     * Set the list of 'ViolationInfo' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @param list
     */
    public void setViolationInfoList(List<ViolationInfoType> list) {
        violationInfoList = list;
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
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
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
