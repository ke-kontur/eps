
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Опись документов  Внутренний формат.
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
     * Get the 'NumberOfInvent' element value. Количество описей к ДТ
     * 
     * @return value
     */
    public String getNumberOfInvent() {
        return numberOfInvent;
    }

    /** 
     * Set the 'NumberOfInvent' element value. Количество описей к ДТ
     * 
     * @param numberOfInvent
     */
    public void setNumberOfInvent(String numberOfInvent) {
        this.numberOfInvent = numberOfInvent;
    }

    /** 
     * Get the 'RefPackageDocID' element value. Ссылка на идентификатор документа в пакете
     * 
     * @return value
     */
    public String getRefPackageDocID() {
        return refPackageDocID;
    }

    /** 
     * Set the 'RefPackageDocID' element value. Ссылка на идентификатор документа в пакете
     * 
     * @param refPackageDocID
     */
    public void setRefPackageDocID(String refPackageDocID) {
        this.refPackageDocID = refPackageDocID;
    }

    /** 
     * Get the 'GTDPerson' element value. Сведения о лице, подающем ДТ
     * 
     * @return value
     */
    public GTDPersonType getGTDPerson() {
        return GTDPerson;
    }

    /** 
     * Set the 'GTDPerson' element value. Сведения о лице, подающем ДТ
     * 
     * @param GTDPerson
     */
    public void setGTDPerson(GTDPersonType GTDPerson) {
        this.GTDPerson = GTDPerson;
    }

    /** 
     * Get the list of 'InventoryInstance' element items. Экземпляр описи.
     * 
     * @return list
     */
    public List<InventoryInstanceType> getInventoryInstanceList() {
        return inventoryInstanceList;
    }

    /** 
     * Set the list of 'InventoryInstance' element items. Экземпляр описи.
     * 
     * @param list
     */
    public void setInventoryInstanceList(List<InventoryInstanceType> list) {
        inventoryInstanceList = list;
    }

    /** 
     * Get the 'InventOfficialMark' element value. Отметки таможенного органа.
     * 
     * @return value
     */
    public InventOfficialMarkType getInventOfficialMark() {
        return inventOfficialMark;
    }

    /** 
     * Set the 'InventOfficialMark' element value. Отметки таможенного органа.
     * 
     * @param inventOfficialMark
     */
    public void setInventOfficialMark(InventOfficialMarkType inventOfficialMark) {
        this.inventOfficialMark = inventOfficialMark;
    }

    /** 
     * Get the list of 'Request' element items. Запрос о представлении дополнительных документов 
     * 
     * @return list
     */
    public List<RequestType> getRequestList() {
        return requestList;
    }

    /** 
     * Set the list of 'Request' element items. Запрос о представлении дополнительных документов 
     * 
     * @param list
     */
    public void setRequestList(List<RequestType> list) {
        requestList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
