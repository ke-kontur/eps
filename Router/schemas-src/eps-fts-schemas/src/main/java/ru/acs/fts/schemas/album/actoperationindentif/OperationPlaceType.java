
package ru.acs.fts.schemas.album.actoperationindentif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * �������� ����� ���������� �������� �� ���������, ��������, ����������� ��� ������ ������� �������������
 */
public class OperationPlaceType extends CUCustomsType
{
    private String informationTypeCode;
    private String inspPlaceName;
    private List<String> inspPlaceDescList = new ArrayList<String>();
    private WarehousePlaceType warehousePlace;
    private AddressType address;

    /** 
     * Get the 'InformationTypeCode' element value. ��� ����������: 11- ���;  21- ��; 25 - ��������� �����; 31- ����� ����������; 41 - ����� �������� ����������� ������� (��� ��); 52 - ������������ �������� (��� ��); 60 - ��������� (��������) ���; 72 - ��� (��� ��); 91 - ����� ����� ��������  (��� ��); 99 - ���� ����� ��, 80- ���
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. ��� ����������: 11- ���;  21- ��; 25 - ��������� �����; 31- ����� ����������; 41 - ����� �������� ����������� ������� (��� ��); 52 - ������������ �������� (��� ��); 60 - ��������� (��������) ���; 72 - ��� (��� ��); 91 - ����� ����� ��������  (��� ��); 99 - ���� ����� ��, 80- ���
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'InspPlaceName' element value. ������������ ����� ��������, ���, �/� �������
     * 
     * @return value
     */
    public String getInspPlaceName() {
        return inspPlaceName;
    }

    /** 
     * Set the 'InspPlaceName' element value. ������������ ����� ��������, ���, �/� �������
     * 
     * @param inspPlaceName
     */
    public void setInspPlaceName(String inspPlaceName) {
        this.inspPlaceName = inspPlaceName;
    }

    /** 
     * Get the list of 'InspPlaceDesc' element items. �������� ����� ���������� ��������. ���� ���������� � ����� ��������
     * 
     * @return list
     */
    public List<String> getInspPlaceDescList() {
        return inspPlaceDescList;
    }

    /** 
     * Set the list of 'InspPlaceDesc' element items. �������� ����� ���������� ��������. ���� ���������� � ����� ��������
     * 
     * @param list
     */
    public void setInspPlaceDescList(List<String> list) {
        inspPlaceDescList = list;
    }

    /** 
     * Get the 'WarehousePlace' element value. ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. ����� ��������/���������. �������� � ��������/ ������������� ������.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the 'Address' element value. ����� 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
