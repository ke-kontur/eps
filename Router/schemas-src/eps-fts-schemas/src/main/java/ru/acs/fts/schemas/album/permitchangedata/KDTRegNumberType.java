
package ru.acs.fts.schemas.album.permitchangedata;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������������� ����� ���
 */
public class KDTRegNumberType extends GTDIDType
{
    private String serialNumber;

    /** 
     * Get the 'SerialNumber' element value. ���������� ����� ��� � ��, �������� � ������� ���������� � (���) �����������
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ����� ��� � ��, �������� � ������� ���������� � (���) �����������
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
