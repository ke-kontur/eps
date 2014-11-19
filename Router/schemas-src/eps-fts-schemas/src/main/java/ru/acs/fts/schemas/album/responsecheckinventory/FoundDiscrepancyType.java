
package ru.acs.fts.schemas.album.responsecheckinventory;

import org.joda.time.LocalDate;

/** 
 * Выявленные несоответствия состава документов описи и ЭАД
 */
public class FoundDiscrepancyType
{
    private String instanceNumber;
    private LocalDate inventoryInstanceDate;

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
}
