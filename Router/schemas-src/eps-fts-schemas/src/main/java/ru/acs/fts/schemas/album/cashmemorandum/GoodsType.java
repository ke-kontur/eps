
package ru.acs.fts.schemas.album.cashmemorandum;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.SpecificationGoodsType;

/** 
 * Линия товарного чека
 */
public class GoodsType extends SpecificationGoodsType
{
    private String number;
    private String discount;
    private String taxPercent;
    private String notes;

    /** 
     * Get the 'Number' element value. Номер товара в списке
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер товара в списке
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Discount' element value. Скидка, в процентах
     * 
     * @return value
     */
    public String getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. Скидка, в процентах
     * 
     * @param discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'TaxPercent' element value. Налог, в процентах от стоимости товара
     * 
     * @return value
     */
    public String getTaxPercent() {
        return taxPercent;
    }

    /** 
     * Set the 'TaxPercent' element value. Налог, в процентах от стоимости товара
     * 
     * @param taxPercent
     */
    public void setTaxPercent(String taxPercent) {
        this.taxPercent = taxPercent;
    }

    /** 
     * Get the 'Notes' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Дополнительная информация
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
