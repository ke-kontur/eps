
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ������������� ��������/���������
 */
public class InspectionType
{
    private String inspectionID;
    private String inspectionDateTime;
    private String instrumentalControlID;
    private String documentalControlID;
    private String violationControlID;
    private String belarusControlID;
    private String kazakhControlID;
    private String decisionName;
    private String endDateTime;
    private String information;
    private String isInstrumental;
    private String isVisual;
    private String isDocumental;
    private List<String> violationList = new ArrayList<String>();
    private CheckPointType checkPoint;
    private InstrumentalControlType instrumentalControl;
    private VisualControlType visualControl;
    private DocumentalControlType documentalControl;
    private RBKZControlType belarusControl;
    private RBKZControlType kazakhControl;
    private List<NotifDocumentType> notifDocumentList = new ArrayList<NotifDocumentType>();
    private AccountCodeType accountCode;
    private PostPenaltyType postPenalty;

    /** 
     * Get the 'InspectionID' element value. ������������� ���������/������������� ��������
     * 
     * @return value
     */
    public String getInspectionID() {
        return inspectionID;
    }

    /** 
     * Set the 'InspectionID' element value. ������������� ���������/������������� ��������
     * 
     * @param inspectionID
     */
    public void setInspectionID(String inspectionID) {
        this.inspectionID = inspectionID;
    }

    /** 
     * Get the 'InspectionDateTime' element value. ����/����� ���������
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. ����/����� ���������
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'InstrumentalControlID' element value. ������������� ����������������� ��������
     * 
     * @return value
     */
    public String getInstrumentalControlID() {
        return instrumentalControlID;
    }

    /** 
     * Set the 'InstrumentalControlID' element value. ������������� ����������������� ��������
     * 
     * @param instrumentalControlID
     */
    public void setInstrumentalControlID(String instrumentalControlID) {
        this.instrumentalControlID = instrumentalControlID;
    }

    /** 
     * Get the 'DocumentalControlID' element value. ������������� ��������������� ��������
     * 
     * @return value
     */
    public String getDocumentalControlID() {
        return documentalControlID;
    }

    /** 
     * Set the 'DocumentalControlID' element value. ������������� ��������������� ��������
     * 
     * @param documentalControlID
     */
    public void setDocumentalControlID(String documentalControlID) {
        this.documentalControlID = documentalControlID;
    }

    /** 
     * Get the 'ViolationControlID' element value. ������������� ����� ��������
     * 
     * @return value
     */
    public String getViolationControlID() {
        return violationControlID;
    }

    /** 
     * Set the 'ViolationControlID' element value. ������������� ����� ��������
     * 
     * @param violationControlID
     */
    public void setViolationControlID(String violationControlID) {
        this.violationControlID = violationControlID;
    }

    /** 
     * Get the 'BelarusControlID' element value. ������������� ������������ ��������
     * 
     * @return value
     */
    public String getBelarusControlID() {
        return belarusControlID;
    }

    /** 
     * Set the 'BelarusControlID' element value. ������������� ������������ ��������
     * 
     * @param belarusControlID
     */
    public void setBelarusControlID(String belarusControlID) {
        this.belarusControlID = belarusControlID;
    }

    /** 
     * Get the 'KazakhControlID' element value. ������������� �������������� ��������
     * 
     * @return value
     */
    public String getKazakhControlID() {
        return kazakhControlID;
    }

    /** 
     * Set the 'KazakhControlID' element value. ������������� �������������� ��������
     * 
     * @param kazakhControlID
     */
    public void setKazakhControlID(String kazakhControlID) {
        this.kazakhControlID = kazakhControlID;
    }

    /** 
     * Get the 'DecisionName' element value. �������, �������� �� ����������� ��������
     * 
     * @return value
     */
    public String getDecisionName() {
        return decisionName;
    }

    /** 
     * Set the 'DecisionName' element value. �������, �������� �� ����������� ��������
     * 
     * @param decisionName
     */
    public void setDecisionName(String decisionName) {
        this.decisionName = decisionName;
    }

    /** 
     * Get the 'EndDateTime' element value. ����/����� ��������� ������������� ��������
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. ����/����� ��������� ������������� ��������
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'Information' element value. ���������� ���������� ������������� ��������
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. ���������� ���������� ������������� ��������
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'IsInstrumental' element value. ������� ����������������� ��������
     * 
     * @return value
     */
    public String getIsInstrumental() {
        return isInstrumental;
    }

    /** 
     * Set the 'IsInstrumental' element value. ������� ����������������� ��������
     * 
     * @param isInstrumental
     */
    public void setIsInstrumental(String isInstrumental) {
        this.isInstrumental = isInstrumental;
    }

    /** 
     * Get the 'IsVisual' element value. ������� ����������� ��������
     * 
     * @return value
     */
    public String getIsVisual() {
        return isVisual;
    }

