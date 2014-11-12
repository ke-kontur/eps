
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;

/** 
 * �������� � ������
 */
public class CUESADGoodsItemType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String goodsClassificationCode;
    private String additionalSign;
    private String intellectPropertySign;
    private List<String> restrictionSignList = new ArrayList<String>();
    private LocalDate beginPeriodDate;
    private LocalDate endPeriodDate;
    private String originCountryCode;
    private String originCountryName;
    private String customsCostCorrectMethod;
    private String goodsAddTNVEDCode;
    private LocalDate deliveryTime;
    private LocalDate deliveryTimeEND;
    private String additionalSheetCount;
    private String quantityFact;
    private String oilField;
    private String TNVEDContract;
    private List<DeliveryTermsType> CUESADDeliveryTermList = new ArrayList<DeliveryTermsType>();
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private CUPreferenciiType preferencii;
    private List<GoodsSTZType> goodsSTZList = new ArrayList<GoodsSTZType>();

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��. ��.33 ������ ������
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��. ��.33 ������ ������
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsClassificationCode' element value. ����������� ������������� ����: 1 - ����� "�", 2 - ����� ������. � ��������� ������� �� �����������
     * 
     * @return value
     */
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    /** 
     * Set the 'GoodsClassificationCode' element value. ����������� ������������� ����: 1 - ����� "�", 2 - ����� ������. � ��������� ������� �� �����������
     * 
     * @param goodsClassificationCode
     */
    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    /** 
     * Get the 'AdditionalSign' element value. �������������� ������� ����������� ������������� ("�"). ��.33 ������ ������
     * 
     * @return value
     */
    public String getAdditionalSign() {
        return additionalSign;
    }

    /** 
     * Set the 'AdditionalSign' element value. �������������� ������� ����������� ������������� ("�"). ��.33 ������ ������
     * 
     * @param additionalSign
     */
    public void setAdditionalSign(String additionalSign) {
        this.additionalSign = additionalSign;
    }

    /** 
     * Get the 'IntellectPropertySign' element value. ������� ������� ���������������� ������������� ("�"). ��.33 ������ ������  � ��
     * 
     * @return value
     */
    public String getIntellectPropertySign() {
        return intellectPropertySign;
    }

    /** 
     * Set the 'IntellectPropertySign' element value. ������� ������� ���������������� ������������� ("�"). ��.33 ������ ������  � ��
     * 
     * @param intellectPropertySign
     */
    public void setIntellectPropertySign(String intellectPropertySign) {
        this.intellectPropertySign = intellectPropertySign;
    }

    /** 
     * Get the list of 'RestrictionSign' element items. ��������� ��� ���������� �������� � ����������� � ������������ � ���������������. ��� ��
     * 
     * @return list
     */
    public List<String> getRestrictionSignList() {
        return restrictionSignList;
    }

    /** 
     * Set the list of 'RestrictionSign' element items. ��������� ��� ���������� �������� � ����������� � ������������ � ���������������. ��� ��
     * 
     * @param list
     */
    public void setRestrictionSignList(List<String> list) {
        restrictionSignList = list;
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
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ���� / "EU" / 00 (����������)  ��.34
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ���� / "EU" / 00 (����������)  ��.34
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. ������� �������� ������ ������������� / �������������� �����
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������� �������� ������ ������������� / �������������� �����
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. ��� ������ ����������� ���������� ���������. � ������������ � ��������������� ������� ����������� ���������� ���������. ��. 43
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. ��� ������ ����������� ���������� ���������. � ������������ � ��������������� ������� ����������� ���������� ���������. ��. 43
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. ���  ������ � ������������ � ��������������� �������������� ���������� ����������
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. ���  ������ � ������������ � ��������������� �������������� ���������� ����������
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'DeliveryTime' element value. ���� ������ ������� ��������. (������� 7 ��. 31 ��)
     * 
     * @return value
     */
    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    /** 
     * Set the 'DeliveryTime' element value. ���� ������ ������� ��������. (������� 7 ��. 31 ��)
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /** 
     * Get the 'DeliveryTimeEND' element value. ���� ��������� ������� ��������. (������� 7 ��. 31 ��)
     * 
     * @return value
     */
    public LocalDate getDeliveryTimeEND() {
        return deliveryTimeEND;
    }

    /** 
     * Set the 'DeliveryTimeEND' element value. ���� ��������� ������� ��������. (������� 7 ��. 31 ��)
     * 
     * @param deliveryTimeEND
     */
    public void setDeliveryTimeEND(LocalDate deliveryTimeEND) {
        this.deliveryTimeEND = deliveryTimeEND;
    }

    /** 
     * Get the 'AdditionalSheetCount' element value. ���������� ����� ����� (������ ��������� ��.3)
     * 
     * @return value
     */
    public String getAdditionalSheetCount() {
        return additionalSheetCount;
    }

    /** 
     * Set the 'AdditionalSheetCount' element value. ���������� ����� ����� (������ ��������� ��.3)
     * 
     * @param additionalSheetCount
     */
    public void setAdditionalSheetCount(String additionalSheetCount) {
        this.additionalSheetCount = additionalSheetCount;
    }

    /** 
     * Get the 'QuantityFact' element value. ���������� �������, ���������� ���������� ���������� � ������������ � ��������� �������� (������� 8 ��. 31 ��)
     * 
     * @return value
     */
    public String getQuantityFact() {
        return quantityFact;
    }

    /** 
     * Set the 'QuantityFact' element value. ���������� �������, ���������� ���������� ���������� � ������������ � ��������� �������� (������� 8 ��. 31 ��)
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
     * Get the 'TNVEDContract' element value. ��� ������ �� ���, ����������� �� ���� ���������� ���������� � ������������������. ��� ��
     * 
     * @return value
     */
    public String getTNVEDContract() {
        return TNVEDContract;
    }

    /** 
     * Set the 'TNVEDContract' element value. ��� ������ �� ���, ����������� �� ���� ���������� ���������� � ������������������. ��� ��
     * 
     * @param TNVEDContract
     */
    public void setTNVEDContract(String TNVEDContract) {
        this.TNVEDContract = TNVEDContract;
    }

    /** 
     * Get the list of 'CUESADDeliveryTerms' element items. ������� �������� �������. ��.31 ����� ���������
     * 
     * @return list
     */
    public List<DeliveryTermsType> getCUESADDeliveryTermList() {
        return CUESADDeliveryTermList;
    }

    /** 
     * Set the list of 'CUESADDeliveryTerms' element items. ������� �������� �������. ��.31 ����� ���������
     * 
     * @param list
     */
    public void setCUESADDeliveryTermList(List<DeliveryTermsType> list) {
        CUESADDeliveryTermList = list;
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
     * Get the 'Preferencii' element value. ����������� � ������������ � ��������������� ����� �� ������ ���������� ��������. ��.36
     * 
     * @return value
     */
    public CUPreferenciiType getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. ����������� � ������������ � ��������������� ����� �� ������ ���������� ��������. ��.36
     * 
     * @param preferencii
     */
    public void setPreferencii(CUPreferenciiType preferencii) {
        this.preferencii = preferencii;
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
}
