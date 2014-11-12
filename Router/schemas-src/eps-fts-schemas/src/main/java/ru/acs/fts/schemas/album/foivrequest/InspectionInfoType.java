
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������ � ������������� �������������� �������������� �������� � � ����������� �������� �������
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
     * Get the 'TransferKind' element value. ��� ��������: 1 - ���� (������ � ��); 2 - ����� (������� �� ��); 3 - ������� ����� ���������� ��
     * 
     * @return value
     */
    public String getTransferKind() {
        return transferKind;
    }

    /** 
     * Set the 'TransferKind' element value. ��� ��������: 1 - ���� (������ � ��); 2 - ����� (������� �� ��); 3 - ������� ����� ���������� ��
     * 
     * @param transferKind
     */
    public void setTransferKind(String transferKind) {
        this.transferKind = transferKind;
    }

    /** 
     * Get the 'StartDateTime' element value. ���� � ����� ������ ��������
     * 
     * @return value
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Set the 'StartDateTime' element value. ���� � ����� ������ ��������
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Get the 'Enterprise' element value. ���������� �����������-������������
     * 
     * @return value
     */
    public String getEnterprise() {
        return enterprise;
    }

    /** 
     * Set the 'Enterprise' element value. ���������� �����������-������������
     * 
     * @param enterprise
     */
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    /** 
     * Get the 'BusinessEntity' element value. ������������� �������-���������� ��������� ��� ���������.
     * 
     * @return value
     */
    public String getBusinessEntity() {
        return businessEntity;
    }

    /** 
     * Set the 'BusinessEntity' element value. ������������� �������-���������� ��������� ��� ���������.
     * 
     * @param businessEntity
     */
    public void setBusinessEntity(String businessEntity) {
        this.businessEntity = businessEntity;
    }

    /** 
     * Get the 'DestinationPoint' element value. ����� ���������� (����� ���������� �������� � �.�.)
     * 
     * @return value
     */
    public String getDestinationPoint() {
        return destinationPoint;
    }

    /** 
     * Set the 'DestinationPoint' element value. ����� ���������� (����� ���������� �������� � �.�.)
     * 
     * @param destinationPoint
     */
    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    /** 
     * Get the 'BorderInspectionPoint' element value. ����������� ������������ ����� ��������
     * 
     * @return value
     */
    public String getBorderInspectionPoint() {
        return borderInspectionPoint;
    }

    /** 
     * Set the 'BorderInspectionPoint' element value. ����������� ������������ ����� ��������
     * 
     * @param borderInspectionPoint
     */
    public void setBorderInspectionPoint(String borderInspectionPoint) {
        this.borderInspectionPoint = borderInspectionPoint;
    }

    /** 
     * Get the 'ShipmentType' element value. ��� ������ ��� �������� ����������: 0 - ������������ ������; 1 - ������� ������
     * 
     * @return value
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /** 
     * Set the 'ShipmentType' element value. ��� ������ ��� �������� ����������: 0 - ������������ ������; 1 - ������� ������
     * 
     * @param shipmentType
     */
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /** 
     * Get the 'ImporterCountry' element value. ��������� ��� ������-�������� 
     * 
     * @return value
     */
    public String getImporterCountry() {
        return importerCountry;
    }

    /** 
     * Set the 'ImporterCountry' element value. ��������� ��� ������-�������� 
     * 
     * @param importerCountry
     */
    public void setImporterCountry(String importerCountry) {
        this.importerCountry = importerCountry;
    }

    /** 
     * Get the 'GoodsInfo' element value. �������� � ������
     * 
     * @return value
     */
    public GoodsInfoType getGoodsInfo() {
        return goodsInfo;
    }

    /** 
     * Set the 'GoodsInfo' element value. �������� � ������
     * 
     * @param goodsInfo
     */
    public void setGoodsInfo(GoodsInfoType goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /** 
     * Get the 'Permission' element value. ���������� ���� �� ��������������� �������������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getPermission() {
        return permission;
    }

    /** 
     * Set the 'Permission' element value. ���������� ���� �� ��������������� �������������� ���������
     * 
     * @param permission
     */
    public void setPermission(DocumentBaseType permission) {
        this.permission = permission;
    }

    /** 
     * Get the 'VetCertificate' element value. ������������ ���������������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getVetCertificate() {
        return vetCertificate;
    }

    /** 
     * Set the 'VetCertificate' element value. ������������ ���������������� ��������
     * 
     * @param vetCertificate
     */
    public void setVetCertificate(DocumentBaseType vetCertificate) {
        this.vetCertificate = vetCertificate;
    }

    /** 
     * Get the 'Waybill' element value. �������-������������ ��������� (���)
     * 
     * @return value
     */
    public DocumentBaseType getWaybill() {
        return waybill;
    }

    /** 
     * Set the 'Waybill' element value. �������-������������ ��������� (���)
     * 
     * @param waybill
     */
    public void setWaybill(DocumentBaseType waybill) {
        this.waybill = waybill;
    }

    /** 
     * Get the 'Inspector' element value. ���������� ���������
     * 
     * @return value
     */
    public PersonBaseType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. ���������� ���������
     * 
     * @param inspector
     */
    public void setInspector(PersonBaseType inspector) {
        this.inspector = inspector;
    }
}
