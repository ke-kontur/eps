
package ru.acs.fts.schemas.album.inqdelaydocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Обращение о разрешении представления документов в определенный срок
 */
public class InqDelayDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private OrganizationType applicant;
    private List<DelayDocDescriptionType> delayDocDescriptionList = new ArrayList<DelayDocDescriptionType>();
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'Applicant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Сведения о заявителе
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the list of 'DelayDocDescription' element items. Описание документов, которые предполагается представить в определенный срок
     * 
     * @return list
     */
    public List<DelayDocDescriptionType> getDelayDocDescriptionList() {
        return delayDocDescriptionList;
    }

    /** 
     * Set the list of 'DelayDocDescription' element items. Описание документов, которые предполагается представить в определенный срок
     * 
     * @param list
     */
    public void setDelayDocDescriptionList(List<DelayDocDescriptionType> list) {
        delayDocDescriptionList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
