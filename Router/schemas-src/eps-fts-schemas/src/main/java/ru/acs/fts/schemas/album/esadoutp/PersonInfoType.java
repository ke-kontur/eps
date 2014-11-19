
package ru.acs.fts.schemas.album.esadoutp;

/** 
 * �������� � ����, ������������� ��������
 */
public class PersonInfoType
{
    private String personName;
    private String personPost;

    /** 
     * Get the 'PersonName' element value. ��� ����, �������������� ��������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����, �������������� ��������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PersonPost' element value. ���������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }
}
