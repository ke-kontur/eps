
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Корректировка стоимости  сделки. Гр. Б (13-15)
 */
public class DTS4Method2DealCorrectType
{
    private String quantityCorrect;
    private String commerceCorrect;
    private String totalSum;
    private String totalDealCorrect;

    /** 
     * Get the 'QuantityCorrect' element value. Корректировка на количество. 13а
     * 
     * @return value
     */
    public String getQuantityCorrect() {
        return quantityCorrect;
    }

    /** 
     * Set the 'QuantityCorrect' element value. Корректировка на количество. 13а
     * 
     * @param quantityCorrect
     */
    public void setQuantityCorrect(String quantityCorrect) {
        this.quantityCorrect = quantityCorrect;
    }

    /** 
     * Get the 'CommerceCorrect' element value. Корректировка на коммерческий уровень. 13б
     * 
     * @return value
     */
    public String getCommerceCorrect() {
        return commerceCorrect;
    }

    /** 
     * Set the 'CommerceCorrect' element value. Корректировка на коммерческий уровень. 13б
     * 
     * @param commerceCorrect
     */
    public void setCommerceCorrect(String commerceCorrect) {
        this.commerceCorrect = commerceCorrect;
    }

    /** 
     * Get the 'TotalSum' element value. Итого графа 13  в национальной валюте. 14
     * 
     * @return value
     */
    public String getTotalSum() {
        return totalSum;
    }

    /** 
     * Set the 'TotalSum' element value. Итого графа 13  в национальной валюте. 14
     * 
     * @param totalSum
     */
    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    /** 
     * Get the 'TotalDealCorrect' element value. 15. Стоимость сделки с учетом корректировок в национальной валюте 11+-14  
     * 
     * @return value
     */
    public String getTotalDealCorrect() {
        return totalDealCorrect;
    }

    /** 
     * Set the 'TotalDealCorrect' element value. 15. Стоимость сделки с учетом корректировок в национальной валюте 11+-14  
     * 
     * @param totalDealCorrect
     */
    public void setTotalDealCorrect(String totalDealCorrect) {
        this.totalDealCorrect = totalDealCorrect;
    }
}
