
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товаров
 */
public class GoodsDescriptionType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String contractCost;
    private String statisticalCost;
    private String contractCurrency;
    private String goodNumber;
    private String goodMark;
    private SupplementaryQuantityType quantity;
    private SupplementaryQuantityType supplementaryQuantity;

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
     * Get the 'ContractCost' element value. Стоимость товара (в валюте контракта)
     * 
     * @return value
     */
    public String getContractCost() {
        return contractCost;
    }

    /** 
     * Set the 'ContractCost' element value. Стоимость товара (в валюте контракта)
     * 
     * @param contractCost
     */
    public void setContractCost(String contractCost) {
        this.contractCost = contractCost;
    }

    /** 
     * Get the 'StatisticalCost' element value. Статистическая стоимость товара (USD)
     * 
     * @return value
     */
    public String getStatisticalCost() {
        return statisticalCost;
    }

    /** 
     * Set the 'StatisticalCost' element value. Статистическая стоимость товара (USD)
     * 
     * @param statisticalCost
     */
    public void setStatisticalCost(String statisticalCost) {
        this.statisticalCost = statisticalCost;
    }

    /** 
     * Get the 'ContractCurrency' element value. Валюта контракта
     * 
     * @return value
     */
    public String getContractCurrency() {
        return contractCurrency;
    }

    /** 
     * Set the 'ContractCurrency' element value. Валюта контракта
     * 
     * @param contractCurrency
     */
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    /** 
     * Get the 'GoodNumber' element value. Номер товара
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. Номер товара
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'GoodMark' element value. Марка товара
     * 
     * @return value
     */
    public String getGoodMark() {
        return goodMark;
    }

    /** 
     * Set the 'GoodMark' element value. Марка товара
     * 
     * @param goodMark
     */
    public void setGoodMark(String goodMark) {
        this.goodMark = goodMark;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }
}
