
package ru.acs.fts.schemas.album.actcommonform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����, � ����������� �������� ��������� ���
 */
public class PersonType extends PersonSignatureType
{
    private String comment;

    /** 
     * Get the 'Comment' element value. ����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. ����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
