
package ru.acs.fts.schemas.album.esadoutp;

/** 
 * �������� � ��������� �������
 */
public class ESADoutConsigmenPType
{
    private String dispatchCountryCode;
    private String dispatchCountryName;
    private String destinationCountryCode;
    private String destinationCountryName;
    private ESADoutTransportPType ESADoutTransportP;

    /** 
     * Get the 'DispatchCountryCode' element value. ������ �����������. ��������� ��� �� ��������������� �������������� ����� ���� ���� �� �������������� ������������� ������ � ���������.
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. ������ �����������. ��������� ��� �� ��������������� �������������� ����� ���� ���� �� �������������� ������������� ������ � ���������.
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DispatchCountryName' element value. ������ �����������. ������������.
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. ������ �����������. ������������.
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ������ ����������. ��������� ��� �� ��������������� �������������� ����� ���� ���� �� �������������� ������������� ������ � ���������.
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ������ ����������. ��������� ��� �� ��������������� �������������� ����� ���� ���� �� �������������� ������������� ������ � ���������.
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationCountryName' element value. ������ ����������. ������������.
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. ������ ����������. ������������.
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'ESADoutTransportP' element value. �������� � ������������ ���������
     * 
     * @return value
     */
    public ESADoutTransportPType getESADoutTransportP() {
        return ESADoutTransportP;
    }

    /** 
     * Set the 'ESADoutTransportP' element value. �������� � ������������ ���������
     * 
     * @param ESADoutTransportP
     */
    public void setESADoutTransportP(ESADoutTransportPType ESADoutTransportP) {
        this.ESADoutTransportP = ESADoutTransportP;
    }
}
