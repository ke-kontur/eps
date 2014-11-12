
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Результаты досмотра прицепа, полуприцепа (товарная позиция 8716 по ТН ВЭД ТС)
 */
public class TrailerInspResultsType extends CommonParametersType
{
    private String arriveMode;
    private String skatnost;
    private PodveskaType podveska;
    private CargoPlaceType cargoPlace;
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
     * Get the 'Skatnost' element value. Колеса задних осей: "1" - односкатные, "2" - двускатные
     * 
     * @return value
     */
    public String getSkatnost() {
        return skatnost;
    }

    /** 
     * Set the 'Skatnost' element value. Колеса задних осей: "1" - односкатные, "2" - двускатные
     * 
     * @param skatnost
     */
    public void setSkatnost(String skatnost) {
        this.skatnost = skatnost;
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
