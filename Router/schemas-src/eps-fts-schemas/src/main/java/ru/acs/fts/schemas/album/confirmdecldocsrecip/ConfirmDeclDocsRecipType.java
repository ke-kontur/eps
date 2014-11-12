
package ru.acs.fts.schemas.album.confirmdecldocsrecip;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.exchangecommonaggregatetypescust.DeclPersonType;
import ru.acs.fts.schemas.album.exchangecommonaggregatetypescust.RecipDocumentType;

/** 
 * ������������� ��������� ����������� ���������� �� �����
 */
public class ConfirmDeclDocsRecipType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String comments;
    private List<RecipDocumentType> recipDocumentList = new ArrayList<RecipDocumentType>();
    private OrganizationType declarant;
    private DeclPersonType declPerson;
    private DeclDecisionType declDecision;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� �������� �������������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �������� �������������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. ����� �������� �������������
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. ����� �������� �������������
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
     * Get the list of 'RecipDocument' element items. ���������� � ���������� ����������.
     * 
     * @return list
     */
    public List<RecipDocumentType> getRecipDocumentList() {
        return recipDocumentList;
    }

    /** 
     * Set the list of 'RecipDocument' element items. ���������� � ���������� ����������.
     * 
     * @param list
     */
    public void setRecipDocumentList(List<RecipDocumentType> list) {
        recipDocumentList = list;
    }

    /** 
     * Get the 'Declarant' element value. �������� �� ����������� - ����������
     * 
     * @return value
     */
    public OrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� �� ����������� - ����������
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'DeclPerson' element value. �������� � ����, ��������� �������������.
     * 
     * @return value
     */
    public DeclPersonType getDeclPerson() {
        return declPerson;
    }

    /** 
     * Set the 'DeclPerson' element value. �������� � ����, ��������� �������������.
     * 
     * @param declPerson
     */
    public void setDeclPerson(DeclPersonType declPerson) {
        this.declPerson = declPerson;
    }

    /** 
     * Get the 'DeclDecision' element value. ������� ����������. (����������� � ������ ��������� ����������� � ���������� ������������ ��������)
     * 
     * @return value
     */
    public DeclDecisionType getDeclDecision() {
        return declDecision;
    }

    /** 
     * Set the 'DeclDecision' element value. ������� ����������. (����������� � ������ ��������� ����������� � ���������� ������������ ��������)
     * 
     * @param declDecision
     */
    public void setDeclDecision(DeclDecisionType declDecision) {
        this.declDecision = declDecision;
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
