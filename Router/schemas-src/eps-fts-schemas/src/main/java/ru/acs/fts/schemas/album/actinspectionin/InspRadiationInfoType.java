
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * Измерение уровня радиационного излучения
 */
public class InspRadiationInfoType
{
    private String radValue;
    private String radDeviceName;
    private String deviceCertificate;

    /** 
     * Get the 'RadValue' element value. Уровень радиационного фона 
     * 
     * @return value
     */
    public String getRadValue() {
        return radValue;
    }

    /** 
     * Set the 'RadValue' element value. Уровень радиационного фона 
     * 
     * @param radValue
     */
    public void setRadValue(String radValue) {
        this.radValue = radValue;
    }

    /** 
     * Get the 'RadDeviceName' element value. Наименование прибора, которым проводились измерения
     * 
     * @return value
     */
    public String getRadDeviceName() {
        return radDeviceName;
    }

    /** 
     * Set the 'RadDeviceName' element value. Наименование прибора, которым проводились измерения
     * 
     * @param radDeviceName
     */
    public void setRadDeviceName(String radDeviceName) {
        this.radDeviceName = radDeviceName;
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
