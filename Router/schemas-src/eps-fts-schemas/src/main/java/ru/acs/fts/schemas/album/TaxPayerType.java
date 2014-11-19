
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о налогоплательщике
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:NotifTobaccoPrices:5.4.5" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaxPayerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CUOrganizationType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:AddressType" name="FactAddress" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaxPayerType extends CUOrganizationType
{
    private AddressType factAddress;

    /** 
     * Get the 'FactAddress' element value. Фактический адрес
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Фактический адрес
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
