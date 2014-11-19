
package ru.acs.fts.schemas.album.declchangedecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ������� � �������� ��������� (����������) � ��������, ��������� � ���������� �� ������
 */
public class DeclChangeDecisionType extends BaseDocType
{
    private LocalDate decisionDate;
    private String paragraph;
    private String subparagraph;
    private List<String> decisionFoundationList = new ArrayList<String>();
    private LocalDate dateLimit;
    private String releaseSign;
    private CUOrganizationType declarant;
    private CustomsType customs;
    private CustomsType KDTCustoms;
    private List<ChangesDescriptionType> changesDescriptionList = new ArrayList<ChangesDescriptionType>();
    private CustomsPersonType customsPerson;
    private SignatureInfoType sendInfo;
    private SignatureInfoType receiveInfo;
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
     * Get the 'Paragraph' element value. ����� ������ ������������ ���������
     * 
     * @return value
     */
    public String getParagraph() {
        return paragraph;
    }

    /** 
     * Set the 'Paragraph' element value. ����� ������ ������������ ���������
     * 
     * @param paragraph
     */
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    /** 
     * Get the 'Subparagraph' element value. ����� ��������� ������������ ���������
     * 
     * @return value
     */
    public String getSubparagraph() {
        return subparagraph;
    }

    /** 
     * Set the 'Subparagraph' element value. ����� ��������� ������������ ���������
     * 
     * @param subparagraph
     */
    public void setSubparagraph(String subparagraph) {
        this.subparagraph = subparagraph;
    }

    /** 
     * Get the list of 'DecisionFoundation' element items. ��������� �������� ��������� � ��
     * 
     * @return list
     */
    public List<String> getDecisionFoundationList() {
        return decisionFoundationList;
    }

    /** 
     * Set the list of 'DecisionFoundation' element items. ��������� �������� ��������� � ��
     * 
     * @param list
     */
    public void setDecisionFoundationList(List<String> list) {
        decisionFoundationList = list;
    }

    /** 
     * Get the 'DateLimit' element value. ���� �������������� ������������� ����������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� �������������� ������������� ����������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'ReleaseSign' element value. ������� �������� ������� � �������� ��������� � ���������� �� ������ ����� ������� (1 - ����� �������, 0 - �� �������)
     * 
     * @return value
     */
    public String getReleaseSign() {
        return releaseSign;
    }

    /** 
     * Set the 'ReleaseSign' element value. ������� �������� ������� � �������� ��������� � ���������� �� ������ ����� ������� (1 - ����� �������, 0 - �� �������)
     * 
     * @param releaseSign
     */
    public void setReleaseSign(String releaseSign) {
        this.releaseSign = releaseSign;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
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
     * Get the 'KDTCustoms' element value. ���������� ����, �� ������� ������� ������������ ���
     * 
     * @return value
     */
    public CustomsType getKDTCustoms() {
        return KDTCustoms;
    }

    /** 
     * Set the 'KDTCustoms' element value. ���������� ����, �� ������� ������� ������������ ���
     * 
     * @param KDTCustoms
     */
    public void setKDTCustoms(CustomsType KDTCustoms) {
        this.KDTCustoms = KDTCustoms;
    }

    /** 
     * Get the list of 'ChangesDescription' element items. �������� ����������� ��������� (����������)
     * 
     * @return list
     */
    public List<ChangesDescriptionType> getChangesDescriptionList() {
        return changesDescriptionList;
    }

    /** 
     * Set the list of 'ChangesDescription' element items. �������� ����������� ��������� (����������)
     * 
     * @param list
     */
    public void setChangesDescriptionList(List<ChangesDescriptionType> list) {
        changesDescriptionList = list;
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
     * Get the 'SendInfo' element value. �������� � ����������� �������
     * 
     * @return value
     */
    public SignatureInfoType getSendInfo() {
        return sendInfo;
    }

    /** 
     * Set the 'SendInfo' element value. �������� � ����������� �������
     * 
     * @param sendInfo
     */
    public void setSendInfo(SignatureInfoType sendInfo) {
        this.sendInfo = sendInfo;
    }

    /** 
     * Get the 'ReceiveInfo' element value. �������� � ��������� �������
     * 
     * @return value
     */
    public SignatureInfoType getReceiveInfo() {
        return receiveInfo;
    }

    /** 
     * Set the 'ReceiveInfo' element value. �������� � ��������� �������
     * 
     * @param receiveInfo
     */
    public void setReceiveInfo(SignatureInfoType receiveInfo) {
        this.receiveInfo = receiveInfo;
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
