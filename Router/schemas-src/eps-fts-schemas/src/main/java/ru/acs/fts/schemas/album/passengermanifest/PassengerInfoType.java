
package ru.acs.fts.schemas.album.passengermanifest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * ���������� � ���������
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
     * Get the 'Sex' element value. ���
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. ���
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'SeatNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /** 
     * Set the 'SeatNumber' element value. ����� �����
     * 
     * @param seatNumber
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    /** 
     * Get the 'PersonName' element value. ��� ���������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ���������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. ���������� ���� ������
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. ��� ��������� ���� ������ (���������� ��� �����)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ ������
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ ������
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'LuggageTag' element value. �������� ����� ���������
     * 
     * @return value
     */
    public LuggageTagType getLuggageTag() {
        return luggageTag;
    }

    /** 
     * Set the 'LuggageTag' element value. �������� ����� ���������
     * 
     * @param luggageTag
     */
    public void setLuggageTag(LuggageTagType luggageTag) {
        this.luggageTag = luggageTag;
    }

    /** 
     * Get the 'Comment' element value. ����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. ����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'PassClass' element value. ����� �����
     * 
     * @return value
     */
    public String getPassClass() {
        return passClass;
    }

    /** 
     * Set the 'PassClass' element value. ����� �����
     * 
     * @param passClass
     */
    public void setPassClass(String passClass) {
        this.passClass = passClass;
    }

    /** 
     * Get the 'BirthDate' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. ���� ��������
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'BirthPlace' element value. ����� ��������
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. ����� ��������
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Get the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @return value
     */
    public String getNationality() {
        return nationality;
    }

    /** 
     * Set the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /** 
     * Get the 'DeparturePort' element value. ���� ������� ���������
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. ���� ������� ���������
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the 'DestinationPort' element value. ���� ������� ���������
     * 
     * @return value
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /** 
     * Set the 'DestinationPort' element value. ���� ������� ���������
     * 
     * @param destinationPort
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /** 
     * Get the 'DestinationAirport' element value. �������� ���������� ���������
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ���������� ���������
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the 'IdentityCard' element value. �������� �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. �������� �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'DepartureAirport' element value. �������� ����������� ���������
     * 
     * @return value
     */
    public AirportType getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. �������� ����������� ���������
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(AirportType departureAirport) {
        this.departureAirport = departureAirport;
    }
}
