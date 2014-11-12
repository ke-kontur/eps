
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� ��� ��� �������� ������ �� ��������� ��������
 */
public class WhGoodType
{
    private String goodsNumber;
    private String goodsTNVEDCode;
    private String invoiceCost;
    private String currencyCode;
    private int choiceSelect = -1;
    private static final int GOODS_DESCRIPTION_LIST_CHOICE = 0;
    private static final int MPO_NUMBER_CHOICE = 1;
    private static final int MPO_CASE_NUM_CHOICE = 2;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private MPONumberType MPONumber;
    private String MPOCaseNum;
    private WHCargoPlaceType cargoPlace;
    private WHSuppQuantityType bruttoVolQuant;
    private WHSuppQuantityType measureQuantity;

    /** 
     * Get the 'GoodsNumber' element value. ������� ����� ������ �� ������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ������� ����� ������ �� ������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
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
     * Get the 'InvoiceCost' element value. ��������� ���������
     * 
     * @return value
     */
    public String getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. ��������� ���������
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(String invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if GoodsDescriptionList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGoodsDescriptionList() {
        return choiceSelect == GOODS_DESCRIPTION_LIST_CHOICE;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        setChoiceSelect(GOODS_DESCRIPTION_LIST_CHOICE);
        goodsDescriptionList = list;
    }

    /** 
     * Check if MPONumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifMPONumber() {
        return choiceSelect == MPO_NUMBER_CHOICE;
    }

    /** 
     * Get the 'MPONumber' element value. ����� ���
     * 
     * @return value
     */
    public MPONumberType getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPONumber' element value. ����� ���
     * 
     * @param MPONumber
     */
    public void setMPONumber(MPONumberType MPONumber) {
        setChoiceSelect(MPO_NUMBER_CHOICE);
        this.MPONumber = MPONumber;
    }

    /** 
     * Check if MPOCaseNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifMPOCaseNum() {
        return choiceSelect == MPO_CASE_NUM_CHOICE;
    }

    /** 
     * Get the 'MPOCaseNum' element value. ����� �������, � ������� ��������� ���.
     * 
     * @return value
     */
    public String getMPOCaseNum() {
        return MPOCaseNum;
    }

    /** 
     * Set the 'MPOCaseNum' element value. ����� �������, � ������� ��������� ���.
     * 
     * @param MPOCaseNum
     */
    public void setMPOCaseNum(String MPOCaseNum) {
        setChoiceSelect(MPO_CASE_NUM_CHOICE);
        this.MPOCaseNum = MPOCaseNum;
    }

    /** 
     * Get the 'CargoPlace' element value. �������� � ��������  ������
     * 
     * @return value
     */
    public WHCargoPlaceType getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. �������� � ��������  ������
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(WHCargoPlaceType cargoPlace) {
        this.cargoPlace = cargoPlace;
    }

    /** 
     * Get the 'BruttoVolQuant' element value. ��� ������ / �����
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuant() {
        return bruttoVolQuant;
    }

    /** 
     * Set the 'BruttoVolQuant' element value. ��� ������ / �����
     * 
     * @param bruttoVolQuant
     */
    public void setBruttoVolQuant(WHSuppQuantityType bruttoVolQuant) {
        this.bruttoVolQuant = bruttoVolQuant;
    }

    /** 
     * Get the 'MeasureQuantity' element value. ���-�� � ��������������  �������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getMeasureQuantity() {
        return measureQuantity;
    }

    /** 
     * Set the 'MeasureQuantity' element value. ���-�� � ��������������  �������� ���������
     * 
     * @param measureQuantity
     */
    public void setMeasureQuantity(WHSuppQuantityType measureQuantity) {
        this.measureQuantity = measureQuantity;
    }
}
