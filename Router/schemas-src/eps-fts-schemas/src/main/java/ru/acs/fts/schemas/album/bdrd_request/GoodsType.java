
package ru.acs.fts.schemas.album.bdrd_request;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private String goodsNumber;
    private String numeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private List<SupplementaryQuantityType> supplementaryQuantityList = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'GoodsNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Номер товара по ДТ
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара по ДТ
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара по ДТ
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
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
     * Get the list of 'SupplementaryQuantity' element items. Количество товара по ДТ
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryQuantityList() {
        return supplementaryQuantityList;
    }

    /** 
     * Set the list of 'SupplementaryQuantity' element items. Количество товара по ДТ
     * 
     * @param list
     */
    public void setSupplementaryQuantityList(
            List<SupplementaryQuantityType> list) {
        supplementaryQuantityList = list;
    }
}
