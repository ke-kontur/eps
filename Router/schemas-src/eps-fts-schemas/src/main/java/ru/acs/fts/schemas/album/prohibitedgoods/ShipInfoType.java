
package ru.acs.fts.schemas.album.prohibitedgoods;

/** 
 * Сведения о морском/воздушном судне
 */
public class ShipInfoType
{
    private String shipName;
    private String shipFlag;
    private String depaturePort;

    /** 
     * Get the 'ShipName' element value. Наименование морского/воздушного судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Наименование морского/воздушного судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'ShipFlag' element value. Код страны принадлежности морского/воздушного судна
     * 
     * @return value
     */
    public String getShipFlag() {
        return shipFlag;
    }

    /** 
     * Set the 'ShipFlag' element value. Код страны принадлежности морского/воздушного судна
     * 
     * @param shipFlag
     */
    public void setShipFlag(String shipFlag) {
        this.shipFlag = shipFlag;
    }

    /** 
     * Get the 'DepaturePort' element value. Порт/аэропорт отправления
     * 
     * @return value
     */
    public String getDepaturePort() {
        return depaturePort;
    }

    /** 
     * Set the 'DepaturePort' element value. Порт/аэропорт отправления
     * 
     * @param depaturePort
     */
    public void setDepaturePort(String depaturePort) {
        this.depaturePort = depaturePort;
    }
}
