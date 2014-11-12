
package ru.acs.fts.schemas.album.passport;

import org.joda.time.LocalDate;

/** 
 * �������� � ���. ����
 */
public class PersonInfoType
{
    private String personSurname;
    private String personName;
    private String personMiddleName;
    private String sex;
    private LocalDate birthday;
    private String birthplace;

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
     * Get the 'PersonName' element value. ���. 
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ���. 
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
     * Get the 'Sex' element value. ���: 1 - �������; 0 - �������
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. ���: 1 - �������; 0 - �������
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'Birthday' element value. ���� ��������.
     * 
     * @return value
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /** 
     * Set the 'Birthday' element value. ���� ��������.
     * 
     * @param birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /** 
     * Get the 'Birthplace' element value. ����� ��������
     * 
     * @return value
     */
    public String getBirthplace() {
        return birthplace;
    }

    /** 
     * Set the 'Birthplace' element value. ����� ��������
     * 
     * @param birthplace
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
