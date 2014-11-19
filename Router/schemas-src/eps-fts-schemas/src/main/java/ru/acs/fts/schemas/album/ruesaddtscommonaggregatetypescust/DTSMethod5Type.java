
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * ����� �������� ���������� ���������. (5)
 */
public class DTSMethod5Type
{
    private Method5BasisType method5Basis;
    private Method5AdditionalSumType method5AdditionalSum;

    /** 
     * Get the 'Method5Basis' element value. ������ ��� ������� ���������� ��������� �� ������ 5. ��. � (11-15)
     * 
     * @return value
     */
    public Method5BasisType getMethod5Basis() {
        return method5Basis;
    }

    /** 
     * Set the 'Method5Basis' element value. ������ ��� ������� ���������� ��������� �� ������ 5. ��. � (11-15)
     * 
     * @param method5Basis
     */
    public void setMethod5Basis(Method5BasisType method5Basis) {
        this.method5Basis = method5Basis;
    }

    /** 
     * Get the 'Method5AdditionalSum' element value. �������������� ����������  (���� �������) ��. � (16-17)
     * 
     * @return value
     */
    public Method5AdditionalSumType getMethod5AdditionalSum() {
        return method5AdditionalSum;
    }

    /** 
     * Set the 'Method5AdditionalSum' element value. �������������� ����������  (���� �������) ��. � (16-17)
     * 
     * @param method5AdditionalSum
     */
    public void setMethod5AdditionalSum(
            Method5AdditionalSumType method5AdditionalSum) {
        this.method5AdditionalSum = method5AdditionalSum;
    }
}
