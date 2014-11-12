
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������, �������� ����������� � ����������
 */
public class AutoMotoParametersType
{
    private String model;
    private String mark;
    private String productionYear;
    private String distance;
    private String distanceUnit;
    private String engineNumber;
    private String carriageNumber;
    private String VIN;
    private String color;
    private String transmission;
    private String numberOfWheel;
    private String numberOfDriveWheel;
    private String elGlassLift;
    private String radioDevice;
    private String radioDeviceDescr;
    private String seatHeating;
    private String numberOfSeat;
    private String ABS;
    private String bortComputer;
    private String signalization;
    private List<String> addonDeviceList = new ArrayList<String>();
    private List<String> tuningList = new ArrayList<String>();
    private List<String> visDamageList = new ArrayList<String>();
    private List<String> otherList = new ArrayList<String>();

    /** 
     * Get the 'Model' element value. ������
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. ������
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. �����
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. �����
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'ProductionYear' element value. ��� �������
     * 
     * @return value
     */
    public String getProductionYear() {
        return productionYear;
    }

    /** 
     * Set the 'ProductionYear' element value. ��� �������
     * 
     * @param productionYear
     */
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    /** 
     * Get the 'Distance' element value. ������
     * 
     * @return value
     */
    public String getDistance() {
        return distance;
    }

    /** 
     * Set the 'Distance' element value. ������
     * 
     * @param distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /** 
     * Get the 'DistanceUnit' element value. ������� ��������� �������: "0" - ���������, "1" - ����
     * 
     * @return value
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /** 
     * Set the 'DistanceUnit' element value. ������� ��������� �������: "0" - ���������, "1" - ����
     * 
     * @param distanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /** 
     * Get the 'EngineNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /** 
     * Set the 'EngineNumber' element value. ����� ���������
     * 
     * @param engineNumber
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /** 
     * Get the 'CarriageNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. ����� ����
     * 
     * @param carriageNumber
     */
    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    /** 
     * Get the 'VIN' element value. VIN
     * 
     * @return value
     */
    public String getVIN() {
        return VIN;
    }

    /** 
     * Set the 'VIN' element value. VIN
     * 
     * @param VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /** 
     * Get the 'Color' element value. ����
     * 
     * @return value
     */
    public String getColor() {
        return color;
    }

    /** 
     * Set the 'Color' element value. ����
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** 
     * Get the 'Transmission' element value. �����������: "1" - ��������������, "2" - ������������, "3" - ��������
     * 
     * @return value
     */
    public String getTransmission() {
        return transmission;
    }

    /** 
     * Set the 'Transmission' element value. �����������: "1" - ��������������, "2" - ������������, "3" - ��������
     * 
     * @param transmission
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /** 
     * Get the 'NumberOfWheel' element value. ����� �����
     * 
     * @return value
     */
    public String getNumberOfWheel() {
        return numberOfWheel;
    }

