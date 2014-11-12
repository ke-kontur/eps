
package ru.acs.fts.schemas.album.paymenttransactionresult;

/** 
 * Сведения об ошибке
 */
public class ErrorInfoType
{
    private String errorCode;
    private String errorDescription;

    /** 
     * Get the 'ErrorCode' element value. Код ошибки
     * 
     * @return value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /** 
     * Set the 'ErrorCode' element value. Код ошибки
     * 
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /** 
     * Get the 'ErrorDescription' element value. Описание ошибки
     * 
     * @return value
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /** 
     * Set the 'ErrorDescription' element value. Описание ошибки
     * 
     * @param errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
