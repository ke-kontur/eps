
package ru.acs.fts.schemas.album.bdrd_report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� �� ����������� ������������� �������� �� �� � ��
 */
public class BDRDReportType extends BaseDocType
{
    private String requestPositionID;
    private List<CheckResultType> checkResultList = new ArrayList<CheckResultType>();
    private String documentModeID;

    /** 
     * Get the 'RequestPositionID' element value. ������� �� � �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������� �� � �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the list of 'CheckResult' element items. ���������� ������ ��������
     * 
     * @return list
     */
    public List<CheckResultType> getCheckResultList() {
        return checkResultList;
    }

    /** 
     * Set the list of 'CheckResult' element items. ���������� ������ ��������
     * 
     * @param list
     */
    public void setCheckResultList(List<CheckResultType> list) {
        checkResultList = list;
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
