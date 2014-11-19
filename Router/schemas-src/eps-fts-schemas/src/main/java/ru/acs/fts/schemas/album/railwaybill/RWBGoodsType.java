
package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TransportGoodsType;

/** 
 * �������� � ������� ���������
 */
public class RWBGoodsType extends TransportGoodsType
{
    private String containerIndicator;
    private String workToolDescription;
    private String conductorDescription;
    private String placeGoodsQuantity;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String placesDescription;
    private String harmonizedRangeGoods;
    private String packing;
    private String marking;
    private String carriageNumber;
    private String containerNumber;
    private DTInfoType DTInfo;

    /** 
     * Get the 'ContainerIndicator' element value. ������� ��������� ������ � ����������� 
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. ������� ��������� ������ � ����������� 
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'WorkToolDescription' element value. � ������ ������������� ��������� � ����������� ������������ �������������� ����������� ������������ ����������� ������������ ��������������
     * 
     * @return value
     */
    public String getWorkToolDescription() {
        return workToolDescription;
    }

    /** 
     * Set the 'WorkToolDescription' element value. � ������ ������������� ��������� � ����������� ������������ �������������� ����������� ������������ ����������� ������������ ��������������
     * 
     * @param workToolDescription
     */
    public void setWorkToolDescription(String workToolDescription) {
        this.workToolDescription = workToolDescription;
    }

    /** 
     * Get the 'ConductorDescription' element value. ����������� ��� ���������� ������ � ������������. ����������� �������� � ����������� � � ��������������� ������� � �������� ����������� �������, �� ������� ������������ ������ �����������. 
     * 
     * @return value
     */
    public String getConductorDescription() {
        return conductorDescription;
    }

    /** 
     * Set the 'ConductorDescription' element value. ����������� ��� ���������� ������ � ������������. ����������� �������� � ����������� � � ��������������� ������� � �������� ����������� �������, �� ������� ������������ ������ �����������. 
     * 
     * @param conductorDescription
     */
    public void setConductorDescription(String conductorDescription) {
        this.conductorDescription = conductorDescription;
    }

    /** 
     * Get the 'PlaceGoodsQuantity' element value. ���������� ������ � �������� �����
     * 
     * @return value
     */
    public String getPlaceGoodsQuantity() {
        return placeGoodsQuantity;
    }

    /** 
     * Set the 'PlaceGoodsQuantity' element value. ���������� ������ � �������� �����
     * 
     * @param placeGoodsQuantity
     */
    public void setPlaceGoodsQuantity(String placeGoodsQuantity) {
        this.placeGoodsQuantity = placeGoodsQuantity;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������, ���� "�����" ��� �����" �� �� �����������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ����� ���������� �������� ���� ������, ���� "�����" ��� �����" �� �� �����������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ ������������ ������������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ ������������ ������������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. �������� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. �������� �������� ���� (�������, ��������, ������ � �.�.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'HarmonizedRangeGoods' element value. ��� ������ �� ���
     * 
     * @return value
     */
    public String getHarmonizedRangeGoods() {
        return harmonizedRangeGoods;
    }

    /** 
     * Set the 'HarmonizedRangeGoods' element value. ��� ������ �� ���
     * 
     * @param harmonizedRangeGoods
     */
    public void setHarmonizedRangeGoods(String harmonizedRangeGoods) {
        this.harmonizedRangeGoods = harmonizedRangeGoods;
    }

    /** 
     * Get the 'Packing' element value. ��������
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. ��������
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'Marking' element value. ����������
     * 
     * @return value
     */
    public String getMarking() {
        return marking;
    }

    /** 
     * Set the 'Marking' element value. ����������
     * 
     * @param marking
     */
    public void setMarking(String marking) {
        this.marking = marking;
    }

    /** 
     * Get the 'CarriageNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. ����� ������
     * 
     * @param carriageNumber
     */
    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    /** 
     * Get the 'ContainerNumber' element value. ����� ����������
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. ����� ����������
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    /** 
     * Get the 'DTInfo' element value. �������� �� ���������� �� ������
     * 
     * @return value
     */
    public DTInfoType getDTInfo() {
        return DTInfo;
    }

    /** 
     * Set the 'DTInfo' element value. �������� �� ���������� �� ������
     * 
     * @param DTInfo
     */
    public void setDTInfo(DTInfoType DTInfo) {
        this.DTInfo = DTInfo;
    }
}
