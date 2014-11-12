
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Базовый тип для позиций во всех таблицах отчёта. Содержит обшие для всех товаров поля, включая ИН/РОС. Позиции всех таблиц должны наследоваться от этого типа 
 */
public class GoodsBaseType extends GoodsWithoutStatusBaseType
{
    private String status;

    /** 
     * Get the 'Status' element value. Статус товара: 0 - Российские (РОС), 1 - иностранные (ИН)
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус товара: 0 - Российские (РОС), 1 - иностранные (ИН)
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
