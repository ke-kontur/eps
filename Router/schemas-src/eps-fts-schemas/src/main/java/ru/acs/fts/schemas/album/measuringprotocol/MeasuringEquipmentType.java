
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * �������� � �������� ���������
 */
public class MeasuringEquipmentType
{
    private String equipmentName;
    private String serialNumber;
    private VerificationType verification;

    /** 
     * Get the 'EquipmentName' element value. ������������ � ��� �������� ���������
     * 
     * @return value
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /** 
     * Set the 'EquipmentName' element value. ������������ � ��� �������� ���������
     * 
     * @param equipmentName
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /** 
     * Get the 'SerialNumber' element value. ��������� �����
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ��������� �����
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'Verification' element value. �������� � ������� �������� ���������
     * 
     * @return value
     */
    public VerificationType getVerification() {
        return verification;
    }

    /** 
     * Set the 'Verification' element value. �������� � ������� �������� ���������
     * 
     * @param verification
     */
    public void setVerification(VerificationType verification) {
        this.verification = verification;
    }
}
