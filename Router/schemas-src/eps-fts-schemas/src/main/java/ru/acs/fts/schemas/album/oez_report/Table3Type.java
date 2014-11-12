
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Таблица 3. Товары, помещенные под таможенные режимы и ввезенные на территорию
 */
public class Table3Type
{
    private Table3Section1Type table3Section1;
    private Table3Section2Type table3Section2;

    /** 
     * Get the 'Table3Section1' element value. Таблица 3. Раздел 1. 
     * 
     * @return value
     */
    public Table3Section1Type getTable3Section1() {
        return table3Section1;
    }

    /** 
     * Set the 'Table3Section1' element value. Таблица 3. Раздел 1. 
     * 
     * @param table3Section1
     */
    public void setTable3Section1(Table3Section1Type table3Section1) {
        this.table3Section1 = table3Section1;
    }

    /** 
     * Get the 'Table3Section2' element value. Таблица 3. Раздел 2. 
     * 
     * @return value
     */
    public Table3Section2Type getTable3Section2() {
        return table3Section2;
    }

    /** 
     * Set the 'Table3Section2' element value. Таблица 3. Раздел 2. 
     * 
     * @param table3Section2
     */
    public void setTable3Section2(Table3Section2Type table3Section2) {
        this.table3Section2 = table3Section2;
    }
}
