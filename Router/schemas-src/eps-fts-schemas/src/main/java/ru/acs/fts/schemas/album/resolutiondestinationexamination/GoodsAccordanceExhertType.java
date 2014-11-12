
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������, ��������������� ��������
 */
public class GoodsAccordanceExhertType
{
    private List<String> listSampleList = new ArrayList<String>();
    private List<DocumentBaseType> documentList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'ListSample' element items. �������� ���� � ��������
     * 
     * @return list
     */
    public List<String> getListSampleList() {
        return listSampleList;
    }

    /** 
     * Set the list of 'ListSample' element items. �������� ���� � ��������
     * 
     * @param list
     */
    public void setListSampleList(List<String> list) {
        listSampleList = list;
    }

    /** 
     * Get the list of 'Documents' element items. ���������, ����������� � ������ � ��������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Documents' element items. ���������, ����������� � ������ � ��������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
    }
}
