
package ru.acs.fts.schemas.album.revealingtransportpi;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о товарной партии
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
     * Get the 'LotID' element value. Идентификатор товарной партии, присваиваемый в АС "УПИ"
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. Идентификатор товарной партии, присваиваемый в АС "УПИ"
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
    }

    /** 
     * Get the 'ConsignmentSerNumber' element value. Порядковый номер партии
     * 
     * @return value
     */
    public String getConsignmentSerNumber() {
        return consignmentSerNumber;
    }

    /** 
     * Set the 'ConsignmentSerNumber' element value. Порядковый номер партии
     * 
     * @param consignmentSerNumber
     */
    public void setConsignmentSerNumber(String consignmentSerNumber) {
        this.consignmentSerNumber = consignmentSerNumber;
    }

    /** 
     * Get the 'DispatchCountryCode2' element value. Символьный код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode2() {
        return dispatchCountryCode2;
    }

    /** 
     * Set the 'DispatchCountryCode2' element value. Символьный код страны отправления
     * 
     * @param dispatchCountryCode2
     */
    public void setDispatchCountryCode2(String dispatchCountryCode2) {
        this.dispatchCountryCode2 = dispatchCountryCode2;
    }

    /** 
     * Get the 'DestinationCountryCode2' element value. Символьный код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode2() {
        return destinationCountryCode2;
    }

    /** 
     * Set the 'DestinationCountryCode2' element value. Символьный код страны назначения
     * 
     * @param destinationCountryCode2
     */
    public void setDestinationCountryCode2(String destinationCountryCode2) {
        this.destinationCountryCode2 = destinationCountryCode2;
    }

    /** 
     * Get the 'TotalInvoicedCost' element value. Стоимость товаров в соответствии с коммерческими, транспортными документами
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. Стоимость товаров в соответствии с коммерческими, транспортными документами
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
    }

    /** 
     * Get the 'ShipSpecifQuantity' element value. Количество отгрузочных спецификаций
     * 
     * @return value
     */
    public String getShipSpecifQuantity() {
        return shipSpecifQuantity;
    }

    /** 
     * Set the 'ShipSpecifQuantity' element value. Количество отгрузочных спецификаций
     * 
     * @param shipSpecifQuantity
     */
    public void setShipSpecifQuantity(String shipSpecifQuantity) {
        this.shipSpecifQuantity = shipSpecifQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'TotalPackageQuantity' element value. Общее количество грузовых мест
     * 
     * @return value
     */
    public String getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /** 
     * Set the 'TotalPackageQuantity' element value. Общее количество грузовых мест
     * 
     * @param totalPackageQuantity
     */
    public void setTotalPackageQuantity(String totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
    }

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерной перевозки
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерной перевозки
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. Код валюты контракта
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. Код валюты контракта
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'TTNDate' element value. Дата составления международной товаротранспортной накладной
     * 
     * @return value
     */
    public LocalDate getTTNDate() {
        return TTNDate;
    }

    /** 
     * Set the 'TTNDate' element value. Дата составления международной товаротранспортной накладной
     * 
     * @param TTNDate
     */
    public void setTTNDate(LocalDate TTNDate) {
        this.TTNDate = TTNDate;
    }

    /** 
     * Get the 'CountGoodsNames' element value. Количество наименований товаров в партии
     * 
     * @return value
     */
    public String getCountGoodsNames() {
        return countGoodsNames;
    }

    /** 
     * Set the 'CountGoodsNames' element value. Количество наименований товаров в партии
     * 
     * @param countGoodsNames
     */
    public void setCountGoodsNames(String countGoodsNames) {
        this.countGoodsNames = countGoodsNames;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес брутто товара общий (сумма по всем товарам), кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес брутто товара общий (сумма по всем товарам), кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'NetWeight' element value. Вес нетто товара общий (сумма по всем товарам), кг
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. Вес нетто товара общий (сумма по всем товарам), кг
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'PIoutDestination' element value. Пункт назначения
     * 
     * @return value
     */
    public String getPIoutDestination() {
        return PIoutDestination;
    }

    /** 
     * Set the 'PIoutDestination' element value. Пункт назначения
     * 
     * @param PIoutDestination
     */
    public void setPIoutDestination(String PIoutDestination) {
        this.PIoutDestination = PIoutDestination;
    }

    /** 
     * Get the 'ReloadCountryCode' element value. Код страны перегрузки товаров
     * 
     * @return value
     */
    public String getReloadCountryCode() {
        return reloadCountryCode;
    }

    /** 
     * Set the 'ReloadCountryCode' element value. Код страны перегрузки товаров
     * 
     * @param reloadCountryCode
     */
    public void setReloadCountryCode(String reloadCountryCode) {
        this.reloadCountryCode = reloadCountryCode;
    }

    /** 
     * Get the 'ReloadCustomsCode' element value. Код таможенного органа перегрузки товаров
     * 
     * @return value
     */
    public String getReloadCustomsCode() {
        return reloadCustomsCode;
    }

    /** 
     * Set the 'ReloadCustomsCode' element value. Код таможенного органа перегрузки товаров
     * 
     * @param reloadCustomsCode
     */
    public void setReloadCustomsCode(String reloadCustomsCode) {
        this.reloadCustomsCode = reloadCustomsCode;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'TTNAddress' element value. Адрес составления международной товаротранспортной накладной
     * 
     * @return value
     */
    public AddressType getTTNAddress() {
        return TTNAddress;
    }

    /** 
     * Set the 'TTNAddress' element value. Адрес составления международной товаротранспортной накладной
     * 
     * @param TTNAddress
     */
    public void setTTNAddress(AddressType TTNAddress) {
        this.TTNAddress = TTNAddress;
    }

    /** 
     * Get the 'Carrier' element value. Сведения о перевозчике
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Сведения о перевозчике
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public OrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Seller' element value. Сведения о продавце
     * 
     * @return value
     */
    public OrganizationType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. Сведения о продавце
     * 
     * @param seller
     */
    public void setSeller(OrganizationType seller) {
        this.seller = seller;
    }
}
