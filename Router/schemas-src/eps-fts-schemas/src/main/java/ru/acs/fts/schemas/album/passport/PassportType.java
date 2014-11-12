
package ru.acs.fts.schemas.album.passport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� ���������� ��
 */
public class PassportType extends BaseDocType
{
    private String cardSeries;
    private String cardNumber;
    private String organizationName;
    private LocalDate cardDate;
    private String orgCode;
    private PersonInfoType personInfo;
    private AddressType residencePlace;
    private String documentModeID;

    /** 
     * Get the 'CardSeries' element value. ����� ��������
     * 
     * @return value
     */
    public String getCardSeries() {
        return cardSeries;
    }

    /** 
     * Set the 'CardSeries' element value. ����� ��������
     * 
     * @param cardSeries
     */
    public void setCardSeries(String cardSeries) {
        this.cardSeries = cardSeries;
    }

    /** 
     * Get the 'CardNumber' element value. ����� ��������
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ����� ��������
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������, �������� �������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������, �������� �������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CardDate' element value. ���� ������ ��������
     * 
     * @return value
     */
    public LocalDate getCardDate() {
        return cardDate;
    }

    /** 
     * Set the 'CardDate' element value. ���� ������ ��������
     * 
     * @param cardDate
     */
    public void setCardDate(LocalDate cardDate) {
        this.cardDate = cardDate;
    }

    /** 
     * Get the 'OrgCode' element value. ��� ������������� �����������, �������� �������
     * 
     * @return value
     */
    public String getOrgCode() {
        return orgCode;
    }

    /** 
     * Set the 'OrgCode' element value. ��� ������������� �����������, �������� �������
     * 
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /** 
     * Get the 'PersonInfo' element value. �������� � ���. ����
     * 
     * @return value
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /** 
     * Set the 'PersonInfo' element value. �������� � ���. ����
     * 
     * @param personInfo
     */
    public void setPersonInfo(PersonInfoType personInfo) {
        this.personInfo = personInfo;
    }

    /** 
     * Get the 'ResidencePlace' element value. ����� ����������
     * 
     * @return value
     */
    public AddressType getResidencePlace() {
        return residencePlace;
    }

    /** 
     * Set the 'ResidencePlace' element value. ����� ����������
     * 
     * @param residencePlace
     */
    public void setResidencePlace(AddressType residencePlace) {
        this.residencePlace = residencePlace;
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
