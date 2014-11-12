
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� �  ����������� ����
 */
public class BaseDetailsType extends OrganizationBaseType
{
    private LocalDate OGRNDate;
    private String brandName;
    private OrgStatusInfoType orgStatusInfo;
    private OrgAddressType orgAddress;
    private List<BranchDescriptionType> branchDescriptionList = new ArrayList<BranchDescriptionType>();
    private OrganizationFormType organizationForm;
    private RecordDataType recordData;
    private LegalEntityFormationType legalEntityFormation;
    private SuccessionDataType successionData;
    private OrgCapitalType orgCapital;
    private OrgCapitalType capitalReduction;
    private List<FounderType> founderList = new ArrayList<FounderType>();
    private ShareType LLCShare;
    private ParticipantType holder;
    private List<ParticipantType> permitPersonList = new ArrayList<ParticipantType>();
    private FounderType foreignPermitPerson;
    private List<ActivityType> activityList = new ArrayList<ActivityType>();

    /** 
     * Get the 'OGRNDate' element value. ���� ���������� ����
     * 
     * @return value
     */
    public LocalDate getOGRNDate() {
        return OGRNDate;
    }

    /** 
     * Set the 'OGRNDate' element value. ���� ���������� ����
     * 
     * @param OGRNDate
     */
    public void setOGRNDate(LocalDate OGRNDate) {
        this.OGRNDate = OGRNDate;
    }

    /** 
     * Get the 'BrandName' element value. ��������� ������������ ������������ ����
     * 
     * @return value
     */
    public String getBrandName() {
        return brandName;
    }

    /** 
     * Set the 'BrandName' element value. ��������� ������������ ������������ ����
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /** 
     * Get the 'OrgStatusInfo' element value. �������� � ���������������� (�������) ������������ ����
     * 
     * @return value
     */
    public OrgStatusInfoType getOrgStatusInfo() {
        return orgStatusInfo;
    }

    /** 
     * Set the 'OrgStatusInfo' element value. �������� � ���������������� (�������) ������������ ����
     * 
     * @param orgStatusInfo
     */
    public void setOrgStatusInfo(OrgStatusInfoType orgStatusInfo) {
        this.orgStatusInfo = orgStatusInfo;
    }

    /** 
     * Get the 'OrgAddress' element value. �������� �� ������ (����� ����������) ��������� ������������ ��������������� ������ ��. ����
     * 
     * @return value
     */
    public OrgAddressType getOrgAddress() {
        return orgAddress;
    }

    /** 
     * Set the 'OrgAddress' element value. �������� �� ������ (����� ����������) ��������� ������������ ��������������� ������ ��. ����
     * 
     * @param orgAddress
     */
    public void setOrgAddress(OrgAddressType orgAddress) {
        this.orgAddress = orgAddress;
    }

    /** 
     * Get the list of 'BranchDescription' element items. �������� �� ������������ �������������
     * 
     * @return list
     */
    public List<BranchDescriptionType> getBranchDescriptionList() {
        return branchDescriptionList;
    }

    /** 
     * Set the list of 'BranchDescription' element items. �������� �� ������������ �������������
     * 
     * @param list
     */
    public void setBranchDescriptionList(List<BranchDescriptionType> list) {
        branchDescriptionList = list;
    }

    /** 
     * Get the 'OrganizationForm' element value. �������� �� ��������������-�������� �����
     * 
     * @return value
     */
    public OrganizationFormType getOrganizationForm() {
        return organizationForm;
    }

