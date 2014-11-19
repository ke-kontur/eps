
package ru.acs.fts.schemas.album.conformancesertif;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ��������� �����������
 */
public class ProlongCertificateType
{
    private LocalDate endDate;
    private PersonBaseType prolongSign;

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� �����������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� �����������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'ProlongSign' element value. �������� � ������� ��� ��������� ����� �������� �����������
     * 
     * @return value
     */
    public PersonBaseType getProlongSign() {
        return prolongSign;
    }

    /** 
     * Set the 'ProlongSign' element value. �������� � ������� ��� ��������� ����� �������� �����������
     * 
     * @param prolongSign
     */
    public void setProlongSign(PersonBaseType prolongSign) {
        this.prolongSign = prolongSign;
    }
}
