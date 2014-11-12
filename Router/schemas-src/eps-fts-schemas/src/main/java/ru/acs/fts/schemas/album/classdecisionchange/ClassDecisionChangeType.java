
package ru.acs.fts.schemas.album.classdecisionchange;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Решение об изменении решения по классификации товара
 */
public class ClassDecisionChangeType extends BaseDocType
{
    private LocalDate date;
    private RegistrationNumberType registrationNumber;
    private DeclarantType declarant;
    private CustomsType customs;
    private GoodsType goods;
    private PersonSignatureType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата регистрации решения об изменении решения по классификации товара
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата регистрации решения об изменении решения по классификации товара
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'Declarant' element value. Декларант
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Декларант
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Customs' element value. Наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Goods' element value. Сведения о товарах
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. Сведения о товарах
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'CustomsPerson' element value. Подпись должностного лица
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Подпись должностного лица
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
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
