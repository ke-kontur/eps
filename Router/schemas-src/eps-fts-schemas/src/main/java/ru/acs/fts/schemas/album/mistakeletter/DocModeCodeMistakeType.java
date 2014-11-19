
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * Ошибка в коде вида документа
 */
public class DocModeCodeMistakeType
{
    private String codeMistakeValue;
    private String codeValidValue;

    /** 
     * Get the 'CodeMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @return value
     */
    public String getCodeMistakeValue() {
        return codeMistakeValue;
    }

    /** 
     * Set the 'CodeMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @param codeMistakeValue
     */
    public void setCodeMistakeValue(String codeMistakeValue) {
        this.codeMistakeValue = codeMistakeValue;
    }

    /** 
     * Get the 'CodeValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @return value
     */
    public String getCodeValidValue() {
        return codeValidValue;
    }

    /** 
     * Set the 'CodeValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @param codeValidValue
     */
    public void setCodeValidValue(String codeValidValue) {
        this.codeValidValue = codeValidValue;
    }
}
