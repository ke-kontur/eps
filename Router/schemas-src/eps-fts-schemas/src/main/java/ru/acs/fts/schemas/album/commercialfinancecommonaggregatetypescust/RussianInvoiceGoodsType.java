
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� � ������� �����-�������
 */
public class RussianInvoiceGoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodMarking;
    private String goodsCode;
    private String supplementaryQualifierName;
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String goodsPrice;
    private String goodsCost;
    private String exise;
    private String taxRate;
    private String taxSum;
    private String totalCost;
    private String originCountryCode;
    private String originA3CountryCode;
    private GTDIDType GTDID;
    private AdditionalGoodsDescriptionType additionalGoodsDescription;

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������������� ������ (������)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������������� ������ (������)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

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
     * Get the 'GoodsCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /** 
     * Set the 'GoodsCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsCode
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /** 
     * Get the 'SupplementaryQualifierName' element value. �������� �������������� ������� ��������� ��� ����������� �� ��������
     * 
     * @return value
     */
    public String getSupplementaryQualifierName() {
        return supplementaryQualifierName;
    }

    /** 
     * Set the 'SupplementaryQualifierName' element value. �������� �������������� ������� ��������� ��� ����������� �� ��������
     * 
     * @param supplementaryQualifierName
     */
    public void setSupplementaryQualifierName(String supplementaryQualifierName) {
        this.supplementaryQualifierName = supplementaryQualifierName;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������, ����� ������ �� �������� ������ ���������
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������, ����� ������ �� �������� ������ ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. �������� ������� ��������� ��� ����������� �� ��������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. �������� ������� ��������� ��� ����������� �� ��������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'GoodsPrice' element value. ���� ������/������
     * 
     * @return value
     */
    public String getGoodsPrice() {
        return goodsPrice;
    }

    /** 
     * Set the 'GoodsPrice' element value. ���� ������/������
     * 
     * @param goodsPrice
     */
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /** 
     * Get the 'GoodsCost' element value. ��������� ����� ���������� ������������� (������������) �� ����� - �������� ������ (����������� �����, ��������� �����) ��� ������
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ��������� ����� ���������� ������������� (������������) �� ����� - �������� ������ (����������� �����, ��������� �����) ��� ������
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'Exise' element value. C���� ������ �� ����������� �������
     * 
     * @return value
     */
    public String getExise() {
        return exise;
    }

    /** 
     * Set the 'Exise' element value. C���� ������ �� ����������� �������
     * 
     * @param exise
     */
    public void setExise(String exise) {
        this.exise = exise;
    }

    /** 
     * Get the 'TaxRate' element value. ��������� ������
     * 
     * @return value
     */
    public String getTaxRate() {
        return taxRate;
    }

    /** 
     * Set the 'TaxRate' element value. ��������� ������
     * 
     * @param taxRate
     */
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    /** 
     * Get the 'TaxSum' element value. C���� ������, ������������� ���������� ������� (�����, �����), ������������ ������ �� ����������� ��������� ������
     * 
     * @return value
     */
    public String getTaxSum() {
        return taxSum;
    }

    /** 
     * Set the 'TaxSum' element value. C���� ������, ������������� ���������� ������� (�����, �����), ������������ ������ �� ����������� ��������� ������
     * 
     * @param taxSum
     */
    public void setTaxSum(String taxSum) {
        this.taxSum = taxSum;
    }

    /** 
     * Get the 'TotalCost' element value. C�������� ����� ���������� ������������ (�����������) �� �����-�������� ������� (����������� �����, ��������� �����) � ������ ����� ������
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. C�������� ����� ���������� ������������ (�����������) �� �����-�������� ������� (����������� �����, ��������� �����) � ������ ����� ������
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ �������������, ����������� � ��������� �������, ������� ������������� ������� �� �������� ���������� ���������. 
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ �������������, ����������� � ��������� �������, ������� ������������� ������� �� �������� ���������� ���������. 
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginA3CountryCode' element value. ��������� ��� ������ �������������, ����������� � ��������� �������, ������� ������������� ������� �� �������� ���������� ���������. 
     * 
     * @return value
     */
    public String getOriginA3CountryCode() {
        return originA3CountryCode;
    }

    /** 
     * Set the 'OriginA3CountryCode' element value. ��������� ��� ������ �������������, ����������� � ��������� �������, ������� ������������� ������� �� �������� ���������� ���������. 
     * 
     * @param originA3CountryCode
     */
    public void setOriginA3CountryCode(String originA3CountryCode) {
        this.originA3CountryCode = originA3CountryCode;
    }

    /** 
     * Get the 'GTDID' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ����� ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'AdditionalGoodsDescription' element value. �������������� �������������� �������
     * 
     * @return value
     */
    public AdditionalGoodsDescriptionType getAdditionalGoodsDescription() {
        return additionalGoodsDescription;
    }

    /** 
     * Set the 'AdditionalGoodsDescription' element value. �������������� �������������� �������
     * 
     * @param additionalGoodsDescription
     */
    public void setAdditionalGoodsDescription(
            AdditionalGoodsDescriptionType additionalGoodsDescription) {
        this.additionalGoodsDescription = additionalGoodsDescription;
    }
}
