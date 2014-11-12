
package ru.acs.fts.schemas.album.inforequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Запрос сведений из удостоверения допуска к осуществлению международных автомобильных перевозок/из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов/о юр. лице/о наличии судимости у сотрудников юр. лица/об учете организации в налоговом органе по месту нахождения ее обособленного подразделения/из реестра свидетельств на право вывоза культурных ценностей с территории РФ/из лицензии на обслуживание и ремонт авиационной техники
 */
public class InfoRequestType extends BaseDocType
{
    private String docSign;
    private String additionalInfo;
    private String applicationSourceSystemID;
    private String applicationID;
    private OrganizationType organization;
    private CUOrganizationType requestOrg;
    private PersonSignatureType requestPerson;
    private DocumentDetailsType documentDetails;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Запрос сведений: 1 - из удостоверения допуска к осуществлению международных автомобильных перевозок; 2 - из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов; 3 - о юр. лице; 4 - о наличии судимости у сотрудников юр. лица; 5 - об учете организации в налоговом органе по месту нахождения ее обособленного подразделения; 6 - из реестра свидетельств на право вывоза культурных ценностей с территории РФ; 7 - из лицензии на обслуживание и ремонт авиационной техники
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Запрос сведений: 1 - из удостоверения допуска к осуществлению международных автомобильных перевозок; 2 - из реестра лицензий на деятельность по перевозкам внутренним водным транспортом, морским транспортом опасных грузов; 3 - о юр. лице; 4 - о наличии судимости у сотрудников юр. лица; 5 - об учете организации в налоговом органе по месту нахождения ее обособленного подразделения; 6 - из реестра свидетельств на право вывоза культурных ценностей с территории РФ; 7 - из лицензии на обслуживание и ремонт авиационной техники
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @return value
     */
    public String getApplicationSourceSystemID() {
        return applicationSourceSystemID;
    }

    /** 
     * Set the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @param applicationSourceSystemID
     */
    public void setApplicationSourceSystemID(String applicationSourceSystemID) {
        this.applicationSourceSystemID = applicationSourceSystemID;
    }

    /** 
     * Get the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @return value
     */
    public String getApplicationID() {
        return applicationID;
    }

    /** 
     * Set the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @param applicationID
     */
    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /** 
     * Get the 'Organization' element value. Сведения об организации/физ. лице (юр. лицо/ИП)
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Сведения об организации/физ. лице (юр. лицо/ИП)
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'RequestOrg' element value. Сведения об организации, осуществляющей запрос
     * 
     * @return value
     */
    public CUOrganizationType getRequestOrg() {
        return requestOrg;
    }

    /** 
     * Set the 'RequestOrg' element value. Сведения об организации, осуществляющей запрос
     * 
     * @param requestOrg
     */
    public void setRequestOrg(CUOrganizationType requestOrg) {
        this.requestOrg = requestOrg;
    }

    /** 
     * Get the 'RequestPerson' element value. ФИО лица, заполнившего запрос
     * 
     * @return value
     */
    public PersonSignatureType getRequestPerson() {
        return requestPerson;
    }

    /** 
     * Set the 'RequestPerson' element value. ФИО лица, заполнившего запрос
     * 
     * @param requestPerson
     */
    public void setRequestPerson(PersonSignatureType requestPerson) {
        this.requestPerson = requestPerson;
    }

    /** 
     * Get the 'DocumentDetails' element value. Реквизиты документа
     * 
     * @return value
     */
    public DocumentDetailsType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. Реквизиты документа
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentDetailsType documentDetails) {
        this.documentDetails = documentDetails;
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
