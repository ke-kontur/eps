
package ru.acs.fts.schemas.album.cmr;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TRPackingInfoType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TransportGoodsType;

/** 
 * Сведения о товарах (гр.6,7,9,10,11,12)
 */
public class CMRGoodsType extends TransportGoodsType
{
    private String goodsQuantity;
    private String grossWeightQuantity;
    private List<TRPackingInfoType> goodsPackingInfoList = new ArrayList<TRPackingInfoType>();

    /** 
     * Get the 'GoodsQuantity' element value. Количество упакованного груза 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество упакованного груза 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the list of 'GoodsPackingInfo' element items. Информация об упаковке груза
     * 
     * @return list
     */
    public List<TRPackingInfoType> getGoodsPackingInfoList() {
        return goodsPackingInfoList;
    }

    /** 
     * Set the list of 'GoodsPackingInfo' element items. Информация об упаковке груза
     * 
     * @param list
     */
    public void setGoodsPackingInfoList(List<TRPackingInfoType> list) {
        goodsPackingInfoList = list;
    }
}
