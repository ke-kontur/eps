
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContractCostType;

/** 
 * КТС - Сведения об  условиях поставки, валюте и общей стоимости. (гр. 20, 22, 23, 24)
 */
public class KTSContractTermsType extends ContractCostType
{
    private String dealFeatureCode;
    private String dealNatureCode;
    private DeliveryTermsType deliveryTerms;

    /** 
     * Get the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с классификатором особенности внешнеэкономической сделки, используемым в государствах-членах Таможенного союза. Гр. 24 ДТ
     * 
     * @return value
     */
    public String getDealFeatureCode() {
        return dealFeatureCode;
    }

    /** 
     * Set the 'DealFeatureCode' element value. Код особенности сделки (договора). В соответствии с классификатором особенности внешнеэкономической сделки, используемым в государствах-членах Таможенного союза. Гр. 24 ДТ
     * 
     * @param dealFeatureCode
     */
    public void setDealFeatureCode(String dealFeatureCode) {
        this.dealFeatureCode = dealFeatureCode;
    }

    /** 
     * Get the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с классификатором характера сделки, используемым в государствах-членах Таможенного союза. Гр.24 ДТ
     * 
     * @return value
     */
    public String getDealNatureCode() {
        return dealNatureCode;
    }

    /** 
     * Set the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами в соответствии с классификатором характера сделки, используемым в государствах-членах Таможенного союза. Гр.24 ДТ
     * 
     * @param dealNatureCode
     */
    public void setDealNatureCode(String dealNatureCode) {
        this.dealNatureCode = dealNatureCode;
    }

    /** 
     * Get the 'DeliveryTerms' element value. Условие поставки товаров
     * 
     * @return value
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. Условие поставки товаров
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }
}
