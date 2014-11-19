
package ru.acs.fts.schemas.album.cwdeclaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.AISTSDocumentIDType;

/** 
 * Информация о реквизитах  документа
 */
public class DeclarationHeaderType
{
    private String ownerName;
    private String ownerNameFull;
    private String customName;
    private String orderNumberOfEdition;
    private LocalDate periodStart;
    private LocalDate periodFinish;
    private String materials;
    private String technicalFacilities;
    private String operationName;
    private String operationID;
    private AISTSDocumentIDType declarationNumber;
    private AISTSDocumentIDType storageQuitanceNumber;
    private AISTSDocumentIDType formularNumber;
    private GTDIDType GTDNumber;

    /** 
     * Get the 'OwnerName' element value. Наименование лица, обладающего правами в отношении товаров
     * 
     * @return value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** 
     * Set the 'OwnerName' element value. Наименование лица, обладающего правами в отношении товаров
     * 
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /** 
     * Get the 'OwnerNameFull' element value. Полное наименование лица, обладающего правами в отношении товаров
     * 
     * @return value
     */
    public String getOwnerNameFull() {
        return ownerNameFull;
    }

    /** 
     * Set the 'OwnerNameFull' element value. Полное наименование лица, обладающего правами в отношении товаров
     * 
     * @param ownerNameFull
     */
    public void setOwnerNameFull(String ownerNameFull) {
        this.ownerNameFull = ownerNameFull;
    }

    /** 
     * Get the 'CustomName' element value. Наименование таможенного органа, осуществляющего хранение товаров
     * 
     * @return value
     */
    public String getCustomName() {
        return customName;
    }

    /** 
     * Set the 'CustomName' element value. Наименование таможенного органа, осуществляющего хранение товаров
     * 
     * @param customName
     */
    public void setCustomName(String customName) {
        this.customName = customName;
    }

    /** 
     * Get the 'OrderNumberOfEdition' element value. Порядковый номер редакции электронного документа
     * 
     * @return value
     */
    public String getOrderNumberOfEdition() {
        return orderNumberOfEdition;
    }

    /** 
     * Set the 'OrderNumberOfEdition' element value. Порядковый номер редакции электронного документа
     * 
     * @param orderNumberOfEdition
     */
    public void setOrderNumberOfEdition(String orderNumberOfEdition) {
        this.orderNumberOfEdition = orderNumberOfEdition;
    }

    /** 
     * Get the 'PeriodStart' element value. Начало срока проведения операции
     * 
     * @return value
     */
    public LocalDate getPeriodStart() {
        return periodStart;
    }

    /** 
     * Set the 'PeriodStart' element value. Начало срока проведения операции
     * 
     * @param periodStart
     */
    public void setPeriodStart(LocalDate periodStart) {
        this.periodStart = periodStart;
    }

    /** 
     * Get the 'PeriodFinish' element value. Окончание срока проведения операции
     * 
     * @return value
     */
    public LocalDate getPeriodFinish() {
        return periodFinish;
    }

    /** 
     * Set the 'PeriodFinish' element value. Окончание срока проведения операции
     * 
     * @param periodFinish
     */
    public void setPeriodFinish(LocalDate periodFinish) {
        this.periodFinish = periodFinish;
    }

    /** 
     * Get the 'Materials' element value. Материалы, используемые при проведении операции
     * 
     * @return value
     */
    public String getMaterials() {
        return materials;
    }

    /** 
     * Set the 'Materials' element value. Материалы, используемые при проведении операции
     * 
     * @param materials
     */
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    /** 
     * Get the 'TechnicalFacilities' element value. Технические средства, используемые при проведении операции
     * 
     * @return value
     */
    public String getTechnicalFacilities() {
        return technicalFacilities;
    }

    /** 
     * Set the 'TechnicalFacilities' element value. Технические средства, используемые при проведении операции
     * 
     * @param technicalFacilities
     */
    public void setTechnicalFacilities(String technicalFacilities) {
        this.technicalFacilities = technicalFacilities;
    }

    /** 
     * Get the 'OperationName' element value. Наименование операции над товарами
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. Наименование операции над товарами
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the 'OperationID' element value. Тип операции над товарами
     * 
     * @return value
     */
    public String getOperationID() {
        return operationID;
    }

    /** 
     * Set the 'OperationID' element value. Тип операции над товарами
     * 
     * @param operationID
     */
    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }

    /** 
     * Get the 'DeclarationNumber' element value. Номер заявления
     * 
     * @return value
     */
    public AISTSDocumentIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. Номер заявления
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(AISTSDocumentIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
    }

    /** 
     * Get the 'StorageQuitanceNumber' element value. Номер складской квитанции
     * 
     * @return value
     */
    public AISTSDocumentIDType getStorageQuitanceNumber() {
        return storageQuitanceNumber;
    }

    /** 
     * Set the 'StorageQuitanceNumber' element value. Номер складской квитанции
     * 
     * @param storageQuitanceNumber
     */
    public void setStorageQuitanceNumber(
            AISTSDocumentIDType storageQuitanceNumber) {
        this.storageQuitanceNumber = storageQuitanceNumber;
    }

    /** 
     * Get the 'FormularNumber' element value. Номер формуляра контроля товаров
     * 
     * @return value
     */
    public AISTSDocumentIDType getFormularNumber() {
        return formularNumber;
    }

    /** 
     * Set the 'FormularNumber' element value. Номер формуляра контроля товаров
     * 
     * @param formularNumber
     */
    public void setFormularNumber(AISTSDocumentIDType formularNumber) {
        this.formularNumber = formularNumber;
    }

    /** 
     * Get the 'GTDNumber' element value. Номер ДТ, по которой товары помещены под таможенный режим таможенного склада
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Номер ДТ, по которой товары помещены под таможенный режим таможенного склада
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
