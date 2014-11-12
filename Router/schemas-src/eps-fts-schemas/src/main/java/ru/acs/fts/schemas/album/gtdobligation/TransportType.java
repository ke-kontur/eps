
package ru.acs.fts.schemas.album.gtdobligation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Транспортное средство
 */
public class TransportType extends TransportMeansBaseType
{
    private String transportModeCode;
    private String containerSign;
    private String traditionalName;

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'ContainerSign' element value. Признак контейнерных перевозок: 1 - если перевозка товаров (хотя бы одного из них) через там. границу производится (производилась) в контейнере; 0 - в иных случаях (в том числе, если сведения о перевозке неизвестны)
     * 
     * @return value
     */
    public String getContainerSign() {
        return containerSign;
    }

    /** 
     * Set the 'ContainerSign' element value. Признак контейнерных перевозок: 1 - если перевозка товаров (хотя бы одного из них) через там. границу производится (производилась) в контейнере; 0 - в иных случаях (в том числе, если сведения о перевозке неизвестны)
     * 
     * @param containerSign
     */
    public void setContainerSign(String containerSign) {
        this.containerSign = containerSign;
    }

    /** 
     * Get the 'TraditionalName' element value. Традиционное наименование транспортного средства
     * 
     * @return value
     */
    public String getTraditionalName() {
        return traditionalName;
    }

    /** 
     * Set the 'TraditionalName' element value. Традиционное наименование транспортного средства
     * 
     * @param traditionalName
     */
    public void setTraditionalName(String traditionalName) {
        this.traditionalName = traditionalName;
    }
}
