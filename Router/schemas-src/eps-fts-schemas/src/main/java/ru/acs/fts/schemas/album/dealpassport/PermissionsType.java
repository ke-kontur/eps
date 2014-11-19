
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * Информация о разрешениях
 */
public class PermissionsType
{
    private String documentNumber;
    private LocalDate issueDate;
    private String summa;
    private LocalDate permitEndDate;

    /** 
     * Get the 'DocumentNumber' element value. Номер разрешения. В случае отсутствия номера ставиться "б/н"
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер разрешения. В случае отсутствия номера ставиться "б/н"
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата разрешения
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата разрешения
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Summa' element value. Сумма разрешенной операции в валюте цены
     * 
     * @return value
     */
    public String getSumma() {
        return summa;
    }

    /** 
     * Set the 'Summa' element value. Сумма разрешенной операции в валюте цены
     * 
     * @param summa
     */
    public void setSumma(String summa) {
        this.summa = summa;
    }

    /** 
     * Get the 'PermitEndDate' element value. Дата окончания действия разрешения
     * 
     * @return value
     */
    public LocalDate getPermitEndDate() {
        return permitEndDate;
    }

    /** 
     * Set the 'PermitEndDate' element value. Дата окончания действия разрешения
     * 
     * @param permitEndDate
     */
    public void setPermitEndDate(LocalDate permitEndDate) {
        this.permitEndDate = permitEndDate;
    }
}
