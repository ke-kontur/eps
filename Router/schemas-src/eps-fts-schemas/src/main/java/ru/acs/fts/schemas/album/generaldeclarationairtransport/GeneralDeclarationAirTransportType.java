
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.RoutigInfoType;

/** 
 * Генеральная авиа декларация
 */
public class GeneralDeclarationAirTransportType extends BaseDocType
{
    private String languageCode;
    private String carrier;
    private String notice;
    private String foodSetQuantity;
    private String carrierCode;
    private String crewMembersNumber;
    private String routingSign;
    private FlightInfoType flight;
    private PersonSignatureType documentSignature;
    private List<PersonBaseType> cockpitPersonnelList = new ArrayList<PersonBaseType>();
    private AirportType destinationAirport;
    private List<RoutigInfoType> routingInfoList = new ArrayList<RoutigInfoType>();
    private RegistrationType registration;
    private PassengerQuantityType passengerQuantity;
    private FuelInfoType fuelInfo;
    private List<AdditionalInfoType> POLInformationList = new ArrayList<AdditionalInfoType>();
    private List<AdditionalInfoType> weaponInfoList = new ArrayList<AdditionalInfoType>();
    private List<AdditionalInfoType> psychotropicAgentInfoList = new ArrayList<AdditionalInfoType>();
    private MarkType mark;
    private CountryInfoType destinationCountry;
    private CountryInfoType departureCountry;
    private CustomsType customs;
    private SignInOutType signInOut;
    private String documentModeID;

    /** 
     * Get the 'LanguageCode' element value. Код языка документа
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. Код языка документа
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'Carrier' element value. Наименование собственника воздушного судна или перевозчика 
     * 
     * @return value
     */
    public String getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Наименование собственника воздушного судна или перевозчика 
     * 
     * @param carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Notice' element value. Примечание 
     * 
     * @return value
     */
    public String getNotice() {
        return notice;
    }

    /** 
     * Set the 'Notice' element value. Примечание 
     * 
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /** 
     * Get the 'FoodSetQuantity' element value. Количество комплектов питания
     * 
     * @return value
     */
    public String getFoodSetQuantity() {
        return foodSetQuantity;
    }

    /** 
     * Set the 'FoodSetQuantity' element value. Количество комплектов питания
     * 
     * @param foodSetQuantity
     */
    public void setFoodSetQuantity(String foodSetQuantity) {
        this.foodSetQuantity = foodSetQuantity;
    }

    /** 
     * Get the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /** 
     * Get the 'CrewMembersNumber' element value. Количество членов экипажа
     * 
     * @return value
     */
    public String getCrewMembersNumber() {
        return crewMembersNumber;
    }

    /** 
     * Set the 'CrewMembersNumber' element value. Количество членов экипажа
     * 
     * @param crewMembersNumber
     */
    public void setCrewMembersNumber(String crewMembersNumber) {
        this.crewMembersNumber = crewMembersNumber;
    }

    /** 
     * Get the 'RoutingSign' element value. Прилет/Вылет. 1 - прилет; 0 - вылет
     * 
     * @return value
     */
    public String getRoutingSign() {
        return routingSign;
    }

    /** 
     * Set the 'RoutingSign' element value. Прилет/Вылет. 1 - прилет; 0 - вылет
     * 
     * @param routingSign
     */
    public void setRoutingSign(String routingSign) {
        this.routingSign = routingSign;
    }

