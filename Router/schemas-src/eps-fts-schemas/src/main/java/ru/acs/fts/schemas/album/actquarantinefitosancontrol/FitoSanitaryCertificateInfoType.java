
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �������������� (�����������) �����������
 */
public class FitoSanitaryCertificateInfoType extends DocumentBaseType
{
    private String issueOrganization;
    private OrganizationBaseType sender;
    private OrganizationBaseType receiver;
    private DesinfestationType desinfestation;

    /** 
     * Get the 'IssueOrganization' element value. ������������ ������, ��������� ����������
     * 
     * @return value
     */
    public String getIssueOrganization() {
        return issueOrganization;
    }

    /** 
     * Set the 'IssueOrganization' element value. ������������ ������, ��������� ����������
     * 
     * @param issueOrganization
     */
    public void setIssueOrganization(String issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    /** 
     * Get the 'Sender' element value. �����������
     * 
     * @return value
     */
    public OrganizationBaseType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. �����������
     * 
     * @param sender
     */
    public void setSender(OrganizationBaseType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. ����������
     * 
     * @return value
     */
    public OrganizationBaseType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ����������
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationBaseType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'Desinfestation' element value. ���������������
     * 
     * @return value
     */
    public DesinfestationType getDesinfestation() {
        return desinfestation;
    }

    /** 
     * Set the 'Desinfestation' element value. ���������������
     * 
     * @param desinfestation
     */
    public void setDesinfestation(DesinfestationType desinfestation) {
        this.desinfestation = desinfestation;
    }
}
