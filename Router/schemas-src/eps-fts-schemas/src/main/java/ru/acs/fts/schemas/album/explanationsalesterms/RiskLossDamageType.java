
package ru.acs.fts.schemas.album.explanationsalesterms;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ����� �������������� ������� ����� ������/����� ������ �� ����������
 */
public class RiskLossDamageType
{
    private String warehouse;
    private String disposition;
    private String processDelivery;
    private String commentsProcessDelivery;
    private String placeDelivery;
    private String otherPlace;
    private List<AddressType> addressList = new ArrayList<AddressType>();

    /** 
     * Get the 'Warehouse' element value. ������� �������� ����� ������/����� ������ �� ���������� �� ������ �����������
     * 
     * @return value
     */
    public String getWarehouse() {
        return warehouse;
    }

    /** 
     * Set the 'Warehouse' element value. ������� �������� ����� ������/����� ������ �� ���������� �� ������ �����������
     * 
     * @param warehouse
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    /** 
     * Get the 'Disposition' element value. ������� �������� ����� ������/����� ������ �� ���������� ����� �������� ����, ���������������
     * 
     * @return value
     */
    public String getDisposition() {
        return disposition;
    }

    /** 
     * Set the 'Disposition' element value. ������� �������� ����� ������/����� ������ �� ���������� ����� �������� ����, ���������������
     * 
     * @param disposition
     */
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /** 
     * Get the 'ProcessDelivery' element value. ������� �������� ����� ������/����� ������ �� ���������� � �������� ��������
     * 
     * @return value
     */
    public String getProcessDelivery() {
        return processDelivery;
    }

    /** 
     * Set the 'ProcessDelivery' element value. ������� �������� ����� ������/����� ������ �� ���������� � �������� ��������
     * 
     * @param processDelivery
     */
    public void setProcessDelivery(String processDelivery) {
        this.processDelivery = processDelivery;
    }

    /** 
     * Get the 'CommentsProcessDelivery' element value. � �������� �������� (�����������)
     * 
     * @return value
     */
    public String getCommentsProcessDelivery() {
        return commentsProcessDelivery;
    }

    /** 
     * Set the 'CommentsProcessDelivery' element value. � �������� �������� (�����������)
     * 
     * @param commentsProcessDelivery
     */
    public void setCommentsProcessDelivery(String commentsProcessDelivery) {
        this.commentsProcessDelivery = commentsProcessDelivery;
    }

    /** 
     * Get the 'PlaceDelivery' element value. ������� �������� ����� ������/����� ������ �� ���������� � ����� ��������
     * 
     * @return value
     */
    public String getPlaceDelivery() {
        return placeDelivery;
    }

    /** 
     * Set the 'PlaceDelivery' element value. ������� �������� ����� ������/����� ������ �� ���������� � ����� ��������
     * 
     * @param placeDelivery
     */
    public void setPlaceDelivery(String placeDelivery) {
        this.placeDelivery = placeDelivery;
    }

    /** 
     * Get the 'OtherPlace' element value. ������� �������� ����� ������/����� ������ �� ���������� � ���� �����
     * 
     * @return value
     */
    public String getOtherPlace() {
        return otherPlace;
    }

    /** 
     * Set the 'OtherPlace' element value. ������� �������� ����� ������/����� ������ �� ���������� � ���� �����
     * 
     * @param otherPlace
     */
    public void setOtherPlace(String otherPlace) {
        this.otherPlace = otherPlace;
    }

    /** 
     * Get the list of 'Address' element items. ����� 
     * 
     * @return list
     */
    public List<AddressType> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items. ����� 
     * 
     * @param list
     */
    public void setAddressList(List<AddressType> list) {
        addressList = list;
    }
}
