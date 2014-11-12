
package ru.acs.fts.schemas.album.notif_piresult;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ���������� ���������
 */
public class ResultInformationType
{
    private String resultCode;
    private String referenceID;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String resultCategory;

    /** 
     * Get the 'ResultCode' element value. ��� ��������
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ��� ��������
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'ReferenceID' element value. ��������� ������������� ���������
     * 
     * @return value
     */
    public String getReferenceID() {
        return referenceID;
    }

    /** 
     * Set the 'ReferenceID' element value. ��������� ������������� ���������
     * 
     * @param referenceID
     */
    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    /** 
     * Get the list of 'ResultDescription' element items. ��������� ��������.
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. ��������� ��������.
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the 'ResultCategory' element value. ������� ����������� ������. ��� ��� ������������� ��������.
     * 
     * @return value
     */
    public String getResultCategory() {
        return resultCategory;
    }

    /** 
     * Set the 'ResultCategory' element value. ������� ����������� ������. ��� ��� ������������� ��������.
     * 
     * @param resultCategory
     */
    public void setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
    }
}
