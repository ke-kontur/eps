
package ru.acs.fts.schemas.album.sanitarysertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ���������-������������������� ����������
 */
public class SertifSupplementType
{
    private List<String> supplementTextList = new ArrayList<String>();

    /** 
     * Get the list of 'SupplementText' element items. ����� ����������
     * 
     * @return list
     */
    public List<String> getSupplementTextList() {
        return supplementTextList;
    }

    /** 
     * Set the list of 'SupplementText' element items. ����� ����������
     * 
     * @param list
     */
    public void setSupplementTextList(List<String> list) {
        supplementTextList = list;
    }
}
