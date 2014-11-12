
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� ���������
 */
public class TermsContractType
{
    private DescriptionTermsContractType providedDependPurchase;
    private DescriptionTermsContractType deliveryGoodsBuyer;
    private DescriptionTermsContractType counterDelivery;

    /** 
     * Get the 'ProvidedDependPurchase' element value. �������, ��� ������� ������� ������ ������������ ������ ������� �� ������� ������ ������� ������������
     * 
     * @return value
     */
    public DescriptionTermsContractType getProvidedDependPurchase() {
        return providedDependPurchase;
    }

    /** 
     * Set the 'ProvidedDependPurchase' element value. �������, ��� ������� ������� ������ ������������ ������ ������� �� ������� ������ ������� ������������
     * 
     * @param providedDependPurchase
     */
    public void setProvidedDependPurchase(
            DescriptionTermsContractType providedDependPurchase) {
        this.providedDependPurchase = providedDependPurchase;
    }

    /** 
     * Get the 'DeliveryGoodsBuyer' element value. �������� ������� �� ������� ���������� � ������ �������� ��������� ��� �� ��������� ����
     * 
     * @return value
     */
    public DescriptionTermsContractType getDeliveryGoodsBuyer() {
        return deliveryGoodsBuyer;
    }

    /** 
     * Set the 'DeliveryGoodsBuyer' element value. �������� ������� �� ������� ���������� � ������ �������� ��������� ��� �� ��������� ����
     * 
     * @param deliveryGoodsBuyer
     */
    public void setDeliveryGoodsBuyer(
            DescriptionTermsContractType deliveryGoodsBuyer) {
        this.deliveryGoodsBuyer = deliveryGoodsBuyer;
    }

    /** 
     * Get the 'CounterDelivery' element value. ��������� �������� ������� ����������� ��������.
     * 
     * @return value
     */
    public DescriptionTermsContractType getCounterDelivery() {
        return counterDelivery;
    }

    /** 
     * Set the 'CounterDelivery' element value. ��������� �������� ������� ����������� ��������.
     * 
     * @param counterDelivery
     */
    public void setCounterDelivery(DescriptionTermsContractType counterDelivery) {
        this.counterDelivery = counterDelivery;
    }
}