    /** 
     * Set the 'IsVisual' element value. ������� ����������� ��������
     * 
     * @param isVisual
     */
    public void setIsVisual(String isVisual) {
        this.isVisual = isVisual;
    }

    /** 
     * Get the 'IsDocumental' element value. ������� ��������������� ��������
     * 
     * @return value
     */
    public String getIsDocumental() {
        return isDocumental;
    }

    /** 
     * Set the 'IsDocumental' element value. ������� ��������������� ��������
     * 
     * @param isDocumental
     */
    public void setIsDocumental(String isDocumental) {
        this.isDocumental = isDocumental;
    }

    /** 
     * Get the list of 'Violation' element items. ���������� � �������� ���������
     * 
     * @return list
     */
    public List<String> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. ���������� � �������� ���������
     * 
     * @param list
     */
    public void setViolationList(List<String> list) {
        violationList = list;
    }

    /** 
     * Get the 'CheckPoint' element value. ���� (����� ��������), ��� ������������� ������������ ��������
     * 
     * @return value
     */
    public CheckPointType getCheckPoint() {
        return checkPoint;
    }

    /** 
     * Set the 'CheckPoint' element value. ���� (����� ��������), ��� ������������� ������������ ��������
     * 
     * @param checkPoint
     */
    public void setCheckPoint(CheckPointType checkPoint) {
        this.checkPoint = checkPoint;
    }

    /** 
     * Get the 'InstrumentalControl' element value. �������� �� ����������������� ��������
     * 
     * @return value
     */
    public InstrumentalControlType getInstrumentalControl() {
        return instrumentalControl;
    }

    /** 
     * Set the 'InstrumentalControl' element value. �������� �� ����������������� ��������
     * 
     * @param instrumentalControl
     */
    public void setInstrumentalControl(
            InstrumentalControlType instrumentalControl) {
        this.instrumentalControl = instrumentalControl;
    }

    /** 
     * Get the 'VisualControl' element value. �������� �� ����������� ��������
     * 
     * @return value
     */
    public VisualControlType getVisualControl() {
        return visualControl;
    }

    /** 
     * Set the 'VisualControl' element value. �������� �� ����������� ��������
     * 
     * @param visualControl
     */
    public void setVisualControl(VisualControlType visualControl) {
        this.visualControl = visualControl;
    }

    /** 
     * Get the 'DocumentalControl' element value. �������� �� ��������������� ��������
     * 
     * @return value
     */
    public DocumentalControlType getDocumentalControl() {
        return documentalControl;
    }

    /** 
     * Set the 'DocumentalControl' element value. �������� �� ��������������� ��������
     * 
     * @param documentalControl
     */
    public void setDocumentalControl(DocumentalControlType documentalControl) {
        this.documentalControl = documentalControl;
    }

    /** 
     * Get the 'BelarusControl' element value. �������� �� ����� ������������� �������� ���������� ��������
     * 
     * @return value
     */
    public RBKZControlType getBelarusControl() {
        return belarusControl;
    }

    /** 
     * Set the 'BelarusControl' element value. �������� �� ����� ������������� �������� ���������� ��������
     * 
     * @param belarusControl
     */
    public void setBelarusControl(RBKZControlType belarusControl) {
        this.belarusControl = belarusControl;
    }

    /** 
     * Get the 'KazakhControl' element value. �������� �� ����� ������������� �������� ���������� ���������
     * 
     * @return value
     */
    public RBKZControlType getKazakhControl() {
        return kazakhControl;
    }

    /** 
     * Set the 'KazakhControl' element value. �������� �� ����� ������������� �������� ���������� ���������
     * 
     * @param kazakhControl
     */
    public void setKazakhControl(RBKZControlType kazakhControl) {
        this.kazakhControl = kazakhControl;
    }

    /** 
     * Get the list of 'NotifDocument' element items. �������� �� �����������
     * 
     * @return list
     */
    public List<NotifDocumentType> getNotifDocumentList() {
        return notifDocumentList;
    }

    /** 
     * Set the list of 'NotifDocument' element items. �������� �� �����������
     * 
     * @param list
     */
    public void setNotifDocumentList(List<NotifDocumentType> list) {
        notifDocumentList = list;
    }

    /** 
     * Get the 'AccountCode' element value. ������� �����
     * 
     * @return value
     */
    public AccountCodeType getAccountCode() {
        return accountCode;
    }

    /** 
     * Set the 'AccountCode' element value. ������� �����
     * 
     * @param accountCode
     */
    public void setAccountCode(AccountCodeType accountCode) {
        this.accountCode = accountCode;
    }

    /** 
     * Get the 'PostPenalty' element value. �������� �� ������ ������ � ��
     * 
     * @return value
     */
    public PostPenaltyType getPostPenalty() {
        return postPenalty;
    }

    /** 
     * Set the 'PostPenalty' element value. �������� �� ������ ������ � ��
     * 
     * @param postPenalty
     */
    public void setPostPenalty(PostPenaltyType postPenalty) {
        this.postPenalty = postPenalty;
    }
}
