
package ru.acs.fts.schemas.album;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о начале сканирования
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:ScanStartNotification:5.1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ScanStartNotificationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:date" name="ControlStartDate"/>
 *         &lt;xs:element type="xs:string" name="ControlStartTime"/>
 *         &lt;xs:element type="xs:string" name="GTDID"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1010009E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ScanStartNotificationType extends BaseDocType
{
    private LocalDate controlStartDate;
    private String controlStartTime;
    private String GTDID;
    private String documentModeID;

    /** 
     * Get the 'ControlStartDate' element value. Дата начала сканирования
     * 
     * @return value
     */
    public LocalDate getControlStartDate() {
        return controlStartDate;
    }

    /** 
     * Set the 'ControlStartDate' element value. Дата начала сканирования
     * 
     * @param controlStartDate
     */
    public void setControlStartDate(LocalDate controlStartDate) {
        this.controlStartDate = controlStartDate;
    }

    /** 
     * Get the 'ControlStartTime' element value. Время начала сканирования
     * 
     * @return value
     */
    public String getControlStartTime() {
        return controlStartTime;
    }

    /** 
     * Set the 'ControlStartTime' element value. Время начала сканирования
     * 
     * @param controlStartTime
     */
    public void setControlStartTime(String controlStartTime) {
        this.controlStartTime = controlStartTime;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер направления
     * 
     * @return value
     */
    public String getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер направления
     * 
     * @param GTDID
     */
    public void setGTDID(String GTDID) {
        this.GTDID = GTDID;
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
