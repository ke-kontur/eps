
package ru.acs.fts.schemas.album.revealingtransportpi;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� � �������� ������
 */
public class ConsignmentType
{
    private String lotID;
    private String consignmentSerNumber;
    private String dispatchCountryCode2;
    private String destinationCountryCode2;
    private String totalInvoicedCost;
    private String shipSpecifQuantity;
    private String shipSpecifGoodsQuantity;
    private String totalPackageQuantity;
    private String containerIndicator;
    private String contractCurrencyCode;
    private LocalDate TTNDate;
    private String countGoodsNames;
    private String grossWeight;
    private String netWeight;
    private String PIoutDestination;
    private String reloadCountryCode;
    private String reloadCustomsCode;
    private OrganizationType consignee;
    private OrganizationType consignor;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private AddressType TTNAddress;
    private OrganizationType carrier;
    private OrganizationType declarant;
    private OrganizationType seller;

    /** 
     * Get the 'LotID' element value. ������������� �������� ������, ������������� � �� "���"
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. ������������� �������� ������, ������������� � �� "���"
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
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
     * Get the 'TotalInvoicedCost' element value. ��������� ������� � ������������ � �������������, ������������� �����������
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. ��������� ������� � ������������ � �������������, ������������� �����������
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
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
     * Get the 'TotalPackageQuantity' element value. ����� ���������� �������� ����
     * 
     * @return value
     */
    public String getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /** 
     * Set the 'TotalPackageQuantity' element value. ����� ���������� �������� ����
     * 
     * @param totalPackageQuantity
     */
    public void setTotalPackageQuantity(String totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
    }

    /** 
     * Get the 'ContainerIndicator' element value. ������� ������������ ���������
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. ������� ������������ ���������
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. ��� ������ ���������
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ��� ������ ���������
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'TTNDate' element value. ���� ����������� ������������� ������������������ ���������
     * 
     * @return value
     */
    public LocalDate getTTNDate() {
        return TTNDate;
    }

    /** 
     * Set the 'TTNDate' element value. ���� ����������� ������������� ������������������ ���������
     * 
     * @param TTNDate
     */
    public void setTTNDate(LocalDate TTNDate) {
        this.TTNDate = TTNDate;
    }

    /** 
     * Get the 'CountGoodsNames' element value. ���������� ������������ ������� � ������
     * 
     * @return value
     */
    public String getCountGoodsNames() {
        return countGoodsNames;
    }

    /** 
     * Set the 'CountGoodsNames' element value. ���������� ������������ ������� � ������
     * 
     * @param countGoodsNames
     */
    public void setCountGoodsNames(String countGoodsNames) {
        this.countGoodsNames = countGoodsNames;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������ ������ ����� (����� �� ���� �������), ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������ ������ ����� (����� �� ���� �������), ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'NetWeight' element value. ��� ����� ������ ����� (����� �� ���� �������), ��
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ��� ����� ������ ����� (����� �� ���� �������), ��
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'PIoutDestination' element value. ����� ����������
     * 
     * @return value
     */
    public String getPIoutDestination() {
        return PIoutDestination;
    }

    /** 
     * Set the 'PIoutDestination' element value. ����� ����������
     * 
     * @param PIoutDestination
     */
    public void setPIoutDestination(String PIoutDestination) {
        this.PIoutDestination = PIoutDestination;
    }

    /** 
     * Get the 'ReloadCountryCode' element value. ��� ������ ���������� �������
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. ��� ������ ���������� �������
     * 
     * @param reloadCountryCode
     */
    public void setReloadCountryCode(String reloadCountryCode) {
        this.reloadCountryCode = reloadCountryCode;
    }

    /** 
     * Get the 'ReloadCustomsCode' element value. ��� ����������� ������ ���������� �������
     * 
     * @return value
     */
    public String getReloadCustomsCode() {
        return reloadCustomsCode;
    }

    /** 
     * Set the 'ReloadCustomsCode' element value. ��� ����������� ������ ���������� �������
     * 
     * @param reloadCustomsCode
     */
    public void setReloadCustomsCode(String reloadCustomsCode) {
        this.reloadCustomsCode = reloadCustomsCode;
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
     * Get the 'TTNAddress' element value. ����� ����������� ������������� ������������������ ���������
     * 
     * @return value
     */
    public AddressType getTTNAddress() {
        return TTNAddress;
    }

    /** 
     * Set the 'TTNAddress' element value. ����� ����������� ������������� ������������������ ���������
     * 
     * @param TTNAddress
     */
    public void setTTNAddress(AddressType TTNAddress) {
        this.TTNAddress = TTNAddress;
    }

    /** 
     * Get the 'Carrier' element value. �������� � �����������
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Seller' element value. �������� � ��������
     * 
     * @return value
     */
    public OrganizationType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. �������� � ��������
     * 
     * @param seller
     */
    public void setSeller(OrganizationType seller) {
        this.seller = seller;
    }
}
