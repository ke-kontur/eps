
package ru.acs.fts.schemas.album.rtnusepermissionsandcard;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� �� ������������� ����������, ��������������, �������� ������� � ������������ ��������
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
     * Get the 'InspectionDateTime' element value. ����/����� ������ ��������
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. ����/����� ������ ��������
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'DispatchLocation' element value. ����� �����������
     * 
     * @return value
     */
    public String getDispatchLocation() {
        return dispatchLocation;
    }

    /** 
     * Set the 'DispatchLocation' element value. ����� �����������
     * 
     * @param dispatchLocation
     */
    public void setDispatchLocation(String dispatchLocation) {
        this.dispatchLocation = dispatchLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. ����� ����������
     * 
     * @return value
     */
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. ����� ����������
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'Decision' element value. �������, �������� �� ����������� �������� (PASS - ���������� �� � ����������� ��������; WAIT - �� ���������� �� ���������� ���������)
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. �������, �������� �� ����������� �������� (PASS - ���������� �� � ����������� ��������; WAIT - �� ���������� �� ���������� ���������)
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'EndDateTime' element value. ����/����� �������� �������
     * 
     * @return value
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /** 
     * Set the 'EndDateTime' element value. ����/����� �������� �������
     * 
     * @param endDateTime
     */
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /** 
     * Get the 'PenaltySum' element value. ����� ������
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. ����� ������
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'IsPaid' element value. ������� �� ������ ������
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. ������� �� ������ ������
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'RemovalDateTime' element value. ����/�����, ����� ��������� ������ ���� ��������� �� �����������
     * 
     * @return value
     */
    public String getRemovalDateTime() {
        return removalDateTime;
    }

    /** 
     * Set the 'RemovalDateTime' element value. ����/�����, ����� ��������� ������ ���� ��������� �� �����������
     * 
     * @param removalDateTime
     */
    public void setRemovalDateTime(String removalDateTime) {
        this.removalDateTime = removalDateTime;
    }

    /** 
     * Get the 'ExecutionDateTime' element value. ����/����� ��������� ������� � ���������� �����������
     * 
     * @return value
     */
    public String getExecutionDateTime() {
        return executionDateTime;
    }

    /** 
     * Set the 'ExecutionDateTime' element value. ����/����� ��������� ������� � ���������� �����������
     * 
     * @param executionDateTime
     */
    public void setExecutionDateTime(String executionDateTime) {
        this.executionDateTime = executionDateTime;
    }

    /** 
     * Get the 'Driver' element value. ��������
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. ��������
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'TSInfo' element value. ���������� � ��
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. ���������� � ��
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'ReturnActNumber' element value. ����� ������� � ������������ ��������
     * 
     * @return value
     */
    public DocumentBaseType getReturnActNumber() {
        return returnActNumber;
    }

    /** 
     * Set the 'ReturnActNumber' element value. ����� ������� � ������������ ��������
     * 
     * @param returnActNumber
     */
    public void setReturnActNumber(DocumentBaseType returnActNumber) {
        this.returnActNumber = returnActNumber;
    }

    /** 
     * Get the 'ProtocolNumber' element value. ����� ���������
     * 
     * @return value
     */
    public DocumentBaseType getProtocolNumber() {
        return protocolNumber;
    }

    /** 
     * Set the 'ProtocolNumber' element value. ����� ���������
     * 
     * @param protocolNumber
     */
    public void setProtocolNumber(DocumentBaseType protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    /** 
     * Get the 'DirectionNumber' element value. ����� �����������
     * 
     * @return value
     */
    public DocumentBaseType getDirectionNumber() {
        return directionNumber;
    }

    /** 
     * Set the 'DirectionNumber' element value. ����� �����������
     * 
     * @param directionNumber
     */
    public void setDirectionNumber(DocumentBaseType directionNumber) {
        this.directionNumber = directionNumber;
    }

    /** 
     * Get the 'ResolutionNumber' element value. ����� �������������
     * 
     * @return value
     */
    public DocumentBaseType getResolutionNumber() {
        return resolutionNumber;
    }

    /** 
     * Set the 'ResolutionNumber' element value. ����� �������������
     * 
     * @param resolutionNumber
     */
    public void setResolutionNumber(DocumentBaseType resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
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
