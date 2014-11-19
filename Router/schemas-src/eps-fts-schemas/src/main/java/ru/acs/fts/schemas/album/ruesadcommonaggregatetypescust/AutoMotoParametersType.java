
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Параметры, присущие автомобилям и мотоциклам
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
     * Get the 'Model' element value. Модель
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Модель
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. Марка
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Марка
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'ProductionYear' element value. Год выпуска
     * 
     * @return value
     */
    public String getProductionYear() {
        return productionYear;
    }

    /** 
     * Set the 'ProductionYear' element value. Год выпуска
     * 
     * @param productionYear
     */
    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    /** 
     * Get the 'Distance' element value. Пробег
     * 
     * @return value
     */
    public String getDistance() {
        return distance;
    }

    /** 
     * Set the 'Distance' element value. Пробег
     * 
     * @param distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /** 
     * Get the 'DistanceUnit' element value. Единицы измерения пробега: "0" - километры, "1" - мили
     * 
     * @return value
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /** 
     * Set the 'DistanceUnit' element value. Единицы измерения пробега: "0" - километры, "1" - мили
     * 
     * @param distanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /** 
     * Get the 'EngineNumber' element value. Номер двигателя
     * 
     * @return value
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /** 
     * Set the 'EngineNumber' element value. Номер двигателя
     * 
     * @param engineNumber
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /** 
     * Get the 'CarriageNumber' element value. Номер рамы
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. Номер рамы
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
     * Get the 'Color' element value. Цвет
     * 
     * @return value
     */
    public String getColor() {
        return color;
    }

    /** 
     * Set the 'Color' element value. Цвет
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** 
     * Get the 'Transmission' element value. Трансмиссия: "1" - автоматическая, "2" - механическая, "3" - вариатор
     * 
     * @return value
     */
    public String getTransmission() {
        return transmission;
    }

    /** 
     * Set the 'Transmission' element value. Трансмиссия: "1" - автоматическая, "2" - механическая, "3" - вариатор
     * 
     * @param transmission
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /** 
     * Get the 'NumberOfWheel' element value. Число колес
     * 
     * @return value
     */
    public String getNumberOfWheel() {
        return numberOfWheel;
    }

    /** 
     * Set the 'NumberOfWheel' element value. Число колес
     * 
     * @param numberOfWheel
     */
    public void setNumberOfWheel(String numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    /** 
     * Get the 'NumberOfDriveWheel' element value. Число ведущих колес
     * 
     * @return value
     */
    public String getNumberOfDriveWheel() {
        return numberOfDriveWheel;
    }

    /** 
     * Set the 'NumberOfDriveWheel' element value. Число ведущих колес
     * 
     * @param numberOfDriveWheel
     */
    public void setNumberOfDriveWheel(String numberOfDriveWheel) {
        this.numberOfDriveWheel = numberOfDriveWheel;
    }

    /** 
     * Get the 'ElGlassLift' element value. Число электростеклоподъемников: "0" - если нет
     * 
     * @return value
     */
    public String getElGlassLift() {
        return elGlassLift;
    }

    /** 
     * Set the 'ElGlassLift' element value. Число электростеклоподъемников: "0" - если нет
     * 
     * @param elGlassLift
     */
    public void setElGlassLift(String elGlassLift) {
        this.elGlassLift = elGlassLift;
    }

    /** 
     * Get the 'RadioDevice' element value. Радиоаппаратура: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getRadioDevice() {
        return radioDevice;
    }

    /** 
     * Set the 'RadioDevice' element value. Радиоаппаратура: "0" - нет, "1" - есть
     * 
     * @param radioDevice
     */
    public void setRadioDevice(String radioDevice) {
        this.radioDevice = radioDevice;
    }

    /** 
     * Get the 'RadioDeviceDescr' element value. Описание радиоаппаратуры
     * 
     * @return value
     */
    public String getRadioDeviceDescr() {
        return radioDeviceDescr;
    }

    /** 
     * Set the 'RadioDeviceDescr' element value. Описание радиоаппаратуры
     * 
     * @param radioDeviceDescr
     */
    public void setRadioDeviceDescr(String radioDeviceDescr) {
        this.radioDeviceDescr = radioDeviceDescr;
    }

    /** 
     * Get the 'SeatHeating' element value. Количество подогревов сидений
     * 
     * @return value
     */
    public String getSeatHeating() {
        return seatHeating;
    }

    /** 
     * Set the 'SeatHeating' element value. Количество подогревов сидений
     * 
     * @param seatHeating
     */
    public void setSeatHeating(String seatHeating) {
        this.seatHeating = seatHeating;
    }

    /** 
     * Get the 'NumberOfSeat' element value. Количество мест
     * 
     * @return value
     */
    public String getNumberOfSeat() {
        return numberOfSeat;
    }

    /** 
     * Set the 'NumberOfSeat' element value. Количество мест
     * 
     * @param numberOfSeat
     */
    public void setNumberOfSeat(String numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    /** 
     * Get the 'ABS' element value. Антиблокировочная система: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getABS() {
        return ABS;
    }

    /** 
     * Set the 'ABS' element value. Антиблокировочная система: "0" - нет, "1" - есть
     * 
     * @param ABS
     */
    public void setABS(String ABS) {
        this.ABS = ABS;
    }

    /** 
     * Get the 'BortComputer' element value. Бортовой компьютер с дисплеем: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getBortComputer() {
        return bortComputer;
    }

    /** 
     * Set the 'BortComputer' element value. Бортовой компьютер с дисплеем: "0" - нет, "1" - есть
     * 
     * @param bortComputer
     */
    public void setBortComputer(String bortComputer) {
        this.bortComputer = bortComputer;
    }

    /** 
     * Get the 'Signalization' element value. Сигнализация: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getSignalization() {
        return signalization;
    }

    /** 
     * Set the 'Signalization' element value. Сигнализация: "0" - нет, "1" - есть
     * 
     * @param signalization
     */
    public void setSignalization(String signalization) {
        this.signalization = signalization;
    }

    /** 
     * Get the list of 'AddonDevice' element items. Навесное оборудование
     * 
     * @return list
     */
    public List<String> getAddonDeviceList() {
        return addonDeviceList;
    }

    /** 
     * Set the list of 'AddonDevice' element items. Навесное оборудование
     * 
     * @param list
     */
    public void setAddonDeviceList(List<String> list) {
        addonDeviceList = list;
    }

    /** 
     * Get the list of 'Tuning' element items. Тюнинг
     * 
     * @return list
     */
    public List<String> getTuningList() {
        return tuningList;
    }

    /** 
     * Set the list of 'Tuning' element items. Тюнинг
     * 
     * @param list
     */
    public void setTuningList(List<String> list) {
        tuningList = list;
    }

    /** 
     * Get the list of 'VisDamage' element items. Видимые повреждения
     * 
     * @return list
     */
    public List<String> getVisDamageList() {
        return visDamageList;
    }

    /** 
     * Set the list of 'VisDamage' element items. Видимые повреждения
     * 
     * @param list
     */
    public void setVisDamageList(List<String> list) {
        visDamageList = list;
    }

    /** 
     * Get the list of 'Other' element items. Прочее
     * 
     * @return list
     */
    public List<String> getOtherList() {
        return otherList;
    }

    /** 
     * Set the list of 'Other' element items. Прочее
     * 
     * @param list
     */
    public void setOtherList(List<String> list) {
        otherList = list;
    }
}
