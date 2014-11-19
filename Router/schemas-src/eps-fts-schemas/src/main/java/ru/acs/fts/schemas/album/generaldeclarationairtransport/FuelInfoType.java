
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * Информация о топливе
 */
public class FuelInfoType
{
    private String fuelQuantity;
    private String fuelQualifierName;
    private String maxFuelQuantity;

    /** 
     * Get the 'FuelQuantity' element value. Количество топлива
     * 
     * @return value
     */
    public String getFuelQuantity() {
        return fuelQuantity;
    }

    /** 
     * Set the 'FuelQuantity' element value. Количество топлива
     * 
     * @param fuelQuantity
     */
    public void setFuelQuantity(String fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    /** 
     * Get the 'FuelQualifierName' element value. Наименование единицы измерения топлива
     * 
     * @return value
     */
    public String getFuelQualifierName() {
        return fuelQualifierName;
    }

    /** 
     * Set the 'FuelQualifierName' element value. Наименование единицы измерения топлива
     * 
     * @param fuelQualifierName
     */
    public void setFuelQualifierName(String fuelQualifierName) {
        this.fuelQualifierName = fuelQualifierName;
    }

    /** 
     * Get the 'MaxFuelQuantity' element value. Максимальная вместимость топлива
     * 
     * @return value
     */
    public String getMaxFuelQuantity() {
        return maxFuelQuantity;
    }

    /** 
     * Set the 'MaxFuelQuantity' element value. Максимальная вместимость топлива
     * 
     * @param maxFuelQuantity
     */
    public void setMaxFuelQuantity(String maxFuelQuantity) {
        this.maxFuelQuantity = maxFuelQuantity;
    }
}
