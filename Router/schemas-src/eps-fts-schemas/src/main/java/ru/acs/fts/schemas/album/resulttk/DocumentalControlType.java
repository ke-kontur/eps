
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения из документального контроля
 */
public class DocumentalControlType
{
    private String accountCode;
    private String startDateTime;
    private String numberUNO;
    private String massTSFull;
    private String isRoadPayment;
    private String dangerClass;
    private String isRoadPayed;
    private CustomsPersonType documentalEmployee;
    private PersonBaseType firstDriver;
    private List<CheckViolationType> requirementList = new ArrayList<CheckViolationType>();
    private CUOrganizationType carrier;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private UsingPassType passTG;
    private UsingPassType passKG;
    private UsingPassType passOG;
    private UsingPassType passSPS;
    private LicenceCardType passCard;
    private LicenceCardType licenceCard;
    private UsingPassType transitPermit;
    private CountryRegionType dispatchLocation;
    private CountryRegionType destinationLocation;
    private TahogDataType tahogData;

    /** 
     * Get the 'AccountCode' element value. Номер учетного талона
     * 
     * @return value
     */
    public String getAccountCode() {
        return accountCode;
    }

    /** 
     * Set the 'AccountCode' element value. Номер учетного талона
     * 
     * @param accountCode
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /** 
     * Get the 'StartDateTime' element value. Дата/время начала документального контроля
     * 
     * @return value
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Set the 'StartDateTime' element value. Дата/время начала документального контроля
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Get the 'NumberUNO' element value. Номер/код опасного груза по ООН
     * 
     * @return value
     */
    public String getNumberUNO() {
        return numberUNO;
    }

    /** 
     * Set the 'NumberUNO' element value. Номер/код опасного груза по ООН
     * 
     * @param numberUNO
     */
    public void setNumberUNO(String numberUNO) {
        this.numberUNO = numberUNO;
    }

    /** 
     * Get the 'MassTSFull' element value. Полная масса ТС / состава ТС, тонн
     * 
     * @return value
     */
    public String getMassTSFull() {
        return massTSFull;
    }

    /** 
     * Set the 'MassTSFull' element value. Полная масса ТС / состава ТС, тонн
     * 
     * @param massTSFull
     */
    public void setMassTSFull(String massTSFull) {
        this.massTSFull = massTSFull;
    }

    /** 
     * Get the 'IsRoadPayment' element value. Грузоподъемность (больше 3.5 тонн - 1, меньше 3.5 тонн - 0)
     * 
     * @return value
     */
    public String getIsRoadPayment() {
        return isRoadPayment;
    }

    /** 
     * Set the 'IsRoadPayment' element value. Грузоподъемность (больше 3.5 тонн - 1, меньше 3.5 тонн - 0)
     * 
     * @param isRoadPayment
     */
    public void setIsRoadPayment(String isRoadPayment) {
        this.isRoadPayment = isRoadPayment;
    }

    /** 
     * Get the 'DangerClass' element value. Класс опасного груза
     * 
     * @return value
     */
    public String getDangerClass() {
        return dangerClass;
    }

    /** 
     * Set the 'DangerClass' element value. Класс опасного груза
     * 
     * @param dangerClass
     */
    public void setDangerClass(String dangerClass) {
        this.dangerClass = dangerClass;
    }

    /** 
     * Get the 'IsRoadPayed' element value. Признак наличия оплаты дорожного сбора
     * 
     * @return value
     */
    public String getIsRoadPayed() {
        return isRoadPayed;
    }

    /** 
     * Set the 'IsRoadPayed' element value. Признак наличия оплаты дорожного сбора
     * 
     * @param isRoadPayed
     */
    public void setIsRoadPayed(String isRoadPayed) {
        this.isRoadPayed = isRoadPayed;
    }

    /** 
     * Get the 'DocumentalEmployee' element value. Инспектор, проводивший инструментальный контроль
     * 
     * @return value
     */
    public CustomsPersonType getDocumentalEmployee() {
        return documentalEmployee;
    }

    /** 
     * Set the 'DocumentalEmployee' element value. Инспектор, проводивший инструментальный контроль
     * 
     * @param documentalEmployee
     */
    public void setDocumentalEmployee(CustomsPersonType documentalEmployee) {
        this.documentalEmployee = documentalEmployee;
    }

    /** 
     * Get the 'FirstDriver' element value. Водитель
     * 
     * @return value
     */
    public PersonBaseType getFirstDriver() {
        return firstDriver;
    }

