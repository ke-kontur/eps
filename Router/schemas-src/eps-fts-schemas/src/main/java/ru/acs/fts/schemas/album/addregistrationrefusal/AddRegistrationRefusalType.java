
package ru.acs.fts.schemas.album.addregistrationrefusal;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Отказ по дополнению к договору поручительства 
 */
public class AddRegistrationRefusalType extends BaseDocType
{
    private LocalDate refusalDate;
    private List<RefuseReasonType> refuseReasonList = new ArrayList<RefuseReasonType>();
    private String documentModeID;

    /** 
     * Get the 'RefusalDate' element value. Дата решения об отказе.
     * 
     * @return value
     */
    public LocalDate getRefusalDate() {
        return refusalDate;
    }

    /** 
     * Set the 'RefusalDate' element value. Дата решения об отказе.
     * 
     * @param refusalDate
     */
    public void setRefusalDate(LocalDate refusalDate) {
        this.refusalDate = refusalDate;
    }

    /** 
     * Get the list of 'RefuseReason' element items. Причины отказа
     * 
     * @return list
     */
    public List<RefuseReasonType> getRefuseReasonList() {
        return refuseReasonList;
    }

    /** 
     * Set the list of 'RefuseReason' element items. Причины отказа
     * 
     * @param list
     */
    public void setRefuseReasonList(List<RefuseReasonType> list) {
        refuseReasonList = list;
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
