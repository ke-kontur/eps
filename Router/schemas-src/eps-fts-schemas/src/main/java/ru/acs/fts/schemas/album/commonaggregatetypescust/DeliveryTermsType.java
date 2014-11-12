
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Условие поставки товаров
 */
public class DeliveryTermsType
{
    private String deliveryPlace;
    private String deliveryTermsStringCode;
    private String deliveryTermsRBCode;
    private String transferPlace;

    /** 
     * Get the 'DeliveryPlace' element value. Описание / Название географического пункта
     * 
     * @return value
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /** 
     * Set the 'DeliveryPlace' element value. Описание / Название географического пункта
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    /** 
     * Get the 'DeliveryTermsStringCode' element value. Код условий поставки в соответствии с классификатором условий поставки
     * 
     * @return value
     */
    public String getDeliveryTermsStringCode() {
        return deliveryTermsStringCode;
    }

    /** 
     * Set the 'DeliveryTermsStringCode' element value. Код условий поставки в соответствии с классификатором условий поставки
     * 
     * @param deliveryTermsStringCode
     */
    public void setDeliveryTermsStringCode(String deliveryTermsStringCode) {
        this.deliveryTermsStringCode = deliveryTermsStringCode;
    }

    /** 
     * Get the 'DeliveryTermsRBCode' element value. Код вида поставки товаров в соответствии с классификатором видов поставок товаров, подлежащих учету при осуществлении экспортных операций, применяемым в Республике Беларусь
     * 
     * @return value
     */
    public String getDeliveryTermsRBCode() {
        return deliveryTermsRBCode;
    }

    /** 
     * Set the 'DeliveryTermsRBCode' element value. Код вида поставки товаров в соответствии с классификатором видов поставок товаров, подлежащих учету при осуществлении экспортных операций, применяемым в Республике Беларусь
     * 
     * @param deliveryTermsRBCode
     */
    public void setDeliveryTermsRBCode(String deliveryTermsRBCode) {
        this.deliveryTermsRBCode = deliveryTermsRBCode;
    }

    /** 
     * Get the 'TransferPlace' element value. Место передачи товара в соответствии с условиями договора (контракта)
     * 
     * @return value
     */
    public String getTransferPlace() {
        return transferPlace;
    }

    /** 
     * Set the 'TransferPlace' element value. Место передачи товара в соответствии с условиями договора (контракта)
     * 
     * @param transferPlace
     */
    public void setTransferPlace(String transferPlace) {
        this.transferPlace = transferPlace;
    }
}
