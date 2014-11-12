
package ru.acs.fts.schemas.album.actregistrationmining;

import org.joda.time.LocalDate;

/** 
 * Разрешение
 */
public class ResolutionType
{
    private String resolutionNumber;
    private LocalDate resolutionDate;
    private String issued;

    /** 
     * Get the 'ResolutionNumber' element value. Номер разрешения
     * 
     * @return value
     */
    public String getResolutionNumber() {
        return resolutionNumber;
    }

    /** 
     * Set the 'ResolutionNumber' element value. Номер разрешения
     * 
     * @param resolutionNumber
     */
    public void setResolutionNumber(String resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
    }

    /** 
     * Get the 'ResolutionDate' element value. Дата разрешения
     * 
     * @return value
     */
    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    /** 
     * Set the 'ResolutionDate' element value. Дата разрешения
     * 
     * @param resolutionDate
     */
    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    /** 
     * Get the 'Issued' element value. Кем выдано
     * 
     * @return value
     */
    public String getIssued() {
        return issued;
    }

    /** 
     * Set the 'Issued' element value. Кем выдано
     * 
     * @param issued
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }
}
