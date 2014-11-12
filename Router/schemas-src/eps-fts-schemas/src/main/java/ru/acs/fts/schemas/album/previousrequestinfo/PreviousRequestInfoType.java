
package ru.acs.fts.schemas.album.previousrequestinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� � ������� ����� ����������� �������� �� ���������� ������� � ���������� ������� �� ���
 */
public class PreviousRequestInfoType extends BaseDocType
{
    private String previousRequestSign;
    private List<PreviousRequestsType> previousRequestList = new ArrayList<PreviousRequestsType>();
    private String documentModeID;

    /** 
     * Get the 'PreviousRequestSign' element value. ������� ������� ���������� �������� � ���������� ������� �� ���
     * 
     * @return value
     */
    public String getPreviousRequestSign() {
        return previousRequestSign;
    }

    /** 
     * Set the 'PreviousRequestSign' element value. ������� ������� ���������� �������� � ���������� ������� �� ���
     * 
     * @param previousRequestSign
     */
    public void setPreviousRequestSign(String previousRequestSign) {
        this.previousRequestSign = previousRequestSign;
    }

    /** 
     * Get the list of 'PreviousRequests' element items. �������� � ����� ����������� ��������
     * 
     * @return list
     */
    public List<PreviousRequestsType> getPreviousRequestList() {
        return previousRequestList;
    }

    /** 
     * Set the list of 'PreviousRequests' element items. �������� � ����� ����������� ��������
     * 
     * @param list
     */
    public void setPreviousRequestList(List<PreviousRequestsType> list) {
        previousRequestList = list;
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
