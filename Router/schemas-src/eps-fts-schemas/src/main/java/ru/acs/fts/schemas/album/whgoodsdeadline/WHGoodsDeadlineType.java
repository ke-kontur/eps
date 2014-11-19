
package ru.acs.fts.schemas.album.whgoodsdeadline;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;

/** 
 * Уведомление/Акт  об истечении сроков временного хранения товаров
 */
public class WHGoodsDeadlineType extends BaseDocType
{
    private String WHSign;
    private LocalDate documentDate;
    private String documentNumber;
    private String TIRTDNumber;
    private LocalDate placementDate;
    private LocalDate endDate;
    private CustomsType customs;
    private WhPresentDocType transportDoc;
    private OrganizationType carrier;
    private OrganizationType receiver;
    private WarehouseOwnerType warehouse;
    private WHCustomInspectorType customInspector;
    private String documentModeID;

    /** 
     * Get the 'WHSign' element value. Признак документа. 1- Уведомление об истечении сроков временного хранения товаров; 2 - Акт  об истечении сроков временного хранения товаров.
     * 
     * @return value
     */
    public String getWHSign() {
        return WHSign;
    }

    /** 
     * Set the 'WHSign' element value. Признак документа. 1- Уведомление об истечении сроков временного хранения товаров; 2 - Акт  об истечении сроков временного хранения товаров.
     * 
     * @param WHSign
     */
    public void setWHSign(String WHSign) {
        this.WHSign = WHSign;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'TIRTDNumber' element value. Номер транзитной декларации (книжки МДП)
     * 
     * @return value
     */
    public String getTIRTDNumber() {
        return TIRTDNumber;
    }

    /** 
     * Set the 'TIRTDNumber' element value. Номер транзитной декларации (книжки МДП)
     * 
     * @param TIRTDNumber
     */
    public void setTIRTDNumber(String TIRTDNumber) {
        this.TIRTDNumber = TIRTDNumber;
    }

    /** 
     * Get the 'PlacementDate' element value. Дата помещения товара на временное хранение
     * 
     * @return value
     */
    public LocalDate getPlacementDate() {
        return placementDate;
    }

    /** 
     * Set the 'PlacementDate' element value. Дата помещения товара на временное хранение
     * 
     * @param placementDate
     */
    public void setPlacementDate(LocalDate placementDate) {
        this.placementDate = placementDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата истечения срока
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата истечения срока
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'TransportDoc' element value. Транспортный документ
     * 
     * @return value
     */
    public WhPresentDocType getTransportDoc() {
        return transportDoc;
    }

    /** 
     * Set the 'TransportDoc' element value. Транспортный документ
     * 
     * @param transportDoc
     */
    public void setTransportDoc(WhPresentDocType transportDoc) {
        this.transportDoc = transportDoc;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public OrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'Warehouse' element value. Описание склада, на котором находятся товары
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouse() {
        return warehouse;
    }

    /** 
     * Set the 'Warehouse' element value. Описание склада, на котором находятся товары
     * 
     * @param warehouse
     */
    public void setWarehouse(WarehouseOwnerType warehouse) {
        this.warehouse = warehouse;
    }

    /** 
     * Get the 'CustomInspector' element value. Подпись должностного лица таможенного органа
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomInspector() {
        return customInspector;
    }

    /** 
     * Set the 'CustomInspector' element value. Подпись должностного лица таможенного органа
     * 
     * @param customInspector
     */
    public void setCustomInspector(WHCustomInspectorType customInspector) {
        this.customInspector = customInspector;
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
