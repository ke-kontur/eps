
package ru.acs.fts.schemas.album.bartertransactionpasport;

import org.joda.time.LocalDate;

/** 
 * Регистрационные данные Паспорта бартерной сделки
 */
public class RegistrationType
{
    private LocalDate issueDate;
    private PasportIDType pasportID;

    /** 
     * Get the 'IssueDate' element value. Дата регистрации Паспорта в МВЭС России    
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата регистрации Паспорта в МВЭС России    
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'PasportID' element value. Номер паспорта бартерной сделки 
     * 
     * @return value
     */
    public PasportIDType getPasportID() {
        return pasportID;
    }

    /** 
     * Set the 'PasportID' element value. Номер паспорта бартерной сделки 
     * 
     * @param pasportID
     */
    public void setPasportID(PasportIDType pasportID) {
        this.pasportID = pasportID;
    }
}
