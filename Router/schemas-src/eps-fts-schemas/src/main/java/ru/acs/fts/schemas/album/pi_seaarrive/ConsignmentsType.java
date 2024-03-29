
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.GoodsPackagingType;

/** 
 * �������� �������� ������
 */
public class ConsignmentsType
{
    private String transportDocumentNum;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private CountryPortInfoType loadingPort;
    private CountryPortInfoType unloadingPort;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<GoodsPackagingType> goodsPackingInfoList = new ArrayList<GoodsPackagingType>();
    private ProhibitedGoodsType prohibitedGoods;
    private OrganizationInfoType consignor;
    private OrganizationInfoType carrier;
    private OrganizationInfoType consignee;
    private CUCustomsType borderCustoms;
    private CountryPortInfoType primaryDeparturePort;
    private CountryPortInfoType remainGoodsUnloadPort;
    private String PIRegID;

    /** 
     * Get the 'TransportDocumentNum' element value. ����� ������������ (��� ����� ������������� ��������� �� �������� ������)
     * 
     * @return value
     */
    public String getTransportDocumentNum() {
        return transportDocumentNum;
    }

    /** 
     * Set the 'TransportDocumentNum' element value. ����� ������������ (��� ����� ������������� ��������� �� �������� ������)
     * 
     * @param transportDocumentNum
     */
    public void setTransportDocumentNum(String transportDocumentNum) {
        this.transportDocumentNum = transportDocumentNum;
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
     * Get the 'LoadingPort' element value. ���� �������� �������
     * 
     * @return value
     */
    public CountryPortInfoType getLoadingPort() {
        return loadingPort;
    }

    /** 
     * Set the 'LoadingPort' element value. ���� �������� �������
     * 
     * @param loadingPort
     */
    public void setLoadingPort(CountryPortInfoType loadingPort) {
        this.loadingPort = loadingPort;
    }

    /** 
     * Get the 'UnloadingPort' element value. ���� �������� �������
     * 
     * @return value
     */
    public CountryPortInfoType getUnloadingPort() {
        return unloadingPort;
    }

    /** 
     * Set the 'UnloadingPort' element value. ���� �������� �������
     * 
     * @param unloadingPort
     */
    public void setUnloadingPort(CountryPortInfoType unloadingPort) {
        this.unloadingPort = unloadingPort;
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
     * Get the list of 'GoodsPackingInfo' element items. �������� � �������� ������/�������� �������
     * 
     * @return list
     */
    public List<GoodsPackagingType> getGoodsPackingInfoList() {
        return goodsPackingInfoList;
    }

    /** 
     * Set the list of 'GoodsPackingInfo' element items. �������� � �������� ������/�������� �������
     * 
     * @param list
     */
    public void setGoodsPackingInfoList(List<GoodsPackagingType> list) {
        goodsPackingInfoList = list;
    }

    /** 
     * Get the 'ProhibitedGoods' element value. ����������� ��� ������������ � ����� ������ ������
     * 
     * @return value
     */
    public ProhibitedGoodsType getProhibitedGoods() {
        return prohibitedGoods;
    }

    /** 
     * Set the 'ProhibitedGoods' element value. ����������� ��� ������������ � ����� ������ ������
     * 
     * @param prohibitedGoods
     */
    public void setProhibitedGoods(ProhibitedGoodsType prohibitedGoods) {
        this.prohibitedGoods = prohibitedGoods;
    }

    /** 
     * Get the 'Consignor' element value. ���������� �� ����������� ������
     * 
     * @return value
     */
    public OrganizationInfoType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ���������� �� ����������� ������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationInfoType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Carrier' element value. ���������� � �����������
     * 
     * @return value
     */
    public OrganizationInfoType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ���������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationInfoType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignee' element value. ���������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� � ����������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationInfoType consignee) {
        this.consignee = consignee;
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

    /** 
     * Get the 'PrimaryDeparturePort' element value. �������������� ���� ����������� �������
     * 
     * @return value
     */
    public CountryPortInfoType getPrimaryDeparturePort() {
        return primaryDeparturePort;
    }

    /** 
     * Set the 'PrimaryDeparturePort' element value. �������������� ���� ����������� �������
     * 
     * @param primaryDeparturePort
     */
    public void setPrimaryDeparturePort(CountryPortInfoType primaryDeparturePort) {
        this.primaryDeparturePort = primaryDeparturePort;
    }

    /** 
     * Get the 'RemainGoodsUnloadPort' element value. ���� �������� ���������� �� ����� �������
     * 
     * @return value
     */
    public CountryPortInfoType getRemainGoodsUnloadPort() {
        return remainGoodsUnloadPort;
    }

    /** 
     * Set the 'RemainGoodsUnloadPort' element value. ���� �������� ���������� �� ����� �������
     * 
     * @param remainGoodsUnloadPort
     */
    public void setRemainGoodsUnloadPort(
            CountryPortInfoType remainGoodsUnloadPort) {
        this.remainGoodsUnloadPort = remainGoodsUnloadPort;
    }

    /** 
     * Get the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }
}
