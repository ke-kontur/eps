
package ru.acs.fts.schemas.album.cutir_carnet;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRForwarderType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRIdentifierType;

/** 
 * Электронная копия транзитной декларации, в качестве которой используется книжка МДП с прилагаемыми к ней транспортными (перевозочными) и коммерческими документами
 */
public class CUTIRCarnetType extends BaseDocType
{
    private String transitDirectionCode;
    private String customsProcedure;
    private String goodsQuantity;
    private String specificationNumber;
    private String shipSpecifGoodsQuantity;
    private String dispatchCountryCode;
    private String destinationCountryCode;
    private String totalInvoicedCost;
    private String invoicedCostCurrencyCode;
    private String totalPageQuantity;
    private String destinationCountryName;
    private String dispatchCountryName;
    private String totalPackageNumber;
    private String language;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private TIRIdentifierType TIRIdentifier;
    private TIRCarrierType carrier;
    private TIRForwarderType forwarder;
    private CUDepartureArrivalTransportType CUTransport;
    private List<PrecedingDocumentType> precedingDocumentList = new ArrayList<PrecedingDocumentType>();
    private List<PresentedDocumentsType> CUPresentedDocumentList = new ArrayList<PresentedDocumentsType>();
    private CUOrganizationType TIRDeclarant;
    private List<TIRShipmentType> TIRShipmentList = new ArrayList<TIRShipmentType>();
    private CUCustomsType borderCustoms;
    private String documentModeID;

    /** 
     * Get the 'TransitDirectionCode' element value.  ИМ, ЭК, ТР, ВТ, ТС. Гр. 1 ТД. Третий подраздел
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value.  ИМ, ЭК, ТР, ВТ, ТС. Гр. 1 ТД. Третий подраздел
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    /** 
     * Get the 'CustomsProcedure' element value. МДП. Первый подраздел гр.1 ТД
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. МДП. Первый подраздел гр.1 ТД
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Общее число  товаров по книжке МДП
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Общее число  товаров по книжке МДП
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'SpecificationNumber' element value. Общее количество отгрузочных спецификаций
     * 
     * @return value
     */
    public String getSpecificationNumber() {
        return specificationNumber;
    }

    /** 
     * Set the 'SpecificationNumber' element value. Общее количество отгрузочных спецификаций
     * 
     * @param specificationNumber
     */
    public void setSpecificationNumber(String specificationNumber) {
        this.specificationNumber = specificationNumber;
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
     * Get the 'DispatchCountryCode' element value. Буквенный код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Буквенный код страны отправления
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Буквенный код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Буквенный код страны назначения
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'TotalInvoicedCost' element value. Общая фактурная стоимость
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. Общая фактурная стоимость
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
    }

    /** 
     * Get the 'InvoicedCostCurrencyCode' element value. Буквенный код валюты фактурной стоимости в соответствии с классификатором валют
     * 
     * @return value
     */
    public String getInvoicedCostCurrencyCode() {
        return invoicedCostCurrencyCode;
    }

    /** 
     * Set the 'InvoicedCostCurrencyCode' element value. Буквенный код валюты фактурной стоимости в соответствии с классификатором валют
     * 
     * @param invoicedCostCurrencyCode
     */
    public void setInvoicedCostCurrencyCode(String invoicedCostCurrencyCode) {
        this.invoicedCostCurrencyCode = invoicedCostCurrencyCode;
    }

    /** 
     * Get the 'TotalPageQuantity' element value. Количество листов всех документов
     * 
     * @return value
     */
    public String getTotalPageQuantity() {
        return totalPageQuantity;
    }

    /** 
     * Set the 'TotalPageQuantity' element value. Количество листов всех документов
     * 
     * @param totalPageQuantity
     */
    public void setTotalPageQuantity(String totalPageQuantity) {
        this.totalPageQuantity = totalPageQuantity;
    }

    /** 
     * Get the 'DestinationCountryName' element value. Наименование страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. Наименование страны назначения
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'DispatchCountryName' element value. Наименование страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. Наименование страны отправления
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'Language' element value. Код языка заполнения документа
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'Language' element value. Код языка заполнения документа
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the 'TIRIdentifier' element value. Идентификатор книжки МДП
     * 
     * @return value
     */
    public TIRIdentifierType getTIRIdentifier() {
        return TIRIdentifier;
    }

    /** 
     * Set the 'TIRIdentifier' element value. Идентификатор книжки МДП
     * 
     * @param TIRIdentifier
     */
    public void setTIRIdentifier(TIRIdentifierType TIRIdentifier) {
        this.TIRIdentifier = TIRIdentifier;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик / Держатель книжки МДП
     * 
     * @return value
     */
    public TIRCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик / Держатель книжки МДП
     * 
     * @param carrier
     */
    public void setCarrier(TIRCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Forwarder' element value. Экспедитор
     * 
     * @return value
     */
    public TIRForwarderType getForwarder() {
        return forwarder;
    }

    /** 
     * Set the 'Forwarder' element value. Экспедитор
     * 
     * @param forwarder
     */
    public void setForwarder(TIRForwarderType forwarder) {
        this.forwarder = forwarder;
    }

    /** 
     * Get the 'CUTransport' element value. Транспортные средства 
     * 
     * @return value
     */
    public CUDepartureArrivalTransportType getCUTransport() {
        return CUTransport;
    }

    /** 
     * Set the 'CUTransport' element value. Транспортные средства 
     * 
     * @param CUTransport
     */
    public void setCUTransport(CUDepartureArrivalTransportType CUTransport) {
        this.CUTransport = CUTransport;
    }

    /** 
     * Get the list of 'PrecedingDocument' element items. Предшествующий документ
     * 
     * @return list
     */
    public List<PrecedingDocumentType> getPrecedingDocumentList() {
        return precedingDocumentList;
    }

    /** 
     * Set the list of 'PrecedingDocument' element items. Предшествующий документ
     * 
     * @param list
     */
    public void setPrecedingDocumentList(List<PrecedingDocumentType> list) {
        precedingDocumentList = list;
    }

    /** 
     * Get the list of 'CUPresentedDocuments' element items. Представленные документы
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getCUPresentedDocumentList() {
        return CUPresentedDocumentList;
    }

    /** 
     * Set the list of 'CUPresentedDocuments' element items. Представленные документы
     * 
     * @param list
     */
    public void setCUPresentedDocumentList(List<PresentedDocumentsType> list) {
        CUPresentedDocumentList = list;
    }

    /** 
     * Get the 'TIRDeclarant' element value. Информация о декларанте
     * 
     * @return value
     */
    public CUOrganizationType getTIRDeclarant() {
        return TIRDeclarant;
    }

    /** 
     * Set the 'TIRDeclarant' element value. Информация о декларанте
     * 
     * @param TIRDeclarant
     */
    public void setTIRDeclarant(CUOrganizationType TIRDeclarant) {
        this.TIRDeclarant = TIRDeclarant;
    }

    /** 
     * Get the list of 'TIRShipment' element items. Сведения о товарной партии
     * 
     * @return list
     */
    public List<TIRShipmentType> getTIRShipmentList() {
        return TIRShipmentList;
    }

    /** 
     * Set the list of 'TIRShipment' element items. Сведения о товарной партии
     * 
     * @param list
     */
    public void setTIRShipmentList(List<TIRShipmentType> list) {
        TIRShipmentList = list;
    }

    /** 
     * Get the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
