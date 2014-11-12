
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Характеристика грузового места
 */
public class CargoPlaceType
{
    private String cargoPlaceKind;
    private String lengthm;
    private String widthm;
    private String heightm;

    /** 
     * Get the 'CargoPlaceKind' element value. Тип грузового места: "1" - платформа, "2" - бортовая платформа с тентом, "3" - самосвал - односторонняя разгрузка, "4" - самосвал - двухсторонняя разгрузка, "5" - самосвал - трехсторонняя разгрузка, "6" - цистерна, "7" - термо-цистерна, "8" - крытый фургон, "9" - изотермический фургон, "10" - рефрижераторный фургон, "11" - пассажирский кунг, "12" - грузопассажирский фургон вагонной компоновки, "13" - другое
     * 
     * @return value
     */
    public String getCargoPlaceKind() {
        return cargoPlaceKind;
    }

    /** 
     * Set the 'CargoPlaceKind' element value. Тип грузового места: "1" - платформа, "2" - бортовая платформа с тентом, "3" - самосвал - односторонняя разгрузка, "4" - самосвал - двухсторонняя разгрузка, "5" - самосвал - трехсторонняя разгрузка, "6" - цистерна, "7" - термо-цистерна, "8" - крытый фургон, "9" - изотермический фургон, "10" - рефрижераторный фургон, "11" - пассажирский кунг, "12" - грузопассажирский фургон вагонной компоновки, "13" - другое
     * 
     * @param cargoPlaceKind
     */
    public void setCargoPlaceKind(String cargoPlaceKind) {
        this.cargoPlaceKind = cargoPlaceKind;
    }

    /** 
     * Get the 'Lengthm' element value. Длина грузовой площадки платформы, м
     * 
     * @return value
     */
    public String getLengthm() {
        return lengthm;
    }

    /** 
     * Set the 'Lengthm' element value. Длина грузовой площадки платформы, м
     * 
     * @param lengthm
     */
    public void setLengthm(String lengthm) {
        this.lengthm = lengthm;
    }

    /** 
     * Get the 'Widthm' element value. Ширина грузовой площадки платформы, м
     * 
     * @return value
     */
    public String getWidthm() {
        return widthm;
    }

    /** 
     * Set the 'Widthm' element value. Ширина грузовой площадки платформы, м
     * 
     * @param widthm
     */
    public void setWidthm(String widthm) {
        this.widthm = widthm;
    }

    /** 
     * Get the 'Heightm' element value. Высота грузового отсека фургона, м
     * 
     * @return value
     */
    public String getHeightm() {
        return heightm;
    }

    /** 
     * Set the 'Heightm' element value. Высота грузового отсека фургона, м
     * 
     * @param heightm
     */
    public void setHeightm(String heightm) {
        this.heightm = heightm;
    }
}
