
package ru.acs.fts.schemas.album.ktsin;

import org.joda.time.LocalDate;

/** 
 * ���. ���������� ������. ��������� ������� �����.
 */
public class KTSinCommonOfficialMarkType
{
    private String recordSerialNumber;
    private String columnCode;
    private String officialRecord;
    private String reserveMarkIdentifier;
    private String personName;
    private String LNP;
    private LocalDate dateInf;
    private String timeInf;

    /** 
     * Get the 'RecordSerialNumber' element value. ���������� ����� ������ 
     * 
     * @return value
     */
    public String getRecordSerialNumber() {
        return recordSerialNumber;
    }

    /** 
     * Set the 'RecordSerialNumber' element value. ���������� ����� ������ 
     * 
     * @param recordSerialNumber
     */
    public void setRecordSerialNumber(String recordSerialNumber) {
        this.recordSerialNumber = recordSerialNumber;
    }

    /** 
     * Get the 'ColumnCode' element value. ����� �����
     * 
     * @return value
     */
    public String getColumnCode() {
        return columnCode;
    }

    /** 
     * Set the 'ColumnCode' element value. ����� �����
     * 
     * @param columnCode
     */
    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    /** 
     * Get the 'OfficialRecord' element value. ��������� ������ 
     * 
     * @return value
     */
    public String getOfficialRecord() {
        return officialRecord;
    }

    /** 
     * Set the 'OfficialRecord' element value. ��������� ������ 
     * 
     * @param officialRecord
     */
    public void setOfficialRecord(String officialRecord) {
        this.officialRecord = officialRecord;
    }

    /** 
     * Get the 'ReserveMarkIdentifier' element value. ������ - ������������� ������������� ��������������� �������
     * 
     * @return value
     */
    public String getReserveMarkIdentifier() {
        return reserveMarkIdentifier;
    }

    /** 
     * Set the 'ReserveMarkIdentifier' element value. ������ - ������������� ������������� ��������������� �������
     * 
     * @param reserveMarkIdentifier
     */
    public void setReserveMarkIdentifier(String reserveMarkIdentifier) {
        this.reserveMarkIdentifier = reserveMarkIdentifier;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'DateInf' element value. ���� ������� / �������� ��������� �������.
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ������� / �������� ��������� �������.
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. ����� ������� / �������� ��������� �������.
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. ����� ������� / �������� ��������� �������.
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }
}
