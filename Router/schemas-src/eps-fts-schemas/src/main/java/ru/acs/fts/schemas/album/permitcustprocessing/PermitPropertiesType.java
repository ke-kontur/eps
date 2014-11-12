
package ru.acs.fts.schemas.album.permitcustprocessing;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;

/** 
 * ���������� ������� �� �������� ���������� �� ����������� ����� ����
 */
public class PermitPropertiesType extends TreatmentOrganizationType
{
    private String permitNumber;
    private LocalDate date;

    /** 
     * Get the 'PermitNumber' element value. ����� ����������
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. ����� ����������
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'Date' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
