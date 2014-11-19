
package ru.acs.fts.schemas.album.goodsearchresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ����� �� ������ � ������� �������������� �������
 */
public class GoodSearchResponseType extends BaseDocType
{
    private LocalDate goodsRegistrationDate;
    private String consignmentNumber;
    private LocalDate departureDate;
    private List<CarriageType> transportList = new ArrayList<CarriageType>();
    private PlaceType departurePlace;
    private PlaceType destinationPlace;
    private CUOrganizationType consignee;
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
     * Get the 'DepartureDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'DepartureDate' element value. ���� �����������
     * 
     * @param departureDate
     */
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
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
     * Get the 'Consignee' element value. ���������� �����
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� �����
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
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
