
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о товарах, ранее поступивших получателю
 */
public class ConsignmentType
{
    private String overWeightSign;
    private String overCostSign;
    private String previousGoodsCost;
    private String previousGoodsGrossWeight;
    private String goodsFrequency;
    private CUOrganizationType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'OverWeightSign' element value. Признак наличия превышения по весу для данной посылки
     * 
     * @return value
     */
    public String getOverWeightSign() {
        return overWeightSign;
    }

    /** 
     * Set the 'OverWeightSign' element value. Признак наличия превышения по весу для данной посылки
     * 
     * @param overWeightSign
     */
    public void setOverWeightSign(String overWeightSign) {
        this.overWeightSign = overWeightSign;
    }

    /** 
     * Get the 'OverCostSign' element value. Признак наличия превышения по стоимости для данной посылки
     * 
     * @return value
     */
    public String getOverCostSign() {
        return overCostSign;
    }

    /** 
     * Set the 'OverCostSign' element value. Признак наличия превышения по стоимости для данной посылки
     * 
     * @param overCostSign
     */
    public void setOverCostSign(String overCostSign) {
        this.overCostSign = overCostSign;
    }

    /** 
     * Get the 'PreviousGoodsCost' element value. Стоимость товаров за календарный месяц, ранее поступивших в адрес получателя, евро
     * 
     * @return value
     */
    public String getPreviousGoodsCost() {
        return previousGoodsCost;
    }

    /** 
     * Set the 'PreviousGoodsCost' element value. Стоимость товаров за календарный месяц, ранее поступивших в адрес получателя, евро
     * 
     * @param previousGoodsCost
     */
    public void setPreviousGoodsCost(String previousGoodsCost) {
        this.previousGoodsCost = previousGoodsCost;
    }

    /** 
     * Get the 'PreviousGoodsGrossWeight' element value. Вес товаров, брутто, за календарный месяц, ранее поступивших в адрес получателя, кг
     * 
     * @return value
     */
    public String getPreviousGoodsGrossWeight() {
        return previousGoodsGrossWeight;
    }

    /** 
     * Set the 'PreviousGoodsGrossWeight' element value. Вес товаров, брутто, за календарный месяц, ранее поступивших в адрес получателя, кг
     * 
     * @param previousGoodsGrossWeight
     */
    public void setPreviousGoodsGrossWeight(String previousGoodsGrossWeight) {
        this.previousGoodsGrossWeight = previousGoodsGrossWeight;
    }

    /** 
     * Get the 'GoodsFrequency' element value. Частота перемещения товаров в адрес получателя
     * 
     * @return value
     */
    public String getGoodsFrequency() {
        return goodsFrequency;
    }

    /** 
     * Set the 'GoodsFrequency' element value. Частота перемещения товаров в адрес получателя
     * 
     * @param goodsFrequency
     */
    public void setGoodsFrequency(String goodsFrequency) {
        this.goodsFrequency = goodsFrequency;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. Перечень ранее поставленных получателю товаров
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Перечень ранее поставленных получателю товаров
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. Сведения о накладной
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. Сведения о накладной
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}
