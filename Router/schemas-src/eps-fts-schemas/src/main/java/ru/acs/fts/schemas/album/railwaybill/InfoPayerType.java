
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * �������� � �����������
 */
public class InfoPayerType
{
    private String payerName;
    private String payerCode;

    /** 
     * Get the 'PayerName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getPayerName() {
        return payerName;
    }

    /** 
     * Set the 'PayerName' element value. ������������ �����������
     * 
     * @param payerName
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    /** 
     * Get the 'PayerCode' element value. ��� �����������
     * 
     * @return value
     */
    public String getPayerCode() {
        return payerCode;
    }

    /** 
     * Set the 'PayerCode' element value. ��� �����������
     * 
     * @param payerCode
     */
    public void setPayerCode(String payerCode) {
        this.payerCode = payerCode;
    }
}
