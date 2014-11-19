
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о фитосанитарном (карантинном) сертификате
 */
public class FitoSanitaryCertificateInfoType extends DocumentBaseType
{
    private String issueOrganization;
    private OrganizationBaseType sender;
    private OrganizationBaseType receiver;
    private DesinfestationType desinfestation;

    /** 
     * Get the 'IssueOrganization' element value. Наименование органа, выдавшего сертификат
     * 
     * @return value
     */
    public String getIssueOrganization() {
        return issueOrganization;
    }

    /** 
     * Set the 'IssueOrganization' element value. Наименование органа, выдавшего сертификат
     * 
     * @param issueOrganization
     */
    public void setIssueOrganization(String issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    /** 
     * Get the 'Sender' element value. Отправитель
     * 
     * @return value
     */
    public OrganizationBaseType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель
     * 
     * @param sender
     */
    public void setSender(OrganizationBaseType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public OrganizationBaseType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationBaseType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'Desinfestation' element value. Обеззараживание
     * 
     * @return value
     */
    public DesinfestationType getDesinfestation() {
        return desinfestation;
    }

    /** 
     * Set the 'Desinfestation' element value. Обеззараживание
     * 
     * @param desinfestation
     */
    public void setDesinfestation(DesinfestationType desinfestation) {
        this.desinfestation = desinfestation;
    }
}
