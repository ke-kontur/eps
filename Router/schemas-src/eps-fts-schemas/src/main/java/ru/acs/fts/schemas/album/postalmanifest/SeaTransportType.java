
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * Почтовое судно
 */
public class SeaTransportType
{
    private String shipName;
    private String unloadingPort;
    private String company;

    /** 
     * Get the 'ShipName' element value. Название судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Название судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'UnloadingPort' element value. Порт выгрузки
     * 
     * @return value
     */
    public String getUnloadingPort() {
        return unloadingPort;
    }

    /** 
     * Set the 'UnloadingPort' element value. Порт выгрузки
     * 
     * @param unloadingPort
     */
    public void setUnloadingPort(String unloadingPort) {
        this.unloadingPort = unloadingPort;
    }

    /** 
     * Get the 'Company' element value. Компания
     * 
     * @return value
     */
    public String getCompany() {
        return company;
    }

    /** 
     * Set the 'Company' element value. Компания
     * 
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }
}
