
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� � ������������ ��������
 */
public class TransportType extends TransportMeansBaseType
{
    private String transportModeCode;

    /** 
     * Get the 'TransportModeCode' element value. ��� ������������� ��������
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ������������� ��������
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }
}
