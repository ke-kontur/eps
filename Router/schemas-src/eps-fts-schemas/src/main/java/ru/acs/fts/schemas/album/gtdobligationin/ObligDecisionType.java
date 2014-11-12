
package ru.acs.fts.schemas.album.gtdobligationin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ������� �� ������� �������
 */
public class ObligDecisionType
{
    private String decision;
    private String code;
    private String foundation;
    private LocalDate decDate;
    private String decTime;
    private LocalDate dateLimit;
    private CustomsPersonType authorizedPerson;

    /** 
     * Get the 'Decision' element value. ������� �� �������������
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. ������� �� �������������
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'Code' element value. ��� ��������� �������
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. ��� ��������� �������
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Foundation' element value. �����������
     * 
     * @return value
     */
    public String getFoundation() {
        return foundation;
    }

    /** 
     * Set the 'Foundation' element value. �����������
     * 
     * @param foundation
     */
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    /** 
     * Get the 'DecDate' element value. ����
     * 
     * @return value
     */
    public LocalDate getDecDate() {
        return decDate;
    }

    /** 
     * Set the 'DecDate' element value. ����
     * 
     * @param decDate
     */
    public void setDecDate(LocalDate decDate) {
        this.decDate = decDate;
    }

    /** 
     * Get the 'DecTime' element value. �����
     * 
     * @return value
     */
    public String getDecTime() {
        return decTime;
    }

    /** 
     * Set the 'DecTime' element value. �����
     * 
     * @param decTime
     */
    public void setDecTime(String decTime) {
        this.decTime = decTime;
    }

    /** 
     * Get the 'DateLimit' element value. ���� ������ ��, ����������, ��������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� ������ ��, ����������, ��������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ����
     * 
     * @return value
     */
    public CustomsPersonType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(CustomsPersonType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}
