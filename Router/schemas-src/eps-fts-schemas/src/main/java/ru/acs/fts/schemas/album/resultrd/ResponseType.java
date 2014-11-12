
package ru.acs.fts.schemas.album.resultrd;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������, ���������� ��������� ���������� �������� (������������� ��� �������������)
 */
public class ResponseType
{
    private String refDocumentID;
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
     * Get the list of 'ResultInformation' element items. ��� �������� ��� ��������� ���������, ��������� ���������� ��������
     * 
     * @return list
     */
    public List<ResultInformationType> getResultInformationList() {
        return resultInformationList;
    }

    /** 
     * Set the list of 'ResultInformation' element items. ��� �������� ��� ��������� ���������, ��������� ���������� ��������
     * 
     * @param list
     */
    public void setResultInformationList(List<ResultInformationType> list) {
        resultInformationList = list;
    }
}
