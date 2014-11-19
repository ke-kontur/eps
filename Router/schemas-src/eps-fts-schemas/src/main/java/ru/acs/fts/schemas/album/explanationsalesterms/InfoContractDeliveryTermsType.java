
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� � �������� � �������� ��������
 */
public class InfoContractDeliveryTermsType
{
    private String costDeliveryIncludedPriceTransactions;
    private String costDeliverySpecified;
    private String delivery;
    private String conformityCostDeliveryNormaPriceLevel;
    private AccountType account;
    private KindContractType kindContract;
    private TermsContractType termsContract;
    private BuyerSellerType termsDelivery;
    private BuyerSellerType transportRouteDelivery;
    private TransportInsuranceType transportInsurance;
    private CostDeliveryType costDelivery;
    private PercentageDeliveryType percentageDelivery;
    private RiskLossDamageType riskLossDamage;
    private PropertyType property;

    /** 
     * Get the 'CostDeliveryIncludedPriceTransactions' element value. ������� ����, ��� ��������� �������� �� ����� ���������� �������� � ���� ������
     * 
     * @return value
     */
    public String getCostDeliveryIncludedPriceTransactions() {
        return costDeliveryIncludedPriceTransactions;
    }

    /** 
     * Set the 'CostDeliveryIncludedPriceTransactions' element value. ������� ����, ��� ��������� �������� �� ����� ���������� �������� � ���� ������
     * 
     * @param costDeliveryIncludedPriceTransactions
     */
    public void setCostDeliveryIncludedPriceTransactions(
            String costDeliveryIncludedPriceTransactions) {
        this.costDeliveryIncludedPriceTransactions = costDeliveryIncludedPriceTransactions;
    }

    /** 
     * Get the 'CostDeliverySpecified' element value. ������� ����, ��� ��������� �������� ������������� ��� ������������ ���� ������
     * 
     * @return value
     */
    public String getCostDeliverySpecified() {
        return costDeliverySpecified;
    }

    /** 
     * Set the 'CostDeliverySpecified' element value. ������� ����, ��� ��������� �������� ������������� ��� ������������ ���� ������
     * 
     * @param costDeliverySpecified
     */
    public void setCostDeliverySpecified(String costDeliverySpecified) {
        this.costDeliverySpecified = costDeliverySpecified;
    }

    /** 
     * Get the 'Delivery' element value. ������� ����, ��� ���������� ������ ����������� ����� ����� �� �������� ������ �� ������ ����������� �� ����� ����������
     * 
     * @return value
     */
    public String getDelivery() {
        return delivery;
    }

    /** 
     * Set the 'Delivery' element value. ������� ����, ��� ���������� ������ ����������� ����� ����� �� �������� ������ �� ������ ����������� �� ����� ����������
     * 
     * @param delivery
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    /** 
     * Get the 'ConformityCostDeliveryNormaPriceLevel' element value. ������� ����, ��� ��������� �������� ����������� ������� ������������� �������� ������ ���, ����������� �� ����� ������������ ����� � ��������� ������� ���� �� ������ ��� ����
     * 
     * @return value
     */
    public String getConformityCostDeliveryNormaPriceLevel() {
        return conformityCostDeliveryNormaPriceLevel;
    }

    /** 
     * Set the 'ConformityCostDeliveryNormaPriceLevel' element value. ������� ����, ��� ��������� �������� ����������� ������� ������������� �������� ������ ���, ����������� �� ����� ������������ ����� � ��������� ������� ���� �� ������ ��� ����
     * 
     * @param conformityCostDeliveryNormaPriceLevel
     */
    public void setConformityCostDeliveryNormaPriceLevel(
            String conformityCostDeliveryNormaPriceLevel) {
        this.conformityCostDeliveryNormaPriceLevel = conformityCostDeliveryNormaPriceLevel;
    }

    /** 
     * Get the 'Account' element value. ����� �� ����� �������� ������ ������,��������� �� ���������������� ���������
     * 
     * @return value
     */
    public AccountType getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. ����� �� ����� �������� ������ ������,��������� �� ���������������� ���������
     * 
     * @param account
     */
    public void setAccount(AccountType account) {
        this.account = account;
    }

    /** 
     * Get the 'KindContract' element value. ��� ��������
     * 
     * @return value
     */
    public KindContractType getKindContract() {
        return kindContract;
    }

