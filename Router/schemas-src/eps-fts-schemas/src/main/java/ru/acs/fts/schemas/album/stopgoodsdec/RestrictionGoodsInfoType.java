
package ru.acs.fts.schemas.album.stopgoodsdec;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о товаре, на который наложено ограничение
 */
public class RestrictionGoodsInfoType
{
    private List<String> counterfeitSignList = new ArrayList<String>();
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String intellectualPropertyObject;
    private List<DocumentBaseType> goodsDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'CounterfeitSigns' element items. Признаки контрафактности
     * 
     * @return list
     */
    public List<String> getCounterfeitSignList() {
        return counterfeitSignList;
    }

    /** 
     * Set the list of 'CounterfeitSigns' element items. Признаки контрафактности
     * 
     * @param list
     */
    public void setCounterfeitSignList(List<String> list) {
        counterfeitSignList = list;
    }

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescriptions' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescriptions' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'IntellectualPropertyObject' element value. Объект интеллектуальной собственности
     * 
     * @return value
     */
    public String getIntellectualPropertyObject() {
        return intellectualPropertyObject;
    }

    /** 
     * Set the 'IntellectualPropertyObject' element value. Объект интеллектуальной собственности
     * 
     * @param intellectualPropertyObject
     */
    public void setIntellectualPropertyObject(String intellectualPropertyObject) {
        this.intellectualPropertyObject = intellectualPropertyObject;
    }

    /** 
     * Get the list of 'GoodsDoc' element items. Документ на товар, содержащий сведения о его идентификации
     * 
     * @return list
     */
    public List<DocumentBaseType> getGoodsDocList() {
        return goodsDocList;
    }

    /** 
     * Set the list of 'GoodsDoc' element items. Документ на товар, содержащий сведения о его идентификации
     * 
     * @param list
     */
    public void setGoodsDocList(List<DocumentBaseType> list) {
        goodsDocList = list;
    }
}
