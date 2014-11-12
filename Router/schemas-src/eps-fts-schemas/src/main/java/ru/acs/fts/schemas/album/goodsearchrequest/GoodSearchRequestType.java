
package ru.acs.fts.schemas.album.goodsearchrequest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ � ������� �������������� �������
 */
public class GoodSearchRequestType extends BaseDocType
{
    private LocalDate goodsRegistrationDate;
    private String consignmentNumber;
    private GTDIDType TD;
    private List<CarriageType> transportList = new ArrayList<CarriageType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private PlaceType departurePlace;
    private PlaceType destinationPlace;
    private String documentModeID;

    /** 
     * Get the 'GoodsRegistrationDate' element value. ���� ���������� �������� ������ � �������
     * 
     * @return value
     */
    public LocalDate getGoodsRegistrationDate() {
        return goodsRegistrationDate;
    }

    /** 
     * Set the 'GoodsRegistrationDate' element value. ���� ���������� �������� ������ � �������
     * 
     * @param goodsRegistrationDate
     */
    public void setGoodsRegistrationDate(LocalDate goodsRegistrationDate) {
        this.goodsRegistrationDate = goodsRegistrationDate;
    }

    /** 
     * Get the 'ConsignmentNumber' element value. ����� �������-������������ ���������
     * 
     * @return value
     */
    public String getConsignmentNumber() {
        return consignmentNumber;
    }

    /** 
     * Set the 'ConsignmentNumber' element value. ����� �������-������������ ���������
     * 
     * @param consignmentNumber
     */
    public void setConsignmentNumber(String consignmentNumber) {
        this.consignmentNumber = consignmentNumber;
    }

    /** 
     * Get the 'TD' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. ����� ���������� ����������
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        this.TD = TD;
    }

    /** 
     * Get the list of 'Transport' element items. �������� � ������������ ��������
     * 
     * @return list
     */
    public List<CarriageType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. �������� � ������������ ��������
     * 
     * @param list
     */
    public void setTransportList(List<CarriageType> list) {
        transportList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� ����� ����������� ���������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� ����� ����������� ���������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. �������� � ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. �������� � ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DeparturePlace' element value. ����� �����������
     * 
     * @return value
     */
    public PlaceType getDeparturePlace() {
        return departurePlace;
    }

    /** 
     * Set the 'DeparturePlace' element value. ����� �����������
     * 
     * @param departurePlace
     */
    public void setDeparturePlace(PlaceType departurePlace) {
        this.departurePlace = departurePlace;
    }

    /** 
     * Get the 'DestinationPlace' element value. ����� ����������
     * 
     * @return value
     */
    public PlaceType getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. ����� ����������
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(PlaceType destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
