
package ru.acs.fts.schemas.album.declarationcrew;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Декларация о личных вещах экипажа
 */
public class DeclarationCrewType extends BaseDocType
{
    private String shipName;
    private String nationalityVessel;
    private List<String> subjectList = new ArrayList<String>();
    private String arrivalPort;
    private String departurePort;
    private List<PersonSignatureType> personSignatureList = new ArrayList<PersonSignatureType>();
    private PersonSignatureType captainSignature;
    private String documentModeID;

    /** 
     * Get the 'ShipName' element value. Название судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Название судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'NationalityVessel' element value. Национальная принадлежность судна
     * 
     * @return value
     */
    public String getNationalityVessel() {
        return nationalityVessel;
    }

    /** 
     * Set the 'NationalityVessel' element value. Национальная принадлежность судна
     * 
     * @param nationalityVessel
     */
    public void setNationalityVessel(String nationalityVessel) {
        this.nationalityVessel = nationalityVessel;
    }

    /** 
     * Get the list of 'Subject' element items. Предметы, которые подлежат или подтверждению на запрещение, или ограничению 
     * 
     * @return list
     */
    public List<String> getSubjectList() {
        return subjectList;
    }

    /** 
     * Set the list of 'Subject' element items. Предметы, которые подлежат или подтверждению на запрещение, или ограничению 
     * 
     * @param list
     */
    public void setSubjectList(List<String> list) {
        subjectList = list;
    }

    /** 
     * Get the 'ArrivalPort' element value. Порт прихода
     * 
     * @return value
     */
    public String getArrivalPort() {
        return arrivalPort;
    }

    /** 
     * Set the 'ArrivalPort' element value. Порт прихода
     * 
     * @param arrivalPort
     */
    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    /** 
     * Get the 'DeparturePort' element value. Порт отхода 
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. Порт отхода 
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the list of 'PersonSignature' element items. Подписи экипажа
     * 
     * @return list
     */
    public List<PersonSignatureType> getPersonSignatureList() {
        return personSignatureList;
    }

    /** 
     * Set the list of 'PersonSignature' element items. Подписи экипажа
     * 
     * @param list
     */
    public void setPersonSignatureList(List<PersonSignatureType> list) {
        personSignatureList = list;
    }

    /** 
     * Get the 'CaptainSignature' element value. Подпись капитана, уполномоченного агента или лица командного состава.
     * 
     * @return value
     */
    public PersonSignatureType getCaptainSignature() {
        return captainSignature;
    }

    /** 
     * Set the 'CaptainSignature' element value. Подпись капитана, уполномоченного агента или лица командного состава.
     * 
     * @param captainSignature
     */
    public void setCaptainSignature(PersonSignatureType captainSignature) {
        this.captainSignature = captainSignature;
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
