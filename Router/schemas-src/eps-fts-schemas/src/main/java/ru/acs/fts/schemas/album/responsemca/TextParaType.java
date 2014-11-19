
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������
 */
public class TextParaType
{
    private String style;
    private List<String> textParaList = new ArrayList<String>();

    /** 
     * Get the 'Style' element value. ����� ������
     * 
     * @return value
     */
    public String getStyle() {
        return style;
    }

    /** 
     * Set the 'Style' element value. ����� ������
     * 
     * @param style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /** 
     * Get the list of 'TextPara' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getTextParaList() {
        return textParaList;
    }

    /** 
     * Set the list of 'TextPara' element items. �������� ������
     * 
     * @param list
     */
    public void setTextParaList(List<String> list) {
        textParaList = list;
    }
}
