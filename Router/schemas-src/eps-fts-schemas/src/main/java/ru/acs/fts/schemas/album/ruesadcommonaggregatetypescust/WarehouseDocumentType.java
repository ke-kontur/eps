
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения о лицензии таможенного склада, свободного склада, разрешении на открытие магазина беспошлинной торговли, сроках помещения товаров под режим таможенного склада. Гр. 44 п 9.2, п. 9.5.
 */
public class WarehouseDocumentType extends PresentedDocumentType
{
    private String subLineNumber;
    private String documentModeCode;
    private LocalDate periodDate;
    private LocalDate conditionDate;
    private LocalDate saleDate;

    /** 
     * Get the 'SubLineNumber' element value. Номер подстроки
     * 
     * @return value
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /** 
     * Set the 'SubLineNumber' element value. Номер подстроки
     * 
     * @param subLineNumber
     */
    public void setSubLineNumber(String subLineNumber) {
        this.subLineNumber = subLineNumber;
    }

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа:1-Лицензия на учреждение свободного склада. 2-Свидетельство о включении в Реестр владельцев таможенных складов. 3- Письмо таможни.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа:1-Лицензия на учреждение свободного склада. 2-Свидетельство о включении в Реестр владельцев таможенных складов. 3- Письмо таможни.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'PeriodDate' element value. Срок действия разрешения / срок помещения под режим ТС 
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. Срок действия разрешения / срок помещения под режим ТС 
     * 
     * @param periodDate
     */
    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    /** 
     * Get the 'ConditionDate' element value. Срок годности.
     * 
     * @return value
     */
    public LocalDate getConditionDate() {
        return conditionDate;
    }

    /** 
     * Set the 'ConditionDate' element value. Срок годности.
     * 
     * @param conditionDate
     */
    public void setConditionDate(LocalDate conditionDate) {
        this.conditionDate = conditionDate;
    }

    /** 
     * Get the 'SaleDate' element value. Срок реализации.
     * 
     * @return value
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }

    /** 
     * Set the 'SaleDate' element value. Срок реализации.
     * 
     * @param saleDate
     */
    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }
}
