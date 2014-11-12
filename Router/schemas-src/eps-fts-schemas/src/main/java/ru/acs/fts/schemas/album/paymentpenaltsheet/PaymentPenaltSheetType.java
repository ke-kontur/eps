
package ru.acs.fts.schemas.album.paymentpenaltsheet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения об оплате штрафов
 */
public class PaymentPenaltSheetType extends BaseDocType
{
    private List<PenaltyType> penaltyList = new ArrayList<PenaltyType>();
    private String documentModeID;

    /** 
     * Get the list of 'Penalty' element items. Сведения об оплате штрафа
     * 
     * @return list
     */
    public List<PenaltyType> getPenaltyList() {
        return penaltyList;
    }

    /** 
     * Set the list of 'Penalty' element items. Сведения об оплате штрафа
     * 
     * @param list
     */
    public void setPenaltyList(List<PenaltyType> list) {
        penaltyList = list;
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
