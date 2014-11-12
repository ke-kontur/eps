
package ru.acs.fts.schemas.album.inqchangeinotreatment;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание предлагаемых изменений в действующее разрешение на переработку
 */
public class ChangesType
{
    private List<String> chDescriptionList = new ArrayList<String>();
    private List<String> commentList = new ArrayList<String>();

    /** 
     * Get the list of 'ChDescription' element items. Описание изменения
     * 
     * @return list
     */
    public List<String> getChDescriptionList() {
        return chDescriptionList;
    }

    /** 
     * Set the list of 'ChDescription' element items. Описание изменения
     * 
     * @param list
     */
    public void setChDescriptionList(List<String> list) {
        chDescriptionList = list;
    }

    /** 
     * Get the list of 'Comments' element items. Комментарии
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Комментарии
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }
}
