
package ru.acs.fts.schemas.album.piint_transitinformation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.GoodsType;

/** 
 * ���������� � ����������� �������
 */
public class GoodsInformationType
{
    private String totalGoodsNameQuantity;
    private String shipSpecifQuantity;
    private String shipSpecifGoodsQuantity;
    private String totalInvoicedCost;
    private String currencyCode;
    private String currencyRate;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'TotalGoodsNameQuantity' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getTotalGoodsNameQuantity() {
        return totalGoodsNameQuantity;
    }

    /** 
     * Set the 'TotalGoodsNameQuantity' element value. ����� ������������ �������
     * 
     * @param totalGoodsNameQuantity
     */
    public void setTotalGoodsNameQuantity(String totalGoodsNameQuantity) {
        this.totalGoodsNameQuantity = totalGoodsNameQuantity;
    }

    /** 
     * Get the 'ShipSpecifQuantity' element value. ���������� ����������� ������������
     * 
     * @return value
     */
    public String getShipSpecifQuantity() {
        return shipSpecifQuantity;
    }

    /** 
     * Set the 'ShipSpecifQuantity' element value. ���������� ����������� ������������
     * 
     * @param shipSpecifQuantity
     */
    public void setShipSpecifQuantity(String shipSpecifQuantity) {
        this.shipSpecifQuantity = shipSpecifQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'TotalInvoicedCost' element value. ����� ��������� ���������
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. ����� ��������� ���������
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
