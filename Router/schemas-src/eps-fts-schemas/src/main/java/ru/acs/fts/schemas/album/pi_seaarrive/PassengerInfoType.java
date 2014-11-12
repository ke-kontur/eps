
package ru.acs.fts.schemas.album.pi_seaarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о пассажире
 */
public class PassengerInfoType extends PersonBaseType
{
    private String nationality;
    private LocalDate birthDate;
    private String birthPlace;
    private CountryPortInfoType depaturePort;
    private CountryPortInfoType arrivalPort;

    /** 
     * Get the 'Nationality' element value. Гражданство (альфа код страны)
     * 
     * @return value
     */
    public String getNationality() {
        return nationality;
    }

    /** 
     * Set the 'Nationality' element value. Гражданство (альфа код страны)
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /** 
     * Get the 'BirthDate' element value. Дата рождения
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. Дата рождения
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'BirthPlace' element value. Место рождения
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. Место рождения
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Get the 'DepaturePort' element value. Порт посадки
     * 
     * @return value
     */
    public CountryPortInfoType getDepaturePort() {
        return depaturePort;
    }

    /** 
     * Set the 'DepaturePort' element value. Порт посадки
     * 
     * @param depaturePort
     */
    public void setDepaturePort(CountryPortInfoType depaturePort) {
        this.depaturePort = depaturePort;
    }

    /** 
     * Get the 'ArrivalPort' element value. Порт высадки
     * 
     * @return value
     */
    public CountryPortInfoType getArrivalPort() {
        return arrivalPort;
    }

    /** 
     * Set the 'ArrivalPort' element value. Порт высадки
     * 
     * @param arrivalPort
     */
    public void setArrivalPort(CountryPortInfoType arrivalPort) {
        this.arrivalPort = arrivalPort;
    }
}
