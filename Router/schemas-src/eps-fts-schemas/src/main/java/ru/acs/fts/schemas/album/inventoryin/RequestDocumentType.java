
package ru.acs.fts.schemas.album.inventoryin;

/** 
 * ��������
 */
public class RequestDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String recordNumber;
    private String reqPurpose;
    private String note;
    private String requestorName;

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
     * Get the 'RecordNumber' element value. ���������� ����� ������ � �������
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � �������
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'ReqPurpose' element value. ����, ��� ������� ������������� ��������
     * 
     * @return value
     */
    public String getReqPurpose() {
        return reqPurpose;
    }

    /** 
     * Set the 'ReqPurpose' element value. ����, ��� ������� ������������� ��������
     * 
     * @param reqPurpose
     */
    public void setReqPurpose(String reqPurpose) {
        this.reqPurpose = reqPurpose;
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
     * Get the 'RequestorName' element value. ��� ������������ ����, �������������� �������������� ��������� � ��������
     * 
     * @return value
     */
    public String getRequestorName() {
        return requestorName;
    }

    /** 
     * Set the 'RequestorName' element value. ��� ������������ ����, �������������� �������������� ��������� � ��������
     * 
     * @param requestorName
     */
    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }
}
