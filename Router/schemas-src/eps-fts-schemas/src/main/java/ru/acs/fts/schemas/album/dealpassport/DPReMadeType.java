
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * ���������� � �������������� ��
 */
public class DPReMadeType
{
    private String documentNumber;
    private LocalDate date;

    /** 
     * Get the 'DocumentNumber' element value. ����� �������������� ��
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� �������������� ��
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'Date' element value. ���� �������������� ��
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������������� ��
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
