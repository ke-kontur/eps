
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Экземпляр описи.
 */
public class InventoryInstanceType
{
    private String instanceNumber;
    private InventoryInstancePersonType inventoryInstancePerson;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private InventoryInstanceMarkType inventoryInstanceMark;
    private List<PriorInformationType> priorInformationList = new ArrayList<PriorInformationType>();

    /** 
     * Get the 'InstanceNumber' element value. Порядковый номер описи по ДТ
     * 
     * @return value
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /** 
     * Set the 'InstanceNumber' element value. Порядковый номер описи по ДТ
     * 
     * @param instanceNumber
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    /** 
     * Get the 'InventoryInstancePerson' element value. Сведения о лице, подающем опись.
     * 
     * @return value
     */
    public InventoryInstancePersonType getInventoryInstancePerson() {
        return inventoryInstancePerson;
    }

    /** 
     * Set the 'InventoryInstancePerson' element value. Сведения о лице, подающем опись.
     * 
     * @param inventoryInstancePerson
     */
    public void setInventoryInstancePerson(
            InventoryInstancePersonType inventoryInstancePerson) {
        this.inventoryInstancePerson = inventoryInstancePerson;
    }

    /** 
     * Get the list of 'InventDocument' element items. Документ из описи.
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. Документ из описи.
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }

    /** 
     * Get the 'InventoryInstanceMark' element value. Служебные отметки в экземпляре описи.
     * 
     * @return value
     */
    public InventoryInstanceMarkType getInventoryInstanceMark() {
        return inventoryInstanceMark;
    }

    /** 
     * Set the 'InventoryInstanceMark' element value. Служебные отметки в экземпляре описи.
     * 
     * @param inventoryInstanceMark
     */
    public void setInventoryInstanceMark(
            InventoryInstanceMarkType inventoryInstanceMark) {
        this.inventoryInstanceMark = inventoryInstanceMark;
    }

    /** 
     * Get the list of 'PriorInformation' element items. Сведения о предоставленной предварительной информации
     * 
     * @return list
     */
    public List<PriorInformationType> getPriorInformationList() {
        return priorInformationList;
    }

    /** 
     * Set the list of 'PriorInformation' element items. Сведения о предоставленной предварительной информации
     * 
     * @param list
     */
    public void setPriorInformationList(List<PriorInformationType> list) {
        priorInformationList = list;
    }
}
