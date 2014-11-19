
package ru.acs.fts.schemas.album.do2reportin;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCargoPlaceType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * ����������� ��� ��� �������� ������ � ����� ������� �� ������ ��2
 */
public class DO2GoodResultType
{
    private String cost;
    private String currencyCode;
    private WHSuppQuantityType bruttoVolQuant;
    private WHSuppQuantityType measureQuantity;
    private WHCargoPlaceType cargoPlace;

    /** 
     * Get the 'Cost' element value. ��������� ��������� ������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ��������� ��������� ������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
