
package ru.acs.fts.schemas.album.transferpersonexplanation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Текст пояснения
 */
public class ExplanationTextType
{
    private List<String> textLineList = new ArrayList<String>();

    /** 
     * Get the list of 'TextLine' element items. Строка текста
     * 
     * @return list
     */
    public List<String> getTextLineList() {
        return textLineList;
    }

    /** 
     * Set the list of 'TextLine' element items. Строка текста
     * 
     * @param list
     */
    public void setTextLineList(List<String> list) {
        textLineList = list;
    }
}
