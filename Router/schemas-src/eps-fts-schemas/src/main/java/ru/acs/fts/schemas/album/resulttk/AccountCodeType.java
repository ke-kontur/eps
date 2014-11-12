
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������� �����
 */
public class AccountCodeType
{
    private String accountCodeID;
    private String accountCodeNumber;
    private String accountCodeCreateDate;
    private String inspectionID;
    private String information;
    private PersonBaseType driver;
    private PersonBaseType accountCodeEmployee;

    /** 
     * Get the 'AccountCodeID' element value. ������������� �������� ������
     * 
     * @return value
     */
    public String getAccountCodeID() {
        return accountCodeID;
    }

    /** 
     * Set the 'AccountCodeID' element value. ������������� �������� ������
     * 
     * @param accountCodeID
     */
    public void setAccountCodeID(String accountCodeID) {
        this.accountCodeID = accountCodeID;
    }

    /** 
     * Get the 'AccountCodeNumber' element value. ����� �������� ������
     * 
     * @return value
     */
    public String getAccountCodeNumber() {
        return accountCodeNumber;
    }

    /** 
     * Set the 'AccountCodeNumber' element value. ����� �������� ������
     * 
     * @param accountCodeNumber
     */
    public void setAccountCodeNumber(String accountCodeNumber) {
        this.accountCodeNumber = accountCodeNumber;
    }

    /** 
     * Get the 'AccountCodeCreateDate' element value. ����/����� ������ �������� ������
     * 
     * @return value
     */
    public String getAccountCodeCreateDate() {
        return accountCodeCreateDate;
    }

    /** 
     * Set the 'AccountCodeCreateDate' element value. ����/����� ������ �������� ������
     * 
     * @param accountCodeCreateDate
     */
    public void setAccountCodeCreateDate(String accountCodeCreateDate) {
        this.accountCodeCreateDate = accountCodeCreateDate;
    }

    /** 
     * Get the 'InspectionID' element value. ������������� ����� ����� (����� � ���������� "�������� �� ������������� ��������")
     * 
     * @return value
     */
    public String getInspectionID() {
        return inspectionID;
    }

    /** 
     * Set the 'InspectionID' element value. ������������� ����� ����� (����� � ���������� "�������� �� ������������� ��������")
     * 
     * @param inspectionID
     */
    public void setInspectionID(String inspectionID) {
        this.inspectionID = inspectionID;
    }

    /** 
     * Get the 'Information' element value. ����������
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. ����������
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'Driver' element value. ��������
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. ��������
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'AccountCodeEmployee' element value. ���������, �������� ������� �����
     * 
     * @return value
     */
    public PersonBaseType getAccountCodeEmployee() {
        return accountCodeEmployee;
    }

    /** 
     * Set the 'AccountCodeEmployee' element value. ���������, �������� ������� �����
     * 
     * @param accountCodeEmployee
     */
    public void setAccountCodeEmployee(PersonBaseType accountCodeEmployee) {
        this.accountCodeEmployee = accountCodeEmployee;
    }
}
