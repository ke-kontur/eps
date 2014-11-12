
package ru.acs.fts.schemas.album.preliminarytnvedcode;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Предварительное решение по классификации товара в соответствии с ТН ВЭД ТС 
 */
public class PreliminaryTNVEDCodeType extends BaseDocType
{
    private LocalDate date;
    private String TNVEDCode;
    private List<String> goodsInfoTNVEDCodeList = new ArrayList<String>();
    private List<String> rationaleDecisionList = new ArrayList<String>();
    private List<String> markList = new ArrayList<String>();
    private CustomsType customs;
    private DeclarantType declarant;
    private RegistrationNumberType registrationNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
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
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the list of 'GoodsInfoTNVEDCode' element items. Сведения о товаре, необходимые для классификации
     * 
     * @return list
     */
    public List<String> getGoodsInfoTNVEDCodeList() {
        return goodsInfoTNVEDCodeList;
    }

    /** 
     * Set the list of 'GoodsInfoTNVEDCode' element items. Сведения о товаре, необходимые для классификации
     * 
     * @param list
     */
    public void setGoodsInfoTNVEDCodeList(List<String> list) {
        goodsInfoTNVEDCodeList = list;
    }

    /** 
     * Get the list of 'RationaleDecision' element items. Обоснование принятия решения
     * 
     * @return list
     */
    public List<String> getRationaleDecisionList() {
        return rationaleDecisionList;
    }

    /** 
     * Set the list of 'RationaleDecision' element items. Обоснование принятия решения
     * 
     * @param list
     */
    public void setRationaleDecisionList(List<String> list) {
        rationaleDecisionList = list;
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
