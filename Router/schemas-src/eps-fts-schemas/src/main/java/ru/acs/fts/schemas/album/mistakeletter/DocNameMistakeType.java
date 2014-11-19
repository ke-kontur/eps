
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * Ошибка в наименовании документа
 */
public class DocNameMistakeType
{
    private String nameMistakeValue;
    private String nameValidValue;

    /** 
     * Get the 'NameMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @return value
     */
    public String getNameMistakeValue() {
        return nameMistakeValue;
    }

    /** 
     * Set the 'NameMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @param nameMistakeValue
     */
    public void setNameMistakeValue(String nameMistakeValue) {
        this.nameMistakeValue = nameMistakeValue;
    }

    /** 
     * Get the 'NameValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @return value
     */
    public String getNameValidValue() {
        return nameValidValue;
    }

    /** 
     * Set the 'NameValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @param nameValidValue
     */
    public void setNameValidValue(String nameValidValue) {
        this.nameValidValue = nameValidValue;
    }
}
