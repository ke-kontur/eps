
package ru.acs.fts.schemas.album.inventory;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ��������� �����.
 */
public class InventoryInstanceType
{
    private String instanceNumber;
    private LocalDate inventoryInstanceDate;
    private InventoryInstancePersonType inventoryInstancePerson;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();

    /** 
     * Get the 'InstanceNumber' element value. ���������� ����� ����� �� ��
     * 
     * @return value
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /** 
     * Set the 'InstanceNumber' element value. ���������� ����� ����� �� ��
     * 
     * @param instanceNumber
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    /** 
     * Get the 'InventoryInstanceDate' element value. ���� �������������� �����.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. ���� �������������� �����.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the 'InventoryInstancePerson' element value. �������� � ����, ����������� �����
     * 
     * @return value
     */
    public InventoryInstancePersonType getInventoryInstancePerson() {
        return inventoryInstancePerson;
    }

    /** 
     * Set the 'InventoryInstancePerson' element value. �������� � ����, ����������� �����
     * 
     * @param inventoryInstancePerson
     */
    public void setInventoryInstancePerson(
            InventoryInstancePersonType inventoryInstancePerson) {
        this.inventoryInstancePerson = inventoryInstancePerson;
    }

    /** 
     * Get the list of 'InventDocument' element items. �������� �� �����
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. �������� �� �����
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }
}
