
package ru.acs.fts.schemas.album.responsecheckinventory;

import org.joda.time.LocalDate;

/** 
 * ���������� �������������� ������� ���������� ����� � ���
 */
public class FoundDiscrepancyType
{
    private String instanceNumber;
    private LocalDate inventoryInstanceDate;

    /** 
     * Get the 'InstanceNumber' element value. ���������� ����� �����
     * 
     * @return value
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }

    /** 
     * Set the 'InstanceNumber' element value. ���������� ����� �����
     * 
     * @param instanceNumber
     */
    public void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    /** 
     * Get the 'InventoryInstanceDate' element value. ���� �������������� �����
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. ���� �������������� �����
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }
}
