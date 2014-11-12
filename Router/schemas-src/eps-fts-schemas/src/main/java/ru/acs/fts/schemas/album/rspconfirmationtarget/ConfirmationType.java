
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������
 */
public class ConfirmationType extends DocumentBaseType
{
    private String status;
    private String lastChangeDate;

    /** 
     * Get the 'Status' element value. ������� ������ �������������: 1 - �����������, 2 - ����������������, 3 - ��������������, 4 - ��������� �� ����������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������� ������ �������������: 1 - �����������, 2 - ����������������, 3 - ��������������, 4 - ��������� �� ����������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'LastChangeDate' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @return value
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /** 
     * Set the 'LastChangeDate' element value. ���������� � ���� � ������� ���������� ���������
     * 
     * @param lastChangeDate
     */
    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
