
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Описание условий контракта
 */
public class ContractDescriptionType extends ImportContractTermsType
{
    private List<String> exchangeClauseList = new ArrayList<String>();
    private List<String> contractSubjectList = new ArrayList<String>();
    private LocalDate contractTime;
    private LocalDate additionalContractTime;
    private List<String> otherTermList = new ArrayList<String>();
    private List<String> contractTextList = new ArrayList<String>();
    private String discountPercentage;
    private String paymentPeriod;
    private String dealSign;
    private String prepaySign;
    private String stockCategorySign;
    private String buyerLimitationSign;
    private String insuranceSign;
    private List<DocumentBaseType> changeContractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'ExchangeClause' element items. Сведения о предусмотренном условиями Контракта порядке пересчета валюты платежа в валюту цены 
     * 
     * @return list
     */
    public List<String> getExchangeClauseList() {
        return exchangeClauseList;
    }

    /** 
     * Set the list of 'ExchangeClause' element items. Сведения о предусмотренном условиями Контракта порядке пересчета валюты платежа в валюту цены 
     * 
     * @param list
     */
    public void setExchangeClauseList(List<String> list) {
        exchangeClauseList = list;
    }

    /** 
     * Get the list of 'ContractSubject' element items. Предмет контракта
     * 
     * @return list
     */
    public List<String> getContractSubjectList() {
        return contractSubjectList;
    }

    /** 
     * Set the list of 'ContractSubject' element items. Предмет контракта
     * 
     * @param list
     */
    public void setContractSubjectList(List<String> list) {
        contractSubjectList = list;
    }

    /** 
     * Get the 'ContractTime' element value. Срок действия контракта 
     * 
     * @return value
     */
    public LocalDate getContractTime() {
        return contractTime;
    }

    /** 
     * Set the 'ContractTime' element value. Срок действия контракта 
     * 
     * @param contractTime
     */
    public void setContractTime(LocalDate contractTime) {
        this.contractTime = contractTime;
    }

    /** 
     * Get the 'AdditionalContractTime' element value. Дополнительный срок действия контракта (применяется в случае автоматического пролонгирования)
     * 
     * @return value
     */
    public LocalDate getAdditionalContractTime() {
        return additionalContractTime;
    }

    /** 
     * Set the 'AdditionalContractTime' element value. Дополнительный срок действия контракта (применяется в случае автоматического пролонгирования)
     * 
     * @param additionalContractTime
     */
    public void setAdditionalContractTime(LocalDate additionalContractTime) {
        this.additionalContractTime = additionalContractTime;
    }

    /** 
     * Get the list of 'OtherTerms' element items. Прочие условия сделки.
     * 
     * @return list
     */
    public List<String> getOtherTermList() {
        return otherTermList;
    }

    /** 
     * Set the list of 'OtherTerms' element items. Прочие условия сделки.
     * 
     * @param list
     */
    public void setOtherTermList(List<String> list) {
        otherTermList = list;
    }

    /** 
     * Get the list of 'ContractText' element items. Текст контракта
     * 
     * @return list
     */
    public List<String> getContractTextList() {
        return contractTextList;
    }

    /** 
     * Set the list of 'ContractText' element items. Текст контракта
     * 
     * @param list
     */
    public void setContractTextList(List<String> list) {
        contractTextList = list;
    }

    /** 
     * Get the 'DiscountPercentage' element value. Размер скидки в процентах
     * 
     * @return value
     */
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    /** 
     * Set the 'DiscountPercentage' element value. Размер скидки в процентах
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /** 
     * Get the 'PaymentPeriod' element value. Срок оплаты
     * 
     * @return value
     */
    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    /** 
     * Set the 'PaymentPeriod' element value. Срок оплаты
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    /** 
     * Get the 'DealSign' element value. Признак сделки купли/продажи (1 - купля, 0 - продажа)
     * 
     * @return value
     */
    public String getDealSign() {
        return dealSign;
    }

    /** 
     * Set the 'DealSign' element value. Признак сделки купли/продажи (1 - купля, 0 - продажа)
     * 
     * @param dealSign
     */
    public void setDealSign(String dealSign) {
        this.dealSign = dealSign;
    }

    /** 
     * Get the 'PrepaySign' element value. Признак наличия предоплаты
     * 
     * @return value
     */
    public String getPrepaySign() {
        return prepaySign;
    }

    /** 
     * Set the 'PrepaySign' element value. Признак наличия предоплаты
     * 
     * @param prepaySign
     */
    public void setPrepaySign(String prepaySign) {
        this.prepaySign = prepaySign;
    }

    /** 
     * Get the 'StockCategorySign' element value. Признак отнесения товаров (предмета контракта) к категории биржевых
     * 
     * @return value
     */
    public String getStockCategorySign() {
        return stockCategorySign;
    }

    /** 
     * Set the 'StockCategorySign' element value. Признак отнесения товаров (предмета контракта) к категории биржевых
     * 
     * @param stockCategorySign
     */
    public void setStockCategorySign(String stockCategorySign) {
        this.stockCategorySign = stockCategorySign;
    }

    /** 
     * Get the 'BuyerLimitationSign' element value. Признак наличия ограничений в отношении прав покупателя
     * 
     * @return value
     */
    public String getBuyerLimitationSign() {
        return buyerLimitationSign;
    }

    /** 
     * Set the 'BuyerLimitationSign' element value. Признак наличия ограничений в отношении прав покупателя
     * 
     * @param buyerLimitationSign
     */
    public void setBuyerLimitationSign(String buyerLimitationSign) {
        this.buyerLimitationSign = buyerLimitationSign;
    }

    /** 
     * Get the 'InsuranceSign' element value. Признак наличия страховки товаров
     * 
     * @return value
     */
    public String getInsuranceSign() {
        return insuranceSign;
    }

    /** 
     * Set the 'InsuranceSign' element value. Признак наличия страховки товаров
     * 
     * @param insuranceSign
     */
    public void setInsuranceSign(String insuranceSign) {
        this.insuranceSign = insuranceSign;
    }

    /** 
     * Get the list of 'ChangeContract' element items. Номера и даты изменений/дополнений к контракту.  
     * 
     * @return list
     */
    public List<DocumentBaseType> getChangeContractList() {
        return changeContractList;
    }

    /** 
     * Set the list of 'ChangeContract' element items. Номера и даты изменений/дополнений к контракту.  
     * 
     * @param list
     */
    public void setChangeContractList(List<DocumentBaseType> list) {
        changeContractList = list;
    }
}
