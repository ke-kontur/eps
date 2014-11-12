
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;

/** 
 * �������� �� �������� ������. ��. 11, 20, 22, 23, 24
 */
public class CUESADMainContractTermsType extends ContractCostType
{
    private String tradeCountryCode;
    private String RBCountryCode;
    private String dealFeatureCode;
    private String dealNatureCode;
    private DeliveryTermsType CUESADDeliveryTerms;

    /** 
     * Get the 'TradeCountryCode' element value. ��������� ��� ��������� ������ �� �������������� ����� ����. ��.11, 1-� ��������� ��
     * 
     * @return value
     */
    public String getTradeCountryCode() {
        return tradeCountryCode;
    }

    /** 
     * Set the 'TradeCountryCode' element value. ��������� ��� ��������� ������ �� �������������� ����� ����. ��.11, 1-� ��������� ��
     * 
     * @param tradeCountryCode
     */
    public void setTradeCountryCode(String tradeCountryCode) {
        this.tradeCountryCode = tradeCountryCode;
    }

    /** 
     * Get the 'RBCountryCode' element value. ��� ���������������-���������������� ������� ������ � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.11, 2-� ��������� ��
     * 
     * @return value
     */
    public String getRBCountryCode() {
        return RBCountryCode;
    }

    /** 
     * Set the 'RBCountryCode' element value. ��� ���������������-���������������� ������� ������ � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.11, 2-� ��������� ��
     * 
     * @param RBCountryCode
     */
    public void setRBCountryCode(String RBCountryCode) {
        this.RBCountryCode = RBCountryCode;
    }

    /** 
     * Get the 'DealFeatureCode' element value. ��� ����������� ������ (��������). � ������������ � ��������������� ����������� ������������������� ������, ������������ � ������������ - ������ ����������� �����. ��. 24 ��
     * 
     * @return value
     */
    public String getDealFeatureCode() {
        return dealFeatureCode;
    }

    /** 
     * Set the 'DealFeatureCode' element value. ��� ����������� ������ (��������). � ������������ � ��������������� ����������� ������������������� ������, ������������ � ������������ - ������ ����������� �����. ��. 24 ��
     * 
     * @param dealFeatureCode
     */
    public void setDealFeatureCode(String dealFeatureCode) {
        this.dealFeatureCode = dealFeatureCode;
    }

    /** 
     * Get the 'DealNatureCode' element value. ��� ��������� ������ � �������������� �������� � ������������ � ��������������� ��������� ������, ������������ � ������������ - ������ ����������� �����. ��.24 ��
     * 
     * @return value
     */
    public String getDealNatureCode() {
        return dealNatureCode;
    }

    /** 
     * Set the 'DealNatureCode' element value. ��� ��������� ������ � �������������� �������� � ������������ � ��������������� ��������� ������, ������������ � ������������ - ������ ����������� �����. ��.24 ��
     * 
     * @param dealNatureCode
     */
    public void setDealNatureCode(String dealNatureCode) {
        this.dealNatureCode = dealNatureCode;
    }

    /** 
     * Get the 'CUESADDeliveryTerms' element value. ������� �������� �������. ��. 20 ��
     * 
     * @return value
     */
    public DeliveryTermsType getCUESADDeliveryTerms() {
        return CUESADDeliveryTerms;
    }

    /** 
     * Set the 'CUESADDeliveryTerms' element value. ������� �������� �������. ��. 20 ��
     * 
     * @param CUESADDeliveryTerms
     */
    public void setCUESADDeliveryTerms(DeliveryTermsType CUESADDeliveryTerms) {
        this.CUESADDeliveryTerms = CUESADDeliveryTerms;
    }
}
