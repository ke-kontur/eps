
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Параграф текста
 */
public class TextParagrType
{
    private List<String> textParaList = new ArrayList<String>();
    private TextStyleType style;

    /** 
     * Get the list of 'TextPara' element items. Параграф текста
     * 
     * @return list
     */
    public List<String> getTextParaList() {
        return textParaList;
    }

    /** 
     * Set the list of 'TextPara' element items. Параграф текста
     * 
     * @param list
     */
    public void setTextParaList(List<String> list) {
        textParaList = list;
    }

    /** 
     * Get the 'style' attribute value.
     * 
     * @return value
     */
    public TextStyleType getStyle() {
        return style;
    }

    /** 
     * Set the 'style' attribute value.
     * 
     * @param style
     */
    public void setStyle(TextStyleType style) {
        this.style = style;
    }
}
