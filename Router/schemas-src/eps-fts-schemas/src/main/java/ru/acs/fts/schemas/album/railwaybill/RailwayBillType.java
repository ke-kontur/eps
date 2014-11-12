
package ru.acs.fts.schemas.album.railwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Международная железнодорожная накладная по форме СМГС 
 */
public class RailwayBillType extends BaseDocType
{
    private String number;
    private String consignorNotice;
    private String consignorOptionNotice;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String departureModeDescription;
    private String loaderModeDescription;
    private String additionalSheetQuantity;
    private String cargoValue;
    private String customsNotice;
    private String weightDefinitionModeDescription;
    private DocumentBaseType registrationDocument;
    private RBOrganizationType consignor;
    private RBOrganizationType consignee;
    private StationType departureStation;
    private RailwayType destinationStation;
    private List<StationType> borderStationList = new ArrayList<StationType>();
    private DocumentBaseType contract;
    private List<RWBGoodsType> RWBGoodList = new ArrayList<RWBGoodsType>();
    private ExchangePalletType exchangePallet;
    private WorkToolType workTool;
    private List<ContainerType> containerList = new ArrayList<ContainerType>();
    private List<RWDocumentType> consignorDocumentList = new ArrayList<RWDocumentType>();
    private List<CarriageType> carriageList = new ArrayList<CarriageType>();
    private List<SealType> sealList = new ArrayList<SealType>();
    private List<PaidRailwayCodeNameType> paidRailwayCodeNameList = new ArrayList<PaidRailwayCodeNameType>();
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'Number' element value. Номер СМГС
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер СМГС
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ConsignorNotice' element value. Особые заявления отправителя
     * 
     * @return value
     */
    public String getConsignorNotice() {
        return consignorNotice;
    }

    /** 
     * Set the 'ConsignorNotice' element value. Особые заявления отправителя
     * 
     * @param consignorNotice
     */
    public void setConsignorNotice(String consignorNotice) {
        this.consignorNotice = consignorNotice;
    }

    /** 
     * Get the 'ConsignorOptionNotice' element value. Отметки отправителя, необязательные для железной дороги
     * 
     * @return value
     */
    public String getConsignorOptionNotice() {
        return consignorOptionNotice;
    }

