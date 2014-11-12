
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * �������� � ������
 */
public class GoodsType
{
    private String goodsNumber;
    private String TNVEDCode;
    private String grossWeight;
    private String invoicedAmount;
    private String contractCurrencyCode;
    private List<String> containerIdentificatorList = new ArrayList<String>();
    private String netWeightQuantity;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String originCountryCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();
    private GTDIDType regNumberDT;

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� ������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �����
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �����
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'InvoicedAmount' element value. ��������� ���������
     * 
     * @return value
     */
    public String getInvoicedAmount() {
        return invoicedAmount;
    }

    /** 
     * Set the 'InvoicedAmount' element value. ��������� ���������
     * 
     * @param invoicedAmount
     */
    public void setInvoicedAmount(String invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. ��� ������ ���������
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ��� ������ ���������
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the list of 'ContainerIdentificator' element items. ����� (�������������) ����������
     * 
     * @return list
     */
    public List<String> getContainerIdentificatorList() {
        return containerIdentificatorList;
    }

    /** 
     * Set the list of 'ContainerIdentificator' element items. ����� (�������������) ����������
     * 
     * @param list
     */
    public void setContainerIdentificatorList(List<String> list) {
        containerIdentificatorList = list;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� �����, ��
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� �����, ��
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
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
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��������� ��� ������ ������������� ������ � ������������ � ��������������� ����� ����.
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��������� ��� ������ ������������� ������ � ������������ � ��������������� ����� ����.
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
     * Get the list of 'PackingInformation' element items. �������� �� �������� �������
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. �������� �� �������� �������
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the 'RegNumberDT' element value. ����� ����������� ��
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. ����� ����������� ��
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }
}
