
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����
 */
public class AWBGoodsType
{
    private String placesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private String rateMixCode;
    private String serviceCode;
    private String tariffClassCode;
    private String commodityItemNum;
    private String goodsVolume;
    private String volumeUnitQualifierCode;
    private String paidWeightQuantity;
    private String goodsCommodityCode;
    private String factPlacesQuantity;
    private String totalSum;
    private String rateCharge;
    private List<GoodsDescrType> goodsDescrList = new ArrayList<GoodsDescrType>();
    private DimensionInfoType dimensions;
    private List<ContainerInfoType> containerInfoList = new ArrayList<ContainerInfoType>();
    private DTInfoType DTInfo;

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ���� ������ ������ ������������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ���� ������ ������ ������������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'RateMixCode' element value. �����������  ��������-�������� ���  ���������� �������
     * 
     * @return value
     */
    public String getRateMixCode() {
        return rateMixCode;
    }

    /** 
     * Set the 'RateMixCode' element value. �����������  ��������-�������� ���  ���������� �������
     * 
     * @param rateMixCode
     */
    public void setRateMixCode(String rateMixCode) {
        this.rateMixCode = rateMixCode;
    }

    /** 
     * Get the 'ServiceCode' element value. ��������� ���, ����������� ����������� ������������
     * 
     * @return value
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /** 
     * Set the 'ServiceCode' element value. ��������� ���, ����������� ����������� ������������
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /** 
     * Get the 'TariffClassCode' element value. ����� ������
     * 
     * @return value
     */
    public String getTariffClassCode() {
        return tariffClassCode;
    }

    /** 
     * Set the 'TariffClassCode' element value. ����� ������
     * 
     * @param tariffClassCode
     */
    public void setTariffClassCode(String tariffClassCode) {
        this.tariffClassCode = tariffClassCode;
    }

    /** 
     * Get the 'CommodityItemNum' element value. �������� ����� / ������� ������, �������� / ��� ������ ��� ��������������� �����
     * 
     * @return value
     */
    public String getCommodityItemNum() {
        return commodityItemNum;
    }

    /** 
     * Set the 'CommodityItemNum' element value. �������� ����� / ������� ������, �������� / ��� ������ ��� ��������������� �����
     * 
     * @param commodityItemNum
     */
    public void setCommodityItemNum(String commodityItemNum) {
        this.commodityItemNum = commodityItemNum;
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
     * Get the 'VolumeUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @return value
     */
    public String getVolumeUnitQualifierCode() {
        return volumeUnitQualifierCode;
    }

    /** 
     * Set the 'VolumeUnitQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @param volumeUnitQualifierCode
     */
    public void setVolumeUnitQualifierCode(String volumeUnitQualifierCode) {
        this.volumeUnitQualifierCode = volumeUnitQualifierCode;
    }

    /** 
     * Get the 'PaidWeightQuantity' element value. ������� ��� ������ 
     * 
     * @return value
     */
    public String getPaidWeightQuantity() {
        return paidWeightQuantity;
    }

    /** 
     * Set the 'PaidWeightQuantity' element value. ������� ��� ������ 
     * 
     * @param paidWeightQuantity
     */
    public void setPaidWeightQuantity(String paidWeightQuantity) {
        this.paidWeightQuantity = paidWeightQuantity;
    }

    /** 
     * Get the 'GoodsCommodityCode' element value. ���  ������ �� �������� ������������
     * 
     * @return value
     */
    public String getGoodsCommodityCode() {
        return goodsCommodityCode;
    }

    /** 
     * Set the 'GoodsCommodityCode' element value. ���  ������ �� �������� ������������
     * 
     * @param goodsCommodityCode
     */
    public void setGoodsCommodityCode(String goodsCommodityCode) {
        this.goodsCommodityCode = goodsCommodityCode;
    }

    /** 
     * Get the 'FactPlacesQuantity' element value. ����������� ���������� ���� ������
     * 
     * @return value
     */
    public String getFactPlacesQuantity() {
        return factPlacesQuantity;
    }

    /** 
     * Set the 'FactPlacesQuantity' element value. ����������� ���������� ���� ������
     * 
     * @param factPlacesQuantity
     */
    public void setFactPlacesQuantity(String factPlacesQuantity) {
        this.factPlacesQuantity = factPlacesQuantity;
    }

    /** 
     * Get the 'TotalSum' element value. ����� (22H)
     * 
     * @return value
     */
    public String getTotalSum() {
        return totalSum;
    }

    /** 
     * Set the 'TotalSum' element value. ����� (22H)
     * 
     * @param totalSum
     */
    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    /** 
     * Get the 'RateCharge' element value. ������ (22G)
     * 
     * @return value
     */
    public String getRateCharge() {
        return rateCharge;
    }

    /** 
     * Set the 'RateCharge' element value. ������ (22G)
     * 
     * @param rateCharge
     */
    public void setRateCharge(String rateCharge) {
        this.rateCharge = rateCharge;
    }

    /** 
     * Get the list of 'GoodsDescr' element items. �������� ����� / �������������� ����������
     * 
     * @return list
     */
    public List<GoodsDescrType> getGoodsDescrList() {
        return goodsDescrList;
    }

    /** 
     * Set the list of 'GoodsDescr' element items. �������� ����� / �������������� ����������
     * 
     * @param list
     */
    public void setGoodsDescrList(List<GoodsDescrType> list) {
        goodsDescrList = list;
    }

    /** 
     * Get the 'Dimensions' element value. ��������
     * 
     * @return value
     */
    public DimensionInfoType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. ��������
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionInfoType dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the list of 'ContainerInfo' element items. ���������� � �����������
     * 
     * @return list
     */
    public List<ContainerInfoType> getContainerInfoList() {
        return containerInfoList;
    }

    /** 
     * Set the list of 'ContainerInfo' element items. ���������� � �����������
     * 
     * @param list
     */
    public void setContainerInfoList(List<ContainerInfoType> list) {
        containerInfoList = list;
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
