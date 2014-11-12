
package ru.acs.fts.schemas.album.checkinventory;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ �� ������ ����� � ���
 */
public class CheckInventoryType extends BaseDocType
{
    private String inventoryID;
    private InventoryInstanceType inventoryInstance;
    private String documentModeID;

    /** 
     * Get the 'InventoryID' element value. ������������� ����� ����������
     * 
     * @return value
     */
    public String getInventoryID() {
        return inventoryID;
    }

    /** 
     * Set the 'InventoryID' element value. ������������� ����� ����������
     * 
     * @param inventoryID
     */
    public void setInventoryID(String inventoryID) {
        this.inventoryID = inventoryID;
    }

    /** 
     * Get the 'InventoryInstance' element value. ��������� �����
     * 
     * @return value
     */
    public InventoryInstanceType getInventoryInstance() {
        return inventoryInstance;
    }

    /** 
     * Set the 'InventoryInstance' element value. ��������� �����
     * 
     * @param inventoryInstance
     */
    public void setInventoryInstance(InventoryInstanceType inventoryInstance) {
        this.inventoryInstance = inventoryInstance;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
