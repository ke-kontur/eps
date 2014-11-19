
package ru.acs.fts.schemas.album.cwquitance;

/** 
 * ������
 */
public class ErrorsType
{
    private String commandErrorText;
    private String commandErrorCode;
    private String errorText;

    /** 
     * Get the 'CommandErrorText' element value. ����� �������� ��������� ������
     * 
     * @return value
     */
    public String getCommandErrorText() {
        return commandErrorText;
    }

    /** 
     * Set the 'CommandErrorText' element value. ����� �������� ��������� ������
     * 
     * @param commandErrorText
     */
    public void setCommandErrorText(String commandErrorText) {
        this.commandErrorText = commandErrorText;
    }

    /** 
     * Get the 'CommandErrorCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCommandErrorCode() {
        return commandErrorCode;
    }

    /** 
     * Set the 'CommandErrorCode' element value. ��� ������
     * 
     * @param commandErrorCode
     */
    public void setCommandErrorCode(String commandErrorCode) {
        this.commandErrorCode = commandErrorCode;
    }

    /** 
     * Get the 'ErrorText' element value. ����� ������
     * 
     * @return value
     */
    public String getErrorText() {
        return errorText;
    }

    /** 
     * Set the 'ErrorText' element value. ����� ������
     * 
     * @param errorText
     */
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
