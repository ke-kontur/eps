
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import org.joda.time.LocalDate;

/** 
 * ������ ������������� ��
 */
public class UseTransportTermType
{
    private LocalDate beginUseTransportDate;
    private LocalDate endUseTransportDate;

    /** 
     * Get the 'BeginUseTransportDate' element value. ������ ������� ������������� ������������� �������� ��� �� ������������� ���. ����)
     * 
     * @return value
     */
    public LocalDate getBeginUseTransportDate() {
        return beginUseTransportDate;
    }

    /** 
     * Set the 'BeginUseTransportDate' element value. ������ ������� ������������� ������������� �������� ��� �� ������������� ���. ����)
     * 
     * @param beginUseTransportDate
     */
    public void setBeginUseTransportDate(LocalDate beginUseTransportDate) {
        this.beginUseTransportDate = beginUseTransportDate;
    }

    /** 
     * Get the 'EndUseTransportDate' element value. ����� ������� ������������� ������������� �������� ��� �� ������������� ���. ����)
     * 
     * @return value
     */
    public LocalDate getEndUseTransportDate() {
        return endUseTransportDate;
    }

    /** 
     * Set the 'EndUseTransportDate' element value. ����� ������� ������������� ������������� �������� ��� �� ������������� ���. ����)
     * 
     * @param endUseTransportDate
     */
    public void setEndUseTransportDate(LocalDate endUseTransportDate) {
        this.endUseTransportDate = endUseTransportDate;
    }
}
