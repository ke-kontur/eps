
package ru.acs.fts.schemas.album.preliminaryorigincountry;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Предварительное решение о стране происхождения товара
 */
public class PreliminaryOriginCountryType extends BaseDocType
{
    private LocalDate date;
    private String originCountryName;
    private List<String> markList = new ArrayList<String>();
    private String managementName;
    private DeclarantType declarant;
    private RegistrationNumberType registrationNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private GoodsInfoOriginCountryType goodsInfoOriginCountry;
    private DocumentBaseType document;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата принятия решения
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'OriginCountryName' element value. Страна происхождения товара
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Страна происхождения товара
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the list of 'Mark' element items. Служебные отметки
     * 
     * @return list
     */
    public List<String> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Mark' element items. Служебные отметки
     * 
     * @param list
     */
    public void setMarkList(List<String> list) {
        markList = list;
    }

    /** 
     * Get the 'ManagementName' element value. Наименование Управления
     * 
     * @return value
     */
    public String getManagementName() {
        return managementName;
    }

    /** 
     * Set the 'ManagementName' element value. Наименование Управления
     * 
     * @param managementName
     */
    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о заявителе
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
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
     * Get the list of 'Goods' element items. Товар
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'GoodsInfoOriginCountry' element value. Сведения о товаре, необходимые для определения страны происхождения 
     * 
     * @return value
     */
    public GoodsInfoOriginCountryType getGoodsInfoOriginCountry() {
        return goodsInfoOriginCountry;
    }

    /** 
     * Set the 'GoodsInfoOriginCountry' element value. Сведения о товаре, необходимые для определения страны происхождения 
     * 
     * @param goodsInfoOriginCountry
     */
    public void setGoodsInfoOriginCountry(
            GoodsInfoOriginCountryType goodsInfoOriginCountry) {
        this.goodsInfoOriginCountry = goodsInfoOriginCountry;
    }

    /** 
     * Get the 'Document' element value. Документ, регламентирующий правила определения страны происхождения товара из конкретной страны или группы стран.
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Документ, регламентирующий правила определения страны происхождения товара из конкретной страны или группы стран.
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись должностного лица таможенного органа
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
