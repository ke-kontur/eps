
package ru.acs.fts.schemas.album.tpo;

/** 
 * Тип ордера
 */
public class TPOTypeCodeType
{
    private String movementPurpose;
    private String movementWay;
    private String transportKindCode;

    /** 
     * Get the 'MovementPurpose' element value. Код цели перемещения товара
     * 
     * @return value
     */
    public String getMovementPurpose() {
        return movementPurpose;
    }

    /** 
     * Set the 'MovementPurpose' element value. Код цели перемещения товара
     * 
     * @param movementPurpose
     */
    public void setMovementPurpose(String movementPurpose) {
        this.movementPurpose = movementPurpose;
    }

    /** 
     * Get the 'MovementWay' element value. Код способа перемещения товара
     * 
     * @return value
     */
    public String getMovementWay() {
        return movementWay;
    }

    /** 
     * Set the 'MovementWay' element value. Код способа перемещения товара
     * 
     * @param movementWay
     */
    public void setMovementWay(String movementWay) {
        this.movementWay = movementWay;
    }

    /** 
     * Get the 'TransportKindCode' element value. Код вида транспортного средства
     * 
     * @return value
     */
    public String getTransportKindCode() {
        return transportKindCode;
    }

    /** 
     * Set the 'TransportKindCode' element value. Код вида транспортного средства
     * 
     * @param transportKindCode
     */
    public void setTransportKindCode(String transportKindCode) {
        this.transportKindCode = transportKindCode;
    }
}
