
package ru.acs.fts.schemas.album.transportdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ����� � ������������
 */
public class OperatingEquipmentType
{
    private String goodsSign;
    private List<String> equipmentNameList = new ArrayList<String>();
    private SupplementaryQuantityType equipmentDescription;

    /** 
     * Get the 'GoodsSign' element value. ������� �������� ������ � ������������, ��������������� ��� ������� � ������������ ����
     * 
     * @return value
     */
    public String getGoodsSign() {
        return goodsSign;
    }

    /** 
     * Set the 'GoodsSign' element value. ������� �������� ������ � ������������, ��������������� ��� ������� � ������������ ����
     * 
     * @param goodsSign
     */
    public void setGoodsSign(String goodsSign) {
        this.goodsSign = goodsSign;
    }

    /** 
     * Get the list of 'EquipmentName' element items. ������������ �������� ������ � ������������
     * 
     * @return list
     */
    public List<String> getEquipmentNameList() {
        return equipmentNameList;
    }

    /** 
     * Set the list of 'EquipmentName' element items. ������������ �������� ������ � ������������
     * 
     * @param list
     */
    public void setEquipmentNameList(List<String> list) {
        equipmentNameList = list;
    }

    /** 
     * Get the 'EquipmentDescription' element value. ������� �������� � ���������� �������� ������ � ������������
     * 
     * @return value
     */
    public SupplementaryQuantityType getEquipmentDescription() {
        return equipmentDescription;
    }

    /** 
     * Set the 'EquipmentDescription' element value. ������� �������� � ���������� �������� ������ � ������������
     * 
     * @param equipmentDescription
     */
    public void setEquipmentDescription(
            SupplementaryQuantityType equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }
}
