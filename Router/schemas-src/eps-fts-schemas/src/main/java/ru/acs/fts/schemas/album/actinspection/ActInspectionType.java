
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ATDCustomPersonType;

/** 
 * Акт таможенного досмотра (осмотра)
 */
public class ActInspectionType extends BaseDocType
{
    private LocalDate sendDate;
    private String actNumber;
    private String actType;
    private String beginInspectionTime;
    private LocalDate beginInspectionDate;
    private String endInspectionTime;
    private LocalDate endInspectionDate;
    private LocalDate secExempDate;
    private String secExempTime;
    private String numberOfPlaces;
    private String bruttoWeightDocs;
    private String newCustomsModeCode;
    private List<String> customsMarkList = new ArrayList<String>();
    private String actKind;
    private String shortFormSign;
    private LocalDate endComposeDate;
    private String endComposeTime;
    private List<InspectionParticipantType> inspectionParticipantList = new ArrayList<InspectionParticipantType>();
    private ConsigneeType consignee;
    private TransporterType transporter;
    private List<AccDocsType> accDocList = new ArrayList<AccDocsType>();
    private InspectionResultsType inspectionResults;
    private TextActType textAct;
    private SeizeType seize;
    private List<AMTInspResultsType> AMTInspResultList = new ArrayList<AMTInspResultsType>();
    private List<BusInspResultsType> busInspResultList = new ArrayList<BusInspResultsType>();
    private List<TrailerInspResultsType> trailerInspResultList = new ArrayList<TrailerInspResultsType>();
    private List<TruckInspResultsType> truckInspResultList = new ArrayList<TruckInspResultsType>();
    private List<MotoInspResultsType> motoInspResultList = new ArrayList<MotoInspResultsType>();
    private CustomsType customs;
    private ConsignorType consignor;
    private InspectionPlaceType inspectionPlace;
    private InspInstructionType instructionNumber;
    private List<ATDCustomPersonType> ATDCustomsPersonList = new ArrayList<ATDCustomPersonType>();
    private List<CarInformationType> autoInspResultList = new ArrayList<CarInformationType>();
    private InspTransportType inspTransport;
    private List<UseTMCCType> useTMCCList = new ArrayList<UseTMCCType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'ActNumber' element value. Номер акта таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Номер акта таможенного досмотра (осмотра)
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActType' element value. Типа акта: "0" - таможенный досмотр, "1" - таможенный осмотр
     * 
     * @return value
     */
    public String getActType() {
        return actType;
    }

    /** 
     * Set the 'ActType' element value. Типа акта: "0" - таможенный досмотр, "1" - таможенный осмотр
     * 
     * @param actType
     */
    public void setActType(String actType) {
        this.actType = actType;
    }

    /** 
     * Get the 'BeginInspectionTime' element value. Время начала таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public String getBeginInspectionTime() {
        return beginInspectionTime;
    }

    /** 
     * Set the 'BeginInspectionTime' element value. Время начала таможенного досмотра (осмотра)
     * 
     * @param beginInspectionTime
     */
    public void setBeginInspectionTime(String beginInspectionTime) {
        this.beginInspectionTime = beginInspectionTime;
    }

    /** 
     * Get the 'BeginInspectionDate' element value. Дата начала таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public LocalDate getBeginInspectionDate() {
        return beginInspectionDate;
    }

    /** 
     * Set the 'BeginInspectionDate' element value. Дата начала таможенного досмотра (осмотра)
     * 
     * @param beginInspectionDate
     */
    public void setBeginInspectionDate(LocalDate beginInspectionDate) {
        this.beginInspectionDate = beginInspectionDate;
    }

    /** 
     * Get the 'EndInspectionTime' element value. Время окончания таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public String getEndInspectionTime() {
        return endInspectionTime;
    }

    /** 
     * Set the 'EndInspectionTime' element value. Время окончания таможенного досмотра (осмотра)
     * 
     * @param endInspectionTime
     */
    public void setEndInspectionTime(String endInspectionTime) {
        this.endInspectionTime = endInspectionTime;
    }

    /** 
     * Get the 'EndInspectionDate' element value. Дата окончания таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public LocalDate getEndInspectionDate() {
        return endInspectionDate;
    }

    /** 
     * Set the 'EndInspectionDate' element value. Дата окончания таможенного досмотра (осмотра)
     * 
     * @param endInspectionDate
     */
    public void setEndInspectionDate(LocalDate endInspectionDate) {
        this.endInspectionDate = endInspectionDate;
    }

