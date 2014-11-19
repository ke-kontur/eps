
package ru.acs.fts.schemas.album.shippingmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения об автомобиле 
 */
public class VehicleType
{
    private String type;
    private String make;
    private String registrationNumber;
    private String trailerRegistrationNumber;
    private String secondTrailerRegistrationNumber;
    private OrganizationBaseType owner;
    private CheckPointType start;
    private CheckPointType finish;

    /** 
     * Get the 'Type' element value. Тип 
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип 
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Make' element value. Марка автомобиля 
     * 
     * @return value
     */
    public String getMake() {
        return make;
    }

    /** 
     * Set the 'Make' element value. Марка автомобиля 
     * 
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер автомобиля 
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер автомобиля 
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'TrailerRegistrationNumber' element value. Регистрационный номер прицепа 
     * 
     * @return value
     */
    public String getTrailerRegistrationNumber() {
        return trailerRegistrationNumber;
    }

    /** 
     * Set the 'TrailerRegistrationNumber' element value. Регистрационный номер прицепа 
     * 
     * @param trailerRegistrationNumber
     */
    public void setTrailerRegistrationNumber(String trailerRegistrationNumber) {
        this.trailerRegistrationNumber = trailerRegistrationNumber;
    }

    /** 
     * Get the 'SecondTrailerRegistrationNumber' element value. Регистрационный номер второго прицепа 
     * 
     * @return value
     */
    public String getSecondTrailerRegistrationNumber() {
        return secondTrailerRegistrationNumber;
    }

    /** 
     * Set the 'SecondTrailerRegistrationNumber' element value. Регистрационный номер второго прицепа 
     * 
     * @param secondTrailerRegistrationNumber
     */
    public void setSecondTrailerRegistrationNumber(
            String secondTrailerRegistrationNumber) {
        this.secondTrailerRegistrationNumber = secondTrailerRegistrationNumber;
    }

    /** 
     * Get the 'Owner' element value. Реквизиты организации 
     * 
     * @return value
     */
    public OrganizationBaseType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. Реквизиты организации 
     * 
     * @param owner
     */
    public void setOwner(OrganizationBaseType owner) {
        this.owner = owner;
    }

    /** 
     * Get the 'Start' element value. Показания одометра (полные км пробега) при выезде транспортного средства из гаража (депо)
     * 
     * @return value
     */
    public CheckPointType getStart() {
        return start;
    }

    /** 
     * Set the 'Start' element value. Показания одометра (полные км пробега) при выезде транспортного средства из гаража (депо)
     * 
     * @param start
     */
    public void setStart(CheckPointType start) {
        this.start = start;
    }

    /** 
     * Get the 'Finish' element value. Показания одометра (полные км пробега) при заезде транспортного средства в гараж (депо)
     * 
     * @return value
     */
    public CheckPointType getFinish() {
        return finish;
    }

    /** 
     * Set the 'Finish' element value. Показания одометра (полные км пробега) при заезде транспортного средства в гараж (депо)
     * 
     * @param finish
     */
    public void setFinish(CheckPointType finish) {
        this.finish = finish;
    }
}
