
package ru.acs.fts.schemas.admin.intexchresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ��������� ��������� ��������� / ���������� ��������
 */
public class IntExchResultType extends BaseDocType
{
    private List<ResponseType> responseList = new ArrayList<ResponseType>();
    private String documentModeID;

    /** 
     * Get the list of 'Response' element items. ��������� ���������� ��������
     * 
     * @return list
     */
    public List<ResponseType> getResponseList() {
        return responseList;
    }

    /** 
     * Set the list of 'Response' element items. ��������� ���������� ��������
     * 
     * @param list
     */
    public void setResponseList(List<ResponseType> list) {
        responseList = list;
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
