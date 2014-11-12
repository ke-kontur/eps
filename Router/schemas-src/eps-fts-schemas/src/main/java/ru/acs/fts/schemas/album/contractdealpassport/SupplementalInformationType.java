
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * ���������� ����������
 */
public class SupplementalInformationType
{
    private String documentType;
    private LocalDate date;

    /** 
     * Get the 'DocumentType' element value. ��� ��������� (1 - �������� ��������, 2 - ����������� ��������)
     * 
     * @return value
     */
    public String getDocumentType() {
        return documentType;
    }

    /** 
     * Set the 'DocumentType' element value. ��� ��������� (1 - �������� ��������, 2 - ����������� ��������)
     * 
     * @param documentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /** 
     * Get the 'Date' element value. ���� ������ ����������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ������ ����������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
