
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGoodsLocationPlaceType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUTransportType;

/** 
 * ��������������� �������. ��. 30
 */
public class KDTGoodsLocationType
{
    private String informationTypeCode;
    private String customsOffice;
    private String customsCountryCode;
    private String locationName;
    private CUWarehousePlaceType goodsLocationWarehouse;
    private CUGoodsLocationPlaceType goodsLocationPlace;
    private CUTransportType transport;
    private AddressType address;

    /** 
     * Get the 'InformationTypeCode' element value. ��� ����� ���������� ������� � ������������ c ��������������� ���� ���������� �������
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. ��� ����� ���������� ������� � ������������ c ��������������� ���� ���������� �������
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'CustomsOffice' element value. ��� ����������� ������ � ������������ � ���������������� ���������� �������, ������������ � ������������ - ������ ����������� �����
     * 
     * @return value
     */
    public String getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ��� ����������� ������ � ������������ � ���������������� ���������� �������, ������������ � ������������ - ������ ����������� �����
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(String customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ������ ����������� ������
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }

    /** 
     * Get the 'LocationName' element value. ������������ ��������������� �������/�������� (�������) �����
     * 
     * @return value
     */
    public String getLocationName() {
        return locationName;
    }

    /** 
     * Set the 'LocationName' element value. ������������ ��������������� �������/�������� (�������) �����
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /** 
     * Get the 'GoodsLocationWarehouse' element value. �������� � ��������������� �������: ���������� ����������� ������ �� ��������� �������� �������, ����� ���������� ��������, ���������� �����, ��������� �����, ������� ������������ ��������, ���������, �������� �������� � ���� ���������� ��������������� �������������� ���������, ����� �������� ����������� �������, ����� ���������� �������
     * 
     * @return value
     */
    public CUWarehousePlaceType getGoodsLocationWarehouse() {
        return goodsLocationWarehouse;
    }

    /** 
     * Set the 'GoodsLocationWarehouse' element value. �������� � ��������������� �������: ���������� ����������� ������ �� ��������� �������� �������, ����� ���������� ��������, ���������� �����, ��������� �����, ������� ������������ ��������, ���������, �������� �������� � ���� ���������� ��������������� �������������� ���������, ����� �������� ����������� �������, ����� ���������� �������
     * 
     * @param goodsLocationWarehouse
     */
    public void setGoodsLocationWarehouse(
            CUWarehousePlaceType goodsLocationWarehouse) {
        this.goodsLocationWarehouse = goodsLocationWarehouse;
    }

    /** 
     * Get the 'GoodsLocationPlace' element value. �������� � ��������������� �������
     * 
     * @return value
     */
    public CUGoodsLocationPlaceType getGoodsLocationPlace() {
        return goodsLocationPlace;
    }

    /** 
     * Set the 'GoodsLocationPlace' element value. �������� � ��������������� �������
     * 
     * @param goodsLocationPlace
     */
    public void setGoodsLocationPlace(
            CUGoodsLocationPlaceType goodsLocationPlace) {
        this.goodsLocationPlace = goodsLocationPlace;
    }

    /** 
     * Get the 'Transport' element value. �������� � ��������������� ������� - ������������ ��������
     * 
     * @return value
     */
    public CUTransportType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. �������� � ��������������� ������� - ������������ ��������
     * 
     * @param transport
     */
    public void setTransport(CUTransportType transport) {
        this.transport = transport;
    }

    /** 
     * Get the 'Address' element value. ����� ��������������� �������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ��������������� �������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