    /** 
     * Get the 'SecExempDate' element value. Дата получения второго экземпляра
     * 
     * @return value
     */
    public LocalDate getSecExempDate() {
        return secExempDate;
    }

    /** 
     * Set the 'SecExempDate' element value. Дата получения второго экземпляра
     * 
     * @param secExempDate
     */
    public void setSecExempDate(LocalDate secExempDate) {
        this.secExempDate = secExempDate;
    }

    /** 
     * Get the 'SecExempTime' element value. Время получения второго экземпляра
     * 
     * @return value
     */
    public String getSecExempTime() {
        return secExempTime;
    }

    /** 
     * Set the 'SecExempTime' element value. Время получения второго экземпляра
     * 
     * @param secExempTime
     */
    public void setSecExempTime(String secExempTime) {
        this.secExempTime = secExempTime;
    }

    /** 
     * Get the 'NumberOfPlaces' element value. Число мест в партии товаров
     * 
     * @return value
     */
    public String getNumberOfPlaces() {
        return numberOfPlaces;
    }

    /** 
     * Set the 'NumberOfPlaces' element value. Число мест в партии товаров
     * 
     * @param numberOfPlaces
     */
    public void setNumberOfPlaces(String numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    /** 
     * Get the 'BruttoWeightDocs' element value. Вес брутто товаров по документам
     * 
     * @return value
     */
    public String getBruttoWeightDocs() {
        return bruttoWeightDocs;
    }

    /** 
     * Set the 'BruttoWeightDocs' element value. Вес брутто товаров по документам
     * 
     * @param bruttoWeightDocs
     */
    public void setBruttoWeightDocs(String bruttoWeightDocs) {
        this.bruttoWeightDocs = bruttoWeightDocs;
    }

    /** 
     * Get the 'NewCustomsModeCode' element value. Код нового таможенного режима - для случая проведения досмотра при изменении режима на иной без перемещения товаров через таможенную границу РФ
     * 
     * @return value
     */
    public String getNewCustomsModeCode() {
        return newCustomsModeCode;
    }

    /** 
     * Set the 'NewCustomsModeCode' element value. Код нового таможенного режима - для случая проведения досмотра при изменении режима на иной без перемещения товаров через таможенную границу РФ
     * 
     * @param newCustomsModeCode
     */
    public void setNewCustomsModeCode(String newCustomsModeCode) {
        this.newCustomsModeCode = newCustomsModeCode;
    }

    /** 
     * Get the list of 'CustomsMark' element items. Служебные отметки 
     * 
     * @return list
     */
    public List<String> getCustomsMarkList() {
        return customsMarkList;
    }

    /** 
     * Set the list of 'CustomsMark' element items. Служебные отметки 
     * 
     * @param list
     */
    public void setCustomsMarkList(List<String> list) {
        customsMarkList = list;
    }

    /** 
     * Get the 'ActKind' element value. Признак досмотра: 1 - досмотре всех товаров, заявленных в ДТ, 2 - досмотр части товаров, заявленных в ДТ, 3 - досмотр товаров, заявленных в нескольких ДТ
     * 
     * @return value
     */
    public String getActKind() {
        return actKind;
    }

    /** 
     * Set the 'ActKind' element value. Признак досмотра: 1 - досмотре всех товаров, заявленных в ДТ, 2 - досмотр части товаров, заявленных в ДТ, 3 - досмотр товаров, заявленных в нескольких ДТ
     * 
     * @param actKind
     */
    public void setActKind(String actKind) {
        this.actKind = actKind;
    }

    /** 
     * Get the 'ShortFormSign' element value. Признак составления АТДО в сокращенной форме
     * 
     * @return value
     */
    public String getShortFormSign() {
        return shortFormSign;
    }

    /** 
     * Set the 'ShortFormSign' element value. Признак составления АТДО в сокращенной форме
     * 
     * @param shortFormSign
     */
    public void setShortFormSign(String shortFormSign) {
        this.shortFormSign = shortFormSign;
    }

    /** 
     * Get the 'EndComposeDate' element value. Дата завершения составления АТДО
     * 
     * @return value
     */
    public LocalDate getEndComposeDate() {
        return endComposeDate;
    }

    /** 
     * Set the 'EndComposeDate' element value. Дата завершения составления АТДО
     * 
     * @param endComposeDate
     */
    public void setEndComposeDate(LocalDate endComposeDate) {
        this.endComposeDate = endComposeDate;
    }

    /** 
     * Get the 'EndComposeTime' element value. Время завершения составления АТДО
     * 
     * @return value
     */
    public String getEndComposeTime() {
        return endComposeTime;
    }

    /** 
     * Set the 'EndComposeTime' element value. Время завершения составления АТДО
     * 
     * @param endComposeTime
     */
    public void setEndComposeTime(String endComposeTime) {
        this.endComposeTime = endComposeTime;
    }

    /** 
     * Get the list of 'InspectionParticipant' element items. Лицо, присутствующее при досмотре (осмотре)
     * 
     * @return list
     */
    public List<InspectionParticipantType> getInspectionParticipantList() {
        return inspectionParticipantList;
    }

    /** 
     * Set the list of 'InspectionParticipant' element items. Лицо, присутствующее при досмотре (осмотре)
     * 
     * @param list
     */
    public void setInspectionParticipantList(
            List<InspectionParticipantType> list) {
        inspectionParticipantList = list;
    }

    /** 
     * Get the 'Consignee' element value. Получатель товаров
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель товаров
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Transporter' element value. Перевозчик
     * 
     * @return value
     */
    public TransporterType getTransporter() {
        return transporter;
    }

    /** 
     * Set the 'Transporter' element value. Перевозчик
     * 
     * @param transporter
     */
    public void setTransporter(TransporterType transporter) {
        this.transporter = transporter;
    }

    /** 
     * Get the list of 'AccDocs' element items. Документы, по которым перевозятся товары (ДТ, книжка МДП, транспортные (перевозочные) документы, коммерческие документы, таможенные документы)
     * 
     * @return list
     */
    public List<AccDocsType> getAccDocList() {
        return accDocList;
    }

    /** 
     * Set the list of 'AccDocs' element items. Документы, по которым перевозятся товары (ДТ, книжка МДП, транспортные (перевозочные) документы, коммерческие документы, таможенные документы)
     * 
     * @param list
     */
    public void setAccDocList(List<AccDocsType> list) {
        accDocList = list;
    }

    /** 
     * Get the 'InspectionResults' element value. Результаты таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public InspectionResultsType getInspectionResults() {
        return inspectionResults;
    }

    /** 
     * Set the 'InspectionResults' element value. Результаты таможенного досмотра (осмотра)
     * 
     * @param inspectionResults
     */
    public void setInspectionResults(InspectionResultsType inspectionResults) {
        this.inspectionResults = inspectionResults;
    }

    /** 
     * Get the 'TextAct' element value. Текст Акта
     * 
     * @return value
     */
    public TextActType getTextAct() {
        return textAct;
    }

    /** 
     * Set the 'TextAct' element value. Текст Акта
     * 
     * @param textAct
     */
    public void setTextAct(TextActType textAct) {
        this.textAct = textAct;
    }

    /** 
     * Get the 'Seize' element value. Изъятие
     * 
     * @return value
     */
    public SeizeType getSeize() {
        return seize;
    }

    /** 
     * Set the 'Seize' element value. Изъятие
     * 
     * @param seize
     */
    public void setSeize(SeizeType seize) {
        this.seize = seize;
    }

    /** 
     * Get the list of 'AMTInspResults' element items. Результаты досмотра седельного тягача (товарная позиция 8701 по ТН ВЭД ТС)
     * 
     * @return list
     */
    public List<AMTInspResultsType> getAMTInspResultList() {
        return AMTInspResultList;
    }

    /** 
     * Set the list of 'AMTInspResults' element items. Результаты досмотра седельного тягача (товарная позиция 8701 по ТН ВЭД ТС)
     * 
     * @param list
     */
    public void setAMTInspResultList(List<AMTInspResultsType> list) {
        AMTInspResultList = list;
    }

    /** 
     * Get the list of 'BusInspResults' element items. Результаты досмотра автобуса
     * 
     * @return list
     */
    public List<BusInspResultsType> getBusInspResultList() {
        return busInspResultList;
    }

    /** 
     * Set the list of 'BusInspResults' element items. Результаты досмотра автобуса
     * 
     * @param list
     */
    public void setBusInspResultList(List<BusInspResultsType> list) {
        busInspResultList = list;
    }

    /** 
     * Get the list of 'TrailerInspResults' element items. Результаты досмотра прицепа, полуприцепа
     * 
     * @return list
     */
    public List<TrailerInspResultsType> getTrailerInspResultList() {
        return trailerInspResultList;
    }

    /** 
     * Set the list of 'TrailerInspResults' element items. Результаты досмотра прицепа, полуприцепа
     * 
     * @param list
     */
    public void setTrailerInspResultList(List<TrailerInspResultsType> list) {
        trailerInspResultList = list;
    }

    /** 
     * Get the list of 'TruckInspResults' element items. Результаты досмотра грузового автомобиля
     * 
     * @return list
     */
    public List<TruckInspResultsType> getTruckInspResultList() {
        return truckInspResultList;
    }

    /** 
     * Set the list of 'TruckInspResults' element items. Результаты досмотра грузового автомобиля
     * 
     * @param list
     */
    public void setTruckInspResultList(List<TruckInspResultsType> list) {
        truckInspResultList = list;
    }

    /** 
     * Get the list of 'MotoInspResults' element items. Результаты досмотра мотоцикла (мопеда)
     * 
     * @return list
     */
    public List<MotoInspResultsType> getMotoInspResultList() {
        return motoInspResultList;
    }

    /** 
     * Set the list of 'MotoInspResults' element items. Результаты досмотра мотоцикла (мопеда)
     * 
     * @param list
     */
    public void setMotoInspResultList(List<MotoInspResultsType> list) {
        motoInspResultList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель товаров
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель товаров
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'InspectionPlace' element value. Место проведения таможенного досмотра (осмотра)
     * 
     * @return value
     */
    public InspectionPlaceType getInspectionPlace() {
        return inspectionPlace;
    }

    /** 
     * Set the 'InspectionPlace' element value. Место проведения таможенного досмотра (осмотра)
     * 
     * @param inspectionPlace
     */
    public void setInspectionPlace(InspectionPlaceType inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }

    /** 
     * Get the 'InstructionNumber' element value. Сведения о поручении на досмотр
     * 
     * @return value
     */
    public InspInstructionType getInstructionNumber() {
        return instructionNumber;
    }

    /** 
     * Set the 'InstructionNumber' element value. Сведения о поручении на досмотр
     * 
     * @param instructionNumber
     */
    public void setInstructionNumber(InspInstructionType instructionNumber) {
        this.instructionNumber = instructionNumber;
    }

    /** 
     * Get the list of 'ATDCustomsPerson' element items. Должностное лицо  ТО, присутствовавшее при досмотре
     * 
     * @return list
     */
    public List<ATDCustomPersonType> getATDCustomsPersonList() {
        return ATDCustomsPersonList;
    }

    /** 
     * Set the list of 'ATDCustomsPerson' element items. Должностное лицо  ТО, присутствовавшее при досмотре
     * 
     * @param list
     */
    public void setATDCustomsPersonList(List<ATDCustomPersonType> list) {
        ATDCustomsPersonList = list;
    }

    /** 
     * Get the list of 'AutoInspResults' element items. Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
     * 
     * @return list
     */
    public List<CarInformationType> getAutoInspResultList() {
        return autoInspResultList;
    }

    /** 
     * Set the list of 'AutoInspResults' element items. Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
     * 
     * @param list
     */
    public void setAutoInspResultList(List<CarInformationType> list) {
        autoInspResultList = list;
    }

    /** 
     * Get the 'InspTransport' element value. Сведения о транспортных  средствах
     * 
     * @return value
     */
    public InspTransportType getInspTransport() {
        return inspTransport;
    }

    /** 
     * Set the 'InspTransport' element value. Сведения о транспортных  средствах
     * 
     * @param inspTransport
     */
    public void setInspTransport(InspTransportType inspTransport) {
        this.inspTransport = inspTransport;
    }

    /** 
     * Get the list of 'UseTMCC' element items. Применяемые технические средства таможенного контроля
     * 
     * @return list
     */
    public List<UseTMCCType> getUseTMCCList() {
        return useTMCCList;
    }

    /** 
     * Set the list of 'UseTMCC' element items. Применяемые технические средства таможенного контроля
     * 
     * @param list
     */
    public void setUseTMCCList(List<UseTMCCType> list) {
        useTMCCList = list;
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
