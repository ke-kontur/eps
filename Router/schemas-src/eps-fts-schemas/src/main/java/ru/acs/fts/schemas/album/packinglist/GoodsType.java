
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �������� ���� �������
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String placeGoodsQuantity;
    private String measureUnitQualifierName;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String dimensions;
    private String goodsVolume;
    private String volumeUnitQualifierName;
    private String measureUnitQualifierCode;
    private String goodMarking;
    private List<PlacesGoodsQuantityType> placesQuantityList = new ArrayList<PlacesGoodsQuantityType>();
    private List<PackingInfoType> packingInfoList = new ArrayList<PackingInfoType>();

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ���������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ ��� �������� ������� ��������� 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ ��� �������� ������� ��������� 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
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
     * Get the 'MeasureUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
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
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'Dimensions' element value. ������� ������ (�����, ������, ������)
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. ������� ������ (�����, ������, ������)
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'GoodsVolume' element value. ����� �����, ���������� ����������� ������� ��� �������� ������ ���������
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. ����� �����, ���������� ����������� ������� ��� �������� ������ ���������
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the 'VolumeUnitQualifierName' element value. �������� ������� ��������� ������
     * 
     * @return value
     */
    public String getVolumeUnitQualifierName() {
        return volumeUnitQualifierName;
    }

    /** 
     * Set the 'VolumeUnitQualifierName' element value. �������� ������� ��������� ������
     * 
     * @param volumeUnitQualifierName
     */
    public void setVolumeUnitQualifierName(String volumeUnitQualifierName) {
        this.volumeUnitQualifierName = volumeUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'GoodMarking' element value. ������� (��� ������, ����� �� �������� �������������) 
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. ������� (��� ������, ����� �� �������� �������������) 
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

    /** 
     * Get the list of 'PlacesQuantity' element items. ���������� ���� �� ����� ��������  ����
     * 
     * @return list
     */
    public List<PlacesGoodsQuantityType> getPlacesQuantityList() {
        return placesQuantityList;
    }

    /** 
     * Set the list of 'PlacesQuantity' element items. ���������� ���� �� ����� ��������  ����
     * 
     * @param list
     */
    public void setPlacesQuantityList(List<PlacesGoodsQuantityType> list) {
        placesQuantityList = list;
    }

    /** 
     * Get the list of 'PackingInfo' element items. �������� �� �������� �������. 
     * 
     * @return list
     */
    public List<PackingInfoType> getPackingInfoList() {
        return packingInfoList;
    }

    /** 
     * Set the list of 'PackingInfo' element items. �������� �� �������� �������. 
     * 
     * @param list
     */
    public void setPackingInfoList(List<PackingInfoType> list) {
        packingInfoList = list;
    }
}
