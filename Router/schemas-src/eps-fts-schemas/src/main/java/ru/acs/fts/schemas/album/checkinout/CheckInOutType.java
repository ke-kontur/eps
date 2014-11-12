
package ru.acs.fts.schemas.album.checkinout;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ��������� � ����������� �������� ���������� �����/��������� � ���������� �� ������ ���������� �����
 */
public class CheckInOutType extends BaseDocType
{
    private String UIN;
    private String signInOut;
    private String regNumberInOut;
    private LocalDate dateOperation;
    private String timeOperation;
    private String controlDecision;
    private CustomsPersonType customsPerson;
    private CUCustomsType customs;
    private FlightType flight;
    private String documentModeID;

    /** 
     * Get the 'UIN' element value. ���
     * 
     * @return value
     */
    public String getUIN() {
        return UIN;
    }

    /** 
     * Set the 'UIN' element value. ���
     * 
     * @param UIN
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /** 
     * Get the 'SignInOut' element value. �������: 1- ��������, 0 - ������
     * 
     * @return value
     */
    public String getSignInOut() {
        return signInOut;
    }

    /** 
     * Set the 'SignInOut' element value. �������: 1- ��������, 0 - ������
     * 
     * @param signInOut
     */
    public void setSignInOut(String signInOut) {
        this.signInOut = signInOut;
    }

    /** 
     * Get the 'RegNumberInOut' element value. ����� ��������� � ��������/������
     * 
     * @return value
     */
    public String getRegNumberInOut() {
        return regNumberInOut;
    }

    /** 
     * Set the 'RegNumberInOut' element value. ����� ��������� � ��������/������
     * 
     * @param regNumberInOut
     */
    public void setRegNumberInOut(String regNumberInOut) {
        this.regNumberInOut = regNumberInOut;
    }

    /** 
     * Get the 'DateOperation' element value. ���� �������� (����������� ��������/������) 
     * 
     * @return value
     */
    public LocalDate getDateOperation() {
        return dateOperation;
    }

    /** 
     * Set the 'DateOperation' element value. ���� �������� (����������� ��������/������) 
     * 
     * @param dateOperation
     */
    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    /** 
     * Get the 'TimeOperation' element value. ����� �������� (����������� ��������/������)
     * 
     * @return value
     */
    public String getTimeOperation() {
        return timeOperation;
    }

    /** 
     * Set the 'TimeOperation' element value. ����� �������� (����������� ��������/������)
     * 
     * @param timeOperation
     */
    public void setTimeOperation(String timeOperation) {
        this.timeOperation = timeOperation;
    }

    /** 
     * Get the 'ControlDecision' element value. �������� �������
     * 
     * @return value
     */
    public String getControlDecision() {
        return controlDecision;
    }

    /** 
     * Set the 'ControlDecision' element value. �������� �������
     * 
     * @param controlDecision
     */
    public void setControlDecision(String controlDecision) {
        this.controlDecision = controlDecision;
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
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Flight' element value. �������� � �����
     * 
     * @return value
     */
    public FlightType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. �������� � �����
     * 
     * @param flight
     */
    public void setFlight(FlightType flight) {
        this.flight = flight;
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
