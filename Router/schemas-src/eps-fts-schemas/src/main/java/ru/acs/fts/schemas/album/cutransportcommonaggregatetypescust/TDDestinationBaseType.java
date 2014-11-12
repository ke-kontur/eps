
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Базовый тип для описания места назначения/доставки
 */
public class TDDestinationBaseType
{
    private String destinationCustomsCode;
    private String deliveryCustomsPostCode;
    private AddressType address;

    /** 
     * Get the 'DestinationCustomsCode' element value. Код таможни назначения
     * 
     * @return value
     */
    public String getDestinationCustomsCode() {
        return destinationCustomsCode;
    }

    /** 
     * Set the 'DestinationCustomsCode' element value. Код таможни назначения
     * 
     * @param destinationCustomsCode
     */
    public void setDestinationCustomsCode(String destinationCustomsCode) {
        this.destinationCustomsCode = destinationCustomsCode;
    }

    /** 
     * Get the 'DeliveryCustomsPostCode' element value. Код поста места доставки
     * 
     * @return value
     */
    public String getDeliveryCustomsPostCode() {
        return deliveryCustomsPostCode;
    }

    /** 
     * Set the 'DeliveryCustomsPostCode' element value. Код поста места доставки
     * 
     * @param deliveryCustomsPostCode
     */
    public void setDeliveryCustomsPostCode(String deliveryCustomsPostCode) {
        this.deliveryCustomsPostCode = deliveryCustomsPostCode;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
