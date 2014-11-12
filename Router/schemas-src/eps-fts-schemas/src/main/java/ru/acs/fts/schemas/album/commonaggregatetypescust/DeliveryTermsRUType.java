
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Условие поставки товаров. Для России
 */
public class DeliveryTermsRUType
{
    private String deliveryPlace;
    private String deliveryTermsStringCode;

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
}
