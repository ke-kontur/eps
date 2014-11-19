
package ru.acs.fts.schemas.album.crewlist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.PortType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * ������� ����
 */
public class CrewListType extends BaseDocType
{
    private String languageCode;
    private String departurePort;
    private String arrivalIndicator;
    private String carrier;
    private String notice;
    private String RUPersonnel;
    private String foreignPersonnel;
    private PersonSignatureType documentSignature;
    private VesselType vessel;
    private int choiceSelect = -1;
    private static final int ARRIVAL_CHOICE = 0;
    private static final int SAILING_CHOICE = 1;
    private PortType arrival;
    private PortType sailing;
    private List<CockpitPersonnelType> cockpitPersonnelList = new ArrayList<CockpitPersonnelType>();
    private String documentModeID;

    /** 
     * Get the 'LanguageCode' element value. ��� ����� ��������� 
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. ��� ����� ��������� 
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'DeparturePort' element value. �������� ����� ����������� �����
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. �������� ����� ����������� �����
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the 'ArrivalIndicator' element value. ������� �������� ����� ������������ ���������� �������
     * 
     * @return value
     */
    public String getArrivalIndicator() {
        return arrivalIndicator;
    }

    /** 
     * Set the 'ArrivalIndicator' element value. ������� �������� ����� ������������ ���������� �������
     * 
     * @param arrivalIndicator
     */
    public void setArrivalIndicator(String arrivalIndicator) {
        this.arrivalIndicator = arrivalIndicator;
    }

    /** 
     * Get the 'Carrier' element value. �������� ����������� (������)
     * 
     * @return value
     */
    public String getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� ����������� (������)
     * 
     * @param carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Notice' element value. ���������� 
     * 
     * @return value
     */
    public String getNotice() {
        return notice;
    }

    /** 
     * Set the 'Notice' element value. ���������� 
     * 
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /** 
     * Get the 'RUPersonnel' element value. ���������� ���������� ������ �������.
     * 
     * @return value
     */
    public String getRUPersonnel() {
        return RUPersonnel;
    }

    /** 
     * Set the 'RUPersonnel' element value. ���������� ���������� ������ �������.
     * 
     * @param RUPersonnel
     */
    public void setRUPersonnel(String RUPersonnel) {
        this.RUPersonnel = RUPersonnel;
    }

    /** 
     * Get the 'ForeignPersonnel' element value. ���������� ����������� ������ �������.
     * 
     * @return value
     */
    public String getForeignPersonnel() {
        return foreignPersonnel;
    }

    /** 
     * Set the 'ForeignPersonnel' element value. ���������� ����������� ������ �������.
     * 
     * @param foreignPersonnel
     */
    public void setForeignPersonnel(String foreignPersonnel) {
        this.foreignPersonnel = foreignPersonnel;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'Vessel' element value. ��������� �����
     * 
     * @return value
     */
    public VesselType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. ��������� �����
     * 
     * @param vessel
     */
    public void setVessel(VesselType vessel) {
        this.vessel = vessel;
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
     * Check if Arrival is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArrival() {
        return choiceSelect == ARRIVAL_CHOICE;
    }

    /** 
     * Get the 'Arrival' element value. ���������� � ��������
     * 
     * @return value
     */
    public PortType getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. ���������� � ��������
     * 
     * @param arrival
     */
    public void setArrival(PortType arrival) {
        setChoiceSelect(ARRIVAL_CHOICE);
        this.arrival = arrival;
    }

    /** 
     * Check if Sailing is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSailing() {
        return choiceSelect == SAILING_CHOICE;
    }

    /** 
     * Get the 'Sailing' element value. ���������� �� ������
     * 
     * @return value
     */
    public PortType getSailing() {
        return sailing;
    }

    /** 
     * Set the 'Sailing' element value. ���������� �� ������
     * 
     * @param sailing
     */
    public void setSailing(PortType sailing) {
        setChoiceSelect(SAILING_CHOICE);
        this.sailing = sailing;
    }

    /** 
     * Get the list of 'CockpitPersonnel' element items. ��������� ������ �������
     * 
     * @return list
     */
    public List<CockpitPersonnelType> getCockpitPersonnelList() {
        return cockpitPersonnelList;
    }

    /** 
     * Set the list of 'CockpitPersonnel' element items. ��������� ������ �������
     * 
     * @param list
     */
    public void setCockpitPersonnelList(List<CockpitPersonnelType> list) {
        cockpitPersonnelList = list;
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
