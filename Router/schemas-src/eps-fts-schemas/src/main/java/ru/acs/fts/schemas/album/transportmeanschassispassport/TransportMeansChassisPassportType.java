
package ru.acs.fts.schemas.album.transportmeanschassispassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportManufacturerType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * Паспорт шасси транспортного средства
 */
public class TransportMeansChassisPassportType extends BaseDocType
{
    private LocalDate issueDate;
    private String organizationName;
    private String countryCode;
    private String customsRestriction;
    private String specialMark;
    private int choiceSelect = -1;
    private static final int IMPORT_CERTIFICATION_CHOICE = 0;
    private static final int CUSTOMS_PROFIT_ORDER_CHOICE = 1;
    private static final int GTDID_CHOICE = 2;
    private FederalDocType importCertification;
    private CustomsProfitOrderType customsProfitOrder;
    private GTDIDType GTDID;
    private TransportManufacturerType manufacturer;
    private PShTSDataType PShTSData;
    private TransportOwnerType transportMeansChassisOwner;
    private AddressType organizationLegalAddress;
    private TransportMeansPassportType PShTSSerialNumber;
    private PersonBaseType personSign;
    private List<ChassicBargainType> chassicBargainList = new ArrayList<ChassicBargainType>();
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
     * Get the 'CountryCode' element value. Код страны ввоза/вывоза шасси ТС
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны ввоза/вывоза шасси ТС
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CustomsRestriction' element value. Установленные таможенными органами ограничения по использованию и распоряжению шасси транспортных средств, ввозимыми на территорию Российской Федерации 
     * 
     * @return value
     */
    public String getCustomsRestriction() {
        return customsRestriction;
    }

    /** 
     * Set the 'CustomsRestriction' element value. Установленные таможенными органами ограничения по использованию и распоряжению шасси транспортных средств, ввозимыми на территорию Российской Федерации 
     * 
     * @param customsRestriction
     */
    public void setCustomsRestriction(String customsRestriction) {
        this.customsRestriction = customsRestriction;
    }

    /** 
     * Get the 'SpecialMark' element value. Особые отметки
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. Особые отметки
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
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
     * Get the 'ImportCertification' element value. Документ по которому проведено обращение ТС в федеральную  собственность.
     * 
     * @return value
     */
    public FederalDocType getImportCertification() {
        return importCertification;
    }

    /** 
     * Set the 'ImportCertification' element value. Документ по которому проведено обращение ТС в федеральную  собственность.
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
     * Get the 'Manufacturer' element value. Сведения об организации - изготовителя шасси транспортного средства
     * 
     * @return value
     */
    public TransportManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Сведения об организации - изготовителя шасси транспортного средства
     * 
     * @param manufacturer
     */
    public void setManufacturer(TransportManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'PShTSData' element value. Сведения о шасси транспортного средства
     * 
     * @return value
     */
    public PShTSDataType getPShTSData() {
        return PShTSData;
    }

    /** 
     * Set the 'PShTSData' element value. Сведения о шасси транспортного средства
     * 
     * @param PShTSData
     */
    public void setPShTSData(PShTSDataType PShTSData) {
        this.PShTSData = PShTSData;
    }

    /** 
     * Get the 'TransportMeansChassisOwner' element value. Сведения о собственнике шасси транспортного средства (адрес, наименование организации или фамилия физического лица)
     * 
     * @return value
     */
    public TransportOwnerType getTransportMeansChassisOwner() {
        return transportMeansChassisOwner;
    }

    /** 
     * Set the 'TransportMeansChassisOwner' element value. Сведения о собственнике шасси транспортного средства (адрес, наименование организации или фамилия физического лица)
     * 
     * @param transportMeansChassisOwner
     */
    public void setTransportMeansChassisOwner(
            TransportOwnerType transportMeansChassisOwner) {
        this.transportMeansChassisOwner = transportMeansChassisOwner;
    }

    /** 
     * Get the 'OrganizationLegalAddress' element value. Юридический адрес организации (изготовителя, таможни или подразделения Госавтоинспекции), выдавшей паспорт
     * 
     * @return value
     */
    public AddressType getOrganizationLegalAddress() {
        return organizationLegalAddress;
    }

    /** 
     * Set the 'OrganizationLegalAddress' element value. Юридический адрес организации (изготовителя, таможни или подразделения Госавтоинспекции), выдавшей паспорт
     * 
     * @param organizationLegalAddress
     */
    public void setOrganizationLegalAddress(AddressType organizationLegalAddress) {
        this.organizationLegalAddress = organizationLegalAddress;
    }

    /** 
     * Get the 'PShTSSerialNumber' element value. Серия и номер Паспорта шасси транспортного средства
     * 
     * @return value
     */
    public TransportMeansPassportType getPShTSSerialNumber() {
        return PShTSSerialNumber;
    }

    /** 
     * Set the 'PShTSSerialNumber' element value. Серия и номер Паспорта шасси транспортного средства
     * 
     * @param PShTSSerialNumber
     */
    public void setPShTSSerialNumber(
            TransportMeansPassportType PShTSSerialNumber) {
        this.PShTSSerialNumber = PShTSSerialNumber;
    }

    /** 
     * Get the 'PersonSign' element value. Подпись лица, выдавшего паспорт
     * 
     * @return value
     */
    public PersonBaseType getPersonSign() {
        return personSign;
    }

    /** 
     * Set the 'PersonSign' element value. Подпись лица, выдавшего паспорт
     * 
     * @param personSign
     */
    public void setPersonSign(PersonBaseType personSign) {
        this.personSign = personSign;
    }

    /** 
     * Get the list of 'ChassicBargain' element items. Сведения о сделках  с шасси  ТС
     * 
     * @return list
     */
    public List<ChassicBargainType> getChassicBargainList() {
        return chassicBargainList;
    }

    /** 
     * Set the list of 'ChassicBargain' element items. Сведения о сделках  с шасси  ТС
     * 
     * @param list
     */
    public void setChassicBargainList(List<ChassicBargainType> list) {
        chassicBargainList = list;
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
