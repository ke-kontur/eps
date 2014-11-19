
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

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
    private String documentFormSign;
    private String presentDocumentType;
    private String serialNumber;
    private String serialNumberSign;
    private RequestDescriptionType requestDescription;
    private GTDIDType prevGTDNumber;
    private AddControlDescriptionType addControlDescription;

    /** 
     * Get the 'InvDocCode' element value. ��� ���� ��������������� ���������. ����������� �������� �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. ��� ���� ��������������� ���������. ����������� �������� �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��
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
     * Get the 'DocumentFormSign' element value. ������� ����� ������������� ���������. 0 - � ����������� �����, 1 - � ���� ��������� ���������.
     * 
     * @return value
     */
    public String getDocumentFormSign() {
        return documentFormSign;
    }

    /** 
     * Set the 'DocumentFormSign' element value. ������� ����� ������������� ���������. 0 - � ����������� �����, 1 - � ���� ��������� ���������.
     * 
     * @param documentFormSign
     */
    public void setDocumentFormSign(String documentFormSign) {
        this.documentFormSign = documentFormSign;
    }

    /** 
     * Get the 'PresentDocumentType' element value. ������� ������������� ��������� � ��������������� ����: "0" - � ������������ ����; "1" - � ��������������� ����.
     * 
     * @return value
     */
    public String getPresentDocumentType() {
        return presentDocumentType;
    }

    /** 
     * Set the 'PresentDocumentType' element value. ������� ������������� ��������� � ��������������� ����: "0" - � ������������ ����; "1" - � ��������������� ����.
     * 
     * @param presentDocumentType
     */
    public void setPresentDocumentType(String presentDocumentType) {
        this.presentDocumentType = presentDocumentType;
    }

    /** 
     * Get the 'SerialNumber' element value. ���������� ����� ���� � ������������������ ����, ���������� �� ���� ����
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ����� ���� � ������������������ ����, ���������� �� ���� ����
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'SerialNumberSign' element value. ������� ����, ��� ������ �������� (����) �������� ��������� � ������������������
     * 
     * @return value
     */
    public String getSerialNumberSign() {
        return serialNumberSign;
    }

    /** 
     * Set the 'SerialNumberSign' element value. ������� ����, ��� ������ �������� (����) �������� ��������� � ������������������
     * 
     * @param serialNumberSign
     */
    public void setSerialNumberSign(String serialNumberSign) {
        this.serialNumberSign = serialNumberSign;
    }

    /** 
     * Get the 'RequestDescription' element value. �������� �������, �� �������� ��������������� ��������.
     * 
     * @return value
     */
    public RequestDescriptionType getRequestDescription() {
        return requestDescription;
    }

    /** 
     * Set the 'RequestDescription' element value. �������� �������, �� �������� ��������������� ��������.
     * 
     * @param requestDescription
     */
    public void setRequestDescription(RequestDescriptionType requestDescription) {
        this.requestDescription = requestDescription;
    }

    /** 
     * Get the 'PrevGTDNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getPrevGTDNumber() {
        return prevGTDNumber;
    }

    /** 
     * Set the 'PrevGTDNumber' element value. ���������� ����� ��
     * 
     * @param prevGTDNumber
     */
    public void setPrevGTDNumber(GTDIDType prevGTDNumber) {
        this.prevGTDNumber = prevGTDNumber;
    }

    /** 
     * Get the 'AddControlDescription' element value. �������� ������� � ���������� �������������� ��������, �� �������� ��������������� ��������.
     * 
     * @return value
     */
    public AddControlDescriptionType getAddControlDescription() {
        return addControlDescription;
    }

    /** 
     * Set the 'AddControlDescription' element value. �������� ������� � ���������� �������������� ��������, �� �������� ��������������� ��������.
     * 
     * @param addControlDescription
     */
    public void setAddControlDescription(
            AddControlDescriptionType addControlDescription) {
        this.addControlDescription = addControlDescription;
    }
}
