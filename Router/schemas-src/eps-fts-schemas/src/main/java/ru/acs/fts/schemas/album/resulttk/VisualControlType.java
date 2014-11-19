
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� ����������� ��������
 */
public class VisualControlType
{
    private String shipmentType;
    private String tripKind;
    private String isTG;
    private String isKG;
    private String isOG;
    private String isSPS;
    private String isMAP;
    private String passengerCount;
    private String isTransit;
    private String cargoTypeName;
    private List<TransportType> trailerList = new ArrayList<TransportType>();
    private List<CheckViolationType> requirementList = new ArrayList<CheckViolationType>();

    /** 
     * Get the 'ShipmentType' element value. ��� ��������� (CONVEY - ��������� ����������; NO_PASSENGER - ��� ����������; NO_CARGO - ��� �����; FREIGHT - ��������� ������)
     * 
     * @return value
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /** 
     * Set the 'ShipmentType' element value. ��� ��������� (CONVEY - ��������� ����������; NO_PASSENGER - ��� ����������; NO_CARGO - ��� �����; FREIGHT - ��������� ������)
     * 
     * @param shipmentType
     */
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /** 
     * Get the 'TripKind' element value. ��� ������� (REGULAR - ����������; IRREGULAR - ������������)
     * 
     * @return value
     */
    public String getTripKind() {
        return tripKind;
    }

    /** 
     * Set the 'TripKind' element value. ��� ������� (REGULAR - ����������; IRREGULAR - ������������)
     * 
     * @param tripKind
     */
    public void setTripKind(String tripKind) {
        this.tripKind = tripKind;
    }

    /** 
     * Get the 'IsTG' element value. ������� ������������� �����
     * 
     * @return value
     */
    public String getIsTG() {
        return isTG;
    }

    /** 
     * Set the 'IsTG' element value. ������� ������������� �����
     * 
     * @param isTG
     */
    public void setIsTG(String isTG) {
        this.isTG = isTG;
    }

    /** 
     * Get the 'IsKG' element value. ������� ������-����������� �����
     * 
     * @return value
     */
    public String getIsKG() {
        return isKG;
    }

    /** 
     * Set the 'IsKG' element value. ������� ������-����������� �����
     * 
     * @param isKG
     */
    public void setIsKG(String isKG) {
        this.isKG = isKG;
    }

    /** 
     * Get the 'IsOG' element value. ������� �������� �����
     * 
     * @return value
     */
    public String getIsOG() {
        return isOG;
    }

    /** 
     * Set the 'IsOG' element value. ������� �������� �����
     * 
     * @param isOG
     */
    public void setIsOG(String isOG) {
        this.isOG = isOG;
    }

    /** 
     * Get the 'IsSPS' element value. ������� ���������������� �����
     * 
     * @return value
     */
    public String getIsSPS() {
        return isSPS;
    }

    /** 
     * Set the 'IsSPS' element value. ������� ���������������� �����
     * 
     * @param isSPS
     */
    public void setIsSPS(String isSPS) {
        this.isSPS = isSPS;
    }

    /** 
     * Get the 'IsMAP' element value. ������� ������������� ������������� ���������
     * 
     * @return value
     */
    public String getIsMAP() {
        return isMAP;
    }

    /** 
     * Set the 'IsMAP' element value. ������� ������������� ������������� ���������
     * 
     * @param isMAP
     */
    public void setIsMAP(String isMAP) {
        this.isMAP = isMAP;
    }

    /** 
     * Get the 'PassengerCount' element value. ���������� ����������
     * 
     * @return value
     */
    public String getPassengerCount() {
        return passengerCount;
    }

    /** 
     * Set the 'PassengerCount' element value. ���������� ����������
     * 
     * @param passengerCount
     */
    public void setPassengerCount(String passengerCount) {
        this.passengerCount = passengerCount;
    }

    /** 
     * Get the 'IsTransit' element value. ������� ���������� �������
     * 
     * @return value
     */
    public String getIsTransit() {
        return isTransit;
    }

    /** 
     * Set the 'IsTransit' element value. ������� ���������� �������
     * 
     * @param isTransit
     */
    public void setIsTransit(String isTransit) {
        this.isTransit = isTransit;
    }

    /** 
     * Get the 'CargoTypeName' element value. ��� ������ �� �� ���
     * 
     * @return value
     */
    public String getCargoTypeName() {
        return cargoTypeName;
    }

    /** 
     * Set the 'CargoTypeName' element value. ��� ������ �� �� ���
     * 
     * @param cargoTypeName
     */
    public void setCargoTypeName(String cargoTypeName) {
        this.cargoTypeName = cargoTypeName;
    }

    /** 
     * Get the list of 'Trailer' element items. ��������������� ������ ������� �������
     * 
     * @return list
     */
    public List<TransportType> getTrailerList() {
        return trailerList;
    }

    /** 
     * Set the list of 'Trailer' element items. ��������������� ������ ������� �������
     * 
     * @param list
     */
    public void setTrailerList(List<TransportType> list) {
        trailerList = list;
    }

    /** 
     * Get the list of 'Requirement' element items. �������� � �������/������������/���������� ����������/�������
     * 
     * @return list
     */
    public List<CheckViolationType> getRequirementList() {
        return requirementList;
    }

    /** 
     * Set the list of 'Requirement' element items. �������� � �������/������������/���������� ����������/�������
     * 
     * @param list
     */
    public void setRequirementList(List<CheckViolationType> list) {
        requirementList = list;
    }
}
