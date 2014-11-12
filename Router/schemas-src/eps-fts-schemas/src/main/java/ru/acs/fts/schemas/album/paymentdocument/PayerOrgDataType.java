
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * �������� � ����������� �� ���������� ���������
 */
public class PayerOrgDataType
{
    private String payerITN;
    private String payerINN;
    private String payerKPP;

    /** 
     * Get the 'PayerITN' element value. ��� ����������� �� ���������� ���������
     * 
     * @return value
     */
    public String getPayerITN() {
        return payerITN;
    }

    /** 
     * Set the 'PayerITN' element value. ��� ����������� �� ���������� ���������
     * 
     * @param payerITN
     */
    public void setPayerITN(String payerITN) {
        this.payerITN = payerITN;
    }

    /** 
     * Get the 'PayerINN' element value. ��� ����������� �� ���������� ���������
     * 
     * @return value
     */
    public String getPayerINN() {
        return payerINN;
    }

    /** 
     * Set the 'PayerINN' element value. ��� ����������� �� ���������� ���������
     * 
     * @param payerINN
     */
    public void setPayerINN(String payerINN) {
        this.payerINN = payerINN;
    }

    /** 
     * Get the 'PayerKPP' element value. ��� ����������� �� ���������� ���������
     * 
     * @return value
     */
    public String getPayerKPP() {
        return payerKPP;
    }

    /** 
     * Set the 'PayerKPP' element value. ��� ����������� �� ���������� ���������
     * 
     * @param payerKPP
     */
    public void setPayerKPP(String payerKPP) {
        this.payerKPP = payerKPP;
    }
}
