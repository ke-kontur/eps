
package ru.acs.fts.schemas.album.rtnrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ������� ���������� ��/�������� �������
 */
public class RtnRequestType extends BaseDocType
{
    private List<PermitType> permitList = new ArrayList<PermitType>();
    private String documentModeID;

    /** 
     * Get the list of 'Permit' element items. ������ �� ����������/��������
     * 
     * @return list
     */
    public List<PermitType> getPermitList() {
        return permitList;
    }

    /** 
     * Set the list of 'Permit' element items. ������ �� ����������/��������
     * 
     * @param list
     */
    public void setPermitList(List<PermitType> list) {
        permitList = list;
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
