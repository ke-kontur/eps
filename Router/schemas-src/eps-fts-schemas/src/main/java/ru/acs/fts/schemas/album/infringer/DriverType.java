
package ru.acs.fts.schemas.album.infringer;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������
 */
public class DriverType extends PersonBaseType
{
    private LocalDate driverBirthDate;
    private String driverBirthPlace;

    /** 
     * Get the 'DriverBirthDate' element value. ���� �������� ��������
     * 
     * @return value
     */
    public LocalDate getDriverBirthDate() {
        return driverBirthDate;
    }

    /** 
     * Set the 'DriverBirthDate' element value. ���� �������� ��������
     * 
     * @param driverBirthDate
     */
    public void setDriverBirthDate(LocalDate driverBirthDate) {
        this.driverBirthDate = driverBirthDate;
    }

    /** 
     * Get the 'DriverBirthPlace' element value. ����� �������� ��������
     * 
     * @return value
     */
    public String getDriverBirthPlace() {
        return driverBirthPlace;
    }

    /** 
     * Set the 'DriverBirthPlace' element value. ����� �������� ��������
     * 
     * @param driverBirthPlace
     */
    public void setDriverBirthPlace(String driverBirthPlace) {
        this.driverBirthPlace = driverBirthPlace;
    }
}
