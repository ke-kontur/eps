
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �����
 */
public class DescriptionConsignmentType
{
    private String goodsDescription;
    private String quantityPlace;
    private String goodsQuantity;
    private String goodsWeightQuantity;
    private ArrivalOriginInfoType arrival;
    private ArrivalOriginInfoType origin;
    private AddressType locationPlace;
    private DesinfestationType desinfestationInfo;

    /** 
     * Get the 'GoodsDescription' element value. �������� ���������, ������, ����������, ������������ �������.
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ���������, ������, ����������, ������������ �������.
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'QuantityPlace' element value. ����� ���������� ����
     * 
     * @return value
     */
    public String getQuantityPlace() {
        return quantityPlace;
    }

    /** 
     * Set the 'QuantityPlace' element value. ����� ���������� ����
     * 
     * @param quantityPlace
     */
    public void setQuantityPlace(String quantityPlace) {
        this.quantityPlace = quantityPlace;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ���������
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'GoodsWeightQuantity' element value. ��� ��������� (��)
     * 
     * @return value
     */
    public String getGoodsWeightQuantity() {
        return goodsWeightQuantity;
    }

    /** 
     * Set the 'GoodsWeightQuantity' element value. ��� ��������� (��)
     * 
     * @param goodsWeightQuantity
     */
    public void setGoodsWeightQuantity(String goodsWeightQuantity) {
        this.goodsWeightQuantity = goodsWeightQuantity;
    }

    /** 
     * Get the 'Arrival' element value. �������� �����
     * 
     * @return value
     */
    public ArrivalOriginInfoType getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. �������� �����
     * 
     * @param arrival
     */
    public void setArrival(ArrivalOriginInfoType arrival) {
        this.arrival = arrival;
    }

    /** 
     * Get the 'Origin' element value. ������������� �����
     * 
     * @return value
     */
    public ArrivalOriginInfoType getOrigin() {
        return origin;
    }

    /** 
     * Set the 'Origin' element value. ������������� �����
     * 
     * @param origin
     */
    public void setOrigin(ArrivalOriginInfoType origin) {
        this.origin = origin;
    }

    /** 
     * Get the 'LocationPlace' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public AddressType getLocationPlace() {
        return locationPlace;
    }

    /** 
     * Set the 'LocationPlace' element value. ����� ���������� ���������
     * 
     * @param locationPlace
     */
    public void setLocationPlace(AddressType locationPlace) {
        this.locationPlace = locationPlace;
    }

    /** 
     * Get the 'DesinfestationInfo' element value. �������� �� ���������������
     * 
     * @return value
     */
    public DesinfestationType getDesinfestationInfo() {
        return desinfestationInfo;
    }

    /** 
     * Set the 'DesinfestationInfo' element value. �������� �� ���������������
     * 
     * @param desinfestationInfo
     */
    public void setDesinfestationInfo(DesinfestationType desinfestationInfo) {
        this.desinfestationInfo = desinfestationInfo;
    }
}
