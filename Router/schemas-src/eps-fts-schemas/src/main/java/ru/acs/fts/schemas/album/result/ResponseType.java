
package ru.acs.fts.schemas.album.result;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������, ���������� ��������� ���������� �������� (������������� ��� �������������)
 */
public class ResponseType
{
    private String refDocumentID;
    private LocalDate createDate;
    private String createTime;
    private List<ResultInformationType> resultInformationList = new ArrayList<ResultInformationType>();

    /** 
     * Get the 'RefDocumentID' element value. ������������� ���������, � ������� ���� �������� ������.
     * 
     * @return value
     */
    public String getRefDocumentID() {
        return refDocumentID;
    }

    /** 
     * Set the 'RefDocumentID' element value. ������������� ���������, � ������� ���� �������� ������.
     * 
     * @param refDocumentID
     */
    public void setRefDocumentID(String refDocumentID) {
        this.refDocumentID = refDocumentID;
    }

    /** 
     * Get the 'CreateDate' element value. ���� �������� ���������
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. ���� �������� ���������
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'CreateTime' element value. ����� �������� ���������
     * 
     * @return value
     */
    public String getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value. ����� �������� ���������
     * 
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the list of 'ResultInformation' element items. ��� �������� ��� ��������� ���������, ��������� ���������� �������� (������ � ���, ������ �������/������� ��������)
     * 
     * @return list
     */
    public List<ResultInformationType> getResultInformationList() {
        return resultInformationList;
    }

    /** 
     * Set the list of 'ResultInformation' element items. ��� �������� ��� ��������� ���������, ��������� ���������� �������� (������ � ���, ������ �������/������� ��������)
     * 
     * @param list
     */
    public void setResultInformationList(List<ResultInformationType> list) {
        resultInformationList = list;
    }
}
