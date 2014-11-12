
package ru.acs.fts.schemas.album.noticerubykz;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ��������� "����������� ���������� ���������" ("���������� ��������", "���������� ���������")
 */
public class NoticeRuByKzType extends BaseDocType
{
    private List<NotificationType> notificationList = new ArrayList<NotificationType>();
    private String documentModeID;

    /** 
     * Get the list of 'Notification' element items. �����������
     * 
     * @return list
     */
    public List<NotificationType> getNotificationList() {
        return notificationList;
    }

    /** 
     * Set the list of 'Notification' element items. �����������
     * 
     * @param list
     */
    public void setNotificationList(List<NotificationType> list) {
        notificationList = list;
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
