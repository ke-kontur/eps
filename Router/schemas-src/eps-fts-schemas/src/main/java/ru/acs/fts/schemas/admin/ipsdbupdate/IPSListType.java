
package ru.acs.fts.schemas.admin.ipsdbupdate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/** 
 * ���������� ���
 */
public class IPSListType
{
    private String IPSID;
    private String IPSDescription;
    private String IPSProgrammerOrg;
    private String comments;
    private LocalDate createDate;
    private DateTime chDateTime;
    private List<IPSTechType> IPSTechInfoList = new ArrayList<IPSTechType>();

    /** 
     * Get the 'IPSID' element value. ������������� ��� ���
     * 
     * @return value
     */
    public String getIPSID() {
        return IPSID;
    }

    /** 
     * Set the 'IPSID' element value. ������������� ��� ���
     * 
     * @param IPSID
     */
    public void setIPSID(String IPSID) {
        this.IPSID = IPSID;
    }

    /** 
     * Get the 'IPSDescription' element value. ������������ ��� ���
     * 
     * @return value
     */
    public String getIPSDescription() {
        return IPSDescription;
    }

    /** 
     * Set the 'IPSDescription' element value. ������������ ��� ���
     * 
     * @param IPSDescription
     */
    public void setIPSDescription(String IPSDescription) {
        this.IPSDescription = IPSDescription;
    }

    /** 
     * Get the 'IPS_ProgrammerOrg' element value. ������������  �����������-������������
     * 
     * @return value
     */
    public String getIPSProgrammerOrg() {
        return IPSProgrammerOrg;
    }

    /** 
     * Set the 'IPS_ProgrammerOrg' element value. ������������  �����������-������������
     * 
     * @param IPSProgrammerOrg
     */
    public void setIPSProgrammerOrg(String IPSProgrammerOrg) {
        this.IPSProgrammerOrg = IPSProgrammerOrg;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'CreateDate' element value. ���� �������� ������
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. ���� �������� ������
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
    }

    /** 
     * Get the list of 'IPSTechInfo' element items. ����������  � ��������������  �����������
     * 
     * @return list
     */
    public List<IPSTechType> getIPSTechInfoList() {
        return IPSTechInfoList;
    }

    /** 
     * Set the list of 'IPSTechInfo' element items. ����������  � ��������������  �����������
     * 
     * @param list
     */
    public void setIPSTechInfoList(List<IPSTechType> list) {
        IPSTechInfoList = list;
    }
}
