
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContractCostType;

/** 
 * ��� - �������� ��  �������� ��������, ������ � ����� ���������. (��. 20, 22, 23, 24)
 */
public class KTSContractTermsType extends ContractCostType
{
    private String dealFeatureCode;
    private String dealNatureCode;
    private DeliveryTermsType deliveryTerms;

    /** 
     * Get the 'DealFeatureCode' element value. ��� ����������� ������ (��������). � ������������ � ��������������� ����������� ������������������� ������, ������������ � ������������-������ ����������� �����. ��. 24 ��
     * 
     * @return value
     */
    public String getDealFeatureCode() {
        return dealFeatureCode;
    }

    /** 
     * Set the 'DealFeatureCode' element value. ��� ����������� ������ (��������). � ������������ � ��������������� ����������� ������������������� ������, ������������ � ������������-������ ����������� �����. ��. 24 ��
     * 
     * @param dealFeatureCode
     */
    public void setDealFeatureCode(String dealFeatureCode) {
        this.dealFeatureCode = dealFeatureCode;
    }

    /** 
     * Get the 'DealNatureCode' element value. ��� ��������� ������ � �������������� �������� � ������������ � ��������������� ��������� ������, ������������ � ������������-������ ����������� �����. ��.24 ��
     * 
     * @return value
     */
    public String getDealNatureCode() {
        return dealNatureCode;
    }

    /** 
     * Set the 'DealNatureCode' element value. ��� ��������� ������ � �������������� �������� � ������������ � ��������������� ��������� ������, ������������ � ������������-������ ����������� �����. ��.24 ��
     * 
     * @param dealNatureCode
     */
    public void setDealNatureCode(String dealNatureCode) {
        this.dealNatureCode = dealNatureCode;
    }

    /** 
     * Get the 'DeliveryTerms' element value. ������� �������� �������
     * 
     * @return value
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. ������� �������� �������
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }
}
