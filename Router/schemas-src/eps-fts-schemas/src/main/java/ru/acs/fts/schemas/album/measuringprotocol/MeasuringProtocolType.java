
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Протокол выполнения измерений круглых лесоматериалов
 */
public class MeasuringProtocolType extends BaseDocType
{
    private String docSign;
    private LocalDate measuringDate;
    private String woodSortiment;
    private String woodKind;
    private String logPileQuantity;
    private String nominalLength;
    private String temperature;
    private AddressType measuringPlace;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private CUOrganizationType seller;
    private CUOrganizationType buyer;
    private AddressType departurePlace;
    private AddressType destinationPlace;
    private GTDIDType regNumberDT;
    private DocumentBaseType contract;
    private List<TransportWayBillInfoType> transportWayBillInfoList = new ArrayList<TransportWayBillInfoType>();
    private List<LogMeasuringInfoType> logMeasuringInfoList = new ArrayList<LogMeasuringInfoType>();
    private List<MeasuringEquipmentType> measuringEquipmentList = new ArrayList<MeasuringEquipmentType>();
    private List<MeasuringPersonType> measuringPersonList = new ArrayList<MeasuringPersonType>();
    private List<MeasuringResultsType> measuringResultList = new ArrayList<MeasuringResultsType>();
    private List<MeasuringTransportLogsType> measuringTransportLogList = new ArrayList<MeasuringTransportLogsType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Протокол выполнения измерений методом: 1 - концевых сечений; 2 - срединного сечения; 3 - с использованием таблиц объемов ГОСТ 2708; 4 - геометрическим штабельным
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Протокол выполнения измерений методом: 1 - концевых сечений; 2 - срединного сечения; 3 - с использованием таблиц объемов ГОСТ 2708; 4 - геометрическим штабельным
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'MeasuringDate' element value. Дата проведения измерений
     * 
     * @return value
     */
    public LocalDate getMeasuringDate() {
        return measuringDate;
    }

    /** 
     * Set the 'MeasuringDate' element value. Дата проведения измерений
     * 
     * @param measuringDate
     */
    public void setMeasuringDate(LocalDate measuringDate) {
        this.measuringDate = measuringDate;
    }

    /** 
     * Get the 'WoodSortiment' element value. Сортимент
     * 
     * @return value
     */
    public String getWoodSortiment() {
        return woodSortiment;
    }

    /** 
     * Set the 'WoodSortiment' element value. Сортимент
     * 
     * @param woodSortiment
     */
    public void setWoodSortiment(String woodSortiment) {
        this.woodSortiment = woodSortiment;
    }

    /** 
     * Get the 'WoodKind' element value. Порода
     * 
     * @return value
     */
    public String getWoodKind() {
        return woodKind;
    }

    /** 
     * Set the 'WoodKind' element value. Порода
     * 
     * @param woodKind
     */
    public void setWoodKind(String woodKind) {
        this.woodKind = woodKind;
    }

    /** 
     * Get the 'LogPileQuantity' element value. Количество бревен/штабелей в партии
     * 
     * @return value
     */
    public String getLogPileQuantity() {
        return logPileQuantity;
    }

    /** 
     * Set the 'LogPileQuantity' element value. Количество бревен/штабелей в партии
     * 
     * @param logPileQuantity
     */
    public void setLogPileQuantity(String logPileQuantity) {
        this.logPileQuantity = logPileQuantity;
    }

    /** 
     * Get the 'NominalLength' element value. Номинальная длина партии бревен, указанная в представленных документах, м
     * 
     * @return value
     */
    public String getNominalLength() {
        return nominalLength;
    }

    /** 
     * Set the 'NominalLength' element value. Номинальная длина партии бревен, указанная в представленных документах, м
     * 
     * @param nominalLength
     */
    public void setNominalLength(String nominalLength) {
        this.nominalLength = nominalLength;
    }

    /** 
     * Get the 'Temperature' element value. Температура воздуха при измерениях
     * 
     * @return value
     */
    public String getTemperature() {
        return temperature;
    }

    /** 
     * Set the 'Temperature' element value. Температура воздуха при измерениях
     * 
     * @param temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /** 
     * Get the 'MeasuringPlace' element value. Место проведения измерений
     * 
     * @return value
     */
    public AddressType getMeasuringPlace() {
        return measuringPlace;
    }

    /** 
     * Set the 'MeasuringPlace' element value. Место проведения измерений
     * 
     * @param measuringPlace
     */
    public void setMeasuringPlace(AddressType measuringPlace) {
        this.measuringPlace = measuringPlace;
    }

