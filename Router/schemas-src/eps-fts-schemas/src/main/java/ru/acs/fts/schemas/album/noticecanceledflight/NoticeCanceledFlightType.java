
package ru.acs.fts.schemas.album.noticecanceledflight;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * ����������� �� ������ �����
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
     * Get the 'NoticeDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    /** 
     * Set the 'NoticeDate' element value. ���� �����������
     * 
     * @param noticeDate
     */
    public void setNoticeDate(LocalDate noticeDate) {
        this.noticeDate = noticeDate;
    }

    /** 
     * Get the 'NoticeTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /** 
     * Set the 'NoticeTime' element value. ����� �����������
     * 
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /** 
     * Get the 'Reasons' element value. �������
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. �������
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'Flight' element value. �������� �� ���������� �����
     * 
     * @return value
     */
    public FlightInfoType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. �������� �� ���������� �����
     * 
     * @param flight
     */
    public void setFlight(FlightInfoType flight) {
        this.flight = flight;
    }

    /** 
     * Get the 'CustomsOffice' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ���������� �����
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
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
