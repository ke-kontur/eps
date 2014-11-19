
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Базовый тип для позиций во всех таблицах отчёта. Содержит обшие для всех товаров поля, кроме ИН/РОС. Позиции всех таблиц должны наследоваться от этого типа 
 */
public class GoodsWithoutStatusBaseType
{
    private List<String> nameList = new ArrayList<String>();
    private String TNVED;
    private String measureUnitQualifier;

    /** 
     * Get the list of 'Name' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование товара
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'MeasureUnitQualifier' element value. Единица измерения количества товара
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'MeasureUnitQualifier' element value. Единица измерения количества товара
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }
}
