
package ru.acs.fts.schemas.album.tdtscustomsmark;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������������� ����� ����
 */
public class TDTSType extends GTDIDType
{
    private String transportModeCode;

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ����������
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ����������
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }
}
