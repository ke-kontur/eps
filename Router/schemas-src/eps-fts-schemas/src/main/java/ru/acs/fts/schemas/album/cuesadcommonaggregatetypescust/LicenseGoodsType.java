
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * �������� � ������������� ������ �� ��������
 */
public class LicenseGoodsType
{
    private String appNumber;
    private String goodsNumericLic;

    /** 
     * Get the 'AppNumber' element value. ����� ����������/ ������� � �������� 
     * 
     * @return value
     */
    public String getAppNumber() {
        return appNumber;
    }

    /** 
     * Set the 'AppNumber' element value. ����� ����������/ ������� � �������� 
     * 
     * @param appNumber
     */
    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    /** 
     * Get the 'GoodsNumericLic' element value. ���������� ����� �������������� ������ �� ����������/������� � ��������
     * 
     * @return value
     */
    public String getGoodsNumericLic() {
        return goodsNumericLic;
    }

    /** 
     * Set the 'GoodsNumericLic' element value. ���������� ����� �������������� ������ �� ����������/������� � ��������
     * 
     * @param goodsNumericLic
     */
    public void setGoodsNumericLic(String goodsNumericLic) {
        this.goodsNumericLic = goodsNumericLic;
    }
}
