
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * Сведения о средстве измерений
 */
public class MeasuringEquipmentType
{
    private String equipmentName;
    private String serialNumber;
    private VerificationType verification;

    /** 
     * Get the 'EquipmentName' element value. Наименование и тип средства измерений
     * 
     * @return value
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /** 
     * Set the 'EquipmentName' element value. Наименование и тип средства измерений
     * 
     * @param equipmentName
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /** 
     * Get the 'SerialNumber' element value. Заводской номер
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Заводской номер
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'Verification' element value. Сведения о поверке средства измерений
     * 
     * @return value
     */
    public VerificationType getVerification() {
        return verification;
    }

    /** 
     * Set the 'Verification' element value. Сведения о поверке средства измерений
     * 
     * @param verification
     */
    public void setVerification(VerificationType verification) {
        this.verification = verification;
    }
}
