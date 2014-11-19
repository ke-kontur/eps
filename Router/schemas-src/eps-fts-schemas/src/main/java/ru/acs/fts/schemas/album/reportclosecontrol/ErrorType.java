
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * Описание ошибки.
 */
public class ErrorType
{
    private String errorCode;
    private String errorLevel;
    private String errorText;
    private String errorDescription;
    private String trueValue;

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
     * Get the 'ErrorLevel' element value. Уровень ошибки (1-критическая ошибка, 2-ошибка, 3-рекомендация)
     * 
     * @return value
     */
    public String getErrorLevel() {
        return errorLevel;
    }

    /** 
     * Set the 'ErrorLevel' element value. Уровень ошибки (1-критическая ошибка, 2-ошибка, 3-рекомендация)
     * 
     * @param errorLevel
     */
    public void setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
    }

    /** 
     * Get the 'ErrorText' element value. Текст сообщения об ошибке
     * 
     * @return value
     */
    public String getErrorText() {
        return errorText;
    }

    /** 
     * Set the 'ErrorText' element value. Текст сообщения об ошибке
     * 
     * @param errorText
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
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

    /** 
     * Get the 'TrueValue' element value. Правильное значение
     * 
     * @return value
     */
    public String getTrueValue() {
        return trueValue;
    }

    /** 
     * Set the 'TrueValue' element value. Правильное значение
     * 
     * @param trueValue
     */
    public void setTrueValue(String trueValue) {
        this.trueValue = trueValue;
    }
}
