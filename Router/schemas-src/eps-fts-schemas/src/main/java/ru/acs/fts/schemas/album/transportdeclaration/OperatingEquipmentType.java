
package ru.acs.fts.schemas.album.transportdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Запасные части и оборудование
 */
public class OperatingEquipmentType
{
    private String goodsSign;
    private List<String> equipmentNameList = new ArrayList<String>();
    private SupplementaryQuantityType equipmentDescription;

    /** 
     * Get the 'GoodsSign' element value. Наличие запасных частей и оборудования, предназначенных для ремонта и эксплуатации ТСМП
     * 
     * @return value
     */
    public String getGoodsSign() {
        return goodsSign;
    }

    /** 
     * Set the 'GoodsSign' element value. Наличие запасных частей и оборудования, предназначенных для ремонта и эксплуатации ТСМП
     * 
     * @param goodsSign
     */
    public void setGoodsSign(String goodsSign) {
        this.goodsSign = goodsSign;
    }

    /** 
     * Get the list of 'EquipmentName' element items. Наименование запасных частей и оборудования
     * 
     * @return list
     */
    public List<String> getEquipmentNameList() {
        return equipmentNameList;
    }

    /** 
     * Set the list of 'EquipmentName' element items. Наименование запасных частей и оборудования
     * 
     * @param list
     */
    public void setEquipmentNameList(List<String> list) {
        equipmentNameList = list;
    }

    /** 
     * Get the 'EquipmentDescription' element value. Краткое описание и количество запасных частей и оборудования
     * 
     * @return value
     */
    public SupplementaryQuantityType getEquipmentDescription() {
        return equipmentDescription;
    }

    /** 
     * Set the 'EquipmentDescription' element value. Краткое описание и количество запасных частей и оборудования
     * 
     * @param equipmentDescription
     */
    public void setEquipmentDescription(
            SupplementaryQuantityType equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }
}
