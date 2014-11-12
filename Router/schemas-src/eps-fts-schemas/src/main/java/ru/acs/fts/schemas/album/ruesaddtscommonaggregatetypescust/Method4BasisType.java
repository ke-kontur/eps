
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Основа для расчета таможенной стоимости по методу 4 гр. А (11)
 */
public class Method4BasisType
{
    private String identicalDealRoublePrice;

    /** 
     * Get the 'IdenticalDealRoublePrice' element value. Цена единицы оцениваемых, идентичных или однородных товаров  в рублях. 11.
     * 
     * @return value
     */
    public String getIdenticalDealRoublePrice() {
        return identicalDealRoublePrice;
    }

    /** 
     * Set the 'IdenticalDealRoublePrice' element value. Цена единицы оцениваемых, идентичных или однородных товаров  в рублях. 11.
     * 
     * @param identicalDealRoublePrice
     */
    public void setIdenticalDealRoublePrice(String identicalDealRoublePrice) {
        this.identicalDealRoublePrice = identicalDealRoublePrice;
    }
}
