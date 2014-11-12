
package ru.acs.fts.schemas.album.result;

/** 
 * ��������� ��������� ���������
 */
public class DocumentResultType
{
    private String resultCode;
    private String documentID;

    /** 
     * Get the 'ResultCode' element value. ��� ��������� ���������
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ��� ��������� ���������
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'DocumentID' element value. ������������� ��������� - ���������� ���������.
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. ������������� ��������� - ���������� ���������.
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }
}
