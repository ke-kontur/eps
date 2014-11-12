
package ru.acs.fts.schemas.album.mistakeletter;

import org.joda.time.LocalDate;

/** 
 * Ошибка в дате документа
 */
public class DocDateMistakeType
{
    private LocalDate dateMistakeValue;
    private LocalDate dateValidValue;

    /** 
     * Get the 'DateMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @return value
     */
    public LocalDate getDateMistakeValue() {
        return dateMistakeValue;
    }

    /** 
     * Set the 'DateMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @param dateMistakeValue
     */
    public void setDateMistakeValue(LocalDate dateMistakeValue) {
        this.dateMistakeValue = dateMistakeValue;
    }

    /** 
     * Get the 'DateValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @return value
     */
    public LocalDate getDateValidValue() {
        return dateValidValue;
    }

    /** 
     * Set the 'DateValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @param dateValidValue
     */
    public void setDateValidValue(LocalDate dateValidValue) {
        this.dateValidValue = dateValidValue;
    }
}
