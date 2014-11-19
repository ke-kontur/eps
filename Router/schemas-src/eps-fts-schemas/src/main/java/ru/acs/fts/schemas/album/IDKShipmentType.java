
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �����
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKShipmentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ShipmentQuantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="PlaceQuantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="GrossWeight" minOccurs="0"/>
 *     &lt;xs:element type="ns:IDKShipmentInfoType" name="ShipmentInfo" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKShipmentType
{
    private String shipmentQuantity;
    private String placeQuantity;
    private String grossWeight;
    private List<IDKShipmentInfoType> shipmentInfoList = new ArrayList<IDKShipmentInfoType>();

    /** 
     * Get the 'ShipmentQuantity' element value. ���������� ������
     * 
     * @return value
     */
    public String getShipmentQuantity() {
        return shipmentQuantity;
    }

    /** 
     * Set the 'ShipmentQuantity' element value. ���������� ������
     * 
     * @param shipmentQuantity
     */
    public void setShipmentQuantity(String shipmentQuantity) {
        this.shipmentQuantity = shipmentQuantity;
    }

    /** 
     * Get the 'PlaceQuantity' element value. ����� ���������� �������� ����
     * 
     * @return value
     */
    public String getPlaceQuantity() {
        return placeQuantity;
    }

    /** 
     * Set the 'PlaceQuantity' element value. ����� ���������� �������� ����
     * 
     * @param placeQuantity
     */
    public void setPlaceQuantity(String placeQuantity) {
        this.placeQuantity = placeQuantity;
    }

    /** 
     * Get the 'GrossWeight' element value. ����� ��� ������, ��.
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ����� ��� ������, ��.
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the list of 'ShipmentInfo' element items. �������� � �������� ������
     * 
     * @return list
     */
    public List<IDKShipmentInfoType> getShipmentInfoList() {
        return shipmentInfoList;
    }

    /** 
     * Set the list of 'ShipmentInfo' element items. �������� � �������� ������
     * 
     * @param list
     */
    public void setShipmentInfoList(List<IDKShipmentInfoType> list) {
        shipmentInfoList = list;
    }
}
