
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ������
 */
public class RecordDataType
{
    private LocalDate recordDate;
    private String recordRegNum;

    /** 
     * Get the 'RecordDate' element value. ���� �������� �������� � �����
     * 
     * @return value
     */
    public LocalDate getRecordDate() {
        return recordDate;
    }

    /** 
     * Set the 'RecordDate' element value. ���� �������� �������� � �����
     * 
     * @param recordDate
     */
    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    /** 
     * Get the 'RecordRegNum' element value. ��������������� ��������������� ����� ������, �� ��������� ������� �������� ������� � �����
     * 
     * @return value
     */
    public String getRecordRegNum() {
        return recordRegNum;
    }

    /** 
     * Set the 'RecordRegNum' element value. ��������������� ��������������� ����� ������, �� ��������� ������� �������� ������� � �����
     * 
     * @param recordRegNum
     */
    public void setRecordRegNum(String recordRegNum) {
        this.recordRegNum = recordRegNum;
    }
}
