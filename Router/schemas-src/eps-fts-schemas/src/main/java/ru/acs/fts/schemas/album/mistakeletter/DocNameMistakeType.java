
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * ������ � ������������ ���������
 */
public class DocNameMistakeType
{
    private String nameMistakeValue;
    private String nameValidValue;

    /** 
     * Get the 'NameMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @return value
     */
    public String getNameMistakeValue() {
        return nameMistakeValue;
    }

    /** 
     * Set the 'NameMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @param nameMistakeValue
     */
    public void setNameMistakeValue(String nameMistakeValue) {
        this.nameMistakeValue = nameMistakeValue;
    }

    /** 
     * Get the 'NameValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @return value
     */
    public String getNameValidValue() {
        return nameValidValue;
    }

    /** 
     * Set the 'NameValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @param nameValidValue
     */
    public void setNameValidValue(String nameValidValue) {
        this.nameValidValue = nameValidValue;
    }
}
