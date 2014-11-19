
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������
 */
public class ListType
{
    private String billNumber;
    private String catalogNumber;
    private String carriageNumber;
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String actNumber;
    private List<String> containerNumberList = new ArrayList<String>();
    private RailwayStationType departureStation;
    private RailwayStationType destinationStation;
    private QuantityGoodsType billQuantity;

    /** 
     * Get the 'BillNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getBillNumber() {
        return billNumber;
    }

    /** 
     * Set the 'BillNumber' element value. ����� ���������
     * 
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /** 
     * Get the 'CatalogNumber' element value. ����� �������
     * 
     * @return value
     */
    public String getCatalogNumber() {
        return catalogNumber;
    }

    /** 
     * Set the 'CatalogNumber' element value. ����� �������
     * 
     * @param catalogNumber
     */
    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    /** 
     * Get the 'CarriageNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. ���������� ����� ������
     * 
     * @param carriageNumber
     */
    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    /** 
     * Get the list of 'GoodDescription' element items. ������������ �����
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. ������������ �����
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'ActNumber' element value. ����� ���� �� ������������� ������, ������������ ��� ��������
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. ����� ���� �� ������������� ������, ������������ ��� ��������
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. ������� �����������
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. ������� �����������
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. ������� ����������
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. ������� ����������
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'BillQuantity' element value. ���������� ����� �� ���������
     * 
     * @return value
     */
    public QuantityGoodsType getBillQuantity() {
        return billQuantity;
    }

    /** 
     * Set the 'BillQuantity' element value. ���������� ����� �� ���������
     * 
     * @param billQuantity
     */
    public void setBillQuantity(QuantityGoodsType billQuantity) {
        this.billQuantity = billQuantity;
    }
}
