
package ru.acs.fts.schemas.album.mpo_declaration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об отправителе
 */
public class ConsignorType extends CUOrganizationType
{
    private LocalDate issueDate;

    /** 
     * Get the 'IssueDate' element value. Дата подписания
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата подписания
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
