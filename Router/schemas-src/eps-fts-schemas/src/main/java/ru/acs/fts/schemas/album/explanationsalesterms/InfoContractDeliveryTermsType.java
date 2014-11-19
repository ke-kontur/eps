
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Сведения о договоре и условиях поставки
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
     * Get the 'CostDeliveryIncludedPriceTransactions' element value. Признак того, что стоимость доставки до места назначения включена в цену сделки
     * 
     * @return value
     */
    public String getCostDeliveryIncludedPriceTransactions() {
        return costDeliveryIncludedPriceTransactions;
    }

    /** 
     * Set the 'CostDeliveryIncludedPriceTransactions' element value. Признак того, что стоимость доставки до места назначения включена в цену сделки
     * 
     * @param costDeliveryIncludedPriceTransactions
     */
    public void setCostDeliveryIncludedPriceTransactions(
            String costDeliveryIncludedPriceTransactions) {
        this.costDeliveryIncludedPriceTransactions = costDeliveryIncludedPriceTransactions;
    }

    /** 
     * Get the 'CostDeliverySpecified' element value. Признак того, что стоимость доставки оговаривалась при согласовании цены сделки
     * 
     * @return value
     */
    public String getCostDeliverySpecified() {
        return costDeliverySpecified;
    }

    /** 
     * Set the 'CostDeliverySpecified' element value. Признак того, что стоимость доставки оговаривалась при согласовании цены сделки
     * 
     * @param costDeliverySpecified
     */
    public void setCostDeliverySpecified(String costDeliverySpecified) {
        this.costDeliverySpecified = costDeliverySpecified;
    }

    /** 
     * Get the 'Delivery' element value. Признак того, что покупатель изучал конъюнктуру рынка услуг по доставке товара из страны отправления до места назначения
     * 
     * @return value
     */
    public String getDelivery() {
        return delivery;
    }

    /** 
     * Set the 'Delivery' element value. Признак того, что покупатель изучал конъюнктуру рынка услуг по доставке товара из страны отправления до места назначения
     * 
     * @param delivery
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    /** 
     * Get the 'ConformityCostDeliveryNormaPriceLevel' element value. Признак того, что стоимость доставки оцениваемых товаров соответствует обычному уровню цен, сложившихся на рынке транспортных услуг в отношении товаров того же класса или вида
     * 
     * @return value
     */
    public String getConformityCostDeliveryNormaPriceLevel() {
        return conformityCostDeliveryNormaPriceLevel;
    }

    /** 
     * Set the 'ConformityCostDeliveryNormaPriceLevel' element value. Признак того, что стоимость доставки оцениваемых товаров соответствует обычному уровню цен, сложившихся на рынке транспортных услуг в отношении товаров того же класса или вида
     * 
     * @param conformityCostDeliveryNormaPriceLevel
     */
    public void setConformityCostDeliveryNormaPriceLevel(
            String conformityCostDeliveryNormaPriceLevel) {
        this.conformityCostDeliveryNormaPriceLevel = conformityCostDeliveryNormaPriceLevel;
    }

    /** 
     * Get the 'Account' element value. Какой по счету является партия товара,ввозимого по рассматриваемому контракту
     * 
     * @return value
     */
    public AccountType getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. Какой по счету является партия товара,ввозимого по рассматриваемому контракту
     * 
     * @param account
     */
    public void setAccount(AccountType account) {
        this.account = account;
    }

    /** 
     * Get the 'KindContract' element value. Вид договора
     * 
     * @return value
     */
    public KindContractType getKindContract() {
        return kindContract;
    }

    /** 
     * Set the 'KindContract' element value. Вид договора
     * 
     * @param kindContract
     */
    public void setKindContract(KindContractType kindContract) {
        this.kindContract = kindContract;
    }

    /** 
     * Get the 'TermsContract' element value. Условия контракта
     * 
     * @return value
     */
    public TermsContractType getTermsContract() {
        return termsContract;
    }

    /** 
     * Set the 'TermsContract' element value. Условия контракта
     * 
     * @param termsContract
     */
    public void setTermsContract(TermsContractType termsContract) {
        this.termsContract = termsContract;
    }

    /** 
     * Get the 'TermsDelivery' element value. Кем были предложены предусмотренные контрактом условия поставки.
     * 
     * @return value
     */
    public BuyerSellerType getTermsDelivery() {
        return termsDelivery;
    }

    /** 
     * Set the 'TermsDelivery' element value. Кем были предложены предусмотренные контрактом условия поставки.
     * 
     * @param termsDelivery
     */
    public void setTermsDelivery(BuyerSellerType termsDelivery) {
        this.termsDelivery = termsDelivery;
    }

    /** 
     * Get the 'TransportRouteDelivery' element value. Кто осуществлял выбор вида транспорта и маршрута доставки
     * 
     * @return value
     */
    public BuyerSellerType getTransportRouteDelivery() {
        return transportRouteDelivery;
    }

    /** 
     * Set the 'TransportRouteDelivery' element value. Кто осуществлял выбор вида транспорта и маршрута доставки
     * 
     * @param transportRouteDelivery
     */
    public void setTransportRouteDelivery(BuyerSellerType transportRouteDelivery) {
        this.transportRouteDelivery = transportRouteDelivery;
    }

    /** 
     * Get the 'TransportInsurance' element value. Заключается ли договор транспортного страхования в отношении товаров, поставляемых по контракту
     * 
     * @return value
     */
    public TransportInsuranceType getTransportInsurance() {
        return transportInsurance;
    }

    /** 
     * Set the 'TransportInsurance' element value. Заключается ли договор транспортного страхования в отношении товаров, поставляемых по контракту
     * 
     * @param transportInsurance
     */
    public void setTransportInsurance(TransportInsuranceType transportInsurance) {
        this.transportInsurance = transportInsurance;
    }

    /** 
     * Get the 'CostDelivery' element value. Известна ли Покупателю стоимость доставки.
     * 
     * @return value
     */
    public CostDeliveryType getCostDelivery() {
        return costDelivery;
    }

    /** 
     * Set the 'CostDelivery' element value. Известна ли Покупателю стоимость доставки.
     * 
     * @param costDelivery
     */
    public void setCostDelivery(CostDeliveryType costDelivery) {
        this.costDelivery = costDelivery;
    }

    /** 
     * Get the 'PercentageDelivery' element value. Какую часть цены сделки составляет стоимость доставки
     * 
     * @return value
     */
    public PercentageDeliveryType getPercentageDelivery() {
        return percentageDelivery;
    }

    /** 
     * Set the 'PercentageDelivery' element value. Какую часть цены сделки составляет стоимость доставки
     * 
     * @param percentageDelivery
     */
    public void setPercentageDelivery(PercentageDeliveryType percentageDelivery) {
        this.percentageDelivery = percentageDelivery;
    }

    /** 
     * Get the 'RiskLossDamage' element value. Когда осуществляется переход риска утраты/порчи товара на покупателя
     * 
     * @return value
     */
    public RiskLossDamageType getRiskLossDamage() {
        return riskLossDamage;
    }

    /** 
     * Set the 'RiskLossDamage' element value. Когда осуществляется переход риска утраты/порчи товара на покупателя
     * 
     * @param riskLossDamage
     */
    public void setRiskLossDamage(RiskLossDamageType riskLossDamage) {
        this.riskLossDamage = riskLossDamage;
    }

    /** 
     * Get the 'Property' element value. Переход права собственности от Продавца к Покупателю
     * 
     * @return value
     */
    public PropertyType getProperty() {
        return property;
    }

    /** 
     * Set the 'Property' element value. Переход права собственности от Продавца к Покупателю
     * 
     * @param property
     */
    public void setProperty(PropertyType property) {
        this.property = property;
    }
}
