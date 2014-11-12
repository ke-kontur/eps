
package ru.acs.fts.schemas.album.sem_ktresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.KTsType;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.ResultGoodsType;

/** 
 * ���������� � �������. � ������ ���������� ���������� �� ������� �� �������
 */
public class ResultKTGoodsType extends ResultGoodsType
{
    private String messageDoc;
    private List<KTsType> KTList = new ArrayList<KTsType>();

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
     * Get the list of 'KTs' element items. ��������� �������, ���������� �� ��������������� ������ �������, ����������� ��� ������������ � ����������� ����� ���������� ������� ��
     * 
     * @return list
     */
    public List<KTsType> getKTList() {
        return KTList;
    }

    /** 
     * Set the list of 'KTs' element items. ��������� �������, ���������� �� ��������������� ������ �������, ����������� ��� ������������ � ����������� ����� ���������� ������� ��
     * 
     * @param list
     */
    public void setKTList(List<KTsType> list) {
        KTList = list;
    }
}
