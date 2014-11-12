
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание условий поставки в контракте
 */
public class ContractDeliveryTermsType
{
    private List<String> deliveryPlaceList = new ArrayList<String>();
    private String deliveryTermsNumericCode;
    private String deliveryTermsStringCode;
    private List<String> termsDescriptionList = new ArrayList<String>();
    private List<InvoiceSaleTermsType> invoiceSaleTermList = new ArrayList<InvoiceSaleTermsType>();

    /** 
     * Get the list of 'DeliveryPlace' element items. Наименование пункта поставки
     * 
     * @return list
     */
    public List<String> getDeliveryPlaceList() {
        return deliveryPlaceList;
    }

    /** 
     * Set the list of 'DeliveryPlace' element items. Наименование пункта поставки
     * 
     * @param list
     */
    public void setDeliveryPlaceList(List<String> list) {
        deliveryPlaceList = list;
    }

    /** 
     * Get the 'DeliveryTermsNumericCode' element value. Числовой код условий поставки
     * 
     * @return value
     */
    public String getDeliveryTermsNumericCode() {
        return deliveryTermsNumericCode;
    }

    /** 
     * Set the 'DeliveryTermsNumericCode' element value. Числовой код условий поставки
     * 
     * @param deliveryTermsNumericCode
     */
    public void setDeliveryTermsNumericCode(String deliveryTermsNumericCode) {
        this.deliveryTermsNumericCode = deliveryTermsNumericCode;
    }

    /** 
     * Get the 'DeliveryTermsStringCode' element value. Код условий поставки по Инкотермс
     * 
     * @return value
     */
    public String getDeliveryTermsStringCode() {
        return deliveryTermsStringCode;
    }

    /** 
     * Set the 'DeliveryTermsStringCode' element value. Код условий поставки по Инкотермс
     * 
     * @param deliveryTermsStringCode
     */
    public void setDeliveryTermsStringCode(String deliveryTermsStringCode) {
        this.deliveryTermsStringCode = deliveryTermsStringCode;
    }

    /** 
     * Get the list of 'TermsDescription' element items. Описание, комментарии по условиям поставки
     * 
     * @return list
     */
    public List<String> getTermsDescriptionList() {
        return termsDescriptionList;
    }

    /** 
     * Set the list of 'TermsDescription' element items. Описание, комментарии по условиям поставки
     * 
     * @param list
     */
    public void setTermsDescriptionList(List<String> list) {
        termsDescriptionList = list;
    }

    /** 
     * Get the list of 'InvoiceSaleTerms' element items. Срок оплаты по инвойсу
     * 
     * @return list
     */
    public List<InvoiceSaleTermsType> getInvoiceSaleTermList() {
        return invoiceSaleTermList;
    }

    /** 
     * Set the list of 'InvoiceSaleTerms' element items. Срок оплаты по инвойсу
     * 
     * @param list
     */
    public void setInvoiceSaleTermList(List<InvoiceSaleTermsType> list) {
        invoiceSaleTermList = list;
    }
}
