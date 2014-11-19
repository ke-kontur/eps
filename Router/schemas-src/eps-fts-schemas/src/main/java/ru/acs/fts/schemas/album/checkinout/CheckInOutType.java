
package ru.acs.fts.schemas.album.checkinout;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Сообщение о регистрации прибытия воздушного судна/Сообщение о разрешении на убытие воздушного судна
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
     * Get the 'UIN' element value. УИН
     * 
     * @return value
     */
    public String getUIN() {
        return UIN;
    }

    /** 
     * Set the 'UIN' element value. УИН
     * 
     * @param UIN
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /** 
     * Get the 'SignInOut' element value. Признак: 1- Прибытие, 0 - Убытие
     * 
     * @return value
     */
    public String getSignInOut() {
        return signInOut;
    }

    /** 
     * Set the 'SignInOut' element value. Признак: 1- Прибытие, 0 - Убытие
     * 
     * @param signInOut
     */
    public void setSignInOut(String signInOut) {
        this.signInOut = signInOut;
    }

    /** 
     * Get the 'RegNumberInOut' element value. Номер сообщения о прибытии/убытии
     * 
     * @return value
     */
    public String getRegNumberInOut() {
        return regNumberInOut;
    }

    /** 
     * Set the 'RegNumberInOut' element value. Номер сообщения о прибытии/убытии
     * 
     * @param regNumberInOut
     */
    public void setRegNumberInOut(String regNumberInOut) {
        this.regNumberInOut = regNumberInOut;
    }

    /** 
     * Get the 'DateOperation' element value. Дата операции (регистрации прибытия/убытия) 
     * 
     * @return value
     */
    public LocalDate getDateOperation() {
        return dateOperation;
    }

    /** 
     * Set the 'DateOperation' element value. Дата операции (регистрации прибытия/убытия) 
     * 
     * @param dateOperation
     */
    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    /** 
     * Get the 'TimeOperation' element value. Время операции (регистрации прибытия/убытия)
     * 
     * @return value
     */
    public String getTimeOperation() {
        return timeOperation;
    }

    /** 
     * Set the 'TimeOperation' element value. Время операции (регистрации прибытия/убытия)
     * 
     * @param timeOperation
     */
    public void setTimeOperation(String timeOperation) {
        this.timeOperation = timeOperation;
    }

    /** 
     * Get the 'ControlDecision' element value. Принятое решение
     * 
     * @return value
     */
    public String getControlDecision() {
        return controlDecision;
    }

    /** 
     * Set the 'ControlDecision' element value. Принятое решение
     * 
     * @param controlDecision
     */
    public void setControlDecision(String controlDecision) {
        this.controlDecision = controlDecision;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Flight' element value. Сведения о рейсе
     * 
     * @return value
     */
    public FlightType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. Сведения о рейсе
     * 
     * @param flight
     */
    public void setFlight(FlightType flight) {
        this.flight = flight;
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
