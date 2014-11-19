
package ru.acs.fts.schemas.album.transferpersonexplanation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Отметки таможни
 */
public class CustomsMarkType extends CustomsPersonType
{
    private String personPost;
    private LocalDate receiveDate;

    /** 
     * Get the 'PersonPost' element value. Должность.
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность.
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'ReceiveDate' element value. Дата получения пояснений
     * 
     * @return value
     */
    public LocalDate getReceiveDate() {
        return receiveDate;
    }

    /** 
     * Set the 'ReceiveDate' element value. Дата получения пояснений
     * 
     * @param receiveDate
     */
    public void setReceiveDate(LocalDate receiveDate) {
        this.receiveDate = receiveDate;
    }
}
