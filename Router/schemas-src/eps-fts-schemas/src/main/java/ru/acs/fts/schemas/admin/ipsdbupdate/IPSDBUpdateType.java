
package ru.acs.fts.schemas.admin.ipsdbupdate;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ���������� ����������� ��� ���
 */
public class IPSDBUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private IPSListType IPSInfo;
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
     * Get the 'IPSInfo' element value. �������� �� ��� ���
     * 
     * @return value
     */
    public IPSListType getIPSInfo() {
        return IPSInfo;
    }

    /** 
     * Set the 'IPSInfo' element value. �������� �� ��� ���
     * 
     * @param IPSInfo
     */
    public void setIPSInfo(IPSListType IPSInfo) {
        this.IPSInfo = IPSInfo;
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
