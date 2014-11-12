
package ru.acs.fts.schemas.album.declarationstatus;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������������� �������� � ��������� ���������� ����������
 */
public class DeclarationStatusType extends BaseDocType
{
    private String comments;
    private String statusDescription;
    private String additionalID;
    private String decisionCode;
    private GTDIDType declarationRegNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

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
     * Get the 'StatusDescription' element value. �������� ��������� ���������� ����������
     * 
     * @return value
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /** 
     * Set the 'StatusDescription' element value. �������� ��������� ���������� ����������
     * 
     * @param statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /** 
     * Get the 'AdditionalID' element value. ���������� �������������, ������������� ���������� � �������� �������������� ��� �����������
     * 
     * @return value
     */
    public String getAdditionalID() {
        return additionalID;
    }

    /** 
     * Set the 'AdditionalID' element value. ���������� �������������, ������������� ���������� � �������� �������������� ��� �����������
     * 
     * @param additionalID
     */
    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
    }

    /** 
     * Get the 'DecisionCode' element value. ��� ������� � ������������ � ��������������� �������,  ����������� ����������� ��������
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. ��� ������� � ������������ � ��������������� �������,  ����������� ����������� ��������
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'DeclarationRegNumber' element value. ��������������� ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getDeclarationRegNumber() {
        return declarationRegNumber;
    }

    /** 
     * Set the 'DeclarationRegNumber' element value. ��������������� ����� ���������� ����������
     * 
     * @param declarationRegNumber
     */
    public void setDeclarationRegNumber(GTDIDType declarationRegNumber) {
        this.declarationRegNumber = declarationRegNumber;
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
