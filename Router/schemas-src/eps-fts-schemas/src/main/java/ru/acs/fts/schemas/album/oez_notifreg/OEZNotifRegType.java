
package ru.acs.fts.schemas.album.oez_notifreg;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Регистрационный номер уведомления о ввозе/вывозе товаров/Заявления на уничтожение/Акта об уничтожении
 */
public class OEZNotifRegType extends BaseDocType
{
    private String documentSign;
    private CustomsType customs;
    private RegistrationNumberType registrationNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. Регистрационный номер: 1 - уведомления о ввозе товаров; 2 - уведомления о вывозе товаров; 3 - заявления на уничтожение; 4 - акта об уничтожении
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Регистрационный номер: 1 - уведомления о ввозе товаров; 2 - уведомления о вывозе товаров; 3 - заявления на уничтожение; 4 - акта об уничтожении
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
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
     * Get the 'RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе товаров
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе товаров
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
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
