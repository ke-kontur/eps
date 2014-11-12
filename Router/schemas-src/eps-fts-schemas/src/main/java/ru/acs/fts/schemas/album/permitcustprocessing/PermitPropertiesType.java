
package ru.acs.fts.schemas.album.permitcustprocessing;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;

/** 
 * Разрешение таможни на передачу разрешения на переработку иному лицу
 */
public class PermitPropertiesType extends TreatmentOrganizationType
{
    private String permitNumber;
    private LocalDate date;

    /** 
     * Get the 'PermitNumber' element value. Номер разрешения
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. Номер разрешения
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'Date' element value. Дата разрешения
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата разрешения
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
