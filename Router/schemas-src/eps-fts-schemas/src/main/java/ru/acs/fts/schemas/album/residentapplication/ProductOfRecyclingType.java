
package ru.acs.fts.schemas.album.residentapplication;

/** 
 * ������� ����������� � ������ 
 */
public class ProductOfRecyclingType
{
    private String number;
    private String name;
    private String TNVEDCode;
    private String status;
    private String customsDutyRateSystem;

    /** 
     * Get the 'Number' element value. ���������� ����� 
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ���������� ����� 
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Name' element value. ������������ �������� ����������� ��� ������ 
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ �������� ����������� ��� ������ 
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'Status' element value. ������: 0 - ��� (����������); 1 - �� (�����������) 
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������: 0 - ��� (����������); 1 - �� (�����������) 
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'CustomsDutyRateSystem' element value. ������� ���������� ������ ���������� ������
     * 
     * @return value
     */
    public String getCustomsDutyRateSystem() {
        return customsDutyRateSystem;
    }

    /** 
     * Set the 'CustomsDutyRateSystem' element value. ������� ���������� ������ ���������� ������
     * 
     * @param customsDutyRateSystem
     */
    public void setCustomsDutyRateSystem(String customsDutyRateSystem) {
        this.customsDutyRateSystem = customsDutyRateSystem;
    }
}
