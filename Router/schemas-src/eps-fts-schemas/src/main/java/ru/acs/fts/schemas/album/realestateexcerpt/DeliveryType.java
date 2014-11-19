
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * ������ ������ �����������
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
     * Get the 'WebService' element value. ������� �������� XML-��������� � �������������� ���-��������
     * 
     * @return value
     */
    public String getWebService() {
        return webService;
    }

    /** 
     * Set the 'WebService' element value. ������� �������� XML-��������� � �������������� ���-��������
     * 
     * @param webService
     */
    public void setWebService(String webService) {
        this.webService = webService;
    }

    /** 
     * Get the 'InterDepartmentRequest' element value. ������� ����, ��� ������ �������� ����������������
     * 
     * @return value
     */
    public String getInterDepartmentRequest() {
        return interDepartmentRequest;
    }

    /** 
     * Set the 'InterDepartmentRequest' element value. ������� ����, ��� ������ �������� ����������������
     * 
     * @param interDepartmentRequest
     */
    public void setInterDepartmentRequest(String interDepartmentRequest) {
        this.interDepartmentRequest = interDepartmentRequest;
    }

    /** 
     * Get the 'NameOKU' element value. � ���� ��������� ��������� ��� ������ ���������
     * 
     * @return value
     */
    public String getNameOKU() {
        return nameOKU;
    }

    /** 
     * Set the 'NameOKU' element value. � ���� ��������� ��������� ��� ������ ���������
     * 
     * @param nameOKU
     */
    public void setNameOKU(String nameOKU) {
        this.nameOKU = nameOKU;
    }

    /** 
     * Get the 'PostAddress' element value. � ���� ��������� ��������� ����������� ��������� �����������
     * 
     * @return value
     */
    public String getPostAddress() {
        return postAddress;
    }

    /** 
     * Set the 'PostAddress' element value. � ���� ��������� ��������� ����������� ��������� �����������
     * 
     * @param postAddress
     */
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    /** 
     * Get the 'EmailAddress' element value. � ���� ������������ ��������� ����������� ����������� �����
     * 
     * @return value
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /** 
     * Set the 'EmailAddress' element value. � ���� ������������ ��������� ����������� ����������� �����
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /** 
     * Get the 'LinkEmail' element value. � ���� ������ �� ����������� �������� ����������� ����������� �����
     * 
     * @return value
     */
    public String getLinkEmail() {
        return linkEmail;
    }

    /** 
     * Set the 'LinkEmail' element value. � ���� ������ �� ����������� �������� ����������� ����������� �����
     * 
     * @param linkEmail
     */
    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }
}
