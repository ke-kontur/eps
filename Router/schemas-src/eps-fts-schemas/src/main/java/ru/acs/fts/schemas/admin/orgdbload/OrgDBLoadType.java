
package ru.acs.fts.schemas.admin.orgdbload;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

public class OrgDBLoadType extends BaseDocType
{
    private DateTime loadDateTime;
    private List<OrgInfoType> orgInfoList = new ArrayList<OrgInfoType>();
    private String documentModeID;

    /** 
     * Get the 'LoadDateTime' element value. ����  � ����� ��������
     * 
     * @return value
     */
    public DateTime getLoadDateTime() {
        return loadDateTime;
    }

    /** 
     * Set the 'LoadDateTime' element value. ����  � ����� ��������
     * 
     * @param loadDateTime
     */
    public void setLoadDateTime(DateTime loadDateTime) {
        this.loadDateTime = loadDateTime;
    }

    /** 
     * Get the list of 'OrgInfo' element items. ����������  �� �����������
     * 
     * @return list
     */
    public List<OrgInfoType> getOrgInfoList() {
        return orgInfoList;
    }

    /** 
     * Set the list of 'OrgInfo' element items. ����������  �� �����������
     * 
     * @param list
     */
    public void setOrgInfoList(List<OrgInfoType> list) {
        orgInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
