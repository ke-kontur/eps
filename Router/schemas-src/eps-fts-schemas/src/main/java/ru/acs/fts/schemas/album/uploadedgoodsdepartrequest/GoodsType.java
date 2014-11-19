
package ru.acs.fts.schemas.album.uploadedgoodsdepartrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private String goodsDescription;
    private String goodsTNVEDCode;
    private String placesQuantity;
    private String grossWeightQuantity;
    private List<String> containerNumberList = new ArrayList<String>();
    private AWBNumberType wayBillNumber;

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �������� ������������
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �������� ������������
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ����, �������� � ��������� / ���������� ���� ������ �� ��������� ��� ������ �������� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ����, �������� � ��������� / ���������� ���� ������ �� ��������� ��� ������ �������� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'WayBillNumber' element value. ����� ���������
     * 
     * @return value
     */
    public AWBNumberType getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. ����� ���������
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(AWBNumberType wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }
}
