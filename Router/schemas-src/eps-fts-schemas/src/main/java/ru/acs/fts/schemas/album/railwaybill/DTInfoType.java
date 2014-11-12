
package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� �� ���������� �� ������
 */
public class DTInfoType
{
    private String goodsNumeric;
    private GTDIDType DTNumber;

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'DTNumber' element value. ��������������� ����� ���������� �� ������
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ��������������� ����� ���������� �� ������
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }
}
