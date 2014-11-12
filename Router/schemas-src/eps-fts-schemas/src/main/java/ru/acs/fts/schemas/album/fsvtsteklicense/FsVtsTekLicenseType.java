
package ru.acs.fts.schemas.album.fsvtsteklicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Лицензия ФСВТС России/на ввоз (вывоз) товаров и технологий, подлежащих экспортному контролю
 */
public class FsVtsTekLicenseType extends BaseDocType
{
    private String BDRDID;
    private String countryDeparture;
    private String countryOrigin;
    private String countryEndUse;
    private String lisenceIssue;
    private String additionalInfo;
    private String contractCurrency;
    private LicenseType license;
    private LicenseOwnerType licenseOwner;
    private DocumentBaseType contractDetails;
    private GoodsDescriptionType goodsDescription;
    private PersonBaseType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'CountryDeparture' element value. Страна отправления/назначения (продавца/покупателя)
     * 
     * @return value
     */
    public String getCountryDeparture() {
        return countryDeparture;
    }

    /** 
     * Set the 'CountryDeparture' element value. Страна отправления/назначения (продавца/покупателя)
     * 
     * @param countryDeparture
     */
    public void setCountryDeparture(String countryDeparture) {
        this.countryDeparture = countryDeparture;
    }

    /** 
     * Get the 'CountryOrigin' element value. Страна происхождения
     * 
     * @return value
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /** 
     * Set the 'CountryOrigin' element value. Страна происхождения
     * 
     * @param countryOrigin
     */
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    /** 
     * Get the 'CountryEndUse' element value. Страна конечного использования
     * 
     * @return value
     */
    public String getCountryEndUse() {
        return countryEndUse;
    }

    /** 
     * Set the 'CountryEndUse' element value. Страна конечного использования
     * 
     * @param countryEndUse
     */
    public void setCountryEndUse(String countryEndUse) {
        this.countryEndUse = countryEndUse;
    }

    /** 
     * Get the 'LisenceIssue' element value. Основание для выдачи лицензии
     * 
     * @return value
     */
    public String getLisenceIssue() {
        return lisenceIssue;
    }

    /** 
     * Set the 'LisenceIssue' element value. Основание для выдачи лицензии
     * 
     * @param lisenceIssue
     */
    public void setLisenceIssue(String lisenceIssue) {
        this.lisenceIssue = lisenceIssue;
    }

    /** 
     * Get the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ContractCurrency' element value. Валюта контракта
     * 
     * @return value
     */
    public String getContractCurrency() {
        return contractCurrency;
    }

    /** 
     * Set the 'ContractCurrency' element value. Валюта контракта
     * 
     * @param contractCurrency
     */
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    /** 
     * Get the 'License' element value. Сведения о лицензии
     * 
     * @return value
     */
    public LicenseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. Сведения о лицензии
     * 
     * @param license
     */
    public void setLicense(LicenseType license) {
        this.license = license;
    }

    /** 
     * Get the 'LicenseOwner' element value. Сведения о владельце лицензии
     * 
     * @return value
     */
    public LicenseOwnerType getLicenseOwner() {
        return licenseOwner;
    }

    /** 
     * Set the 'LicenseOwner' element value. Сведения о владельце лицензии
     * 
     * @param licenseOwner
     */
    public void setLicenseOwner(LicenseOwnerType licenseOwner) {
        this.licenseOwner = licenseOwner;
    }

    /** 
     * Get the 'ContractDetails' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. Реквизиты контракта
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
    }

    /** 
     * Get the 'GoodsDescription' element value. Сведения о товарах
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Сведения о товарах
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
