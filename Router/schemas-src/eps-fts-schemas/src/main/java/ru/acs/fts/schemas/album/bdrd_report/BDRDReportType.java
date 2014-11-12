
package ru.acs.fts.schemas.album.bdrd_report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Отчет по результатам сопоставления сведений из РД и ДТ
 */
public class BDRDReportType extends BaseDocType
{
    private String requestPositionID;
    private List<CheckResultType> checkResultList = new ArrayList<CheckResultType>();
    private String documentModeID;

    /** 
     * Get the 'RequestPositionID' element value. Позиция РД в запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Позиция РД в запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the list of 'CheckResult' element items. Результаты сверки сведений
     * 
     * @return list
     */
    public List<CheckResultType> getCheckResultList() {
        return checkResultList;
    }

    /** 
     * Set the list of 'CheckResult' element items. Результаты сверки сведений
     * 
     * @param list
     */
    public void setCheckResultList(List<CheckResultType> list) {
        checkResultList = list;
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
