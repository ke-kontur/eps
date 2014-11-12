
package ru.acs.fts.schemas.album.requestmca;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ���������� � ��������� ���������, ���������� � ���� ��� ������� ����������
 */
public class ITSRequestInfoMCAType
{
    private String netWeight;
    private String grossWeight;
    private String customsCostRUB;
    private SupplementaryQuantityType goodsQuantity;

    /** 
     * Get the 'NetWeight' element value. ��� �����
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ��� �����
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'CustomsCostRUB' element value. ���������� ��������� (� ������)
     * 
     * @return value
     */
    public String getCustomsCostRUB() {
        return customsCostRUB;
    }

    /** 
     * Set the 'CustomsCostRUB' element value. ���������� ��������� (� ������)
     * 
     * @param customsCostRUB
     */
    public void setCustomsCostRUB(String customsCostRUB) {
        this.customsCostRUB = customsCostRUB;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� � ���
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� � ���
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }
}
