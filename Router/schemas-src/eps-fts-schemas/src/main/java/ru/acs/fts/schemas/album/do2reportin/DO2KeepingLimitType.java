
package ru.acs.fts.schemas.album.do2reportin;

import org.joda.time.LocalDate;

/** 
 * Сведения о сроке хранения товаров
 */
public class DO2KeepingLimitType
{
    private LocalDate acceptDate;
    private String acceptTime;
    private String storingDateType;
    private LocalDate deadLineDate;

    /** 
     * Get the 'AcceptDate' element value. Дата приема товара на хранение 
     * 
     * @return value
     */
    public LocalDate getAcceptDate() {
        return acceptDate;
    }

    /** 
     * Set the 'AcceptDate' element value. Дата приема товара на хранение 
     * 
     * @param acceptDate
     */
    public void setAcceptDate(LocalDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    /** 
     * Get the 'AcceptTime' element value. Время приема товара на хранение
     * 
     * @return value
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /** 
     * Set the 'AcceptTime' element value. Время приема товара на хранение
     * 
     * @param acceptTime
     */
    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    /** 
     * Get the 'StoringDateType' element value. Тип срока хранения  по справочнику
     * 
     * @return value
     */
    public String getStoringDateType() {
        return storingDateType;
    }

    /** 
     * Set the 'StoringDateType' element value. Тип срока хранения  по справочнику
     * 
     * @param storingDateType
     */
    public void setStoringDateType(String storingDateType) {
        this.storingDateType = storingDateType;
    }

    /** 
     * Get the 'DeadLineDate' element value. Дата истечения срока хранения
     * 
     * @return value
     */
    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    /** 
     * Set the 'DeadLineDate' element value. Дата истечения срока хранения
     * 
     * @param deadLineDate
     */
    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }
}
