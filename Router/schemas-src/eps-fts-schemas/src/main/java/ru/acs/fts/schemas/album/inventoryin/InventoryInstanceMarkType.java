
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * ��������� ������� � ���������� �����.
 */
public class InventoryInstanceMarkType
{
    private LocalDate inventoryInstanceDate;
    private String LNP;

    /** 
     * Get the 'InventoryInstanceDate' element value. ���� �������� �����.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. ���� �������� �����.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the 'LNP' element value. ��� ������������ ����, ���������� ���������.
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ��� ������������ ����, ���������� ���������.
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
