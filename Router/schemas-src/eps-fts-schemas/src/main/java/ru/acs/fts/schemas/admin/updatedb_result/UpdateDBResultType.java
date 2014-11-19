
package ru.acs.fts.schemas.admin.updatedb_result;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ��������� ���������� ��
 */
public class UpdateDBResultType extends BaseDocType
{
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private List<RowResultType> rowResultList = new ArrayList<RowResultType>();
    private String documentModeID;

    /** 
     * Get the 'ResultCode' element value. ���������(���)
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ���������(���)
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the list of 'ResultDescription' element items. ��������  
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. ��������  
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the list of 'RowResult' element items. ��������� ��������� ������ ������
     * 
     * @return list
     */
    public List<RowResultType> getRowResultList() {
        return rowResultList;
    }

    /** 
     * Set the list of 'RowResult' element items. ��������� ��������� ������ ������
     * 
     * @param list
     */
    public void setRowResultList(List<RowResultType> list) {
        rowResultList = list;
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
