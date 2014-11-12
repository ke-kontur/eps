
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;

/** 
 * Сведения об условиях сделки. Гр. 11, 20, 22, 23, 24
 */
public class CUESADMainContractTermsType extends ContractCostType
{
    private String tradeCountryCode;
    private String RBCountryCode;
    private String dealFeatureCode;
    private String dealNatureCode;
    private DeliveryTermsType CUESADDeliveryTerms;

    /** 
     * Get the 'TradeCountryCode' element value. Буквенный код торгующей страны по классификатору стран мира. Гр.11, 1-й подраздел ДТ
     * 
     * @return value
     */
    public String getTradeCountryCode() {
        return tradeCountryCode;
    }

    /** 
     * Set the 'TradeCountryCode' element value. Буквенный код торгующей страны по классификатору стран мира. Гр.11, 1-й подраздел ДТ
     * 
     * @param tradeCountryCode
     */
    public void setTradeCountryCode(String tradeCountryCode) {
        this.tradeCountryCode = tradeCountryCode;
    }

    /** 
     * Get the 'RBCountryCode' element value. Код административно-территориального деления страны в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.11, 2-й подраздел ДТ
     * 
     * @return value
     */
    public String getRBCountryCode() {
        return RBCountryCode;
    }

    /** 
     * Set the 'RBCountryCode' element value. Код административно-территориального деления страны в соответствии с классификатором административно-территориального деления стран, применяемым в Республике Беларусь. Гр.11, 2-й подраздел ДТ
     * 
     * @param RBCountryCode
     */
    public void setRBCountryCode(String RBCountryCode) {
        this.RBCountryCode = RBCountryCode;
    }

    /** 
     * Get the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с классификатором особенности внешнеэкономической сделки, используемым в государствах - членах Таможенного союза. Гр. 24 ДТ
     * 
     * @return value
     */
    public String getDealFeatureCode() {
        return dealFeatureCode;
    }

    /** 
     * Set the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с классификатором особенности внешнеэкономической сделки, используемым в государствах - членах Таможенного союза. Гр. 24 ДТ
     * 
     * @param dealFeatureCode
     */
    public void setDealFeatureCode(String dealFeatureCode) {
        this.dealFeatureCode = dealFeatureCode;
    }

    /** 
     * Get the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с классификатором характера сделки, используемым в государствах - членах Таможенного союза. Гр.24 ДТ
     * 
     * @return value
     */
    public String getDealNatureCode() {
        return dealNatureCode;
    }

    /** 
     * Set the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с классификатором характера сделки, используемым в государствах - членах Таможенного союза. Гр.24 ДТ
     * 
     * @param dealNatureCode
     */
    public void setDealNatureCode(String dealNatureCode) {
        this.dealNatureCode = dealNatureCode;
    }

    /** 
     * Get the 'CUESADDeliveryTerms' element value. Условия поставки товаров. Гр. 20 ДТ
     * 
     * @return value
     */
    public DeliveryTermsType getCUESADDeliveryTerms() {
        return CUESADDeliveryTerms;
    }

    /** 
     * Set the 'CUESADDeliveryTerms' element value. Условия поставки товаров. Гр. 20 ДТ
     * 
     * @param CUESADDeliveryTerms
     */
    public void setCUESADDeliveryTerms(DeliveryTermsType CUESADDeliveryTerms) {
        this.CUESADDeliveryTerms = CUESADDeliveryTerms;
    }
}
