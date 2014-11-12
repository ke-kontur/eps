
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� �������
 */
public class GoodsUsageType
{
    private String quantity;
    private DocumentBaseType confirmUsageDoc;

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'ConfirmUsageDoc' element value. ��������, �������������� ���� �������������
     * 
     * @return value
     */
    public DocumentBaseType getConfirmUsageDoc() {
        return confirmUsageDoc;
    }

    /** 
     * Set the 'ConfirmUsageDoc' element value. ��������, �������������� ���� �������������
     * 
     * @param confirmUsageDoc
     */
    public void setConfirmUsageDoc(DocumentBaseType confirmUsageDoc) {
        this.confirmUsageDoc = confirmUsageDoc;
    }
}
