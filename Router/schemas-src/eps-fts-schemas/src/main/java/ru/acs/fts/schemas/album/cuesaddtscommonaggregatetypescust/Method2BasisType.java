
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Основа расчета таможенной стоимости по методу 2,3,6. Гр. А (11)
 */
public class Method2BasisType
{
    private String identicalDealNationalAmount;

    /** 
     * Get the 'IdenticalDealNationalAmount' element value. Стоимость сделки с идентичными/однородными товарами в национальной валюте. 11
     * 
     * @return value
     */
    public String getIdenticalDealNationalAmount() {
        return identicalDealNationalAmount;
    }

    /** 
     * Set the 'IdenticalDealNationalAmount' element value. Стоимость сделки с идентичными/однородными товарами в национальной валюте. 11
     * 
     * @param identicalDealNationalAmount
     */
    public void setIdenticalDealNationalAmount(
            String identicalDealNationalAmount) {
        this.identicalDealNationalAmount = identicalDealNationalAmount;
    }
}
