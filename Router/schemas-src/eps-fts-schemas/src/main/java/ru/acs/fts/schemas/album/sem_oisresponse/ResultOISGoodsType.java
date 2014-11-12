
package ru.acs.fts.schemas.album.sem_oisresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.OISsType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * ���������� � �������. � ������ ���������� ���������� �� ������� �� �������
 */
public class ResultOISGoodsType extends ResultGoodsType
{
    private String messageDoc;
    private String messageIP;
    private String messageTov;
    private List<OISsType> OISList = new ArrayList<OISsType>();

    /** 
     * Get the 'MessageDoc' element value. ��������� � �������/ ���������� ����� �������������� ����������
     * 
     * @return value
     */
    public String getMessageDoc() {
        return messageDoc;
    }

    /** 
     * Set the 'MessageDoc' element value. ��������� � �������/ ���������� ����� �������������� ����������
     * 
     * @param messageDoc
     */
    public void setMessageDoc(String messageDoc) {
        this.messageDoc = messageDoc;
    }

    /** 
     * Get the 'MessageIP' element value. ��������� � �������/ ���������� ����� "�" ��� ������� �������������� ������ � ������� ���
     * 
     * @return value
     */
    public String getMessageIP() {
        return messageIP;
    }

    /** 
     * Set the 'MessageIP' element value. ��������� � �������/ ���������� ����� "�" ��� ������� �������������� ������ � ������� ���
     * 
     * @param messageIP
     */
    public void setMessageIP(String messageIP) {
        this.messageIP = messageIP;
    }

    /** 
     * Get the 'MessageTov' element value. ��������� � ���������� ���������� �������� � ������ � ������� �� ������� ���, �� � �������� � ������������ ������ -&gt;� �������� � ���, ��� ������ ��� ������� ��������� ����� � ���������� ������� �������� ������.
     * 
     * @return value
     */
    public String getMessageTov() {
        return messageTov;
    }

    /** 
     * Set the 'MessageTov' element value. ��������� � ���������� ���������� �������� � ������ � ������� �� ������� ���, �� � �������� � ������������ ������ -&gt;� �������� � ���, ��� ������ ��� ������� ��������� ����� � ���������� ������� �������� ������.
     * 
     * @param messageTov
     */
    public void setMessageTov(String messageTov) {
        this.messageTov = messageTov;
    }

    /** 
     * Get the list of 'OISs' element items. ����� ���
     * 
     * @return list
     */
    public List<OISsType> getOISList() {
        return OISList;
    }

    /** 
     * Set the list of 'OISs' element items. ����� ���
     * 
     * @param list
     */
    public void setOISList(List<OISsType> list) {
        OISList = list;
    }
}
