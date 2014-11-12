
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ��������� ������ ��������
 */
public class RadiationType
{
    private String radValue;
    private String deviceName;
    private String deviceNumber;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. ������� ������������� ���� � ��������������
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. ������� ������������� ���� � ��������������
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'DeviceName' element value. ������������ �������, ������� ����������� ���������
     * 
     * @return value
     */
    public String getDeviceName() {
        return deviceName;
    }

    /** 
     * Set the 'DeviceName' element value. ������������ �������, ������� ����������� ���������
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /** 
     * Get the 'DeviceNumber' element value. ����� �������, ������� ����������� ���������
     * 
     * @return value
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /** 
     * Set the 'DeviceNumber' element value. ����� �������, ������� ����������� ���������
     * 
     * @param deviceNumber
     */
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /** 
     * Get the 'DeviceCertificate' element value. ������������� � ������� ������������� ������������
     * 
     * @return value
     */
    public String getDeviceCertificate() {
        return deviceCertificate;
    }

    /** 
     * Set the 'DeviceCertificate' element value. ������������� � ������� ������������� ������������
     * 
     * @param deviceCertificate
     */
    public void setDeviceCertificate(String deviceCertificate) {
        this.deviceCertificate = deviceCertificate;
    }
}
