
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Вид договора
 */
public class KindContractType
{
    private int choiceSelect = -1;
    private static final int PURCHASE_SALE_CHOICE = 0;
    private static final int OTHER_CHOICE = 1;
    private static final int LEASING_AGREEMENT_CHOICE = 2;
    private static final int EXCHANGE_CHOICE = 3;
    private DescriptionKindContractType purchaseSale;
    private OtherKindContractType other;
    private DescriptionKindContractType leasingAgreement;
    private DescriptionKindContractType exchange;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if PurchaseSale is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifPurchaseSale() {
        return choiceSelect == PURCHASE_SALE_CHOICE;
    }

    /** 
     * Get the 'PurchaseSale' element value. Купля-продажа.
     * 
     * @return value
     */
    public DescriptionKindContractType getPurchaseSale() {
        return purchaseSale;
    }

    /** 
     * Set the 'PurchaseSale' element value. Купля-продажа.
     * 
     * @param purchaseSale
     */
    public void setPurchaseSale(DescriptionKindContractType purchaseSale) {
        setChoiceSelect(PURCHASE_SALE_CHOICE);
        this.purchaseSale = purchaseSale;
    }

    /** 
     * Check if Other is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifOther() {
        return choiceSelect == OTHER_CHOICE;
    }

    /** 
     * Get the 'Other' element value. Иное
     * 
     * @return value
     */
    public OtherKindContractType getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Иное
     * 
     * @param other
     */
    public void setOther(OtherKindContractType other) {
        setChoiceSelect(OTHER_CHOICE);
        this.other = other;
    }

    /** 
     * Check if LeasingAgreement is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifLeasingAgreement() {
        return choiceSelect == LEASING_AGREEMENT_CHOICE;
    }

    /** 
     * Get the 'LeasingAgreement' element value. Лизинговое соглашение.
     * 
     * @return value
     */
    public DescriptionKindContractType getLeasingAgreement() {
        return leasingAgreement;
    }

    /** 
     * Set the 'LeasingAgreement' element value. Лизинговое соглашение.
     * 
     * @param leasingAgreement
     */
    public void setLeasingAgreement(DescriptionKindContractType leasingAgreement) {
        setChoiceSelect(LEASING_AGREEMENT_CHOICE);
        this.leasingAgreement = leasingAgreement;
    }

    /** 
     * Check if Exchange is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifExchange() {
        return choiceSelect == EXCHANGE_CHOICE;
    }

    /** 
     * Get the 'Exchange' element value. Бартер
     * 
     * @return value
     */
    public DescriptionKindContractType getExchange() {
        return exchange;
    }

    /** 
     * Set the 'Exchange' element value. Бартер
     * 
     * @param exchange
     */
    public void setExchange(DescriptionKindContractType exchange) {
        setChoiceSelect(EXCHANGE_CHOICE);
        this.exchange = exchange;
    }
}
