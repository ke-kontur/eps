
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Какой по счету является партия товара,ввозимого по рассматриваемому контракту
 */
public class AccountType
{
    private String type;
    private String other;

    /** 
     * Get the 'Type' element value. Тип партии товаров. "0" - единственная, "1" - первая, "2" - последняя, "3" - иное
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип партии товаров. "0" - единственная, "1" - первая, "2" - последняя, "3" - иное
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Other' element value. Номер партии при выборе значения "Иное"
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Номер партии при выборе значения "Иное"
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }
}
