
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * �������� � ��������� �������. ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29  -��/ ��. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ��
 */
public class ESADConsigmentType
{
    private String containerIndicator;
    private String dispatchCountryCode;
    private String RBDispatchCountryCode;
    private String dispatchCountryName;
    private String destinationCountryCode;
    private String destinationCountryName;
    private String RBDestinationCountryCode;
    private CUCustomsType deliveryCustomsOffice;
    private List<CUCustomsType> borderCustomsOfficeList = new ArrayList<CUCustomsType>();

    /** 
     * Get the 'ContainerIndicator' element value. ������� ������������ ���������. ��.19 
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. ������� ������������ ���������. ��.19 
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. ������ �����������. ��������� ��� ��  �������������� ����� ���� .�� 15, ��������� a 
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. ������ �����������. ��������� ��� ��  �������������� ����� ���� .�� 15, ��������� a 
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'RBDispatchCountryCode' element value. ��� ���������������-���������������� ������� ������ ����������� � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.15,  ��������� b
     * 
     * @return value
     */
    public String getRBDispatchCountryCode() {
        return RBDispatchCountryCode;
    }

    /** 
     * Set the 'RBDispatchCountryCode' element value. ��� ���������������-���������������� ������� ������ ����������� � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.15,  ��������� b
     * 
     * @param RBDispatchCountryCode
     */
    public void setRBDispatchCountryCode(String RBDispatchCountryCode) {
        this.RBDispatchCountryCode = RBDispatchCountryCode;
    }

    /** 
     * Get the 'DispatchCountryName' element value. ������ �����������. ������� ������������. ��.15
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. ������ �����������. ������� ������������. ��.15
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ������ ����������. ��������� ��� �� �������������� ����� ���� / 00 (����������). �� 17, ��������� a
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ������ ����������. ��������� ��� �� �������������� ����� ���� / 00 (����������). �� 17, ��������� a
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationCountryName' element value. ������ ����������. ��.17 ������������ / ����������
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. ������ ����������. ��.17 ������������ / ����������
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'RBDestinationCountryCode' element value. ��� ���������������-���������������� ������� ������ ���������� � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.17,  ��������� b
     * 
     * @return value
     */
    public String getRBDestinationCountryCode() {
        return RBDestinationCountryCode;
    }

    /** 
     * Set the 'RBDestinationCountryCode' element value. ��� ���������������-���������������� ������� ������ ���������� � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.17,  ��������� b
     * 
     * @param RBDestinationCountryCode
     */
    public void setRBDestinationCountryCode(String RBDestinationCountryCode) {
        this.RBDestinationCountryCode = RBDestinationCountryCode;
    }

    /** 
     * Get the 'DeliveryCustomsOffice' element value. ���������� ����� ���������� ��� ��������.��.53 ��.
     * 
     * @return value
     */
    public CUCustomsType getDeliveryCustomsOffice() {
        return deliveryCustomsOffice;
    }

    /** 
     * Set the 'DeliveryCustomsOffice' element value. ���������� ����� ���������� ��� ��������.��.53 ��.
     * 
     * @param deliveryCustomsOffice
     */
    public void setDeliveryCustomsOffice(CUCustomsType deliveryCustomsOffice) {
        this.deliveryCustomsOffice = deliveryCustomsOffice;
    }

    /** 
     * Get the list of 'BorderCustomsOffice' element items. ���������� ����� ������/������. ��.29
     * 
     * @return list
     */
    public List<CUCustomsType> getBorderCustomsOfficeList() {
        return borderCustomsOfficeList;
    }

    /** 
     * Set the list of 'BorderCustomsOffice' element items. ���������� ����� ������/������. ��.29
     * 
     * @param list
     */
    public void setBorderCustomsOfficeList(List<CUCustomsType> list) {
        borderCustomsOfficeList = list;
    }
}
