
package ru.acs.fts.schemas.album.cwstoragequitance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.AISTSDocumentIDType;

/** 
 * ���������� � ���������� ���������
 */
public class StorageQuitanceHeadType
{
    private String customsModeCode;
    private String orderNumberOfEdition;
    private AISTSDocumentIDType storageQuitanceNumber;
    private AISTSDocumentIDType priorStorageQuitanceNumber;
    private AISTSDocumentIDType nextStorageQuitanceNumber;
    private GTDIDType GTDNumber;

    /** 
     * Get the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'OrderNumberOfEdition' element value. ���������� ����� �������� ������������ ���������
     * 
     * @return value
     */
    public String getOrderNumberOfEdition() {
        return orderNumberOfEdition;
    }

    /** 
     * Set the 'OrderNumberOfEdition' element value. ���������� ����� �������� ������������ ���������
     * 
     * @param orderNumberOfEdition
     */
    public void setOrderNumberOfEdition(String orderNumberOfEdition) {
        this.orderNumberOfEdition = orderNumberOfEdition;
    }

    /** 
     * Get the 'StorageQuitanceNumber' element value. ����� ��������� ���������
     * 
     * @return value
     */
    public AISTSDocumentIDType getStorageQuitanceNumber() {
        return storageQuitanceNumber;
    }

    /** 
     * Set the 'StorageQuitanceNumber' element value. ����� ��������� ���������
     * 
     * @param storageQuitanceNumber
     */
    public void setStorageQuitanceNumber(
            AISTSDocumentIDType storageQuitanceNumber) {
        this.storageQuitanceNumber = storageQuitanceNumber;
    }

    /** 
     * Get the 'PriorStorageQuitanceNumber' element value. ����� ���������� ��������� ���������
     * 
     * @return value
     */
    public AISTSDocumentIDType getPriorStorageQuitanceNumber() {
        return priorStorageQuitanceNumber;
    }

    /** 
     * Set the 'PriorStorageQuitanceNumber' element value. ����� ���������� ��������� ���������
     * 
     * @param priorStorageQuitanceNumber
     */
    public void setPriorStorageQuitanceNumber(
            AISTSDocumentIDType priorStorageQuitanceNumber) {
        this.priorStorageQuitanceNumber = priorStorageQuitanceNumber;
    }

    /** 
     * Get the 'NextStorageQuitanceNumber' element value. ����� ��������� ��������� ���������
     * 
     * @return value
     */
    public AISTSDocumentIDType getNextStorageQuitanceNumber() {
        return nextStorageQuitanceNumber;
    }

    /** 
     * Set the 'NextStorageQuitanceNumber' element value. ����� ��������� ��������� ���������
     * 
     * @param nextStorageQuitanceNumber
     */
    public void setNextStorageQuitanceNumber(
            AISTSDocumentIDType nextStorageQuitanceNumber) {
        this.nextStorageQuitanceNumber = nextStorageQuitanceNumber;
    }

    /** 
     * Get the 'GTDNumber' element value. ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
