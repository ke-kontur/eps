
package ru.acs.fts.schemas.album.inotreatmentinventory;

import org.joda.time.LocalDate;

/** 
 * �������� �� �����
 */
public class InventDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String invDocNumber;
    private String invDocPresentation;
    private String invDocLists;
    private String invDocCopies;
    private String note;
    private LocalDate docDate;

    /** 
     * Get the 'InvDocCode' element value. ��� ���� ��������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. ��� ���� ��������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param invDocCode
     */
    public void setInvDocCode(String invDocCode) {
        this.invDocCode = invDocCode;
    }

    /** 
     * Get the 'InvDocName' element value. ��� ���������
     * 
     * @return value
     */
    public String getInvDocName() {
        return invDocName;
    }

    /** 
     * Set the 'InvDocName' element value. ��� ���������
     * 
     * @param invDocName
     */
    public void setInvDocName(String invDocName) {
        this.invDocName = invDocName;
    }

    /** 
     * Get the 'InvDocNumber' element value. ����� ���������. ��� ���������� ������ ����������� "�/�"
     * 
     * @return value
     */
    public String getInvDocNumber() {
        return invDocNumber;
    }

    /** 
     * Set the 'InvDocNumber' element value. ����� ���������. ��� ���������� ������ ����������� "�/�"
     * 
     * @param invDocNumber
     */
    public void setInvDocNumber(String invDocNumber) {
        this.invDocNumber = invDocNumber;
    }

    /** 
     * Get the 'InvDocPresentation' element value. ��� ������������� ���������: "�" - ��������, "�" - ����� (����������� ���������� ������� ���������)
     * 
     * @return value
     */
    public String getInvDocPresentation() {
        return invDocPresentation;
    }

    /** 
     * Set the 'InvDocPresentation' element value. ��� ������������� ���������: "�" - ��������, "�" - ����� (����������� ���������� ������� ���������)
     * 
     * @param invDocPresentation
     */
    public void setInvDocPresentation(String invDocPresentation) {
        this.invDocPresentation = invDocPresentation;
    }

    /** 
     * Get the 'InvDocLists' element value. ���������� ������ � ���������
     * 
     * @return value
     */
    public String getInvDocLists() {
        return invDocLists;
    }

    /** 
     * Set the 'InvDocLists' element value. ���������� ������ � ���������
     * 
     * @param invDocLists
     */
    public void setInvDocLists(String invDocLists) {
        this.invDocLists = invDocLists;
    }

    /** 
     * Get the 'InvDocCopies' element value. ���������� �����������
     * 
     * @return value
     */
    public String getInvDocCopies() {
        return invDocCopies;
    }

    /** 
     * Set the 'InvDocCopies' element value. ���������� �����������
     * 
     * @param invDocCopies
     */
    public void setInvDocCopies(String invDocCopies) {
        this.invDocCopies = invDocCopies;
    }

    /** 
     * Get the 'Note' element value. ����������
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. ����������
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'DocDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. ���� ���������
     * 
     * @param docDate
     */
    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }
}
