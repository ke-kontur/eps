
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Описание условий поставки
 */
public class PackingListDeliveryTermsType
{
    private List<String> deliveryPlaceList = new ArrayList<String>();
    private String deliveryTermsNumericCode;
    private String deliveryTermsStringCode;
    private String termsDescription;
    private DocumentBaseType contract;
    private DocumentBaseType invoice;
    private DocumentBaseType registration;

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
     * Get the 'TermsDescription' element value. Описание, комментарии по условиям поставки
     * 
     * @return value
     */
    public String getTermsDescription() {
        return termsDescription;
    }

    /** 
     * Set the 'TermsDescription' element value. Описание, комментарии по условиям поставки
     * 
     * @param termsDescription
     */
    public void setTermsDescription(String termsDescription) {
        this.termsDescription = termsDescription;
    }

    /** 
     * Get the 'Contract' element value. Дата и номер контракта, к которому относится упаковочный лист.
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Дата и номер контракта, к которому относится упаковочный лист.
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Invoice' element value. Дата и номер инвойса, к которому выдан упаковочный лист. 
     * 
     * @return value
     */
    public DocumentBaseType getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. Дата и номер инвойса, к которому выдан упаковочный лист. 
     * 
     * @param invoice
     */
    public void setInvoice(DocumentBaseType invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'Registration' element value. Дата и номер упаковочного листа.
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Дата и номер упаковочного листа.
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }
}
