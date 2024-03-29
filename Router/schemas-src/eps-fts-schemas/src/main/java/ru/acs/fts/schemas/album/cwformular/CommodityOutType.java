
package ru.acs.fts.schemas.album.cwformular;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ���������� � ������� ������
 */
public class CommodityOutType
{
    private String goodsNumber;
    private String goodsNumberInGTD;
    private String customsModeCode;
    private String goodsWeight;
    private String notes;
    private String goodsNumberMain;
    private WHSuppQuantityType goodsValue;
    private WHSuppQuantityType goodsValue1;
    private WHSuppQuantityType goodsValue2;
    private GTDIDType GTDNumber;

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� � ������ ����������� �������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� � ������ ����������� �������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ����� ������� �� �����
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. ���������� ����� ������ � ��, �� ������� ����� ������� �� �����
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'CustomsModeCode' element value. ���������� �����, �� �������� ����������� �����
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ���������� �����, �� �������� ����������� �����
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'GoodsWeight' element value. ��� ������ � ��
     * 
     * @return value
     */
    public String getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. ��� ������ � ��
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /** 
     * Get the 'Notes' element value. ����������
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. ����������
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'GoodsNumberMain' element value. ���������� ����� ������ � ���������.
     * 
     * @return value
     */
    public String getGoodsNumberMain() {
        return goodsNumberMain;
    }

    /** 
     * Set the 'GoodsNumberMain' element value. ���������� ����� ������ � ���������.
     * 
     * @param goodsNumberMain
     */
    public void setGoodsNumberMain(String goodsNumberMain) {
        this.goodsNumberMain = goodsNumberMain;
    }

    /** 
     * Get the 'GoodsValue' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue() {
        return goodsValue;
    }

    /** 
     * Set the 'GoodsValue' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param goodsValue
     */
    public void setGoodsValue(WHSuppQuantityType goodsValue) {
        this.goodsValue = goodsValue;
    }

    /** 
     * Get the 'GoodsValue1' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue1() {
        return goodsValue1;
    }

    /** 
     * Set the 'GoodsValue1' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @param goodsValue1
     */
    public void setGoodsValue1(WHSuppQuantityType goodsValue1) {
        this.goodsValue1 = goodsValue1;
    }

    /** 
     * Get the 'GoodsValue2' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue2() {
        return goodsValue2;
    }

    /** 
     * Set the 'GoodsValue2' element value. ���������� ������ � ���������� ������� ���������
     * 
     * @param goodsValue2
     */
    public void setGoodsValue2(WHSuppQuantityType goodsValue2) {
        this.goodsValue2 = goodsValue2;
    }

    /** 
     * Get the 'GTDNumber' element value. ����� ��, �� �������� ����������� �����
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ����� ��, �� �������� ����������� �����
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
