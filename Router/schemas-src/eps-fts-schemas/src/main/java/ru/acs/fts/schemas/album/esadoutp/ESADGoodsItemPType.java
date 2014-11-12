
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;

/** 
 * ���������� � ������
 */
public class ESADGoodsItemPType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String originCountryCode;
    private String originCountryName;
    private String countryCodeIndicator;
    private String preferencii;
    private String destinationCountryCode;
    private String conformityStatCostIndicator;
    private String customsCostCorrectMethod;
    private String invoiceCostCurCode;
    private String goodsAddTNVEDCode;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private ContainerType container;

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
     * Get the 'Preferencii' element value. �����������, ����������� ������ ��������
     * 
     * @return value
     */
    public String getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. �����������, ����������� ������ ��������
     * 
     * @param preferencii
     */
    public void setPreferencii(String preferencii) {
        this.preferencii = preferencii;
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
     * Get the 'CustomsCostCorrectMethod' element value. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }

    /** 
     * Get the 'InvoiceCostCurCode' element value. ��� ������ ��������� ���������
     * 
     * @return value
     */
    public String getInvoiceCostCurCode() {
        return invoiceCostCurCode;
    }

    /** 
     * Set the 'InvoiceCostCurCode' element value. ��� ������ ��������� ���������
     * 
     * @param invoiceCostCurCode
     */
    public void setInvoiceCostCurCode(String invoiceCostCurCode) {
        this.invoiceCostCurCode = invoiceCostCurCode;
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
     * Get the list of 'GoodsGroupDescription' element items. �������� ������ ������� ������ ������������ � ������������� �� ������ ����� ����������������
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. �������� ������ ������� ������ ������������ � ������������� �� ������ ����� ����������������
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }

    /** 
     * Get the 'Container' element value. ���������� � �����������
     * 
     * @return value
     */
    public ContainerType getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. ���������� � �����������
     * 
     * @param container
     */
    public void setContainer(ContainerType container) {
        this.container = container;
    }
}
