
package ru.acs.fts.schemas.album.transitdatelimit;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������/����������� � ��������� ����� ����������� ��������
 */
public class TransitDateLimitType extends BaseDocType
{
    private String documentSign;
    private LocalDate docDate;
    private String docTime;
    private LocalDate dateLimit;
    private String reason;
    private int choiceSelect = -1;
    private static final int TD_CHOICE = 0;
    private static final int TIRID_CHOICE = 1;
    private GTDIDType TD;
    private TIRIDType TIRID;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. ������� ��������� � ��������� ����� ����������� ��������: 0 - ���������; 1 - �����������
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. ������� ��������� � ��������� ����� ����������� ��������: 0 - ���������; 1 - �����������
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'DocDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. ���� ����������� ���������
     * 
     * @param docDate
     */
    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    /** 
     * Get the 'DocTime' element value. ����� ����������� ���������
     * 
     * @return value
     */
    public String getDocTime() {
        return docTime;
    }

    /** 
     * Set the 'DocTime' element value. ����� ����������� ���������
     * 
     * @param docTime
     */
    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    /** 
     * Get the 'DateLimit' element value. ���� ��������� ����������� ��������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� ��������� ����������� ��������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'Reason' element value. ������� ��������� ����� ����������� ��������
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ������� ��������� ����� ����������� ��������
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if TD is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTD() {
        return choiceSelect == TD_CHOICE;
    }

    /** 
     * Get the 'TD' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. ����� ���������� ����������
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        setChoiceSelect(TD_CHOICE);
        this.TD = TD;
    }

    /** 
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. ����� ������ ���
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. ����� ������ ���
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
