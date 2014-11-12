
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * Сведения о прекращении юридического лица
 */
public class LegalEntityTerminationType extends ReferenceInfoType
{
    private LocalDate endDate;
    private RegOrganType regOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'EndDate' element value. Дата прекращения юридического лица
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата прекращения юридического лица
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'RegOrgan' element value. Сведения о регистрирующем (налоговом) органе, зарегистрировавшем прекращение деятельности юридического лица
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. Сведения о регистрирующем (налоговом) органе, зарегистрировавшем прекращение деятельности юридического лица
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
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
