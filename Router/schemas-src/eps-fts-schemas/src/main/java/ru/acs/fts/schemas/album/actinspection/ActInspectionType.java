
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ATDCustomPersonType;

/** 
 * ��� ����������� �������� (�������)
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
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'ActNumber' element value. ����� ���� ����������� �������� (�������)
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. ����� ���� ����������� �������� (�������)
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActType' element value. ���� ����: "0" - ���������� �������, "1" - ���������� ������
     * 
     * @return value
     */
    public String getActType() {
        return actType;
    }

    /** 
     * Set the 'ActType' element value. ���� ����: "0" - ���������� �������, "1" - ���������� ������
     * 
     * @param actType
     */
    public void setActType(String actType) {
        this.actType = actType;
    }

    /** 
     * Get the 'BeginInspectionTime' element value. ����� ������ ����������� �������� (�������)
     * 
     * @return value
     */
    public String getBeginInspectionTime() {
        return beginInspectionTime;
    }

    /** 
     * Set the 'BeginInspectionTime' element value. ����� ������ ����������� �������� (�������)
     * 
     * @param beginInspectionTime
     */
    public void setBeginInspectionTime(String beginInspectionTime) {
        this.beginInspectionTime = beginInspectionTime;
    }

    /** 
     * Get the 'BeginInspectionDate' element value. ���� ������ ����������� �������� (�������)
     * 
     * @return value
     */
    public LocalDate getBeginInspectionDate() {
        return beginInspectionDate;
    }

    /** 
     * Set the 'BeginInspectionDate' element value. ���� ������ ����������� �������� (�������)
     * 
     * @param beginInspectionDate
     */
    public void setBeginInspectionDate(LocalDate beginInspectionDate) {
        this.beginInspectionDate = beginInspectionDate;
    }

    /** 
     * Get the 'EndInspectionTime' element value. ����� ��������� ����������� �������� (�������)
     * 
     * @return value
     */
    public String getEndInspectionTime() {
        return endInspectionTime;
    }

    /** 
     * Set the 'EndInspectionTime' element value. ����� ��������� ����������� �������� (�������)
     * 
     * @param endInspectionTime
     */
    public void setEndInspectionTime(String endInspectionTime) {
        this.endInspectionTime = endInspectionTime;
    }

    /** 
     * Get the 'EndInspectionDate' element value. ���� ��������� ����������� �������� (�������)
     * 
     * @return value
     */
    public LocalDate getEndInspectionDate() {
        return endInspectionDate;
    }

    /** 
     * Set the 'EndInspectionDate' element value. ���� ��������� ����������� �������� (�������)
     * 
     * @param endInspectionDate
     */
    public void setEndInspectionDate(LocalDate endInspectionDate) {
        this.endInspectionDate = endInspectionDate;
    }

    /** 
     * Get the 'SecExempDate' element value. ���� ��������� ������� ����������
     * 
     * @return value
     */
    public LocalDate getSecExempDate() {
        return secExempDate;
    }

    /** 
     * Set the 'SecExempDate' element value. ���� ��������� ������� ����������
     * 
     * @param secExempDate
     */
    public void setSecExempDate(LocalDate secExempDate) {
        this.secExempDate = secExempDate;
    }

    /** 
     * Get the 'SecExempTime' element value. ����� ��������� ������� ����������
     * 
     * @return value
     */
    public String getSecExempTime() {
        return secExempTime;
    }

    /** 
     * Set the 'SecExempTime' element value. ����� ��������� ������� ����������
     * 
     * @param secExempTime
     */
    public void setSecExempTime(String secExempTime) {
        this.secExempTime = secExempTime;
    }

    /** 
     * Get the 'NumberOfPlaces' element value. ����� ���� � ������ �������
     * 
     * @return value
     */
    public String getNumberOfPlaces() {
        return numberOfPlaces;
    }

    /** 
     * Set the 'NumberOfPlaces' element value. ����� ���� � ������ �������
     * 
     * @param numberOfPlaces
     */
    public void setNumberOfPlaces(String numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    /** 
     * Get the 'BruttoWeightDocs' element value. ��� ������ ������� �� ����������
     * 
     * @return value
     */
    public String getBruttoWeightDocs() {
        return bruttoWeightDocs;
    }

    /** 
     * Set the 'BruttoWeightDocs' element value. ��� ������ ������� �� ����������
     * 
     * @param bruttoWeightDocs
     */
    public void setBruttoWeightDocs(String bruttoWeightDocs) {
        this.bruttoWeightDocs = bruttoWeightDocs;
    }

    /** 
     * Get the 'NewCustomsModeCode' element value. ��� ������ ����������� ������ - ��� ������ ���������� �������� ��� ��������� ������ �� ���� ��� ����������� ������� ����� ���������� ������� ��
     * 
     * @return value
     */
    public String getNewCustomsModeCode() {
        return newCustomsModeCode;
    }

    /** 
     * Set the 'NewCustomsModeCode' element value. ��� ������ ����������� ������ - ��� ������ ���������� �������� ��� ��������� ������ �� ���� ��� ����������� ������� ����� ���������� ������� ��
     * 
     * @param newCustomsModeCode
     */
    public void setNewCustomsModeCode(String newCustomsModeCode) {
        this.newCustomsModeCode = newCustomsModeCode;
    }

    /** 
     * Get the list of 'CustomsMark' element items. ��������� ������� 
     * 
     * @return list
     */
    public List<String> getCustomsMarkList() {
        return customsMarkList;
    }

    /** 
     * Set the list of 'CustomsMark' element items. ��������� ������� 
     * 
     * @param list
     */
    public void setCustomsMarkList(List<String> list) {
        customsMarkList = list;
    }

    /** 
     * Get the 'ActKind' element value. ������� ��������: 1 - �������� ���� �������, ���������� � ��, 2 - ������� ����� �������, ���������� � ��, 3 - ������� �������, ���������� � ���������� ��
     * 
     * @return value
     */
    public String getActKind() {
        return actKind;
    }

    /** 
     * Set the 'ActKind' element value. ������� ��������: 1 - �������� ���� �������, ���������� � ��, 2 - ������� ����� �������, ���������� � ��, 3 - ������� �������, ���������� � ���������� ��
     * 
     * @param actKind
     */
    public void setActKind(String actKind) {
        this.actKind = actKind;
    }

    /** 
     * Get the 'ShortFormSign' element value. ������� ����������� ���� � ����������� �����
     * 
     * @return value
     */
    public String getShortFormSign() {
        return shortFormSign;
    }

    /** 
     * Set the 'ShortFormSign' element value. ������� ����������� ���� � ����������� �����
     * 
     * @param shortFormSign
     */
    public void setShortFormSign(String shortFormSign) {
        this.shortFormSign = shortFormSign;
    }

    /** 
     * Get the 'EndComposeDate' element value. ���� ���������� ����������� ����
     * 
     * @return value
     */
    public LocalDate getEndComposeDate() {
        return endComposeDate;
    }

    /** 
     * Set the 'EndComposeDate' element value. ���� ���������� ����������� ����
     * 
     * @param endComposeDate
     */
    public void setEndComposeDate(LocalDate endComposeDate) {
        this.endComposeDate = endComposeDate;
    }

    /** 
     * Get the 'EndComposeTime' element value. ����� ���������� ����������� ����
     * 
     * @return value
     */
    public String getEndComposeTime() {
        return endComposeTime;
    }

    /** 
     * Set the 'EndComposeTime' element value. ����� ���������� ����������� ����
     * 
     * @param endComposeTime
     */
    public void setEndComposeTime(String endComposeTime) {
        this.endComposeTime = endComposeTime;
    }

    /** 
     * Get the list of 'InspectionParticipant' element items. ����, �������������� ��� �������� (�������)
     * 
     * @return list
     */
    public List<InspectionParticipantType> getInspectionParticipantList() {
        return inspectionParticipantList;
    }

    /** 
     * Set the list of 'InspectionParticipant' element items. ����, �������������� ��� �������� (�������)
     * 
     * @param list
     */
    public void setInspectionParticipantList(
            List<InspectionParticipantType> list) {
        inspectionParticipantList = list;
    }

    /** 
     * Get the 'Consignee' element value. ���������� �������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� �������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Transporter' element value. ����������
     * 
     * @return value
     */
    public TransporterType getTransporter() {
        return transporter;
    }

    /** 
     * Set the 'Transporter' element value. ����������
     * 
     * @param transporter
     */
    public void setTransporter(TransporterType transporter) {
        this.transporter = transporter;
    }

    /** 
     * Get the list of 'AccDocs' element items. ���������, �� ������� ����������� ������ (��, ������ ���, ������������ (������������) ���������, ������������ ���������, ���������� ���������)
     * 
     * @return list
     */
    public List<AccDocsType> getAccDocList() {
        return accDocList;
    }

    /** 
     * Set the list of 'AccDocs' element items. ���������, �� ������� ����������� ������ (��, ������ ���, ������������ (������������) ���������, ������������ ���������, ���������� ���������)
     * 
     * @param list
     */
    public void setAccDocList(List<AccDocsType> list) {
        accDocList = list;
    }

    /** 
     * Get the 'InspectionResults' element value. ���������� ����������� �������� (�������)
     * 
     * @return value
     */
    public InspectionResultsType getInspectionResults() {
        return inspectionResults;
    }

    /** 
     * Set the 'InspectionResults' element value. ���������� ����������� �������� (�������)
     * 
     * @param inspectionResults
     */
    public void setInspectionResults(InspectionResultsType inspectionResults) {
        this.inspectionResults = inspectionResults;
    }

    /** 
     * Get the 'TextAct' element value. ����� ����
     * 
     * @return value
     */
    public TextActType getTextAct() {
        return textAct;
    }

    /** 
     * Set the 'TextAct' element value. ����� ����
     * 
     * @param textAct
     */
    public void setTextAct(TextActType textAct) {
        this.textAct = textAct;
    }

    /** 
     * Get the 'Seize' element value. �������
     * 
     * @return value
     */
    public SeizeType getSeize() {
        return seize;
    }

    /** 
     * Set the 'Seize' element value. �������
     * 
     * @param seize
     */
    public void setSeize(SeizeType seize) {
        this.seize = seize;
    }

    /** 
     * Get the list of 'AMTInspResults' element items. ���������� �������� ���������� ������ (�������� ������� 8701 �� �� ��� ��)
     * 
     * @return list
     */
    public List<AMTInspResultsType> getAMTInspResultList() {
        return AMTInspResultList;
    }

    /** 
     * Set the list of 'AMTInspResults' element items. ���������� �������� ���������� ������ (�������� ������� 8701 �� �� ��� ��)
     * 
     * @param list
     */
    public void setAMTInspResultList(List<AMTInspResultsType> list) {
        AMTInspResultList = list;
    }

    /** 
     * Get the list of 'BusInspResults' element items. ���������� �������� ��������
     * 
     * @return list
     */
    public List<BusInspResultsType> getBusInspResultList() {
        return busInspResultList;
    }

    /** 
     * Set the list of 'BusInspResults' element items. ���������� �������� ��������
     * 
     * @param list
     */
    public void setBusInspResultList(List<BusInspResultsType> list) {
        busInspResultList = list;
    }

    /** 
     * Get the list of 'TrailerInspResults' element items. ���������� �������� �������, �����������
     * 
     * @return list
     */
    public List<TrailerInspResultsType> getTrailerInspResultList() {
        return trailerInspResultList;
    }

    /** 
     * Set the list of 'TrailerInspResults' element items. ���������� �������� �������, �����������
     * 
     * @param list
     */
    public void setTrailerInspResultList(List<TrailerInspResultsType> list) {
        trailerInspResultList = list;
    }

    /** 
     * Get the list of 'TruckInspResults' element items. ���������� �������� ��������� ����������
     * 
     * @return list
     */
    public List<TruckInspResultsType> getTruckInspResultList() {
        return truckInspResultList;
    }

    /** 
     * Set the list of 'TruckInspResults' element items. ���������� �������� ��������� ����������
     * 
     * @param list
     */
    public void setTruckInspResultList(List<TruckInspResultsType> list) {
        truckInspResultList = list;
    }

    /** 
     * Get the list of 'MotoInspResults' element items. ���������� �������� ��������� (������)
     * 
     * @return list
     */
    public List<MotoInspResultsType> getMotoInspResultList() {
        return motoInspResultList;
    }

    /** 
     * Set the list of 'MotoInspResults' element items. ���������� �������� ��������� (������)
     * 
     * @param list
     */
    public void setMotoInspResultList(List<MotoInspResultsType> list) {
        motoInspResultList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Consignor' element value. ����������� �������
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������� �������
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'InspectionPlace' element value. ����� ���������� ����������� �������� (�������)
     * 
     * @return value
     */
    public InspectionPlaceType getInspectionPlace() {
        return inspectionPlace;
    }

    /** 
     * Set the 'InspectionPlace' element value. ����� ���������� ����������� �������� (�������)
     * 
     * @param inspectionPlace
     */
    public void setInspectionPlace(InspectionPlaceType inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }

    /** 
     * Get the 'InstructionNumber' element value. �������� � ��������� �� �������
     * 
     * @return value
     */
    public InspInstructionType getInstructionNumber() {
        return instructionNumber;
    }

    /** 
     * Set the 'InstructionNumber' element value. �������� � ��������� �� �������
     * 
     * @param instructionNumber
     */
    public void setInstructionNumber(InspInstructionType instructionNumber) {
        this.instructionNumber = instructionNumber;
    }

    /** 
     * Get the list of 'ATDCustomsPerson' element items. ����������� ����  ��, ���������������� ��� ��������
     * 
     * @return list
     */
    public List<ATDCustomPersonType> getATDCustomsPersonList() {
        return ATDCustomsPersonList;
    }

    /** 
     * Set the list of 'ATDCustomsPerson' element items. ����������� ����  ��, ���������������� ��� ��������
     * 
     * @param list
     */
    public void setATDCustomsPersonList(List<ATDCustomPersonType> list) {
        ATDCustomsPersonList = list;
    }

    /** 
     * Get the list of 'AutoInspResults' element items. ���������� �������� ���������� (�������� ������� 8702, 8703 �� �� ��� ��)
     * 
     * @return list
     */
    public List<CarInformationType> getAutoInspResultList() {
        return autoInspResultList;
    }

    /** 
     * Set the list of 'AutoInspResults' element items. ���������� �������� ���������� (�������� ������� 8702, 8703 �� �� ��� ��)
     * 
     * @param list
     */
    public void setAutoInspResultList(List<CarInformationType> list) {
        autoInspResultList = list;
    }

    /** 
     * Get the 'InspTransport' element value. �������� � ������������  ���������
     * 
     * @return value
     */
    public InspTransportType getInspTransport() {
        return inspTransport;
    }

    /** 
     * Set the 'InspTransport' element value. �������� � ������������  ���������
     * 
     * @param inspTransport
     */
    public void setInspTransport(InspTransportType inspTransport) {
        this.inspTransport = inspTransport;
    }

    /** 
     * Get the list of 'UseTMCC' element items. ����������� ����������� �������� ����������� ��������
     * 
     * @return list
     */
    public List<UseTMCCType> getUseTMCCList() {
        return useTMCCList;
    }

    /** 
     * Set the list of 'UseTMCC' element items. ����������� ����������� �������� ����������� ��������
     * 
     * @param list
     */
    public void setUseTMCCList(List<UseTMCCType> list) {
        useTMCCList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
