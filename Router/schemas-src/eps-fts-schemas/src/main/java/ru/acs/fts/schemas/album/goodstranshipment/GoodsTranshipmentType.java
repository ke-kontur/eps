
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ������������� ���������� �������� �������� �/��� ��������� ����� ��������
 */
public class GoodsTranshipmentType extends BaseDocType
{
    private String documentDirection;
    private int choiceSelect = -1;
    private static final int TD_CHOICE = 0;
    private static final int TIRID_CHOICE = 1;
    private GTDIDType TD;
    private TIRIDType TIRID;
    private IncidentInfoType incidentInfo;
    private ReloadPlaceType reloadPlace;
    private List<TransportInfoType> transportList = new ArrayList<TransportInfoType>();
    private List<SealType> sealList = new ArrayList<SealType>();
    private CustomsPersonType customsPerson;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDirection' element value. ������� ����������� ���������: 0 - �� ��������� ��� � ��; 1 - �� �� ��������� ���
     * 
     * @return value
     */
    public String getDocumentDirection() {
        return documentDirection;
    }

    /** 
     * Set the 'DocumentDirection' element value. ������� ����������� ���������: 0 - �� ��������� ��� � ��; 1 - �� �� ��������� ���
     * 
     * @param documentDirection
     */
    public void setDocumentDirection(String documentDirection) {
        this.documentDirection = documentDirection;
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
     * Check if TD is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTD() {
        return choiceSelect == TD_CHOICE;
    }

    /** 
     * Get the 'TD' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. ����� ���������� ����������
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        setChoiceSelect(TD_CHOICE);
        this.TD = TD;
    }

    /** 
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. ����� ������ ���
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. ����� ������ ���
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'IncidentInfo' element value. ���������� � ������������ (�� ������ ��� �������� ������������� ���� �� ����� ���������)
     * 
     * @return value
     */
    public IncidentInfoType getIncidentInfo() {
        return incidentInfo;
    }

    /** 
     * Set the 'IncidentInfo' element value. ���������� � ������������ (�� ������ ��� �������� ������������� ���� �� ����� ���������)
     * 
     * @param incidentInfo
     */
    public void setIncidentInfo(IncidentInfoType incidentInfo) {
        this.incidentInfo = incidentInfo;
    }

    /** 
     * Get the 'ReloadPlace' element value. ����� ���������� �������� � ���� ��������.
     * 
     * @return value
     */
    public ReloadPlaceType getReloadPlace() {
        return reloadPlace;
    }

    /** 
     * Set the 'ReloadPlace' element value. ����� ���������� �������� � ���� ��������.
     * 
     * @param reloadPlace
     */
    public void setReloadPlace(ReloadPlaceType reloadPlace) {
        this.reloadPlace = reloadPlace;
    }

    /** 
     * Get the list of 'Transport' element items. �������� � ����� ������� ������������ ������� ����� ���������� �������� ��������
     * 
     * @return list
     */
    public List<TransportInfoType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. �������� � ����� ������� ������������ ������� ����� ���������� �������� ��������
     * 
     * @param list
     */
    public void setTransportList(List<TransportInfoType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'Seal' element items. ���������� � ����� ���������� �������, ������� � ���� ��������� �������������
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. ���������� � ����� ���������� �������, ������� � ���� ��������� �������������
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. �������� � ����������� ���� ����������� ������, ���������� ���������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. �������� � ����������� ���� ����������� ������, ���������� ���������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'Consignment' element items. ������������������ ���������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. ������������������ ���������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
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
