
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Результаты досмотра седельного тягача (товарная позиция 8701 по ТН ВЭД ТС)
 */
public class AMTInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String highCeiling;
    private PodveskaType podveska;
    private TruckParametersType truckParameters;
    private AMTDopDeviceType AMTDopDevice;
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
     * Get the 'HighCeiling' element value. Наличие высокого потолка: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getHighCeiling() {
        return highCeiling;
    }

    /** 
     * Set the 'HighCeiling' element value. Наличие высокого потолка: "0" - нет, "1" - есть
     * 
     * @param highCeiling
     */
    public void setHighCeiling(String highCeiling) {
        this.highCeiling = highCeiling;
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
     * Get the 'AMTDopDevice' element value. Дополнительное оборудование в тягаче
     * 
     * @return value
     */
    public AMTDopDeviceType getAMTDopDevice() {
        return AMTDopDevice;
    }

    /** 
     * Set the 'AMTDopDevice' element value. Дополнительное оборудование в тягаче
     * 
     * @param AMTDopDevice
     */
    public void setAMTDopDevice(AMTDopDeviceType AMTDopDevice) {
        this.AMTDopDevice = AMTDopDevice;
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