    /** 
     * Set the 'KindContract' element value. ��� ��������
     * 
     * @param kindContract
     */
    public void setKindContract(KindContractType kindContract) {
        this.kindContract = kindContract;
    }

    /** 
     * Get the 'TermsContract' element value. ������� ���������
     * 
     * @return value
     */
    public TermsContractType getTermsContract() {
        return termsContract;
    }

    /** 
     * Set the 'TermsContract' element value. ������� ���������
     * 
     * @param termsContract
     */
    public void setTermsContract(TermsContractType termsContract) {
        this.termsContract = termsContract;
    }

    /** 
     * Get the 'TermsDelivery' element value. ��� ���� ���������� ��������������� ���������� ������� ��������.
     * 
     * @return value
     */
    public BuyerSellerType getTermsDelivery() {
        return termsDelivery;
    }

    /** 
     * Set the 'TermsDelivery' element value. ��� ���� ���������� ��������������� ���������� ������� ��������.
     * 
     * @param termsDelivery
     */
    public void setTermsDelivery(BuyerSellerType termsDelivery) {
        this.termsDelivery = termsDelivery;
    }

    /** 
     * Get the 'TransportRouteDelivery' element value. ��� ����������� ����� ���� ���������� � �������� ��������
     * 
     * @return value
     */
    public BuyerSellerType getTransportRouteDelivery() {
        return transportRouteDelivery;
    }

    /** 
     * Set the 'TransportRouteDelivery' element value. ��� ����������� ����� ���� ���������� � �������� ��������
     * 
     * @param transportRouteDelivery
     */
    public void setTransportRouteDelivery(BuyerSellerType transportRouteDelivery) {
        this.transportRouteDelivery = transportRouteDelivery;
    }

    /** 
     * Get the 'TransportInsurance' element value. ����������� �� ������� ������������� ����������� � ��������� �������, ������������ �� ���������
     * 
     * @return value
     */
    public TransportInsuranceType getTransportInsurance() {
        return transportInsurance;
    }

    /** 
     * Set the 'TransportInsurance' element value. ����������� �� ������� ������������� ����������� � ��������� �������, ������������ �� ���������
     * 
     * @param transportInsurance
     */
    public void setTransportInsurance(TransportInsuranceType transportInsurance) {
        this.transportInsurance = transportInsurance;
    }

    /** 
     * Get the 'CostDelivery' element value. �������� �� ���������� ��������� ��������.
     * 
     * @return value
     */
    public CostDeliveryType getCostDelivery() {
        return costDelivery;
    }

    /** 
     * Set the 'CostDelivery' element value. �������� �� ���������� ��������� ��������.
     * 
     * @param costDelivery
     */
    public void setCostDelivery(CostDeliveryType costDelivery) {
        this.costDelivery = costDelivery;
    }

    /** 
     * Get the 'PercentageDelivery' element value. ����� ����� ���� ������ ���������� ��������� ��������
     * 
     * @return value
     */
    public PercentageDeliveryType getPercentageDelivery() {
        return percentageDelivery;
    }

    /** 
     * Set the 'PercentageDelivery' element value. ����� ����� ���� ������ ���������� ��������� ��������
     * 
     * @param percentageDelivery
     */
    public void setPercentageDelivery(PercentageDeliveryType percentageDelivery) {
        this.percentageDelivery = percentageDelivery;
    }

    /** 
     * Get the 'RiskLossDamage' element value. ����� �������������� ������� ����� ������/����� ������ �� ����������
     * 
     * @return value
     */
    public RiskLossDamageType getRiskLossDamage() {
        return riskLossDamage;
    }

    /** 
     * Set the 'RiskLossDamage' element value. ����� �������������� ������� ����� ������/����� ������ �� ����������
     * 
     * @param riskLossDamage
     */
    public void setRiskLossDamage(RiskLossDamageType riskLossDamage) {
        this.riskLossDamage = riskLossDamage;
    }

    /** 
     * Get the 'Property' element value. ������� ����� ������������� �� �������� � ����������
     * 
     * @return value
     */
    public PropertyType getProperty() {
        return property;
    }

    /** 
     * Set the 'Property' element value. ������� ����� ������������� �� �������� � ����������
     * 
     * @param property
     */
    public void setProperty(PropertyType property) {
        this.property = property;
    }
}
