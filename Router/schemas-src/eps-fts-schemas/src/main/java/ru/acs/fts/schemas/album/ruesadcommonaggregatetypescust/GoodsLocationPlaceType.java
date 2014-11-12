
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � ��������������� ������. (����� ����������, ���� �����).
 */
public class GoodsLocationPlaceType
{
    private String goodsLocationPlaceDesc;
    private String customsOfficeID;
    private String railwayStationCode;
    private String railwayStationName;
    private AddressType address;

    /** 
     * Get the 'GoodsLocationPlaceDesc' element value. ����� ���������� �������/����� ���������� (����� �������� �/� ������� / �������������� / ���������������)
     * 
     * @return value
     */
    public String getGoodsLocationPlaceDesc() {
        return goodsLocationPlaceDesc;
    }

    /** 
     * Set the 'GoodsLocationPlaceDesc' element value. ����� ���������� �������/����� ���������� (����� �������� �/� ������� / �������������� / ���������������)
     * 
     * @param goodsLocationPlaceDesc
     */
    public void setGoodsLocationPlaceDesc(String goodsLocationPlaceDesc) {
        this.goodsLocationPlaceDesc = goodsLocationPlaceDesc;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. ��� ����������� ������  � ������� ������������ �������� ��������� ����� ����������,  �������� �������.
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. ��� ����������� ������  � ������� ������������ �������� ��������� ����� ����������,  �������� �������.
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }

    /** 
     * Get the 'RailwayStationCode' element value. ��� �/� ������� ��������������� ������.
     * 
     * @return value
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /** 
     * Set the 'RailwayStationCode' element value. ��� �/� ������� ��������������� ������.
     * 
     * @param railwayStationCode
     */
    public void setRailwayStationCode(String railwayStationCode) {
        this.railwayStationCode = railwayStationCode;
    }

    /** 
     * Get the 'RailwayStationName' element value. ������������ �/� ������� ��������������� ������.
     * 
     * @return value
     */
    public String getRailwayStationName() {
        return railwayStationName;
    }

    /** 
     * Set the 'RailwayStationName' element value. ������������ �/� ������� ��������������� ������.
     * 
     * @param railwayStationName
     */
    public void setRailwayStationName(String railwayStationName) {
        this.railwayStationName = railwayStationName;
    }

    /** 
     * Get the 'Address' element value. ������ ����� ��������������� �������. 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ������ ����� ��������������� �������. 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
