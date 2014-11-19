
package ru.acs.fts.schemas.album.gtdobligation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ������������ ��������
 */
public class TransportType extends TransportMeansBaseType
{
    private String transportModeCode;
    private String containerSign;
    private String traditionalName;

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� ��������
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'ContainerSign' element value. ������� ������������ ���������: 1 - ���� ��������� ������� (���� �� ������ �� ���) ����� ���. ������� ������������ (�������������) � ����������; 0 - � ���� ������� (� ��� �����, ���� �������� � ��������� ����������)
     * 
     * @return value
     */
    public String getContainerSign() {
        return containerSign;
    }

    /** 
     * Set the 'ContainerSign' element value. ������� ������������ ���������: 1 - ���� ��������� ������� (���� �� ������ �� ���) ����� ���. ������� ������������ (�������������) � ����������; 0 - � ���� ������� (� ��� �����, ���� �������� � ��������� ����������)
     * 
     * @param containerSign
     */
    public void setContainerSign(String containerSign) {
        this.containerSign = containerSign;
    }

    /** 
     * Get the 'TraditionalName' element value. ������������ ������������ ������������� ��������
     * 
     * @return value
     */
    public String getTraditionalName() {
        return traditionalName;
    }

    /** 
     * Set the 'TraditionalName' element value. ������������ ������������ ������������� ��������
     * 
     * @param traditionalName
     */
    public void setTraditionalName(String traditionalName) {
        this.traditionalName = traditionalName;
    }
}
