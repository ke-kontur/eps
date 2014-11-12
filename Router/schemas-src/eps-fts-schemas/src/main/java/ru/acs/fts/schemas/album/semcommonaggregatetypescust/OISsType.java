
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ���������������� �������������
 */
public class OISsType
{
    private String OISID;
    private String relevance;
    private String messageR;
    private List<MarkUpType> brandOwnerList = new ArrayList<MarkUpType>();
    private List<MarkUpType> OISDescriptionMarkedList = new ArrayList<MarkUpType>();
    private List<MarkUpType> tradeMarkMarkedList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'OISID' element value. ��������� ������������� ���
     * 
     * @return value
     */
    public String getOISID() {
        return OISID;
    }

    /** 
     * Set the 'OISID' element value. ��������� ������������� ���
     * 
     * @param OISID
     */
    public void setOISID(String OISID) {
        this.OISID = OISID;
    }

    /** 
     * Get the 'Relevance' element value. ������� ������������ ��� �������� ������ (������ �������������). ����������� �������� 1, ������������ �������� �� ���������� (������������� 0 �������� � ���������� ������ � ������)
     * 
     * @return value
     */
    public String getRelevance() {
        return relevance;
    }

    /** 
     * Set the 'Relevance' element value. ������� ������������ ��� �������� ������ (������ �������������). ����������� �������� 1, ������������ �������� �� ���������� (������������� 0 �������� � ���������� ������ � ������)
     * 
     * @param relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /** 
     * Get the 'MessageR' element value. ��������� � ����������/������������ ��������, ���������� � 8, 9,14 ��. � ������� �� �������
     * 
     * @return value
     */
    public String getMessageR() {
        return messageR;
    }

    /** 
     * Set the 'MessageR' element value. ��������� � ����������/������������ ��������, ���������� � 8, 9,14 ��. � ������� �� �������
     * 
     * @param messageR
     */
    public void setMessageR(String messageR) {
        this.messageR = messageR;
    }

    /** 
     * Get the list of 'BrandOwner' element items. ��������������� (�����������). ����������� �����
     * 
     * @return list
     */
    public List<MarkUpType> getBrandOwnerList() {
        return brandOwnerList;
    }

    /** 
     * Set the list of 'BrandOwner' element items. ��������������� (�����������). ����������� �����
     * 
     * @param list
     */
    public void setBrandOwnerList(List<MarkUpType> list) {
        brandOwnerList = list;
    }

    /** 
     * Get the list of 'OISDescriptionMarked' element items. ����������� ��������� �������� ���
     * 
     * @return list
     */
    public List<MarkUpType> getOISDescriptionMarkedList() {
        return OISDescriptionMarkedList;
    }

    /** 
     * Set the list of 'OISDescriptionMarked' element items. ����������� ��������� �������� ���
     * 
     * @param list
     */
    public void setOISDescriptionMarkedList(List<MarkUpType> list) {
        OISDescriptionMarkedList = list;
    }

    /** 
     * Get the list of 'TradeMarkMarked' element items. ��������� �� �� ��� ��� (����������� �����)
     * 
     * @return list
     */
    public List<MarkUpType> getTradeMarkMarkedList() {
        return tradeMarkMarkedList;
    }

    /** 
     * Set the list of 'TradeMarkMarked' element items. ��������� �� �� ��� ��� (����������� �����)
     * 
     * @param list
     */
    public void setTradeMarkMarkedList(List<MarkUpType> list) {
        tradeMarkMarkedList = list;
    }
}
