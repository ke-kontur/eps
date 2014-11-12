
package ru.acs.fts.schemas.album.do2report;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCargoPlaceType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ����������� ��� ��� �������� ������ � ����� ������ �� ������ ��2
 */
public class DO2GoodOutputType
{
    private String cost;
    private String currencyCode;
    private LocalDate outputDate;
    private String outputTime;
    private DO2ConsigneeType consignee;
    private WHSuppQuantityType measureQuantity;
    private WHSuppQuantityType bruttoVolQuant;
    private WHCargoPlaceType cargoPlace;

    /** 
     * Get the 'Cost' element value. ��������� ������ 
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ��������� ������ 
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������  ���������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������  ���������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'OutputDate' element value. ���� ����������� ������ ���/ �� ������
     * 
     * @return value
     */
    public LocalDate getOutputDate() {
        return outputDate;
    }

    /** 
     * Set the 'OutputDate' element value. ���� ����������� ������ ���/ �� ������
     * 
     * @param outputDate
     */
    public void setOutputDate(LocalDate outputDate) {
        this.outputDate = outputDate;
    }

    /** 
     * Get the 'OutputTime' element value. ����� ����������� ������ ���/ �� ������
     * 
     * @return value
     */
    public String getOutputTime() {
        return outputTime;
    }

    /** 
     * Set the 'OutputTime' element value. ����� ����������� ������ ���/ �� ������
     * 
     * @param outputTime
     */
    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public DO2ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(DO2ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'MeasureQuantity' element value. ���-�� � ��������������  �������� ���������
     * 
     * @return value
     */
    public WHSuppQuantityType getMeasureQuantity() {
        return measureQuantity;
    }

    /** 
     * Set the 'MeasureQuantity' element value. ���-�� � ��������������  �������� ���������
     * 
     * @param measureQuantity
     */
    public void setMeasureQuantity(WHSuppQuantityType measureQuantity) {
        this.measureQuantity = measureQuantity;
    }

    /** 
     * Get the 'BruttoVolQuant' element value. ��� ������ / �����
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuant() {
        return bruttoVolQuant;
    }

    /** 
     * Set the 'BruttoVolQuant' element value. ��� ������ / �����
     * 
     * @param bruttoVolQuant
     */
    public void setBruttoVolQuant(WHSuppQuantityType bruttoVolQuant) {
        this.bruttoVolQuant = bruttoVolQuant;
    }

    /** 
     * Get the 'CargoPlace' element value. �������� � ��������  ������
     * 
     * @return value
     */
    public WHCargoPlaceType getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. �������� � ��������  ������
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(WHCargoPlaceType cargoPlace) {
        this.cargoPlace = cargoPlace;
    }
}
