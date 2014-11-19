
package ru.acs.fts.schemas.album.tpo;

/** 
 * ��� ������
 */
public class TPOTypeCodeType
{
    private String movementPurpose;
    private String movementWay;
    private String transportKindCode;

    /** 
     * Get the 'MovementPurpose' element value. ��� ���� ����������� ������
     * 
     * @return value
     */
    public String getMovementPurpose() {
        return movementPurpose;
    }

    /** 
     * Set the 'MovementPurpose' element value. ��� ���� ����������� ������
     * 
     * @param movementPurpose
     */
    public void setMovementPurpose(String movementPurpose) {
        this.movementPurpose = movementPurpose;
    }

    /** 
     * Get the 'MovementWay' element value. ��� ������� ����������� ������
     * 
     * @return value
     */
    public String getMovementWay() {
        return movementWay;
    }

    /** 
     * Set the 'MovementWay' element value. ��� ������� ����������� ������
     * 
     * @param movementWay
     */
    public void setMovementWay(String movementWay) {
        this.movementWay = movementWay;
    }

    /** 
     * Get the 'TransportKindCode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getTransportKindCode() {
        return transportKindCode;
    }

    /** 
     * Set the 'TransportKindCode' element value. ��� ���� ������������� ��������
     * 
     * @param transportKindCode
     */
    public void setTransportKindCode(String transportKindCode) {
        this.transportKindCode = transportKindCode;
    }
}
