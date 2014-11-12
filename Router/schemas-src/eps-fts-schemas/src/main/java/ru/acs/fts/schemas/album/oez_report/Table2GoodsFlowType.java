
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Таблица 2. Товары, переданные в производство и фактически израсходованные, либо товары, которые выбыли
 */
public class Table2GoodsFlowType
{
    private String quantity;
    private String amount;
    private String account;
    private String subAccount;

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Amount' element value. Стоимость в тысячах рублей
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Стоимость в тысячах рублей
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
     * Get the 'SubAccount' element value. Номер субсчёта
     * 
     * @return value
     */
    public String getSubAccount() {
        return subAccount;
    }

    /** 
     * Set the 'SubAccount' element value. Номер субсчёта
     * 
     * @param subAccount
     */
    public void setSubAccount(String subAccount) {
        this.subAccount = subAccount;
    }
}
