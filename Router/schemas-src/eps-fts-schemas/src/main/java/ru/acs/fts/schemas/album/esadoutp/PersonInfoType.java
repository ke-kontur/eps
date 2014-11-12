
package ru.acs.fts.schemas.album.esadoutp;

/** 
 * Сведения о лице, осуществившем отправку
 */
public class PersonInfoType
{
    private String personName;
    private String personPost;

    /** 
     * Get the 'PersonName' element value. ФИО лица, осуществившего отправку
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО лица, осуществившего отправку
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
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
