
package ru.acs.fts.schemas.album.explanationsalesterms;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Когда осуществляется переход риска утраты/порчи товара на покупателя
 */
public class RiskLossDamageType
{
    private String warehouse;
    private String disposition;
    private String processDelivery;
    private String commentsProcessDelivery;
    private String placeDelivery;
    private String otherPlace;
    private List<AddressType> addressList = new ArrayList<AddressType>();

    /** 
     * Get the 'Warehouse' element value. Признак перехода риска утраты/порчи товара на покупателя на складе отправителя
     * 
     * @return value
     */
    public String getWarehouse() {
        return warehouse;
    }

    /** 
     * Set the 'Warehouse' element value. Признак перехода риска утраты/порчи товара на покупателя на складе отправителя
     * 
     * @param warehouse
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    /** 
     * Get the 'Disposition' element value. Признак перехода риска утраты/порчи товара на покупателя после передачи лицу, осуществляющему
     * 
     * @return value
     */
    public String getDisposition() {
        return disposition;
    }

    /** 
     * Set the 'Disposition' element value. Признак перехода риска утраты/порчи товара на покупателя после передачи лицу, осуществляющему
     * 
     * @param disposition
     */
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /** 
     * Get the 'ProcessDelivery' element value. Признак перехода риска утраты/порчи товара на покупателя в процессе доставки
     * 
     * @return value
     */
    public String getProcessDelivery() {
        return processDelivery;
    }

    /** 
     * Set the 'ProcessDelivery' element value. Признак перехода риска утраты/порчи товара на покупателя в процессе доставки
     * 
     * @param processDelivery
     */
    public void setProcessDelivery(String processDelivery) {
        this.processDelivery = processDelivery;
    }

    /** 
     * Get the 'CommentsProcessDelivery' element value. В процессе доставки (подробности)
     * 
     * @return value
     */
    public String getCommentsProcessDelivery() {
        return commentsProcessDelivery;
    }

    /** 
     * Set the 'CommentsProcessDelivery' element value. В процессе доставки (подробности)
     * 
     * @param commentsProcessDelivery
     */
    public void setCommentsProcessDelivery(String commentsProcessDelivery) {
        this.commentsProcessDelivery = commentsProcessDelivery;
    }

    /** 
     * Get the 'PlaceDelivery' element value. Признак перехода риска утраты/порчи товара на покупателя в месте доставки
     * 
     * @return value
     */
    public String getPlaceDelivery() {
        return placeDelivery;
    }

    /** 
     * Set the 'PlaceDelivery' element value. Признак перехода риска утраты/порчи товара на покупателя в месте доставки
     * 
     * @param placeDelivery
     */
    public void setPlaceDelivery(String placeDelivery) {
        this.placeDelivery = placeDelivery;
    }

    /** 
     * Get the 'OtherPlace' element value. Признак перехода риска утраты/порчи товара на покупателя в ином месте
     * 
     * @return value
     */
    public String getOtherPlace() {
        return otherPlace;
    }

    /** 
     * Set the 'OtherPlace' element value. Признак перехода риска утраты/порчи товара на покупателя в ином месте
     * 
     * @param otherPlace
     */
    public void setOtherPlace(String otherPlace) {
        this.otherPlace = otherPlace;
    }

    /** 
     * Get the list of 'Address' element items. Адрес 
     * 
     * @return list
     */
    public List<AddressType> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items. Адрес 
     * 
     * @param list
     */
    public void setAddressList(List<AddressType> list) {
        addressList = list;
    }
}
