
package ru.acs.fts.schemas.admin.updatedb_result;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ��������� ������ ������
 */
public class RowResultType
{
    private String rowID;
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String infoCode;

    /** 
     * Get the 'RowID' element value. ������������� ������
     * 
     * @return value
     */
    public String getRowID() {
        return rowID;
    }

    /** 
     * Set the 'RowID' element value. ������������� ������
     * 
     * @param rowID
     */
    public void setRowID(String rowID) {
        this.rowID = rowID;
    }

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
     * Get the 'InfoCode' element value. �������������� ���
     * 
     * @return value
     */
    public String getInfoCode() {
        return infoCode;
    }

    /** 
     * Set the 'InfoCode' element value. �������������� ���
     * 
     * @param infoCode
     */
    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }
}
