
package ru.acs.fts.schemas.album.declarationconformity;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ������, ������������������ ���������� � ������������
 */
public class RegisterType extends OrganizationType
{
    private String registrationAuthority;
    private LocalDate registrationDate;
    private String registrationNumber;

    /** 
     * Get the 'RegistrationAuthority' element value. ������������ ������ �� ������������, ��������� �������� ������������.
     * 
     * @return value
     */
    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    /** 
     * Set the 'RegistrationAuthority' element value. ������������ ������ �� ������������, ��������� �������� ������������.
     * 
     * @param registrationAuthority
     */
    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    /** 
     * Get the 'RegistrationDate' element value. ���� ��������� ������������ �����������
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ��������� ������������ �����������
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ��������� ������������ ������ �� ������������
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ��������� ������������ ������ �� ������������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
