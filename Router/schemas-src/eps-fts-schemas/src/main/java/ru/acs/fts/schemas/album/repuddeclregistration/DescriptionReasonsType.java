
package ru.acs.fts.schemas.album.repuddeclregistration;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������� ������
 */
public class DescriptionReasonsType
{
    private List<String> reasonRefusalList = new ArrayList<String>();
    private List<String> commentList = new ArrayList<String>();

    /** 
     * Get the list of 'ReasonRefusal' element items. ������� ������ � ����������� �� � ������������ �� ������� 190 ����������� ������� ����������� �����
     * 
     * @return list
     */
    public List<String> getReasonRefusalList() {
        return reasonRefusalList;
    }

    /** 
     * Set the list of 'ReasonRefusal' element items. ������� ������ � ����������� �� � ������������ �� ������� 190 ����������� ������� ����������� �����
     * 
     * @param list
     */
    public void setReasonRefusalList(List<String> list) {
        reasonRefusalList = list;
    }

    /** 
     * Get the list of 'Comment' element items. ����������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comment' element items. ����������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }
}
