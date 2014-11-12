
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.Method1CalculationBasisType;

/** 
 * ����������� ������� ���������� ��������� �� ������ 1. ���3
 */
public class DTS3Method1Type
{
    private Method1CalculationBasisType method1CalculationBasis;
    private DTS3Method1AdditionalSumType DTS3Method1AdditionalSum;

    /** 
     * Get the 'Method1CalculationBasis' element value. ������ ������� ���������� ��������� �� ������ 1
     * 
     * @return value
     */
    public Method1CalculationBasisType getMethod1CalculationBasis() {
        return method1CalculationBasis;
    }

    /** 
     * Set the 'Method1CalculationBasis' element value. ������ ������� ���������� ��������� �� ������ 1
     * 
     * @param method1CalculationBasis
     */
    public void setMethod1CalculationBasis(
            Method1CalculationBasisType method1CalculationBasis) {
        this.method1CalculationBasis = method1CalculationBasis;
    }

    /** 
     * Get the 'DTS3Method1AdditionalSum' element value. �������������� ����������. ��. � (13-17)
     * 
     * @return value
     */
    public DTS3Method1AdditionalSumType getDTS3Method1AdditionalSum() {
        return DTS3Method1AdditionalSum;
    }

    /** 
     * Set the 'DTS3Method1AdditionalSum' element value. �������������� ����������. ��. � (13-17)
     * 
     * @param DTS3Method1AdditionalSum
     */
    public void setDTS3Method1AdditionalSum(
            DTS3Method1AdditionalSumType DTS3Method1AdditionalSum) {
        this.DTS3Method1AdditionalSum = DTS3Method1AdditionalSum;
    }
}
