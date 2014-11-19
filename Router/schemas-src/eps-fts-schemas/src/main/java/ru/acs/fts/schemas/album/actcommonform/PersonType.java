
package ru.acs.fts.schemas.album.actcommonform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Лицо, в присутствии которого составлен акт
 */
public class PersonType extends PersonSignatureType
{
    private String comment;

    /** 
     * Get the 'Comment' element value. Примечание
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Примечание
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
