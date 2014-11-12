
package ru.acs.fts.schemas.album;

/** 
 * Сведения о стоимости товара
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKCostType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="InvoiceCost"/>
 *     &lt;xs:element type="xs:string" name="InvoiceCostCurrencyCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKCostType
{
    private String invoiceCost;
    private String invoiceCostCurrencyCode;

    /** 
     * Get the 'InvoiceCost' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. Фактурная стоимость
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(String invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'InvoiceCostCurrencyCode' element value. Код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getInvoiceCostCurrencyCode() {
        return invoiceCostCurrencyCode;
    }

    /** 
     * Set the 'InvoiceCostCurrencyCode' element value. Код валюты фактурной стоимости
     * 
     * @param invoiceCostCurrencyCode
     */
    public void setInvoiceCostCurrencyCode(String invoiceCostCurrencyCode) {
        this.invoiceCostCurrencyCode = invoiceCostCurrencyCode;
    }
}
