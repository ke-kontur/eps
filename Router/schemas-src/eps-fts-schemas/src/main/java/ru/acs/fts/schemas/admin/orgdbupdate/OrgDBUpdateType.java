
package ru.acs.fts.schemas.admin.orgdbupdate;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * �������� ����������� ����������� / ����� �����������
 */
public class OrgDBUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private OrgInfoType orgInfo;
    private String documentModeID;

    /** 
     * Get the 'CreateDateTime' element value. ����  � �����  ��������  ��������
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. ����  � �����  ��������  ��������
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'OrgInfo' element value. ���������� �� �����������
     * 
     * @return value
     */
    public OrgInfoType getOrgInfo() {
        return orgInfo;
    }

    /** 
     * Set the 'OrgInfo' element value. ���������� �� �����������
     * 
     * @param orgInfo
     */
    public void setOrgInfo(OrgInfoType orgInfo) {
        this.orgInfo = orgInfo;
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
