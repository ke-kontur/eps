
package ru.acs.fts.schemas.album.transitinfo;

import org.joda.time.LocalDate;

/** 
 * Номер книжки МДП.
 */
public class TIRIDType
{
    private String TIRID;
    private String TIRSeries;
    private String TIRPageNumber;
    private LocalDate registrationDate;

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП.
     * 
     * @return value
     */
    public String getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП.
     * 
     * @param TIRID
     */
    public void setTIRID(String TIRID) {
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'TIRSeries' element value. Серия книжки МДП.
     * 
     * @return value
     */
    public String getTIRSeries() {
        return TIRSeries;
    }

    /** 
     * Set the 'TIRSeries' element value. Серия книжки МДП.
     * 
     * @param TIRSeries
     */
    public void setTIRSeries(String TIRSeries) {
        this.TIRSeries = TIRSeries;
    }

    /** 
     * Get the 'TIRPageNumber' element value. Номер листа книжки МДП.
     * 
     * @return value
     */
    public String getTIRPageNumber() {
        return TIRPageNumber;
    }

    /** 
     * Set the 'TIRPageNumber' element value. Номер листа книжки МДП.
     * 
     * @param TIRPageNumber
     */
    public void setTIRPageNumber(String TIRPageNumber) {
        this.TIRPageNumber = TIRPageNumber;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации документа
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации документа
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
