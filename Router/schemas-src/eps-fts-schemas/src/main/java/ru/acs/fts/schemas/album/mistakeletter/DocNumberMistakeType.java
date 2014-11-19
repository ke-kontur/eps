
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * ������ � ������ ���������
 */
public class DocNumberMistakeType
{
    private String numberMistakeValue;
    private String numberValidValue;

    /** 
     * Get the 'NumberMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @return value
     */
    public String getNumberMistakeValue() {
        return numberMistakeValue;
    }

    /** 
     * Set the 'NumberMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @param numberMistakeValue
     */
    public void setNumberMistakeValue(String numberMistakeValue) {
        this.numberMistakeValue = numberMistakeValue;
    }

    /** 
     * Get the 'NumberValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @return value
     */
    public String getNumberValidValue() {
        return numberValidValue;
    }

    /** 
     * Set the 'NumberValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @param numberValidValue
     */
    public void setNumberValidValue(String numberValidValue) {
        this.numberValidValue = numberValidValue;
    }
}
