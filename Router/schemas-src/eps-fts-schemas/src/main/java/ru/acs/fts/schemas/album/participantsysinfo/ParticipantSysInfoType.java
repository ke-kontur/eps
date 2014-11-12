
package ru.acs.fts.schemas.album.participantsysinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * Информация об учетной записи участника ВЭД
 */
public class ParticipantSysInfoType extends BaseDocType
{
    private String participantID;
    private String organizationName;
    private String participantName;
    private String SVHName;
    private String certificateNumber;
    private RFOrganizationFeaturesType organizationFeatures;
    private String documentModeID;

    /** 
     * Get the 'ParticipantID' element value. Идентификатор участника
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. Идентификатор участника
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ParticipantName' element value. Наименование точки подключения
     * 
     * @return value
     */
    public String getParticipantName() {
        return participantName;
    }

    /** 
     * Set the 'ParticipantName' element value. Наименование точки подключения
     * 
     * @param participantName
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /** 
     * Get the 'SVHName' element value. Наименование СВХ
     * 
     * @return value
     */
    public String getSVHName() {
        return SVHName;
    }

    /** 
     * Set the 'SVHName' element value. Наименование СВХ
     * 
     * @param SVHName
     */
    public void setSVHName(String SVHName) {
        this.SVHName = SVHName;
    }

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
