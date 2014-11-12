
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Базовый класс для указания сведений о должностном лице. ФИО, должность
 */
public class PersonBaseType
{
    private String personSurname;
    private String personName;
    private String personMiddleName;
    private String personPost;

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
     * Get the 'PersonName' element value. Имя
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. Имя
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
     * Get the 'PersonPost' element value. Должность
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }
}
