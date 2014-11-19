
package ru.acs.fts.schemas.album.shippingmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� �� ���������� 
 */
public class VehicleType
{
    private String type;
    private String make;
    private String registrationNumber;
    private String trailerRegistrationNumber;
    private String secondTrailerRegistrationNumber;
    private OrganizationBaseType owner;
    private CheckPointType start;
    private CheckPointType finish;

    /** 
     * Get the 'Type' element value. ��� 
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� 
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Make' element value. ����� ���������� 
     * 
     * @return value
     */
    public String getMake() {
        return make;
    }

    /** 
     * Set the 'Make' element value. ����� ���������� 
     * 
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ���������� 
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ���������� 
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'TrailerRegistrationNumber' element value. ��������������� ����� ������� 
     * 
     * @return value
     */
    public String getTrailerRegistrationNumber() {
        return trailerRegistrationNumber;
    }

    /** 
     * Set the 'TrailerRegistrationNumber' element value. ��������������� ����� ������� 
     * 
     * @param trailerRegistrationNumber
     */
    public void setTrailerRegistrationNumber(String trailerRegistrationNumber) {
        this.trailerRegistrationNumber = trailerRegistrationNumber;
    }

    /** 
     * Get the 'SecondTrailerRegistrationNumber' element value. ��������������� ����� ������� ������� 
     * 
     * @return value
     */
    public String getSecondTrailerRegistrationNumber() {
        return secondTrailerRegistrationNumber;
    }

    /** 
     * Set the 'SecondTrailerRegistrationNumber' element value. ��������������� ����� ������� ������� 
     * 
     * @param secondTrailerRegistrationNumber
     */
    public void setSecondTrailerRegistrationNumber(
            String secondTrailerRegistrationNumber) {
        this.secondTrailerRegistrationNumber = secondTrailerRegistrationNumber;
    }

    /** 
     * Get the 'Owner' element value. ��������� ����������� 
     * 
     * @return value
     */
    public OrganizationBaseType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. ��������� ����������� 
     * 
     * @param owner
     */
    public void setOwner(OrganizationBaseType owner) {
        this.owner = owner;
    }

    /** 
     * Get the 'Start' element value. ��������� �������� (������ �� �������) ��� ������ ������������� �������� �� ������ (����)
     * 
     * @return value
     */
    public CheckPointType getStart() {
        return start;
    }

    /** 
     * Set the 'Start' element value. ��������� �������� (������ �� �������) ��� ������ ������������� �������� �� ������ (����)
     * 
     * @param start
     */
    public void setStart(CheckPointType start) {
        this.start = start;
    }

    /** 
     * Get the 'Finish' element value. ��������� �������� (������ �� �������) ��� ������ ������������� �������� � ����� (����)
     * 
     * @return value
     */
    public CheckPointType getFinish() {
        return finish;
    }

    /** 
     * Set the 'Finish' element value. ��������� �������� (������ �� �������) ��� ������ ������������� �������� � ����� (����)
     * 
     * @param finish
     */
    public void setFinish(CheckPointType finish) {
        this.finish = finish;
    }
}
