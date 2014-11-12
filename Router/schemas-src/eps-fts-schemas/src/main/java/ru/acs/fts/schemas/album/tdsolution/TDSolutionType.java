
package ru.acs.fts.schemas.album.tdsolution;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Решение по транзитной декларации 
 */
public class TDSolutionType extends BaseDocType
{
    private String TDStatus;
    private String comments;
    private LocalDate transitOpenDate;
    private LocalDate transitDateLimit;
    private String GRN;
    private String additionalID;
    private LocalDate transitFactEndDate;
    private List<String> reservationCompleteList = new ArrayList<String>();
    private GTDIDType TDNumber;
    private CustomsPersonType customsPerson;
    private CUCustomsType destinationCustoms;
    private String documentModeID;

    /** 
     * Get the 'TDStatus' element value. Статус транзитной перевозки. TR_ALLOWED- выпущена, TR_ISSUE_DENIED - отказано в выпуске, TD_REVOKED - отзыв ТД, TR_CANCELLED - аннулирована ТД (техническое аннулирование), TR_COMPLETED - процедура завершена, TR_COMPLETED_W_RESERVATION - процедура завершена с оговорками
     * 
     * @return value
     */
    public String getTDStatus() {
        return TDStatus;
    }

    /** 
     * Set the 'TDStatus' element value. Статус транзитной перевозки. TR_ALLOWED- выпущена, TR_ISSUE_DENIED - отказано в выпуске, TD_REVOKED - отзыв ТД, TR_CANCELLED - аннулирована ТД (техническое аннулирование), TR_COMPLETED - процедура завершена, TR_COMPLETED_W_RESERVATION - процедура завершена с оговорками
     * 
     * @param TDStatus
     */
    public void setTDStatus(String TDStatus) {
        this.TDStatus = TDStatus;
    }

    /** 
     * Get the 'Comments' element value. Комментарии.
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии.
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'TransitOpenDate' element value. Дата выпуска товаров в соответствии с процедурой таможенного транзита
     * 
     * @return value
     */
    public LocalDate getTransitOpenDate() {
        return transitOpenDate;
    }

    /** 
     * Set the 'TransitOpenDate' element value. Дата выпуска товаров в соответствии с процедурой таможенного транзита
     * 
     * @param transitOpenDate
     */
    public void setTransitOpenDate(LocalDate transitOpenDate) {
        this.transitOpenDate = transitOpenDate;
    }

    /** 
     * Get the 'TransitDateLimit' element value. Срок таможенного транзита.
     * 
     * @return value
     */
    public LocalDate getTransitDateLimit() {
        return transitDateLimit;
    }

    /** 
     * Set the 'TransitDateLimit' element value. Срок таможенного транзита.
     * 
     * @param transitDateLimit
     */
    public void setTransitDateLimit(LocalDate transitDateLimit) {
        this.transitDateLimit = transitDateLimit;
    }

    /** 
     * Get the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @return value
     */
    public String getAdditionalID() {
        return additionalID;
    }

    /** 
     * Set the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @param additionalID
     */
    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
    }

    /** 
     * Get the 'TransitFactEndDate' element value. Фактический срок завершения процедуры транзита.
     * 
     * @return value
     */
    public LocalDate getTransitFactEndDate() {
        return transitFactEndDate;
    }

    /** 
     * Set the 'TransitFactEndDate' element value. Фактический срок завершения процедуры транзита.
     * 
     * @param transitFactEndDate
     */
    public void setTransitFactEndDate(LocalDate transitFactEndDate) {
        this.transitFactEndDate = transitFactEndDate;
    }

    /** 
     * Get the list of 'ReservationComplete' element items. Оговорки.
     * 
     * @return list
     */
    public List<String> getReservationCompleteList() {
        return reservationCompleteList;
    }

    /** 
     * Set the list of 'ReservationComplete' element items. Оговорки.
     * 
     * @param list
     */
    public void setReservationCompleteList(List<String> list) {
        reservationCompleteList = list;
    }

    /** 
     * Get the 'TDNumber' element value. Номер ТД
     * 
     * @return value
     */
    public GTDIDType getTDNumber() {
        return TDNumber;
    }

    /** 
     * Set the 'TDNumber' element value. Номер ТД
     * 
     * @param TDNumber
     */
    public void setTDNumber(GTDIDType TDNumber) {
        this.TDNumber = TDNumber;
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
     * Get the 'DestinationCustoms' element value. Таможенный орган назначения.
     * 
     * @return value
     */
    public CUCustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. Таможенный орган назначения.
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CUCustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
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
