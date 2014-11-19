
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о лице
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
     * Get the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - российское юр. лицо; 3 - иностранное юр. лицо
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - российское юр. лицо; 3 - иностранное юр. лицо
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'PersonPost' element value. Должность
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. Наименование страны происхождения
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Наименование страны происхождения
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'RegDate' element value. Дата регистрации
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата регистрации
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Регистрационный номер
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'BranchDescription' element value. Полное наименование представительства или филиала в РФ
     * 
     * @return value
     */
    public String getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. Полное наименование представительства или филиала в РФ
     * 
     * @param branchDescription
     */
    public void setBranchDescription(String branchDescription) {
        this.branchDescription = branchDescription;
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
     * Get the 'ForeignAddress' element value. Адрес места жительства (места пребывания) за пределами территории РФ
     * 
     * @return value
     */
    public AddressType getForeignAddress() {
        return foreignAddress;
    }

    /** 
     * Set the 'ForeignAddress' element value. Адрес места жительства (места пребывания) за пределами территории РФ
     * 
     * @param foreignAddress
     */
    public void setForeignAddress(AddressType foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    /** 
     * Get the list of 'Disqualification' element items. Сведения о дисквалификации
     * 
     * @return list
     */
    public List<DisqualificationType> getDisqualificationList() {
        return disqualificationList;
    }

    /** 
     * Set the list of 'Disqualification' element items. Сведения о дисквалификации
     * 
     * @param list
     */
    public void setDisqualificationList(List<DisqualificationType> list) {
        disqualificationList = list;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Вид должностного лица
     * 
     * @return value
     */
    public ReferenceInfoType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Вид должностного лица
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(ReferenceInfoType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'RegOrgan' element value. Сведения о регистрирующем органе
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. Сведения о регистрирующем органе
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}
