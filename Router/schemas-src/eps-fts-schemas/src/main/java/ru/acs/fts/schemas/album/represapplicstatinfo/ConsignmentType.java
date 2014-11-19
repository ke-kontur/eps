
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * —ведени€ о товарах, ранее поступивших получателю
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
     * Get the 'OverWeightSign' element value. ѕризнак наличи€ превышени€ по весу дл€ данной посылки
     * 
     * @return value
     */
    public String getOverWeightSign() {
        return overWeightSign;
    }

    /** 
     * Set the 'OverWeightSign' element value. ѕризнак наличи€ превышени€ по весу дл€ данной посылки
     * 
     * @param overWeightSign
     */
    public void setOverWeightSign(String overWeightSign) {
        this.overWeightSign = overWeightSign;
    }

    /** 
     * Get the 'OverCostSign' element value. ѕризнак наличи€ превышени€ по стоимости дл€ данной посылки
     * 
     * @return value
     */
    public String getOverCostSign() {
        return overCostSign;
    }

    /** 
     * Set the 'OverCostSign' element value. ѕризнак наличи€ превышени€ по стоимости дл€ данной посылки
     * 
     * @param overCostSign
     */
    public void setOverCostSign(String overCostSign) {
        this.overCostSign = overCostSign;
    }

    /** 
     * Get the 'PreviousGoodsCost' element value. —тоимость товаров за календарный мес€ц, ранее поступивших в адрес получател€, евро
     * 
     * @return value
     */
    public String getPreviousGoodsCost() {
        return previousGoodsCost;
    }

    /** 
     * Set the 'PreviousGoodsCost' element value. —тоимость товаров за календарный мес€ц, ранее поступивших в адрес получател€, евро
     * 
     * @param previousGoodsCost
     */
    public void setPreviousGoodsCost(String previousGoodsCost) {
        this.previousGoodsCost = previousGoodsCost;
    }

    /** 
     * Get the 'PreviousGoodsGrossWeight' element value. ¬ес товаров, брутто, за календарный мес€ц, ранее поступивших в адрес получател€, кг
     * 
     * @return value
     */
    public String getPreviousGoodsGrossWeight() {
        return previousGoodsGrossWeight;
    }

    /** 
     * Set the 'PreviousGoodsGrossWeight' element value. ¬ес товаров, брутто, за календарный мес€ц, ранее поступивших в адрес получател€, кг
     * 
     * @param previousGoodsGrossWeight
     */
    public void setPreviousGoodsGrossWeight(String previousGoodsGrossWeight) {
        this.previousGoodsGrossWeight = previousGoodsGrossWeight;
    }

    /** 
     * Get the 'GoodsFrequency' element value. „астота перемещени€ товаров в адрес получател€
     * 
     * @return value
     */
    public String getGoodsFrequency() {
        return goodsFrequency;
    }

    /** 
     * Set the 'GoodsFrequency' element value. „астота перемещени€ товаров в адрес получател€
     * 
     * @param goodsFrequency
     */
    public void setGoodsFrequency(String goodsFrequency) {
        this.goodsFrequency = goodsFrequency;
    }

    /** 
     * Get the 'Consignee' element value. ѕолучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ѕолучатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. ѕеречень ранее поставленных получателю товаров
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. ѕеречень ранее поставленных получателю товаров
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. —ведени€ о накладной
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. —ведени€ о накладной
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}