    /** 
     * Set the 'NumberOfWheel' element value. ����� �����
     * 
     * @param numberOfWheel
     */
    public void setNumberOfWheel(String numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    /** 
     * Get the 'NumberOfDriveWheel' element value. ����� ������� �����
     * 
     * @return value
     */
    public String getNumberOfDriveWheel() {
        return numberOfDriveWheel;
    }

    /** 
     * Set the 'NumberOfDriveWheel' element value. ����� ������� �����
     * 
     * @param numberOfDriveWheel
     */
    public void setNumberOfDriveWheel(String numberOfDriveWheel) {
        this.numberOfDriveWheel = numberOfDriveWheel;
    }

    /** 
     * Get the 'ElGlassLift' element value. ����� ������������������������: "0" - ���� ���
     * 
     * @return value
     */
    public String getElGlassLift() {
        return elGlassLift;
    }

    /** 
     * Set the 'ElGlassLift' element value. ����� ������������������������: "0" - ���� ���
     * 
     * @param elGlassLift
     */
    public void setElGlassLift(String elGlassLift) {
        this.elGlassLift = elGlassLift;
    }

    /** 
     * Get the 'RadioDevice' element value. ���������������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getRadioDevice() {
        return radioDevice;
    }

    /** 
     * Set the 'RadioDevice' element value. ���������������: "0" - ���, "1" - ����
     * 
     * @param radioDevice
     */
    public void setRadioDevice(String radioDevice) {
        this.radioDevice = radioDevice;
    }

    /** 
     * Get the 'RadioDeviceDescr' element value. �������� ���������������
     * 
     * @return value
     */
    public String getRadioDeviceDescr() {
        return radioDeviceDescr;
    }

    /** 
     * Set the 'RadioDeviceDescr' element value. �������� ���������������
     * 
     * @param radioDeviceDescr
     */
    public void setRadioDeviceDescr(String radioDeviceDescr) {
        this.radioDeviceDescr = radioDeviceDescr;
    }

    /** 
     * Get the 'SeatHeating' element value. ���������� ���������� �������
     * 
     * @return value
     */
    public String getSeatHeating() {
        return seatHeating;
    }

    /** 
     * Set the 'SeatHeating' element value. ���������� ���������� �������
     * 
     * @param seatHeating
     */
    public void setSeatHeating(String seatHeating) {
        this.seatHeating = seatHeating;
    }

    /** 
     * Get the 'NumberOfSeat' element value. ���������� ����
     * 
     * @return value
     */
    public String getNumberOfSeat() {
        return numberOfSeat;
    }

    /** 
     * Set the 'NumberOfSeat' element value. ���������� ����
     * 
     * @param numberOfSeat
     */
    public void setNumberOfSeat(String numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    /** 
     * Get the 'ABS' element value. ����������������� �������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getABS() {
        return ABS;
    }

    /** 
     * Set the 'ABS' element value. ����������������� �������: "0" - ���, "1" - ����
     * 
     * @param ABS
     */
    public void setABS(String ABS) {
        this.ABS = ABS;
    }

    /** 
     * Get the 'BortComputer' element value. �������� ��������� � ��������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getBortComputer() {
        return bortComputer;
    }

    /** 
     * Set the 'BortComputer' element value. �������� ��������� � ��������: "0" - ���, "1" - ����
     * 
     * @param bortComputer
     */
    public void setBortComputer(String bortComputer) {
        this.bortComputer = bortComputer;
    }

    /** 
     * Get the 'Signalization' element value. ������������: "0" - ���, "1" - ����
     * 
     * @return value
     */
    public String getSignalization() {
        return signalization;
    }

    /** 
     * Set the 'Signalization' element value. ������������: "0" - ���, "1" - ����
     * 
     * @param signalization
     */
    public void setSignalization(String signalization) {
        this.signalization = signalization;
    }

    /** 
     * Get the list of 'AddonDevice' element items. �������� ������������
     * 
     * @return list
     */
    public List<String> getAddonDeviceList() {
        return addonDeviceList;
    }

    /** 
     * Set the list of 'AddonDevice' element items. �������� ������������
     * 
     * @param list
     */
    public void setAddonDeviceList(List<String> list) {
        addonDeviceList = list;
    }

    /** 
     * Get the list of 'Tuning' element items. ������
     * 
     * @return list
     */
    public List<String> getTuningList() {
        return tuningList;
    }

    /** 
     * Set the list of 'Tuning' element items. ������
     * 
     * @param list
     */
    public void setTuningList(List<String> list) {
        tuningList = list;
    }

    /** 
     * Get the list of 'VisDamage' element items. ������� �����������
     * 
     * @return list
     */
    public List<String> getVisDamageList() {
        return visDamageList;
    }

    /** 
     * Set the list of 'VisDamage' element items. ������� �����������
     * 
     * @param list
     */
    public void setVisDamageList(List<String> list) {
        visDamageList = list;
    }

    /** 
     * Get the list of 'Other' element items. ������
     * 
     * @return list
     */
    public List<String> getOtherList() {
        return otherList;
    }

    /** 
     * Set the list of 'Other' element items. ������
     * 
     * @param list
     */
    public void setOtherList(List<String> list) {
        otherList = list;
    }
}
