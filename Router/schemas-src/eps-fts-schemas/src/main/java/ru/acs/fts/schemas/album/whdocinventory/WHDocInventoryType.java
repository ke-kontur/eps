
package ru.acs.fts.schemas.album.whdocinventory;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseCertificateType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * Предоставление описи документов таможенному органу, осуществляющему контроль за функционированием СВХ./Перечень электронных документов
 */
public class WHDocInventoryType extends BaseDocType
{
    private LocalDate inventoryInstanceDate;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private SenderType sender;
    private ReceiverType receiver;
    private GTDIDType regNumberDoc;
    private WarehouseCertificateType warehouseLicense;
    private List<WhTransportType> transportList = new ArrayList<WhTransportType>();
    private List<GoodsShipmentType> goodsShipmentList = new ArrayList<GoodsShipmentType>();
    private String documentModeID;

    /** 
     * Get the 'InventoryInstanceDate' element value. Дата предоставления описи.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. Дата предоставления описи.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the list of 'InventDocument' element items. Документ из описи
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. Документ из описи
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }

    /** 
     * Get the 'Sender' element value. Отправитель
     * 
     * @return value
     */
    public SenderType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель
     * 
     * @param sender
     */
    public void setSender(SenderType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public ReceiverType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(ReceiverType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'RegNumberDoc' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public GTDIDType getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. Регистрационный номер документа
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(GTDIDType regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'WarehouseLicense' element value. Разрешительный документ (свидетельство, разрешение) склада, на который предполагается помещение товаров. Может быть заполнено при подаче описи перевозчиком в ТО
     * 
     * @return value
     */
    public WarehouseCertificateType getWarehouseLicense() {
        return warehouseLicense;
    }

    /** 
     * Set the 'WarehouseLicense' element value. Разрешительный документ (свидетельство, разрешение) склада, на который предполагается помещение товаров. Может быть заполнено при подаче описи перевозчиком в ТО
     * 
     * @param warehouseLicense
     */
    public void setWarehouseLicense(WarehouseCertificateType warehouseLicense) {
        this.warehouseLicense = warehouseLicense;
    }

    /** 
     * Get the list of 'Transports' element items. Описание транспортных  средств
     * 
     * @return list
     */
    public List<WhTransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transports' element items. Описание транспортных  средств
     * 
     * @param list
     */
    public void setTransportList(List<WhTransportType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'GoodsShipment' element items. Описание товаро-транспортных накладных (товарных партий), представляемых при помещении товаров на временное хранение
     * 
     * @return list
     */
    public List<GoodsShipmentType> getGoodsShipmentList() {
        return goodsShipmentList;
    }

    /** 
     * Set the list of 'GoodsShipment' element items. Описание товаро-транспортных накладных (товарных партий), представляемых при помещении товаров на временное хранение
     * 
     * @param list
     */
    public void setGoodsShipmentList(List<GoodsShipmentType> list) {
        goodsShipmentList = list;
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
