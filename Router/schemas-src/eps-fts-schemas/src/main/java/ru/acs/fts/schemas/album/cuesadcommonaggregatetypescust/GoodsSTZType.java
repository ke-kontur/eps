
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарах, помещенных под таможенную процедуру СТЗ или свободного склада. гр 31 п 11
 */
public class GoodsSTZType
{
    private String lineNumber;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private SupplementaryQuantityType supplementaryQuantity;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();

    /** 
     * Get the 'LineNumber' element value. Порядковый номер строки в гр 40
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Порядковый номер строки в гр 40
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименования товара (торговое, коммерческое или иное традиционное наименование)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименования товара (торговое, коммерческое или иное традиционное наименование)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество товара
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество товара
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }
}
