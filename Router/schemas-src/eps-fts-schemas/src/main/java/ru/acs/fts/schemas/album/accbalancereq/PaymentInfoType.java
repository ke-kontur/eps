
package ru.acs.fts.schemas.album.accbalancereq;

import org.joda.time.LocalDate;

/** 
 * Сведения о платежном документе (если запрашивается остаток на конкретной ПП)
 */
public class PaymentInfoType
{
    private String ID;
    private LocalDate issueDate;
    private String amount;

    /** 
     * Get the 'ID' element value. Номер платежного документа
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Номер платежного документа
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'IssueDate' element value. Дата платежного документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата платежного документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Amount' element value. Общая сумма платежного документа.
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая сумма платежного документа.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
