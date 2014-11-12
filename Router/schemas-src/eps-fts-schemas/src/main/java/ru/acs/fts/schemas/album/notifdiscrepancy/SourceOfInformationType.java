
package ru.acs.fts.schemas.album.notifdiscrepancy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � �������������� �������� (������, ���� ����� �������, ��������)
 */
public class SourceOfInformationType extends DocumentBaseType
{
    private String comments;

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