    /** 
     * Set the 'ConsignorOptionNotice' element value. Отметки отправителя, необязательные для железной дороги
     * 
     * @param consignorOptionNotice
     */
    public void setConsignorOptionNotice(String consignorOptionNotice) {
        this.consignorOptionNotice = consignorOptionNotice;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Общее количество грузовых мест отправки товаров накладной.  В случае транспортировке "Навалом" или "Налив"  не заполняется.
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Общее количество грузовых мест отправки товаров накладной.  В случае транспортировке "Навалом" или "Налив"  не заполняется.
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Общий вес товаров, определенный отправителем, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Общий вес товаров, определенный отправителем, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'DepartureModeDescription' element value. Описание рода отправки 
     * 
     * @return value
     */
    public String getDepartureModeDescription() {
        return departureModeDescription;
    }

    /** 
     * Set the 'DepartureModeDescription' element value. Описание рода отправки 
     * 
     * @param departureModeDescription
     */
    public void setDepartureModeDescription(String departureModeDescription) {
        this.departureModeDescription = departureModeDescription;
    }

    /** 
     * Get the 'LoaderModeDescription' element value. Описание кем погружено
     * 
     * @return value
     */
    public String getLoaderModeDescription() {
        return loaderModeDescription;
    }

    /** 
     * Set the 'LoaderModeDescription' element value. Описание кем погружено
     * 
     * @param loaderModeDescription
     */
    public void setLoaderModeDescription(String loaderModeDescription) {
        this.loaderModeDescription = loaderModeDescription;
    }

    /** 
     * Get the 'AdditionalSheetQuantity' element value. Количество приложенных дополнительных листов к накладной
     * 
     * @return value
     */
    public String getAdditionalSheetQuantity() {
        return additionalSheetQuantity;
    }

    /** 
     * Set the 'AdditionalSheetQuantity' element value. Количество приложенных дополнительных листов к накладной
     * 
     * @param additionalSheetQuantity
     */
    public void setAdditionalSheetQuantity(String additionalSheetQuantity) {
        this.additionalSheetQuantity = additionalSheetQuantity;
    }

    /** 
     * Get the 'CargoValue' element value. Объявленная ценность груза, руб.
     * 
     * @return value
     */
    public String getCargoValue() {
        return cargoValue;
    }

    /** 
     * Set the 'CargoValue' element value. Объявленная ценность груза, руб.
     * 
     * @param cargoValue
     */
    public void setCargoValue(String cargoValue) {
        this.cargoValue = cargoValue;
    }

    /** 
     * Get the 'CustomsNotice' element value. Отметки таможенных органов
     * 
     * @return value
     */
    public String getCustomsNotice() {
        return customsNotice;
    }

    /** 
     * Set the 'CustomsNotice' element value. Отметки таможенных органов
     * 
     * @param customsNotice
     */
    public void setCustomsNotice(String customsNotice) {
        this.customsNotice = customsNotice;
    }

    /** 
     * Get the 'WeightDefinitionModeDescription' element value. Cпособ определения веса
     * 
     * @return value
     */
    public String getWeightDefinitionModeDescription() {
        return weightDefinitionModeDescription;
    }

    /** 
     * Set the 'WeightDefinitionModeDescription' element value. Cпособ определения веса
     * 
     * @param weightDefinitionModeDescription
     */
    public void setWeightDefinitionModeDescription(
            String weightDefinitionModeDescription) {
        this.weightDefinitionModeDescription = weightDefinitionModeDescription;
    }

    /** 
     * Get the 'RegistrationDocument' element value. Информация о регистрации СМГС (графа 25 СМГС)
     * 
     * @return value
     */
    public DocumentBaseType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. Информация о регистрации СМГС (графа 25 СМГС)
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(DocumentBaseType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Consignor' element value. Сведения о грузоотправителе (графа 1 СМГС)
     * 
     * @return value
     */
    public RBOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения о грузоотправителе (графа 1 СМГС)
     * 
     * @param consignor
     */
    public void setConsignor(RBOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о грузополучателе (Графа 5 СМГС)
     * 
     * @return value
     */
    public RBOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о грузополучателе (Графа 5 СМГС)
     * 
     * @param consignee
     */
    public void setConsignee(RBOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'DepartureStation' element value. Ж/д станция и дорога отправления (графа 3 СМГС)
     * 
     * @return value
     */
    public StationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Ж/д станция и дорога отправления (графа 3 СМГС)
     * 
     * @param departureStation
     */
    public void setDepartureStation(StationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. Ж/д станция и дорога назначения (графа 8 СМГС)
     * 
     * @return value
     */
    public RailwayType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Ж/д станция и дорога назначения (графа 8 СМГС)
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the list of 'BorderStation' element items. Пограничные ж/д станция и дорога назначения (графа 7 СМГС)
     * 
     * @return list
     */
    public List<StationType> getBorderStationList() {
        return borderStationList;
    }

    /** 
     * Set the list of 'BorderStation' element items. Пограничные ж/д станция и дорога назначения (графа 7 СМГС)
     * 
     * @param list
     */
    public void setBorderStationList(List<StationType> list) {
        borderStationList = list;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты договора на поставку, заключенного между экспортером и импортером
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты договора на поставку, заключенного между экспортером и импортером
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'RWBGoods' element items. Сведения о товарах накладной
     * 
     * @return list
     */
    public List<RWBGoodsType> getRWBGoodList() {
        return RWBGoodList;
    }

    /** 
     * Set the list of 'RWBGoods' element items. Сведения о товарах накладной
     * 
     * @param list
     */
    public void setRWBGoodList(List<RWBGoodsType> list) {
        RWBGoodList = list;
    }

    /** 
     * Get the 'ExchangePallet' element value. Сведения об обменных поддонах (графа 17 СМГС)
     * 
     * @return value
     */
    public ExchangePalletType getExchangePallet() {
        return exchangePallet;
    }

    /** 
     * Set the 'ExchangePallet' element value. Сведения об обменных поддонах (графа 17 СМГС)
     * 
     * @param exchangePallet
     */
    public void setExchangePallet(ExchangePalletType exchangePallet) {
        this.exchangePallet = exchangePallet;
    }

    /** 
     * Get the 'WorkTool' element value. Описание перевозочных приспособлений
     * 
     * @return value
     */
    public WorkToolType getWorkTool() {
        return workTool;
    }

    /** 
     * Set the 'WorkTool' element value. Описание перевозочных приспособлений
     * 
     * @param workTool
     */
    public void setWorkTool(WorkToolType workTool) {
        this.workTool = workTool;
    }

    /** 
     * Get the list of 'Container' element items. Сведения о контейнере
     * 
     * @return list
     */
    public List<ContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. Сведения о контейнере
     * 
     * @param list
     */
    public void setContainerList(List<ContainerType> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'ConsignorDocument' element items. Документы, приложенные отправителем (графа 23 СМГС)
     * 
     * @return list
     */
    public List<RWDocumentType> getConsignorDocumentList() {
        return consignorDocumentList;
    }

    /** 
     * Set the list of 'ConsignorDocument' element items. Документы, приложенные отправителем (графа 23 СМГС)
     * 
     * @param list
     */
    public void setConsignorDocumentList(List<RWDocumentType> list) {
        consignorDocumentList = list;
    }

    /** 
     * Get the list of 'Carriage' element items. Данные об используемых вагонах 
     * 
     * @return list
     */
    public List<CarriageType> getCarriageList() {
        return carriageList;
    }

    /** 
     * Set the list of 'Carriage' element items. Данные об используемых вагонах 
     * 
     * @param list
     */
    public void setCarriageList(List<CarriageType> list) {
        carriageList = list;
    }

    /** 
     * Get the list of 'Seal' element items. Количество и знаки пломб,  наложенных на вагон или контейнер (графа 45 СМГС)
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. Количество и знаки пломб,  наложенных на вагон или контейнер (графа 45 СМГС)
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the list of 'PaidRailwayCodeName' element items. Наименования и коды транзитных железнодорожных дорог, за перевозку по которым отправитель принимает на себя платежи
     * 
     * @return list
     */
    public List<PaidRailwayCodeNameType> getPaidRailwayCodeNameList() {
        return paidRailwayCodeNameList;
    }

    /** 
     * Set the list of 'PaidRailwayCodeName' element items. Наименования и коды транзитных железнодорожных дорог, за перевозку по которым отправитель принимает на себя платежи
     * 
     * @param list
     */
    public void setPaidRailwayCodeNameList(List<PaidRailwayCodeNameType> list) {
        paidRailwayCodeNameList = list;
    }

    /** 
     * Get the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
