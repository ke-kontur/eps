
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Список товаров
 */
public class GoodsListType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String numberSentGoods;
    private String numberReturnGoods;
    private String numberSoldGoods;
    private String priceUnit;
    private String priceGoods;
    private String PLUCode;
    private String currencyCode;
    private List<String> commentList = new ArrayList<String>();

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
     * Get the 'NumberSentGoods' element value. Количество отправленного товара
     * 
     * @return value
     */
    public String getNumberSentGoods() {
        return numberSentGoods;
    }

    /** 
     * Set the 'NumberSentGoods' element value. Количество отправленного товара
     * 
     * @param numberSentGoods
     */
    public void setNumberSentGoods(String numberSentGoods) {
        this.numberSentGoods = numberSentGoods;
    }

    /** 
     * Get the 'NumberReturnGoods' element value. Возращено товара
     * 
     * @return value
     */
    public String getNumberReturnGoods() {
        return numberReturnGoods;
    }

    /** 
     * Set the 'NumberReturnGoods' element value. Возращено товара
     * 
     * @param numberReturnGoods
     */
    public void setNumberReturnGoods(String numberReturnGoods) {
        this.numberReturnGoods = numberReturnGoods;
    }

    /** 
     * Get the 'NumberSoldGoods' element value. Продано товара
     * 
     * @return value
     */
    public String getNumberSoldGoods() {
        return numberSoldGoods;
    }

    /** 
     * Set the 'NumberSoldGoods' element value. Продано товара
     * 
     * @param numberSoldGoods
     */
    public void setNumberSoldGoods(String numberSoldGoods) {
        this.numberSoldGoods = numberSoldGoods;
    }

    /** 
     * Get the 'PriceUnit' element value. Стоимость за единицу товара 
     * 
     * @return value
     */
    public String getPriceUnit() {
        return priceUnit;
    }

    /** 
     * Set the 'PriceUnit' element value. Стоимость за единицу товара 
     * 
     * @param priceUnit
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    /** 
     * Get the 'PriceGoods' element value. Стоимость проданного товара
     * 
     * @return value
     */
    public String getPriceGoods() {
        return priceGoods;
    }

    /** 
     * Set the 'PriceGoods' element value. Стоимость проданного товара
     * 
     * @param priceGoods
     */
    public void setPriceGoods(String priceGoods) {
        this.priceGoods = priceGoods;
    }

    /** 
     * Get the 'PLUCode' element value. Код PLU
     * 
     * @return value
     */
    public String getPLUCode() {
        return PLUCode;
    }

    /** 
     * Set the 'PLUCode' element value. Код PLU
     * 
     * @param PLUCode
     */
    public void setPLUCode(String PLUCode) {
        this.PLUCode = PLUCode;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'Comments' element items. Примечания
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Примечания
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }
}
