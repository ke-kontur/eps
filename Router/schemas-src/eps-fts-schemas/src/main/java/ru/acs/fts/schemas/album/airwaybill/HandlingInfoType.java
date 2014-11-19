
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������� �� ��������� �����
 */
public class HandlingInfoType
{
    private String serviceInfoCode;
    private List<String> infoDescriptionList = new ArrayList<String>();
    private OrganizationType notificationOrg;

    /** 
     * Get the 'ServiceInfoCode' element value. ��� ����������
     * 
     * @return value
     */
    public String getServiceInfoCode() {
        return serviceInfoCode;
    }

    /** 
     * Set the 'ServiceInfoCode' element value. ��� ����������
     * 
     * @param serviceInfoCode
     */
    public void setServiceInfoCode(String serviceInfoCode) {
        this.serviceInfoCode = serviceInfoCode;
    }

    /** 
     * Get the list of 'InfoDescription' element items. ����������� ���������� � ������ ����������
     * 
     * @return list
     */
    public List<String> getInfoDescriptionList() {
        return infoDescriptionList;
    }

    /** 
     * Set the list of 'InfoDescription' element items. ����������� ���������� � ������ ����������
     * 
     * @param list
     */
    public void setInfoDescriptionList(List<String> list) {
        infoDescriptionList = list;
    }

    /** 
     * Get the 'NotificationOrg' element value. ����������� ��� ���� ��� ����������� � �������� �����
     * 
     * @return value
     */
    public OrganizationType getNotificationOrg() {
        return notificationOrg;
    }

    /** 
     * Set the 'NotificationOrg' element value. ����������� ��� ���� ��� ����������� � �������� �����
     * 
     * @param notificationOrg
     */
    public void setNotificationOrg(OrganizationType notificationOrg) {
        this.notificationOrg = notificationOrg;
    }
}
