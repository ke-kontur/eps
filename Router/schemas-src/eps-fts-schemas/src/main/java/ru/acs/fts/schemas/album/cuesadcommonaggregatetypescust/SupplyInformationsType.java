
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� �������� �������. ��� ��
 */
public class SupplyInformationsType
{
    private String originCountryName;
    private String customsCost;
    private String contractCurrencyCode;
    private DeliveryTermsRUType deliveryTerms;
    private List<SupplementaryQuantityType> goodsQuantityList = new ArrayList<SupplementaryQuantityType>();
    private SupplyConsignorType supplyConsignor;
    private SupplyConsigneeType supplyConsignee;

    /** 
     * Get the 'OriginCountryName' element value. ������ �������������
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������ �������������
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CustomsCost' element value. �������� ���������� ���������
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. �������� ���������� ���������
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ��� ������
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'DeliveryTerms' element value. ������� ��������.
     * 
     * @return value
     */
    public DeliveryTermsRUType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. ������� ��������.
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsRUType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the list of 'GoodsQuantity' element items. ���������� ������ � �������� ���������.
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getGoodsQuantityList() {
        return goodsQuantityList;
    }

    /** 
     * Set the list of 'GoodsQuantity' element items. ���������� ������ � �������� ���������.
     * 
     * @param list
     */
    public void setGoodsQuantityList(List<SupplementaryQuantityType> list) {
        goodsQuantityList = list;
    }

    /** 
     * Get the 'SupplyConsignor' element value. ����������� ��������.
     * 
     * @return value
     */
    public SupplyConsignorType getSupplyConsignor() {
        return supplyConsignor;
    }

    /** 
     * Set the 'SupplyConsignor' element value. ����������� ��������.
     * 
     * @param supplyConsignor
     */
    public void setSupplyConsignor(SupplyConsignorType supplyConsignor) {
        this.supplyConsignor = supplyConsignor;
    }

    /** 
     * Get the 'SupplyConsignee' element value. ���������� ��������.
     * 
     * @return value
     */
    public SupplyConsigneeType getSupplyConsignee() {
        return supplyConsignee;
    }

    /** 
     * Set the 'SupplyConsignee' element value. ���������� ��������.
     * 
     * @param supplyConsignee
     */
    public void setSupplyConsignee(SupplyConsigneeType supplyConsignee) {
        this.supplyConsignee = supplyConsignee;
    }
}
