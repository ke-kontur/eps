
package ru.acs.fts.schemas.album.pi_statusrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ ������� ��������������� ����������
 */
public class PIStatusRequestType extends BaseDocType
{
    private List<String> informationIDList = new ArrayList<String>();
    private String documentModeID;

    /** 
     * Get the list of 'InformationID' element items. ������������� ��������������� ���������� �� ������� ������������� ������
     * 
     * @return list
     */
    public List<String> getInformationIDList() {
        return informationIDList;
    }

    /** 
     * Set the list of 'InformationID' element items. ������������� ��������������� ���������� �� ������� ������������� ������
     * 
     * @param list
     */
    public void setInformationIDList(List<String> list) {
        informationIDList = list;
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