    /** 
     * Set the 'OrganizationForm' element value. �������� �� ��������������-�������� �����
     * 
     * @param organizationForm
     */
    public void setOrganizationForm(OrganizationFormType organizationForm) {
        this.organizationForm = organizationForm;
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
     * Get the 'LegalEntityFormation' element value. �������� �� ����������� ������������ ����
     * 
     * @return value
     */
    public LegalEntityFormationType getLegalEntityFormation() {
        return legalEntityFormation;
    }

    /** 
     * Set the 'LegalEntityFormation' element value. �������� �� ����������� ������������ ����
     * 
     * @param legalEntityFormation
     */
    public void setLegalEntityFormation(
            LegalEntityFormationType legalEntityFormation) {
        this.legalEntityFormation = legalEntityFormation;
    }

    /** 
     * Get the 'SuccessionData' element value. �������� � ��������������
     * 
     * @return value
     */
    public SuccessionDataType getSuccessionData() {
        return successionData;
    }

    /** 
     * Set the 'SuccessionData' element value. �������� � ��������������
     * 
     * @param successionData
     */
    public void setSuccessionData(SuccessionDataType successionData) {
        this.successionData = successionData;
    }

    /** 
     * Get the 'OrgCapital' element value. �������� � ������� ���������� � ������������� ���������� ������������ ����������� ��������� �������� (����������� ��������, ��������� �����, ������� �����)
     * 
     * @return value
     */
    public OrgCapitalType getOrgCapital() {
        return orgCapital;
    }

    /** 
     * Set the 'OrgCapital' element value. �������� � ������� ���������� � ������������� ���������� ������������ ����������� ��������� �������� (����������� ��������, ��������� �����, ������� �����)
     * 
     * @param orgCapital
     */
    public void setOrgCapital(OrgCapitalType orgCapital) {
        this.orgCapital = orgCapital;
    }

    /** 
     * Get the 'CapitalReduction' element value. �������� � ���������� �������������� �������� � �������� ���������� ��������� ��������
     * 
     * @return value
     */
    public OrgCapitalType getCapitalReduction() {
        return capitalReduction;
    }

    /** 
     * Set the 'CapitalReduction' element value. �������� � ���������� �������������� �������� � �������� ���������� ��������� ��������
     * 
     * @param capitalReduction
     */
    public void setCapitalReduction(OrgCapitalType capitalReduction) {
        this.capitalReduction = capitalReduction;
    }

    /** 
     * Get the list of 'Founder' element items. �������� �� ���������� ������������ ����
     * 
     * @return list
     */
    public List<FounderType> getFounderList() {
        return founderList;
    }

    /** 
     * Set the list of 'Founder' element items. �������� �� ���������� ������������ ����
     * 
     * @param list
     */
    public void setFounderList(List<FounderType> list) {
        founderList = list;
    }

    /** 
     * Get the 'LLCShare' element value. �������� � ����, ������������� �������� � ������������ ����������������
     * 
     * @return value
     */
    public ShareType getLLCShare() {
        return LLCShare;
    }

    /** 
     * Set the 'LLCShare' element value. �������� � ����, ������������� �������� � ������������ ����������������
     * 
     * @param LLCShare
     */
    public void setLLCShare(ShareType LLCShare) {
        this.LLCShare = LLCShare;
    }

    /** 
     * Get the 'Holder' element value. �������� � ��������� ������� ���������� ������������ ��������
     * 
     * @return value
     */
    public ParticipantType getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. �������� � ��������� ������� ���������� ������������ ��������
     * 
     * @param holder
     */
    public void setHolder(ParticipantType holder) {
        this.holder = holder;
    }

    /** 
     * Get the list of 'PermitPerson' element items. �������� � ����, ������� ����� ��� ������������ ����������� �� ����� ������������ ����
     * 
     * @return list
     */
    public List<ParticipantType> getPermitPersonList() {
        return permitPersonList;
    }

    /** 
     * Set the list of 'PermitPerson' element items. �������� � ����, ������� ����� ��� ������������ ����������� �� ����� ������������ ����
     * 
     * @param list
     */
    public void setPermitPersonList(List<ParticipantType> list) {
        permitPersonList = list;
    }

    /** 
     * Get the 'ForeignPermitPerson' element value. �������� �� ����������� ����������� - ����������� ����������� ����
     * 
     * @return value
     */
    public FounderType getForeignPermitPerson() {
        return foreignPermitPerson;
    }

    /** 
     * Set the 'ForeignPermitPerson' element value. �������� �� ����������� ����������� - ����������� ����������� ����
     * 
     * @param foreignPermitPerson
     */
    public void setForeignPermitPerson(FounderType foreignPermitPerson) {
        this.foreignPermitPerson = foreignPermitPerson;
    }

    /** 
     * Get the list of 'Activity' element items. �������� � ����� �� ��������������� �������������� ����� ������������� ������������
     * 
     * @return list
     */
    public List<ActivityType> getActivityList() {
        return activityList;
    }

    /** 
     * Set the list of 'Activity' element items. �������� � ����� �� ��������������� �������������� ����� ������������� ������������
     * 
     * @param list
     */
    public void setActivityList(List<ActivityType> list) {
        activityList = list;
    }
}
