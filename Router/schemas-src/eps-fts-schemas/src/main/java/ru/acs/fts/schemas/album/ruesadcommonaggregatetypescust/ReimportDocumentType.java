
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения указываемые при помещении товаров под таможенный режим реимпорта. Гр. 44 п.9.6.
 */
public class ReimportDocumentType extends PresentedDocumentType
{
    private String symbolSubLineNumber;
    private String goodsStatus;
    private String repairStatus;
    private LocalDate exportDate;

    /** 
     * Get the 'SymbolSubLineNumber' element value. Код информации  A-разрешение продления сроков по реимпорту . B - ДТ при вывозе. С- Статус товаров при вывозе с территории РФ, D - Операции с товарами за пределами РФ
     * 
     * @return value
     */
    public String getSymbolSubLineNumber() {
        return symbolSubLineNumber;
    }

    /** 
     * Set the 'SymbolSubLineNumber' element value. Код информации  A-разрешение продления сроков по реимпорту . B - ДТ при вывозе. С- Статус товаров при вывозе с территории РФ, D - Операции с товарами за пределами РФ
     * 
     * @param symbolSubLineNumber
     */
    public void setSymbolSubLineNumber(String symbolSubLineNumber) {
        this.symbolSubLineNumber = symbolSubLineNumber;
    }

    /** 
     * Get the 'GoodsStatus' element value. Статус товаров при вывозе 21- РОССИЙСКИЕ, 22 - ПРОДУКТЫ ПЕРЕРАБОТКИ
     * 
     * @return value
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /** 
     * Set the 'GoodsStatus' element value. Статус товаров при вывозе 21- РОССИЙСКИЕ, 22 - ПРОДУКТЫ ПЕРЕРАБОТКИ
     * 
     * @param goodsStatus
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /** 
     * Get the 'RepairStatus' element value. Признак ремонта за пределами таможенной территории РФ. 30 - ОПЕРАЦИИ ПО РЕМОНТУ НЕ ПРОИЗВОДИЛИСЬ, 31 - ОПЕРАЦИИ ПО РЕМОНТУ ПРОИЗВОДИЛИСЬ.
     * 
     * @return value
     */
    public String getRepairStatus() {
        return repairStatus;
    }

    /** 
     * Set the 'RepairStatus' element value. Признак ремонта за пределами таможенной территории РФ. 30 - ОПЕРАЦИИ ПО РЕМОНТУ НЕ ПРОИЗВОДИЛИСЬ, 31 - ОПЕРАЦИИ ПО РЕМОНТУ ПРОИЗВОДИЛИСЬ.
     * 
     * @param repairStatus
     */
    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    /** 
     * Get the 'ExportDate' element value. Дата фактического вывоза.
     * 
     * @return value
     */
    public LocalDate getExportDate() {
        return exportDate;
    }

    /** 
     * Set the 'ExportDate' element value. Дата фактического вывоза.
     * 
     * @param exportDate
     */
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }
}
