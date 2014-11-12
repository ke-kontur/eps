
package ru.acs.fts.schemas.album.certificatetitlevessel;

import org.joda.time.LocalDate;

/** 
 * ��������������� ������� ������ ���������� ���������
 */
public class RegisterType
{
    private String numberRegister;
    private LocalDate dateRegister;

    /** 
     * Get the 'NumberRegister' element value. ����� �������
     * 
     * @return value
     */
    public String getNumberRegister() {
        return numberRegister;
    }

    /** 
     * Set the 'NumberRegister' element value. ����� �������
     * 
     * @param numberRegister
     */
    public void setNumberRegister(String numberRegister) {
        this.numberRegister = numberRegister;
    }

    /** 
     * Get the 'DateRegister' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getDateRegister() {
        return dateRegister;
    }

    /** 
     * Set the 'DateRegister' element value. ���� �������
     * 
     * @param dateRegister
     */
    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }
}
