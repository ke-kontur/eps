
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PayCustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Реквизиты получателя
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CommercialFinanceDocuments:CommercialFinanceCommonAgregateTypesCust:5.4.0" xmlns:ns2="urn:customs.ru:Information:ExchangeDocuments:PayerReceipt:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PayeeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:PayCustomerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="ns:AddressType" name="Address" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PayeeType extends PayCustomerType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
