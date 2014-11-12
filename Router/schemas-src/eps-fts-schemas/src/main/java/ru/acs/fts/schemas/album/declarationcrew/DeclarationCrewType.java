
package ru.acs.fts.schemas.album.declarationcrew;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� � ������ ����� �������
 */
public class DeclarationCrewType extends BaseDocType
{
    private String shipName;
    private String nationalityVessel;
    private List<String> subjectList = new ArrayList<String>();
    private String arrivalPort;
    private String departurePort;
    private List<PersonSignatureType> personSignatureList = new ArrayList<PersonSignatureType>();
    private PersonSignatureType captainSignature;
    private String documentModeID;

    /** 
     * Get the 'ShipName' element value. �������� �����
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. �������� �����
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'NationalityVessel' element value. ������������ �������������� �����
     * 
     * @return value
     */
    public String getNationalityVessel() {
        return nationalityVessel;
    }

    /** 
     * Set the 'NationalityVessel' element value. ������������ �������������� �����
     * 
     * @param nationalityVessel
     */
    public void setNationalityVessel(String nationalityVessel) {
        this.nationalityVessel = nationalityVessel;
    }

    /** 
     * Get the list of 'Subject' element items. ��������, ������� �������� ��� ������������� �� ����������, ��� ����������� 
     * 
     * @return list
     */
    public List<String> getSubjectList() {
        return subjectList;
    }

    /** 
     * Set the list of 'Subject' element items. ��������, ������� �������� ��� ������������� �� ����������, ��� ����������� 
     * 
     * @param list
     */
    public void setSubjectList(List<String> list) {
        subjectList = list;
    }

    /** 
     * Get the 'ArrivalPort' element value. ���� �������
     * 
     * @return value
     */
    public String getArrivalPort() {
        return arrivalPort;
    }

    /** 
     * Set the 'ArrivalPort' element value. ���� �������
     * 
     * @param arrivalPort
     */
    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    /** 
     * Get the 'DeparturePort' element value. ���� ������ 
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. ���� ������ 
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the list of 'PersonSignature' element items. ������� �������
     * 
     * @return list
     */
    public List<PersonSignatureType> getPersonSignatureList() {
        return personSignatureList;
    }

    /** 
     * Set the list of 'PersonSignature' element items. ������� �������
     * 
     * @param list
     */
    public void setPersonSignatureList(List<PersonSignatureType> list) {
        personSignatureList = list;
    }

    /** 
     * Get the 'CaptainSignature' element value. ������� ��������, ��������������� ������ ��� ���� ���������� �������.
     * 
     * @return value
     */
    public PersonSignatureType getCaptainSignature() {
        return captainSignature;
    }

    /** 
     * Set the 'CaptainSignature' element value. ������� ��������, ��������������� ������ ��� ���� ���������� �������.
     * 
     * @param captainSignature
     */
    public void setCaptainSignature(PersonSignatureType captainSignature) {
        this.captainSignature = captainSignature;
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
