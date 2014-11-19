
package ru.acs.fts.schemas.album.resultasktt;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� �������� �����-2
 */
public class ResultASKTTType extends BaseDocType
{
    private List<TDCheckResultType> TDCheckResultList = new ArrayList<TDCheckResultType>();
    private String documentModeID;

    /** 
     * Get the list of 'TDCheckResult' element items. ���������� �������� �� ��
     * 
     * @return list
     */
    public List<TDCheckResultType> getTDCheckResultList() {
        return TDCheckResultList;
    }

    /** 
     * Set the list of 'TDCheckResult' element items. ���������� �������� �� ��
     * 
     * @param list
     */
    public void setTDCheckResultList(List<TDCheckResultType> list) {
        TDCheckResultList = list;
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
