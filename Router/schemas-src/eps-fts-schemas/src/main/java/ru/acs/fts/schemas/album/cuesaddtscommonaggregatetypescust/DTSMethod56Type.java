
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Подробности расчета таможенной стоимости по методу сложения и (или) резервному методу на его основе (5,6)
 */
public class DTSMethod56Type
{
    private Method56BasisType method56Basis;

    /** 
     * Get the 'Method56Basis' element value. Основа расчета для метода 5,6 гр. А (11-17)
     * 
     * @return value
     */
    public Method56BasisType getMethod56Basis() {
        return method56Basis;
    }

    /** 
     * Set the 'Method56Basis' element value. Основа расчета для метода 5,6 гр. А (11-17)
     * 
     * @param method56Basis
     */
    public void setMethod56Basis(Method56BasisType method56Basis) {
        this.method56Basis = method56Basis;
    }
}
