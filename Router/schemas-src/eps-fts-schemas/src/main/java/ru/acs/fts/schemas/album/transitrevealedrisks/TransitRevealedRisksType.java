
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ��������� ������ �� ���������� � ���������� �������
 */
public class TransitRevealedRisksType extends BaseDocType
{
    private String transportID;
    private List<ProfilesType> profileList = new ArrayList<ProfilesType>();
    private ConsignmentsType consignments;
    private String documentModeID;

    /** 
     * Get the 'TransportID' element value. ������������� ��������� � ����������� � ���������� �������, �� ������� ���������� �����
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. ������������� ��������� � ����������� � ���������� �������, �� ������� ���������� �����
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
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
