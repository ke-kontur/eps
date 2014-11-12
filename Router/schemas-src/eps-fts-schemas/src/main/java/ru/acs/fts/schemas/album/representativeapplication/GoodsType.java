
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String goodsCost;
    private String grossWeight;
    private String goodsCostEuro;
    private String goodsCostRuble;
    private List<SupplementaryQuantityType> goodsQuantityList = new ArrayList<SupplementaryQuantityType>();
    private List<PresentedDocumentsType> presentedDocumentList = new ArrayList<PresentedDocumentsType>();

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД 
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД 
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsCost' element value. Стоимость товара в валюте счета (сделки)
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. Стоимость товара в валюте счета (сделки)
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес товара, брутто, кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес товара, брутто, кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. Стоимость товара в евро
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. Стоимость товара в евро
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsCostRuble' element value. Стоимость товара в рублях
     * 
     * @return value
     */
    public String getGoodsCostRuble() {
        return goodsCostRuble;
    }

    /** 
     * Set the 'GoodsCostRuble' element value. Стоимость товара в рублях
     * 
     * @param goodsCostRuble
     */
    public void setGoodsCostRuble(String goodsCostRuble) {
        this.goodsCostRuble = goodsCostRuble;
    }

    /** 
     * Get the list of 'GoodsQuantity' element items. Количество товара в основной (дополнительной) единице измерения
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getGoodsQuantityList() {
        return goodsQuantityList;
    }

    /** 
     * Set the list of 'GoodsQuantity' element items. Количество товара в основной (дополнительной) единице измерения
     * 
     * @param list
     */
    public void setGoodsQuantityList(List<SupplementaryQuantityType> list) {
        goodsQuantityList = list;
    }

    /** 
     * Get the list of 'PresentedDocuments' element items. Сведения о представляемых документах
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocuments' element items. Сведения о представляемых документах
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentsType> list) {
        presentedDocumentList = list;
    }
}
