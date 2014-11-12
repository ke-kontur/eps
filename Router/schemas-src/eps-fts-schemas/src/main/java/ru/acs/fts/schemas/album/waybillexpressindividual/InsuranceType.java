
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация о страховке
 */
public class InsuranceType
{
    private String amount;
    private String account;
    private String paymentType;
    private OrganizationBaseType insuanceCompany;

    /** 
     * Get the 'Amount' element value. Сумма страховки
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма страховки
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Account' element value. Номер счёта
     * 
     * @return value
     */
    public String getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. Номер счёта
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /** 
     * Get the 'PaymentType' element value. Вид оплаты. 1 - наличные, 2 - чек, 3 - кредитная карта
     * 
     * @return value
     */
    public String getPaymentType() {
        return paymentType;
    }

    /** 
     * Set the 'PaymentType' element value. Вид оплаты. 1 - наличные, 2 - чек, 3 - кредитная карта
     * 
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /** 
     * Get the 'InsuanceCompany' element value. Страховая компания
     * 
     * @return value
     */
    public OrganizationBaseType getInsuanceCompany() {
        return insuanceCompany;
    }

    /** 
     * Set the 'InsuanceCompany' element value. Страховая компания
     * 
     * @param insuanceCompany
     */
    public void setInsuanceCompany(OrganizationBaseType insuanceCompany) {
        this.insuanceCompany = insuanceCompany;
    }
}
