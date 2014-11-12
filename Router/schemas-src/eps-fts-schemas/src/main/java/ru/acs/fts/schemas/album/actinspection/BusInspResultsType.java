
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Результаты досмотра автобуса (товарная позиция 8702 по ТН ВЭД ТС)
 */
public class BusInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String seatPlaceNumber;
    private String standPlaceNumber;
    private String passPlaceNumber;
    private String lengthm;
    private String widthm;
    private String heightm;
    private String solarBatPresence;
    private String luggBoxNumber;
    private String luggBoxVolume;
    private String numberOfStore;
    private String seatKind;
    private String windowKind;
    private String passDoorNumber;
    private String driverCabDividingWall;
    private PodveskaType podveska;
    private BusDopDeviceType busDopDevice;
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
     * Get the 'SeatPlaceNumber' element value. Число мест для сидения
     * 
     * @return value
     */
    public String getSeatPlaceNumber() {
        return seatPlaceNumber;
    }

    /** 
     * Set the 'SeatPlaceNumber' element value. Число мест для сидения
     * 
     * @param seatPlaceNumber
     */
    public void setSeatPlaceNumber(String seatPlaceNumber) {
        this.seatPlaceNumber = seatPlaceNumber;
    }

    /** 
     * Get the 'StandPlaceNumber' element value. Число мест для стояния
     * 
     * @return value
     */
    public String getStandPlaceNumber() {
        return standPlaceNumber;
    }

    /** 
     * Set the 'StandPlaceNumber' element value. Число мест для стояния
     * 
     * @param standPlaceNumber
     */
    public void setStandPlaceNumber(String standPlaceNumber) {
        this.standPlaceNumber = standPlaceNumber;
    }

    /** 
     * Get the 'PassPlaceNumber' element value. Общее число мест, включая водителя
     * 
     * @return value
     */
    public String getPassPlaceNumber() {
        return passPlaceNumber;
    }

    /** 
     * Set the 'PassPlaceNumber' element value. Общее число мест, включая водителя
     * 
     * @param passPlaceNumber
     */
    public void setPassPlaceNumber(String passPlaceNumber) {
        this.passPlaceNumber = passPlaceNumber;
    }

    /** 
     * Get the 'Lengthm' element value. Длина, м
     * 
     * @return value
     */
    public String getLengthm() {
        return lengthm;
    }

    /** 
     * Set the 'Lengthm' element value. Длина, м
     * 
     * @param lengthm
     */
    public void setLengthm(String lengthm) {
        this.lengthm = lengthm;
    }

    /** 
     * Get the 'Widthm' element value. Ширина (без зеркал заднего вида), м
     * 
     * @return value
     */
    public String getWidthm() {
        return widthm;
    }

    /** 
     * Set the 'Widthm' element value. Ширина (без зеркал заднего вида), м
     * 
     * @param widthm
     */
    public void setWidthm(String widthm) {
        this.widthm = widthm;
    }

    /** 
     * Get the 'Heightm' element value. Высота (без климатической установки или топливных баков для газового топлива), м
     * 
     * @return value
     */
    public String getHeightm() {
        return heightm;
    }

    /** 
     * Set the 'Heightm' element value. Высота (без климатической установки или топливных баков для газового топлива), м
     * 
     * @param heightm
     */
    public void setHeightm(String heightm) {
        this.heightm = heightm;
    }

    /** 
     * Get the 'SolarBatPresence' element value. Наличие солнечных двухсекционных батарей: "0" - нет, "1" - да
     * 
     * @return value
     */
    public String getSolarBatPresence() {
        return solarBatPresence;
    }

    /** 
     * Set the 'SolarBatPresence' element value. Наличие солнечных двухсекционных батарей: "0" - нет, "1" - да
     * 
     * @param solarBatPresence
     */
    public void setSolarBatPresence(String solarBatPresence) {
        this.solarBatPresence = solarBatPresence;
    }

    /** 
     * Get the 'LuggBoxNumber' element value. Количество багажных (грузовых) отсеков
     * 
     * @return value
     */
    public String getLuggBoxNumber() {
        return luggBoxNumber;
    }

    /** 
     * Set the 'LuggBoxNumber' element value. Количество багажных (грузовых) отсеков
     * 
     * @param luggBoxNumber
     */
    public void setLuggBoxNumber(String luggBoxNumber) {
        this.luggBoxNumber = luggBoxNumber;
    }

    /** 
     * Get the 'LuggBoxVolume' element value. Общий объем багажных (грузовых) отсеков в кубических метрах
     * 
     * @return value
     */
    public String getLuggBoxVolume() {
        return luggBoxVolume;
    }

    /** 
     * Set the 'LuggBoxVolume' element value. Общий объем багажных (грузовых) отсеков в кубических метрах
     * 
     * @param luggBoxVolume
     */
    public void setLuggBoxVolume(String luggBoxVolume) {
        this.luggBoxVolume = luggBoxVolume;
    }

    /** 
     * Get the 'NumberOfStore' element value. Этажность
     * 
     * @return value
     */
    public String getNumberOfStore() {
        return numberOfStore;
    }

    /** 
     * Set the 'NumberOfStore' element value. Этажность
     * 
     * @param numberOfStore
     */
    public void setNumberOfStore(String numberOfStore) {
        this.numberOfStore = numberOfStore;
    }

    /** 
     * Get the 'SeatKind' element value. Тип кресел: "1" - мягкие, "2" - жесткие, "3" - с откидной спинкой
     * 
     * @return value
     */
    public String getSeatKind() {
        return seatKind;
    }

    /** 
     * Set the 'SeatKind' element value. Тип кресел: "1" - мягкие, "2" - жесткие, "3" - с откидной спинкой
     * 
     * @param seatKind
     */
    public void setSeatKind(String seatKind) {
        this.seatKind = seatKind;
    }

    /** 
     * Get the 'WindowKind' element value. Тип остекления салона: "0" - без остекления, "1" - одинарные стекла, "2" - двойной стеклопакет, "3" - тройной стеклопакет
     * 
     * @return value
     */
    public String getWindowKind() {
        return windowKind;
    }

    /** 
     * Set the 'WindowKind' element value. Тип остекления салона: "0" - без остекления, "1" - одинарные стекла, "2" - двойной стеклопакет, "3" - тройной стеклопакет
     * 
     * @param windowKind
     */
    public void setWindowKind(String windowKind) {
        this.windowKind = windowKind;
    }

    /** 
     * Get the 'PassDoorNumber' element value. Количество дверей для пассажиров
     * 
     * @return value
     */
    public String getPassDoorNumber() {
        return passDoorNumber;
    }

    /** 
     * Set the 'PassDoorNumber' element value. Количество дверей для пассажиров
     * 
     * @param passDoorNumber
     */
    public void setPassDoorNumber(String passDoorNumber) {
        this.passDoorNumber = passDoorNumber;
    }

    /** 
     * Get the 'DriverCabDividingWall' element value. Перегородка, отделяющая место водителя
     * 
     * @return value
     */
    public String getDriverCabDividingWall() {
        return driverCabDividingWall;
    }

    /** 
     * Set the 'DriverCabDividingWall' element value. Перегородка, отделяющая место водителя
     * 
     * @param driverCabDividingWall
     */
    public void setDriverCabDividingWall(String driverCabDividingWall) {
        this.driverCabDividingWall = driverCabDividingWall;
    }

    /** 
     * Get the 'Podveska' element value. Тип подвески
     * 
     * @return value
     */
    public PodveskaType getPodveska() {
        return podveska;
    }

    /** 
     * Set the 'Podveska' element value. Тип подвески
     * 
     * @param podveska
     */
    public void setPodveska(PodveskaType podveska) {
        this.podveska = podveska;
    }

    /** 
     * Get the 'BusDopDevice' element value. Дополнительное оборудование в автобусе
     * 
     * @return value
     */
    public BusDopDeviceType getBusDopDevice() {
        return busDopDevice;
    }

    /** 
     * Set the 'BusDopDevice' element value. Дополнительное оборудование в автобусе
     * 
     * @param busDopDevice
     */
    public void setBusDopDevice(BusDopDeviceType busDopDevice) {
        this.busDopDevice = busDopDevice;
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
