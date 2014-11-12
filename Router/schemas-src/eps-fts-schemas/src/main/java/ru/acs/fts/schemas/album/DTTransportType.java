
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о транспортном средстве
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DTTransportType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="TransportModeCode" minOccurs="0"/>
 *     &lt;xs:element name="TransportMeans" minOccurs="0" maxOccurs="unbounded">
 *       &lt;!-- Reference to inner class TransportMeans -->
 *     &lt;/xs:element>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DTTransportType
{
    private String transportModeCode;
    private List<TransportMeans> transportMeanList = new ArrayList<TransportMeans>();

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the list of 'TransportMeans' element items.
     * 
     * @return list
     */
    public List<TransportMeans> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items.
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeans> list) {
        transportMeanList = list;
    }
    /** 
     * Описание транспортного средства
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransportMeans" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="TransportIdentifier" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="TransportMeansNationalityCode" minOccurs="0"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TransportMeans
    {
        private String transportIdentifier;
        private String transportMeansNationalityCode;

        /** 
         * Get the 'TransportIdentifier' element value. Идентификатор. Номер транспортного средства, название судна, номер авиарейса...
         * 
         * @return value
         */
        public String getTransportIdentifier() {
            return transportIdentifier;
        }

        /** 
         * Set the 'TransportIdentifier' element value. Идентификатор. Номер транспортного средства, название судна, номер авиарейса...
         * 
         * @param transportIdentifier
         */
        public void setTransportIdentifier(String transportIdentifier) {
            this.transportIdentifier = transportIdentifier;
        }

        /** 
         * Get the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по классификатору стран мира.
         * 
         * @return value
         */
        public String getTransportMeansNationalityCode() {
            return transportMeansNationalityCode;
        }

        /** 
         * Set the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по классификатору стран мира.
         * 
         * @param transportMeansNationalityCode
         */
        public void setTransportMeansNationalityCode(
                String transportMeansNationalityCode) {
            this.transportMeansNationalityCode = transportMeansNationalityCode;
        }
    }
}
