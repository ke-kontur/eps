
package ru.acs.fts.schemas.album.residentapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������������� ����� ��������� ���� ��������/������/�������/��
 */
public class RegistryNumberType extends GTDIDType
{
    private String revisionNumber;

    /** 
     * Get the 'RevisionNumber' element value. ����� �������� ��������� : 01 - ��� ��������� ������, ��� ������ �������� ��������� � (���) ���������� ����� ������ ���� �������� �� �������
     * 
     * @return value
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /** 
     * Set the 'RevisionNumber' element value. ����� �������� ��������� : 01 - ��� ��������� ������, ��� ������ �������� ��������� � (���) ���������� ����� ������ ���� �������� �� �������
     * 
     * @param revisionNumber
     */
    public void setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }
}
