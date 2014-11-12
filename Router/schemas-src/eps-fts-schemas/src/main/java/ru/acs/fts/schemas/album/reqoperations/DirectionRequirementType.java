
package ru.acs.fts.schemas.album.reqoperations;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��� ����������� ���������� �� ����� ��� ���� ��������
 */
public class DirectionRequirementType
{
    private String methodDirection;
    private LocalDate dateDirection;
    private CustomsPersonType customsPerson;
    private PersonBaseType person;
    private AddressType address;

    /** 
     * Get the 'MethodDirection' element value. ������ ����������� ����������
     * 
     * @return value
     */
    public String getMethodDirection() {
        return methodDirection;
    }

    /** 
     * Set the 'MethodDirection' element value. ������ ����������� ����������
     * 
     * @param methodDirection
     */
    public void setMethodDirection(String methodDirection) {
        this.methodDirection = methodDirection;
    }

    /** 
     * Get the 'DateDirection' element value. ���� ����������� ����������
     * 
     * @return value
     */
    public LocalDate getDateDirection() {
        return dateDirection;
    }

    /** 
     * Set the 'DateDirection' element value. ���� ����������� ����������
     * 
     * @param dateDirection
     */
    public void setDateDirection(LocalDate dateDirection) {
        this.dateDirection = dateDirection;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ����, ����������� ����������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Person' element value. ����, ��������� ����������
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ����, ��������� ����������
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Address' element value. ����� 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
