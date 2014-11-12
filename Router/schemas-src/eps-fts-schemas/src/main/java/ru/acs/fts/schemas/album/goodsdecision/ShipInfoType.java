
package ru.acs.fts.schemas.album.goodsdecision;

/** 
 * Сведения о судне
 */
public class ShipInfoType
{
    private String shipIMO;
    private String shipName;

    /** 
     * Get the 'ShipIMO' element value. ИМО номер судна
     * 
     * @return value
     */
    public String getShipIMO() {
        return shipIMO;
    }

    /** 
     * Set the 'ShipIMO' element value. ИМО номер судна
     * 
     * @param shipIMO
     */
    public void setShipIMO(String shipIMO) {
        this.shipIMO = shipIMO;
    }

    /** 
     * Get the 'ShipName' element value. Наименование судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Наименование судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}
