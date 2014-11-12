
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;

/** 
 * Описание товара
 */
public class TransportGoodsType extends TransportGoodsBaseType
{
    private String goodsNumeric;
    private String goodsNomenclatureCode;
    private List<String> hazardousCargoCodeList = new ArrayList<String>();
    private String volumeQuantity;

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsNomenclatureCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsNomenclatureCode() {
        return goodsNomenclatureCode;
    }

    /** 
     * Set the 'GoodsNomenclatureCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsNomenclatureCode
     */
    public void setGoodsNomenclatureCode(String goodsNomenclatureCode) {
        this.goodsNomenclatureCode = goodsNomenclatureCode;
    }

    /** 
     * Get the list of 'HazardousCargoCode' element items. Код класса опасности груза по МОПОГ/ДОПОГ для опасных грузов
     * 
     * @return list
     */
    public List<String> getHazardousCargoCodeList() {
        return hazardousCargoCodeList;
    }

    /** 
     * Set the list of 'HazardousCargoCode' element items. Код класса опасности груза по МОПОГ/ДОПОГ для опасных грузов
     * 
     * @param list
     */
    public void setHazardousCargoCodeList(List<String> list) {
        hazardousCargoCodeList = list;
    }

    /** 
     * Get the 'VolumeQuantity' element value. Объем товара (груза) в кубометрах
     * 
     * @return value
     */
    public String getVolumeQuantity() {
        return volumeQuantity;
    }

    /** 
     * Set the 'VolumeQuantity' element value. Объем товара (груза) в кубометрах
     * 
     * @param volumeQuantity
     */
    public void setVolumeQuantity(String volumeQuantity) {
        this.volumeQuantity = volumeQuantity;
    }
}
