
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ����������� �����
 */
public class GoodsInfoType
{
    private String weightUnitQualifierCode;
    private String goodsVolume;
    private List<String> cargoDescriptionList = new ArrayList<String>();
    private String grossWeightQuantity;
    private PackingInfoType packingInfo;

    /** 
     * Get the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������(���������� ��� �����)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������(���������� ��� �����)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GoodsVolume' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. ����� ������
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the list of 'CargoDescription' element items. �������� �����
     * 
     * @return list
     */
    public List<String> getCargoDescriptionList() {
        return cargoDescriptionList;
    }

    /** 
     * Set the list of 'CargoDescription' element items. �������� �����
     * 
     * @param list
     */
    public void setCargoDescriptionList(List<String> list) {
        cargoDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'PackingInfo' element value. �������� �� �������� � �������� ������
     * 
     * @return value
     */
    public PackingInfoType getPackingInfo() {
        return packingInfo;
    }

    /** 
     * Set the 'PackingInfo' element value. �������� �� �������� � �������� ������
     * 
     * @param packingInfo
     */
    public void setPackingInfo(PackingInfoType packingInfo) {
        this.packingInfo = packingInfo;
    }
}
