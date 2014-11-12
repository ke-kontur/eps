
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о лице, имеющем право без доверенности действовать от имени юридического лица
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
     * Get the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 -  российское юр. лицо; 3 - иностранное юр. лицо
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 1 - физ. лицо; 2 -  российское юр. лицо; 3 - иностранное юр. лицо
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
     * Get the 'PersonKindCode' element value. Вид должностного лица по справочнику СКФЛЮЛ
     * 
     * @return value
     */
    public String getPersonKindCode() {
        return personKindCode;
    }

    /** 
     * Set the 'PersonKindCode' element value. Вид должностного лица по справочнику СКФЛЮЛ
     * 
     * @param personKindCode
     */
    public void setPersonKindCode(String personKindCode) {
        this.personKindCode = personKindCode;
    }

    /** 
     * Get the 'PersonKindName' element value. Наименование вида должностного лица по справочнику СКФЛЮЛ
     * 
     * @return value
     */
    public String getPersonKindName() {
        return personKindName;
    }

    /** 
     * Set the 'PersonKindName' element value. Наименование вида должностного лица по справочнику СКФЛЮЛ
     * 
     * @param personKindName
     */
    public void setPersonKindName(String personKindName) {
        this.personKindName = personKindName;
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
}
