
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� ��������������� ��������
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
     * Get the 'AccountCode' element value. ����� �������� ������
     * 
     * @return value
     */
    public String getAccountCode() {
        return accountCode;
    }

    /** 
     * Set the 'AccountCode' element value. ����� �������� ������
     * 
     * @param accountCode
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /** 
     * Get the 'StartDateTime' element value. ����/����� ������ ��������������� ��������
     * 
     * @return value
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /** 
     * Set the 'StartDateTime' element value. ����/����� ������ ��������������� ��������
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /** 
     * Get the 'NumberUNO' element value. �����/��� �������� ����� �� ���
     * 
     * @return value
     */
    public String getNumberUNO() {
        return numberUNO;
    }

    /** 
     * Set the 'NumberUNO' element value. �����/��� �������� ����� �� ���
     * 
     * @param numberUNO
     */
    public void setNumberUNO(String numberUNO) {
        this.numberUNO = numberUNO;
    }

    /** 
     * Get the 'MassTSFull' element value. ������ ����� �� / ������� ��, ����
     * 
     * @return value
     */
    public String getMassTSFull() {
        return massTSFull;
    }

    /** 
     * Set the 'MassTSFull' element value. ������ ����� �� / ������� ��, ����
     * 
     * @param massTSFull
     */
    public void setMassTSFull(String massTSFull) {
        this.massTSFull = massTSFull;
    }

    /** 
     * Get the 'IsRoadPayment' element value. ���������������� (������ 3.5 ���� - 1, ������ 3.5 ���� - 0)
     * 
     * @return value
     */
    public String getIsRoadPayment() {
        return isRoadPayment;
    }

    /** 
     * Set the 'IsRoadPayment' element value. ���������������� (������ 3.5 ���� - 1, ������ 3.5 ���� - 0)
     * 
     * @param isRoadPayment
     */
    public void setIsRoadPayment(String isRoadPayment) {
        this.isRoadPayment = isRoadPayment;
    }

    /** 
     * Get the 'DangerClass' element value. ����� �������� �����
     * 
     * @return value
     */
    public String getDangerClass() {
        return dangerClass;
    }

    /** 
     * Set the 'DangerClass' element value. ����� �������� �����
     * 
     * @param dangerClass
     */
    public void setDangerClass(String dangerClass) {
        this.dangerClass = dangerClass;
    }

    /** 
     * Get the 'IsRoadPayed' element value. ������� ������� ������ ��������� �����
     * 
     * @return value
     */
    public String getIsRoadPayed() {
        return isRoadPayed;
    }

    /** 
     * Set the 'IsRoadPayed' element value. ������� ������� ������ ��������� �����
     * 
     * @param isRoadPayed
     */
    public void setIsRoadPayed(String isRoadPayed) {
        this.isRoadPayed = isRoadPayed;
    }

    /** 
     * Get the 'DocumentalEmployee' element value. ���������, ����������� ���������������� ��������
     * 
     * @return value
     */
    public CustomsPersonType getDocumentalEmployee() {
        return documentalEmployee;
    }

    /** 
     * Set the 'DocumentalEmployee' element value. ���������, ����������� ���������������� ��������
     * 
     * @param documentalEmployee
     */
    public void setDocumentalEmployee(CustomsPersonType documentalEmployee) {
        this.documentalEmployee = documentalEmployee;
    }

    /** 
     * Get the 'FirstDriver' element value. ��������
     * 
     * @return value
     */
    public PersonBaseType getFirstDriver() {
        return firstDriver;
    }

    /** 
     * Set the 'FirstDriver' element value. ��������
     * 
     * @param firstDriver
     */
    public void setFirstDriver(PersonBaseType firstDriver) {
        this.firstDriver = firstDriver;
    }

    /** 
     * Get the list of 'Requirement' element items. �������� � ������������/���������� ����������/�������
     * 
     * @return list
     */
    public List<CheckViolationType> getRequirementList() {
        return requirementList;
    }

    /** 
     * Set the list of 'Requirement' element items. �������� � ������������/���������� ����������/�������
     * 
     * @param list
     */
    public void setRequirementList(List<CheckViolationType> list) {
        requirementList = list;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'PassTG' element value. ������� ���������� �� ��������� ��
     * 
     * @return value
     */
    public UsingPassType getPassTG() {
        return passTG;
    }

    /** 
     * Set the 'PassTG' element value. ������� ���������� �� ��������� ��
     * 
     * @param passTG
     */
    public void setPassTG(UsingPassType passTG) {
        this.passTG = passTG;
    }

    /** 
     * Get the 'PassKG' element value. ������� ���������� �� ��������� ��
     * 
     * @return value
     */
    public UsingPassType getPassKG() {
        return passKG;
    }

    /** 
     * Set the 'PassKG' element value. ������� ���������� �� ��������� ��
     * 
     * @param passKG
     */
    public void setPassKG(UsingPassType passKG) {
        this.passKG = passKG;
    }

    /** 
     * Get the 'PassOG' element value. ������� ���������� �� ��������� ��
     * 
     * @return value
     */
    public UsingPassType getPassOG() {
        return passOG;
    }

    /** 
     * Set the 'PassOG' element value. ������� ���������� �� ��������� ��
     * 
     * @param passOG
     */
    public void setPassOG(UsingPassType passOG) {
        this.passOG = passOG;
    }

    /** 
     * Get the 'PassSPS' element value. ������� ���������� �� ��������� ���
     * 
     * @return value
     */
    public UsingPassType getPassSPS() {
        return passSPS;
    }

    /** 
     * Set the 'PassSPS' element value. ������� ���������� �� ��������� ���
     * 
     * @param passSPS
     */
    public void setPassSPS(UsingPassType passSPS) {
        this.passSPS = passSPS;
    }

    /** 
     * Get the 'PassCard' element value. �������� �������
     * 
     * @return value
     */
    public LicenceCardType getPassCard() {
        return passCard;
    }

    /** 
     * Set the 'PassCard' element value. �������� �������
     * 
     * @param passCard
     */
    public void setPassCard(LicenceCardType passCard) {
        this.passCard = passCard;
    }

    /** 
     * Get the 'LicenceCard' element value. ������������ ��������
     * 
     * @return value
     */
    public LicenceCardType getLicenceCard() {
        return licenceCard;
    }

    /** 
     * Set the 'LicenceCard' element value. ������������ ��������
     * 
     * @param licenceCard
     */
    public void setLicenceCard(LicenceCardType licenceCard) {
        this.licenceCard = licenceCard;
    }

    /** 
     * Get the 'TransitPermit' element value. ������������� ���������� �� �������
     * 
     * @return value
     */
    public UsingPassType getTransitPermit() {
        return transitPermit;
    }

    /** 
     * Set the 'TransitPermit' element value. ������������� ���������� �� �������
     * 
     * @param transitPermit
     */
    public void setTransitPermit(UsingPassType transitPermit) {
        this.transitPermit = transitPermit;
    }

    /** 
     * Get the 'DispatchLocation' element value. ����� �����������
     * 
     * @return value
     */
    public CountryRegionType getDispatchLocation() {
        return dispatchLocation;
    }

    /** 
     * Set the 'DispatchLocation' element value. ����� �����������
     * 
     * @param dispatchLocation
     */
    public void setDispatchLocation(CountryRegionType dispatchLocation) {
        this.dispatchLocation = dispatchLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. ����� ����������
     * 
     * @return value
     */
    public CountryRegionType getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. ����� ����������
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(CountryRegionType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'TahogData' element value. ������ ��������� ���������
     * 
     * @return value
     */
    public TahogDataType getTahogData() {
        return tahogData;
    }

    /** 
     * Set the 'TahogData' element value. ������ ��������� ���������
     * 
     * @param tahogData
     */
    public void setTahogData(TahogDataType tahogData) {
        this.tahogData = tahogData;
    }
}
