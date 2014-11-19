
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� �����.
 */
public class InventoryInstanceType
{
    private String instanceNumber;
    private InventoryInstancePersonType inventoryInstancePerson;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private InventoryInstanceMarkType inventoryInstanceMark;
    private List<PriorInformationType> priorInformationList = new ArrayList<PriorInformationType>();

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
     * Get the 'InventoryInstancePerson' element value. �������� � ����, �������� �����.
     * 
     * @return value
     */
    public InventoryInstancePersonType getInventoryInstancePerson() {
        return inventoryInstancePerson;
    }

    /** 
     * Set the 'InventoryInstancePerson' element value. �������� � ����, �������� �����.
     * 
     * @param inventoryInstancePerson
     */
    public void setInventoryInstancePerson(
            InventoryInstancePersonType inventoryInstancePerson) {
        this.inventoryInstancePerson = inventoryInstancePerson;
    }

    /** 
     * Get the list of 'InventDocument' element items. �������� �� �����.
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. �������� �� �����.
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }

    /** 
     * Get the 'InventoryInstanceMark' element value. ��������� ������� � ���������� �����.
     * 
     * @return value
     */
    public InventoryInstanceMarkType getInventoryInstanceMark() {
        return inventoryInstanceMark;
    }

    /** 
     * Set the 'InventoryInstanceMark' element value. ��������� ������� � ���������� �����.
     * 
     * @param inventoryInstanceMark
     */
    public void setInventoryInstanceMark(
            InventoryInstanceMarkType inventoryInstanceMark) {
        this.inventoryInstanceMark = inventoryInstanceMark;
    }

    /** 
     * Get the list of 'PriorInformation' element items. �������� � ��������������� ��������������� ����������
     * 
     * @return list
     */
    public List<PriorInformationType> getPriorInformationList() {
        return priorInformationList;
    }

    /** 
     * Set the list of 'PriorInformation' element items. �������� � ��������������� ��������������� ����������
     * 
     * @param list
     */
    public void setPriorInformationList(List<PriorInformationType> list) {
        priorInformationList = list;
    }
}