    /** 
     * Get the 'Consignor' element value. Грузоотправитель
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Грузоотправитель
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Seller' element value. Продавец
     * 
     * @return value
     */
    public CUOrganizationType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. Продавец
     * 
     * @param seller
     */
    public void setSeller(CUOrganizationType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'Buyer' element value. Покупатель
     * 
     * @return value
     */
    public CUOrganizationType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Покупатель
     * 
     * @param buyer
     */
    public void setBuyer(CUOrganizationType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'DeparturePlace' element value. Пункт отправления
     * 
     * @return value
     */
    public AddressType getDeparturePlace() {
        return departurePlace;
    }

    /** 
     * Set the 'DeparturePlace' element value. Пункт отправления
     * 
     * @param departurePlace
     */
    public void setDeparturePlace(AddressType departurePlace) {
        this.departurePlace = departurePlace;
    }

    /** 
     * Get the 'DestinationPlace' element value. Пункт назначения
     * 
     * @return value
     */
    public AddressType getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. Пункт назначения
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(AddressType destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'Contract' element value. Договор (контракт)
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Договор (контракт)
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'TransportWayBillInfo' element items. Сведения о транспортном средстве и ТТН
     * 
     * @return list
     */
    public List<TransportWayBillInfoType> getTransportWayBillInfoList() {
        return transportWayBillInfoList;
    }

    /** 
     * Set the list of 'TransportWayBillInfo' element items. Сведения о транспортном средстве и ТТН
     * 
     * @param list
     */
    public void setTransportWayBillInfoList(List<TransportWayBillInfoType> list) {
        transportWayBillInfoList = list;
    }

    /** 
     * Get the list of 'LogMeasuringInfo' element items. Сведения об измерениях бревна методом концевых сечений, срединного сечения, с использованием таблиц объемов ГОСТ 2708
     * 
     * @return list
     */
    public List<LogMeasuringInfoType> getLogMeasuringInfoList() {
        return logMeasuringInfoList;
    }

    /** 
     * Set the list of 'LogMeasuringInfo' element items. Сведения об измерениях бревна методом концевых сечений, срединного сечения, с использованием таблиц объемов ГОСТ 2708
     * 
     * @param list
     */
    public void setLogMeasuringInfoList(List<LogMeasuringInfoType> list) {
        logMeasuringInfoList = list;
    }

    /** 
     * Get the list of 'MeasuringEquipment' element items. Сведения о средстве измерений
     * 
     * @return list
     */
    public List<MeasuringEquipmentType> getMeasuringEquipmentList() {
        return measuringEquipmentList;
    }

    /** 
     * Set the list of 'MeasuringEquipment' element items. Сведения о средстве измерений
     * 
     * @param list
     */
    public void setMeasuringEquipmentList(List<MeasuringEquipmentType> list) {
        measuringEquipmentList = list;
    }

    /** 
     * Get the list of 'MeasuringPerson' element items. Сведения о лице, присутствующем/ проводившем измерения
     * 
     * @return list
     */
    public List<MeasuringPersonType> getMeasuringPersonList() {
        return measuringPersonList;
    }

    /** 
     * Set the list of 'MeasuringPerson' element items. Сведения о лице, присутствующем/ проводившем измерения
     * 
     * @param list
     */
    public void setMeasuringPersonList(List<MeasuringPersonType> list) {
        measuringPersonList = list;
    }

    /** 
     * Get the list of 'MeasuringResults' element items. Итоговые значения измерений
     * 
     * @return list
     */
    public List<MeasuringResultsType> getMeasuringResultList() {
        return measuringResultList;
    }

    /** 
     * Set the list of 'MeasuringResults' element items. Итоговые значения измерений
     * 
     * @param list
     */
    public void setMeasuringResultList(List<MeasuringResultsType> list) {
        measuringResultList = list;
    }

    /** 
     * Get the list of 'MeasuringTransportLogs' element items. Сведения об измерениях объема штабеля круглых лесоматериалов, погруженных в (на) вагоны (автомобили)
     * 
     * @return list
     */
    public List<MeasuringTransportLogsType> getMeasuringTransportLogList() {
        return measuringTransportLogList;
    }

    /** 
     * Set the list of 'MeasuringTransportLogs' element items. Сведения об измерениях объема штабеля круглых лесоматериалов, погруженных в (на) вагоны (автомобили)
     * 
     * @param list
     */
    public void setMeasuringTransportLogList(
            List<MeasuringTransportLogsType> list) {
        measuringTransportLogList = list;
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
