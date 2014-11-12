
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товара
 */
public class GoodsDescriptionType
{
    private List<String> goodNameList = new ArrayList<String>();
    private String TNVED;
    private String departureCountry;
    private String originCountry;
    private SupplementaryQuantityType quantity;
    private SupplementaryQuantityType addQuantity;

    /** 
     * Get the list of 'GoodName' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodNameList() {
        return goodNameList;
    }

    /** 
     * Set the list of 'GoodName' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodNameList(List<String> list) {
        goodNameList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'DepartureCountry' element value. Страна отправления
     * 
     * @return value
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. Страна отправления
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'OriginCountry' element value. Страна происхождения
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. Страна происхождения
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
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
     * Get the 'AddQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param addQuantity
     */
    public void setAddQuantity(SupplementaryQuantityType addQuantity) {
        this.addQuantity = addQuantity;
    }
}
