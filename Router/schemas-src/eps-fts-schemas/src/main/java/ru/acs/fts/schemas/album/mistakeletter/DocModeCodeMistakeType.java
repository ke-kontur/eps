
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * ������ � ���� ���� ���������
 */
public class DocModeCodeMistakeType
{
    private String codeMistakeValue;
    private String codeValidValue;

    /** 
     * Get the 'CodeMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @return value
     */
    public String getCodeMistakeValue() {
        return codeMistakeValue;
    }

    /** 
     * Set the 'CodeMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @param codeMistakeValue
     */
    public void setCodeMistakeValue(String codeMistakeValue) {
        this.codeMistakeValue = codeMistakeValue;
    }

    /** 
     * Get the 'CodeValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @return value
     */
    public String getCodeValidValue() {
        return codeValidValue;
    }

    /** 
     * Set the 'CodeValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @param codeValidValue
     */
    public void setCodeValidValue(String codeValidValue) {
        this.codeValidValue = codeValidValue;
    }
}
