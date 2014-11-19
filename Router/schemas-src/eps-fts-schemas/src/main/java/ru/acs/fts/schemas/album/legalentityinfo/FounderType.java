
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об учредителе юридического лица
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
     * Get the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - российское юр. лицо; 3 - орган государственной власти или орган местного самоуправления; 4 - иностранное юр. лицо; 5 - паевой инвестиционный фонд
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 - российское юр. лицо; 3 - орган государственной власти или орган местного самоуправления; 4 - иностранное юр. лицо; 5 - паевой инвестиционный фонд
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
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
     * Get the 'InheritanceOpenDate' element value. Дата открытия наследства (дата смерти участника)
     * 
     * @return value
     */
    public LocalDate getInheritanceOpenDate() {
        return inheritanceOpenDate;
    }

    /** 
     * Set the 'InheritanceOpenDate' element value. Дата открытия наследства (дата смерти участника)
     * 
     * @param inheritanceOpenDate
     */
    public void setInheritanceOpenDate(LocalDate inheritanceOpenDate) {
        this.inheritanceOpenDate = inheritanceOpenDate;
    }

    /** 
     * Get the 'FounderKindCode' element value. Код вида учредителя: 1 - доля принадлежит РФ; 2 - доля принадлежит субъекту РФ; 3 - доля принадлежит муниципальному образованию
     * 
     * @return value
     */
    public String getFounderKindCode() {
        return founderKindCode;
    }

    /** 
     * Set the 'FounderKindCode' element value. Код вида учредителя: 1 - доля принадлежит РФ; 2 - доля принадлежит субъекту РФ; 3 - доля принадлежит муниципальному образованию
     * 
     * @param founderKindCode
     */
    public void setFounderKindCode(String founderKindCode) {
        this.founderKindCode = founderKindCode;
    }

    /** 
     * Get the 'RFSubjectCode' element value. Код субъекта Российской Федерации которому принадлежит доля или на территории которого находится муниципальное образование, которому принадлежит доля
     * 
     * @return value
     */
    public String getRFSubjectCode() {
        return RFSubjectCode;
    }

    /** 
     * Set the 'RFSubjectCode' element value. Код субъекта Российской Федерации которому принадлежит доля или на территории которого находится муниципальное образование, которому принадлежит доля
     * 
     * @param RFSubjectCode
     */
    public void setRFSubjectCode(String RFSubjectCode) {
        this.RFSubjectCode = RFSubjectCode;
    }

    /** 
     * Get the 'RFSubjectName' element value. Наименование субъекта Российской Федерации / Наименование муниципального образования
     * 
     * @return value
     */
    public String getRFSubjectName() {
        return RFSubjectName;
    }

    /** 
     * Set the 'RFSubjectName' element value. Наименование субъекта Российской Федерации / Наименование муниципального образования
     * 
     * @param RFSubjectName
     */
    public void setRFSubjectName(String RFSubjectName) {
        this.RFSubjectName = RFSubjectName;
    }

    /** 
     * Get the 'Share' element value. Доля в уставном капитале
     * 
     * @return value
     */
    public ShareType getShare() {
        return share;
    }

    /** 
     * Set the 'Share' element value. Доля в уставном капитале
     * 
     * @param share
     */
    public void setShare(ShareType share) {
        this.share = share;
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
     * Get the list of 'ShareManager' element items. Сведения о лице, осуществляющем управление долей, переходящей в порядке наследования / Сведения об управляющей компании, осуществляющей доверительное управление
     * 
     * @return list
     */
    public List<ParticipantType> getShareManagerList() {
        return shareManagerList;
    }

    /** 
     * Set the list of 'ShareManager' element items. Сведения о лице, осуществляющем управление долей, переходящей в порядке наследования / Сведения об управляющей компании, осуществляющей доверительное управление
     * 
     * @param list
     */
    public void setShareManagerList(List<ParticipantType> list) {
        shareManagerList = list;
    }
}
