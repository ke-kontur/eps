
package ru.acs.fts.schemas.album.actregistrationmining;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о судне
 */
public class VesselType
{
    private String name;
    private String type;
    private String numberBoard;
    private OrganizationBaseType shipowner;

    /** 
     * Get the 'Name' element value. Наименование судна
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование судна
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Type' element value. Тип судна
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип судна
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'NumberBoard' element value. Бортовой номер судна
     * 
     * @return value
     */
    public String getNumberBoard() {
        return numberBoard;
    }

    /** 
     * Set the 'NumberBoard' element value. Бортовой номер судна
     * 
     * @param numberBoard
     */
    public void setNumberBoard(String numberBoard) {
        this.numberBoard = numberBoard;
    }

    /** 
     * Get the 'Shipowner' element value. Сведения о судовладельце
     * 
     * @return value
     */
    public OrganizationBaseType getShipowner() {
        return shipowner;
    }

    /** 
     * Set the 'Shipowner' element value. Сведения о судовладельце
     * 
     * @param shipowner
     */
    public void setShipowner(OrganizationBaseType shipowner) {
        this.shipowner = shipowner;
    }
}
