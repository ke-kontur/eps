
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������� � ���������
 */
public class InsuranceType
{
    private String amount;
    private String account;
    private String paymentType;
    private OrganizationBaseType insuanceCompany;

    /** 
     * Get the 'Amount' element value. ����� ���������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� ���������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Account' element value. ����� �����
     * 
     * @return value
     */
    public String getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. ����� �����
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /** 
     * Get the 'PaymentType' element value. ��� ������. 1 - ��������, 2 - ���, 3 - ��������� �����
     * 
     * @return value
     */
    public String getPaymentType() {
        return paymentType;
    }

    /** 
     * Set the 'PaymentType' element value. ��� ������. 1 - ��������, 2 - ���, 3 - ��������� �����
     * 
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /** 
     * Get the 'InsuanceCompany' element value. ��������� ��������
     * 
     * @return value
     */
    public OrganizationBaseType getInsuanceCompany() {
        return insuanceCompany;
    }

    /** 
     * Set the 'InsuanceCompany' element value. ��������� ��������
     * 
     * @param insuanceCompany
     */
    public void setInsuanceCompany(OrganizationBaseType insuanceCompany) {
        this.insuanceCompany = insuanceCompany;
    }
}
