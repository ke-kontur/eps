
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� �� � ������� �������� �������� � ��������������  �������
 */
public class InspGTDType extends GTDIDType
{
    private String recordNumber;

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
