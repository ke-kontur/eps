
package ru.acs.fts.schemas.album.detaildatard;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о продукции
 */
public class GoodsInfoType
{
    private String goodsKind;
    private List<StructuredTextType> goodsNameList = new ArrayList<StructuredTextType>();
    private List<StructuredTextType> goodsIdentificationList = new ArrayList<StructuredTextType>();

    /** 
     * Get the 'GoodsKind' element value. Тип продукции
     * 
     * @return value
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /** 
     * Set the 'GoodsKind' element value. Тип продукции
     * 
     * @param goodsKind
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }

    /** 
     * Get the list of 'GoodsName' element items. Наименование продукции
     * 
     * @return list
     */
    public List<StructuredTextType> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. Наименование продукции
     * 
     * @param list
     */
    public void setGoodsNameList(List<StructuredTextType> list) {
        goodsNameList = list;
    }

    /** 
     * Get the list of 'GoodsIdentification' element items. Номер и размер партии или номер изделия
     * 
     * @return list
     */
    public List<StructuredTextType> getGoodsIdentificationList() {
        return goodsIdentificationList;
    }

    /** 
     * Set the list of 'GoodsIdentification' element items. Номер и размер партии или номер изделия
     * 
     * @param list
     */
    public void setGoodsIdentificationList(List<StructuredTextType> list) {
        goodsIdentificationList = list;
    }
}
