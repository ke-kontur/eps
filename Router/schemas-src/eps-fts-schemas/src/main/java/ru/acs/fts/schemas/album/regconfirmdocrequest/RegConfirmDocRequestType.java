
package ru.acs.fts.schemas.album.regconfirmdocrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Запрос сведений из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лица/о регистрационных удостоверениях на изделия медицинского назначения, выданных Росздравнадзором/о наличии лицензии на право осуществления страховой деятельности/из Государственного реестра наименований мест происхождений товаров РФ/о регистрации лекарственных средств/о целевом назначении для медицины/из Перечня общеизвестных в Российской Федерации товарных знаков
 */
public class RegConfirmDocRequestType extends BaseDocType
{
    private String docSign;
    private String applicationSourceSystemID;
    private String applicationID;
    private OrganizationType organization;
    private ObjectDescriptionType objectDescription;
    private DocumentBaseType documentDetails;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Запрос сведений: 1 - из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лица; 2 - о регистрационных удостоверениях на изделия медицинского назначения, выданных Росздравнадзором; 3 - о наличии лицензии на право осуществления страховой деятельности; 4 - из Государственного реестра наименований мест происхождений товаров РФ; 5 - о регистрации лекарственных средств; 6 - о целевом назначении для медицины; 7 - из Перечня общеизвестных в РФ товарных знаков
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Запрос сведений: 1 - из лицензии на осуществление перевозок воздушным транспортом грузов и пассажиров для юр. лица; 2 - о регистрационных удостоверениях на изделия медицинского назначения, выданных Росздравнадзором; 3 - о наличии лицензии на право осуществления страховой деятельности; 4 - из Государственного реестра наименований мест происхождений товаров РФ; 5 - о регистрации лекарственных средств; 6 - о целевом назначении для медицины; 7 - из Перечня общеизвестных в РФ товарных знаков
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'ObjectDescription' element value. Описание деятельности/товара/объекта
     * 
     * @return value
     */
    public ObjectDescriptionType getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. Описание деятельности/товара/объекта
     * 
     * @param objectDescription
     */
    public void setObjectDescription(ObjectDescriptionType objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'DocumentDetails' element value. Сведения о документе
     * 
     * @return value
     */
    public DocumentBaseType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. Сведения о документе
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentBaseType documentDetails) {
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
