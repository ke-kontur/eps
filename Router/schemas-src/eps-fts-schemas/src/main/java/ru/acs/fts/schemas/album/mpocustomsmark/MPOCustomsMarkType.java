
package ru.acs.fts.schemas.album.mpocustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� �� ���
 */
public class MPOCustomsMarkType extends BaseDocType
{
    private LocalDate decisionDate;
    private String decisionTime;
    private String decision;
    private String decisionDescription;
    private List<String> commentList = new ArrayList<String>();
    private LocalDate prolongDate;
    private MPORegistrationType MPORegistration;
    private PersonSignatureType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. ���� ������� 
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� ������� 
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. ����� ������� 
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. ����� ������� 
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the 'Decision' element value. �������: 1 - ������ ������� ��������; 2 - ������ ������� �������� ��� ������ ���������� ��������; 3 - ������ �������� � ������������ ������� ���������� ��������; 4 - ������;  5 - ������ �������� ����������� �������������� � ����������� ���������� �� ������;  6 - ������������ ������� �������
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������: 1 - ������ ������� ��������; 2 - ������ ������� �������� ��� ������ ���������� ��������; 3 - ������ �������� � ������������ ������� ���������� ��������; 4 - ������;  5 - ������ �������� ����������� �������������� � ����������� ���������� �� ������;  6 - ������������ ������� �������
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DecisionDescription' element value. �������� ��������� �������
     * 
     * @return value
     */
    public String getDecisionDescription() {
        return decisionDescription;
    }

    /** 
     * Set the 'DecisionDescription' element value. �������� ��������� �������
     * 
     * @param decisionDescription
     */
    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    /** 
     * Get the list of 'Comments' element items. �����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. �����������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'ProlongDate' element value. ���� ��������� ������� �������
     * 
     * @return value
     */
    public LocalDate getProlongDate() {
        return prolongDate;
    }

    /** 
     * Set the 'ProlongDate' element value. ���� ��������� ������� �������
     * 
     * @param prolongDate
     */
    public void setProlongDate(LocalDate prolongDate) {
        this.prolongDate = prolongDate;
    }

    /** 
     * Get the 'MPO_Registration' element value. �������� � ��������������� ������ ���
     * 
     * @return value
     */
    public MPORegistrationType getMPORegistration() {
        return MPORegistration;
    }

    /** 
     * Set the 'MPO_Registration' element value. �������� � ��������������� ������ ���
     * 
     * @param MPORegistration
     */
    public void setMPORegistration(MPORegistrationType MPORegistration) {
        this.MPORegistration = MPORegistration;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
