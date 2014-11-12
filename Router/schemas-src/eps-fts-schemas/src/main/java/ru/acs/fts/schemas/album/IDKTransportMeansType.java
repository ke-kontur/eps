
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;

/** 
 * Сведения о транспортном средстве
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKTransportMeansType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CUTransportMeansType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="TransportID"/>
 *         &lt;xs:element type="xs:string" name="TransitDirection" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="VIN" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="FirstTrailerNumber" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="SecondTrailerNumber" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="Weight" minOccurs="0"/>
 *         &lt;xs:element type="ns1:IDKDocumentsType" name="TransportDocuments" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="Comments" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKTransportMeansType extends CUTransportMeansType
{
    private String transportID;
    private String transitDirection;
    private String VIN;
    private String firstTrailerNumber;
    private String secondTrailerNumber;
    private String weight;
    private IDKDocumentsType transportDocuments;
    private String comments;

    /** 
     * Get the 'TransportID' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. Регистрационный номер
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'TransitDirection' element value. Направление пермещения: 1 - Импорт, 2 - Экспорт, 3 - Транзит 
     * 
     * @return value
     */
    public String getTransitDirection() {
        return transitDirection;
    }

    /** 
     * Set the 'TransitDirection' element value. Направление пермещения: 1 - Импорт, 2 - Экспорт, 3 - Транзит 
     * 
     * @param transitDirection
     */
    public void setTransitDirection(String transitDirection) {
        this.transitDirection = transitDirection;
    }

    /** 
     * Get the 'VIN' element value. VIN
     * 
     * @return value
     */
    public String getVIN() {
        return VIN;
    }

    /** 
     * Set the 'VIN' element value. VIN
     * 
     * @param VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /** 
     * Get the 'FirstTrailerNumber' element value. Номер первого прицепа
     * 
     * @return value
     */
    public String getFirstTrailerNumber() {
        return firstTrailerNumber;
    }

    /** 
     * Set the 'FirstTrailerNumber' element value. Номер первого прицепа
     * 
     * @param firstTrailerNumber
     */
    public void setFirstTrailerNumber(String firstTrailerNumber) {
        this.firstTrailerNumber = firstTrailerNumber;
    }

    /** 
     * Get the 'SecondTrailerNumber' element value. Номер второго прицепа
     * 
     * @return value
     */
    public String getSecondTrailerNumber() {
        return secondTrailerNumber;
    }

    /** 
     * Set the 'SecondTrailerNumber' element value. Номер второго прицепа
     * 
     * @param secondTrailerNumber
     */
    public void setSecondTrailerNumber(String secondTrailerNumber) {
        this.secondTrailerNumber = secondTrailerNumber;
    }

    /** 
     * Get the 'Weight' element value. Вес автомобиля с товаров, кг. 
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Вес автомобиля с товаров, кг. 
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'TransportDocuments' element value. Сведения о документах
     * 
     * @return value
     */
    public IDKDocumentsType getTransportDocuments() {
        return transportDocuments;
    }

    /** 
     * Set the 'TransportDocuments' element value. Сведения о документах
     * 
     * @param transportDocuments
     */
    public void setTransportDocuments(IDKDocumentsType transportDocuments) {
        this.transportDocuments = transportDocuments;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
