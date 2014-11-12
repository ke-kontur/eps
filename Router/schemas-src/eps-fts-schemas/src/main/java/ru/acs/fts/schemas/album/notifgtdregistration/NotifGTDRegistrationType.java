
package ru.acs.fts.schemas.album.notifgtdregistration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о регистрации документа в таможенном органе
 */
public class NotifGTDRegistrationType extends BaseDocType
{
    private LocalDate registrationDate;
    private String registrationTime;
    private String docSign;
    private String comments;
    private CustomsType customs;
    private GTDIDType GTDID;
    private CustomsPersonSignatureType customsPersonSignature;
    private String documentModeID;

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации ДТ
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации ДТ
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationTime' element value. Время регистрации  ДТ
     * 
     * @return value
     */
    public String getRegistrationTime() {
        return registrationTime;
    }

    /** 
     * Set the 'RegistrationTime' element value. Время регистрации  ДТ
     * 
     * @param registrationTime
     */
    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    /** 
     * Get the 'DocSign' element value. Признак уведомления: 0 - о регистрации ДТ; 1 - о регистрации Обязательства о подачи ДТ; 2 - иное
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак уведомления: 0 - о регистрации ДТ; 1 - о регистрации Обязательства о подачи ДТ; 2 - иное
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'GTDID' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер документа
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. Подпись должностного лица
     * 
     * @return value
     */
    public CustomsPersonSignatureType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. Подпись должностного лица
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonSignatureType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
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
