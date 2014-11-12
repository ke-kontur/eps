
package ru.acs.fts.schemas.album.rtnusepermissionsandcard;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения об использовании разрешений, спецразрешений, карточек допуска и лицензионных карточек
 */
public class RtnUsePermissionsAndCardType extends BaseDocType
{
    private String inspectionDateTime;
    private String dispatchLocation;
    private String destinationLocation;
    private String decision;
    private String endDateTime;
    private String penaltySum;
    private String isPaid;
    private String removalDateTime;
    private String executionDateTime;
    private PersonBaseType driver;
    private TransportMeansBaseType TSInfo;
    private DocumentBaseType returnActNumber;
    private DocumentBaseType protocolNumber;
    private DocumentBaseType directionNumber;
    private DocumentBaseType resolutionNumber;
    private String documentModeID;

    /** 
     * Get the 'InspectionDateTime' element value. Дата/время начала контроля
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. Дата/время начала контроля
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'DispatchLocation' element value. Место отправления
     * 
     * @return value
     */
    public String getDispatchLocation() {
        return dispatchLocation;
    }

    /** 
     * Set the 'DispatchLocation' element value. Место отправления
     * 
     * @param dispatchLocation
     */
    public void setDispatchLocation(String dispatchLocation) {
        this.dispatchLocation = dispatchLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. Место назначения
     * 
     * @return value
     */
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. Место назначения
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'Decision' element value. Решение, принятое по результатам контроля (PASS - Пропустить ТС к дальнейшему движению; WAIT - Не пропускать до устранения нарушений)
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Решение, принятое по результатам контроля (PASS - Пропустить ТС к дальнейшему движению; WAIT - Не пропускать до устранения нарушений)
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'EndDateTime' element value. Дата/время принятия решения
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. Дата/время принятия решения
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'PenaltySum' element value. Сумма штрафа
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. Сумма штрафа
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'IsPaid' element value. Отметка об оплате штрафа
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. Отметка об оплате штрафа
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'RemovalDateTime' element value. Дата/время, когда нарушения должны быть устранены по предписанию
     * 
     * @return value
     */
    public String getRemovalDateTime() {
        return removalDateTime;
    }

    /** 
     * Set the 'RemovalDateTime' element value. Дата/время, когда нарушения должны быть устранены по предписанию
     * 
     * @param removalDateTime
     */
    public void setRemovalDateTime(String removalDateTime) {
        this.removalDateTime = removalDateTime;
    }

    /** 
     * Get the 'ExecutionDateTime' element value. Дата/время установки отметки о выполнении предписания
     * 
     * @return value
     */
    public String getExecutionDateTime() {
        return executionDateTime;
    }

    /** 
     * Set the 'ExecutionDateTime' element value. Дата/время установки отметки о выполнении предписания
     * 
     * @param executionDateTime
     */
    public void setExecutionDateTime(String executionDateTime) {
        this.executionDateTime = executionDateTime;
    }

    /** 
     * Get the 'Driver' element value. Водитель
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. Водитель
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'TSInfo' element value. Информация о ТС
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Информация о ТС
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'ReturnActNumber' element value. Номер решения о приостановке движения
     * 
     * @return value
     */
    public DocumentBaseType getReturnActNumber() {
        return returnActNumber;
    }

    /** 
     * Set the 'ReturnActNumber' element value. Номер решения о приостановке движения
     * 
     * @param returnActNumber
     */
    public void setReturnActNumber(DocumentBaseType returnActNumber) {
        this.returnActNumber = returnActNumber;
    }

    /** 
     * Get the 'ProtocolNumber' element value. Номер протокола
     * 
     * @return value
     */
    public DocumentBaseType getProtocolNumber() {
        return protocolNumber;
    }

    /** 
     * Set the 'ProtocolNumber' element value. Номер протокола
     * 
     * @param protocolNumber
     */
    public void setProtocolNumber(DocumentBaseType protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    /** 
     * Get the 'DirectionNumber' element value. Номер предписания
     * 
     * @return value
     */
    public DocumentBaseType getDirectionNumber() {
        return directionNumber;
    }

    /** 
     * Set the 'DirectionNumber' element value. Номер предписания
     * 
     * @param directionNumber
     */
    public void setDirectionNumber(DocumentBaseType directionNumber) {
        this.directionNumber = directionNumber;
    }

    /** 
     * Get the 'ResolutionNumber' element value. Номер постановления
     * 
     * @return value
     */
    public DocumentBaseType getResolutionNumber() {
        return resolutionNumber;
    }

    /** 
     * Set the 'ResolutionNumber' element value. Номер постановления
     * 
     * @param resolutionNumber
     */
    public void setResolutionNumber(DocumentBaseType resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
