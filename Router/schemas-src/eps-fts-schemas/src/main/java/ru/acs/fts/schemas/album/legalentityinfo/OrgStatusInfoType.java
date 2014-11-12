
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ���������������� (�������) ������������ ����
 */
public class OrgStatusInfoType
{
    private LocalDate startDate;
    private String statusCode;
    private String statusName;
    private RegOrganType regOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'StartDate' element value. ���� ������ �������� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ �������� ��������� ��������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'StatusCode' element value. ��� ������� ������������ ���� �� ����������� �����
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'StatusCode' element value. ��� ������� ������������ ���� �� ����������� �����
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /** 
     * Get the 'StatusName' element value. ������������ ������� ������������ ���� �� ����������� �����
     * 
     * @return value
     */
    public String getStatusName() {
        return statusName;
    }

    /** 
     * Set the 'StatusName' element value. ������������ ������� ������������ ���� �� ����������� �����
     * 
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /** 
     * Get the 'RegOrgan' element value. �������� � �������������� (���������) ������ �� ����� ���������� ��. ����
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. �������� � �������������� (���������) ������ �� ����� ���������� ��. ����
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
