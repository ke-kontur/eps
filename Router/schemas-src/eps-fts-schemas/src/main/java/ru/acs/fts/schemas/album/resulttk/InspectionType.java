
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;

/** 
 * Данные транспортного контроля/инспекции
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
     * Get the 'InspectionID' element value. Идентификатор инспекции/транспортного контроля
     * 
     * @return value
     */
    public String getInspectionID() {
        return inspectionID;
    }

    /** 
     * Set the 'InspectionID' element value. Идентификатор инспекции/транспортного контроля
     * 
     * @param inspectionID
     */
    public void setInspectionID(String inspectionID) {
        this.inspectionID = inspectionID;
    }

    /** 
     * Get the 'InspectionDateTime' element value. Дата/время инспекции
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. Дата/время инспекции
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'InstrumentalControlID' element value. Идентификатор инструментального контроля
     * 
     * @return value
     */
    public String getInstrumentalControlID() {
        return instrumentalControlID;
    }

    /** 
     * Set the 'InstrumentalControlID' element value. Идентификатор инструментального контроля
     * 
     * @param instrumentalControlID
     */
    public void setInstrumentalControlID(String instrumentalControlID) {
        this.instrumentalControlID = instrumentalControlID;
    }

    /** 
     * Get the 'DocumentalControlID' element value. Идентификатор документального контроля
     * 
     * @return value
     */
    public String getDocumentalControlID() {
        return documentalControlID;
    }

    /** 
     * Set the 'DocumentalControlID' element value. Идентификатор документального контроля
     * 
     * @param documentalControlID
     */
    public void setDocumentalControlID(String documentalControlID) {
        this.documentalControlID = documentalControlID;
    }

    /** 
     * Get the 'ViolationControlID' element value. Идентификатор листа контроля
     * 
     * @return value
     */
    public String getViolationControlID() {
        return violationControlID;
    }

    /** 
     * Set the 'ViolationControlID' element value. Идентификатор листа контроля
     * 
     * @param violationControlID
     */
    public void setViolationControlID(String violationControlID) {
        this.violationControlID = violationControlID;
    }

    /** 
     * Get the 'BelarusControlID' element value. Идентификатор белорусского контроля
     * 
     * @return value
     */
    public String getBelarusControlID() {
        return belarusControlID;
    }

    /** 
     * Set the 'BelarusControlID' element value. Идентификатор белорусского контроля
     * 
     * @param belarusControlID
     */
    public void setBelarusControlID(String belarusControlID) {
        this.belarusControlID = belarusControlID;
    }

    /** 
     * Get the 'KazakhControlID' element value. Идентификатор казахстанского контроля
     * 
     * @return value
     */
    public String getKazakhControlID() {
        return kazakhControlID;
    }

    /** 
     * Set the 'KazakhControlID' element value. Идентификатор казахстанского контроля
     * 
     * @param kazakhControlID
     */
    public void setKazakhControlID(String kazakhControlID) {
        this.kazakhControlID = kazakhControlID;
    }

    /** 
     * Get the 'DecisionName' element value. Решение, принятое по результатам контроля
     * 
     * @return value
     */
    public String getDecisionName() {
        return decisionName;
    }

    /** 
     * Set the 'DecisionName' element value. Решение, принятое по результатам контроля
     * 
     * @param decisionName
     */
    public void setDecisionName(String decisionName) {
        this.decisionName = decisionName;
    }

    /** 
     * Get the 'EndDateTime' element value. Дата/время окончания транспортного контроля
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. Дата/время окончания транспортного контроля
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'Information' element value. Примечание инспектора транспортного контроля
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. Примечание инспектора транспортного контроля
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'IsInstrumental' element value. Признак инструментального контроля
     * 
     * @return value
     */
    public String getIsInstrumental() {
        return isInstrumental;
    }

    /** 
     * Set the 'IsInstrumental' element value. Признак инструментального контроля
     * 
     * @param isInstrumental
     */
    public void setIsInstrumental(String isInstrumental) {
        this.isInstrumental = isInstrumental;
    }

    /** 
     * Get the 'IsVisual' element value. Признак визуального контроля
     * 
     * @return value
     */
    public String getIsVisual() {
        return isVisual;
    }

    /** 
     * Set the 'IsVisual' element value. Признак визуального контроля
     * 
     * @param isVisual
     */
    public void setIsVisual(String isVisual) {
        this.isVisual = isVisual;
    }

    /** 
     * Get the 'IsDocumental' element value. Признак документального контроля
     * 
     * @return value
     */
    public String getIsDocumental() {
        return isDocumental;
    }

    /** 
     * Set the 'IsDocumental' element value. Признак документального контроля
     * 
     * @param isDocumental
     */
    public void setIsDocumental(String isDocumental) {
        this.isDocumental = isDocumental;
    }

    /** 
     * Get the list of 'Violation' element items. Выявленные в контроле нарушения
     * 
     * @return list
     */
    public List<String> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. Выявленные в контроле нарушения
     * 
     * @param list
     */
    public void setViolationList(List<String> list) {
        violationList = list;
    }

    /** 
     * Get the 'CheckPoint' element value. Пост (пункт пропуска), где осуществлялся транспортный контроль
     * 
     * @return value
     */
    public CheckPointType getCheckPoint() {
        return checkPoint;
    }

    /** 
     * Set the 'CheckPoint' element value. Пост (пункт пропуска), где осуществлялся транспортный контроль
     * 
     * @param checkPoint
     */
    public void setCheckPoint(CheckPointType checkPoint) {
        this.checkPoint = checkPoint;
    }

    /** 
     * Get the 'InstrumentalControl' element value. Сведения из инструментального контроля
     * 
     * @return value
     */
    public InstrumentalControlType getInstrumentalControl() {
        return instrumentalControl;
    }

    /** 
     * Set the 'InstrumentalControl' element value. Сведения из инструментального контроля
     * 
     * @param instrumentalControl
     */
    public void setInstrumentalControl(
            InstrumentalControlType instrumentalControl) {
        this.instrumentalControl = instrumentalControl;
    }

    /** 
     * Get the 'VisualControl' element value. Сведения из визуального контроля
     * 
     * @return value
     */
    public VisualControlType getVisualControl() {
        return visualControl;
    }

    /** 
     * Set the 'VisualControl' element value. Сведения из визуального контроля
     * 
     * @param visualControl
     */
    public void setVisualControl(VisualControlType visualControl) {
        this.visualControl = visualControl;
    }

    /** 
     * Get the 'DocumentalControl' element value. Сведения из документального контроля
     * 
     * @return value
     */
    public DocumentalControlType getDocumentalControl() {
        return documentalControl;
    }

    /** 
     * Set the 'DocumentalControl' element value. Сведения из документального контроля
     * 
     * @param documentalControl
     */
    public void setDocumentalControl(DocumentalControlType documentalControl) {
        this.documentalControl = documentalControl;
    }

    /** 
     * Get the 'BelarusControl' element value. Сведения из листа транспортного контроля Республики Беларусь
     * 
     * @return value
     */
    public RBKZControlType getBelarusControl() {
        return belarusControl;
    }

    /** 
     * Set the 'BelarusControl' element value. Сведения из листа транспортного контроля Республики Беларусь
     * 
     * @param belarusControl
     */
    public void setBelarusControl(RBKZControlType belarusControl) {
        this.belarusControl = belarusControl;
    }

    /** 
     * Get the 'KazakhControl' element value. Сведения из листа транспортного контроля Республики Казахстан
     * 
     * @return value
     */
    public RBKZControlType getKazakhControl() {
        return kazakhControl;
    }

    /** 
     * Set the 'KazakhControl' element value. Сведения из листа транспортного контроля Республики Казахстан
     * 
     * @param kazakhControl
     */
    public void setKazakhControl(RBKZControlType kazakhControl) {
        this.kazakhControl = kazakhControl;
    }

    /** 
     * Get the list of 'NotifDocument' element items. Сведения из уведомления
     * 
     * @return list
     */
    public List<NotifDocumentType> getNotifDocumentList() {
        return notifDocumentList;
    }

    /** 
     * Set the list of 'NotifDocument' element items. Сведения из уведомления
     * 
     * @param list
     */
    public void setNotifDocumentList(List<NotifDocumentType> list) {
        notifDocumentList = list;
    }

    /** 
     * Get the 'AccountCode' element value. Учетный талон
     * 
     * @return value
     */
    public AccountCodeType getAccountCode() {
        return accountCode;
    }

    /** 
     * Set the 'AccountCode' element value. Учетный талон
     * 
     * @param accountCode
     */
    public void setAccountCode(AccountCodeType accountCode) {
        this.accountCode = accountCode;
    }

    /** 
     * Get the 'PostPenalty' element value. Сведения об оплате штрафа с ПК
     * 
     * @return value
     */
    public PostPenaltyType getPostPenalty() {
        return postPenalty;
    }

    /** 
     * Set the 'PostPenalty' element value. Сведения об оплате штрафа с ПК
     * 
     * @param postPenalty
     */
    public void setPostPenalty(PostPenaltyType postPenalty) {
        this.postPenalty = postPenalty;
    }
}
