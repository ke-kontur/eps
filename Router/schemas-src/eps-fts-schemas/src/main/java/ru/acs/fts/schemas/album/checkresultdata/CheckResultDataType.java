
package ru.acs.fts.schemas.album.checkresultdata;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� � ����������� �������� ������ ��������������� �������� � ������� �������������� ����������
 */
public class CheckResultDataType extends BaseDocType
{
    private String requestId;
    private String statusCode;
    private List<ResultType> resultList = new ArrayList<ResultType>();
    private String documentModeID;

    /** 
     * Get the 'RequestId' element value. ���������� ������������� �������
     * 
     * @return value
     */
    public String getRequestId() {
        return requestId;
    }

    /** 
     * Set the 'RequestId' element value. ���������� ������������� �������
     * 
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /** 
     * Get the 'StatusCode' element value. ������ ���������� ���������� �������: 1 - ������ � ���������� �������; 2 - ������������� ��������� ��������; 3 - �� ������� ����������� ���������� �� ���.������ ��� (��� ������� ����� ������ ����������); 4 - ��������� ���������� �� ����������������; 5 - ��������� ���, ���� ��� ����� ������� �� ������������� ��������� � ����������
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'StatusCode' element value. ������ ���������� ���������� �������: 1 - ������ � ���������� �������; 2 - ������������� ��������� ��������; 3 - �� ������� ����������� ���������� �� ���.������ ��� (��� ������� ����� ������ ����������); 4 - ��������� ���������� �� ����������������; 5 - ��������� ���, ���� ��� ����� ������� �� ������������� ��������� � ����������
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /** 
     * Get the list of 'Result' element items. ������ �� ����������� ��������
     * 
     * @return list
     */
    public List<ResultType> getResultList() {
        return resultList;
    }

    /** 
     * Set the list of 'Result' element items. ������ �� ����������� ��������
     * 
     * @param list
     */
    public void setResultList(List<ResultType> list) {
        resultList = list;
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
