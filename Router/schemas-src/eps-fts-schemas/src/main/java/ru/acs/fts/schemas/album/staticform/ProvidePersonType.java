
package ru.acs.fts.schemas.album.staticform;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ����, ������������� �� �������������� �������������� ����� (����, �������������� ������������� �������������� ����� �� ����� ������������ ����)
 */
public class ProvidePersonType extends PersonBaseType
{
    private LocalDate executionDate;
    private String contactPhone;
    private String email;
    private String organizationName;
    private AddressType address;

    /** 
     * Get the 'ExecutionDate' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getExecutionDate() {
        return executionDate;
    }

    /** 
     * Set the 'ExecutionDate' element value. ���� ���������� ���������
     * 
     * @param executionDate
     */
    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    /** 
     * Get the 'ContactPhone' element value. ����� �������� (���, ����� ��������).
     * 
     * @return value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** 
     * Set the 'ContactPhone' element value. ����� �������� (���, ����� ��������).
     * 
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /** 
     * Get the 'Email' element value. ����� ����������� �����
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value. ����� ����������� �����
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ ����������� ���������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ����������� ���������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Address' element value. �������� �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �������� �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
