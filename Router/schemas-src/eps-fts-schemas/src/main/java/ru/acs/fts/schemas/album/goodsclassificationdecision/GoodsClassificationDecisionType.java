
package ru.acs.fts.schemas.album.goodsclassificationdecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Решение о классификации товара
 */
public class GoodsClassificationDecisionType extends BaseDocType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVED;
    private String comments;
    private CustomsType customs;
    private RegistryNumberType registryNumber;
    private PersonSignatureType customsPerson;
    private String documentModeID;

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара (торговое, коммерческое или иное традиционное наименование), краткое описание
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара (торговое, коммерческое или иное традиционное наименование), краткое описание
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsTNVED' element value. Классификационный код по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVED() {
        return goodsTNVED;
    }

    /** 
     * Set the 'GoodsTNVED' element value. Классификационный код по ТН ВЭД ТС
     * 
     * @param goodsTNVED
     */
    public void setGoodsTNVED(String goodsTNVED) {
        this.goodsTNVED = goodsTNVED;
    }

    /** 
     * Get the 'Comments' element value. Служебные отметки
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Служебные отметки
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * Get the 'RegistryNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public RegistryNumberType getRegistryNumber() {
        return registryNumber;
    }

    /** 
     * Set the 'RegistryNumber' element value. Регистрационный номер
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(RegistryNumberType registryNumber) {
        this.registryNumber = registryNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
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
