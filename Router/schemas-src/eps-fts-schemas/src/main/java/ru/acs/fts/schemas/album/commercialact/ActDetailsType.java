
package ru.acs.fts.schemas.album.commercialact;

import org.joda.time.LocalDate;

/** 
 * Сведения об акте
 */
public class ActDetailsType
{
    private String actName;
    private String actNumber;
    private LocalDate actDate;
    private String actOrderNumber;

    /** 
     * Get the 'ActName' element value. Наименование акта (Акт, Коммерческий акт, Акт общей формы и т.д.)
     * 
     * @return value
     */
    public String getActName() {
        return actName;
    }

    /** 
     * Set the 'ActName' element value. Наименование акта (Акт, Коммерческий акт, Акт общей формы и т.д.)
     * 
     * @param actName
     */
    public void setActName(String actName) {
        this.actName = actName;
    }

    /** 
     * Get the 'ActNumber' element value. Номер акта
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Номер акта
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActDate' element value. Дата акта
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. Дата акта
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'ActOrderNumber' element value. Порядковый номер Акта (для первого начиная с единицы), составленного в отношении товаров указанного отчета о принятии, начиная с момента подачи отчета
     * 
     * @return value
     */
    public String getActOrderNumber() {
        return actOrderNumber;
    }

    /** 
     * Set the 'ActOrderNumber' element value. Порядковый номер Акта (для первого начиная с единицы), составленного в отношении товаров указанного отчета о принятии, начиная с момента подачи отчета
     * 
     * @param actOrderNumber
     */
    public void setActOrderNumber(String actOrderNumber) {
        this.actOrderNumber = actOrderNumber;
    }
}
