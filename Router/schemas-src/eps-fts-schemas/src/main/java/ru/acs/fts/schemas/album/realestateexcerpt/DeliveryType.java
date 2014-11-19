
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * Способ обмена информацией
 */
public class DeliveryType
{
    private String webService;
    private String interDepartmentRequest;
    private String nameOKU;
    private String postAddress;
    private String emailAddress;
    private String linkEmail;

    /** 
     * Get the 'WebService' element value. Признак отправки XML-документа с использованием вэб-сервисов
     * 
     * @return value
     */
    public String getWebService() {
        return webService;
    }

    /** 
     * Set the 'WebService' element value. Признак отправки XML-документа с использованием вэб-сервисов
     * 
     * @param webService
     */
    public void setWebService(String webService) {
        this.webService = webService;
    }

    /** 
     * Get the 'InterDepartmentRequest' element value. Признак того, что запрос является межведомственным
     * 
     * @return value
     */
    public String getInterDepartmentRequest() {
        return interDepartmentRequest;
    }

    /** 
     * Set the 'InterDepartmentRequest' element value. Признак того, что запрос является межведомственным
     * 
     * @param interDepartmentRequest
     */
    public void setInterDepartmentRequest(String interDepartmentRequest) {
        this.interDepartmentRequest = interDepartmentRequest;
    }

    /** 
     * Get the 'NameOKU' element value. В виде бумажного документа при личном обращении
     * 
     * @return value
     */
    public String getNameOKU() {
        return nameOKU;
    }

    /** 
     * Set the 'NameOKU' element value. В виде бумажного документа при личном обращении
     * 
     * @param nameOKU
     */
    public void setNameOKU(String nameOKU) {
        this.nameOKU = nameOKU;
    }

    /** 
     * Get the 'PostAddress' element value. В виде бумажного документа посредством почтового отправления
     * 
     * @return value
     */
    public String getPostAddress() {
        return postAddress;
    }

    /** 
     * Set the 'PostAddress' element value. В виде бумажного документа посредством почтового отправления
     * 
     * @param postAddress
     */
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    /** 
     * Get the 'EmailAddress' element value. В виде электронного документа посредством электронной почты
     * 
     * @return value
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /** 
     * Set the 'EmailAddress' element value. В виде электронного документа посредством электронной почты
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /** 
     * Get the 'LinkEmail' element value. В виде ссылки на электронный документ посредством электронной почты
     * 
     * @return value
     */
    public String getLinkEmail() {
        return linkEmail;
    }

    /** 
     * Set the 'LinkEmail' element value. В виде ссылки на электронный документ посредством электронной почты
     * 
     * @param linkEmail
     */
    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }
}
