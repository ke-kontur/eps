
package ru.acs.fts.schemas.album.dtsin;

import org.joda.time.LocalDate;

/** 
 * Принятие промежуточного решения по ТС.
 */
public class IntermediateCustomsCostDecisionType
{
    private String decisionCode;
    private LocalDate term;
    private String LNP;
    private LocalDate dateInf;
    private String decisionDescription;

    /** 
     * Get the 'DecisionCode' element value. Код решения о таможенной стоимости
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. Код решения о таможенной стоимости
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'Term' element value. Срок
     * 
     * @return value
     */
    public LocalDate getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. Срок
     * 
     * @param term
     */
    public void setTerm(LocalDate term) {
        this.term = term;
    }

    /** 
     * Get the 'LNP' element value. ЛНП
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'DateInf' element value. Дата
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'DecisionDescription' element value. Описание принятого решения.
     * 
     * @return value
     */
    public String getDecisionDescription() {
        return decisionDescription;
    }

    /** 
     * Set the 'DecisionDescription' element value. Описание принятого решения.
     * 
     * @param decisionDescription
     */
    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }
}
