
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Измерение уровня радиации
 */
public class RadiationType
{
    private String radValue;
    private String deviceName;
    private String deviceNumber;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. Уровень радиационного фона в микрорентгенах
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. Уровень радиационного фона в микрорентгенах
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'DeviceName' element value. Наименование прибора, которым проводились измерения
     * 
     * @return value
     */
    public String getDeviceName() {
        return deviceName;
    }

    /** 
     * Set the 'DeviceName' element value. Наименование прибора, которым проводились измерения
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /** 
     * Get the 'DeviceNumber' element value. Номер прибора, которым проводились измерения
     * 
     * @return value
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /** 
     * Set the 'DeviceNumber' element value. Номер прибора, которым проводились измерения
     * 
     * @param deviceNumber
     */
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /** 
     * Get the 'DeviceCertificate' element value. Свидетельство о поверке используемого оборудования
     * 
     * @return value
     */
    public String getDeviceCertificate() {
        return deviceCertificate;
    }

    /** 
     * Set the 'DeviceCertificate' element value. Свидетельство о поверке используемого оборудования
     * 
     * @param deviceCertificate
     */
    public void setDeviceCertificate(String deviceCertificate) {
        this.deviceCertificate = deviceCertificate;
    }
}
