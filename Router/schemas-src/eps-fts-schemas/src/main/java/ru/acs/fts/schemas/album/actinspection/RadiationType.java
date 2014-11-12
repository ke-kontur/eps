
package ru.acs.fts.schemas.album.actinspection;

/** 
 * »змерение уровн€ радиации
 */
public class RadiationType
{
    private String radValue;
    private String deviceName;
    private String deviceNumber;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. ”ровень радиационного фона в микрорентгенах
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. ”ровень радиационного фона в микрорентгенах
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'DeviceName' element value. Ќаименование прибора, которым проводились измерени€
     * 
     * @return value
     */
    public String getDeviceName() {
        return deviceName;
    }

    /** 
     * Set the 'DeviceName' element value. Ќаименование прибора, которым проводились измерени€
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /** 
     * Get the 'DeviceNumber' element value. Ќомер прибора, которым проводились измерени€
     * 
     * @return value
     */
    public String getDeviceNumber() {
        return deviceNumber;
    }

    /** 
     * Set the 'DeviceNumber' element value. Ќомер прибора, которым проводились измерени€
     * 
     * @param deviceNumber
     */
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /** 
     * Get the 'DeviceCertificate' element value. —видетельство о поверке используемого оборудовани€
     * 
     * @return value
     */
    public String getDeviceCertificate() {
        return deviceCertificate;
    }

    /** 
     * Set the 'DeviceCertificate' element value. —видетельство о поверке используемого оборудовани€
     * 
     * @param deviceCertificate
     */
    public void setDeviceCertificate(String deviceCertificate) {
        this.deviceCertificate = deviceCertificate;
    }
}
