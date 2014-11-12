
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� � �������� ������ ��� ����� ������� � ������ ���������� ��� ���������������� ��������� ��� ������ ���������� �����
 */
public class ReExpFinDocumentType
{
    private String finDocumentCode;
    private String finDocumentNumber;
    private LocalDate presentingDate;

    /** 
     * Get the 'FinDocumentCode' element value. ��� ��������������� ���������. 1- ��; 2 - ��� .
     * 
     * @return value
     */
    public String getFinDocumentCode() {
        return finDocumentCode;
    }

    /** 
     * Set the 'FinDocumentCode' element value. ��� ��������������� ���������. 1- ��; 2 - ��� .
     * 
     * @param finDocumentCode
     */
    public void setFinDocumentCode(String finDocumentCode) {
        this.finDocumentCode = finDocumentCode;
    }

    /** 
     * Get the 'FinDocumentNumber' element value. ����� ��������������� ��/���.
     * 
     * @return value
     */
    public String getFinDocumentNumber() {
        return finDocumentNumber;
    }

    /** 
     * Set the 'FinDocumentNumber' element value. ����� ��������������� ��/���.
     * 
     * @param finDocumentNumber
     */
    public void setFinDocumentNumber(String finDocumentNumber) {
        this.finDocumentNumber = finDocumentNumber;
    }

    /** 
     * Get the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������.
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������.
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }
}
