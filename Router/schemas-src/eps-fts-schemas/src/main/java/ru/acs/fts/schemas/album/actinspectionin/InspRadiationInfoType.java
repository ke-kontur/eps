
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * »змерение уровн€ радиационного излучени€
 */
public class InspRadiationInfoType
{
    private String radValue;
    private String radDeviceName;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. ”ровень радиационного фона 
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. ”ровень радиационного фона 
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'RadDeviceName' element value. Ќаименование прибора, которым проводились измерени€
     * 
     * @return value
     */
    public String getRadDeviceName() {
        return radDeviceName;
    }

    /** 
     * Set the 'RadDeviceName' element value. Ќаименование прибора, которым проводились измерени€
     * 
     * @param radDeviceName
     */
    public void setRadDeviceName(String radDeviceName) {
        this.radDeviceName = radDeviceName;
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
