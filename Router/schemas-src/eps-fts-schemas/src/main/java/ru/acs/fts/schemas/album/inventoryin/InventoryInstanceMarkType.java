
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * Служебные отметки в экземпляре описи.
 */
public class InventoryInstanceMarkType
{
    private LocalDate inventoryInstanceDate;
    private String LNP;

    /** 
     * Get the 'InventoryInstanceDate' element value. Дата принятия описи.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. Дата принятия описи.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица, принявшего документы.
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица, принявшего документы.
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
