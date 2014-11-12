
package ru.acs.fts.schemas.album.notifreservation;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �������������, ����������� �������� ������������� �������������� ����� �����������
 */
public class ReasonsType
{
    private String reasonCode;
    private List<String> reasonDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'ReasonCode' element value. ���
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. ���
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the list of 'ReasonDescription' element items. ��������
     * 
     * @return list
     */
    public List<String> getReasonDescriptionList() {
        return reasonDescriptionList;
    }

    /** 
     * Set the list of 'ReasonDescription' element items. ��������
     * 
     * @param list
     */
    public void setReasonDescriptionList(List<String> list) {
        reasonDescriptionList = list;
    }
}
