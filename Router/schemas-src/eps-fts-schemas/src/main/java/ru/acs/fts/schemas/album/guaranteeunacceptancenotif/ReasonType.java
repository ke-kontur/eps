
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

/** 
 * ������� ������������� �������� �����������. ������� Name ����� ��������� ��������� ��������: DOC_NOT_FOUND - �������� �� ������ � �� �� �����������; DOC_EXPIRED - �������� ����, ��������� � ��������� �����������, �� ��������� �������� ���������� ������������� ����������; FALSE_INFO - �������������� �������� �� ��������� ����������� ��������� � ��; LACK_OF_FUNDS - ��������������� ����� �����������; NO_FREE_FUNDS - ���������� ���������� ������� ���. �������; TECH_PROBLEM - ������� ����������� �������
 */
public class ReasonType
{
    private String name;
    private String comment;

    /** 
     * Get the 'Name' element value. ��������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Comment' element value. �����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. �����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
