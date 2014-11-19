
package ru.acs.fts.schemas.album.postalmanifest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� ��������
 */
public class PostalManifestType extends BaseDocType
{
    private LocalDate manifestDate;
    private String serialNumber;
    private String prioritySign;
    private String operatorContainerOwner;
    private String formSign;
    private OrganizationType designatedOperator;
    private OrganizationType destinationAgency;
    private OrganizationType carrier;
    private OrganizationType feedBillAgency;
    private int choiceSelect = -1;
    private static final int AIR_TRANSPORT_CHOICE = 0;
    private static final int SEA_TRANSPORT_CHOICE = 1;
    private static final int RW_TRANSPORT_CHOICE = 2;
    private static final int AUTO_TRANSPORT_CHOICE = 3;
    private AirTransportType airTransport;
    private SeaTransportType seaTransport;
    private RWTransportType RWTransport;
    private RWTransportType autoTransport;
    private List<ContainerType> containerList = new ArrayList<ContainerType>();
    private List<DespatchInfoType> despatchInfoList = new ArrayList<DespatchInfoType>();
    private ReplacementBillInfoType replacementBillInfo;
    private DespatchMeasuresType totalEmptyContainers;
    private DespatchMeasuresType totalWrittenCorr;
    private DespatchMeasuresType totalUncapacityParcels;
    private ReturnedContainersKindType returnedContainersKind;
    private List<ReloadInfoType> reloadInfoList = new ArrayList<ReloadInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ManifestDate' element value. ����
     * 
     * @return value
     */
    public LocalDate getManifestDate() {
        return manifestDate;
    }

    /** 
     * Set the 'ManifestDate' element value. ����
     * 
     * @param manifestDate
     */
    public void setManifestDate(LocalDate manifestDate) {
        this.manifestDate = manifestDate;
    }

    /** 
     * Get the 'SerialNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ����� �����
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'PrioritySign' element value. ������� ������� ����������
     * 
     * @return value
     */
    public String getPrioritySign() {
        return prioritySign;
    }

    /** 
     * Set the 'PrioritySign' element value. ������� ������� ����������
     * 
     * @param prioritySign
     */
    public void setPrioritySign(String prioritySign) {
        this.prioritySign = prioritySign;
    }

    /** 
     * Get the 'OperatorContainerOwner' element value. ����������� ��������, �������� ����������� �������
     * 
     * @return value
     */
    public String getOperatorContainerOwner() {
        return operatorContainerOwner;
    }

    /** 
     * Set the 'OperatorContainerOwner' element value. ����������� ��������, �������� ����������� �������
     * 
     * @param operatorContainerOwner
     */
    public void setOperatorContainerOwner(String operatorContainerOwner) {
        this.operatorContainerOwner = operatorContainerOwner;
    }

    /** 
     * Get the 'FormSign' element value. ������� ����� ���������: 1 - CN37; 2 - CN38; 3 - CN41; 4 - CN46; 5 - CN47
     * 
     * @return value
     */
    public String getFormSign() {
        return formSign;
    }

    /** 
     * Set the 'FormSign' element value. ������� ����� ���������: 1 - CN37; 2 - CN38; 3 - CN41; 4 - CN46; 5 - CN47
     * 
     * @param formSign
     */
    public void setFormSign(String formSign) {
        this.formSign = formSign;
    }

    /** 
     * Get the 'DesignatedOperator' element value. ����������� �������� ������ ������
     * 
     * @return value
     */
    public OrganizationType getDesignatedOperator() {
        return designatedOperator;
    }

    /** 
     * Set the 'DesignatedOperator' element value. ����������� �������� ������ ������
     * 
     * @param designatedOperator
     */
    public void setDesignatedOperator(OrganizationType designatedOperator) {
        this.designatedOperator = designatedOperator;
    }

    /** 
     * Get the 'DestinationAgency' element value. ���������� ������ ���������� ���������
     * 
     * @return value
     */
    public OrganizationType getDestinationAgency() {
        return destinationAgency;
    }