    /** 
     * Get the 'Flight' element value. Сведения о рейсе 
     * 
     * @return value
     */
    public FlightInfoType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. Сведения о рейсе 
     * 
     * @param flight
     */
    public void setFlight(FlightInfoType flight) {
        this.flight = flight;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись уполномоченного агента или лица командного состава 
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись уполномоченного агента или лица командного состава 
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the list of 'CockpitPersonnel' element items. Информация об экипаже
     * 
     * @return list
     */
    public List<PersonBaseType> getCockpitPersonnelList() {
        return cockpitPersonnelList;
    }

    /** 
     * Set the list of 'CockpitPersonnel' element items. Информация об экипаже
     * 
     * @param list
     */
    public void setCockpitPersonnelList(List<PersonBaseType> list) {
        cockpitPersonnelList = list;
    }

    /** 
     * Get the 'DestinationAirport' element value. Аэропорт назначения
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. Аэропорт назначения
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the list of 'RoutingInfo' element items. Информация о маршруте 
     * 
     * @return list
     */
    public List<RoutigInfoType> getRoutingInfoList() {
        return routingInfoList;
    }

    /** 
     * Set the list of 'RoutingInfo' element items. Информация о маршруте 
     * 
     * @param list
     */
    public void setRoutingInfoList(List<RoutigInfoType> list) {
        routingInfoList = list;
    }

    /** 
     * Get the 'Registration' element value. Сведения о составлении документа
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Сведения о составлении документа
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'PassengerQuantity' element value. Информация о количестве пассажиров
     * 
     * @return value
     */
    public PassengerQuantityType getPassengerQuantity() {
        return passengerQuantity;
    }

    /** 
     * Set the 'PassengerQuantity' element value. Информация о количестве пассажиров
     * 
     * @param passengerQuantity
     */
    public void setPassengerQuantity(PassengerQuantityType passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    /** 
     * Get the 'FuelInfo' element value. Информация о топливе
     * 
     * @return value
     */
    public FuelInfoType getFuelInfo() {
        return fuelInfo;
    }

    /** 
     * Set the 'FuelInfo' element value. Информация о топливе
     * 
     * @param fuelInfo
     */
    public void setFuelInfo(FuelInfoType fuelInfo) {
        this.fuelInfo = fuelInfo;
    }

    /** 
     * Get the list of 'POLInformation' element items. Информация о ГСМ
     * 
     * @return list
     */
    public List<AdditionalInfoType> getPOLInformationList() {
        return POLInformationList;
    }

    /** 
     * Set the list of 'POLInformation' element items. Информация о ГСМ
     * 
     * @param list
     */
    public void setPOLInformationList(List<AdditionalInfoType> list) {
        POLInformationList = list;
    }

    /** 
     * Get the list of 'WeaponInfo' element items. Информация о наличии оружия и военного снаряжения
     * 
     * @return list
     */
    public List<AdditionalInfoType> getWeaponInfoList() {
        return weaponInfoList;
    }

    /** 
     * Set the list of 'WeaponInfo' element items. Информация о наличии оружия и военного снаряжения
     * 
     * @param list
     */
    public void setWeaponInfoList(List<AdditionalInfoType> list) {
        weaponInfoList = list;
    }

    /** 
     * Get the list of 'PsychotropicAgentInfo' element items. Информация о наличии  психотропных  средств
     * 
     * @return list
     */
    public List<AdditionalInfoType> getPsychotropicAgentInfoList() {
        return psychotropicAgentInfoList;
    }

    /** 
     * Set the list of 'PsychotropicAgentInfo' element items. Информация о наличии  психотропных  средств
     * 
     * @param list
     */
    public void setPsychotropicAgentInfoList(List<AdditionalInfoType> list) {
        psychotropicAgentInfoList = list;
    }

    /** 
     * Get the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения
     * 
     * @return value
     */
    public CountryInfoType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInfoType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'DepartureCountry' element value. Страна отправления
     * 
     * @return value
     */
    public CountryInfoType getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. Страна отправления
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(CountryInfoType departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'SignInOut' element value. Признак совершения промежуточной, вынужденной (технической) посадки воздушного судна на территории РФ и на его борту отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @return value
     */
    public SignInOutType getSignInOut() {
        return signInOut;
    }

    /** 
     * Set the 'SignInOut' element value. Признак совершения промежуточной, вынужденной (технической) посадки воздушного судна на территории РФ и на его борту отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @param signInOut
     */
    public void setSignInOut(SignInOutType signInOut) {
        this.signInOut = signInOut;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
