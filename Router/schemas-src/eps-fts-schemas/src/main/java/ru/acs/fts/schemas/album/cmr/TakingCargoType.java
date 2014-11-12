
package ru.acs.fts.schemas.album.cmr;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Информация о принятии груза
 */
public class TakingCargoType
{
    private LocalDate takingCargoDate;
    private AddressType takingCargoPlace;

    /** 
     * Get the 'TakingCargoDate' element value. Дата принятия груза к перевозке (гр.4)
     * 
     * @return value
     */
    public LocalDate getTakingCargoDate() {
        return takingCargoDate;
    }

    /** 
     * Set the 'TakingCargoDate' element value. Дата принятия груза к перевозке (гр.4)
     * 
     * @param takingCargoDate
     */
    public void setTakingCargoDate(LocalDate takingCargoDate) {
        this.takingCargoDate = takingCargoDate;
    }

    /** 
     * Get the 'TakingCargoPlace' element value. Место принятия груза 
     * 
     * @return value
     */
    public AddressType getTakingCargoPlace() {
        return takingCargoPlace;
    }

    /** 
     * Set the 'TakingCargoPlace' element value. Место принятия груза 
     * 
     * @param takingCargoPlace
     */
    public void setTakingCargoPlace(AddressType takingCargoPlace) {
        this.takingCargoPlace = takingCargoPlace;
    }
}
