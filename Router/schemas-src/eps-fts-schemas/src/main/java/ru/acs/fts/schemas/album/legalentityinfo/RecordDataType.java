
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о записи
 */
public class RecordDataType
{
    private LocalDate recordDate;
    private String recordRegNum;

    /** 
     * Get the 'RecordDate' element value. Дата внесения сведений в ЕГРЮЛ
     * 
     * @return value
     */
    public LocalDate getRecordDate() {
        return recordDate;
    }

    /** 
     * Set the 'RecordDate' element value. Дата внесения сведений в ЕГРЮЛ
     * 
     * @param recordDate
     */
    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    /** 
     * Get the 'RecordRegNum' element value. Государственный регистрационный номер записи, на основании которой сведения внесены в ЕГРЮЛ
     * 
     * @return value
     */
    public String getRecordRegNum() {
        return recordRegNum;
    }

    /** 
     * Set the 'RecordRegNum' element value. Государственный регистрационный номер записи, на основании которой сведения внесены в ЕГРЮЛ
     * 
     * @param recordRegNum
     */
    public void setRecordRegNum(String recordRegNum) {
        this.recordRegNum = recordRegNum;
    }
}
