
package ru.acs.fts.schemas.album.fstekconclpermit;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������/����������
 */
public class AuthorizationType extends DocumentBaseType
{
    private String status;

    /** 
     * Get the 'Status' element value. ��������� ����������: 1 - ���������, 2 - ��������������, 3 - ������������ ��������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ��������� ����������: 1 - ���������, 2 - ��������������, 3 - ������������ ��������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
