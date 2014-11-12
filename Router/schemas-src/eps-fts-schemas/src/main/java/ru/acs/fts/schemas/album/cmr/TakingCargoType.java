
package ru.acs.fts.schemas.album.cmr;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ���������� � �������� �����
 */
public class TakingCargoType
{
    private LocalDate takingCargoDate;
    private AddressType takingCargoPlace;

    /** 
     * Get the 'TakingCargoDate' element value. ���� �������� ����� � ��������� (��.4)
     * 
     * @return value
     */
    public LocalDate getTakingCargoDate() {
        return takingCargoDate;
    }

    /** 
     * Set the 'TakingCargoDate' element value. ���� �������� ����� � ��������� (��.4)
     * 
     * @param takingCargoDate
     */
    public void setTakingCargoDate(LocalDate takingCargoDate) {
        this.takingCargoDate = takingCargoDate;
    }

    /** 
     * Get the 'TakingCargoPlace' element value. ����� �������� ����� 
     * 
     * @return value
     */
    public AddressType getTakingCargoPlace() {
        return takingCargoPlace;
    }

    /** 
     * Set the 'TakingCargoPlace' element value. ����� �������� ����� 
     * 
     * @param takingCargoPlace
     */
    public void setTakingCargoPlace(AddressType takingCargoPlace) {
        this.takingCargoPlace = takingCargoPlace;
    }
}
