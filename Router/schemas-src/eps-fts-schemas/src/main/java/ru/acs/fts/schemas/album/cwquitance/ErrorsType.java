
package ru.acs.fts.schemas.album.cwquitance;

/** 
 * Ошибки
 */
public class ErrorsType
{
    private String commandErrorText;
    private String commandErrorCode;
    private String errorText;

    /** 
     * Get the 'CommandErrorText' element value. Общее описание возникшей ошибки
     * 
     * @return value
     */
    public String getCommandErrorText() {
        return commandErrorText;
    }

    /** 
     * Set the 'CommandErrorText' element value. Общее описание возникшей ошибки
     * 
     * @param commandErrorText
     */
    public void setCommandErrorText(String commandErrorText) {
        this.commandErrorText = commandErrorText;
    }

    /** 
     * Get the 'CommandErrorCode' element value. Код ошибки
     * 
     * @return value
     */
    public String getCommandErrorCode() {
        return commandErrorCode;
    }

    /** 
     * Set the 'CommandErrorCode' element value. Код ошибки
     * 
     * @param commandErrorCode
     */
    public void setCommandErrorCode(String commandErrorCode) {
        this.commandErrorCode = commandErrorCode;
    }

    /** 
     * Get the 'ErrorText' element value. Текст ошибки
     * 
     * @return value
     */
    public String getErrorText() {
        return errorText;
    }

    /** 
     * Set the 'ErrorText' element value. Текст ошибки
     * 
     * @param errorText
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
