
package ru.acs.fts.schemas.album;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о регистрации ведений из направления на осмотр
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:DirectionRegistration:5.1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DirectionRegistrationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:date" name="RegistrationDate"/>
 *         &lt;xs:element type="xs:string" name="RegistrationTime"/>
 *         &lt;xs:element type="xs:string" name="DirectionID"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1010004E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DirectionRegistrationType extends BaseDocType
{
    private LocalDate registrationDate;
    private String registrationTime;
    private String directionID;
    private String documentModeID;

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации направления
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации направления
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationTime' element value. Время регистрации  направления
     * 
     * @return value
     */
    public String getRegistrationTime() {
        return registrationTime;
    }

    /** 
     * Set the 'RegistrationTime' element value. Время регистрации  направления
     * 
     * @param registrationTime
     */
    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    /** 
     * Get the 'DirectionID' element value. Регистрационный номер направления
     * 
     * @return value
     */
    public String getDirectionID() {
        return directionID;
    }

    /** 
     * Set the 'DirectionID' element value. Регистрационный номер направления
     * 
     * @param directionID
     */
    public void setDirectionID(String directionID) {
        this.directionID = directionID;
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
