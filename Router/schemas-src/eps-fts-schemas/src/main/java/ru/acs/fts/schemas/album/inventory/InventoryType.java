
package ru.acs.fts.schemas.album.inventory;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� ����������
 */
public class InventoryType extends BaseDocType
{
    private String numberOfInvent;
    private String refPackageDocID;
    private String GTDDocumentID;
    private GtdPersonType GTDPerson;
    private InventoryInstanceType inventoryInstance;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'NumberOfInvent' element value. ���������� ������ � ��
     * 
     * @return value
     */
    public String getNumberOfInvent() {
        return numberOfInvent;
    }

    /** 
     * Set the 'NumberOfInvent' element value. ���������� ������ � ��
     * 
     * @param numberOfInvent
     */
    public void setNumberOfInvent(String numberOfInvent) {
        this.numberOfInvent = numberOfInvent;
    }

    /** 
     * Get the 'RefPackageDocID' element value. ������ �� ������������� ��������� � ������
     * 
     * @return value
     */
    public String getRefPackageDocID() {
        return refPackageDocID;
    }

    /** 
     * Set the 'RefPackageDocID' element value. ������ �� ������������� ��������� � ������
     * 
     * @param refPackageDocID
     */
    public void setRefPackageDocID(String refPackageDocID) {
        this.refPackageDocID = refPackageDocID;
    }

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ����� �������� �� ��.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ����� �������� �� ��.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'GTDPerson' element value. �������� � ����, �������� ��������(�)
     * 
     * @return value
     */
    public GtdPersonType getGTDPerson() {
        return GTDPerson;
    }

    /** 
     * Set the 'GTDPerson' element value. �������� � ����, �������� ��������(�)
     * 
     * @param GTDPerson
     */
    public void setGTDPerson(GtdPersonType GTDPerson) {
        this.GTDPerson = GTDPerson;
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
     * Get the 'GTDNumber' element value. ���������� ����� �� ����������� ���  �������������� ���������� ����� ����������� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� �� ����������� ���  �������������� ���������� ����� ����������� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
