
package ru.acs.fts.schemas.album.errorlist;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Перечень ошибок, выявленных в процессе проведения форматно-логического контроля сведений, заявленных в электронной форме документа
 */
public class ErrorListType extends BaseDocType
{
    private LocalDate sendDate;
    private CustomsType customs;
    private List<BadDocumentType> badDocumentList = new ArrayList<BadDocumentType>();
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
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'BadDocument' element items. Документ с ошибками
     * 
     * @return list
     */
    public List<BadDocumentType> getBadDocumentList() {
        return badDocumentList;
    }

    /** 
     * Set the list of 'BadDocument' element items. Документ с ошибками
     * 
     * @param list
     */
    public void setBadDocumentList(List<BadDocumentType> list) {
        badDocumentList = list;
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
