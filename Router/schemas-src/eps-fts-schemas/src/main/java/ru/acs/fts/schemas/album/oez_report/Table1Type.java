
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 1. Отчет о товарах, ввезенных в соответствии с таможенным режимом СТЗ
 */
public class Table1Type
{
    private List<Table1GoodsType> table1GoodList = new ArrayList<Table1GoodsType>();

    /** 
     * Get the list of 'Table1Goods' element items. Таблица 1. Товар, ввезённый в соответствии с таможенным режимом ОЭЗ
     * 
     * @return list
     */
    public List<Table1GoodsType> getTable1GoodList() {
        return table1GoodList;
    }

    /** 
     * Set the list of 'Table1Goods' element items. Таблица 1. Товар, ввезённый в соответствии с таможенным режимом ОЭЗ
     * 
     * @param list
     */
    public void setTable1GoodList(List<Table1GoodsType> list) {
        table1GoodList = list;
    }
}
