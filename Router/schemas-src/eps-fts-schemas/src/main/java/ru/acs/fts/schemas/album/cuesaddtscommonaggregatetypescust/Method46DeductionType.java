
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * ������ ����, ������� ����� � ������ � ��. � (12-16)
 */
public class Method46DeductionType
{
    private String agentCharge;
    private String unionTransportCharge;
    private String unionTaxPayment;
    private String processingAddedCost;
    private String totalDeductionAmount;

    /** 
     * Get the 'AgentCharge' element value. �������������� ���������� (������) ���� �������� � ����, ������ ������������ ��� ��������� ������� � �������� ������������ � �������������� �������� �� 12
     * 
     * @return value
     */
    public String getAgentCharge() {
        return agentCharge;
    }

    /** 
     * Set the 'AgentCharge' element value. �������������� ���������� (������) ���� �������� � ����, ������ ������������ ��� ��������� ������� � �������� ������������ � �������������� �������� �� 12
     * 
     * @param agentCharge
     */
    public void setAgentCharge(String agentCharge) {
        this.agentCharge = agentCharge;
    }

    /** 
     * Get the 'UnionTransportCharge' element value. ������� �� ��������� (���������������), ����������� � ���� ��������� � ������ ���������� �������, �������������� �� ���������� ���������� ����������� �����. �� 13
     * 
     * @return value
     */
    public String getUnionTransportCharge() {
        return unionTransportCharge;
    }

    /** 
     * Set the 'UnionTransportCharge' element value. ������� �� ��������� (���������������), ����������� � ���� ��������� � ������ ���������� �������, �������������� �� ���������� ���������� ����������� �����. �� 13
     * 
     * @param unionTransportCharge
     */
    public void setUnionTransportCharge(String unionTransportCharge) {
        this.unionTransportCharge = unionTransportCharge;
    }

    /** 
     * Get the 'UnionTaxPayment' element value. ���������� �������, ������, �����, ���������� ������ � ����� � ������ ������� �� ���������� ���������� ����������� ����� ��� � �� �������� �� ���������� ����������� - ����� ����������� �����, ������� ������ � ����� ��������� ����������� - ����� ����������� ����� � ������� ������ � �����. �� 14
     * 
     * @return value
     */
    public String getUnionTaxPayment() {
        return unionTaxPayment;
    }

    /** 
     * Set the 'UnionTaxPayment' element value. ���������� �������, ������, �����, ���������� ������ � ����� � ������ ������� �� ���������� ���������� ����������� ����� ��� � �� �������� �� ���������� ����������� - ����� ����������� �����, ������� ������ � ����� ��������� ����������� - ����� ����������� ����� � ������� ������ � �����. �� 14
     * 
     * @param unionTaxPayment
     */
    public void setUnionTaxPayment(String unionTaxPayment) {
        this.unionTaxPayment = unionTaxPayment;
    }

    /** 
     * Get the 'ProcessingAddedCost' element value. ���������, ����������� � ���������� ����������� (���������). �� 15
     * 
     * @return value
     */
    public String getProcessingAddedCost() {
        return processingAddedCost;
    }

    /** 
     * Set the 'ProcessingAddedCost' element value. ���������, ����������� � ���������� ����������� (���������). �� 15
     * 
     * @param processingAddedCost
     */
    public void setProcessingAddedCost(String processingAddedCost) {
        this.processingAddedCost = processingAddedCost;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. ����� � � ������������ ������ (�� ������ � 12 �� 15)  �� 16
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. ����� � � ������������ ������ (�� ������ � 12 �� 15)  �� 16
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
