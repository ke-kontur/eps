
package ru.acs.fts.schemas.album.transportmeanspassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportManufacturerType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * Паспорт транспортного средства. 
 */
public class TransportMeansPassportType extends BaseDocType
{
    private LocalDate issueDate;
    private String organizationName;
    private String countryCode;
    private String customsRestriction;
    private ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType PTSSerialNumber;
    private TransportManufacturerType manufacturer;
    private PTSDataType PTSData;
    private int choiceSelect = -1;
    private static final int IMPORT_CERTIFICATION_CHOICE = 0;
    private static final int CUSTOMS_PROFIT_ORDER_CHOICE = 1;
    private static final int GTDID_CHOICE = 2;
    private FederalDocType importCertification;
    private CustomsProfitOrderType customsProfitOrder;
    private GTDIDType GTDID;
    private AddressType organizationlegalAddress;
    private TransportOwnerType transportMeansOwner;
    private List<TSBargainType> TSBargainList = new ArrayList<TSBargainType>();
    private String documentModeID;

    /** 
     * Get the 'IssueDate' element value. Дата выдачи паспорта
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи паспорта
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации, выдавшей паспорт
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации, выдавшей паспорт
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CountryCode' element value. Код страны ввоза/вывоза ТС
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны ввоза/вывоза ТС
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CustomsRestriction' element value. Установленные таможенными органами ограничения по использованию и распоряжению транспортными средствами, ввозимыми на территорию Российской Федерации 
     * 
     * @return value
     */
    public String getCustomsRestriction() {
        return customsRestriction;
    }

    /** 
     * Set the 'CustomsRestriction' element value. Установленные таможенными органами ограничения по использованию и распоряжению транспортными средствами, ввозимыми на территорию Российской Федерации 
     * 
     * @param customsRestriction
     */
    public void setCustomsRestriction(String customsRestriction) {
        this.customsRestriction = customsRestriction;
    }

    /** 
     * Get the 'PTSSerialNumber' element value. Серия и номер Паспорта транспортного средства
     * 
     * @return value
     */
    public ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType getPTSSerialNumber() {
        return PTSSerialNumber;
    }

    /** 
     * Set the 'PTSSerialNumber' element value. Серия и номер Паспорта транспортного средства
     * 
     * @param PTSSerialNumber
     */
    public void setPTSSerialNumber(
            ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType PTSSerialNumber) {
        this.PTSSerialNumber = PTSSerialNumber;
    }

    /** 
     * Get the 'Manufacturer' element value. Юридический адрес организации (изготовителя, таможни или подразделения Госавтоинспекции), выдавшей паспорт
     * 
     * @return value
     */
    public TransportManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Юридический адрес организации (изготовителя, таможни или подразделения Госавтоинспекции), выдавшей паспорт
     * 
     * @param manufacturer
     */
    public void setManufacturer(TransportManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'PTSData' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public PTSDataType getPTSData() {
        return PTSData;
    }

    /** 
     * Set the 'PTSData' element value. Сведения о транспортном средстве
     * 
     * @param PTSData
     */
    public void setPTSData(PTSDataType PTSData) {
        this.PTSData = PTSData;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if ImportCertification is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifImportCertification() {
        return choiceSelect == IMPORT_CERTIFICATION_CHOICE;
    }

    /** 
     * Get the 'ImportCertification' element value. Документ по которому проведено обращение ТС в федеральную собственность.
     * 
     * @return value
     */
    public FederalDocType getImportCertification() {
        return importCertification;
    }

    /** 
     * Set the 'ImportCertification' element value. Документ по которому проведено обращение ТС в федеральную собственность.
     * 
     * @param importCertification
     */
    public void setImportCertification(FederalDocType importCertification) {
        setChoiceSelect(IMPORT_CERTIFICATION_CHOICE);
        this.importCertification = importCertification;
    }

    /** 
     * Check if CustomsProfitOrder is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCustomsProfitOrder() {
        return choiceSelect == CUSTOMS_PROFIT_ORDER_CHOICE;
    }

    /** 
     * Get the 'CustomsProfitOrder' element value. Номер таможенного приходного ордера (ТПО)
     * 
     * @return value
     */
    public CustomsProfitOrderType getCustomsProfitOrder() {
        return customsProfitOrder;
    }

    /** 
     * Set the 'CustomsProfitOrder' element value. Номер таможенного приходного ордера (ТПО)
     * 
     * @param customsProfitOrder
     */
    public void setCustomsProfitOrder(CustomsProfitOrderType customsProfitOrder) {
        setChoiceSelect(CUSTOMS_PROFIT_ORDER_CHOICE);
        this.customsProfitOrder = customsProfitOrder;
    }

    /** 
     * Check if GTDID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGTDID() {
        return choiceSelect == GTDID_CHOICE;
    }

    /** 
     * Get the 'GTDID' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        setChoiceSelect(GTDID_CHOICE);
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'OrganizationlegalAddress' element value. Адрес организации, выдавшей паспорт
     * 
     * @return value
     */
    public AddressType getOrganizationlegalAddress() {
        return organizationlegalAddress;
    }

    /** 
     * Set the 'OrganizationlegalAddress' element value. Адрес организации, выдавшей паспорт
     * 
     * @param organizationlegalAddress
     */
    public void setOrganizationlegalAddress(AddressType organizationlegalAddress) {
        this.organizationlegalAddress = organizationlegalAddress;
    }

    /** 
     * Get the 'TransportMeansOwner' element value. Сведения о собственнике транспортного средства (адрес, наименование организации или фамилия физического лица)
     * 
     * @return value
     */
    public TransportOwnerType getTransportMeansOwner() {
        return transportMeansOwner;
    }

    /** 
     * Set the 'TransportMeansOwner' element value. Сведения о собственнике транспортного средства (адрес, наименование организации или фамилия физического лица)
     * 
     * @param transportMeansOwner
     */
    public void setTransportMeansOwner(TransportOwnerType transportMeansOwner) {
        this.transportMeansOwner = transportMeansOwner;
    }

    /** 
     * Get the list of 'TSBargain' element items. Сведения о сделках с транспортным средством
     * 
     * @return list
     */
    public List<TSBargainType> getTSBargainList() {
        return TSBargainList;
    }

    /** 
     * Set the list of 'TSBargain' element items. Сведения о сделках с транспортным средством
     * 
     * @param list
     */
    public void setTSBargainList(List<TSBargainType> list) {
        TSBargainList = list;
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
