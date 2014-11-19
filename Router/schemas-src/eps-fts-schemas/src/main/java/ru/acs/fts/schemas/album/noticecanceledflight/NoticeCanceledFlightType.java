
package ru.acs.fts.schemas.album.noticecanceledflight;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * Уведомление об отмене рейса
 */
public class NoticeCanceledFlightType extends BaseDocType
{
    private LocalDate noticeDate;
    private String noticeTime;
    private String reasons;
    private FlightInfoType flight;
    private CustomsType customsOffice;
    private String documentModeID;

    /** 
     * Get the 'NoticeDate' element value. Дата уведомления
     * 
     * @return value
     */
    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    /** 
     * Set the 'NoticeDate' element value. Дата уведомления
     * 
     * @param noticeDate
     */
    public void setNoticeDate(LocalDate noticeDate) {
        this.noticeDate = noticeDate;
    }

    /** 
     * Get the 'NoticeTime' element value. Время уведомления
     * 
     * @return value
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /** 
     * Set the 'NoticeTime' element value. Время уведомления
     * 
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /** 
     * Get the 'Reasons' element value. Причины
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. Причины
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'Flight' element value. Сведения об отмененном рейсе
     * 
     * @return value
     */
    public FlightInfoType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. Сведения об отмененном рейсе
     * 
     * @param flight
     */
    public void setFlight(FlightInfoType flight) {
        this.flight = flight;
    }

    /** 
     * Get the 'CustomsOffice' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Таможенный орган
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
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
