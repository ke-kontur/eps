
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Описание условий договора.
 */
public class DescriptionTermsContractType
{
    private String vaule;
    private String answerYES;

    /** 
     * Get the 'Vaule' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @return value
     */
    public String getVaule() {
        return vaule;
    }

    /** 
     * Set the 'Vaule' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @param vaule
     */
    public void setVaule(String vaule) {
        this.vaule = vaule;
    }

    /** 
     * Get the 'AnswerYES' element value. В случае ответа ДА  указать подробности
     * 
     * @return value
     */
    public String getAnswerYES() {
        return answerYES;
    }

    /** 
     * Set the 'AnswerYES' element value. В случае ответа ДА  указать подробности
     * 
     * @param answerYES
     */
    public void setAnswerYES(String answerYES) {
        this.answerYES = answerYES;
    }
}
