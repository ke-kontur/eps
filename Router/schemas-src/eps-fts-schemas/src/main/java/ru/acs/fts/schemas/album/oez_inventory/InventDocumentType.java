
package ru.acs.fts.schemas.album.oez_inventory;

import org.joda.time.LocalDate;

/** 
 * �������� �� �����.
 */
public class InventDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String invDocNumber;
    private LocalDate invDocDate;
    private String invDocLists;
    private String invDocCopies;
    private String note;
    private String archID;
    private String archDocID;
    private String inventDocumentID;
    private String inventLineID;
    private String paperDocumentSign;

    /** 
     * Get the 'InvDocCode' element value. ��� ���� ��������������� ���������. ����������� �������� �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��. 
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. ��� ���� ��������������� ���������. ����������� �������� �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��. 
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
     * Get the 'InvDocNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getInvDocNumber() {
        return invDocNumber;
    }

    /** 
     * Set the 'InvDocNumber' element value. ����� ���������
     * 
     * @param invDocNumber
     */
    public void setInvDocNumber(String invDocNumber) {
        this.invDocNumber = invDocNumber;
    }

    /** 
     * Get the 'InvDocDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getInvDocDate() {
        return invDocDate;
    }

    /** 
     * Set the 'InvDocDate' element value. ���� ���������
     * 
     * @param invDocDate
     */
    public void setInvDocDate(LocalDate invDocDate) {
        this.invDocDate = invDocDate;
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
     * Get the 'ArchID' element value. ������������� ������������ ������ ����������
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. ������������� ������������ ������ ����������
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. ������������� ��������� � ����������� ������ ����������
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. ������������� ��������� � ����������� ������ ����������
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'InventDocumentID' element value. ���������� ������������� ���������, ��������������� � �����. ����������� ��� ������������� � �������� ������������ �������������� � ������ ������� �� ������ ����������� ����� ���������� ��������� � ����������� ����.
     * 
     * @return value
     */
    public String getInventDocumentID() {
        return inventDocumentID;
    }

    /** 
     * Set the 'InventDocumentID' element value. ���������� ������������� ���������, ��������������� � �����. ����������� ��� ������������� � �������� ������������ �������������� � ������ ������� �� ������ ����������� ����� ���������� ��������� � ����������� ����.
     * 
     * @param inventDocumentID
     */
    public void setInventDocumentID(String inventDocumentID) {
        this.inventDocumentID = inventDocumentID;
    }

    /** 
     * Get the 'InventLineID' element value. ���������� ������������� ������ � �����. GUID. ���������� ��� ���������� ��� ������������� � �������� ������������ ��������������.
     * 
     * @return value
     */
    public String getInventLineID() {
        return inventLineID;
    }

    /** 
     * Set the 'InventLineID' element value. ���������� ������������� ������ � �����. GUID. ���������� ��� ���������� ��� ������������� � �������� ������������ ��������������.
     * 
     * @param inventLineID
     */
    public void setInventLineID(String inventLineID) {
        this.inventLineID = inventLineID;
    }

    /** 
     * Get the 'PaperDocumentSign' element value. ������� ������ ��������� � �������� ����.
     * 
     * @return value
     */
    public String getPaperDocumentSign() {
        return paperDocumentSign;
    }

    /** 
     * Set the 'PaperDocumentSign' element value. ������� ������ ��������� � �������� ����.
     * 
     * @param paperDocumentSign
     */
    public void setPaperDocumentSign(String paperDocumentSign) {
        this.paperDocumentSign = paperDocumentSign;
    }
}
