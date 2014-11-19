
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ����������� ������������ ����
 */
public class LegalEntityTerminationType extends ReferenceInfoType
{
    private LocalDate endDate;
    private RegOrganType regOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'EndDate' element value. ���� ����������� ������������ ����
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ����������� ������������ ����
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'RegOrgan' element value. �������� � �������������� (���������) ������, ������������������ ����������� ������������ ������������ ����
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. �������� � �������������� (���������) ������, ������������������ ����������� ������������ ������������ ����
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
