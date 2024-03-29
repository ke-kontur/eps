
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * ����������� ������� ���������� ��������� �� ���-1 ������ 1; ���-2 ����� 6 �� ������ ������ 1
 */
public class DTSMethod1Type
{
    private Method1CalculationBasisType method1CalculationBasis;
    private Method1AdditionalSumType method1AdditionalSum;
    private Method1DeductionType method1Deduction;

    /** 
     * Get the 'Method1CalculationBasis' element value. ������ ������� ���������� ��������� �� ������ 1. ��. � (11, 12)
     * 
     * @return value
     */
    public Method1CalculationBasisType getMethod1CalculationBasis() {
        return method1CalculationBasis;
    }

    /** 
     * Set the 'Method1CalculationBasis' element value. ������ ������� ���������� ��������� �� ������ 1. ��. � (11, 12)
     * 
     * @param method1CalculationBasis
     */
    public void setMethod1CalculationBasis(
            Method1CalculationBasisType method1CalculationBasis) {
        this.method1CalculationBasis = method1CalculationBasis;
    }

    /** 
     * Get the 'Method1AdditionalSum' element value. �������������� ����������. ��. � (13-20)
     * 
     * @return value
     */
    public Method1AdditionalSumType getMethod1AdditionalSum() {
        return method1AdditionalSum;
    }

    /** 
     * Set the 'Method1AdditionalSum' element value. �������������� ����������. ��. � (13-20)
     * 
     * @param method1AdditionalSum
     */
    public void setMethod1AdditionalSum(
            Method1AdditionalSumType method1AdditionalSum) {
        this.method1AdditionalSum = method1AdditionalSum;
    }

    /** 
     * Get the 'Method1Deduction' element value. ������: ������� � ������������ ������, ������� �������� � �. (��. � 21-24)
     * 
     * @return value
     */
    public Method1DeductionType getMethod1Deduction() {
        return method1Deduction;
    }

    /** 
     * Set the 'Method1Deduction' element value. ������: ������� � ������������ ������, ������� �������� � �. (��. � 21-24)
     * 
     * @param method1Deduction
     */
    public void setMethod1Deduction(Method1DeductionType method1Deduction) {
        this.method1Deduction = method1Deduction;
    }
}
