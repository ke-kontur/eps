
package ru.acs.fts.schemas.album.docreestrreq;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения из реестра разрешительных документов 
 */
public class DocReestrReqType extends BaseDocType
{
    private List<PermissionInfoType> permissionInfoList = new ArrayList<PermissionInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'PermissionInfo' element items. Данные по разрешению
     * 
     * @return list
     */
    public List<PermissionInfoType> getPermissionInfoList() {
        return permissionInfoList;
    }

    /** 
     * Set the list of 'PermissionInfo' element items. Данные по разрешению
     * 
     * @param list
     */
    public void setPermissionInfoList(List<PermissionInfoType> list) {
        permissionInfoList = list;
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
