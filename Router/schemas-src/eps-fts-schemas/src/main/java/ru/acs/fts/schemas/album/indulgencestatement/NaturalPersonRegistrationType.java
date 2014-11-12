
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������������� ����������� ��������������� ���������������
 */
public class NaturalPersonRegistrationType
{
    private String registrationOrganization;
    private LocalDate dateInf;

    /** 
     * Get the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @return value
     */
    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    /** 
     * Set the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @param registrationOrganization
     */
    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }

    /** 
     * Get the 'DateInf' element value. ���� ��������������� ����������� ����������� ���� � �������� ��������������� ��������������� � ������ ���������
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ��������������� ����������� ����������� ���� � �������� ��������������� ��������������� � ������ ���������
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }
}
