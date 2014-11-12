
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Основа для расчета таможенной стоимости по методу 4,6 гр. А (11)
 */
public class Method46BasisType
{
    private String identicalDealNationalPrice;
    private String identicalDealCode;

    /** 
     * Get the 'IdenticalDealNationalPrice' element value. Цена единицы оцениваемых, идентичных или однородных товаров в национальной валюте
     * 
     * @return value
     */
    public String getIdenticalDealNationalPrice() {
        return identicalDealNationalPrice;
    }

    /** 
     * Set the 'IdenticalDealNationalPrice' element value. Цена единицы оцениваемых, идентичных или однородных товаров в национальной валюте
     * 
     * @param identicalDealNationalPrice
     */
    public void setIdenticalDealNationalPrice(String identicalDealNationalPrice) {
        this.identicalDealNationalPrice = identicalDealNationalPrice;
    }

    /** 
     * Get the 'IdenticalDealCode' element value. Код единицы измерения в соответствии с классификатором единиц измерения
     * 
     * @return value
     */
    public String getIdenticalDealCode() {
        return identicalDealCode;
    }

    /** 
     * Set the 'IdenticalDealCode' element value. Код единицы измерения в соответствии с классификатором единиц измерения
     * 
     * @param identicalDealCode
     */
    public void setIdenticalDealCode(String identicalDealCode) {
        this.identicalDealCode = identicalDealCode;
    }
}
