
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * ���������� ����
 */
public class UseTSTKType
{
    private String TSTKCode;
    private String comments;

    /** 
     * Get the 'TSTKCode' element value. ��� ����������� ����
     * 
     * @return value
     */
    public String getTSTKCode() {
        return TSTKCode;
    }

    /** 
     * Set the 'TSTKCode' element value. ��� ����������� ����
     * 
     * @param TSTKCode
     */
    public void setTSTKCode(String TSTKCode) {
        this.TSTKCode = TSTKCode;
    }

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
