
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Результаты досмотра автомобиля (товарная позиция 8702, 8703 по ТН ВЭД ТС)
 */
public class AutoInspResultsType extends AutoMotoParametersType
{
    private String autoKind;
    private String engineVolume;
    private String engineKind;
    private String lightDisk;
    private String GUR;
    private String elUR;
    private String airBag;
    private String elBackGlass;
    private String elHeatingGlass;
    private String conditioner;
    private String upholstery;
    private List<String> svetDeviceList = new ArrayList<String>();
    private String numberOfHatch;
    private String telefon;
    private String centrLock;
    private String salonWindow;
    private String distanceControl;
    private String parktronic;
    private String fireExten;
    private String parkHeating;
    private String pnevmoDevice;
    private String broneClass;
    private String regCode;
    private List<HatchType> hatchList = new ArrayList<HatchType>();
    private BodyInfType bodyInf;

    /** 
     * Get the 'AutoKind' element value. Тип автомобиля (заполняется согласно справочнику ATD_KZV.DBF)
     * 
     * @return value
     */
    public String getAutoKind() {
        return autoKind;
    }

    /** 
     * Set the 'AutoKind' element value. Тип автомобиля (заполняется согласно справочнику ATD_KZV.DBF)
     * 
     * @param autoKind
     */
    public void setAutoKind(String autoKind) {
        this.autoKind = autoKind;
    }

    /** 
     * Get the 'EngineVolume' element value. Рабочий объем (из документов) (куб. см)
     * 
     * @return value
     */
    public String getEngineVolume() {
        return engineVolume;
    }

    /** 
     * Set the 'EngineVolume' element value. Рабочий объем (из документов) (куб. см)
     * 
     * @param engineVolume
     */
    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    /** 
     * Get the 'EngineKind' element value. Тип двигателя: "0" - бензин, "1" - дизель, "2" - прочее
     * 
     * @return value
     */
    public String getEngineKind() {
        return engineKind;
    }

    /** 
     * Set the 'EngineKind' element value. Тип двигателя: "0" - бензин, "1" - дизель, "2" - прочее
     * 
     * @param engineKind
     */
    public void setEngineKind(String engineKind) {
        this.engineKind = engineKind;
    }

    /** 
     * Get the 'LightDisk' element value. Количество дисков из легкого сплава: "0" - если нет
     * 
     * @return value
     */
    public String getLightDisk() {
        return lightDisk;
    }

    /** 
     * Set the 'LightDisk' element value. Количество дисков из легкого сплава: "0" - если нет
     * 
     * @param lightDisk
     */
    public void setLightDisk(String lightDisk) {
        this.lightDisk = lightDisk;
    }

    /** 
     * Get the 'GUR' element value. Гидроусилитель руля: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getGUR() {
        return GUR;
    }

    /** 
     * Set the 'GUR' element value. Гидроусилитель руля: "0" - нет, "1" - есть
     * 
     * @param GUR
     */
    public void setGUR(String GUR) {
        this.GUR = GUR;
    }

    /** 
     * Get the 'ElUR' element value. Электроусилитель руля: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getElUR() {
        return elUR;
    }

    /** 
     * Set the 'ElUR' element value. Электроусилитель руля: "0" - нет, "1" - есть
     * 
     * @param elUR
     */
    public void setElUR(String elUR) {
        this.elUR = elUR;
    }

    /** 
     * Get the 'AirBag' element value. Количество подушек безопасности: "0" - если нет
     * 
     * @return value
     */
    public String getAirBag() {
        return airBag;
    }

