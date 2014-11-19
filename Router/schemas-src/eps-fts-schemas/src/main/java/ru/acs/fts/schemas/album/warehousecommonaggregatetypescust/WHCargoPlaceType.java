
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания грузовых мест товара
 */
public class WHCargoPlaceType
{
    private String placeNumber;
    private String packageCode;
    private String placeDescription;

    /** 
     * Get the 'PlaceNumber' element value. Количество грузовых мест
     * 
     * @return value
     */
    public String getPlaceNumber() {
        return placeNumber;
    }

    /** 
     * Set the 'PlaceNumber' element value. Количество грузовых мест
     * 
     * @param placeNumber
     */
    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    /** 
     * Get the 'PackageCode' element value. Код вида упаковки (груза)
     * 
     * @return value
     */
    public String getPackageCode() {
        return packageCode;
    }

    /** 
     * Set the 'PackageCode' element value. Код вида упаковки (груза)
     * 
     * @param packageCode
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    /** 
     * Get the 'PlaceDescription' element value. Вид  грузовых  мест - описание
     * 
     * @return value
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /** 
     * Set the 'PlaceDescription' element value. Вид  грузовых  мест - описание
     * 
     * @param placeDescription
     */
    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }
}
