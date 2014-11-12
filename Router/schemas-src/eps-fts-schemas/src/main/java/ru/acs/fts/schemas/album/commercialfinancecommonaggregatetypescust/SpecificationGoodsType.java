
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������� �� ������������ � ���������
 */
public class SpecificationGoodsType
{
    private String goodMarking;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String measureUnitQualifierCode;
    private String measureUnitQualifierName;
    private String price;
    private String GCost;
    private String goodsTNVEDCode;
    private String currencyCode;
    private GoodsPlaceType goodsPlace;
    private GoodsWeightType goodsWeight;

    /** 
     * Get the 'GoodMarking' element value. ������� ������
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. ������� ������
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

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
     * Get the 'GoodsQuantity' element value. ���������� ������ � �������� ���������
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � �������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. ��� ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. ��� ������� ���������
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. �������� ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. �������� ������� ���������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'Price' element value. ���� ������
     * 
     * @return value
     */
    public String getPrice() {
        return price;
    }

    /** 
     * Set the 'Price' element value. ���� ������
     * 
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** 
     * Get the 'GCost' element value. C�������� ������
     * 
     * @return value
     */
    public String getGCost() {
        return GCost;
    }

    /** 
     * Set the 'GCost' element value. C�������� ������
     * 
     * @param GCost
     */
    public void setGCost(String GCost) {
        this.GCost = GCost;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'GoodsPlace' element value. �������� �������� ����
     * 
     * @return value
     */
    public GoodsPlaceType getGoodsPlace() {
        return goodsPlace;
    }

    /** 
     * Set the 'GoodsPlace' element value. �������� �������� ����
     * 
     * @param goodsPlace
     */
    public void setGoodsPlace(GoodsPlaceType goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    /** 
     * Get the 'GoodsWeight' element value. ��� �����,������ ������ � ��.
     * 
     * @return value
     */
    public GoodsWeightType getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. ��� �����,������ ������ � ��.
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(GoodsWeightType goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
}
