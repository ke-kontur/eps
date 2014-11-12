
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о продукции
 */
public class GoodsType extends AppendsType
{
    private String productCode;
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String seriesSign;
    private List<String> normDocList = new ArrayList<String>();
    private String partySize;
    private List<String> serialNumberList = new ArrayList<String>();
    private List<DocumentBaseType> shippingDocumentList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'ProductCode' element value. Код продукции по ОК005 - Общероссийскому классификатору продукции
     * 
     * @return value
     */
    public String getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'ProductCode' element value. Код продукции по ОК005 - Общероссийскому классификатору продукции
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара текстовое (наименование, тип, вид, марка продукции, обозначение стандарта, технических условий или иного документа, по которому она выпускается (для импортной продукции ссылка на документ необязательна. Для партии и единичного изделия приводят номер и размер партии или номер изделия, номер и дату выдачи накладной, договора (контракта), документа о качестве и т.п.)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара текстовое (наименование, тип, вид, марка продукции, обозначение стандарта, технических условий или иного документа, по которому она выпускается (для импортной продукции ссылка на документ необязательна. Для партии и единичного изделия приводят номер и размер партии или номер изделия, номер и дату выдачи накладной, договора (контракта), документа о качестве и т.п.)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SeriesSign' element value. Признак: 1 - "единичное изделие", 2 - "партия", 3 - "серийный выпуск"
     * 
     * @return value
     */
    public String getSeriesSign() {
        return seriesSign;
    }

    /** 
     * Set the 'SeriesSign' element value. Признак: 1 - "единичное изделие", 2 - "партия", 3 - "серийный выпуск"
     * 
     * @param seriesSign
     */
    public void setSeriesSign(String seriesSign) {
        this.seriesSign = seriesSign;
    }

    /** 
     * Get the list of 'NormDocs' element items. Обозначение документов, на основании которых произведена продукция
     * 
     * @return list
     */
    public List<String> getNormDocList() {
        return normDocList;
    }

    /** 
     * Set the list of 'NormDocs' element items. Обозначение документов, на основании которых произведена продукция
     * 
     * @param list
     */
    public void setNormDocList(List<String> list) {
        normDocList = list;
    }

    /** 
     * Get the 'PartySize' element value. Размер партии
     * 
     * @return value
     */
    public String getPartySize() {
        return partySize;
    }

    /** 
     * Set the 'PartySize' element value. Размер партии
     * 
     * @param partySize
     */
    public void setPartySize(String partySize) {
        this.partySize = partySize;
    }

    /** 
     * Get the list of 'SerialNumber' element items. Заводской номер изделия
     * 
     * @return list
     */
    public List<String> getSerialNumberList() {
        return serialNumberList;
    }

    /** 
     * Set the list of 'SerialNumber' element items. Заводской номер изделия
     * 
     * @param list
     */
    public void setSerialNumberList(List<String> list) {
        serialNumberList = list;
    }

    /** 
     * Get the list of 'ShippingDocuments' element items. Товаросопроводительные документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getShippingDocumentList() {
        return shippingDocumentList;
    }

    /** 
     * Set the list of 'ShippingDocuments' element items. Товаросопроводительные документы
     * 
     * @param list
     */
    public void setShippingDocumentList(List<DocumentBaseType> list) {
        shippingDocumentList = list;
    }
}
