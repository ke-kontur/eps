
package ru.acs.fts.schemas.album.reqcorrecteddata;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ��������������
 */
public class UncertaintyType
{
    private List<String> uncertDescriptionList = new ArrayList<String>();
    private List<BadDocumentType> badDocumentList = new ArrayList<BadDocumentType>();

    /** 
     * Get the list of 'UncertDescription' element items. �������� ���������� ��������������
     * 
     * @return list
     */
    public List<String> getUncertDescriptionList() {
        return uncertDescriptionList;
    }

    /** 
     * Set the list of 'UncertDescription' element items. �������� ���������� ��������������
     * 
     * @param list
     */
    public void setUncertDescriptionList(List<String> list) {
        uncertDescriptionList = list;
    }

    /** 
     * Get the list of 'BadDocument' element items. �������� � ���������, ���������� ������ (��, ���, �����) ��� �������� ��������� ����������� �������������
     * 
     * @return list
     */
    public List<BadDocumentType> getBadDocumentList() {
        return badDocumentList;
    }

    /** 
     * Set the list of 'BadDocument' element items. �������� � ���������, ���������� ������ (��, ���, �����) ��� �������� ��������� ����������� �������������
     * 
     * @param list
     */
    public void setBadDocumentList(List<BadDocumentType> list) {
        badDocumentList = list;
    }
}
