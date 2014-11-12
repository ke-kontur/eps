
package ru.acs.fts.schemas.album.cwdeclaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.AISTSDocumentIDType;

/** 
 * ���������� � ����������  ���������
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
     * Get the 'OwnerName' element value. ������������ ����, ����������� ������� � ��������� �������
     * 
     * @return value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** 
     * Set the 'OwnerName' element value. ������������ ����, ����������� ������� � ��������� �������
     * 
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /** 
     * Get the 'OwnerNameFull' element value. ������ ������������ ����, ����������� ������� � ��������� �������
     * 
     * @return value
     */
    public String getOwnerNameFull() {
        return ownerNameFull;
    }

    /** 
     * Set the 'OwnerNameFull' element value. ������ ������������ ����, ����������� ������� � ��������� �������
     * 
     * @param ownerNameFull
     */
    public void setOwnerNameFull(String ownerNameFull) {
        this.ownerNameFull = ownerNameFull;
    }

    /** 
     * Get the 'CustomName' element value. ������������ ����������� ������, ��������������� �������� �������
     * 
     * @return value
     */
    public String getCustomName() {
        return customName;
    }

    /** 
     * Set the 'CustomName' element value. ������������ ����������� ������, ��������������� �������� �������
     * 
     * @param customName
     */
    public void setCustomName(String customName) {
        this.customName = customName;
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
     * Get the 'PeriodStart' element value. ������ ����� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getPeriodStart() {
        return periodStart;
    }

    /** 
     * Set the 'PeriodStart' element value. ������ ����� ���������� ��������
     * 
     * @param periodStart
     */
    public void setPeriodStart(LocalDate periodStart) {
        this.periodStart = periodStart;
    }

    /** 
     * Get the 'PeriodFinish' element value. ��������� ����� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getPeriodFinish() {
        return periodFinish;
    }

    /** 
     * Set the 'PeriodFinish' element value. ��������� ����� ���������� ��������
     * 
     * @param periodFinish
     */
    public void setPeriodFinish(LocalDate periodFinish) {
        this.periodFinish = periodFinish;
    }

    /** 
     * Get the 'Materials' element value. ���������, ������������ ��� ���������� ��������
     * 
     * @return value
     */
    public String getMaterials() {
        return materials;
    }

    /** 
     * Set the 'Materials' element value. ���������, ������������ ��� ���������� ��������
     * 
     * @param materials
     */
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    /** 
     * Get the 'TechnicalFacilities' element value. ����������� ��������, ������������ ��� ���������� ��������
     * 
     * @return value
     */
    public String getTechnicalFacilities() {
        return technicalFacilities;
    }

    /** 
     * Set the 'TechnicalFacilities' element value. ����������� ��������, ������������ ��� ���������� ��������
     * 
     * @param technicalFacilities
     */
    public void setTechnicalFacilities(String technicalFacilities) {
        this.technicalFacilities = technicalFacilities;
    }

    /** 
     * Get the 'OperationName' element value. ������������ �������� ��� ��������
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. ������������ �������� ��� ��������
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the 'OperationID' element value. ��� �������� ��� ��������
     * 
     * @return value
     */
    public String getOperationID() {
        return operationID;
    }

    /** 
     * Set the 'OperationID' element value. ��� �������� ��� ��������
     * 
     * @param operationID
     */
    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }

    /** 
     * Get the 'DeclarationNumber' element value. ����� ���������
     * 
     * @return value
     */
    public AISTSDocumentIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. ����� ���������
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(AISTSDocumentIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
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
     * Get the 'FormularNumber' element value. ����� ��������� �������� �������
     * 
     * @return value
     */
    public AISTSDocumentIDType getFormularNumber() {
        return formularNumber;
    }

    /** 
     * Set the 'FormularNumber' element value. ����� ��������� �������� �������
     * 
     * @param formularNumber
     */
    public void setFormularNumber(AISTSDocumentIDType formularNumber) {
        this.formularNumber = formularNumber;
    }

    /** 
     * Get the 'GTDNumber' element value. ����� ��, �� ������� ������ �������� ��� ���������� ����� ����������� ������
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ����� ��, �� ������� ������ �������� ��� ���������� ����� ����������� ������
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
