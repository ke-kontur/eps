
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Товар, изготовленный (полученный) из товаров, помещенных под таможенную процедуру свободной таможенной зоны
 */
public class Table4GoodsType extends GoodsWithoutStatusBaseType
{
    private String quantity;

    /** 
     * Get the 'Quantity' element value. Количество товара, находящееся на территории ОЭЗ на дату отчёта
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара, находящееся на территории ОЭЗ на дату отчёта
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
