
package ru.acs.fts.schemas.album.goodsdecision;

/** 
 * �������� � �����
 */
public class ShipInfoType
{
    private String shipIMO;
    private String shipName;

    /** 
     * Get the 'ShipIMO' element value. ��� ����� �����
     * 
     * @return value
     */
    public String getShipIMO() {
        return shipIMO;
    }

    /** 
     * Set the 'ShipIMO' element value. ��� ����� �����
     * 
     * @param shipIMO
     */
    public void setShipIMO(String shipIMO) {
        this.shipIMO = shipIMO;
    }

    /** 
     * Get the 'ShipName' element value. ������������ �����
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. ������������ �����
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
