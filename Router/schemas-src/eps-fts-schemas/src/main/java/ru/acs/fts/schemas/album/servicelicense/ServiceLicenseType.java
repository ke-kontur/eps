
package ru.acs.fts.schemas.album.servicelicense;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лиц/из реестра сертификатов на обслуживание и ремонт авиационной техники, в том числе авиационной техники двойного назначения/о наличии лицензии на право осуществления страховой деятельности/из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов/из удостоверения допуска к осуществлению международных автомобильных перевозок
 */
public class ServiceLicenseType extends BaseDocType
{
    private String docSign;
    private String decisionNum;
    private LocalDate decisionDate;
    private AuthorityOrgType authorityOrg;
    private LicenseType license;
    private LicenseeType licensee;
    private PersonBaseType authorizedPerson;
    private List<ServiceDescriptionType> serviceDescriptionList = new ArrayList<ServiceDescriptionType>();
    private List<AddressType> servicePlaceList = new ArrayList<AddressType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Сведения: 1 - из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лиц; 2 - из реестра сертификатов на обслуживание и ремонт авиационной техники, в том числе авиационной техники двойного назначения; 3 - о наличии лицензии на право осуществления страховой деятельности; 4 - из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов; 5 - из удостоверения допуска к осуществлению международных автомобильных перевозок
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Сведения: 1 - из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лиц; 2 - из реестра сертификатов на обслуживание и ремонт авиационной техники, в том числе авиационной техники двойного назначения; 3 - о наличии лицензии на право осуществления страховой деятельности; 4 - из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов; 5 - из удостоверения допуска к осуществлению международных автомобильных перевозок
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'DecisionNum' element value. Номер решения
     * 
     * @return value
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /** 
     * Set the 'DecisionNum' element value. Номер решения
     * 
     * @param decisionNum
     */
    public void setDecisionNum(String decisionNum) {
        this.decisionNum = decisionNum;
    }

    /** 
     * Get the 'DecisionDate' element value. Дата решения
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата решения
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'AuthorityOrg' element value. Орган власти
     * 
     * @return value
     */
    public AuthorityOrgType getAuthorityOrg() {
        return authorityOrg;
    }

    /** 
     * Set the 'AuthorityOrg' element value. Орган власти
     * 
     * @param authorityOrg
     */
    public void setAuthorityOrg(AuthorityOrgType authorityOrg) {
        this.authorityOrg = authorityOrg;
    }

    /** 
     * Get the 'License' element value. Сведения о лицензии/сертификате
     * 
     * @return value
     */
    public LicenseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. Сведения о лицензии/сертификате
     * 
     * @param license
     */
    public void setLicense(LicenseType license) {
        this.license = license;
    }

    /** 
     * Get the 'Licensee' element value. Лицензиат/Сертифицируемое лицо
     * 
     * @return value
     */
    public LicenseeType getLicensee() {
        return licensee;
    }

    /** 
     * Set the 'Licensee' element value. Лицензиат/Сертифицируемое лицо
     * 
     * @param licensee
     */
    public void setLicensee(LicenseeType licensee) {
        this.licensee = licensee;
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
     * Get the list of 'ServiceDescription' element items. Описание деятельности
     * 
     * @return list
     */
    public List<ServiceDescriptionType> getServiceDescriptionList() {
        return serviceDescriptionList;
    }

    /** 
     * Set the list of 'ServiceDescription' element items. Описание деятельности
     * 
     * @param list
     */
    public void setServiceDescriptionList(List<ServiceDescriptionType> list) {
        serviceDescriptionList = list;
    }

    /** 
     * Get the list of 'ServicePlace' element items. Место осуществления деятельности
     * 
     * @return list
     */
    public List<AddressType> getServicePlaceList() {
        return servicePlaceList;
    }

    /** 
     * Set the list of 'ServicePlace' element items. Место осуществления деятельности
     * 
     * @param list
     */
    public void setServicePlaceList(List<AddressType> list) {
        servicePlaceList = list;
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
