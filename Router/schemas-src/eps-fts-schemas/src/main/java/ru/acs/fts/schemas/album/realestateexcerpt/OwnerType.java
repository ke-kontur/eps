
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Владелец объекта недвижимого имущества
 */
public class OwnerType extends CUOrganizationType
{
    private String orgSign;
    private LocalDate birthDate;
    private String insuranceNumber;
    private LocalDate regDate;
    private List<String> previousNameList = new ArrayList<String>();
    private String governanceCode;
    private String regCountry;
    private String regNum;
    private String ID;
    private String contactInfo;
    private String egrpID;
    private String agentKind;
    private AddressType factAddress;
    private List<IdentityCardType> previousIdentityDocList = new ArrayList<IdentityCardType>();
    private List<PresentedDocsType> presentedDocList = new ArrayList<PresentedDocsType>();

    /** 
     * Get the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - юр. лицо ; 3 - орган государственной власти или орган местного самоуправления; 4 - иностранное юр. лицо
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - юр. лицо ; 3 - орган государственной власти или орган местного самоуправления; 4 - иностранное юр. лицо
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'BirthDate' element value. Дата рождения
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. Дата рождения
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'InsuranceNumber' element value. СНИЛС
     * 
     * @return value
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /** 
     * Set the 'InsuranceNumber' element value. СНИЛС
     * 
     * @param insuranceNumber
     */
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    /** 
     * Get the 'RegDate' element value. Дата государственной регистрации
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата государственной регистрации
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the list of 'PreviousName' element items. Предыдущее наименование
     * 
     * @return list
     */
    public List<String> getPreviousNameList() {
        return previousNameList;
    }

    /** 
     * Set the list of 'PreviousName' element items. Предыдущее наименование
     * 
     * @param list
     */
    public void setPreviousNameList(List<String> list) {
        previousNameList = list;
    }

    /** 
     * Get the 'GovernanceCode' element value. Тип органа государственной власти или органа местного самоуправления
     * 
     * @return value
     */
    public String getGovernanceCode() {
        return governanceCode;
    }

    /** 
     * Set the 'GovernanceCode' element value. Тип органа государственной власти или органа местного самоуправления
     * 
     * @param governanceCode
     */
    public void setGovernanceCode(String governanceCode) {
        this.governanceCode = governanceCode;
    }

    /** 
     * Get the 'RegCountry' element value. Страна регистрации
     * 
     * @return value
     */
    public String getRegCountry() {
        return regCountry;
    }

    /** 
     * Set the 'RegCountry' element value. Страна регистрации
     * 
     * @param regCountry
     */
    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    /** 
     * Get the 'RegNum' element value. Номер регистрации
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Номер регистрации
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'ID' element value. Внутренний идентификатор
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Внутренний идентификатор
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ContactInfo' element value. Контактная информация
     * 
     * @return value
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /** 
     * Set the 'ContactInfo' element value. Контактная информация
     * 
     * @param contactInfo
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /** 
     * Get the 'EgrpID' element value. Идентификатор в базе данных ЕГРП
     * 
     * @return value
     */
    public String getEgrpID() {
        return egrpID;
    }

    /** 
     * Set the 'EgrpID' element value. Идентификатор в базе данных ЕГРП
     * 
     * @param egrpID
     */
    public void setEgrpID(String egrpID) {
        this.egrpID = egrpID;
    }

    /** 
     * Get the 'AgentKind' element value. Вид представительства
     * 
     * @return value
     */
    public String getAgentKind() {
        return agentKind;
    }

    /** 
     * Set the 'AgentKind' element value. Вид представительства
     * 
     * @param agentKind
     */
    public void setAgentKind(String agentKind) {
        this.agentKind = agentKind;
    }

    /** 
     * Get the 'FactAddress' element value. Адрес преимущественного проживания субъекта / Зарегистрированный адрес субъекта
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Адрес преимущественного проживания субъекта / Зарегистрированный адрес субъекта
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }

    /** 
     * Get the list of 'PreviousIdentityDocs' element items. Предыдущие документы удостоверения личности
     * 
     * @return list
     */
    public List<IdentityCardType> getPreviousIdentityDocList() {
        return previousIdentityDocList;
    }

    /** 
     * Set the list of 'PreviousIdentityDocs' element items. Предыдущие документы удостоверения личности
     * 
     * @param list
     */
    public void setPreviousIdentityDocList(List<IdentityCardType> list) {
        previousIdentityDocList = list;
    }

    /** 
     * Get the list of 'PresentedDocs' element items. Представленные документы
     * 
     * @return list
     */
    public List<PresentedDocsType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDocs' element items. Представленные документы
     * 
     * @param list
     */
    public void setPresentedDocList(List<PresentedDocsType> list) {
        presentedDocList = list;
    }
}
