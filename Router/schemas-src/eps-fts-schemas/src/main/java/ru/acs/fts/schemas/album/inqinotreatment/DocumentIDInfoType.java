
package ru.acs.fts.schemas.album.inqinotreatment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ����������,  �������������� ���������� �������� �� �����������
 */
public class DocumentIDInfoType extends DocumentBaseType
{
    private List<String> confirmInfoList = new ArrayList<String>();

    /** 
     * Get the list of 'ConfirmInfo' element items. �������� �� ���������� ��������� ����������������� � ���, ��� ��������� �� ����������� ���� ����������� ������, ���������� � ���������� ���������� ���������� ��������� � ������������ � ���������� ������� ����������� ��� ���������� ����������.
     * 
     * @return list
     */
    public List<String> getConfirmInfoList() {
        return confirmInfoList;
    }

    /** 
     * Set the list of 'ConfirmInfo' element items. �������� �� ���������� ��������� ����������������� � ���, ��� ��������� �� ����������� ���� ����������� ������, ���������� � ���������� ���������� ���������� ��������� � ������������ � ���������� ������� ����������� ��� ���������� ����������.
     * 
     * @param list
     */
    public void setConfirmInfoList(List<String> list) {
        confirmInfoList = list;
    }
}
