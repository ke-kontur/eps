
package ru.acs.fts.schemas.album.do2report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhCustomDocumentType;

/** 
 * Комплексный тип для описания товаров, выпускаемых со склада по отчету ДО2
 */
public class DO2GoodsShipmentType
{
    private String MPOSign;
    private List<WhCustomDocumentType> customsDocList = new ArrayList<WhCustomDocumentType>();
    private List<DO2GoodCustomDocLinkType> goodsCustomDocsLinkList = new ArrayList<DO2GoodCustomDocLinkType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'MPOSign' element value. Признак оформления МПО
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. Признак оформления МПО
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the list of 'CustomsDocs' element items. Таможенные документы, на основании которых осуществляется выдача
     * 
     * @return list
     */
    public List<WhCustomDocumentType> getCustomsDocList() {
        return customsDocList;
    }

    /** 
     * Set the list of 'CustomsDocs' element items. Таможенные документы, на основании которых осуществляется выдача
     * 
     * @param list
     */
    public void setCustomsDocList(List<WhCustomDocumentType> list) {
        customsDocList = list;
    }

    /** 
     * Get the list of 'GoodsCustomDocsLinks' element items. Данные о соответствии выдаваемых товаров выдающим таможенным документам
     * 
     * @return list
     */
    public List<DO2GoodCustomDocLinkType> getGoodsCustomDocsLinkList() {
        return goodsCustomDocsLinkList;
    }

    /** 
     * Set the list of 'GoodsCustomDocsLinks' element items. Данные о соответствии выдаваемых товаров выдающим таможенным документам
     * 
     * @param list
     */
    public void setGoodsCustomDocsLinkList(List<DO2GoodCustomDocLinkType> list) {
        goodsCustomDocsLinkList = list;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
