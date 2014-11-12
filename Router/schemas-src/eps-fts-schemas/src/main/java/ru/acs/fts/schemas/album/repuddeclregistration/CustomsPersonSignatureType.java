
package ru.acs.fts.schemas.album.repuddeclregistration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Подпись должностного лица
 */
public class CustomsPersonSignatureType extends CustomsPersonType
{
    private LocalDate issueDate;

    /** 
     * Get the 'IssueDate' element value. Дата подписания.
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата подписания.
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
