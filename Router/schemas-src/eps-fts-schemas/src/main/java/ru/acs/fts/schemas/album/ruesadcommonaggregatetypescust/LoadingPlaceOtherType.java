
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ����� ��������/���������. ���� ����� �������� �������.
 */
public class LoadingPlaceOtherType
{
    private String goodsLoadingPlaceDesc;
    private String customsOfficeID;

    /** 
     * Get the 'GoodsLoadingPlaceDesc' element value. ����� ���������� / �������� ������� / �������� �������� ��� ������� ����� 
     * 
     * @return value
     */
    public String getGoodsLoadingPlaceDesc() {
        return goodsLoadingPlaceDesc;
    }

    /** 
     * Set the 'GoodsLoadingPlaceDesc' element value. ����� ���������� / �������� ������� / �������� �������� ��� ������� ����� 
     * 
     * @param goodsLoadingPlaceDesc
     */
    public void setGoodsLoadingPlaceDesc(String goodsLoadingPlaceDesc) {
        this.goodsLoadingPlaceDesc = goodsLoadingPlaceDesc;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. ��� ����������� ������, ��������� ���/��/ ��� ����������� ������, � ������� ������������ �������� ��������� �����  ��������� �������. 
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. ��� ����������� ������, ��������� ���/��/ ��� ����������� ������, � ������� ������������ �������� ��������� �����  ��������� �������. 
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }
}
