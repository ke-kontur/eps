
package ru.acs.fts.schemas.album.inventory;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Опись документов
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
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении описи отдельно от ДТ.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении описи отдельно от ДТ.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'GTDPerson' element value. Сведения о лице, подающем документ(ы)
     * 
     * @return value
     */
    public GtdPersonType getGTDPerson() {
        return GTDPerson;
    }

    /** 
     * Set the 'GTDPerson' element value. Сведения о лице, подающем документ(ы)
     * 
     * @param GTDPerson
     */
    public void setGTDPerson(GtdPersonType GTDPerson) {
        this.GTDPerson = GTDPerson;
    }

    /** 
     * Get the 'InventoryInstance' element value. Экземпляр описи
     * 
     * @return value
     */
    public InventoryInstanceType getInventoryInstance() {
        return inventoryInstance;
    }

    /** 
     * Set the 'InventoryInstance' element value. Экземпляр описи
     * 
     * @param inventoryInstance
     */
    public void setInventoryInstance(InventoryInstanceType inventoryInstance) {
        this.inventoryInstance = inventoryInstance;
    }

    /** 
     * Get the 'GTDNumber' element value. Справочный номер ДТ Заполняется при  предоставлении документов после регистрации ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Справочный номер ДТ Заполняется при  предоставлении документов после регистрации ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
