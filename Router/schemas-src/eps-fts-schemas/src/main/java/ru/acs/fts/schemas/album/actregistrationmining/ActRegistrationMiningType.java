
package ru.acs.fts.schemas.album.actregistrationmining;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��� ����������� ������� ������ (������) ��� �������� � ����� (������ ��������)/��� ���������� ����������� ������.
 */
public class ActRegistrationMiningType extends BaseDocType
{
    private String nameManagement;
    private LocalDate dateAct;
    private LocalDate startDate;
    private String startTime;
    private LocalDate endDate;
    private String endTime;
    private String overloadUnloading;
    private RegistrationNumberType registrationNumber;
    private AddressType executionPlace;
    private VesselType vessel;
    private VesselType receivingVessel;
    private VesselType vesselExtracted;
    private List<RegistrationType> registrationList = new ArrayList<RegistrationType>();
    private List<PersonSignatureType> inspectorSignatureList = new ArrayList<PersonSignatureType>();
    private PersonSignatureType shipmasterSignature;
    private RegistrationDatabaseType registrationDatabase;
    private String documentModeID;

    /** 
     * Get the 'NameManagement' element value. ������������ ������������ ���������� ��������� ������ (������������ ����������))
     * 
     * @return value
     */
    public String getNameManagement() {
        return nameManagement;
    }

    /** 
     * Set the 'NameManagement' element value. ������������ ������������ ���������� ��������� ������ (������������ ����������))
     * 
     * @param nameManagement
     */
    public void setNameManagement(String nameManagement) {
        this.nameManagement = nameManagement;
    }

    /** 
     * Get the 'DateAct' element value. ���� ����������� ����
     * 
     * @return value
     */
    public LocalDate getDateAct() {
        return dateAct;
    }

    /** 
     * Set the 'DateAct' element value. ���� ����������� ����
     * 
     * @param dateAct
     */
    public void setDateAct(LocalDate dateAct) {
        this.dateAct = dateAct;
    }

    /** 
     * Get the 'StartDate' element value. ���� ������ ����������/��������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ ����������/��������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'StartTime' element value. ����� ������ ����������/��������
     * 
     * @return value
     */
    public String getStartTime() {
        return startTime;
    }

    /** 
     * Set the 'StartTime' element value. ����� ������ ����������/��������
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� ����������/��������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� ����������/��������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'EndTime' element value. ����� ��������� ����������/��������
     * 
     * @return value
     */
    public String getEndTime() {
        return endTime;
    }

    /** 
     * Set the 'EndTime' element value. ����� ��������� ����������/��������
     * 
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /** 
     * Get the 'OverloadUnloading' element value. ��� ����������� ������� ������ (������) ���: 0 - ��������, 1 - ����������
     * 
     * @return value
     */
    public String getOverloadUnloading() {
        return overloadUnloading;
    }

    /** 
     * Set the 'OverloadUnloading' element value. ��� ����������� ������� ������ (������) ���: 0 - ��������, 1 - ����������
     * 
     * @param overloadUnloading
     */
    public void setOverloadUnloading(String overloadUnloading) {
        this.overloadUnloading = overloadUnloading;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ����
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'ExecutionPlace' element value. ����� ����������� ����
     * 
     * @return value
     */
    public AddressType getExecutionPlace() {
        return executionPlace;
    }

    /** 
     * Set the 'ExecutionPlace' element value. ����� ����������� ����
     * 
     * @param executionPlace
     */
    public void setExecutionPlace(AddressType executionPlace) {
        this.executionPlace = executionPlace;
    }

    /** 
     * Get the 'Vessel' element value. �������� � ���������� ����� ��� �����, �������� �������������� ��������
     * 
     * @return value
     */
    public VesselType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. �������� � ���������� ����� ��� �����, �������� �������������� ��������
     * 
     * @param vessel
     */
    public void setVessel(VesselType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the 'ReceivingVessel' element value. �������� � ����������� �����
     * 
     * @return value
     */
    public VesselType getReceivingVessel() {
        return receivingVessel;
    }

    /** 
     * Set the 'ReceivingVessel' element value. �������� � ����������� �����
     * 
     * @param receivingVessel
     */
    public void setReceivingVessel(VesselType receivingVessel) {
        this.receivingVessel = receivingVessel;
    }

    /** 
     * Get the 'VesselExtracted' element value. �������� � �����, � �������� ������ ������ ����� � �������������
     * 
     * @return value
     */
    public VesselType getVesselExtracted() {
        return vesselExtracted;
    }

    /** 
     * Set the 'VesselExtracted' element value. �������� � �����, � �������� ������ ������ ����� � �������������
     * 
     * @param vesselExtracted
     */
    public void setVesselExtracted(VesselType vesselExtracted) {
        this.vesselExtracted = vesselExtracted;
    }

    /** 
     * Get the list of 'Registration' element items. �����������
     * 
     * @return list
     */
    public List<RegistrationType> getRegistrationList() {
        return registrationList;
    }

    /** 
     * Set the list of 'Registration' element items. �����������
     * 
     * @param list
     */
    public void setRegistrationList(List<RegistrationType> list) {
        registrationList = list;
    }

    /** 
     * Get the list of 'InspectorSignature' element items. ������� ����������
     * 
     * @return list
     */
    public List<PersonSignatureType> getInspectorSignatureList() {
        return inspectorSignatureList;
    }

    /** 
     * Set the list of 'InspectorSignature' element items. ������� ����������
     * 
     * @param list
     */
    public void setInspectorSignatureList(List<PersonSignatureType> list) {
        inspectorSignatureList = list;
    }

    /** 
     * Get the 'ShipmasterSignature' element value. ������� �������� �����
     * 
     * @return value
     */
    public PersonSignatureType getShipmasterSignature() {
        return shipmasterSignature;
    }

    /** 
     * Set the 'ShipmasterSignature' element value. ������� �������� �����
     * 
     * @param shipmasterSignature
     */
    public void setShipmasterSignature(PersonSignatureType shipmasterSignature) {
        this.shipmasterSignature = shipmasterSignature;
    }

    /** 
     * Get the 'RegistrationDatabase' element value. ����������� � ���� ������
     * 
     * @return value
     */
    public RegistrationDatabaseType getRegistrationDatabase() {
        return registrationDatabase;
    }

    /** 
     * Set the 'RegistrationDatabase' element value. ����������� � ���� ������
     * 
     * @param registrationDatabase
     */
    public void setRegistrationDatabase(
            RegistrationDatabaseType registrationDatabase) {
        this.registrationDatabase = registrationDatabase;
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
