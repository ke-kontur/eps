
package ru.acs.fts.schemas.album.atdclosecontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID6Type;

/** 
 * �������� ���������� ��������  ���
 */
public class ATDCloseControlType extends BaseDocType
{
    private LocalDate checkDate;
    private String checkTime;
    private LocalDate endCheckDate;
    private String DBVersion;
    private String errorCount;
    private String reasonCode;
    private String explanation;
    private LocalDate explanationDate;
    private String ATDGlobalID;
    private DocumentType document;
    private PSCheckType PSCheck;
    private List<PZKErrorsType> PZKErrorList = new ArrayList<PZKErrorsType>();
    private GTDID6Type ATDRegNumder;
    private String documentModeID;

    /** 
     * Get the 'CheckDate' element value. ���� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getCheckDate() {
        return checkDate;
    }

    /** 
     * Set the 'CheckDate' element value. ���� ���������� ��������
     * 
     * @param checkDate
     */
    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    /** 
     * Get the 'CheckTime' element value. ����� ���������� ��������
     * 
     * @return value
     */
    public String getCheckTime() {
        return checkTime;
    }

    /** 
     * Set the 'CheckTime' element value. ����� ���������� ��������
     * 
     * @param checkTime
     */
    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    /** 
     * Get the 'EndCheckDate' element value. ����, �� ������� ��������� ��������. �����������, ���� ������� �� ���� ����������� ��������� ��� ���� ��������
     * 
     * @return value
     */
    public LocalDate getEndCheckDate() {
        return endCheckDate;
    }

    /** 
     * Set the 'EndCheckDate' element value. ����, �� ������� ��������� ��������. �����������, ���� ������� �� ���� ����������� ��������� ��� ���� ��������
     * 
     * @param endCheckDate
     */
    public void setEndCheckDate(LocalDate endCheckDate) {
        this.endCheckDate = endCheckDate;
    }

    /** 
     * Get the 'DBVersion' element value. ������ ��������� ����������� ������� ����������� ����� ��� 
     * 
     * @return value
     */
    public String getDBVersion() {
        return DBVersion;
    }

    /** 
     * Set the 'DBVersion' element value. ������ ��������� ����������� ������� ����������� ����� ��� 
     * 
     * @param DBVersion
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /** 
     * Get the 'ErrorCount' element value. ����� ���������� ������ ���
     * 
     * @return value
     */
    public String getErrorCount() {
        return errorCount;
    }

    /** 
     * Set the 'ErrorCount' element value. ����� ���������� ������ ���
     * 
     * @param errorCount
     */
    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }

    /** 
     * Get the 'ReasonCode' element value. ��� ������� ��������� �������� ����������� ����� �� ����� �� �������� � ������������ ������ �������
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. ��� ������� ��������� �������� ����������� ����� �� ����� �� �������� � ������������ ������ �������
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the 'Explanation' element value. ���������� ���������� � ����������������� ��� ��������� ������������� ���������� �� ����������� ���
     * 
     * @return value
     */
    public String getExplanation() {
        return explanation;
    }

    /** 
     * Set the 'Explanation' element value. ���������� ���������� � ����������������� ��� ��������� ������������� ���������� �� ����������� ���
     * 
     * @param explanation
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /** 
     * Get the 'ExplanationDate' element value. ���� �������� ���������� ����������� � ����������������� ��� ��������� ������������� ���������� �� ����������� ���
     * 
     * @return value
     */
    public LocalDate getExplanationDate() {
        return explanationDate;
    }

    /** 
     * Set the 'ExplanationDate' element value. ���� �������� ���������� ����������� � ����������������� ��� ��������� ������������� ���������� �� ����������� ���
     * 
     * @param explanationDate
     */
    public void setExplanationDate(LocalDate explanationDate) {
        this.explanationDate = explanationDate;
    }

    /** 
     * Get the 'ATDGlobalID' element value. ���������� ������������� ���� ����������� ��������
     * 
     * @return value
     */
    public String getATDGlobalID() {
        return ATDGlobalID;
    }

    /** 
     * Set the 'ATDGlobalID' element value. ���������� ������������� ���� ����������� ��������
     * 
     * @param ATDGlobalID
     */
    public void setATDGlobalID(String ATDGlobalID) {
        this.ATDGlobalID = ATDGlobalID;
    }

    /** 
     * Get the 'Document' element value. ����������� ����������� ���������� ��������
     * 
     * @return value
     */
    public DocumentType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. ����������� ����������� ���������� ��������
     * 
     * @param document
     */
    public void setDocument(DocumentType document) {
        this.document = document;
    }

    /** 
     * Get the 'PSCheck' element value. ����������� ��������, ����������� ��������
     * 
     * @return value
     */
    public PSCheckType getPSCheck() {
        return PSCheck;
    }

    /** 
     * Set the 'PSCheck' element value. ����������� ��������, ����������� ��������
     * 
     * @param PSCheck
     */
    public void setPSCheck(PSCheckType PSCheck) {
        this.PSCheck = PSCheck;
    }

    /** 
     * Get the list of 'PZKErrors' element items. ������
     * 
     * @return list
     */
    public List<PZKErrorsType> getPZKErrorList() {
        return PZKErrorList;
    }

    /** 
     * Set the list of 'PZKErrors' element items. ������
     * 
     * @param list
     */
    public void setPZKErrorList(List<PZKErrorsType> list) {
        PZKErrorList = list;
    }

    /** 
     * Get the 'ATDRegNumder' element value. ��������������� ����� ���
     * 
     * @return value
     */
    public GTDID6Type getATDRegNumder() {
        return ATDRegNumder;
    }

    /** 
     * Set the 'ATDRegNumder' element value. ��������������� ����� ���
     * 
     * @param ATDRegNumder
     */
    public void setATDRegNumder(GTDID6Type ATDRegNumder) {
        this.ATDRegNumder = ATDRegNumder;
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
