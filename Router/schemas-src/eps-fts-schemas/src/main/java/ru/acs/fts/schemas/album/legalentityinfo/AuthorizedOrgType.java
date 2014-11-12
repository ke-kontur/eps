
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� � ����, ������� ����� ��� ������������ ����������� �� ����� ������������ ����
 */
public class AuthorizedOrgType extends OrganizationType
{
    private String orgSign;
    private String personPost;
    private String personKindCode;
    private String personKindName;
    private String originCountryCode;
    private String originCountryName;

    /** 
     * Get the 'OrgSign' element value. �������: 1 - ���. ����; 2 -  ���������� ��. ����; 3 - ����������� ��. ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 1 - ���. ����; 2 -  ���������� ��. ����; 3 - ����������� ��. ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'PersonPost' element value. ���������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'PersonKindCode' element value. ��� ������������ ���� �� ����������� ������
     * 
     * @return value
     */
    public String getPersonKindCode() {
        return personKindCode;
    }

    /** 
     * Set the 'PersonKindCode' element value. ��� ������������ ���� �� ����������� ������
     * 
     * @param personKindCode
     */
    public void setPersonKindCode(String personKindCode) {
        this.personKindCode = personKindCode;
    }

    /** 
     * Get the 'PersonKindName' element value. ������������ ���� ������������ ���� �� ����������� ������
     * 
     * @return value
     */
    public String getPersonKindName() {
        return personKindName;
    }

    /** 
     * Set the 'PersonKindName' element value. ������������ ���� ������������ ���� �� ����������� ������
     * 
     * @param personKindName
     */
    public void setPersonKindName(String personKindName) {
        this.personKindName = personKindName;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ �������������
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ �������������
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. ������������ ������ �������������
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������������ ������ �������������
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }
}
