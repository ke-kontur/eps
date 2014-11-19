
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * ќснова расчета таможенной стоимости по методу 2,3,6. √р. ј (11)
 */
public class Method2BasisType
{
    private String identicalDealNationalAmount;

    /** 
     * Get the 'IdenticalDealNationalAmount' element value. —тоимость сделки с идентичными/однородными товарами в национальной валюте. 11
     * 
     * @return value
     */
    public String getIdenticalDealNationalAmount() {
        return identicalDealNationalAmount;
    }

    /** 
     * Set the 'IdenticalDealNationalAmount' element value. —тоимость сделки с идентичными/однородными товарами в национальной валюте. 11
     * 
     * @param identicalDealNationalAmount
     */
    public void setIdenticalDealNationalAmount(
            String identicalDealNationalAmount) {
        this.identicalDealNationalAmount = identicalDealNationalAmount;
    }
}
