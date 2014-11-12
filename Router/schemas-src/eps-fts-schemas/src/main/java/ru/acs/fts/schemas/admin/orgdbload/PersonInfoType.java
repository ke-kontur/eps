
package ru.acs.fts.schemas.admin.orgdbload;

/** 
 * Информация  о контактных  лицах
 */
public class PersonInfoType
{
    private String prsnLastName;
    private String prsnName;
    private String prsnSecondName;
    private String contactPhone;
    private String EMAIL;
    private String prsnPost;
    private String comments;

    /** 
     * Get the 'PrsnLastName' element value. Фамилия
     * 
     * @return value
     */
    public String getPrsnLastName() {
        return prsnLastName;
    }

    /** 
     * Set the 'PrsnLastName' element value. Фамилия
     * 
     * @param prsnLastName
     */
    public void setPrsnLastName(String prsnLastName) {
        this.prsnLastName = prsnLastName;
    }

    /** 
     * Get the 'PrsnName' element value. Имя
     * 
     * @return value
     */
    public String getPrsnName() {
        return prsnName;
    }

    /** 
     * Set the 'PrsnName' element value. Имя
     * 
     * @param prsnName
     */
    public void setPrsnName(String prsnName) {
        this.prsnName = prsnName;
    }

    /** 
     * Get the 'PrsnSecondName' element value. Отчество
     * 
     * @return value
     */
    public String getPrsnSecondName() {
        return prsnSecondName;
    }

    /** 
     * Set the 'PrsnSecondName' element value. Отчество
     * 
     * @param prsnSecondName
     */
    public void setPrsnSecondName(String prsnSecondName) {
        this.prsnSecondName = prsnSecondName;
    }

    /** 
     * Get the 'ContactPhone' element value. Контактный  телефон
     * 
     * @return value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** 
     * Set the 'ContactPhone' element value. Контактный  телефон
     * 
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /** 
     * Get the 'E_MAIL' element value. Контактный e-mail
     * 
     * @return value
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /** 
     * Set the 'E_MAIL' element value. Контактный e-mail
     * 
     * @param EMAIL
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /** 
     * Get the 'PrsnPost' element value. Должность
     * 
     * @return value
     */
    public String getPrsnPost() {
        return prsnPost;
    }

    /** 
     * Set the 'PrsnPost' element value. Должность
     * 
     * @param prsnPost
     */
    public void setPrsnPost(String prsnPost) {
        this.prsnPost = prsnPost;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
