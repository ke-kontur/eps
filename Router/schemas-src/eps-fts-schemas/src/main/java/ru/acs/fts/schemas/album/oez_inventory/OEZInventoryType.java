
package ru.acs.fts.schemas.album.oez_inventory;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Опись документов ОЭЗ
 */
public class OEZInventoryType extends BaseDocType
{
    private LocalDate inventoryInstanceDate;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private InventoryInstancePersonType inventoryInstancePerson;
    private String documentModeID;

    /** 
     * Get the 'InventoryInstanceDate' element value. Дата предоставления описи.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. Дата предоставления описи.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
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
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
