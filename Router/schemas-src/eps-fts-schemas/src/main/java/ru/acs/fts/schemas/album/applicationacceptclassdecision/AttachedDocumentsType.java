
package ru.acs.fts.schemas.album.applicationacceptclassdecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � �������������� ����������� ����������, ��������� � ���������
 */
public class AttachedDocumentsType extends DocumentBaseType
{
    private String docForm;
    private LocalDate presentationDate;
    private String sheetsNumber;

    /** 
     * Get the 'DocForm' element value. ������� ����������� ����� ���������, ��������������� � ���������� � �������� ���������������� �������
     * 
     * @return value
     */
    public String getDocForm() {
        return docForm;
    }

    /** 
     * Set the 'DocForm' element value. ������� ����������� ����� ���������, ��������������� � ���������� � �������� ���������������� �������
     * 
     * @param docForm
     */
    public void setDocForm(String docForm) {
        this.docForm = docForm;
    }

    /** 
     * Get the 'PresentationDate' element value. ���� ������������� ���������
     * 
     * @return value
     */
    public LocalDate getPresentationDate() {
        return presentationDate;
    }

    /** 
     * Set the 'PresentationDate' element value. ���� ������������� ���������
     * 
     * @param presentationDate
     */
    public void setPresentationDate(LocalDate presentationDate) {
        this.presentationDate = presentationDate;
    }

    /** 
     * Get the 'SheetsNumber' element value. ���������� ������ ���������� (����� �������������� ����������)
     * 
     * @return value
     */
    public String getSheetsNumber() {
        return sheetsNumber;
    }

    /** 
     * Set the 'SheetsNumber' element value. ���������� ������ ���������� (����� �������������� ����������)
     * 
     * @param sheetsNumber
     */
    public void setSheetsNumber(String sheetsNumber) {
        this.sheetsNumber = sheetsNumber;
    }
}
