
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContractCostType;

/** 
 * �������� �� �������� ������. ��. 11, 20, 22, 23, 28.
 */
public class ESADMainContractTermsType extends ContractCostType
{
    private String tradeCountryCode;
    private String additionalFinancialData;
    private String RBCountryCode;
    private DeliveryTermsType ESADDeliveryTerms;
    private List<FinancialDocumentsType> financialDocumentList = new ArrayList<FinancialDocumentsType>();
    private BankOrganizationType bankOrganization;
    private DealFeaturesType dealFeatures;

    /** 
     * Get the 'TradeCountryCode' element value. ��������� ��� ��������� ������ �� ��������������� �������������� ����� ����.
     * 
     * @return value
     */
    public String getTradeCountryCode() {
        return tradeCountryCode;
    }

    /** 
     * Set the 'TradeCountryCode' element value. ��������� ��� ��������� ������ �� ��������������� �������������� ����� ����.
     * 
     * @param tradeCountryCode
     */
    public void setTradeCountryCode(String tradeCountryCode) {
        this.tradeCountryCode = tradeCountryCode;
    }

    /** 
     * Get the 'AdditionalFinancialData' element value. ���� ��������, ���������� � ��. 28 ��� ������� 1.
     * 
     * @return value
     */
    public String getAdditionalFinancialData() {
        return additionalFinancialData;
    }

    /** 
     * Set the 'AdditionalFinancialData' element value. ���� ��������, ���������� � ��. 28 ��� ������� 1.
     * 
     * @param additionalFinancialData
     */
    public void setAdditionalFinancialData(String additionalFinancialData) {
        this.additionalFinancialData = additionalFinancialData;
    }

    /** 
     * Get the 'RBCountryCode' element value. ��� ���������������-���������������� ������� ������ � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.11, 2-� ���������
     * 
     * @return value
     */
    public String getRBCountryCode() {
        return RBCountryCode;
    }

    /** 
     * Set the 'RBCountryCode' element value. ��� ���������������-���������������� ������� ������ � ������������ � ��������������� ���������������-���������������� ������� �����, ����������� � ���������� ��������. ��.11, 2-� ���������
     * 
     * @param RBCountryCode
     */
    public void setRBCountryCode(String RBCountryCode) {
        this.RBCountryCode = RBCountryCode;
    }

    /** 
     * Get the 'ESADDeliveryTerms' element value. ������� �������� �������
     * 
     * @return value
     */
    public DeliveryTermsType getESADDeliveryTerms() {
        return ESADDeliveryTerms;
    }

    /** 
     * Set the 'ESADDeliveryTerms' element value. ������� �������� �������
     * 
     * @param ESADDeliveryTerms
     */
    public void setESADDeliveryTerms(DeliveryTermsType ESADDeliveryTerms) {
        this.ESADDeliveryTerms = ESADDeliveryTerms;
    }

    /** 
     * Get the list of 'FinancialDocuments' element items. ���������� ���������.
     * 
     * @return list
     */
    public List<FinancialDocumentsType> getFinancialDocumentList() {
        return financialDocumentList;
    }

    /** 
     * Set the list of 'FinancialDocuments' element items. ���������� ���������.
     * 
     * @param list
     */
    public void setFinancialDocumentList(List<FinancialDocumentsType> list) {
        financialDocumentList = list;
    }

    /** 
     * Get the 'BankOrganization' element value. ��� ��������� ����������� / ��������� ����� � ������� ������ ����.
     * 
     * @return value
     */
    public BankOrganizationType getBankOrganization() {
        return bankOrganization;
    }

    /** 
     * Set the 'BankOrganization' element value. ��� ��������� ����������� / ��������� ����� � ������� ������ ����.
     * 
     * @param bankOrganization
     */
    public void setBankOrganization(BankOrganizationType bankOrganization) {
        this.bankOrganization = bankOrganization;
    }

    /** 
     * Get the 'DealFeatures' element value. ����� ��������  � ����������� ������ (��. 28 �.2)
     * 
     * @return value
     */
    public DealFeaturesType getDealFeatures() {
        return dealFeatures;
    }

    /** 
     * Set the 'DealFeatures' element value. ����� ��������  � ����������� ������ (��. 28 �.2)
     * 
     * @param dealFeatures
     */
    public void setDealFeatures(DealFeaturesType dealFeatures) {
        this.dealFeatures = dealFeatures;
    }
}
