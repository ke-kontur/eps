
package ru.acs.fts.schemas.album.dtsin;

import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTSOfficialMarkType;

/** 
 * ���������� ������  ���. ��������� �������.
 */
public class DTSinOfficialMarksType extends DTSOfficialMarkType
{
    private String recordSerialNumber;

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
}
