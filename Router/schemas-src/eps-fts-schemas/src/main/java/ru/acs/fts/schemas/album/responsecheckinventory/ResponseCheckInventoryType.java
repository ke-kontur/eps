
package ru.acs.fts.schemas.album.responsecheckinventory;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� �� ������ �� ������ ����� � ���
 */
public class ResponseCheckInventoryType extends BaseDocType
{
    private String inventoryID;
    private List<InvCheckResultType> checkResultList = new ArrayList<InvCheckResultType>();
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
     * Get the list of 'CheckResult' element items. ��������� �������� ����������
     * 
     * @return list
     */
    public List<InvCheckResultType> getCheckResultList() {
        return checkResultList;
    }

    /** 
     * Set the list of 'CheckResult' element items. ��������� �������� ����������
     * 
     * @param list
     */
    public void setCheckResultList(List<InvCheckResultType> list) {
        checkResultList = list;
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
