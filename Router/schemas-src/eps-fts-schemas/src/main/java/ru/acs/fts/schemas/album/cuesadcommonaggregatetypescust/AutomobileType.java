
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AutomobileBaseType;

/** 
 * Сведения об автомобилях. Гр. 31
 */
public class AutomobileType extends AutomobileBaseType
{
    private String identityCardNumber;
    private String carCost;
    private String powerWeightQuanity;
    private String passedKilometerQuantity;

    /** 
     * Get the 'IdentityCardNumber' element value. Номер удостоверения
     * 
     * @return value
     */
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    /** 
     * Set the 'IdentityCardNumber' element value. Номер удостоверения
     * 
     * @param identityCardNumber
     */
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    /** 
     * Get the 'CarCost' element value. Стоимость транспортного средства
     * 
     * @return value
     */
    public String getCarCost() {
        return carCost;
    }

    /** 
     * Set the 'CarCost' element value. Стоимость транспортного средства
     * 
     * @param carCost
     */
    public void setCarCost(String carCost) {
        this.carCost = carCost;
    }

    /** 
     * Get the 'PowerWeightQuanity' element value. Примечание: грузоподъемность/мощность
     * 
     * @return value
     */
    public String getPowerWeightQuanity() {
        return powerWeightQuanity;
    }

    /** 
     * Set the 'PowerWeightQuanity' element value. Примечание: грузоподъемность/мощность
     * 
     * @param powerWeightQuanity
     */
    public void setPowerWeightQuanity(String powerWeightQuanity) {
        this.powerWeightQuanity = powerWeightQuanity;
    }

    /** 
     * Get the 'PassedKilometerQuantity' element value. Пробег
     * 
     * @return value
     */
    public String getPassedKilometerQuantity() {
        return passedKilometerQuantity;
    }

    /** 
     * Set the 'PassedKilometerQuantity' element value. Пробег
     * 
     * @param passedKilometerQuantity
     */
    public void setPassedKilometerQuantity(String passedKilometerQuantity) {
        this.passedKilometerQuantity = passedKilometerQuantity;
    }
}
