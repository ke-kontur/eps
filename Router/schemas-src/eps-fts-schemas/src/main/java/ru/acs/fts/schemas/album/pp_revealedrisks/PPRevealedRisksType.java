
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ��������� ������ �� ����������� � �������� ��
 */
public class PPRevealedRisksType extends BaseDocType
{
    private int choiceSelect = -1;
    private static final int TRANSPORT_ID_CHOICE = 0;
    private static final int TDTS_REG_NUMBER_CHOICE = 1;
    private String transportID;
    private TDTSType TDTSRegNumber;
    private List<ProfilesType> profileList = new ArrayList<ProfilesType>();
    private ConsignmentsType consignments;
    private String documentModeID;

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
     * Check if TransportID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTransportID() {
        return choiceSelect == TRANSPORT_ID_CHOICE;
    }

    /** 
     * Get the 'TransportID' element value. ������������� ��������� � �������� ����������, �� �������� ���������� �����
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. ������������� ��������� � �������� ����������, �� �������� ���������� �����
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        setChoiceSelect(TRANSPORT_ID_CHOICE);
        this.transportID = transportID;
    }

    /** 
     * Check if TDTSRegNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTDTSRegNumber() {
        return choiceSelect == TDTS_REG_NUMBER_CHOICE;
    }

    /** 
     * Get the 'TDTSRegNumber' element value. ��������������� ����� ����
     * 
     * @return value
     */
    public TDTSType getTDTSRegNumber() {
        return TDTSRegNumber;
    }

    /** 
     * Set the 'TDTSRegNumber' element value. ��������������� ����� ����
     * 
     * @param TDTSRegNumber
     */
    public void setTDTSRegNumber(TDTSType TDTSRegNumber) {
        setChoiceSelect(TDTS_REG_NUMBER_CHOICE);
        this.TDTSRegNumber = TDTSRegNumber;
    }

    /** 
     * Get the list of 'Profiles' element items. ���������� ��/���
     * 
     * @return list
     */
    public List<ProfilesType> getProfileList() {
        return profileList;
    }

    /** 
     * Set the list of 'Profiles' element items. ���������� ��/���
     * 
     * @param list
     */
    public void setProfileList(List<ProfilesType> list) {
        profileList = list;
    }

    /** 
     * Get the 'Consignments' element value. ������ �������, �� ������� ���� �������� �����
     * 
     * @return value
     */
    public ConsignmentsType getConsignments() {
        return consignments;
    }

    /** 
     * Set the 'Consignments' element value. ������ �������, �� ������� ���� �������� �����
     * 
     * @param consignments
     */
    public void setConsignments(ConsignmentsType consignments) {
        this.consignments = consignments;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
