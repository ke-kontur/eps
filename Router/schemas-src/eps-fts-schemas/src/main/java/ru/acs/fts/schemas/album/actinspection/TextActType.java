
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Текст Акта
 */
public class TextActType
{
    private List<String> paragraphList = new ArrayList<String>();

    /** 
     * Get the list of 'Paragraph' element items. Абзац текста
     * 
     * @return list
     */
    public List<String> getParagraphList() {
        return paragraphList;
    }

    /** 
     * Set the list of 'Paragraph' element items. Абзац текста
     * 
     * @param list
     */
    public void setParagraphList(List<String> list) {
        paragraphList = list;
    }
}
