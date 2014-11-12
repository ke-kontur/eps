
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Условия контракта
 */
public class TermsContractType
{
    private DescriptionTermsContractType providedDependPurchase;
    private DescriptionTermsContractType deliveryGoodsBuyer;
    private DescriptionTermsContractType counterDelivery;

    /** 
     * Get the 'ProvidedDependPurchase' element value. Условие, при котором продажа одного наименования товара зависит от покупки товара другого наименования
     * 
     * @return value
     */
    public DescriptionTermsContractType getProvidedDependPurchase() {
        return providedDependPurchase;
    }

    /** 
     * Set the 'ProvidedDependPurchase' element value. Условие, при котором продажа одного наименования товара зависит от покупки товара другого наименования
     * 
     * @param providedDependPurchase
     */
    public void setProvidedDependPurchase(
            DescriptionTermsContractType providedDependPurchase) {
        this.providedDependPurchase = providedDependPurchase;
    }

    /** 
     * Get the 'DeliveryGoodsBuyer' element value. Поставку товаров со стороны Покупателя в пользу Продавца бесплатно или по сниженной цене
     * 
     * @return value
     */
    public DescriptionTermsContractType getDeliveryGoodsBuyer() {
        return deliveryGoodsBuyer;
    }

    /** 
     * Set the 'DeliveryGoodsBuyer' element value. Поставку товаров со стороны Покупателя в пользу Продавца бесплатно или по сниженной цене
     * 
     * @param deliveryGoodsBuyer
     */
    public void setDeliveryGoodsBuyer(
            DescriptionTermsContractType deliveryGoodsBuyer) {
        this.deliveryGoodsBuyer = deliveryGoodsBuyer;
    }

    /** 
     * Get the 'CounterDelivery' element value. Встречную поставку товаров покупателем продавцу.
     * 
     * @return value
     */
    public DescriptionTermsContractType getCounterDelivery() {
        return counterDelivery;
    }

    /** 
     * Set the 'CounterDelivery' element value. Встречную поставку товаров покупателем продавцу.
     * 
     * @param counterDelivery
     */
    public void setCounterDelivery(DescriptionTermsContractType counterDelivery) {
        this.counterDelivery = counterDelivery;
    }
}
