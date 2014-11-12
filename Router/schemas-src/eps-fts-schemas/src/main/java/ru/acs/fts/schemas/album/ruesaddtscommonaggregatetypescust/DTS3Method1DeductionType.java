
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * ������: ������� � ������������ ������, ������� �������� � �. (��. � 18-21)
 */
public class DTS3Method1DeductionType
{
    private String unionTransportCharge;
    private String unionTaxPayment;
    private String exportCountryTaxPayment;
    private String totalDeductionAmount;

    /** 
     * Get the 'UnionTransportCharge' element value. ������� �� ��������� (���������������) �������, �������������� ��� �� ������ � ���������� ����������  ����������� �����, � ������� �� ����������� ��������� (���������������). 18
     * 
     * @return value
     */
    public String getUnionTransportCharge() {
        return unionTransportCharge;
    }

    /** 
     * Set the 'UnionTransportCharge' element value. ������� �� ��������� (���������������) �������, �������������� ��� �� ������ � ���������� ����������  ����������� �����, � ������� �� ����������� ��������� (���������������). 18
     * 
     * @param unionTransportCharge
     */
    public void setUnionTransportCharge(String unionTransportCharge) {
        this.unionTransportCharge = unionTransportCharge;
    }

    /** 
     * Get the 'UnionTaxPayment' element value. �������, ������ � �����, ��������� �� ���������� ���������� ����������� ����� � ����� � ������� �������. 19.
     * 
     * @return value
     */
    public String getUnionTaxPayment() {
        return unionTaxPayment;
    }

    /** 
     * Set the 'UnionTaxPayment' element value. �������, ������ � �����, ��������� �� ���������� ���������� ����������� ����� � ����� � ������� �������. 19.
     * 
     * @param unionTaxPayment
     */
    public void setUnionTaxPayment(String unionTaxPayment) {
        this.unionTaxPayment = unionTaxPayment;
    }

    /** 
     * Get the 'ExportCountryTaxPayment' element value. �������, ������ � �����, ��������� � ��������� ����������� ������� � ������, � ������� �������� ��� ������. 20.
     * 
     * @return value
     */
    public String getExportCountryTaxPayment() {
        return exportCountryTaxPayment;
    }

    /** 
     * Set the 'ExportCountryTaxPayment' element value. �������, ������ � �����, ��������� � ��������� ����������� ������� � ������, � ������� �������� ��� ������. 20.
     * 
     * @param exportCountryTaxPayment
     */
    public void setExportCountryTaxPayment(String exportCountryTaxPayment) {
        this.exportCountryTaxPayment = exportCountryTaxPayment;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. ����� � � ������������ ������. 21
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. ����� � � ������������ ������. 21
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
