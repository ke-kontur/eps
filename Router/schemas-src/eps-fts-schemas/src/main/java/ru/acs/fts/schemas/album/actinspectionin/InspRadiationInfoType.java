
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * ��������� ������ ������������� ���������
 */
public class InspRadiationInfoType
{
    private String radValue;
    private String radDeviceName;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. ������� ������������� ���� 
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. ������� ������������� ���� 
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'RadDeviceName' element value. ������������ �������, ������� ����������� ���������
     * 
     * @return value
     */
    public String getRadDeviceName() {
        return radDeviceName;
    }

    /** 
     * Set the 'RadDeviceName' element value. ������������ �������, ������� ����������� ���������
     * 
     * @param radDeviceName
     */
    public void setRadDeviceName(String radDeviceName) {
        this.radDeviceName = radDeviceName;
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
