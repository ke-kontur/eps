
package ru.acs.fts.schemas.album.tsdecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ������� �� ���������� ���������
 */
public class TSDecisionType extends BaseDocType
{
    private String decisionIndicator;
    private String decisionText;
    private String decisionDateTime;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DecisionIndicator' element value. ������� �������� ���������� ���������
     * 
     * @return value
     */
    public String getDecisionIndicator() {
        return decisionIndicator;
    }

    /** 
     * Set the 'DecisionIndicator' element value. ������� �������� ���������� ���������
     * 
     * @param decisionIndicator
     */
    public void setDecisionIndicator(String decisionIndicator) {
        this.decisionIndicator = decisionIndicator;
    }

    /** 
     * Get the 'DecisionText' element value. ��������� �������� ������� �� ���������� ���������
     * 
     * @return value
     */
    public String getDecisionText() {
        return decisionText;
    }

    /** 
     * Set the 'DecisionText' element value. ��������� �������� ������� �� ���������� ���������
     * 
     * @param decisionText
     */
    public void setDecisionText(String decisionText) {
        this.decisionText = decisionText;
    }

    /** 
     * Get the 'DecisionDateTime' element value. ���� � ����� �������� ������� �� ���������� ���������
     * 
     * @return value
     */
    public String getDecisionDateTime() {
        return decisionDateTime;
    }

    /** 
     * Set the 'DecisionDateTime' element value. ���� � ����� �������� ������� �� ���������� ���������
     * 
     * @param decisionDateTime
     */
    public void setDecisionDateTime(String decisionDateTime) {
        this.decisionDateTime = decisionDateTime;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������, ���������� ������� �� ���������� ���������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������, ���������� ������� �� ���������� ���������
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
