
package ru.acs.fts.schemas.album.rznmedizd;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Регистрационное удостоверение
 */
public class RZNMedizdType extends BaseDocType
{
    private String BDRDID;
    private String application;
    private RegistrationType registration;
    private OrganizationType applicantOrg;
    private GoodsDescriptionType goodsDescription;
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
     * Get the 'Application' element value. Приложение
     * 
     * @return value
     */
    public String getApplication() {
        return application;
    }

    /** 
     * Set the 'Application' element value. Приложение
     * 
     * @param application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /** 
     * Get the 'Registration' element value. Регистрация
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрация
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'ApplicantOrg' element value. Организация-заявитель
     * 
     * @return value
     */
    public OrganizationType getApplicantOrg() {
        return applicantOrg;
    }

    /** 
     * Set the 'ApplicantOrg' element value. Организация-заявитель
     * 
     * @param applicantOrg
     */
    public void setApplicantOrg(OrganizationType applicantOrg) {
        this.applicantOrg = applicantOrg;
    }

    /** 
     * Get the 'GoodsDescription' element value. Описание изделия медицинского назначения
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Описание изделия медицинского назначения
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
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
