
package ru.acs.fts.schemas.album.cwquery;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ������������� ����������
 */
public class NumbersType
{
    private List<String> documentNumberList = new ArrayList<String>();

    /** 
     * Get the list of 'DocumentNumbers' element items. ����� �������������� ���������
     * 
     * @return list
     */
    public List<String> getDocumentNumberList() {
        return documentNumberList;
    }

    /** 
     * Set the list of 'DocumentNumbers' element items. ����� �������������� ���������
     * 
     * @param list
     */
    public void setDocumentNumberList(List<String> list) {
        documentNumberList = list;
    }
}
