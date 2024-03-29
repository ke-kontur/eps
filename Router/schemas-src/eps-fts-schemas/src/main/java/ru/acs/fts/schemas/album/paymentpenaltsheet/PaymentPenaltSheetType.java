
package ru.acs.fts.schemas.album.paymentpenaltsheet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ������ �������
 */
public class PaymentPenaltSheetType extends BaseDocType
{
    private List<PenaltyType> penaltyList = new ArrayList<PenaltyType>();
    private String documentModeID;

    /** 
     * Get the list of 'Penalty' element items. �������� �� ������ ������
     * 
     * @return list
     */
    public List<PenaltyType> getPenaltyList() {
        return penaltyList;
    }

    /** 
     * Set the list of 'Penalty' element items. �������� �� ������ ������
     * 
     * @param list
     */
    public void setPenaltyList(List<PenaltyType> list) {
        penaltyList = list;
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
