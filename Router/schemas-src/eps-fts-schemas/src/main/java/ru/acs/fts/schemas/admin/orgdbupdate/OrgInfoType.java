
package ru.acs.fts.schemas.admin.orgdbupdate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** 
 * ����������  �� �����������
 */
public class OrgInfoType
{
    private String organizationID;
    private String orgName;
    private String orgMail;
    private String OGRN;
    private String INN;
    private String KPP;
    private String EMAIL;
    private String comments;
    private BigDecimal infBrokerFlag;
    private DateTime chDateTime;
    private List<PtpcInfoType> participantInfoList = new ArrayList<PtpcInfoType>();
    private List<PersonInfoType> personInfoList = new ArrayList<PersonInfoType>();
    private DocumentGroundConnectionType groundConnectionOrg;

    /** 
     * Get the 'OrganizationID' element value. �������������  �����������
     * 
     * @return value
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /** 
     * Set the 'OrganizationID' element value. �������������  �����������
     * 
     * @param organizationID
     */
    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    /** 
     * Get the 'OrgName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getOrgName() {
        return orgName;
    }

    /** 
     * Set the 'OrgName' element value. ������������ �����������
     * 
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /** 
     * Get the 'OrgMail' element value. ��������  �����  �����������
     * 
     * @return value
     */
    public String getOrgMail() {
        return orgMail;
    }

    /** 
     * Set the 'OrgMail' element value. ��������  �����  �����������
     * 
     * @param orgMail
     */
    public void setOrgMail(String orgMail) {
        this.orgMail = orgMail;
    }

    /** 
     * Get the 'OGRN' element value. ����
     * 
     * @return value
     */
    public String getOGRN() {
        return OGRN;
    }

    /** 
     * Set the 'OGRN' element value. ����
     * 
     * @param OGRN
     */
    public void setOGRN(String OGRN) {
        this.OGRN = OGRN;
    }

    /** 
     * Get the 'INN' element value. ���
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ���
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ���
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ���
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'E_MAIL' element value. ����������e-mail
     * 
     * @return value
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /** 
     * Set the 'E_MAIL' element value. ����������e-mail
     * 
     * @param EMAIL
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'InfBrokerFlag' element value. ������� ��������������� �������
     * 
     * @return value
     */
    public BigDecimal getInfBrokerFlag() {
        return infBrokerFlag;
    }

    /** 
     * Set the 'InfBrokerFlag' element value. ������� ��������������� �������
     * 
     * @param infBrokerFlag
     */
    public void setInfBrokerFlag(BigDecimal infBrokerFlag) {
        this.infBrokerFlag = infBrokerFlag;
    }

    /** 
     * Get the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
    }

    /** 
     * Get the list of 'ParticipantInfo' element items. ����������  � ������  �����������
     * 
     * @return list
     */
    public List<PtpcInfoType> getParticipantInfoList() {
        return participantInfoList;
    }

    /** 
     * Set the list of 'ParticipantInfo' element items. ����������  � ������  �����������
     * 
     * @param list
     */
    public void setParticipantInfoList(List<PtpcInfoType> list) {
        participantInfoList = list;
    }

    /** 
     * Get the list of 'PersonInfo' element items. ����������  � ����������  �����
     * 
     * @return list
     */
    public List<PersonInfoType> getPersonInfoList() {
        return personInfoList;
    }

    /** 
     * Set the list of 'PersonInfo' element items. ����������  � ����������  �����
     * 
     * @param list
     */
    public void setPersonInfoList(List<PersonInfoType> list) {
        personInfoList = list;
    }

    /** 
     * Get the 'GroundConnectionOrg' element value. ��������� ��� ����������� �����������
     * 
     * @return value
     */
    public DocumentGroundConnectionType getGroundConnectionOrg() {
        return groundConnectionOrg;
    }

    /** 
     * Set the 'GroundConnectionOrg' element value. ��������� ��� ����������� �����������
     * 
     * @param groundConnectionOrg
     */
    public void setGroundConnectionOrg(
            DocumentGroundConnectionType groundConnectionOrg) {
        this.groundConnectionOrg = groundConnectionOrg;
    }
}
