
package ru.acs.fts.schemas.album.cwformular;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.AISTSDocumentIDType;

/** 
 * ���������� � ���������� ���������
 */
public class FormularHeadType
{
    private String orderNumberOfEdition;
    private LocalDate goodsSetDate;
    private String reasonToAccess;
    private String objectID;
    private String objectName;
    private String warehouseLicenceID;
    private String objectCustomsCode;
    private String delivererName;
    private String fullPart;
    private String marks;
    private LocalDate controlDateOn;
    private LocalDate controlDateOff;
    private String ownerName;
    private AISTSDocumentIDType formularNumber;
    private AISTSDocumentIDType storageQuitanceNumber;
    private InspectorType inspector;
    private GTDIDType GTDNumber;

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
     * Get the 'GoodsSetDate' element value. ���� ��������� ������� �� �����
     * 
     * @return value
     */
    public LocalDate getGoodsSetDate() {
        return goodsSetDate;
    }

    /** 
     * Set the 'GoodsSetDate' element value. ���� ��������� ������� �� �����
     * 
     * @param goodsSetDate
     */
    public void setGoodsSetDate(LocalDate goodsSetDate) {
        this.goodsSetDate = goodsSetDate;
    }

    /** 
     * Get the 'ReasonToAccess' element value. ��������� ��� ������� � ���������� �������� ��� ��������
     * 
     * @return value
     */
    public String getReasonToAccess() {
        return reasonToAccess;
    }

    /** 
     * Set the 'ReasonToAccess' element value. ��������� ��� ������� � ���������� �������� ��� ��������
     * 
     * @param reasonToAccess
     */
    public void setReasonToAccess(String reasonToAccess) {
        this.reasonToAccess = reasonToAccess;
    }

    /** 
     * Get the 'ObjectID' element value. ��� ���� ���������� �������� ��� ��������
     * 
     * @return value
     */
    public String getObjectID() {
        return objectID;
    }

    /** 
     * Set the 'ObjectID' element value. ��� ���� ���������� �������� ��� ��������
     * 
     * @param objectID
     */
    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    /** 
     * Get the 'ObjectName' element value. ������������ ���� ���������� �������� ��� ��������
     * 
     * @return value
     */
    public String getObjectName() {
        return objectName;
    }

    /** 
     * Set the 'ObjectName' element value. ������������ ���� ���������� �������� ��� ��������
     * 
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /** 
     * Get the 'WarehouseLicenceID' element value. ����� �������� ������, �� ������� ������������ ������
     * 
     * @return value
     */
    public String getWarehouseLicenceID() {
        return warehouseLicenceID;
    }

    /** 
     * Set the 'WarehouseLicenceID' element value. ����� �������� ������, �� ������� ������������ ������
     * 
     * @param warehouseLicenceID
     */
    public void setWarehouseLicenceID(String warehouseLicenceID) {
        this.warehouseLicenceID = warehouseLicenceID;
    }

    /** 
     * Get the 'ObjectCustomsCode' element value. ��� ����������� ������, �� ������� ������������ ������
     * 
     * @return value
     */
    public String getObjectCustomsCode() {
        return objectCustomsCode;
    }

    /** 
     * Set the 'ObjectCustomsCode' element value. ��� ����������� ������, �� ������� ������������ ������
     * 
     * @param objectCustomsCode
     */
    public void setObjectCustomsCode(String objectCustomsCode) {
        this.objectCustomsCode = objectCustomsCode;
    }

    /** 
     * Get the 'DelivererName' element value. ����, �������� ���������� ����� �������� ��������
     * 
     * @return value
     */
    public String getDelivererName() {
        return delivererName;
    }

    /** 
     * Set the 'DelivererName' element value. ����, �������� ���������� ����� �������� ��������
     * 
     * @param delivererName
     */
    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName;
    }

    /** 
     * Get the 'FullPart' element value. ���� ���������� �������� ��� ���� ������� �������
     * 
     * @return value
     */
    public String getFullPart() {
        return fullPart;
    }

    /** 
     * Set the 'FullPart' element value. ���� ���������� �������� ��� ���� ������� �������
     * 
     * @param fullPart
     */
    public void setFullPart(String fullPart) {
        this.fullPart = fullPart;
    }

    /** 
     * Get the 'Marks' element value. ������� ��������������� ������
     * 
     * @return value
     */
    public String getMarks() {
        return marks;
    }

    /** 
     * Set the 'Marks' element value. ������� ��������������� ������
     * 
     * @param marks
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /** 
     * Get the 'ControlDateOn' element value. ���� �������� ������� �� ��������
     * 
     * @return value
     */
    public LocalDate getControlDateOn() {
        return controlDateOn;
    }

    /** 
     * Set the 'ControlDateOn' element value. ���� �������� ������� �� ��������
     * 
     * @param controlDateOn
     */
    public void setControlDateOn(LocalDate controlDateOn) {
        this.controlDateOn = controlDateOn;
    }

    /** 
     * Get the 'ControlDateOff' element value. ���� ������ ������� � ��������
     * 
     * @return value
     */
    public LocalDate getControlDateOff() {
        return controlDateOff;
    }

    /** 
     * Set the 'ControlDateOff' element value. ���� ������ ������� � ��������
     * 
     * @param controlDateOff
     */
    public void setControlDateOff(LocalDate controlDateOff) {
        this.controlDateOff = controlDateOff;
    }

    /** 
     * Get the 'OwnerName' element value. ������������ ����, ����������� ������� � ��������� ������
     * 
     * @return value
     */
    public String getOwnerName() {
        return ownerName;
    }

    /** 
     * Set the 'OwnerName' element value. ������������ ����, ����������� ������� � ��������� ������
     * 
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /** 
     * Get the 'FormularNumber' element value. ����� ���������
     * 
     * @return value
     */
    public AISTSDocumentIDType getFormularNumber() {
        return formularNumber;
    }

    /** 
     * Set the 'FormularNumber' element value. ����� ���������
     * 
     * @param formularNumber
     */
    public void setFormularNumber(AISTSDocumentIDType formularNumber) {
        this.formularNumber = formularNumber;
    }

    /** 
     * Get the 'StorageQuitanceNumber' element value. ����� ��������� ���������, ����������� ��� �������� ������� �� ���������� �����
     * 
     * @return value
     */
    public AISTSDocumentIDType getStorageQuitanceNumber() {
        return storageQuitanceNumber;
    }

    /** 
     * Set the 'StorageQuitanceNumber' element value. ����� ��������� ���������, ����������� ��� �������� ������� �� ���������� �����
     * 
     * @param storageQuitanceNumber
     */
    public void setStorageQuitanceNumber(
            AISTSDocumentIDType storageQuitanceNumber) {
        this.storageQuitanceNumber = storageQuitanceNumber;
    }

    /** 
     * Get the 'Inspector' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public InspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. ����������� ���� ����������� ������
     * 
     * @param inspector
     */
    public void setInspector(InspectorType inspector) {
        this.inspector = inspector;
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
