
package ru.acs.fts.schemas.album.passengermanifest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * Информация о пассажире
 */
public class PassengerInfoType
{
    private String sex;
    private String seatNumber;
    private String personName;
    private String placesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private LuggageTagType luggageTag;
    private String comment;
    private String passClass;
    private LocalDate birthDate;
    private String birthPlace;
    private String nationality;
    private String departurePort;
    private String destinationPort;
    private AirportType destinationAirport;
    private IdentityCardType identityCard;
    private AirportType departureAirport;

    /** 
     * Get the 'Sex' element value. Пол
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. Пол
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'SeatNumber' element value. Номер места
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'SeatNumber' element value. Номер места
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the 'PersonName' element value. ФИО пассажира
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО пассажира
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Количество мест багажа
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Количество мест багажа
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. Код измерения веса багажа (килограммы или фунты)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. Код измерения веса багажа (килограммы или фунты)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес багажа брутто
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес багажа брутто
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'LuggageTag' element value. Багажные бирки пассажира
     * 
     * @return value
     */
    public LuggageTagType getLuggageTag() {
        return luggageTag;
    }

    /** 
     * Set the 'LuggageTag' element value. Багажные бирки пассажира
     * 
     * @param luggageTag
     */
    public void setLuggageTag(LuggageTagType luggageTag) {
        this.luggageTag = luggageTag;
    }

    /** 
     * Get the 'Comment' element value. Примечание
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Примечание
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'PassClass' element value. Класс места
     * 
     * @return value
     */
    public String getPassClass() {
        return passClass;
    }

    /** 
     * Set the 'PassClass' element value. Класс места
     * 
     * @param passClass
     */
    public void setPassClass(String passClass) {
        this.passClass = passClass;
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
     * Get the 'DeparturePort' element value. Порт посадки пассажира
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. Порт посадки пассажира
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the 'DestinationPort' element value. Порт высадки пассажира
     * 
     * @return value
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /** 
     * Set the 'DestinationPort' element value. Порт высадки пассажира
     * 
     * @param destinationPort
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /** 
     * Get the 'DestinationAirport' element value. Аэропорт назначения пассажира
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. Аэропорт назначения пассажира
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'DepartureAirport' element value. Аэропорт отправления пассажира
     * 
     * @return value
     */
    public AirportType getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. Аэропорт отправления пассажира
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(AirportType departureAirport) {
        this.departureAirport = departureAirport;
    }
}
