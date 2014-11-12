
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ���������������
 */
public class DisqualificationType
{
    private String disqualifTerm;
    private LocalDate disqualifStartDate;
    private LocalDate disqualifEndDate;
    private RecordDataType recordData;

    /** 
     * Get the 'DisqualifTerm' element value. ���� ��������������� (� �������)
     * 
     * @return value
     */
    public String getDisqualifTerm() {
        return disqualifTerm;
    }

    /** 
     * Set the 'DisqualifTerm' element value. ���� ��������������� (� �������)
     * 
     * @param disqualifTerm
     */
    public void setDisqualifTerm(String disqualifTerm) {
        this.disqualifTerm = disqualifTerm;
    }

    /** 
     * Get the 'DisqualifStartDate' element value. ���� ������ ���������������
     * 
     * @return value
     */
    public LocalDate getDisqualifStartDate() {
        return disqualifStartDate;
    }

    /** 
     * Set the 'DisqualifStartDate' element value. ���� ������ ���������������
     * 
     * @param disqualifStartDate
     */
    public void setDisqualifStartDate(LocalDate disqualifStartDate) {
        this.disqualifStartDate = disqualifStartDate;
    }

    /** 
     * Get the 'DisqualifEndDate' element value. ���� ��������� ���������������
     * 
     * @return value
     */
    public LocalDate getDisqualifEndDate() {
        return disqualifEndDate;
    }

    /** 
     * Set the 'DisqualifEndDate' element value. ���� ��������� ���������������
     * 
     * @param disqualifEndDate
     */
    public void setDisqualifEndDate(LocalDate disqualifEndDate) {
        this.disqualifEndDate = disqualifEndDate;
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
