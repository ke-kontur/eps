
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDFilterOperatorType;

public class AUDBaseFilterParamsType
{
    private AUDFilterOperatorType operator;

    /** 
     * Get the 'Operator' element value. Используемый оператор.
     * 
     * @return value
     */
    public AUDFilterOperatorType getOperator() {
        return operator;
    }

    /** 
     * Set the 'Operator' element value. Используемый оператор.
     * 
     * @param operator
     */
    public void setOperator(AUDFilterOperatorType operator) {
        this.operator = operator;
    }
}