    /** 
     * Set the 'AirBag' element value. Количество подушек безопасности: "0" - если нет
     * 
     * @param airBag
     */
    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }

    /** 
     * Get the 'ElBackGlass' element value. Электропривод зеркал заднего вида: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getElBackGlass() {
        return elBackGlass;
    }

    /** 
     * Set the 'ElBackGlass' element value. Электропривод зеркал заднего вида: "0" - нет, "1" - есть
     * 
     * @param elBackGlass
     */
    public void setElBackGlass(String elBackGlass) {
        this.elBackGlass = elBackGlass;
    }

    /** 
     * Get the 'ElHeatingGlass' element value. Электроподогрев лобового стекла: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getElHeatingGlass() {
        return elHeatingGlass;
    }

    /** 
     * Set the 'ElHeatingGlass' element value. Электроподогрев лобового стекла: "0" - нет, "1" - есть
     * 
     * @param elHeatingGlass
     */
    public void setElHeatingGlass(String elHeatingGlass) {
        this.elHeatingGlass = elHeatingGlass;
    }

    /** 
     * Get the 'Conditioner' element value. Кондиционер: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getConditioner() {
        return conditioner;
    }

    /** 
     * Set the 'Conditioner' element value. Кондиционер: "0" - нет, "1" - есть
     * 
     * @param conditioner
     */
    public void setConditioner(String conditioner) {
        this.conditioner = conditioner;
    }

    /** 
     * Get the 'Upholstery' element value. Обивка салона (материал)
     * 
     * @return value
     */
    public String getUpholstery() {
        return upholstery;
    }

    /** 
     * Set the 'Upholstery' element value. Обивка салона (материал)
     * 
     * @param upholstery
     */
    public void setUpholstery(String upholstery) {
        this.upholstery = upholstery;
    }

    /** 
     * Get the list of 'SvetDevice' element items. Светотехнические приборы
     * 
     * @return list
     */
    public List<String> getSvetDeviceList() {
        return svetDeviceList;
    }

    /** 
     * Set the list of 'SvetDevice' element items. Светотехнические приборы
     * 
     * @param list
     */
    public void setSvetDeviceList(List<String> list) {
        svetDeviceList = list;
    }

    /** 
     * Get the 'NumberOfHatch' element value. Число люков
     * 
     * @return value
     */
    public String getNumberOfHatch() {
        return numberOfHatch;
    }

    /** 
     * Set the 'NumberOfHatch' element value. Число люков
     * 
     * @param numberOfHatch
     */
    public void setNumberOfHatch(String numberOfHatch) {
        this.numberOfHatch = numberOfHatch;
    }

    /** 
     * Get the 'Telefon' element value. Количество телефонов: "0" - если нет
     * 
     * @return value
     */
    public String getTelefon() {
        return telefon;
    }

    /** 
     * Set the 'Telefon' element value. Количество телефонов: "0" - если нет
     * 
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /** 
     * Get the 'CentrLock' element value. Центральный замок: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getCentrLock() {
        return centrLock;
    }

    /** 
     * Set the 'CentrLock' element value. Центральный замок: "0" - нет, "1" - есть
     * 
     * @param centrLock
     */
    public void setCentrLock(String centrLock) {
        this.centrLock = centrLock;
    }

    /** 
     * Get the 'SalonWindow' element value. Количество окон (для микроавтобуса: "0" - если нет
     * 
     * @return value
     */
    public String getSalonWindow() {
        return salonWindow;
    }

    /** 
     * Set the 'SalonWindow' element value. Количество окон (для микроавтобуса: "0" - если нет
     * 
     * @param salonWindow
     */
    public void setSalonWindow(String salonWindow) {
        this.salonWindow = salonWindow;
    }

    /** 
     * Get the 'DistanceControl' element value. Система поддержания допустимой дистанции: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getDistanceControl() {
        return distanceControl;
    }

    /** 
     * Set the 'DistanceControl' element value. Система поддержания допустимой дистанции: "0" - нет, "1" - есть
     * 
     * @param distanceControl
     */
    public void setDistanceControl(String distanceControl) {
        this.distanceControl = distanceControl;
    }

    /** 
     * Get the 'Parktronic' element value. Электронная система парковки: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getParktronic() {
        return parktronic;
    }

    /** 
     * Set the 'Parktronic' element value. Электронная система парковки: "0" - нет, "1" - есть
     * 
     * @param parktronic
     */
    public void setParktronic(String parktronic) {
        this.parktronic = parktronic;
    }

    /** 
     * Get the 'FireExten' element value. Огнетушитель: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getFireExten() {
        return fireExten;
    }

    /** 
     * Set the 'FireExten' element value. Огнетушитель: "0" - нет, "1" - есть
     * 
     * @param fireExten
     */
    public void setFireExten(String fireExten) {
        this.fireExten = fireExten;
    }

    /** 
     * Get the 'ParkHeating' element value. Система отопления во время стоянки: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getParkHeating() {
        return parkHeating;
    }

    /** 
     * Set the 'ParkHeating' element value. Система отопления во время стоянки: "0" - нет, "1" - есть
     * 
     * @param parkHeating
     */
    public void setParkHeating(String parkHeating) {
        this.parkHeating = parkHeating;
    }

    /** 
     * Get the 'PnevmoDevice' element value. Пневмоподвеска: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getPnevmoDevice() {
        return pnevmoDevice;
    }

    /** 
     * Set the 'PnevmoDevice' element value. Пневмоподвеска: "0" - нет, "1" - есть
     * 
     * @param pnevmoDevice
     */
    public void setPnevmoDevice(String pnevmoDevice) {
        this.pnevmoDevice = pnevmoDevice;
    }

    /** 
     * Get the 'BroneClass' element value. Наличие бронезащиты и ее класс (по результату экспертизы): "0" - если нет
     * 
     * @return value
     */
    public String getBroneClass() {
        return broneClass;
    }

    /** 
     * Set the 'BroneClass' element value. Наличие бронезащиты и ее класс (по результату экспертизы): "0" - если нет
     * 
     * @param broneClass
     */
    public void setBroneClass(String broneClass) {
        this.broneClass = broneClass;
    }

    /** 
     * Get the 'RegCode' element value. Регистрационный знак
     * 
     * @return value
     */
    public String getRegCode() {
        return regCode;
    }

    /** 
     * Set the 'RegCode' element value. Регистрационный знак
     * 
     * @param regCode
     */
    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    /** 
     * Get the list of 'Hatch' element items. Люк
     * 
     * @return list
     */
    public List<HatchType> getHatchList() {
        return hatchList;
    }

    /** 
     * Set the list of 'Hatch' element items. Люк
     * 
     * @param list
     */
    public void setHatchList(List<HatchType> list) {
        hatchList = list;
    }

    /** 
     * Get the 'BodyInf' element value. Кузов
     * 
     * @return value
     */
    public BodyInfType getBodyInf() {
        return bodyInf;
    }

    /** 
     * Set the 'BodyInf' element value. Кузов
     * 
     * @param bodyInf
     */
    public void setBodyInf(BodyInfType bodyInf) {
        this.bodyInf = bodyInf;
    }
}
