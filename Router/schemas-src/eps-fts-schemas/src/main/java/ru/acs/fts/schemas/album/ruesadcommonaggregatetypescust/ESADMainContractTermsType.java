
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContractCostType;

/** 
 * Сведения об условиях сделки. Гр. 11, 20, 22, 23, 28.
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
     * Get the 'TradeCountryCode' element value. Буквенный код торгующей страны по общероссийскому классификатору стран мира.
     * 
     * @return value
     */
    public String getTradeCountryCode() {
        return tradeCountryCode;
    }

    /** 
     * Set the 'TradeCountryCode' element value. Буквенный код торгующей страны по общероссийскому классификатору стран мира.
     * 
     * @param tradeCountryCode
     */
    public void setTradeCountryCode(String tradeCountryCode) {
        this.tradeCountryCode = tradeCountryCode;
    }

    /** 
     * Get the 'AdditionalFinancialData' element value. Иные сведения, заявляемые в гр. 28 под номером 1.
     * 
     * @return value
     */
    public String getAdditionalFinancialData() {
        return additionalFinancialData;
    }

    /** 
     * Set the 'AdditionalFinancialData' element value. Иные сведения, заявляемые в гр. 28 под номером 1.
     * 
     * @param additionalFinancialData
     */
    public void setAdditionalFinancialData(String additionalFinancialData) {
        this.additionalFinancialData = additionalFinancialData;
    }

    /** 
     * Get the 'RBCountryCode' element value. Код административно-территориального деления страны в соответствии с Классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.11, 2-й подраздел
     * 
     * @return value
     */
    public String getRBCountryCode() {
        return RBCountryCode;
    }

    /** 
     * Set the 'RBCountryCode' element value. Код административно-территориального деления страны в соответствии с Классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.11, 2-й подраздел
     * 
     * @param RBCountryCode
     */
    public void setRBCountryCode(String RBCountryCode) {
        this.RBCountryCode = RBCountryCode;
    }

    /** 
     * Get the 'ESADDeliveryTerms' element value. Условия поставки товаров
     * 
     * @return value
     */
    public DeliveryTermsType getESADDeliveryTerms() {
        return ESADDeliveryTerms;
    }

    /** 
     * Set the 'ESADDeliveryTerms' element value. Условия поставки товаров
     * 
     * @param ESADDeliveryTerms
     */
    public void setESADDeliveryTerms(DeliveryTermsType ESADDeliveryTerms) {
        this.ESADDeliveryTerms = ESADDeliveryTerms;
    }

    /** 
     * Get the list of 'FinancialDocuments' element items. Финансовые документы.
     * 
     * @return list
     */
    public List<FinancialDocumentsType> getFinancialDocumentList() {
        return financialDocumentList;
    }

    /** 
     * Set the list of 'FinancialDocuments' element items. Финансовые документы.
     * 
     * @param list
     */
    public void setFinancialDocumentList(List<FinancialDocumentsType> list) {
        financialDocumentList = list;
    }

    /** 
     * Get the 'BankOrganization' element value. ИНН кредитной организации / реквизиты банка в котором открыт счет.
     * 
     * @return value
     */
    public BankOrganizationType getBankOrganization() {
        return bankOrganization;
    }

    /** 
     * Set the 'BankOrganization' element value. ИНН кредитной организации / реквизиты банка в котором открыт счет.
     * 
     * @param bankOrganization
     */
    public void setBankOrganization(BankOrganizationType bankOrganization) {
        this.bankOrganization = bankOrganization;
    }

    /** 
     * Get the 'DealFeatures' element value. Форма расчетов  и особенности сделки (гр. 28 ч.2)
     * 
     * @return value
     */
    public DealFeaturesType getDealFeatures() {
        return dealFeatures;
    }

    /** 
     * Set the 'DealFeatures' element value. Форма расчетов  и особенности сделки (гр. 28 ч.2)
     * 
     * @param dealFeatures
     */
    public void setDealFeatures(DealFeaturesType dealFeatures) {
        this.dealFeatures = dealFeatures;
    }
}
