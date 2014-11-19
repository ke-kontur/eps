
package ru.acs.fts.schemas.album.transportdeclaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������, ��������� �� ����������� ��������
 */
public class DateStampType
{
    private LocalDate date;
    private RWStationType RWStation;
    private CustomsType customs;
    private PersonSignatureType officer;

    /** 
     * Get the 'Date' element value. ���� ������������ ��������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ������������ ��������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'RWStation' element value. �� ������� ������������ ��������
     * 
     * @return value
     */
    public RWStationType getRWStation() {
        return RWStation;
    }

    /** 
     * Set the 'RWStation' element value. �� ������� ������������ ��������
     * 
     * @param RWStation
     */
    public void setRWStation(RWStationType RWStation) {
        this.RWStation = RWStation;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Officer' element value. ������������� �������� �������
     * 
     * @return value
     */
    public PersonSignatureType getOfficer() {
        return officer;
    }

    /** 
     * Set the 'Officer' element value. ������������� �������� �������
     * 
     * @param officer
     */
    public void setOfficer(PersonSignatureType officer) {
        this.officer = officer;
    }
}
