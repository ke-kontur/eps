
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������
 */
public class CommentsType
{
    private List<String> noticeList = new ArrayList<String>();

    /** 
     * Get the list of 'Notice' element items. ����������
     * 
     * @return list
     */
    public List<String> getNoticeList() {
        return noticeList;
    }

    /** 
     * Set the list of 'Notice' element items. ����������
     * 
     * @param list
     */
    public void setNoticeList(List<String> list) {
        noticeList = list;
    }
}
