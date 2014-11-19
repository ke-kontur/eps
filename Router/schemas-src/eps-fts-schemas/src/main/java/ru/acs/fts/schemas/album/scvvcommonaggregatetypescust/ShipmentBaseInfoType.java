
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� � �������� ������
 */
public class ShipmentBaseInfoType
{
    private String customsNumber;
    private GTDIDType DTID;

    /** 
     * Get the 'CustomsNumber' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /** 
     * Set the 'CustomsNumber' element value. ���������� ����� ���������
     * 
     * @param customsNumber
     */
    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    /** 
     * Get the 'DTID' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public GTDIDType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ��������������� ����� ����������
     * 
     * @param DTID
     */
    public void setDTID(GTDIDType DTID) {
        this.DTID = DTID;
    }
}
