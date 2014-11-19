
package ru.acs.fts.schemas.album.passport;

import org.joda.time.LocalDate;

/** 
 * Сведения о физ. лице
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
     * Get the 'PersonSurname' element value. Фамилия
     * 
     * @return value
     */
    public String getPersonSurname() {
        return personSurname;
    }

    /** 
     * Set the 'PersonSurname' element value. Фамилия
     * 
     * @param personSurname
     */
    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    /** 
     * Get the 'PersonName' element value. Имя. 
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. Имя. 
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PersonMiddleName' element value. Отчество
     * 
     * @return value
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /** 
     * Set the 'PersonMiddleName' element value. Отчество
     * 
     * @param personMiddleName
     */
    public void setPersonMiddleName(String personMiddleName) {
        this.personMiddleName = personMiddleName;
    }

    /** 
     * Get the 'Sex' element value. Пол: 1 - женский; 0 - мужской
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. Пол: 1 - женский; 0 - мужской
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'Birthday' element value. Дата рождения.
     * 
     * @return value
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /** 
     * Set the 'Birthday' element value. Дата рождения.
     * 
     * @param birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /** 
     * Get the 'Birthplace' element value. Место рождения
     * 
     * @return value
     */
    public String getBirthplace() {
        return birthplace;
    }

    /** 
     * Set the 'Birthplace' element value. Место рождения
     * 
     * @param birthplace
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
