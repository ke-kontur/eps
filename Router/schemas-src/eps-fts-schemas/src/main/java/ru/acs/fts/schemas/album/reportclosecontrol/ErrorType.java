
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * �������� ������.
 */
public class ErrorType
{
    private String errorCode;
    private String errorLevel;
    private String errorText;
    private String errorDescription;
    private String trueValue;

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
     * Get the 'ErrorLevel' element value. ������� ������ (1-����������� ������, 2-������, 3-������������)
     * 
     * @return value
     */
    public String getErrorLevel() {
        return errorLevel;
    }

    /** 
     * Set the 'ErrorLevel' element value. ������� ������ (1-����������� ������, 2-������, 3-������������)
     * 
     * @param errorLevel
     */
    public void setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
    }

    /** 
     * Get the 'ErrorText' element value. ����� ��������� �� ������
     * 
     * @return value
     */
    public String getErrorText() {
        return errorText;
    }

    /** 
     * Set the 'ErrorText' element value. ����� ��������� �� ������
     * 
     * @param errorText
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
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

    /** 
     * Get the 'TrueValue' element value. ���������� ��������
     * 
     * @return value
     */
    public String getTrueValue() {
        return trueValue;
    }

    /** 
     * Set the 'TrueValue' element value. ���������� ��������
     * 
     * @param trueValue
     */
    public void setTrueValue(String trueValue) {
        this.trueValue = trueValue;
    }
}
