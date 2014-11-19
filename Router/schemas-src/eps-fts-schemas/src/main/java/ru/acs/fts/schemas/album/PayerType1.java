
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Реквизиты плательщика
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PaymentConfirmDocs:5.4.5" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PayerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:CUOrganizationType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="CardNumber" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PayerType1 extends CUOrganizationType
{
    private String cardNumber;

    /** 
     * Get the 'CardNumber' element value. Номер универсальной электронной карты
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Номер универсальной электронной карты
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
