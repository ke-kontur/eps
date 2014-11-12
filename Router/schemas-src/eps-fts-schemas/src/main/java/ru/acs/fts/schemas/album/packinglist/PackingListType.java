
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.TransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ����������� ����
 */
public class PackingListType extends BaseDocType
{
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private OrganizationType consignor;
    private OrganizationType consignee;
    private PackingListDeliveryTermsType deliveryTerms;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<TransportMeansType> transportMeanList = new ArrayList<TransportMeansType>();
    private List<PlacesQuantityType> totalPlacesQuantityList = new ArrayList<PlacesQuantityType>();
    private String documentModeID;

    /** 
     * Get the 'GrossWeightQuantity' element value. ����� ��� ������ ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ������ �� �������)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ����� ��� ������ ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ������ �� �������)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ����� ��� ����� ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ����� �� �������)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ����� ��� ����� ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ����� �� �������)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'Consignor' element value. �������� � ����������������
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� � ����������������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ���������� � ���������������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� � ���������������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'DeliveryTerms' element value. �������� ������� �������� ���������
     * 
     * @return value
     */
    public PackingListDeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. �������� ������� �������� ���������
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(PackingListDeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the list of 'Goods' element items. �������� �������� ���� �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� �������� ���� �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'TransportMeans' element items. �������� ������������� �������� ��� ��������� �������
     * 
     * @return list
     */
    public List<TransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. �������� ������������� �������� ��� ��������� �������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'TotalPlacesQuantity' element items. ����� ���������� ���� �� ����� ��������  ����
     * 
     * @return list
     */
    public List<PlacesQuantityType> getTotalPlacesQuantityList() {
        return totalPlacesQuantityList;
    }

    /** 
     * Set the list of 'TotalPlacesQuantity' element items. ����� ���������� ���� �� ����� ��������  ����
     * 
     * @param list
     */
    public void setTotalPlacesQuantityList(List<PlacesQuantityType> list) {
        totalPlacesQuantityList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
