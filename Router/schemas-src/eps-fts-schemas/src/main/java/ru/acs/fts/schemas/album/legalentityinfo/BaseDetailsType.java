
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о  юридическом лице
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
     * Get the 'OGRNDate' element value. Дата присвоения ОГРН
     * 
     * @return value
     */
    public LocalDate getOGRNDate() {
        return OGRNDate;
    }

    /** 
     * Set the 'OGRNDate' element value. Дата присвоения ОГРН
     * 
     * @param OGRNDate
     */
    public void setOGRNDate(LocalDate OGRNDate) {
        this.OGRNDate = OGRNDate;
    }

    /** 
     * Get the 'BrandName' element value. Фирменное наименование юридического лица
     * 
     * @return value
     */
    public String getBrandName() {
        return brandName;
    }

    /** 
     * Set the 'BrandName' element value. Фирменное наименование юридического лица
     * 
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /** 
     * Get the 'OrgStatusInfo' element value. Сведения о правоспособности (статусе) юридического лица
     * 
     * @return value
     */
    public OrgStatusInfoType getOrgStatusInfo() {
        return orgStatusInfo;
    }

    /** 
     * Set the 'OrgStatusInfo' element value. Сведения о правоспособности (статусе) юридического лица
     * 
     * @param orgStatusInfo
     */
    public void setOrgStatusInfo(OrgStatusInfoType orgStatusInfo) {
        this.orgStatusInfo = orgStatusInfo;
    }

    /** 
     * Get the 'OrgAddress' element value. Сведения об адресе (месте нахождения) постоянно действующего исполнительного органа юр. лица
     * 
     * @return value
     */
    public OrgAddressType getOrgAddress() {
        return orgAddress;
    }

    /** 
     * Set the 'OrgAddress' element value. Сведения об адресе (месте нахождения) постоянно действующего исполнительного органа юр. лица
     * 
     * @param orgAddress
     */
    public void setOrgAddress(OrgAddressType orgAddress) {
        this.orgAddress = orgAddress;
    }

    /** 
     * Get the list of 'BranchDescription' element items. Сведения об обособленном подразделении
     * 
     * @return list
     */
    public List<BranchDescriptionType> getBranchDescriptionList() {
        return branchDescriptionList;
    }

    /** 
     * Set the list of 'BranchDescription' element items. Сведения об обособленном подразделении
     * 
     * @param list
     */
    public void setBranchDescriptionList(List<BranchDescriptionType> list) {
        branchDescriptionList = list;
    }

    /** 
     * Get the 'OrganizationForm' element value. Сведения об организационно-правовой форме
     * 
     * @return value
     */
    public OrganizationFormType getOrganizationForm() {
        return organizationForm;
    }

    /** 
     * Set the 'OrganizationForm' element value. Сведения об организационно-правовой форме
     * 
     * @param organizationForm
     */
    public void setOrganizationForm(OrganizationFormType organizationForm) {
        this.organizationForm = organizationForm;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }

    /** 
     * Get the 'LegalEntityFormation' element value. Сведения об образовании юридического лица
     * 
     * @return value
     */
    public LegalEntityFormationType getLegalEntityFormation() {
        return legalEntityFormation;
    }

    /** 
     * Set the 'LegalEntityFormation' element value. Сведения об образовании юридического лица
     * 
     * @param legalEntityFormation
     */
    public void setLegalEntityFormation(
            LegalEntityFormationType legalEntityFormation) {
        this.legalEntityFormation = legalEntityFormation;
    }

    /** 
     * Get the 'SuccessionData' element value. Сведения о правопреемстве
     * 
     * @return value
     */
    public SuccessionDataType getSuccessionData() {
        return successionData;
    }

    /** 
     * Set the 'SuccessionData' element value. Сведения о правопреемстве
     * 
     * @param successionData
     */
    public void setSuccessionData(SuccessionDataType successionData) {
        this.successionData = successionData;
    }

    /** 
     * Get the 'OrgCapital' element value. Сведения о размере указанного в учредительных документах коммерческой организации уставного капитала (складочного капитала, уставного фонда, паевого фонда)
     * 
     * @return value
     */
    public OrgCapitalType getOrgCapital() {
        return orgCapital;
    }

    /** 
     * Set the 'OrgCapital' element value. Сведения о размере указанного в учредительных документах коммерческой организации уставного капитала (складочного капитала, уставного фонда, паевого фонда)
     * 
     * @param orgCapital
     */
    public void setOrgCapital(OrgCapitalType orgCapital) {
        this.orgCapital = orgCapital;
    }

    /** 
     * Get the 'CapitalReduction' element value. Сведения о нахождении хозяйственного общества в процессе уменьшения уставного капитала
     * 
     * @return value
     */
    public OrgCapitalType getCapitalReduction() {
        return capitalReduction;
    }

    /** 
     * Set the 'CapitalReduction' element value. Сведения о нахождении хозяйственного общества в процессе уменьшения уставного капитала
     * 
     * @param capitalReduction
     */
    public void setCapitalReduction(OrgCapitalType capitalReduction) {
        this.capitalReduction = capitalReduction;
    }

    /** 
     * Get the list of 'Founder' element items. Сведения об учредителе юридического лица
     * 
     * @return list
     */
    public List<FounderType> getFounderList() {
        return founderList;
    }

    /** 
     * Set the list of 'Founder' element items. Сведения об учредителе юридического лица
     * 
     * @param list
     */
    public void setFounderList(List<FounderType> list) {
        founderList = list;
    }

    /** 
     * Get the 'LLCShare' element value. Сведения о доле, принадлежащей обществу с ограниченной ответственностью
     * 
     * @return value
     */
    public ShareType getLLCShare() {
        return LLCShare;
    }

    /** 
     * Set the 'LLCShare' element value. Сведения о доле, принадлежащей обществу с ограниченной ответственностью
     * 
     * @param LLCShare
     */
    public void setLLCShare(ShareType LLCShare) {
        this.LLCShare = LLCShare;
    }

    /** 
     * Get the 'Holder' element value. Сведения о держателе реестра акционеров акционерного общества
     * 
     * @return value
     */
    public ParticipantType getHolder() {
        return holder;
    }

    /** 
     * Set the 'Holder' element value. Сведения о держателе реестра акционеров акционерного общества
     * 
     * @param holder
     */
    public void setHolder(ParticipantType holder) {
        this.holder = holder;
    }

    /** 
     * Get the list of 'PermitPerson' element items. Сведения о лице, имеющем право без доверенности действовать от имени юридического лица
     * 
     * @return list
     */
    public List<ParticipantType> getPermitPersonList() {
        return permitPersonList;
    }

    /** 
     * Set the list of 'PermitPerson' element items. Сведения о лице, имеющем право без доверенности действовать от имени юридического лица
     * 
     * @param list
     */
    public void setPermitPersonList(List<ParticipantType> list) {
        permitPersonList = list;
    }

    /** 
     * Get the 'ForeignPermitPerson' element value. Сведения об управляющей организации - иностранном юридическом лице
     * 
     * @return value
     */
    public FounderType getForeignPermitPerson() {
        return foreignPermitPerson;
    }

    /** 
     * Set the 'ForeignPermitPerson' element value. Сведения об управляющей организации - иностранном юридическом лице
     * 
     * @param foreignPermitPerson
     */
    public void setForeignPermitPerson(FounderType foreignPermitPerson) {
        this.foreignPermitPerson = foreignPermitPerson;
    }

    /** 
     * Get the list of 'Activity' element items. Сведения о кодах по Общероссийскому классификатору видов экономической деятельности
     * 
     * @return list
     */
    public List<ActivityType> getActivityList() {
        return activityList;
    }

    /** 
     * Set the list of 'Activity' element items. Сведения о кодах по Общероссийскому классификатору видов экономической деятельности
     * 
     * @param list
     */
    public void setActivityList(List<ActivityType> list) {
        activityList = list;
    }
}
