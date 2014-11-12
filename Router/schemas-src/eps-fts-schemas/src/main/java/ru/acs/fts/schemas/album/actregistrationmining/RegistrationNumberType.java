
package ru.acs.fts.schemas.album.actregistrationmining;

/** 
 * Регистрационный номер акта
 */
public class RegistrationNumberType
{
    private String numberInspectors;
    private String serialNumber;

    /** 
     * Get the 'NumberInspectors' element value. Персональный номер государственного инспектора
     * 
     * @return value
     */
    public String getNumberInspectors() {
        return numberInspectors;
    }

    /** 
     * Set the 'NumberInspectors' element value. Персональный номер государственного инспектора
     * 
     * @param numberInspectors
     */
    public void setNumberInspectors(String numberInspectors) {
        this.numberInspectors = numberInspectors;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер акта
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер акта
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
