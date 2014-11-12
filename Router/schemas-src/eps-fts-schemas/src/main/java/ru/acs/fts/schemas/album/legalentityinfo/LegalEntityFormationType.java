
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� �� ����������� ������������ ����
 */
public class LegalEntityFormationType extends ReferenceInfoType
{
    private LocalDate regDate;
    private String regNum;
    private RecordDataType recordData;
    private RegOrganType regOrgan;

    /** 
     * Get the 'RegDate' element value. ���� ����������� ������������ ���� ��� �����������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ����������� ������������ ���� ��� �����������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. ��������������� �����, ����������� ������������ ���� ��� �����������
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ��������������� �����, ����������� ������������ ���� ��� �����������
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
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

    /** 
     * Get the 'RegOrgan' element value. �����, ������������������ �������� ��
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. �����, ������������������ �������� ��
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}
