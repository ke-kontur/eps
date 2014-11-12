
package ru.acs.fts.schemas.album.docreestrreq;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ������� �������������� ���������� 
 */
public class DocReestrReqType extends BaseDocType
{
    private List<PermissionInfoType> permissionInfoList = new ArrayList<PermissionInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'PermissionInfo' element items. ������ �� ����������
     * 
     * @return list
     */
    public List<PermissionInfoType> getPermissionInfoList() {
        return permissionInfoList;
    }

    /** 
     * Set the list of 'PermissionInfo' element items. ������ �� ����������
     * 
     * @param list
     */
    public void setPermissionInfoList(List<PermissionInfoType> list) {
        permissionInfoList = list;
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
