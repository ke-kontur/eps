
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Запрос о необходимости предоставления дополнительных сведений и о возможности принятия решения
 */
public class InspectionInfoType
{
    private String transferKind;
    private String startDateTime;
    private String enterprise;
    private String businessEntity;
    private String destinationPoint;
    private String borderInspectionPoint;
    private String shipmentType;
    private String importerCountry;
    private GoodsInfoType goodsInfo;
    private DocumentBaseType permission;
    private DocumentBaseType vetCertificate;
    private DocumentBaseType waybill;
    private PersonBaseType inspector;

    /** 
     * Get the 'TransferKind' element value. Тип операции: 1 - Ввоз (импорт в ТС); 2 - Вывоз (экспорт из ТС); 3 - Транзит через территорию ТС
     * 
     * @return value
     */
    public String getTransferKind() {
        return transferKind;
    }

    /** 
     * Set the 'TransferKind' element value. Тип операции: 1 - Ввоз (импорт в ТС); 2 - Вывоз (экспорт из ТС); 3 - Транзит через территорию ТС
     * 
     * @param transferKind
     */
    public void setTransferKind(String transferKind) {
        this.transferKind = transferKind;
    }

    /** 
     * Get the 'StartDateTime' element value. Дата и время начала досмотра
     * 
     * @return value
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Set the 'StartDateTime' element value. Дата и время начала досмотра
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Get the 'Enterprise' element value. Зарубежное предприятие-изготовитель
     * 
     * @return value
     */
    public String getEnterprise() {
        return enterprise;
    }

    /** 
     * Set the 'Enterprise' element value. Зарубежное предприятие-изготовитель
     * 
     * @param enterprise
     */
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    /** 
     * Get the 'BusinessEntity' element value. Хозяйствующий субъект-получатель продукции или заявитель.
     * 
     * @return value
     */
    public String getBusinessEntity() {
        return businessEntity;
    }

    /** 
     * Set the 'BusinessEntity' element value. Хозяйствующий субъект-получатель продукции или заявитель.
     * 
     * @param businessEntity
     */
    public void setBusinessEntity(String businessEntity) {
        this.businessEntity = businessEntity;
    }

    /** 
     * Get the 'DestinationPoint' element value. Место назначения (склад временного хранения и т.п.)
     * 
     * @return value
     */
    public String getDestinationPoint() {
        return destinationPoint;
    }

    /** 
     * Set the 'DestinationPoint' element value. Место назначения (склад временного хранения и т.п.)
     * 
     * @param destinationPoint
     */
    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    /** 
     * Get the 'BorderInspectionPoint' element value. Пограничный ветеринарный пункт пропуска
     * 
     * @return value
     */
    public String getBorderInspectionPoint() {
        return borderInspectionPoint;
    }

    /** 
     * Set the 'BorderInspectionPoint' element value. Пограничный ветеринарный пункт пропуска
     * 
     * @param borderInspectionPoint
     */
    public void setBorderInspectionPoint(String borderInspectionPoint) {
        this.borderInspectionPoint = borderInspectionPoint;
    }

    /** 
     * Get the 'ShipmentType' element value. Тип партии для морского транспорта: 0 - Контейнерная партия; 1 - Трюмная партия
     * 
     * @return value
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /** 
     * Set the 'ShipmentType' element value. Тип партии для морского транспорта: 0 - Контейнерная партия; 1 - Трюмная партия
     * 
     * @param shipmentType
     */
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /** 
     * Get the 'ImporterCountry' element value. Буквенный код страны-импортёра 
     * 
     * @return value
     */
    public String getImporterCountry() {
        return importerCountry;
    }

    /** 
     * Set the 'ImporterCountry' element value. Буквенный код страны-импортёра 
     * 
     * @param importerCountry
     */
    public void setImporterCountry(String importerCountry) {
        this.importerCountry = importerCountry;
    }

    /** 
     * Get the 'GoodsInfo' element value. Сведения о товаре
     * 
     * @return value
     */
    public GoodsInfoType getGoodsInfo() {
        return goodsInfo;
    }

    /** 
     * Set the 'GoodsInfo' element value. Сведения о товаре
     * 
     * @param goodsInfo
     */
    public void setGoodsInfo(GoodsInfoType goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /** 
     * Get the 'Permission' element value. Разрешение РСХН на транспортировку подконтрольной продукции
     * 
     * @return value
     */
    public DocumentBaseType getPermission() {
        return permission;
    }

    /** 
     * Set the 'Permission' element value. Разрешение РСХН на транспортировку подконтрольной продукции
     * 
     * @param permission
     */
    public void setPermission(DocumentBaseType permission) {
        this.permission = permission;
    }

    /** 
     * Get the 'VetCertificate' element value. Ветеринарный сопроводительный документ
     * 
     * @return value
     */
    public DocumentBaseType getVetCertificate() {
        return vetCertificate;
    }

    /** 
     * Set the 'VetCertificate' element value. Ветеринарный сопроводительный документ
     * 
     * @param vetCertificate
     */
    public void setVetCertificate(DocumentBaseType vetCertificate) {
        this.vetCertificate = vetCertificate;
    }

    /** 
     * Get the 'Waybill' element value. Товарно-транспортная накладная (ТТН)
     * 
     * @return value
     */
    public DocumentBaseType getWaybill() {
        return waybill;
    }

    /** 
     * Set the 'Waybill' element value. Товарно-транспортная накладная (ТТН)
     * 
     * @param waybill
     */
    public void setWaybill(DocumentBaseType waybill) {
        this.waybill = waybill;
    }

    /** 
     * Get the 'Inspector' element value. Таможенный инспектор
     * 
     * @return value
     */
    public PersonBaseType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. Таможенный инспектор
     * 
     * @param inspector
     */
    public void setInspector(PersonBaseType inspector) {
        this.inspector = inspector;
    }
}
