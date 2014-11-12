
package ru.acs.fts.schemas.album.notifdiscrepancy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о несоответствии сведений (номера, даты актов осмотра, досмотра)
 */
public class SourceOfInformationType extends DocumentBaseType
{
    private String comments;

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
