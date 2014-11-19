
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� ���������� ������������ ����
 */
public class FounderType extends CUOrganizationType
{
    private String orgSign;
    private String originCountryCode;
    private String originCountryName;
    private LocalDate regDate;
    private String regNum;
    private LocalDate inheritanceOpenDate;
    private String founderKindCode;
    private String RFSubjectCode;
    private String RFSubjectName;
    private ShareType share;
    private RecordDataType recordData;
    private RegOrganType regOrgan;
    private AddressType foreignAddress;
    private List<ParticipantType> shareManagerList = new ArrayList<ParticipantType>();

    /** 
     * Get the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ���������� ��. ����; 3 - ����� ��������������� ������ ��� ����� �������� ��������������; 4 - ����������� ��. ����; 5 - ������ �������������� ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ���������� ��. ����; 3 - ����� ��������������� ������ ��� ����� �������� ��������������; 4 - ����������� ��. ����; 5 - ������ �������������� ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
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
     * Get the 'InheritanceOpenDate' element value. ���� �������� ���������� (���� ������ ���������)
     * 
     * @return value
     */
    public LocalDate getInheritanceOpenDate() {
        return inheritanceOpenDate;
    }

    /** 
     * Set the 'InheritanceOpenDate' element value. ���� �������� ���������� (���� ������ ���������)
     * 
     * @param inheritanceOpenDate
     */
    public void setInheritanceOpenDate(LocalDate inheritanceOpenDate) {
        this.inheritanceOpenDate = inheritanceOpenDate;
    }

    /** 
     * Get the 'FounderKindCode' element value. ��� ���� ����������: 1 - ���� ����������� ��; 2 - ���� ����������� �������� ��; 3 - ���� ����������� �������������� �����������
     * 
     * @return value
     */
    public String getFounderKindCode() {
        return founderKindCode;
    }

    /** 
     * Set the 'FounderKindCode' element value. ��� ���� ����������: 1 - ���� ����������� ��; 2 - ���� ����������� �������� ��; 3 - ���� ����������� �������������� �����������
     * 
     * @param founderKindCode
     */
    public void setFounderKindCode(String founderKindCode) {
        this.founderKindCode = founderKindCode;
    }

    /** 
     * Get the 'RFSubjectCode' element value. ��� �������� ���������� ��������� �������� ����������� ���� ��� �� ���������� �������� ��������� ������������� �����������, �������� ����������� ����
     * 
     * @return value
     */
    public String getRFSubjectCode() {
        return RFSubjectCode;
    }

    /** 
     * Set the 'RFSubjectCode' element value. ��� �������� ���������� ��������� �������� ����������� ���� ��� �� ���������� �������� ��������� ������������� �����������, �������� ����������� ����
     * 
     * @param RFSubjectCode
     */
    public void setRFSubjectCode(String RFSubjectCode) {
        this.RFSubjectCode = RFSubjectCode;
    }

    /** 
     * Get the 'RFSubjectName' element value. ������������ �������� ���������� ��������� / ������������ �������������� �����������
     * 
     * @return value
     */
    public String getRFSubjectName() {
        return RFSubjectName;
    }

    /** 
     * Set the 'RFSubjectName' element value. ������������ �������� ���������� ��������� / ������������ �������������� �����������
     * 
     * @param RFSubjectName
     */
    public void setRFSubjectName(String RFSubjectName) {
        this.RFSubjectName = RFSubjectName;
    }

    /** 
     * Get the 'Share' element value. ���� � �������� ��������
     * 
     * @return value
     */
    public ShareType getShare() {
        return share;
    }

    /** 
     * Set the 'Share' element value. ���� � �������� ��������
     * 
     * @param share
     */
    public void setShare(ShareType share) {
        this.share = share;
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
     * Get the list of 'ShareManager' element items. �������� � ����, �������������� ���������� �����, ����������� � ������� ������������ / �������� �� ����������� ��������, �������������� ������������� ����������
     * 
     * @return list
     */
    public List<ParticipantType> getShareManagerList() {
        return shareManagerList;
    }

    /** 
     * Set the list of 'ShareManager' element items. �������� � ����, �������������� ���������� �����, ����������� � ������� ������������ / �������� �� ����������� ��������, �������������� ������������� ����������
     * 
     * @param list
     */
    public void setShareManagerList(List<ParticipantType> list) {
        shareManagerList = list;
    }
}
