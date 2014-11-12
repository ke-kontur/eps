
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Вид сотрудничества
 */
public class KindCooperationType
{
    private DescriptionKindCooperationType identicalGoods;
    private DescriptionKindCooperationType idemSort;
    private DescriptionKindCooperationType otherSort;
    private DescriptionKindCooperationType differentCooperation;
    private DescriptionKindCooperationType deliveryGoodsBuyerSeller;
    private DescriptionKindCooperationType renderingService;

    /** 
     * Get the 'IdenticalGoods' element value. Поставки от Продавца Покупателю идентичных товаров
     * 
     * @return value
     */
    public DescriptionKindCooperationType getIdenticalGoods() {
        return identicalGoods;
    }

    /** 
     * Set the 'IdenticalGoods' element value. Поставки от Продавца Покупателю идентичных товаров
     * 
     * @param identicalGoods
     */
    public void setIdenticalGoods(DescriptionKindCooperationType identicalGoods) {
        this.identicalGoods = identicalGoods;
    }

    /** 
     * Get the 'IdemSort' element value. Товаров того же класса или вида.
     * 
     * @return value
     */
    public DescriptionKindCooperationType getIdemSort() {
        return idemSort;
    }

    /** 
     * Set the 'IdemSort' element value. Товаров того же класса или вида.
     * 
     * @param idemSort
     */
    public void setIdemSort(DescriptionKindCooperationType idemSort) {
        this.idemSort = idemSort;
    }

    /** 
     * Get the 'OtherSort' element value. Товаров другого класса или вида.
     * 
     * @return value
     */
    public DescriptionKindCooperationType getOtherSort() {
        return otherSort;
    }

    /** 
     * Set the 'OtherSort' element value. Товаров другого класса или вида.
     * 
     * @param otherSort
     */
    public void setOtherSort(DescriptionKindCooperationType otherSort) {
        this.otherSort = otherSort;
    }

    /** 
     * Get the 'DifferentCooperation' element value. Иное сотрудничество.
     * 
     * @return value
     */
    public DescriptionKindCooperationType getDifferentCooperation() {
        return differentCooperation;
    }

    /** 
     * Set the 'DifferentCooperation' element value. Иное сотрудничество.
     * 
     * @param differentCooperation
     */
    public void setDifferentCooperation(
            DescriptionKindCooperationType differentCooperation) {
        this.differentCooperation = differentCooperation;
    }

    /** 
     * Get the 'DeliveryGoodsBuyerSeller' element value. Поставки товаров от Покупателя Продавцу.
     * 
     * @return value
     */
    public DescriptionKindCooperationType getDeliveryGoodsBuyerSeller() {
        return deliveryGoodsBuyerSeller;
    }

    /** 
     * Set the 'DeliveryGoodsBuyerSeller' element value. Поставки товаров от Покупателя Продавцу.
     * 
     * @param deliveryGoodsBuyerSeller
     */
    public void setDeliveryGoodsBuyerSeller(
            DescriptionKindCooperationType deliveryGoodsBuyerSeller) {
        this.deliveryGoodsBuyerSeller = deliveryGoodsBuyerSeller;
    }

    /** 
     * Get the 'RenderingService' element value. Оказание услуг.
     * 
     * @return value
     */
    public DescriptionKindCooperationType getRenderingService() {
        return renderingService;
    }

    /** 
     * Set the 'RenderingService' element value. Оказание услуг.
     * 
     * @param renderingService
     */
    public void setRenderingService(
            DescriptionKindCooperationType renderingService) {
        this.renderingService = renderingService;
    }
}
