
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;

/** 
 * �����������
 */
public class CommentsType
{
    private List<String> otherInformList = new ArrayList<String>();

    /** 
     * Get the list of 'OtherInform' element items. ���� ��������
     * 
     * @return list
     */
    public List<String> getOtherInformList() {
        return otherInformList;
    }

    /** 
     * Set the list of 'OtherInform' element items. ���� ��������
     * 
     * @param list
     */
    public void setOtherInformList(List<String> list) {
        otherInformList = list;
    }
}
