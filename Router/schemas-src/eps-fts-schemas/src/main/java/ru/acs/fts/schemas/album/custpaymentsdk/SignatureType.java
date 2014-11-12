
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Подпись должностного лица
 */
public class SignatureType extends CustomsPersonType
{
    private LocalDate issueDate;

    /** 
     * Get the 'IssueDate' element value. Дата подписи.
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата подписи.
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
