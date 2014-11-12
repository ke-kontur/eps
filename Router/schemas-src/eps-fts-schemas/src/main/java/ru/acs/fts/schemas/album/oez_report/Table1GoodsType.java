
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Таблица 1. Товар, ввезённый в соответствии с таможенным режимом ОЭЗ
 */
public class Table1GoodsType extends GoodsBaseType
{
    private QuantityPutType put;
    private Table1QuantityUsedType used;

    /** 
     * Get the 'Put' element value. Количество товара, помещённое под таможенный режим свободной таможенной зоны
     * 
     * @return value
     */
    public QuantityPutType getPut() {
        return put;
    }

    /** 
     * Set the 'Put' element value. Количество товара, помещённое под таможенный режим свободной таможенной зоны
     * 
     * @param put
     */
    public void setPut(QuantityPutType put) {
        this.put = put;
    }

    /** 
     * Get the 'Used' element value. Использование товаров, помещенных под таможенный режим свободной таможенной зоны
     * 
     * @return value
     */
    public Table1QuantityUsedType getUsed() {
        return used;
    }

    /** 
     * Set the 'Used' element value. Использование товаров, помещенных под таможенный режим свободной таможенной зоны
     * 
     * @param used
     */
    public void setUsed(Table1QuantityUsedType used) {
        this.used = used;
    }
}
