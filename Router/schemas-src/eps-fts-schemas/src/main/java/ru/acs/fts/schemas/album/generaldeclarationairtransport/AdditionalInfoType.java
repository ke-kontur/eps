
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * Прочая информация
 */
public class AdditionalInfoType
{
    private String description;
    private String billNumber;
    private String quantityCode;
    private String itemQuantity;
    private AWBNumberType airWayBillNumber;

    /** 
     * Get the 'Description' element value. Описание
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'BillNumber' element value. Номер расходной накладной
     * 
     * @return value
     */
    public String getBillNumber() {
        return billNumber;
    }

    /** 
     * Set the 'BillNumber' element value. Номер расходной накладной
     * 
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /** 
     * Get the 'QuantityCode' element value. Код единицы измерения количества
     * 
     * @return value
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /** 
     * Set the 'QuantityCode' element value. Код единицы измерения количества
     * 
     * @param quantityCode
     */
    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }

    /** 
     * Get the 'ItemQuantity' element value. Количество 
     * 
     * @return value
     */
    public String getItemQuantity() {
        return itemQuantity;
    }

    /** 
     * Set the 'ItemQuantity' element value. Количество 
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /** 
     * Get the 'AirWayBillNumber' element value. Номер авианакладной
     * 
     * @return value
     */
    public AWBNumberType getAirWayBillNumber() {
        return airWayBillNumber;
    }

    /** 
     * Set the 'AirWayBillNumber' element value. Номер авианакладной
     * 
     * @param airWayBillNumber
     */
    public void setAirWayBillNumber(AWBNumberType airWayBillNumber) {
        this.airWayBillNumber = airWayBillNumber;
    }
}
