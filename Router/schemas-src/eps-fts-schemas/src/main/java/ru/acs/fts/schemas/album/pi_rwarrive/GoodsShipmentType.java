
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.CountryInformationType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PIGoodsType;

/** 
 * �������� ������
 */
public class GoodsShipmentType
{
    private List<String> wagonNumberList = new ArrayList<String>();
    private String departureStation;
    private String containerIndicator;
    private String SMGSNumber;
    private String destinationStation;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private List<PIGoodsType> goodList = new ArrayList<PIGoodsType>();
    private OrganizationType consignor;
    private OrganizationType consignee;
    private PIoutDestinationType PIoutDestination;
    private CountryInformationType destinationCountry;
    private CountryInformationType dispatchCountry;
    private CUCustomsType borderCustoms;

    /** 
     * Get the list of 'WagonNumbers' element items. ������ �������. ����� �� �����������, ���� ��� �������� ������ ������ ������� ������������ ���������
     * 
     * @return list
     */
    public List<String> getWagonNumberList() {
        return wagonNumberList;
    }

    /** 
     * Set the list of 'WagonNumbers' element items. ������ �������. ����� �� �����������, ���� ��� �������� ������ ������ ������� ������������ ���������
     * 
     * @param list
     */
    public void setWagonNumberList(List<String> list) {
        wagonNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. ������� ����������� 
     * 
     * @return value
     */
    public String getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. ������� ����������� 
     * 
     * @param departureStation
     */
    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'ContainerIndicator' element value. ������� ������������ ��������� ��� �������� ������: ��/���
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. ������� ������������ ��������� ��� �������� ������: ��/���
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'SMGSNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getSMGSNumber() {
        return SMGSNumber;
    }

    /** 
     * Set the 'SMGSNumber' element value. ����� ����
     * 
     * @param SMGSNumber
     */
    public void setSMGSNumber(String SMGSNumber) {
        this.SMGSNumber = SMGSNumber;
    }

    /** 
     * Get the 'DestinationStation' element value. C������ ���������� 
     * 
     * @return value
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. C������ ���������� 
     * 
     * @param destinationStation
     */
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the list of 'Goods' element items. �����
     * 
     * @return list
     */
    public List<PIGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �����
     * 
     * @param list
     */
    public void setGoodList(List<PIGoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Consignor' element value. �������� �� �����������
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� �� �����������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ����������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'PIoutDestination' element value. ����� ���������� �������
     * 
     * @return value
     */
    public PIoutDestinationType getPIoutDestination() {
        return PIoutDestination;
    }

    /** 
     * Set the 'PIoutDestination' element value. ����� ���������� �������
     * 
     * @param PIoutDestination
     */
    public void setPIoutDestination(PIoutDestinationType PIoutDestination) {
        this.PIoutDestination = PIoutDestination;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ �������� �������
     * 
     * @return value
     */
    public CountryInformationType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ �������� �������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInformationType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'DispatchCountry' element value. ������ ����������� �������
     * 
     * @return value
     */
    public CountryInformationType getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. ������ ����������� �������
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(CountryInformationType dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'BorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������.
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������.
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }
}
