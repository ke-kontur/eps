
package ru.acs.fts.schemas.album.calculationamountpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;

/** 
 * �������� � ������
 */
public class DescriptionGoodsType
{
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String netWeightQuantity;
    private String customsCost;
    private String originCountryName;
    private String countryCode;
    private String position;
    private String allQuantityGoods;
    private String sourceInformation;
    private String reasonCalculationPayment;
    private String totalCustomsPayment;
    private String totalCustomsDues;
    private String totalPaymentGoods;
    private List<CalculationType> calculationList = new ArrayList<CalculationType>();
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private List<AmountDuesCalculationType> amountDuesCalculationList = new ArrayList<AmountDuesCalculationType>();

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
     * Get the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
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
     * Get the 'CustomsCost' element value. �������������/���������� ��������� ������
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. �������������/���������� ��������� ������
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'OriginCountryName' element value. ������� ������������ ������ ������������� / �������������� �����.
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������� ������������ ������ ������������� / �������������� �����.
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CountryCode' element value. ���� ������ �������������.
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ���� ������ �������������.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Position' element value. ���������� ����� ������, � ��������� �������� ������������ ������ ������� ����������� ������ ���������� ��������
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� ����� ������, � ��������� �������� ������������ ������ ������� ����������� ������ ���������� ��������
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'AllQuantityGoods' element value. ����� ���������� �������
     * 
     * @return value
     */
    public String getAllQuantityGoods() {
        return allQuantityGoods;
    }

    /** 
     * Set the 'AllQuantityGoods' element value. ����� ���������� �������
     * 
     * @param allQuantityGoods
     */
    public void setAllQuantityGoods(String allQuantityGoods) {
        this.allQuantityGoods = allQuantityGoods;
    }

    /** 
     * Get the 'SourceInformation' element value. ��������� ����������
     * 
     * @return value
     */
    public String getSourceInformation() {
        return sourceInformation;
    }

    /** 
     * Set the 'SourceInformation' element value. ��������� ����������
     * 
     * @param sourceInformation
     */
    public void setSourceInformation(String sourceInformation) {
        this.sourceInformation = sourceInformation;
    }

    /** 
     * Get the 'ReasonCalculationPayment' element value. ������ ��� ������� ������� ����������� (� ������)
     * 
     * @return value
     */
    public String getReasonCalculationPayment() {
        return reasonCalculationPayment;
    }

    /** 
     * Set the 'ReasonCalculationPayment' element value. ������ ��� ������� ������� ����������� (� ������)
     * 
     * @param reasonCalculationPayment
     */
    public void setReasonCalculationPayment(String reasonCalculationPayment) {
        this.reasonCalculationPayment = reasonCalculationPayment;
    }

    /** 
     * Get the 'TotalCustomsPayment' element value. �������� ������ ����������� ������ ���������� ��������.
     * 
     * @return value
     */
    public String getTotalCustomsPayment() {
        return totalCustomsPayment;
    }

    /** 
     * Set the 'TotalCustomsPayment' element value. �������� ������ ����������� ������ ���������� ��������.
     * 
     * @param totalCustomsPayment
     */
    public void setTotalCustomsPayment(String totalCustomsPayment) {
        this.totalCustomsPayment = totalCustomsPayment;
    }

    /** 
     * Get the 'TotalCustomsDues' element value. �������� ����� ���������� ������ � ������
     * 
     * @return value
     */
    public String getTotalCustomsDues() {
        return totalCustomsDues;
    }

    /** 
     * Set the 'TotalCustomsDues' element value. �������� ����� ���������� ������ � ������
     * 
     * @param totalCustomsDues
     */
    public void setTotalCustomsDues(String totalCustomsDues) {
        this.totalCustomsDues = totalCustomsDues;
    }

    /** 
     * Get the 'TotalPaymentGoods' element value. �������� ������ ����������� ������ ���������� �������� � ��������� ������� ������
     * 
     * @return value
     */
    public String getTotalPaymentGoods() {
        return totalPaymentGoods;
    }

    /** 
     * Set the 'TotalPaymentGoods' element value. �������� ������ ����������� ������ ���������� �������� � ��������� ������� ������
     * 
     * @param totalPaymentGoods
     */
    public void setTotalPaymentGoods(String totalPaymentGoods) {
        this.totalPaymentGoods = totalPaymentGoods;
    }

    /** 
     * Get the list of 'Calculation' element items. ������ ������� �����������
     * 
     * @return list
     */
    public List<CalculationType> getCalculationList() {
        return calculationList;
    }

    /** 
     * Set the list of 'Calculation' element items. ������ ������� �����������
     * 
     * @param list
     */
    public void setCalculationList(List<CalculationType> list) {
        calculationList = list;
    }

    /** 
     * Get the list of 'GoodsGroupDescription' element items. �������� � �������������� ������� / �������� ������ ������� ������ ������������ � ������������� �� ������ ����� ����������������
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. �������� � �������������� ������� / �������� ������ ������� ������ ������������ � ������������� �� ������ ����� ����������������
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }

    /** 
     * Get the list of 'AmountDuesCalculation' element items. ������ ����� ���������� ������ � ������, ���������� �����������
     * 
     * @return list
     */
    public List<AmountDuesCalculationType> getAmountDuesCalculationList() {
        return amountDuesCalculationList;
    }

    /** 
     * Set the list of 'AmountDuesCalculation' element items. ������ ����� ���������� ������ � ������, ���������� �����������
     * 
     * @param list
     */
    public void setAmountDuesCalculationList(
            List<AmountDuesCalculationType> list) {
        amountDuesCalculationList = list;
    }
}
