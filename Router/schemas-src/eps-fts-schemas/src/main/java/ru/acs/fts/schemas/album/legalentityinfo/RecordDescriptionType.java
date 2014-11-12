
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � �������, ��������� � �����
 */
public class RecordDescriptionType extends ReferenceInfoType
{
    private String recordSign;
    private LocalDate inputDate;
    private String recordRegNum;
    private String blankSeries;
    private String blankNum;
    private RegOrganType regOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'RecordSign' element value. ������� ����, ��� ������ �����������
     * 
     * @return value
     */
    public String getRecordSign() {
        return recordSign;
    }

    /** 
     * Set the 'RecordSign' element value. ������� ����, ��� ������ �����������
     * 
     * @param recordSign
     */
    public void setRecordSign(String recordSign) {
        this.recordSign = recordSign;
    }

    /** 
     * Get the 'InputDate' element value. ���� �������� �������� � �������� ������������� � ����� / ���� �������� �������� � ����� � ��������� ������ ����������������
     * 
     * @return value
     */
    public LocalDate getInputDate() {
        return inputDate;
    }

    /** 
     * Set the 'InputDate' element value. ���� �������� �������� � �������� ������������� � ����� / ���� �������� �������� � ����� � ��������� ������ ����������������
     * 
     * @param inputDate
     */
    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    /** 
     * Get the 'RecordRegNum' element value. ��������������� ��������������� ����� ������, �� ��������� ������� ������� �������� � �������� ������������� / ��������������� ��������������� ����� ������, �� ��������� ������� ������� �������� � ��������� ������ ������ ����������������
     * 
     * @return value
     */
    public String getRecordRegNum() {
        return recordRegNum;
    }

    /** 
     * Set the 'RecordRegNum' element value. ��������������� ��������������� ����� ������, �� ��������� ������� ������� �������� � �������� ������������� / ��������������� ��������������� ����� ������, �� ��������� ������� ������� �������� � ��������� ������ ������ ����������������
     * 
     * @param recordRegNum
     */
    public void setRecordRegNum(String recordRegNum) {
        this.recordRegNum = recordRegNum;
    }

    /** 
     * Get the 'BlankSeries' element value. ����� ������ �������������
     * 
     * @return value
     */
    public String getBlankSeries() {
        return blankSeries;
    }

    /** 
     * Set the 'BlankSeries' element value. ����� ������ �������������
     * 
     * @param blankSeries
     */
    public void setBlankSeries(String blankSeries) {
        this.blankSeries = blankSeries;
    }

    /** 
     * Get the 'BlankNum' element value. ����� ������ �������������
     * 
     * @return value
     */
    public String getBlankNum() {
        return blankNum;
    }

    /** 
     * Set the 'BlankNum' element value. ����� ������ �������������
     * 
     * @param blankNum
     */
    public void setBlankNum(String blankNum) {
        this.blankNum = blankNum;
    }

    /** 
     * Get the 'RegOrgan' element value. �������� � �������������� ������
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. �������� � �������������� ������
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
