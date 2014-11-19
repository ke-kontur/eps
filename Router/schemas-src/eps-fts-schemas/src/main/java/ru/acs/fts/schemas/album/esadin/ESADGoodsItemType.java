
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPreferenciiType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsSTZType;

/** 
 * ESAD. �������� � ������.
 */
public class ESADGoodsItemType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String goodsClassificationCode;
    private String additionalSign;
    private LocalDate beginPeriodDate;
    private LocalDate endPeriodDate;
    private String originCountryCode;
    private String originCountryName;
    private String countryCodeIndicator;
    private String destinationCountryCode;
    private String conformityStatCostIndicator;
    private String goodsShipmentUCR;
    private String intellectPropertySign;
    private String customsCostCorrectMethod;
    private String goodsAddTNVEDCode;
    private String quantityFact;
    private String oilField;
    private LocalDate deliveryTime;
    private LocalDate deliveryTimeEND;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private List<DeliveryTermsType> goodsItemDeliveryTermList = new ArrayList<DeliveryTermsType>();
    private List<GoodsSTZType> goodsSTZList = new ArrayList<GoodsSTZType>();
    private CUPreferenciiType preferencii;

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
     * Get the 'GoodsClassificationCode' element value. ����������� ������������� ����: 1 - �����, 2 - ����� ������. � ��������� ������� �� �����������
     * 
     * @return value
     */
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    /** 
     * Set the 'GoodsClassificationCode' element value. ����������� ������������� ����: 1 - �����, 2 - ����� ������. � ��������� ������� �� �����������
     * 
     * @param goodsClassificationCode
     */
    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    /** 
     * Get the 'AdditionalSign' element value. �������������� ������� ����������� �������������
     * 
     * @return value
     */
    public String getAdditionalSign() {
        return additionalSign;
    }

    /** 
     * Set the 'AdditionalSign' element value. �������������� ������� ����������� �������������
     * 
     * @param additionalSign
     */
    public void setAdditionalSign(String additionalSign) {
        this.additionalSign = additionalSign;
    }

    /** 
     * Get the 'BeginPeriodDate' element value. ���� ������ ������� (���)
     * 
     * @return value
     */
    public LocalDate getBeginPeriodDate() {
        return beginPeriodDate;
    }

    /** 
     * Set the 'BeginPeriodDate' element value. ���� ������ ������� (���)
     * 
     * @param beginPeriodDate
     */
    public void setBeginPeriodDate(LocalDate beginPeriodDate) {
        this.beginPeriodDate = beginPeriodDate;
    }

    /** 
     * Get the 'EndPeriodDate' element value. ���� ��������� ������� (���)
     * 
     * @return value
     */
    public LocalDate getEndPeriodDate() {
        return endPeriodDate;
    }

    /** 
     * Set the 'EndPeriodDate' element value. ���� ��������� ������� (���)
     * 
     * @param endPeriodDate
     */
    public void setEndPeriodDate(LocalDate endPeriodDate) {
        this.endPeriodDate = endPeriodDate;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� �� ��������������� �������������� ����� ���� / ��������� ��� ������ ������������� �� �������������� ������������� ������ � ���������
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� �� ��������������� �������������� ����� ���� / ��������� ��� ������ ������������� �� �������������� ������������� ������ � ���������
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
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
     * Get the 'CountryCodeIndicator' element value. ������� ���� ������ �������������. 1 - ������������� OKSMT 2- ������������� ������ � ��������� EK_EU. � ��������� ������� �� �����������.
     * 
     * @return value
     */
    public String getCountryCodeIndicator() {
        return countryCodeIndicator;
    }

    /** 
     * Set the 'CountryCodeIndicator' element value. ������� ���� ������ �������������. 1 - ������������� OKSMT 2- ������������� ������ � ��������� EK_EU. � ��������� ������� �� �����������.
     * 
     * @param countryCodeIndicator
     */
    public void setCountryCodeIndicator(String countryCodeIndicator) {
        this.countryCodeIndicator = countryCodeIndicator;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ��� ������ ���������� �� ��������������� �������������� ����� ����. 
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ��� ������ ���������� �� ��������������� �������������� ����� ����. 
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'ConformityStatCostIndicator' element value. ������� ���������� �������������� ���������  � ������������� ���� ���
     * 
     * @return value
     */
    public String getConformityStatCostIndicator() {
        return conformityStatCostIndicator;
    }

    /** 
     * Set the 'ConformityStatCostIndicator' element value. ������� ���������� �������������� ���������  � ������������� ���� ���
     * 
     * @param conformityStatCostIndicator
     */
    public void setConformityStatCostIndicator(
            String conformityStatCostIndicator) {
        this.conformityStatCostIndicator = conformityStatCostIndicator;
    }

    /** 
     * Get the 'GoodsShipmentUCR' element value. ������������� �������� ������ �� ������� ���������������� �������������� ��� ������� ��������.
     * 
     * @return value
     */
    public String getGoodsShipmentUCR() {
        return goodsShipmentUCR;
    }

    /** 
     * Set the 'GoodsShipmentUCR' element value. ������������� �������� ������ �� ������� ���������������� �������������� ��� ������� ��������.
     * 
     * @param goodsShipmentUCR
     */
    public void setGoodsShipmentUCR(String goodsShipmentUCR) {
        this.goodsShipmentUCR = goodsShipmentUCR;
    }

    /** 
     * Get the 'IntellectPropertySign' element value. ������� ������� ���������������� �������������
     * 
     * @return value
     */
    public String getIntellectPropertySign() {
        return intellectPropertySign;
    }

    /** 
     * Set the 'IntellectPropertySign' element value. ������� ������� ���������������� �������������
     * 
     * @param intellectPropertySign
     */
    public void setIntellectPropertySign(String intellectPropertySign) {
        this.intellectPropertySign = intellectPropertySign;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. ������. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. ������. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. ���  ������ �� ��������������  �������������� ���������� ����������
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. ���  ������ �� ��������������  �������������� ���������� ����������
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'QuantityFact' element value. ���������� �������, ���������� ���������� ���������� � ������������ � ��������� �������� (������� 8 ��. 31 ��).
     * 
     * @return value
     */
    public String getQuantityFact() {
        return quantityFact;
    }

    /** 
     * Set the 'QuantityFact' element value. ���������� �������, ���������� ���������� ���������� � ������������ � ��������� �������� (������� 8 ��. 31 ��).
     * 
     * @param quantityFact
     */
    public void setQuantityFact(String quantityFact) {
        this.quantityFact = quantityFact;
    }

    /** 
     * Get the 'OilField' element value. �������� � ������������� ������
     * 
     * @return value
     */
    public String getOilField() {
        return oilField;
    }

    /** 
     * Set the 'OilField' element value. �������� � ������������� ������
     * 
     * @param oilField
     */
    public void setOilField(String oilField) {
        this.oilField = oilField;
    }

    /** 
     * Get the 'DeliveryTime' element value. ���� ������ ������� ��������. (������� 7 ��. 31 ��).
     * 
     * @return value
     */
    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    /** 
     * Set the 'DeliveryTime' element value. ���� ������ ������� ��������. (������� 7 ��. 31 ��).
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /** 
     * Get the 'DeliveryTimeEND' element value. ���� ��������� ������� ��������. (������� 7 ��. 31 ��).
     * 
     * @return value
     */
    public LocalDate getDeliveryTimeEND() {
        return deliveryTimeEND;
    }

    /** 
     * Set the 'DeliveryTimeEND' element value. ���� ��������� ������� ��������. (������� 7 ��. 31 ��).
     * 
     * @param deliveryTimeEND
     */
    public void setDeliveryTimeEND(LocalDate deliveryTimeEND) {
        this.deliveryTimeEND = deliveryTimeEND;
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
     * Get the list of 'GoodsItemDeliveryTerms' element items. ������� �������� ������
     * 
     * @return list
     */
    public List<DeliveryTermsType> getGoodsItemDeliveryTermList() {
        return goodsItemDeliveryTermList;
    }

    /** 
     * Set the list of 'GoodsItemDeliveryTerms' element items. ������� �������� ������
     * 
     * @param list
     */
    public void setGoodsItemDeliveryTermList(List<DeliveryTermsType> list) {
        goodsItemDeliveryTermList = list;
    }

    /** 
     * Get the list of 'GoodsSTZ' element items. �������� � �������, ���������� ��� ���������� ��������� ��� ��� ���������� ������. �� 31 � 11. ��� �� � ��
     * 
     * @return list
     */
    public List<GoodsSTZType> getGoodsSTZList() {
        return goodsSTZList;
    }

    /** 
     * Set the list of 'GoodsSTZ' element items. �������� � �������, ���������� ��� ���������� ��������� ��� ��� ���������� ������. �� 31 � 11. ��� �� � ��
     * 
     * @param list
     */
    public void setGoodsSTZList(List<GoodsSTZType> list) {
        goodsSTZList = list;
    }

    /** 
     * Get the 'Preferencii' element value. �����������, ������ � ���� ����������� �� ������ ���������� ��������
     * 
     * @return value
     */
    public CUPreferenciiType getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. �����������, ������ � ���� ����������� �� ������ ���������� ��������
     * 
     * @param preferencii
     */
    public void setPreferencii(CUPreferenciiType preferencii) {
        this.preferencii = preferencii;
    }
}
