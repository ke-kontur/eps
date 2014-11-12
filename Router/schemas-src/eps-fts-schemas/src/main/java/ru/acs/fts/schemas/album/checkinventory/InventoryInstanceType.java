
package ru.acs.fts.schemas.album.checkinventory;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Экземпляр описи.
 */
public class InventoryInstanceType
{
    private String instanceNumber;
    private LocalDate inventoryInstanceDate;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();

    /** 
     * Get the 'InstanceNumber' element value. Порядковый номер описи
     * 
     * @return value
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /** 
     * Set the 'InstanceNumber' element value. Порядковый номер описи
     * 
     * @param instanceNumber
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    /** 
     * Get the 'InventoryInstanceDate' element value. Дата предоставления описи
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. Дата предоставления описи
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the list of 'InventDocument' element items. Документ из описи
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. Документ из описи
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }
}
