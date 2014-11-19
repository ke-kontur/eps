
package ru.acs.fts.schemas.album.notifarrivalintegrityseal;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ����������� � �������� � �����������/��������� �����
 */
public class NotifArrivalIntegritySealType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private LocalDate acceptDate;
    private String acceptTime;
    private String modificationSign;
    private CUOrganizationType economicOperator;
    private IdentifModificationType identifModification;
    private CUOrganizationType carrier;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. ���� �������� �����������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������� �����������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. ����� �������� �����������
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ����� �������� �����������
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'AcceptDate' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getAcceptDate() {
        return acceptDate;
    }

    /** 
     * Set the 'AcceptDate' element value. ���� �������� �������
     * 
     * @param acceptDate
     */
    public void setAcceptDate(LocalDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    /** 
     * Get the 'AcceptTime' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /** 
     * Set the 'AcceptTime' element value. ����� �������� �������
     * 
     * @param acceptTime
     */
    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    /** 
     * Get the 'ModificationSign' element value. ������� ����, ��� �������� ������������� ��������
     * 
     * @return value
     */
    public String getModificationSign() {
        return modificationSign;
    }

    /** 
     * Set the 'ModificationSign' element value. ������� ����, ��� �������� ������������� ��������
     * 
     * @param modificationSign
     */
    public void setModificationSign(String modificationSign) {
        this.modificationSign = modificationSign;
    }

    /** 
     * Get the 'EconomicOperator' element value. �������������� ������������� ��������
     * 
     * @return value
     */
    public CUOrganizationType getEconomicOperator() {
        return economicOperator;
    }

    /** 
     * Set the 'EconomicOperator' element value. �������������� ������������� ��������
     * 
     * @param economicOperator
     */
    public void setEconomicOperator(CUOrganizationType economicOperator) {
        this.economicOperator = economicOperator;
    }

    /** 
     * Get the 'IdentifModification' element value. ��������� ������� �������������
     * 
     * @return value
     */
    public IdentifModificationType getIdentifModification() {
        return identifModification;
    }

    /** 
     * Set the 'IdentifModification' element value. ��������� ������� �������������
     * 
     * @param identifModification
     */
    public void setIdentifModification(
            IdentifModificationType identifModification) {
        this.identifModification = identifModification;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
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
