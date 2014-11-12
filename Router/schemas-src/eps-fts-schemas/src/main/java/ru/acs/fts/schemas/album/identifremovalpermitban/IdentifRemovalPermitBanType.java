
package ru.acs.fts.schemas.album.identifremovalpermitban;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ����������/������ �� ������ ������� �������������
 */
public class IdentifRemovalPermitBanType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private String decision;
    private String documentNumber;
    private String comment;
    private CUOrganizationType economicOperator;
    private CustomsPersonType customsOfficer;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������� �������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ����� �������� �������
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'Decision' element value. �������� ������� �� ������ ������� �������������: 0 - ������; 1 - ����������
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������� ������� �� ������ ������� �������������: 0 - ������; 1 - ����������
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ������������� � ������ ���������� ����������/����� ��������������� ���������� �� ������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ������������� � ������ ���������� ����������/����� ��������������� ���������� �� ������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'Comment' element value. ����������� �� ��������� �������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. ����������� �� ��������� �������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * Get the 'CustomsOfficer' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficer() {
        return customsOfficer;
    }

    /** 
     * Set the 'CustomsOfficer' element value. ����������� ���� ����������� ������
     * 
     * @param customsOfficer
     */
    public void setCustomsOfficer(CustomsPersonType customsOfficer) {
        this.customsOfficer = customsOfficer;
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
