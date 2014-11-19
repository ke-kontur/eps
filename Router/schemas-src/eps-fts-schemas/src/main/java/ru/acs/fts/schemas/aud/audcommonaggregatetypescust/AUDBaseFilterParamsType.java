
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDFilterOperatorType;

public class AUDBaseFilterParamsType
{
    private AUDFilterOperatorType operator;

    /** 
     * Get the 'Operator' element value. ������������ ��������.
     * 
     * @return value
     */
    public AUDFilterOperatorType getOperator() {
        return operator;
    }

    /** 
     * Set the 'Operator' element value. ������������ ��������.
     * 
     * @param operator
     */
    public void setOperator(AUDFilterOperatorType operator) {
        this.operator = operator;
    }
}
