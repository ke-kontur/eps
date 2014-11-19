
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ����
 */
public class ParticipantType extends CUOrganizationType
{
    private String orgSign;
    private String personPost;
    private String originCountryCode;
    private String originCountryName;
    private LocalDate regDate;
    private String regNum;
    private String branchDescription;
    private RecordDataType recordData;
    private AddressType foreignAddress;
    private List<DisqualificationType> disqualificationList = new ArrayList<DisqualificationType>();
    private ReferenceInfoType authorizedPerson;
    private RegOrganType regOrgan;

    /** 
     * Get the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ���������� ��. ����; 3 - ����������� ��. ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ���������� ��. ����; 3 - ����������� ��. ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'PersonPost' element value. ���������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ �������������
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ �������������
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. ������������ ������ �������������
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������������ ������ �������������
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'RegDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� �����������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. ��������������� �����
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ��������������� �����
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'BranchDescription' element value. ������ ������������ ����������������� ��� ������� � ��
     * 
     * @return value
     */
    public String getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. ������ ������������ ����������������� ��� ������� � ��
     * 
     * @param branchDescription
     */
    public void setBranchDescription(String branchDescription) {
        this.branchDescription = branchDescription;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }

    /** 
     * Get the 'ForeignAddress' element value. ����� ����� ���������� (����� ����������) �� ��������� ���������� ��
     * 
     * @return value
     */
    public AddressType getForeignAddress() {
        return foreignAddress;
    }

    /** 
     * Set the 'ForeignAddress' element value. ����� ����� ���������� (����� ����������) �� ��������� ���������� ��
     * 
     * @param foreignAddress
     */
    public void setForeignAddress(AddressType foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    /** 
     * Get the list of 'Disqualification' element items. �������� � ���������������
     * 
     * @return list
     */
    public List<DisqualificationType> getDisqualificationList() {
        return disqualificationList;
    }

    /** 
     * Set the list of 'Disqualification' element items. �������� � ���������������
     * 
     * @param list
     */
    public void setDisqualificationList(List<DisqualificationType> list) {
        disqualificationList = list;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. ��� ������������ ����
     * 
     * @return value
     */
    public ReferenceInfoType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. ��� ������������ ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(ReferenceInfoType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'RegOrgan' element value. �������� � �������������� ������
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. �������� � �������������� ������
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}
