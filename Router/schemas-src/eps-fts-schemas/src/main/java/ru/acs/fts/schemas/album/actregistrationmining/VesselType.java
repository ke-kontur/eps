
package ru.acs.fts.schemas.album.actregistrationmining;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �����
 */
public class VesselType
{
    private String name;
    private String type;
    private String numberBoard;
    private OrganizationBaseType shipowner;

    /** 
     * Get the 'Name' element value. ������������ �����
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ �����
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Type' element value. ��� �����
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� �����
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'NumberBoard' element value. �������� ����� �����
     * 
     * @return value
     */
    public String getNumberBoard() {
        return numberBoard;
    }

    /** 
     * Set the 'NumberBoard' element value. �������� ����� �����
     * 
     * @param numberBoard
     */
    public void setNumberBoard(String numberBoard) {
        this.numberBoard = numberBoard;
    }

    /** 
     * Get the 'Shipowner' element value. �������� � �������������
     * 
     * @return value
     */
    public OrganizationBaseType getShipowner() {
        return shipowner;
    }

    /** 
     * Set the 'Shipowner' element value. �������� � �������������
     * 
     * @param shipowner
     */
    public void setShipowner(OrganizationBaseType shipowner) {
        this.shipowner = shipowner;
    }
}
