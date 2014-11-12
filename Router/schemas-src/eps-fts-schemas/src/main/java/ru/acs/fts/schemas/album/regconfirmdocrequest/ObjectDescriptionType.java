
package ru.acs.fts.schemas.album.regconfirmdocrequest;

/** 
 * �������� ������������/������/�������
 */
public class ObjectDescriptionType
{
    private String kindCode;
    private String objectName;
    private String movementType;
    private String objectNumber;
    private String manufacturer;

    /** 
     * Get the 'KindCode' element value. ��� ���� ������������/��� �������������� �������� (1 - ������������� ��������; 2 - ����������)/��� �������
     * 
     * @return value
     */
    public String getKindCode() {
        return kindCode;
    }

    /** 
     * Set the 'KindCode' element value. ��� ���� ������������/��� �������������� �������� (1 - ������������� ��������; 2 - ����������)/��� �������
     * 
     * @param kindCode
     */
    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    /** 
     * Get the 'ObjectName' element value. �������� ���� ������������/�������/������� � �.�.
     * 
     * @return value
     */
    public String getObjectName() {
        return objectName;
    }

    /** 
     * Set the 'ObjectName' element value. �������� ���� ������������/�������/������� � �.�.
     * 
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /** 
     * Get the 'MovementType' element value. ��� ��������� (��/��)
     * 
     * @return value
     */
    public String getMovementType() {
        return movementType;
    }

    /** 
     * Set the 'MovementType' element value. ��� ��������� (��/��)
     * 
     * @param movementType
     */
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    /** 
     * Get the 'ObjectNumber' element value. ����� �������
     * 
     * @return value
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /** 
     * Set the 'ObjectNumber' element value. ����� �������
     * 
     * @param objectNumber
     */
    public void setObjectNumber(String objectNumber) {
        this.objectNumber = objectNumber;
    }

    /** 
     * Get the 'Manufacturer' element value. �������������
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
