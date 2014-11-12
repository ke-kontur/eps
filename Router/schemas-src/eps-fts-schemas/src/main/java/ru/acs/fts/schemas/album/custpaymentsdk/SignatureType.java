
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ������� ������������ ����
 */
public class SignatureType extends CustomsPersonType
{
    private LocalDate issueDate;

    /** 
     * Get the 'IssueDate' element value. ���� �������.
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� �������.
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
