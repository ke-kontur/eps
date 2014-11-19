
package ru.acs.fts.schemas.album.tpo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ������
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String goodsWeight;
    private String cost;
    private String dollarCost;
    private String euroCost;
    private String additionalInformation;
    private String originCountryCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<PaymentInfoType> paymentInfoList = new ArrayList<PaymentInfoType>();
    private List<AutomobileInfoType> automobileInfoList = new ArrayList<AutomobileInfoType>();

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
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
     * Get the 'GoodsWeight' element value. ��� ������, ��
     * 
     * @return value
     */
    public String getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. ��� ������, ��
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /** 
     * Get the 'Cost' element value. ��������� � ������ �������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ��������� � ������ �������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'DollarCost' element value. ��������� � �������� ���
     * 
     * @return value
     */
    public String getDollarCost() {
        return dollarCost;
    }

    /** 
     * Set the 'DollarCost' element value. ��������� � �������� ���
     * 
     * @param dollarCost
     */
    public void setDollarCost(String dollarCost) {
        this.dollarCost = dollarCost;
    }

    /** 
     * Get the 'EuroCost' element value. ��������� � ����
     * 
     * @return value
     */
    public String getEuroCost() {
        return euroCost;
    }

    /** 
     * Set the 'EuroCost' element value. ��������� � ����
     * 
     * @param euroCost
     */
    public void setEuroCost(String euroCost) {
        this.euroCost = euroCost;
    }

    /** 
     * Get the 'AdditionalInformation' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /** 
     * Set the 'AdditionalInformation' element value. �������������� ����������
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ����
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ����
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'PaymentInfo' element items. �������� � �������
     * 
     * @return list
     */
    public List<PaymentInfoType> getPaymentInfoList() {
        return paymentInfoList;
    }

    /** 
     * Set the list of 'PaymentInfo' element items. �������� � �������
     * 
     * @param list
     */
    public void setPaymentInfoList(List<PaymentInfoType> list) {
        paymentInfoList = list;
    }

    /** 
     * Get the list of 'AutomobileInfo' element items. ������ �� ����������
     * 
     * @return list
     */
    public List<AutomobileInfoType> getAutomobileInfoList() {
        return automobileInfoList;
    }

    /** 
     * Set the list of 'AutomobileInfo' element items. ������ �� ����������
     * 
     * @param list
     */
    public void setAutomobileInfoList(List<AutomobileInfoType> list) {
        automobileInfoList = list;
    }
}
