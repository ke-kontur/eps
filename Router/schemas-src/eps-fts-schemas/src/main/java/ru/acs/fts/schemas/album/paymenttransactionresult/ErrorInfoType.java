
package ru.acs.fts.schemas.album.paymenttransactionresult;

/** 
 * �������� �� ������
 */
public class ErrorInfoType
{
    private String errorCode;
    private String errorDescription;

    /** 
     * Get the 'ErrorCode' element value. ��� ������
     * 
     * @return value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /** 
     * Set the 'ErrorCode' element value. ��� ������
     * 
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /** 
     * Get the 'ErrorDescription' element value. �������� ������
     * 
     * @return value
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /** 
     * Set the 'ErrorDescription' element value. �������� ������
     * 
     * @param errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