    /** 
     * Set the 'DestinationAgency' element value. ���������� ������ ���������� ���������
     * 
     * @param destinationAgency
     */
    public void setDestinationAgency(OrganizationType destinationAgency) {
        this.destinationAgency = destinationAgency;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'FeedBillAgency' element value. ���������� ������ ������ ���������
     * 
     * @return value
     */
    public OrganizationType getFeedBillAgency() {
        return feedBillAgency;
    }

    /** 
     * Set the 'FeedBillAgency' element value. ���������� ������ ������ ���������
     * 
     * @param feedBillAgency
     */
    public void setFeedBillAgency(OrganizationType feedBillAgency) {
        this.feedBillAgency = feedBillAgency;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if AirTransport is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifAirTransport() {
        return choiceSelect == AIR_TRANSPORT_CHOICE;
    }

    /** 
     * Get the 'AirTransport' element value. �������������
     * 
     * @return value
     */
    public AirTransportType getAirTransport() {
        return airTransport;
    }

    /** 
     * Set the 'AirTransport' element value. �������������
     * 
     * @param airTransport
     */
    public void setAirTransport(AirTransportType airTransport) {
        setChoiceSelect(AIR_TRANSPORT_CHOICE);
        this.airTransport = airTransport;
    }

    /** 
     * Check if SeaTransport is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSeaTransport() {
        return choiceSelect == SEA_TRANSPORT_CHOICE;
    }

    /** 
     * Get the 'SeaTransport' element value. �������� �����
     * 
     * @return value
     */
    public SeaTransportType getSeaTransport() {
        return seaTransport;
    }

    /** 
     * Set the 'SeaTransport' element value. �������� �����
     * 
     * @param seaTransport
     */
    public void setSeaTransport(SeaTransportType seaTransport) {
        setChoiceSelect(SEA_TRANSPORT_CHOICE);
        this.seaTransport = seaTransport;
    }

    /** 
     * Check if RWTransport is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifRWTransport() {
        return choiceSelect == RW_TRANSPORT_CHOICE;
    }

    /** 
     * Get the 'RW_Transport' element value. ��������������� ���������
     * 
     * @return value
     */
    public RWTransportType getRWTransport() {
        return RWTransport;
    }

    /** 
     * Set the 'RW_Transport' element value. ��������������� ���������
     * 
     * @param RWTransport
     */
    public void setRWTransport(RWTransportType RWTransport) {
        setChoiceSelect(RW_TRANSPORT_CHOICE);
        this.RWTransport = RWTransport;
    }

    /** 
     * Check if AutoTransport is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifAutoTransport() {
        return choiceSelect == AUTO_TRANSPORT_CHOICE;
    }

    /** 
     * Get the 'AutoTransport' element value. �������������
     * 
     * @return value
     */
    public RWTransportType getAutoTransport() {
        return autoTransport;
    }

    /** 
     * Set the 'AutoTransport' element value. �������������
     * 
     * @param autoTransport
     */
    public void setAutoTransport(RWTransportType autoTransport) {
        setChoiceSelect(AUTO_TRANSPORT_CHOICE);
        this.autoTransport = autoTransport;
    }

    /** 
     * Get the list of 'Container' element items. �������� �� ������������ �����������
     * 
     * @return list
     */
    public List<ContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. �������� �� ������������ �����������
     * 
     * @param list
     */
    public void setContainerList(List<ContainerType> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'DespatchInfo' element items. �������� � �������� �����������
     * 
     * @return list
     */
    public List<DespatchInfoType> getDespatchInfoList() {
        return despatchInfoList;
    }

    /** 
     * Set the list of 'DespatchInfo' element items. �������� � �������� �����������
     * 
     * @param list
     */
    public void setDespatchInfoList(List<DespatchInfoType> list) {
        despatchInfoList = list;
    }

    /** 
     * Get the 'ReplacementBillInfo' element value. �������� � ���������� ���������
     * 
     * @return value
     */
    public ReplacementBillInfoType getReplacementBillInfo() {
        return replacementBillInfo;
    }

    /** 
     * Set the 'ReplacementBillInfo' element value. �������� � ���������� ���������
     * 
     * @param replacementBillInfo
     */
    public void setReplacementBillInfo(
            ReplacementBillInfoType replacementBillInfo) {
        this.replacementBillInfo = replacementBillInfo;
    }

    /** 
     * Get the 'TotalEmptyContainers' element value. �������� �� ����� �������������� ����������� �������� ��������
     * 
     * @return value
     */
    public DespatchMeasuresType getTotalEmptyContainers() {
        return totalEmptyContainers;
    }

    /** 
     * Set the 'TotalEmptyContainers' element value. �������� �� ����� �������������� ����������� �������� ��������
     * 
     * @param totalEmptyContainers
     */
    public void setTotalEmptyContainers(
            DespatchMeasuresType totalEmptyContainers) {
        this.totalEmptyContainers = totalEmptyContainers;
    }

    /** 
     * Get the 'TotalWrittenCorr' element value. �������� �� ����� �������������� ����������� ���������� ���������������
     * 
     * @return value
     */
    public DespatchMeasuresType getTotalWrittenCorr() {
        return totalWrittenCorr;
    }

    /** 
     * Set the 'TotalWrittenCorr' element value. �������� �� ����� �������������� ����������� ���������� ���������������
     * 
     * @param totalWrittenCorr
     */
    public void setTotalWrittenCorr(DespatchMeasuresType totalWrittenCorr) {
        this.totalWrittenCorr = totalWrittenCorr;
    }

    /** 
     * Get the 'TotalUncapacityParcels' element value. �������� �� ����� �������������� ����������� ��
     * 
     * @return value
     */
    public DespatchMeasuresType getTotalUncapacityParcels() {
        return totalUncapacityParcels;
    }

    /** 
     * Set the 'TotalUncapacityParcels' element value. �������� �� ����� �������������� ����������� ��
     * 
     * @param totalUncapacityParcels
     */
    public void setTotalUncapacityParcels(
            DespatchMeasuresType totalUncapacityParcels) {
        this.totalUncapacityParcels = totalUncapacityParcels;
    }

    /** 
     * Get the 'ReturnedContainersKind' element value. �������� � ���� ������������ ��������
     * 
     * @return value
     */
    public ReturnedContainersKindType getReturnedContainersKind() {
        return returnedContainersKind;
    }

    /** 
     * Set the 'ReturnedContainersKind' element value. �������� � ���� ������������ ��������
     * 
     * @param returnedContainersKind
     */
    public void setReturnedContainersKind(
            ReturnedContainersKindType returnedContainersKind) {
        this.returnedContainersKind = returnedContainersKind;
    }

    /** 
     * Get the list of 'ReloadInfo' element items. �������� � ����������� ���������� ��� �������� ��������� � ����
     * 
     * @return list
     */
    public List<ReloadInfoType> getReloadInfoList() {
        return reloadInfoList;
    }

    /** 
     * Set the list of 'ReloadInfo' element items. �������� � ����������� ���������� ��� �������� ��������� � ����
     * 
     * @param list
     */
    public void setReloadInfoList(List<ReloadInfoType> list) {
        reloadInfoList = list;
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
