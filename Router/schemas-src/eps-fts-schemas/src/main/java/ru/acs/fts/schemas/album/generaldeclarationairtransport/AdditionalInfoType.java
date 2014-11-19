
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * ������ ����������
 */
public class AdditionalInfoType
{
    private String description;
    private String billNumber;
    private String quantityCode;
    private String itemQuantity;
    private AWBNumberType airWayBillNumber;

    /** 
     * Get the 'Description' element value. ��������
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ��������
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'BillNumber' element value. ����� ��������� ���������
     * 
     * @return value
     */
    public String getBillNumber() {
        return billNumber;
    }

    /** 
     * Set the 'BillNumber' element value. ����� ��������� ���������
     * 
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /** 
     * Get the 'QuantityCode' element value. ��� ������� ��������� ����������
     * 
     * @return value
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /** 
     * Set the 'QuantityCode' element value. ��� ������� ��������� ����������
     * 
     * @param quantityCode
     */
    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }

    /** 
     * Get the 'ItemQuantity' element value. ���������� 
     * 
     * @return value
     */
    public String getItemQuantity() {
        return itemQuantity;
    }

    /** 
     * Set the 'ItemQuantity' element value. ���������� 
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /** 
     * Get the 'AirWayBillNumber' element value. ����� �������������
     * 
     * @return value
     */
    public AWBNumberType getAirWayBillNumber() {
        return airWayBillNumber;
    }

    /** 
     * Set the 'AirWayBillNumber' element value. ����� �������������
     * 
     * @param airWayBillNumber
     */
    public void setAirWayBillNumber(AWBNumberType airWayBillNumber) {
        this.airWayBillNumber = airWayBillNumber;
    }
}
