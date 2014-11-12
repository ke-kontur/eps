
package ru.acs.fts.schemas.album.cwdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ���������� � ������
 */
public class CommodityType extends GoodsBaseType
{
    private String goodsNumberInStorageQuitance;
    private String goodsNumberInGTD;
    private String individualCharacteristics;
    private WHSuppQuantityType goodsValue;

    /** 
     * Get the 'GoodsNumberInStorageQuitance' element value. ���������� ����� ������ � ��������� ���������, �� ������� ����� ������� �� �����
     * 
     * @return value
     */
    public String getGoodsNumberInStorageQuitance() {
        return goodsNumberInStorageQuitance;
    }

    /** 
     * Set the 'GoodsNumberInStorageQuitance' element value. ���������� ����� ������ � ��������� ���������, �� ������� ����� ������� �� �����
     * 
     * @param goodsNumberInStorageQuitance
     */
    public void setGoodsNumberInStorageQuitance(
            String goodsNumberInStorageQuitance) {
        this.goodsNumberInStorageQuitance = goodsNumberInStorageQuitance;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ������ ����
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ������ ����
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'IndividualCharacteristics' element value. �������������� �������� ������
     * 
     * @return value
     */
    public String getIndividualCharacteristics() {
        return individualCharacteristics;
    }

    /** 
     * Set the 'IndividualCharacteristics' element value. �������������� �������� ������
     * 
     * @param individualCharacteristics
     */
    public void setIndividualCharacteristics(String individualCharacteristics) {
        this.individualCharacteristics = individualCharacteristics;
    }

    /** 
     * Get the 'GoodsValue' element value. ���������� ��������� ������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue() {
        return goodsValue;
    }

    /** 
     * Set the 'GoodsValue' element value. ���������� ��������� ������
     * 
     * @param goodsValue
     */
    public void setGoodsValue(WHSuppQuantityType goodsValue) {
        this.goodsValue = goodsValue;
    }
}
