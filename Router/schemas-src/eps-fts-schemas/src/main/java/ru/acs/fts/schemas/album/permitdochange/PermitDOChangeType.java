
package ru.acs.fts.schemas.album.permitdochange;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHDocumentRegisterNumberType;

/** 
 * �������� �������������� ���������� � ���������� ���
 */
public class PermitDOChangeType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String comments;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private int choiceSelect = -1;
    private static final int DO_REGISTER_NUMBER_CHOICE = 0;
    private static final int DOCUMENT_REG_NUMBER_CHOICE = 1;
    private WHDocumentRegisterNumberType DORegisterNumber;
    private DocumentBaseType documentRegNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. ����� �����������
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
     * Check if DORegisterNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDORegisterNumber() {
        return choiceSelect == DO_REGISTER_NUMBER_CHOICE;
    }

    /** 
     * Get the 'DORegisterNumber' element value. ��������������� ����� ������ ��1/��2/��3 
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getDORegisterNumber() {
        return DORegisterNumber;
    }

    /** 
     * Set the 'DORegisterNumber' element value. ��������������� ����� ������ ��1/��2/��3 
     * 
     * @param DORegisterNumber
     */
    public void setDORegisterNumber(
            WHDocumentRegisterNumberType DORegisterNumber) {
        setChoiceSelect(DO_REGISTER_NUMBER_CHOICE);
        this.DORegisterNumber = DORegisterNumber;
    }

    /** 
     * Check if DocumentRegNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocumentRegNumber() {
        return choiceSelect == DOCUMENT_REG_NUMBER_CHOICE;
    }

    /** 
     * Get the 'DocumentRegNumber' element value. ��������������� ����� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentRegNumber() {
        return documentRegNumber;
    }

    /** 
     * Set the 'DocumentRegNumber' element value. ��������������� ����� ���������
     * 
     * @param documentRegNumber
     */
    public void setDocumentRegNumber(DocumentBaseType documentRegNumber) {
        setChoiceSelect(DOCUMENT_REG_NUMBER_CHOICE);
        this.documentRegNumber = documentRegNumber;
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
