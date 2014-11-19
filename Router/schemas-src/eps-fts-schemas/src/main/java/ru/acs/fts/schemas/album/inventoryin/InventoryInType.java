
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� ����������  ���������� ������.
 */
public class InventoryInType extends BaseDocType
{
    private String numberOfInvent;
    private String refPackageDocID;
    private GTDPersonType GTDPerson;
    private List<InventoryInstanceType> inventoryInstanceList = new ArrayList<InventoryInstanceType>();
    private InventOfficialMarkType inventOfficialMark;
    private List<RequestType> requestList = new ArrayList<RequestType>();
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
     * Get the 'GTDPerson' element value. �������� � ����, �������� ��
     * 
     * @return value
     */
    public GTDPersonType getGTDPerson() {
        return GTDPerson;
    }

    /** 
     * Set the 'GTDPerson' element value. �������� � ����, �������� ��
     * 
     * @param GTDPerson
     */
    public void setGTDPerson(GTDPersonType GTDPerson) {
        this.GTDPerson = GTDPerson;
    }

    /** 
     * Get the list of 'InventoryInstance' element items. ��������� �����.
     * 
     * @return list
     */
    public List<InventoryInstanceType> getInventoryInstanceList() {
        return inventoryInstanceList;
    }

    /** 
     * Set the list of 'InventoryInstance' element items. ��������� �����.
     * 
     * @param list
     */
    public void setInventoryInstanceList(List<InventoryInstanceType> list) {
        inventoryInstanceList = list;
    }

    /** 
     * Get the 'InventOfficialMark' element value. ������� ����������� ������.
     * 
     * @return value
     */
    public InventOfficialMarkType getInventOfficialMark() {
        return inventOfficialMark;
    }

    /** 
     * Set the 'InventOfficialMark' element value. ������� ����������� ������.
     * 
     * @param inventOfficialMark
     */
    public void setInventOfficialMark(InventOfficialMarkType inventOfficialMark) {
        this.inventOfficialMark = inventOfficialMark;
    }

    /** 
     * Get the list of 'Request' element items. ������ � ������������� �������������� ���������� 
     * 
     * @return list
     */
    public List<RequestType> getRequestList() {
        return requestList;
    }

    /** 
     * Set the list of 'Request' element items. ������ � ������������� �������������� ���������� 
     * 
     * @param list
     */
    public void setRequestList(List<RequestType> list) {
        requestList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
