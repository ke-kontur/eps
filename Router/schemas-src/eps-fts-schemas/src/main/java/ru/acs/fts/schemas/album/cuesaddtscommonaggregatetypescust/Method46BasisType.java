
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * ќснова дл€ расчета таможенной стоимости по методу 4,6 гр. ј (11)
 */
public class Method46BasisType
{
    private String identicalDealNationalPrice;
    private String identicalDealCode;

    /** 
     * Get the 'IdenticalDealNationalPrice' element value. ÷ена единицы оцениваемых, идентичных или однородных товаров в национальной валюте
     * 
     * @return value
     */
    public String getIdenticalDealNationalPrice() {
        return identicalDealNationalPrice;
    }

    /** 
     * Set the 'IdenticalDealNationalPrice' element value. ÷ена единицы оцениваемых, идентичных или однородных товаров в национальной валюте
     * 
     * @param identicalDealNationalPrice
     */
    public void setIdenticalDealNationalPrice(String identicalDealNationalPrice) {
        this.identicalDealNationalPrice = identicalDealNationalPrice;
    }

    /** 
     * Get the 'IdenticalDealCode' element value.  од единицы измерени€ в соответствии с классификатором единиц измерени€
     * 
     * @return value
     */
    public String getIdenticalDealCode() {
        return identicalDealCode;
    }

    /** 
     * Set the 'IdenticalDealCode' element value.  од единицы измерени€ в соответствии с классификатором единиц измерени€
     * 
     * @param identicalDealCode
     */
    public void setIdenticalDealCode(String identicalDealCode) {
        this.identicalDealCode = identicalDealCode;
    }
}
