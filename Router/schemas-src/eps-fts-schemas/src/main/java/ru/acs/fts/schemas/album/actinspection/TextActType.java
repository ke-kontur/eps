
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����� ����
 */
public class TextActType
{
    private List<String> paragraphList = new ArrayList<String>();

    /** 
     * Get the list of 'Paragraph' element items. ����� ������
     * 
     * @return list
     */
    public List<String> getParagraphList() {
        return paragraphList;
    }

    /** 
     * Set the list of 'Paragraph' element items. ����� ������
     * 
     * @param list
     */
    public void setParagraphList(List<String> list) {
        paragraphList = list;
    }
}
