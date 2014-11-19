
package ru.acs.fts.schemas.admin.orgdbupdate;

import java.math.BigDecimal;
import org.joda.time.DateTime;

/** 
 * ����������  � ����������  �����
 */
public class PersonInfoType
{
    private String personID;
    private String prsnLastName;
    private String prsnName;
    private String prsnSecondName;
    private String contactPhone;
    private String EMAIL;
    private String prsnPost;
    private BigDecimal personCloseFlag;
    private DateTime chDateTime;
    private String comments;

    /** 
     * Get the 'PersonID' element value. ������������� ������
     * 
     * @return value
     */
    public String getPersonID() {
        return personID;
    }

    /** 
     * Set the 'PersonID' element value. ������������� ������
     * 
     * @param personID
     */
    public void setPersonID(String personID) {
        this.personID = personID;
    }

    /** 
     * Get the 'PrsnLastName' element value. �������
     * 
     * @return value
     */
    public String getPrsnLastName() {
        return prsnLastName;
    }

    /** 
     * Set the 'PrsnLastName' element value. �������
     * 
     * @param prsnLastName
     */
    public void setPrsnLastName(String prsnLastName) {
        this.prsnLastName = prsnLastName;
    }

    /** 
     * Get the 'PrsnName' element value. ���
     * 
     * @return value
     */
    public String getPrsnName() {
        return prsnName;
    }

    /** 
     * Set the 'PrsnName' element value. ���
     * 
     * @param prsnName
     */
    public void setPrsnName(String prsnName) {
        this.prsnName = prsnName;
    }

    /** 
     * Get the 'PrsnSecondName' element value. ��������
     * 
     * @return value
     */
    public String getPrsnSecondName() {
        return prsnSecondName;
    }

    /** 
     * Set the 'PrsnSecondName' element value. ��������
     * 
     * @param prsnSecondName
     */
    public void setPrsnSecondName(String prsnSecondName) {
        this.prsnSecondName = prsnSecondName;
    }

    /** 
     * Get the 'ContactPhone' element value. ����������  �������
     * 
     * @return value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** 
     * Set the 'ContactPhone' element value. ����������  �������
     * 
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /** 
     * Get the 'E_MAIL' element value. ���������� e-mail
     * 
     * @return value
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /** 
     * Set the 'E_MAIL' element value. ���������� e-mail
     * 
     * @param EMAIL
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /** 
     * Get the 'PrsnPost' element value. ���������
     * 
     * @return value
     */
    public String getPrsnPost() {
        return prsnPost;
    }

    /** 
     * Set the 'PrsnPost' element value. ���������
     * 
     * @param prsnPost
     */
    public void setPrsnPost(String prsnPost) {
        this.prsnPost = prsnPost;
    }

    /** 
     * Get the 'PersonCloseFlag' element value. �������  ��������  ������  1 - �����������. 0 - �������������
     * 
     * @return value
     */
    public BigDecimal getPersonCloseFlag() {
        return personCloseFlag;
    }

    /** 
     * Set the 'PersonCloseFlag' element value. �������  ��������  ������  1 - �����������. 0 - �������������
     * 
     * @param personCloseFlag
     */
    public void setPersonCloseFlag(BigDecimal personCloseFlag) {
        this.personCloseFlag = personCloseFlag;
    }

    /** 
     * Get the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
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
