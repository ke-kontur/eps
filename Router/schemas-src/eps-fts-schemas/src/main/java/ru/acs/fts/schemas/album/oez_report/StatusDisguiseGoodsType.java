
package ru.acs.fts.schemas.album.oez_report;

/** 
 * �������� ������� � �������� ��������
 */
public class StatusDisguiseGoodsType
{
    private String OEZClosedQuantity;
    private String lostGoodsQuantity;

    /** 
     * Get the 'OEZClosedQuantity' element value. ���������� ������, � ��������� ������� ���������� ��������� ��� ��������� ��� ����������� ���������������� ���
     * 
     * @return value
     */
    public String getOEZClosedQuantity() {
        return OEZClosedQuantity;
    }

    /** 
     * Set the 'OEZClosedQuantity' element value. ���������� ������, � ��������� ������� ���������� ��������� ��� ��������� ��� ����������� ���������������� ���
     * 
     * @param OEZClosedQuantity
     */
    public void setOEZClosedQuantity(String OEZClosedQuantity) {
        this.OEZClosedQuantity = OEZClosedQuantity;
    }

    /** 
     * Get the 'LostGoodsQuantity' element value. ���������� ������, ��������������  �������� ����� �����
     * 
     * @return value
     */
    public String getLostGoodsQuantity() {
        return lostGoodsQuantity;
    }

    /** 
     * Set the 'LostGoodsQuantity' element value. ���������� ������, ��������������  �������� ����� �����
     * 
     * @param lostGoodsQuantity
     */
    public void setLostGoodsQuantity(String lostGoodsQuantity) {
        this.lostGoodsQuantity = lostGoodsQuantity;
    }
}
