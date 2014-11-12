
package ru.acs.fts.schemas.album.reqptpcsysinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * Запрос на предоставление технологических сведений об информационной системе участника ВЭД
 */
public class ReqPtpcSysInfoType extends BaseDocType
{
    private String certificateNumber;
    private RFOrganizationFeaturesType organizationFeatures;
    private String documentModeID;

    /** 
     * Get the 'CertificateNumber' element value. Номер свидетельства о включении в реестр
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о включении в реестр
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'OrganizationFeatures' element value. Сведения об организации.
     * 
     * @return value
     */
    public RFOrganizationFeaturesType getOrganizationFeatures() {
        return organizationFeatures;
    }

    /** 
     * Set the 'OrganizationFeatures' element value. Сведения об организации.
     * 
     * @param organizationFeatures
     */
    public void setOrganizationFeatures(
            RFOrganizationFeaturesType organizationFeatures) {
        this.organizationFeatures = organizationFeatures;
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
