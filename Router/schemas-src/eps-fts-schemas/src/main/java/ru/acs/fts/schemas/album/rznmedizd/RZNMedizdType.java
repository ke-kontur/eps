
package ru.acs.fts.schemas.album.rznmedizd;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� �������������
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
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'Application' element value. ����������
     * 
     * @return value
     */
    public String getApplication() {
        return application;
    }

    /** 
     * Set the 'Application' element value. ����������
     * 
     * @param application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /** 
     * Get the 'Registration' element value. �����������
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. �����������
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'ApplicantOrg' element value. �����������-���������
     * 
     * @return value
     */
    public OrganizationType getApplicantOrg() {
        return applicantOrg;
    }

    /** 
     * Set the 'ApplicantOrg' element value. �����������-���������
     * 
     * @param applicantOrg
     */
    public void setApplicantOrg(OrganizationType applicantOrg) {
        this.applicantOrg = applicantOrg;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������� ������������ ����������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������� ������������ ����������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
