
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������������ �������� �� ������� / ������ ������
 */
public class CUTransportMeansType
{
    private String transportModeCode;
    private String transportNationalityCode;

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportNationalityCode' element value. ��������� ��� ������ �������������� (�����������) ������������ ������� �� �������������� ����� ����. 99-������, 00-����������
     * 
     * @return value
     */
    public String getTransportNationalityCode() {
        return transportNationalityCode;
    }

    /** 
     * Set the 'TransportNationalityCode' element value. ��������� ��� ������ �������������� (�����������) ������������ ������� �� �������������� ����� ����. 99-������, 00-����������
     * 
     * @param transportNationalityCode
     */
    public void setTransportNationalityCode(String transportNationalityCode) {
        this.transportNationalityCode = transportNationalityCode;
    }
}
