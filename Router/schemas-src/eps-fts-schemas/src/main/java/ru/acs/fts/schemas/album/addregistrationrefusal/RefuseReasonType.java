
package ru.acs.fts.schemas.album.addregistrationrefusal;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ������
 */
public class RefuseReasonType
{
    private String refusalReasonCode;
    private List<String> refusalReasonDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'RefusalReasonCode' element value. ��� ������� ������
     * 
     * @return value
     */
    public String getRefusalReasonCode() {
        return refusalReasonCode;
    }

    /** 
     * Set the 'RefusalReasonCode' element value. ��� ������� ������
     * 
     * @param refusalReasonCode
     */
    public void setRefusalReasonCode(String refusalReasonCode) {
        this.refusalReasonCode = refusalReasonCode;
    }

    /** 
     * Get the list of 'RefusalReasonDescription' element items. �������� ������� ������
     * 
     * @return list
     */
    public List<String> getRefusalReasonDescriptionList() {
        return refusalReasonDescriptionList;
    }

    /** 
     * Set the list of 'RefusalReasonDescription' element items. �������� ������� ������
     * 
     * @param list
     */
    public void setRefusalReasonDescriptionList(List<String> list) {
        refusalReasonDescriptionList = list;
    }
}
