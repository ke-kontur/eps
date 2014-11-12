
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Результаты досмотра грузового автомобиля (товарная позиция 8704 по ТН ВЭД ТС)
 */
public class TruckInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String duoCabPresence;
    private TruckParametersType truckParameters;
    private CargoPlaceType cargoPlace;
    private TruckDopDeviceType truckDopDevice;
    private PodveskaType podveska;
    private DamagesType damages;

    /** 
     * Get the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }

    /** 
     * Get the 'DuoCabPresence' element value. Наличие сдвоенной кабины: "0" - нет, "1" - да
     * 
     * @return value
     */
    public String getDuoCabPresence() {
        return duoCabPresence;
    }

    /** 
     * Set the 'DuoCabPresence' element value. Наличие сдвоенной кабины: "0" - нет, "1" - да
     * 
     * @param duoCabPresence
     */
    public void setDuoCabPresence(String duoCabPresence) {
        this.duoCabPresence = duoCabPresence;
    }

    /** 
     * Get the 'TruckParameters' element value. Параметры, присущие тягачам и грузовикам
     * 
     * @return value
     */
    public TruckParametersType getTruckParameters() {
        return truckParameters;
    }

    /** 
     * Set the 'TruckParameters' element value. Параметры, присущие тягачам и грузовикам
     * 
     * @param truckParameters
     */
    public void setTruckParameters(TruckParametersType truckParameters) {
        this.truckParameters = truckParameters;
    }

    /** 
     * Get the 'CargoPlace' element value. Характеристика грузового места
     * 
     * @return value
     */
    public CargoPlaceType getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. Характеристика грузового места
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(CargoPlaceType cargoPlace) {
        this.cargoPlace = cargoPlace;
    }

    /** 
     * Get the 'TruckDopDevice' element value. Дополнительное оборудование в грузовом автомобиле
     * 
     * @return value
     */
    public TruckDopDeviceType getTruckDopDevice() {
        return truckDopDevice;
    }

    /** 
     * Set the 'TruckDopDevice' element value. Дополнительное оборудование в грузовом автомобиле
     * 
     * @param truckDopDevice
     */
    public void setTruckDopDevice(TruckDopDeviceType truckDopDevice) {
        this.truckDopDevice = truckDopDevice;
    }

    /** 
     * Get the 'Podveska' element value. Подвеска колес
     * 
     * @return value
     */
    public PodveskaType getPodveska() {
        return podveska;
    }

    /** 
     * Set the 'Podveska' element value. Подвеска колес
     * 
     * @param podveska
     */
    public void setPodveska(PodveskaType podveska) {
        this.podveska = podveska;
    }

    /** 
     * Get the 'Damages' element value.
     * 
     * @return value
     */
    public DamagesType getDamages() {
        return damages;
    }

    /** 
     * Set the 'Damages' element value.
     * 
     * @param damages
     */
    public void setDamages(DamagesType damages) {
        this.damages = damages;
    }
}
