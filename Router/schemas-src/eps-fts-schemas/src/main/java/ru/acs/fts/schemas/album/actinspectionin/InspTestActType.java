
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��� - ������ ���� � ��������
 */
public class InspTestActType extends DocumentBaseType
{
    private LocalDate seizureDate;
    private String seizureActDesc;
    private String recordNumber;

    /** 
     * Get the 'SeizureDate' element value. ���� ������ ���� � ��������
     * 
     * @return value
     */
    public LocalDate getSeizureDate() {
        return seizureDate;
    }

    /** 
     * Set the 'SeizureDate' element value. ���� ������ ���� � ��������
     * 
     * @param seizureDate
     */
    public void setSeizureDate(LocalDate seizureDate) {
        this.seizureDate = seizureDate;
    }

    /** 
     * Get the 'SeizureActDesc' element value. ���������� � ���� ������ ���� � ��������
     * 
     * @return value
     */
    public String getSeizureActDesc() {
        return seizureActDesc;
    }

    /** 
     * Set the 'SeizureActDesc' element value. ���������� � ���� ������ ���� � ��������
     * 
     * @param seizureActDesc
     */
    public void setSeizureActDesc(String seizureActDesc) {
        this.seizureActDesc = seizureActDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
