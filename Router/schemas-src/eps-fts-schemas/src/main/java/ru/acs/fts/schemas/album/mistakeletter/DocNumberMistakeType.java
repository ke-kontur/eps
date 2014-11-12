
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * Ошибка в номере документа
 */
public class DocNumberMistakeType
{
    private String numberMistakeValue;
    private String numberValidValue;

    /** 
     * Get the 'NumberMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @return value
     */
    public String getNumberMistakeValue() {
        return numberMistakeValue;
    }

    /** 
     * Set the 'NumberMistakeValue' element value. Ошибочное значение, указанное в отчете по форме ДО-1
     * 
     * @param numberMistakeValue
     */
    public void setNumberMistakeValue(String numberMistakeValue) {
        this.numberMistakeValue = numberMistakeValue;
    }

    /** 
     * Get the 'NumberValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @return value
     */
    public String getNumberValidValue() {
        return numberValidValue;
    }

    /** 
     * Set the 'NumberValidValue' element value. Правильное значение. Если не указано, то считается, что код должен был отсутствовать вовсе
     * 
     * @param numberValidValue
     */
    public void setNumberValidValue(String numberValidValue) {
        this.numberValidValue = numberValidValue;
    }
}
