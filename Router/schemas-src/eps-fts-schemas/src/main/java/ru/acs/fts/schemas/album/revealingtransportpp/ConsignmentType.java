
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� � �������� ������
 */
public class ConsignmentType
{
    private String lotID;
    private String TTNNumber;
    private LocalDate TTNDate;
    private String customsNumber;
    private String grossWeight;
    private String measureUnitQuantity;
    private String invoicedAmount;
    private String invoicedCurrencyCode3;
    private String dispatchCountryCode2;
    private String destinationCountryCode2;
    private String totalPlaces;
    private String consignmentSerNumber;
    private String netWeightQuantity;
    private String PIRegID;
    private OrganizationType consignor;
    private OrganizationType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private OrganizationType carrier;

    /** 
     * Get the 'LotID' element value. ������������� �������� ������, ������������� � �� "��"
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. ������������� �������� ������, ������������� � �� "��"
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
    }

    /** 
     * Get the 'TTNNumber' element value. ����� ���
     * 
     * @return value
     */
    public String getTTNNumber() {
        return TTNNumber;
    }

    /** 
     * Set the 'TTNNumber' element value. ����� ���
     * 
     * @param TTNNumber
     */
    public void setTTNNumber(String TTNNumber) {
        this.TTNNumber = TTNNumber;
    }

    /** 
     * Get the 'TTNDate' element value. ���� ���
     * 
     * @return value
     */
    public LocalDate getTTNDate() {
        return TTNDate;
    }

    /** 
     * Set the 'TTNDate' element value. ���� ���
     * 
     * @param TTNDate
     */
    public void setTTNDate(LocalDate TTNDate) {
        this.TTNDate = TTNDate;
    }

    /** 
     * Get the 'CustomsNumber' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /** 
     * Set the 'CustomsNumber' element value. ���������� ����� ���������
     * 
     * @param customsNumber
     */
    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'MeasureUnitQuantity' element value. ���������� � ���
     * 
     * @return value
     */
    public String getMeasureUnitQuantity() {
        return measureUnitQuantity;
    }

    /** 
     * Set the 'MeasureUnitQuantity' element value. ���������� � ���
     * 
     * @param measureUnitQuantity
     */
    public void setMeasureUnitQuantity(String measureUnitQuantity) {
        this.measureUnitQuantity = measureUnitQuantity;
    }

    /** 
     * Get the 'InvoicedAmount' element value. ����� ���������
     * 
     * @return value
     */
    public String getInvoicedAmount() {
        return invoicedAmount;
    }

    /** 
     * Set the 'InvoicedAmount' element value. ����� ���������
     * 
     * @param invoicedAmount
     */
    public void setInvoicedAmount(String invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    /** 
     * Get the 'InvoicedCurrencyCode3' element value. ��������� ��� ������ ����� ���������
     * 
     * @return value
     */
    public String getInvoicedCurrencyCode3() {
        return invoicedCurrencyCode3;
    }

    /** 
     * Set the 'InvoicedCurrencyCode3' element value. ��������� ��� ������ ����� ���������
     * 
     * @param invoicedCurrencyCode3
     */
    public void setInvoicedCurrencyCode3(String invoicedCurrencyCode3) {
        this.invoicedCurrencyCode3 = invoicedCurrencyCode3;
    }

    /** 
     * Get the 'DispatchCountryCode2' element value. ���������� ��� ������ �����������
     * 
     * @return value
     */
    public String getDispatchCountryCode2() {
        return dispatchCountryCode2;
    }

    /** 
     * Set the 'DispatchCountryCode2' element value. ���������� ��� ������ �����������
     * 
     * @param dispatchCountryCode2
     */
    public void setDispatchCountryCode2(String dispatchCountryCode2) {
        this.dispatchCountryCode2 = dispatchCountryCode2;
    }

    /** 
     * Get the 'DestinationCountryCode2' element value. ���������� ��� ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryCode2() {
        return destinationCountryCode2;
    }

    /** 
     * Set the 'DestinationCountryCode2' element value. ���������� ��� ������ ����������
     * 
     * @param destinationCountryCode2
     */
    public void setDestinationCountryCode2(String destinationCountryCode2) {
        this.destinationCountryCode2 = destinationCountryCode2;
    }

    /** 
     * Get the 'TotalPlaces' element value. ����� ���������� �������� ���� �������
     * 
     * @return value
     */
    public String getTotalPlaces() {
        return totalPlaces;
    }

    /** 
     * Set the 'TotalPlaces' element value. ����� ���������� �������� ���� �������
     * 
     * @param totalPlaces
     */
    public void setTotalPlaces(String totalPlaces) {
        this.totalPlaces = totalPlaces;
    }

    /** 
     * Get the 'ConsignmentSerNumber' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getConsignmentSerNumber() {
        return consignmentSerNumber;
    }

    /** 
     * Set the 'ConsignmentSerNumber' element value. ���������� ����� ������
     * 
     * @param consignmentSerNumber
     */
    public void setConsignmentSerNumber(String consignmentSerNumber) {
        this.consignmentSerNumber = consignmentSerNumber;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� �����, ��
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� �����, ��
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
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

    /** 
     * Get the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� �� ����������� �������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ���������� �������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Carrier' element value. �������� � ����������� �������
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� � ����������� �������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }
}
