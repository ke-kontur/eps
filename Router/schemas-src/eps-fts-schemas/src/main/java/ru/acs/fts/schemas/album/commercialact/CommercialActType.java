
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportLinkDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * Коммерческий акт - документ, составленный владельцем СВХ в связи с выявлением несоответствий товаров, находящихся на временном хранении, сведениям из товаросопроводительных документов
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
     * Get the 'DO1ReportLinkData' element value. Сведения об отчете о принятии по форме ДО-1, в отношении товаров которого составлен настоящий Акт
     * 
     * @return value
     */
    public WareHouseReportLinkDataType getDO1ReportLinkData() {
        return DO1ReportLinkData;
    }

    /** 
     * Set the 'DO1ReportLinkData' element value. Сведения об отчете о принятии по форме ДО-1, в отношении товаров которого составлен настоящий Акт
     * 
     * @param DO1ReportLinkData
     */
    public void setDO1ReportLinkData(
            WareHouseReportLinkDataType DO1ReportLinkData) {
        this.DO1ReportLinkData = DO1ReportLinkData;
    }

    /** 
     * Get the 'ActDetails' element value. Сведения об акте
     * 
     * @return value
     */
    public ActDetailsType getActDetails() {
        return actDetails;
    }

    /** 
     * Set the 'ActDetails' element value. Сведения об акте
     * 
     * @param actDetails
     */
    public void setActDetails(ActDetailsType actDetails) {
        this.actDetails = actDetails;
    }

    /** 
     * Get the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'DiscrepancyInfo' element value. Сведения о выявленных несоответствиях
     * 
     * @return value
     */
    public DiscrepancyInfoType getDiscrepancyInfo() {
        return discrepancyInfo;
    }

    /** 
     * Set the 'DiscrepancyInfo' element value. Сведения о выявленных несоответствиях
     * 
     * @param discrepancyInfo
     */
    public void setDiscrepancyInfo(DiscrepancyInfoType discrepancyInfo) {
        this.discrepancyInfo = discrepancyInfo;
    }

    /** 
     * Get the 'WareHousePerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от склада
     * 
     * @return value
     */
    public PersonBaseType getWareHousePerson() {
        return wareHousePerson;
    }

    /** 
     * Set the 'WareHousePerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от склада
     * 
     * @param wareHousePerson
     */
    public void setWareHousePerson(PersonBaseType wareHousePerson) {
        this.wareHousePerson = wareHousePerson;
    }

    /** 
     * Get the 'CarrierPerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от перевозчика
     * 
     * @return value
     */
    public PersonBaseType getCarrierPerson() {
        return carrierPerson;
    }

    /** 
     * Set the 'CarrierPerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от перевозчика
     * 
     * @param carrierPerson
     */
    public void setCarrierPerson(PersonBaseType carrierPerson) {
        this.carrierPerson = carrierPerson;
    }

    /** 
     * Get the 'RecipientPerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от получателя
     * 
     * @return value
     */
    public PersonBaseType getRecipientPerson() {
        return recipientPerson;
    }

    /** 
     * Set the 'RecipientPerson' element value. Уполномоченный сотрудник, подписавший настоящий акт от получателя
     * 
     * @param recipientPerson
     */
    public void setRecipientPerson(PersonBaseType recipientPerson) {
        this.recipientPerson = recipientPerson;
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
