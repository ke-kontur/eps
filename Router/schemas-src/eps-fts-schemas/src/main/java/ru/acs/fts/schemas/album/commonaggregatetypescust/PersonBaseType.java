
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ������� ����� ��� �������� �������� � ����������� ����. ���, ���������
 */
public class PersonBaseType
{
    private String personSurname;
    private String personName;
    private String personMiddleName;
    private String personPost;

    /** 
     * Get the 'PersonSurname' element value. �������
     * 
     * @return value
     */
    public String getPersonSurname() {
        return personSurname;
    }

    /** 
     * Set the 'PersonSurname' element value. �������
     * 
     * @param personSurname
     */
    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    /** 
     * Get the 'PersonName' element value. ���
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ���
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PersonMiddleName' element value. ��������
     * 
     * @return value
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /** 
     * Set the 'PersonMiddleName' element value. ��������
     * 
     * @param personMiddleName
     */
    public void setPersonMiddleName(String personMiddleName) {
        this.personMiddleName = personMiddleName;
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
