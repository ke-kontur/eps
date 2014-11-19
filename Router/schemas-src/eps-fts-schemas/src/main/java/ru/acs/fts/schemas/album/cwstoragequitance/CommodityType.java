
package ru.acs.fts.schemas.album.cwstoragequitance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ���������� � ������
 */
public class CommodityType extends GoodsBaseType
{
    private String goodsNumericPred;
    private String goodsNumberInGTD;
    private String goodsPlacesIn;
    private String ratableValueIn;
    private String goodsPlacesRest;
    private String ratableValueRest;
    private String grossWeightQuantityRest;
    private WHSuppQuantityType grossWeightSuppQuantityIn;
    private GTDIDType GTDOutNumber;

    /** 
     * Get the 'GoodsNumericPred' element value. ���������� ����� ������ � ���������� ���������
     * 
     * @return value
     */
    public String getGoodsNumericPred() {
        return goodsNumericPred;
    }

    /** 
     * Set the 'GoodsNumericPred' element value. ���������� ����� ������ � ���������� ���������
     * 
     * @param goodsNumericPred
     */
    public void setGoodsNumericPred(String goodsNumericPred) {
        this.goodsNumericPred = goodsNumericPred;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ������ ����
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ������ ����
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'GoodsPlacesIn' element value. ���������� �������� �������� ����
     * 
     * @return value
     */
    public String getGoodsPlacesIn() {
        return goodsPlacesIn;
    }

    /** 
     * Set the 'GoodsPlacesIn' element value. ���������� �������� �������� ����
     * 
     * @param goodsPlacesIn
     */
    public void setGoodsPlacesIn(String goodsPlacesIn) {
        this.goodsPlacesIn = goodsPlacesIn;
    }

    /** 
     * Get the 'RatableValueIn' element value. ��������� ��������� ��������� �����
     * 
     * @return value
     */
    public String getRatableValueIn() {
        return ratableValueIn;
    }

    /** 
     * Set the 'RatableValueIn' element value. ��������� ��������� ��������� �����
     * 
     * @param ratableValueIn
     */
    public void setRatableValueIn(String ratableValueIn) {
        this.ratableValueIn = ratableValueIn;
    }

    /** 
     * Get the 'GoodsPlacesRest' element value. ���������� ������� ���� ������� �� ������
     * 
     * @return value
     */
    public String getGoodsPlacesRest() {
        return goodsPlacesRest;
    }

    /** 
     * Set the 'GoodsPlacesRest' element value. ���������� ������� ���� ������� �� ������
     * 
     * @param goodsPlacesRest
     */
    public void setGoodsPlacesRest(String goodsPlacesRest) {
        this.goodsPlacesRest = goodsPlacesRest;
    }

    /** 
     * Get the 'RatableValueRest' element value. ��������� ��������� ������� ������� �� ������
     * 
     * @return value
     */
    public String getRatableValueRest() {
        return ratableValueRest;
    }

    /** 
     * Set the 'RatableValueRest' element value. ��������� ��������� ������� ������� �� ������
     * 
     * @param ratableValueRest
     */
    public void setRatableValueRest(String ratableValueRest) {
        this.ratableValueRest = ratableValueRest;
    }

    /** 
     * Get the 'GrossWeightQuantityRest' element value. ��� ������ �������� ������ �� ������ (� �� ��� ���)
     * 
     * @return value
     */
    public String getGrossWeightQuantityRest() {
        return grossWeightQuantityRest;
    }

    /** 
     * Set the 'GrossWeightQuantityRest' element value. ��� ������ �������� ������ �� ������ (� �� ��� ���)
     * 
     * @param grossWeightQuantityRest
     */
    public void setGrossWeightQuantityRest(String grossWeightQuantityRest) {
        this.grossWeightQuantityRest = grossWeightQuantityRest;
    }

    /** 
     * Get the 'GrossWeightSuppQuantityIn' element value. ��� ������ ��������� ����� � ���
     * 
     * @return value
     */
    public WHSuppQuantityType getGrossWeightSuppQuantityIn() {
        return grossWeightSuppQuantityIn;
    }

    /** 
     * Set the 'GrossWeightSuppQuantityIn' element value. ��� ������ ��������� ����� � ���
     * 
     * @param grossWeightSuppQuantityIn
     */
    public void setGrossWeightSuppQuantityIn(
            WHSuppQuantityType grossWeightSuppQuantityIn) {
        this.grossWeightSuppQuantityIn = grossWeightSuppQuantityIn;
    }

    /** 
     * Get the 'GTDOutNumber' element value. ����� ��, �� �������� ������ �������� �� ������
     * 
     * @return value
     */
    public GTDIDType getGTDOutNumber() {
        return GTDOutNumber;
    }

    /** 
     * Set the 'GTDOutNumber' element value. ����� ��, �� �������� ������ �������� �� ������
     * 
     * @param GTDOutNumber
     */
    public void setGTDOutNumber(GTDIDType GTDOutNumber) {
        this.GTDOutNumber = GTDOutNumber;
    }
}
