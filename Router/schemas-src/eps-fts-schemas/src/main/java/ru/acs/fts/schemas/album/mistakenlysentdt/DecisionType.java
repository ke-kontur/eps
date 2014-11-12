
package ru.acs.fts.schemas.album.mistakenlysentdt;

/** 
 * Решение
 */
public class DecisionType
{
    private String decisionDescription;
    private String reasons;

    /** 
     * Get the 'DecisionDescription' element value. Принятое решение
     * 
     * @return value
     */
    public String getDecisionDescription() {
        return decisionDescription;
    }

    /** 
     * Set the 'DecisionDescription' element value. Принятое решение
     * 
     * @param decisionDescription
     */
    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    /** 
     * Get the 'Reasons' element value. Обоснование
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. Обоснование
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }
}
