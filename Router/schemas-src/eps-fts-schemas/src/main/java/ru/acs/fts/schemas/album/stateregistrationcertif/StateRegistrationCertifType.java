
package ru.acs.fts.schemas.album.stateregistrationcertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������� � ��������������� �����������
 */
public class StateRegistrationCertifType extends BaseDocType
{
    private String BDRDID;
    private String autorizedAgency;
    private String agencyHead;
    private String territorialUnit;
    private String blankSeries;
    private String blankTypographNum;
    private String certificateNumber;
    private LocalDate certDate;
    private String certStatus;
    private String blankTypeID;
    private GoodsType goods;
    private ManufacturerType manufacturerInf;
    private CUOrganizationType goodsRecipient;
    private List<OrganizationBaseType> testingOrgList = new ArrayList<OrganizationBaseType>();
    private PersonBaseType autorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'AutorizedAgency' element value. ������������ ��������������� ������ �������
     * 
     * @return value
     */
    public String getAutorizedAgency() {
        return autorizedAgency;
    }

    /** 
     * Set the 'AutorizedAgency' element value. ������������ ��������������� ������ �������
     * 
     * @param autorizedAgency
     */
    public void setAutorizedAgency(String autorizedAgency) {
        this.autorizedAgency = autorizedAgency;
    }

    /** 
     * Get the 'AgencyHead' element value. ������������ ��������������� ������
     * 
     * @return value
     */
    public String getAgencyHead() {
        return agencyHead;
    }

    /** 
     * Set the 'AgencyHead' element value. ������������ ��������������� ������
     * 
     * @param agencyHead
     */
    public void setAgencyHead(String agencyHead) {
        this.agencyHead = agencyHead;
    }

    /** 
     * Get the 'TerritorialUnit' element value. ������������ ���������������-��������������� �������
     * 
     * @return value
     */
    public String getTerritorialUnit() {
        return territorialUnit;
    }

    /** 
     * Set the 'TerritorialUnit' element value. ������������ ���������������-��������������� �������
     * 
     * @param territorialUnit
     */
    public void setTerritorialUnit(String territorialUnit) {
        this.territorialUnit = territorialUnit;
    }

    /** 
     * Get the 'BlankSeries' element value. ����� ������
     * 
     * @return value
     */
    public String getBlankSeries() {
        return blankSeries;
    }

    /** 
     * Set the 'BlankSeries' element value. ����� ������
     * 
     * @param blankSeries
     */
    public void setBlankSeries(String blankSeries) {
        this.blankSeries = blankSeries;
    }

    /** 
     * Get the 'BlankTypographNum' element value. ������������ ����� ������ (��� ���������� �����)
     * 
     * @return value
     */
    public String getBlankTypographNum() {
        return blankTypographNum;
    }

    /** 
     * Set the 'BlankTypographNum' element value. ������������ ����� ������ (��� ���������� �����)
     * 
     * @param blankTypographNum
     */
    public void setBlankTypographNum(String blankTypographNum) {
        this.blankTypographNum = blankTypographNum;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������������� �����������
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������������� �����������
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertDate' element value. ���� ������ �������������
     * 
     * @return value
     */
    public LocalDate getCertDate() {
        return certDate;
    }

    /** 
     * Set the 'CertDate' element value. ���� ������ �������������
     * 
     * @param certDate
     */
    public void setCertDate(LocalDate certDate) {
        this.certDate = certDate;
    }

    /** 
     * Get the 'CertStatus' element value. ������ ���������: 1 - �������� � ���������; 2 - �������������; 3 - ����������� / �������; 4 - ������ ��-�� ����������� ������ ��� ����������; 5 - ������ � ����� � ���������������
     * 
     * @return value
     */
    public String getCertStatus() {
        return certStatus;
    }

    /** 
     * Set the 'CertStatus' element value. ������ ���������: 1 - �������� � ���������; 2 - �������������; 3 - ����������� / �������; 4 - ������ ��-�� ����������� ������ ��� ����������; 5 - ������ � ����� � ���������������
     * 
     * @param certStatus
     */
    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    /** 
     * Get the 'BlankTypeID' element value. ������������� ���� ������
     * 
     * @return value
     */
    public String getBlankTypeID() {
        return blankTypeID;
    }

    /** 
     * Set the 'BlankTypeID' element value. ������������� ���� ������
     * 
     * @param blankTypeID
     */
    public void setBlankTypeID(String blankTypeID) {
        this.blankTypeID = blankTypeID;
    }

    /** 
     * Get the 'Goods' element value. �������� �  ���������
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. �������� �  ���������
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'ManufacturerInf' element value. ���������� �� ������������/�������������� ���������������
     * 
     * @return value
     */
    public ManufacturerType getManufacturerInf() {
        return manufacturerInf;
    }

    /** 
     * Set the 'ManufacturerInf' element value. ���������� �� ������������/�������������� ���������������
     * 
     * @param manufacturerInf
     */
    public void setManufacturerInf(ManufacturerType manufacturerInf) {
        this.manufacturerInf = manufacturerInf;
    }

    /** 
     * Get the 'GoodsRecipient' element value. ���������� � ���������� �������
     * 
     * @return value
     */
    public CUOrganizationType getGoodsRecipient() {
        return goodsRecipient;
    }

    /** 
     * Set the 'GoodsRecipient' element value. ���������� � ���������� �������
     * 
     * @param goodsRecipient
     */
    public void setGoodsRecipient(CUOrganizationType goodsRecipient) {
        this.goodsRecipient = goodsRecipient;
    }

    /** 
     * Get the list of 'TestingOrg' element items. �������� �� �����������, ����������� ������������ ���������
     * 
     * @return list
     */
    public List<OrganizationBaseType> getTestingOrgList() {
        return testingOrgList;
    }

    /** 
     * Set the list of 'TestingOrg' element items. �������� �� �����������, ����������� ������������ ���������
     * 
     * @param list
     */
    public void setTestingOrgList(List<OrganizationBaseType> list) {
        testingOrgList = list;
    }

    /** 
     * Get the 'AutorizedPerson' element value. ����, �������� �������������
     * 
     * @return value
     */
    public PersonBaseType getAutorizedPerson() {
        return autorizedPerson;
    }

    /** 
     * Set the 'AutorizedPerson' element value. ����, �������� �������������
     * 
     * @param autorizedPerson
     */
    public void setAutorizedPerson(PersonBaseType autorizedPerson) {
        this.autorizedPerson = autorizedPerson;
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
