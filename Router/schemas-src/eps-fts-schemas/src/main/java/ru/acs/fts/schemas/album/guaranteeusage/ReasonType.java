
package ru.acs.fts.schemas.album.guaranteeusage;

/** 
 * Причина изменения статусного состояния документа обеспечения
 */
public class ReasonType
{
    private String name;
    private String comment;
    private String decisionCode;

    /** 
     * Get the 'Name' element value. Наименование причины
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование причины
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Comment' element value. Комментарий
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Комментарий
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'DecisionCode' element value. Код решения в соответствии с классификатором решений, принимаемых таможенными органами
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. Код решения в соответствии с классификатором решений, принимаемых таможенными органами
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }
}
