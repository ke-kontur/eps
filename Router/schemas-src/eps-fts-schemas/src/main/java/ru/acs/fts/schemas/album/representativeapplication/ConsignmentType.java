
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ������
 */
public class ConsignmentType
{
    private String listNumeric;
    private String prevListNumeric;
    private DocumentBaseType individualWayBill;
    private String currencyRate;
    private String currencyRubleRate;
    private String currency;
    private String grossWeight;
    private String goodsCost;
    private String goodsCostEuro;
    private String goodsCostRuble;
    private String reservationID;
    private CUOrganizationType consignor;
    private ConsigneeType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private CustomsDutiesType customsDuties;
    private String indicatorChange;
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'ListNumeric' element value. ����� ������ ������� �� ������� � ������� �������
     * 
     * @return value
     */
    public String getListNumeric() {
        return listNumeric;
    }

    /** 
     * Set the 'ListNumeric' element value. ����� ������ ������� �� ������� � ������� �������
     * 
     * @param listNumeric
     */
    public void setListNumeric(String listNumeric) {
        this.listNumeric = listNumeric;
    }

    /** 
     * Get the 'PrevListNumeric' element value. ����� ������ ������� � �������������� �������
     * 
     * @return value
     */
    public String getPrevListNumeric() {
        return prevListNumeric;
    }

    /** 
     * Set the 'PrevListNumeric' element value. ����� ������ ������� � �������������� �������
     * 
     * @param prevListNumeric
     */
    public void setPrevListNumeric(String prevListNumeric) {
        this.prevListNumeric = prevListNumeric;
    }

    /** 
     * Get the 'IndividualWayBill' element value. �������������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getIndividualWayBill() {
        return individualWayBill;
    }

    /** 
     * Set the 'IndividualWayBill' element value. �������������� ���������
     * 
     * @param individualWayBill
     */
    public void setIndividualWayBill(DocumentBaseType individualWayBill) {
        this.individualWayBill = individualWayBill;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ����� (������) � ����
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ����� (������) � ����
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyRubleRate' element value. ���� ������ ����� (������) � �����
     * 
     * @return value
     */
    public String getCurrencyRubleRate() {
        return currencyRubleRate;
    }

    /** 
     * Set the 'CurrencyRubleRate' element value. ���� ������ ����� (������) � �����
     * 
     * @param currencyRubleRate
     */
    public void setCurrencyRubleRate(String currencyRubleRate) {
        this.currencyRubleRate = currencyRubleRate;
    }

    /** 
     * Get the 'Currency' element value. ��� ������ ����� (������)
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������ ����� (������)
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� �������, ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� �������, ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCost' element value. ��������� ������� � ������ ����� (������)
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ��������� ������� � ������ ����� (������)
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. ��������� ������� � ����
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. ��������� ������� � ����
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsCostRuble' element value. ��������� ������� � ������
     * 
     * @return value
     */
    public String getGoodsCostRuble() {
        return goodsCostRuble;
    }

    /** 
     * Set the 'GoodsCostRuble' element value. ��������� ������� � ������
     * 
     * @param goodsCostRuble
     */
    public void setGoodsCostRuble(String goodsCostRuble) {
        this.goodsCostRuble = goodsCostRuble;
    }

    /** 
     * Get the 'ReservationID' element value. ������������� �������������� �������� ������� ��� ����� ������ ���������� ��������
     * 
     * @return value
     */
    public String getReservationID() {
        return reservationID;
    }

    /** 
     * Set the 'ReservationID' element value. ������������� �������������� �������� ������� ��� ����� ������ ���������� ��������
     * 
     * @param reservationID
     */
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
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

    /** 
     * Get the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @return value
     */
    public CustomsDutiesType getCustomsDuties() {
        return customsDuties;
    }

    /** 
     * Set the 'CustomsDuties' element value. ���������� �������, ���������� ������
     * 
     * @param customsDuties
     */
    public void setCustomsDuties(CustomsDutiesType customsDuties) {
        this.customsDuties = customsDuties;
    }

    /** 
     * Get the 'IndicatorChange' element value. ������� ����������������� ������
     * 
     * @return value
     */
    public String getIndicatorChange() {
        return indicatorChange;
    }

    /** 
     * Set the 'IndicatorChange' element value. ������� ����������������� ������
     * 
     * @param indicatorChange
     */
    public void setIndicatorChange(String indicatorChange) {
        this.indicatorChange = indicatorChange;
    }

    /** 
     * Get the list of 'WayBill' element items. �������� �� ����� ���������
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. �������� �� ����� ���������
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}
