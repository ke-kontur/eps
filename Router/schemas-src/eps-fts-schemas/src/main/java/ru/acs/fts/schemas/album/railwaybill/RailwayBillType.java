
package ru.acs.fts.schemas.album.railwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� ��������������� ��������� �� ����� ���� 
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
     * Get the 'Number' element value. ����� ����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ConsignorNotice' element value. ������ ��������� �����������
     * 
     * @return value
     */
    public String getConsignorNotice() {
        return consignorNotice;
    }

    /** 
     * Set the 'ConsignorNotice' element value. ������ ��������� �����������
     * 
     * @param consignorNotice
     */
    public void setConsignorNotice(String consignorNotice) {
        this.consignorNotice = consignorNotice;
    }

    /** 
     * Get the 'ConsignorOptionNotice' element value. ������� �����������, �������������� ��� �������� ������
     * 
     * @return value
     */
    public String getConsignorOptionNotice() {
        return consignorOptionNotice;
    }

    /** 
     * Set the 'ConsignorOptionNotice' element value. ������� �����������, �������������� ��� �������� ������
     * 
     * @param consignorOptionNotice
     */
    public void setConsignorOptionNotice(String consignorOptionNotice) {
        this.consignorOptionNotice = consignorOptionNotice;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ����� ���������� �������� ���� �������� ������� ���������.  � ������ ��������������� "�������" ��� "�����"  �� �����������.
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ����� ���������� �������� ���� �������� ������� ���������.  � ������ ��������������� "�������" ��� "�����"  �� �����������.
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ����� ��� �������, ������������ ������������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ����� ��� �������, ������������ ������������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'DepartureModeDescription' element value. �������� ���� �������� 
     * 
     * @return value
     */
    public String getDepartureModeDescription() {
        return departureModeDescription;
    }

    /** 
     * Set the 'DepartureModeDescription' element value. �������� ���� �������� 
     * 
     * @param departureModeDescription
     */
    public void setDepartureModeDescription(String departureModeDescription) {
        this.departureModeDescription = departureModeDescription;
    }

    /** 
     * Get the 'LoaderModeDescription' element value. �������� ��� ���������
     * 
     * @return value
     */
    public String getLoaderModeDescription() {
        return loaderModeDescription;
    }

    /** 
     * Set the 'LoaderModeDescription' element value. �������� ��� ���������
     * 
     * @param loaderModeDescription
     */
    public void setLoaderModeDescription(String loaderModeDescription) {
        this.loaderModeDescription = loaderModeDescription;
    }

    /** 
     * Get the 'AdditionalSheetQuantity' element value. ���������� ����������� �������������� ������ � ���������
     * 
     * @return value
     */
    public String getAdditionalSheetQuantity() {
        return additionalSheetQuantity;
    }

    /** 
     * Set the 'AdditionalSheetQuantity' element value. ���������� ����������� �������������� ������ � ���������
     * 
     * @param additionalSheetQuantity
     */
    public void setAdditionalSheetQuantity(String additionalSheetQuantity) {
        this.additionalSheetQuantity = additionalSheetQuantity;
    }

    /** 
     * Get the 'CargoValue' element value. ����������� �������� �����, ���.
     * 
     * @return value
     */
    public String getCargoValue() {
        return cargoValue;
    }

    /** 
     * Set the 'CargoValue' element value. ����������� �������� �����, ���.
     * 
     * @param cargoValue
     */
    public void setCargoValue(String cargoValue) {
        this.cargoValue = cargoValue;
    }

    /** 
     * Get the 'CustomsNotice' element value. ������� ���������� �������
     * 
     * @return value
     */
    public String getCustomsNotice() {
        return customsNotice;
    }

    /** 
     * Set the 'CustomsNotice' element value. ������� ���������� �������
     * 
     * @param customsNotice
     */
    public void setCustomsNotice(String customsNotice) {
        this.customsNotice = customsNotice;
    }

    /** 
     * Get the 'WeightDefinitionModeDescription' element value. C����� ����������� ����
     * 
     * @return value
     */
    public String getWeightDefinitionModeDescription() {
        return weightDefinitionModeDescription;
    }

    /** 
     * Set the 'WeightDefinitionModeDescription' element value. C����� ����������� ����
     * 
     * @param weightDefinitionModeDescription
     */
    public void setWeightDefinitionModeDescription(
            String weightDefinitionModeDescription) {
        this.weightDefinitionModeDescription = weightDefinitionModeDescription;
    }

    /** 
     * Get the 'RegistrationDocument' element value. ���������� � ����������� ���� (����� 25 ����)
     * 
     * @return value
     */
    public DocumentBaseType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. ���������� � ����������� ���� (����� 25 ����)
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(DocumentBaseType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Consignor' element value. �������� � ���������������� (����� 1 ����)
     * 
     * @return value
     */
    public RBOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� � ���������������� (����� 1 ����)
     * 
     * @param consignor
     */
    public void setConsignor(RBOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ��������������� (����� 5 ����)
     * 
     * @return value
     */
    public RBOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ��������������� (����� 5 ����)
     * 
     * @param consignee
     */
    public void setConsignee(RBOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'DepartureStation' element value. �/� ������� � ������ ����������� (����� 3 ����)
     * 
     * @return value
     */
    public StationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. �/� ������� � ������ ����������� (����� 3 ����)
     * 
     * @param departureStation
     */
    public void setDepartureStation(StationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. �/� ������� � ������ ���������� (����� 8 ����)
     * 
     * @return value
     */
    public RailwayType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. �/� ������� � ������ ���������� (����� 8 ����)
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the list of 'BorderStation' element items. ����������� �/� ������� � ������ ���������� (����� 7 ����)
     * 
     * @return list
     */
    public List<StationType> getBorderStationList() {
        return borderStationList;
    }

    /** 
     * Set the list of 'BorderStation' element items. ����������� �/� ������� � ������ ���������� (����� 7 ����)
     * 
     * @param list
     */
    public void setBorderStationList(List<StationType> list) {
        borderStationList = list;
    }

    /** 
     * Get the 'Contract' element value. ��������� �������� �� ��������, ������������ ����� ����������� � ����������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������� �������� �� ��������, ������������ ����� ����������� � ����������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'RWBGoods' element items. �������� � ������� ���������
     * 
     * @return list
     */
    public List<RWBGoodsType> getRWBGoodList() {
        return RWBGoodList;
    }

    /** 
     * Set the list of 'RWBGoods' element items. �������� � ������� ���������
     * 
     * @param list
     */
    public void setRWBGoodList(List<RWBGoodsType> list) {
        RWBGoodList = list;
    }

    /** 
     * Get the 'ExchangePallet' element value. �������� �� �������� �������� (����� 17 ����)
     * 
     * @return value
     */
    public ExchangePalletType getExchangePallet() {
        return exchangePallet;
    }

    /** 
     * Set the 'ExchangePallet' element value. �������� �� �������� �������� (����� 17 ����)
     * 
     * @param exchangePallet
     */
    public void setExchangePallet(ExchangePalletType exchangePallet) {
        this.exchangePallet = exchangePallet;
    }

    /** 
     * Get the 'WorkTool' element value. �������� ������������ ��������������
     * 
     * @return value
     */
    public WorkToolType getWorkTool() {
        return workTool;
    }

    /** 
     * Set the 'WorkTool' element value. �������� ������������ ��������������
     * 
     * @param workTool
     */
    public void setWorkTool(WorkToolType workTool) {
        this.workTool = workTool;
    }

    /** 
     * Get the list of 'Container' element items. �������� � ����������
     * 
     * @return list
     */
    public List<ContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. �������� � ����������
     * 
     * @param list
     */
    public void setContainerList(List<ContainerType> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'ConsignorDocument' element items. ���������, ����������� ������������ (����� 23 ����)
     * 
     * @return list
     */
    public List<RWDocumentType> getConsignorDocumentList() {
        return consignorDocumentList;
    }

    /** 
     * Set the list of 'ConsignorDocument' element items. ���������, ����������� ������������ (����� 23 ����)
     * 
     * @param list
     */
    public void setConsignorDocumentList(List<RWDocumentType> list) {
        consignorDocumentList = list;
    }

    /** 
     * Get the list of 'Carriage' element items. ������ �� ������������ ������� 
     * 
     * @return list
     */
    public List<CarriageType> getCarriageList() {
        return carriageList;
    }

    /** 
     * Set the list of 'Carriage' element items. ������ �� ������������ ������� 
     * 
     * @param list
     */
    public void setCarriageList(List<CarriageType> list) {
        carriageList = list;
    }

    /** 
     * Get the list of 'Seal' element items. ���������� � ����� �����,  ���������� �� ����� ��� ��������� (����� 45 ����)
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. ���������� � ����� �����,  ���������� �� ����� ��� ��������� (����� 45 ����)
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the list of 'PaidRailwayCodeName' element items. ������������ � ���� ���������� ��������������� �����, �� ��������� �� ������� ����������� ��������� �� ���� �������
     * 
     * @return list
     */
    public List<PaidRailwayCodeNameType> getPaidRailwayCodeNameList() {
        return paidRailwayCodeNameList;
    }

    /** 
     * Set the list of 'PaidRailwayCodeName' element items. ������������ � ���� ���������� ��������������� �����, �� ��������� �� ������� ����������� ��������� �� ���� �������
     * 
     * @param list
     */
    public void setPaidRailwayCodeNameList(List<PaidRailwayCodeNameType> list) {
        paidRailwayCodeNameList = list;
    }

    /** 
     * Get the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
