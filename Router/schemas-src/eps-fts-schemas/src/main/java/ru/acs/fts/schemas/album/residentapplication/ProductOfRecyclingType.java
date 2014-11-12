
package ru.acs.fts.schemas.album.residentapplication;

/** 
 * Продукт переработки и отходы 
 */
public class ProductOfRecyclingType
{
    private String number;
    private String name;
    private String TNVEDCode;
    private String status;
    private String customsDutyRateSystem;

    /** 
     * Get the 'Number' element value. Порядковый номер 
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Порядковый номер 
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Name' element value. Наименование продукта переработки или отхода 
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование продукта переработки или отхода 
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'Status' element value. Статус: 0 - РОС (Российский); 1 - ИН (иностранный) 
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус: 0 - РОС (Российский); 1 - ИН (иностранный) 
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'CustomsDutyRateSystem' element value. Система исчисления ставок таможенных пошлин
     * 
     * @return value
     */
    public String getCustomsDutyRateSystem() {
        return customsDutyRateSystem;
    }

    /** 
     * Set the 'CustomsDutyRateSystem' element value. Система исчисления ставок таможенных пошлин
     * 
     * @param customsDutyRateSystem
     */
    public void setCustomsDutyRateSystem(String customsDutyRateSystem) {
        this.customsDutyRateSystem = customsDutyRateSystem;
    }
}
