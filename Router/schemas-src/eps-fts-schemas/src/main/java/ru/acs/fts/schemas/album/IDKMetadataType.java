
package ru.acs.fts.schemas.album;

/** 
 * Параметры осмотра
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKMetadataType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:IDKTransportMeansType" name="TransportMeans" minOccurs="0"/>
 *     &lt;xs:element type="ns:IDKOrganizationType" name="Carrier" minOccurs="0"/>
 *     &lt;xs:element type="ns:IDKOrganizationType" name="Principal" minOccurs="0"/>
 *     &lt;xs:element type="ns:IDKShipmentType" name="IDKShipmens" minOccurs="0"/>
 *     &lt;xs:element type="ns:IDKShippingDocumentsType" name="DirectionDocuments" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKMetadataType
{
    private IDKTransportMeansType transportMeans;
    private IDKOrganizationType carrier;
    private IDKOrganizationType principal;
    private IDKShipmentType IDKShipmens;
    private IDKShippingDocumentsType directionDocuments;

    /** 
     * Get the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public IDKTransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @param transportMeans
     */
    public void setTransportMeans(IDKTransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public IDKOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(IDKOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Principal' element value. Принципал
     * 
     * @return value
     */
    public IDKOrganizationType getPrincipal() {
        return principal;
    }

    /** 
     * Set the 'Principal' element value. Принципал
     * 
     * @param principal
     */
    public void setPrincipal(IDKOrganizationType principal) {
        this.principal = principal;
    }

    /** 
     * Get the 'IDKShipmens' element value. Сведения о грузе
     * 
     * @return value
     */
    public IDKShipmentType getIDKShipmens() {
        return IDKShipmens;
    }

    /** 
     * Set the 'IDKShipmens' element value. Сведения о грузе
     * 
     * @param IDKShipmens
     */
    public void setIDKShipmens(IDKShipmentType IDKShipmens) {
        this.IDKShipmens = IDKShipmens;
    }

    /** 
     * Get the 'DirectionDocuments' element value. ТПО, Сопроводительные документы
     * 
     * @return value
     */
    public IDKShippingDocumentsType getDirectionDocuments() {
        return directionDocuments;
    }

    /** 
     * Set the 'DirectionDocuments' element value. ТПО, Сопроводительные документы
     * 
     * @param directionDocuments
     */
    public void setDirectionDocuments(
            IDKShippingDocumentsType directionDocuments) {
        this.directionDocuments = directionDocuments;
    }
}
