
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о дисквалификации
 */
public class DisqualificationType
{
    private String disqualifTerm;
    private LocalDate disqualifStartDate;
    private LocalDate disqualifEndDate;
    private RecordDataType recordData;

    /** 
     * Get the 'DisqualifTerm' element value. Срок дисквалификации (в месяцах)
     * 
     * @return value
     */
    public String getDisqualifTerm() {
        return disqualifTerm;
    }

    /** 
     * Set the 'DisqualifTerm' element value. Срок дисквалификации (в месяцах)
     * 
     * @param disqualifTerm
     */
    public void setDisqualifTerm(String disqualifTerm) {
        this.disqualifTerm = disqualifTerm;
    }

    /** 
     * Get the 'DisqualifStartDate' element value. Дата начала дисквалификации
     * 
     * @return value
     */
    public LocalDate getDisqualifStartDate() {
        return disqualifStartDate;
    }

    /** 
     * Set the 'DisqualifStartDate' element value. Дата начала дисквалификации
     * 
     * @param disqualifStartDate
     */
    public void setDisqualifStartDate(LocalDate disqualifStartDate) {
        this.disqualifStartDate = disqualifStartDate;
    }

    /** 
     * Get the 'DisqualifEndDate' element value. Дата окончания дисквалификации
     * 
     * @return value
     */
    public LocalDate getDisqualifEndDate() {
        return disqualifEndDate;
    }

    /** 
     * Set the 'DisqualifEndDate' element value. Дата окончания дисквалификации
     * 
     * @param disqualifEndDate
     */
    public void setDisqualifEndDate(LocalDate disqualifEndDate) {
        this.disqualifEndDate = disqualifEndDate;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
