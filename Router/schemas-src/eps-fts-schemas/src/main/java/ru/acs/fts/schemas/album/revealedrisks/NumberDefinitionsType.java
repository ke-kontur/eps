
package ru.acs.fts.schemas.album.revealedrisks;

import org.joda.time.LocalDate;

/** 
 * Номер определения о возбуждении дела об АП (УД) по журналу учета в соответствии с приказом ФТС России от 24.04.2007 №524 
 */
public class NumberDefinitionsType
{
    private String customsCode;
    private String number;
    private LocalDate dateYear;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного поста
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного поста
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'Number' element value. Порядковый номер по журналу учета
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Порядковый номер по журналу учета
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'DateYear' element value. Текущий год
     * 
     * @return value
     */
    public LocalDate getDateYear() {
        return dateYear;
    }

    /** 
     * Set the 'DateYear' element value. Текущий год
     * 
     * @param dateYear
     */
    public void setDateYear(LocalDate dateYear) {
        this.dateYear = dateYear;
    }
}
