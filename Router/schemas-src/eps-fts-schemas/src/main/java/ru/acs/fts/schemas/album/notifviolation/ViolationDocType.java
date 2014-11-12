
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ, источник информации о выявленном нарушении. (протокол, акт досмотра и т.п.)
 */
public class ViolationDocType extends DocumentBaseType
{
    private List<String> commentList = new ArrayList<String>();

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
