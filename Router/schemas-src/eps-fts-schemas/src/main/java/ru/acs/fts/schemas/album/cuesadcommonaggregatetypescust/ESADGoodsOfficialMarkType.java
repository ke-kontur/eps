
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �� � ��. ���������� ������. ��������� ������� �� ������
 */
public class ESADGoodsOfficialMarkType
{
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String informationTypeCode;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String personName;
    private String LNP;
    private LocalDate reqCompletionDate;
    private String reqCompletionTime;
    private String documentIndicator;
    private LocalDate deadline;
    private String deadlineMonth;

    /** 
     * Get the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @return value
     */
    public String getStageMarkIdentifier() {
        return stageMarkIdentifier;
    }

    /** 
     * Set the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @param stageMarkIdentifier
     */
    public void setStageMarkIdentifier(String stageMarkIdentifier) {
        this.stageMarkIdentifier = stageMarkIdentifier;
    }

    /** 
     * Get the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @return value
     */
    public String getNoteMarkIdentifier() {
        return noteMarkIdentifier;
    }

    /** 
     * Set the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @param noteMarkIdentifier
     */
    public void setNoteMarkIdentifier(String noteMarkIdentifier) {
        this.noteMarkIdentifier = noteMarkIdentifier;
    }

    /** 
     * Get the 'InformationTypeCode' element value. ��� ���� ����������  (SKRECC)
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. ��� ���� ����������  (SKRECC)
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. ���� / ���� �������� ������� � ����������� ���������� / ��������������� ������� ������� 
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� / ���� �������� ������� � ����������� ���������� / ��������������� ������� ������� 
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. �����
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. �����
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'ReqCompletionDate' element value. ���� ���������� ���������� (�������������� ����������) ����������� / ����, �� ������� ������������� ������ �������
     * 
     * @return value
     */
    public LocalDate getReqCompletionDate() {
        return reqCompletionDate;
    }

    /** 
     * Set the 'ReqCompletionDate' element value. ���� ���������� ���������� (�������������� ����������) ����������� / ����, �� ������� ������������� ������ �������
     * 
     * @param reqCompletionDate
     */
    public void setReqCompletionDate(LocalDate reqCompletionDate) {
        this.reqCompletionDate = reqCompletionDate;
    }

    /** 
     * Get the 'ReqCompletionTime' element value. �����
     * 
     * @return value
     */
    public String getReqCompletionTime() {
        return reqCompletionTime;
    }

    /** 
     * Set the 'ReqCompletionTime' element value. �����
     * 
     * @param reqCompletionTime
     */
    public void setReqCompletionTime(String reqCompletionTime) {
        this.reqCompletionTime = reqCompletionTime;
    }

    /** 
     * Get the 'DocumentIndicator' element value. ������� ��������� / ��������� ������. ����������� ��� ������������ ������� � ����� C ��� ������� 12 (C 2 12)   ("0"-�������� � ������ ���������; "1"-�������� � ������ �� ���������)
     * 
     * @return value
     */
    public String getDocumentIndicator() {
        return documentIndicator;
    }

    /** 
     * Set the 'DocumentIndicator' element value. ������� ��������� / ��������� ������. ����������� ��� ������������ ������� � ����� C ��� ������� 12 (C 2 12)   ("0"-�������� � ������ ���������; "1"-�������� � ������ �� ���������)
     * 
     * @param documentIndicator
     */
    public void setDocumentIndicator(String documentIndicator) {
        this.documentIndicator = documentIndicator;
    }

    /** 
     * Get the 'Deadline' element value. ����
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. ����
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'DeadlineMonth' element value. ���� ��������� / ����� � �������
     * 
     * @return value
     */
    public String getDeadlineMonth() {
        return deadlineMonth;
    }

    /** 
     * Set the 'DeadlineMonth' element value. ���� ��������� / ����� � �������
     * 
     * @param deadlineMonth
     */
    public void setDeadlineMonth(String deadlineMonth) {
        this.deadlineMonth = deadlineMonth;
    }
}
