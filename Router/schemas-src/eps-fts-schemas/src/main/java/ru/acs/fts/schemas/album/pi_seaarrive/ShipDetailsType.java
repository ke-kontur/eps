
package ru.acs.fts.schemas.album.pi_seaarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ��������� � �������������� �����
 */
public class ShipDetailsType
{
    private String shipIMONumber;
    private String shipName;
    private String capitainSurname;
    private String shipCountryCode;
    private LocalDate shipRegDate;
    private String shipRegNum;
    private String shipRegPort;
    private String flag;
    private String berth;
    private String grossTonnage;
    private String netTonnage;
    private String shipOwnerName;
    private String shipType;
    private CountryPortInfoType arrivalPlace;
    private CountryPortInfoType depaturePlace;
    private OrganizationType shipAgent;

    /** 
     * Get the 'ShipIMONumber' element value. ��� ����� �����
     * 
     * @return value
     */
    public String getShipIMONumber() {
        return shipIMONumber;
    }

    /** 
     * Set the 'ShipIMONumber' element value. ��� ����� �����
     * 
     * @param shipIMONumber
     */
    public void setShipIMONumber(String shipIMONumber) {
        this.shipIMONumber = shipIMONumber;
    }

    /** 
     * Get the 'ShipName' element value. ������������ �����
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. ������������ �����
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'CapitainSurname' element value. ������� �������� �����
     * 
     * @return value
     */
    public String getCapitainSurname() {
        return capitainSurname;
    }

    /** 
     * Set the 'CapitainSurname' element value. ������� �������� �����
     * 
     * @param capitainSurname
     */
    public void setCapitainSurname(String capitainSurname) {
        this.capitainSurname = capitainSurname;
    }

    /** 
     * Get the 'ShipCountryCode' element value. ��� ������ �������������� �����
     * 
     * @return value
     */
    public String getShipCountryCode() {
        return shipCountryCode;
    }

    /** 
     * Set the 'ShipCountryCode' element value. ��� ������ �������������� �����
     * 
     * @param shipCountryCode
     */
    public void setShipCountryCode(String shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    /** 
     * Get the 'ShipRegDate' element value. ���� ����������� �����
     * 
     * @return value
     */
    public LocalDate getShipRegDate() {
        return shipRegDate;
    }

    /** 
     * Set the 'ShipRegDate' element value. ���� ����������� �����
     * 
     * @param shipRegDate
     */
    public void setShipRegDate(LocalDate shipRegDate) {
        this.shipRegDate = shipRegDate;
    }

    /** 
     * Get the 'ShipRegNum' element value. ����� ����������� �����
     * 
     * @return value
     */
    public String getShipRegNum() {
        return shipRegNum;
    }

    /** 
     * Set the 'ShipRegNum' element value. ����� ����������� �����
     * 
     * @param shipRegNum
     */
    public void setShipRegNum(String shipRegNum) {
        this.shipRegNum = shipRegNum;
    }

    /** 
     * Get the 'ShipRegPort' element value. ���� ����������� �����
     * 
     * @return value
     */
    public String getShipRegPort() {
        return shipRegPort;
    }

    /** 
     * Set the 'ShipRegPort' element value. ���� ����������� �����
     * 
     * @param shipRegPort
     */
    public void setShipRegPort(String shipRegPort) {
        this.shipRegPort = shipRegPort;
    }

    /** 
     * Get the 'Flag' element value. ���� �����
     * 
     * @return value
     */
    public String getFlag() {
        return flag;
    }

    /** 
     * Set the 'Flag' element value. ���� �����
     * 
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /** 
     * Get the 'Berth' element value. ����� ������� ����� � �����
     * 
     * @return value
     */
    public String getBerth() {
        return berth;
    }

    /** 
     * Set the 'Berth' element value. ����� ������� ����� � �����
     * 
     * @param berth
     */
    public void setBerth(String berth) {
        this.berth = berth;
    }

    /** 
     * Get the 'GrossTonnage' element value. ������� �����������(������)
     * 
     * @return value
     */
    public String getGrossTonnage() {
        return grossTonnage;
    }

    /** 
     * Set the 'GrossTonnage' element value. ������� �����������(������)
     * 
     * @param grossTonnage
     */
    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }

    /** 
     * Get the 'NetTonnage' element value. ������ �����������(������)
     * 
     * @return value
     */
    public String getNetTonnage() {
        return netTonnage;
    }

    /** 
     * Set the 'NetTonnage' element value. ������ �����������(������)
     * 
     * @param netTonnage
     */
    public void setNetTonnage(String netTonnage) {
        this.netTonnage = netTonnage;
    }

    /** 
     * Get the 'ShipOwnerName' element value. ������������ �������������
     * 
     * @return value
     */
    public String getShipOwnerName() {
        return shipOwnerName;
    }

    /** 
     * Set the 'ShipOwnerName' element value. ������������ �������������
     * 
     * @param shipOwnerName
     */
    public void setShipOwnerName(String shipOwnerName) {
        this.shipOwnerName = shipOwnerName;
    }

    /** 
     * Get the 'ShipType' element value. ��� �����
     * 
     * @return value
     */
    public String getShipType() {
        return shipType;
    }

    /** 
     * Set the 'ShipType' element value. ��� �����
     * 
     * @param shipType
     */
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    /** 
     * Get the 'ArrivalPlace' element value. ���� � ������ ��������
     * 
     * @return value
     */
    public CountryPortInfoType getArrivalPlace() {
        return arrivalPlace;
    }

    /** 
     * Set the 'ArrivalPlace' element value. ���� � ������ ��������
     * 
     * @param arrivalPlace
     */
    public void setArrivalPlace(CountryPortInfoType arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    /** 
     * Get the 'DepaturePlace' element value. ���� � ������ �����������
     * 
     * @return value
     */
    public CountryPortInfoType getDepaturePlace() {
        return depaturePlace;
    }

    /** 
     * Set the 'DepaturePlace' element value. ���� � ������ �����������
     * 
     * @param depaturePlace
     */
    public void setDepaturePlace(CountryPortInfoType depaturePlace) {
        this.depaturePlace = depaturePlace;
    }

    /** 
     * Get the 'ShipAgent' element value. �������� � ������� ������
     * 
     * @return value
     */
    public OrganizationType getShipAgent() {
        return shipAgent;
    }

    /** 
     * Set the 'ShipAgent' element value. �������� � ������� ������
     * 
     * @param shipAgent
     */
    public void setShipAgent(OrganizationType shipAgent) {
        this.shipAgent = shipAgent;
    }
}
