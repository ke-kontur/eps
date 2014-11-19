
package ru.acs.fts.schemas.album.responsecheckinventory;

import org.joda.time.LocalDate;

/** 
 * �������� �� �����
 */
public class InvCheckResultType
{
    private String invDocCode;
    private String invDocName;
    private String invDocNumber;
    private LocalDate invDocDate;
    private String archID;
    private String archDocID;
    private String inventDocumentID;
    private String inventLineID;
    private String checkResultCode;
    private String checkResultDesc;

    /** 
     * Get the 'InvDocCode' element value. ��� ���� ��������������� ���������
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. ��� ���� ��������������� ���������
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
     * Get the 'CheckResultCode' element value. ��� ����������  ���������
     * 
     * @return value
     */
    public String getCheckResultCode() {
        return checkResultCode;
    }

    /** 
     * Set the 'CheckResultCode' element value. ��� ����������  ���������
     * 
     * @param checkResultCode
     */
    public void setCheckResultCode(String checkResultCode) {
        this.checkResultCode = checkResultCode;
    }

    /** 
     * Get the 'CheckResultDesc' element value. ��������  ���������� ���������
     * 
     * @return value
     */
    public String getCheckResultDesc() {
        return checkResultDesc;
    }

    /** 
     * Set the 'CheckResultDesc' element value. ��������  ���������� ���������
     * 
     * @param checkResultDesc
     */
    public void setCheckResultDesc(String checkResultDesc) {
        this.checkResultDesc = checkResultDesc;
    }
}