    /** 
     * Set the 'FirstDriver' element value. Водитель
     * 
     * @param firstDriver
     */
    public void setFirstDriver(PersonBaseType firstDriver) {
        this.firstDriver = firstDriver;
    }

    /** 
     * Get the list of 'Requirement' element items. Сведения о соответствии/выполнении требованию/условия
     * 
     * @return list
     */
    public List<CheckViolationType> getRequirementList() {
        return requirementList;
    }

    /** 
     * Set the list of 'Requirement' element items. Сведения о соответствии/выполнении требованию/условия
     * 
     * @param list
     */
    public void setRequirementList(List<CheckViolationType> list) {
        requirementList = list;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'PassTG' element value. Наличие разрешения на перевозку ТГ
     * 
     * @return value
     */
    public UsingPassType getPassTG() {
        return passTG;
    }

    /** 
     * Set the 'PassTG' element value. Наличие разрешения на перевозку ТГ
     * 
     * @param passTG
     */
    public void setPassTG(UsingPassType passTG) {
        this.passTG = passTG;
    }

    /** 
     * Get the 'PassKG' element value. Наличие разрешения на перевозку КГ
     * 
     * @return value
     */
    public UsingPassType getPassKG() {
        return passKG;
    }

    /** 
     * Set the 'PassKG' element value. Наличие разрешения на перевозку КГ
     * 
     * @param passKG
     */
    public void setPassKG(UsingPassType passKG) {
        this.passKG = passKG;
    }

    /** 
     * Get the 'PassOG' element value. Наличие разрешения на перевозку ОГ
     * 
     * @return value
     */
    public UsingPassType getPassOG() {
        return passOG;
    }

    /** 
     * Set the 'PassOG' element value. Наличие разрешения на перевозку ОГ
     * 
     * @param passOG
     */
    public void setPassOG(UsingPassType passOG) {
        this.passOG = passOG;
    }

    /** 
     * Get the 'PassSPS' element value. Наличие разрешения на перевозку СПС
     * 
     * @return value
     */
    public UsingPassType getPassSPS() {
        return passSPS;
    }

    /** 
     * Set the 'PassSPS' element value. Наличие разрешения на перевозку СПС
     * 
     * @param passSPS
     */
    public void setPassSPS(UsingPassType passSPS) {
        this.passSPS = passSPS;
    }

    /** 
     * Get the 'PassCard' element value. Карточка допуска
     * 
     * @return value
     */
    public LicenceCardType getPassCard() {
        return passCard;
    }

    /** 
     * Set the 'PassCard' element value. Карточка допуска
     * 
     * @param passCard
     */
    public void setPassCard(LicenceCardType passCard) {
        this.passCard = passCard;
    }

    /** 
     * Get the 'LicenceCard' element value. Лицензионная карточка
     * 
     * @return value
     */
    public LicenceCardType getLicenceCard() {
        return licenceCard;
    }

    /** 
     * Set the 'LicenceCard' element value. Лицензионная карточка
     * 
     * @param licenceCard
     */
    public void setLicenceCard(LicenceCardType licenceCard) {
        this.licenceCard = licenceCard;
    }

    /** 
     * Get the 'TransitPermit' element value. Использование разрешения на поездку
     * 
     * @return value
     */
    public UsingPassType getTransitPermit() {
        return transitPermit;
    }

    /** 
     * Set the 'TransitPermit' element value. Использование разрешения на поездку
     * 
     * @param transitPermit
     */
    public void setTransitPermit(UsingPassType transitPermit) {
        this.transitPermit = transitPermit;
    }

    /** 
     * Get the 'DispatchLocation' element value. Место отправления
     * 
     * @return value
     */
    public CountryRegionType getDispatchLocation() {
        return dispatchLocation;
    }

    /** 
     * Set the 'DispatchLocation' element value. Место отправления
     * 
     * @param dispatchLocation
     */
    public void setDispatchLocation(CountryRegionType dispatchLocation) {
        this.dispatchLocation = dispatchLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. Место назначения
     * 
     * @return value
     */
    public CountryRegionType getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. Место назначения
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(CountryRegionType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'TahogData' element value. Данные цифрового тахографа
     * 
     * @return value
     */
    public TahogDataType getTahogData() {
        return tahogData;
    }

    /** 
     * Set the 'TahogData' element value. Данные цифрового тахографа
     * 
     * @param tahogData
     */
    public void setTahogData(TahogDataType tahogData) {
        this.tahogData = tahogData;
    }
}
