
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportLinkDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * ������������ ��� - ��������, ������������ ���������� ��� � ����� � ���������� �������������� �������, ����������� �� ��������� ��������, ��������� �� ���������������������� ����������
 */
public class CommercialActType extends BaseDocType
{
    private WareHouseReportLinkDataType DO1ReportLinkData;
    private ActDetailsType actDetails;
    private WarehouseOwnerType warehouseOwner;
    private DiscrepancyInfoType discrepancyInfo;
    private PersonBaseType wareHousePerson;
    private PersonBaseType carrierPerson;
    private PersonBaseType recipientPerson;
    private String documentModeID;

    /** 
     * Get the 'DO1ReportLinkData' element value. �������� �� ������ � �������� �� ����� ��-1, � ��������� ������� �������� ��������� ��������� ���
     * 
     * @return value
     */
    public WareHouseReportLinkDataType getDO1ReportLinkData() {
        return DO1ReportLinkData;
    }

    /** 
     * Set the 'DO1ReportLinkData' element value. �������� �� ������ � �������� �� ����� ��-1, � ��������� ������� �������� ��������� ��������� ���
     * 
     * @param DO1ReportLinkData
     */
    public void setDO1ReportLinkData(
            WareHouseReportLinkDataType DO1ReportLinkData) {
        this.DO1ReportLinkData = DO1ReportLinkData;
    }

    /** 
     * Get the 'ActDetails' element value. �������� �� ����
     * 
     * @return value
     */
    public ActDetailsType getActDetails() {
        return actDetails;
    }

    /** 
     * Set the 'ActDetails' element value. �������� �� ����
     * 
     * @param actDetails
     */
    public void setActDetails(ActDetailsType actDetails) {
        this.actDetails = actDetails;
    }

    /** 
     * Get the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'DiscrepancyInfo' element value. �������� � ���������� ���������������
     * 
     * @return value
     */
    public DiscrepancyInfoType getDiscrepancyInfo() {
        return discrepancyInfo;
    }

    /** 
     * Set the 'DiscrepancyInfo' element value. �������� � ���������� ���������������
     * 
     * @param discrepancyInfo
     */
    public void setDiscrepancyInfo(DiscrepancyInfoType discrepancyInfo) {
        this.discrepancyInfo = discrepancyInfo;
    }

    /** 
     * Get the 'WareHousePerson' element value. �������������� ���������, ����������� ��������� ��� �� ������
     * 
     * @return value
     */
    public PersonBaseType getWareHousePerson() {
        return wareHousePerson;
    }

    /** 
     * Set the 'WareHousePerson' element value. �������������� ���������, ����������� ��������� ��� �� ������
     * 
     * @param wareHousePerson
     */
    public void setWareHousePerson(PersonBaseType wareHousePerson) {
        this.wareHousePerson = wareHousePerson;
    }

    /** 
     * Get the 'CarrierPerson' element value. �������������� ���������, ����������� ��������� ��� �� �����������
     * 
     * @return value
     */
    public PersonBaseType getCarrierPerson() {
        return carrierPerson;
    }

    /** 
     * Set the 'CarrierPerson' element value. �������������� ���������, ����������� ��������� ��� �� �����������
     * 
     * @param carrierPerson
     */
    public void setCarrierPerson(PersonBaseType carrierPerson) {
        this.carrierPerson = carrierPerson;
    }

    /** 
     * Get the 'RecipientPerson' element value. �������������� ���������, ����������� ��������� ��� �� ����������
     * 
     * @return value
     */
    public PersonBaseType getRecipientPerson() {
        return recipientPerson;
    }

    /** 
     * Set the 'RecipientPerson' element value. �������������� ���������, ����������� ��������� ��� �� ����������
     * 
     * @param recipientPerson
     */
    public void setRecipientPerson(PersonBaseType recipientPerson) {
        this.recipientPerson = recipientPerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
