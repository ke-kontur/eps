
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������� �������� � ���������
 */
public class ContractDeliveryTermsType
{
    private List<String> deliveryPlaceList = new ArrayList<String>();
    private String deliveryTermsNumericCode;
    private String deliveryTermsStringCode;
    private List<String> termsDescriptionList = new ArrayList<String>();
    private List<InvoiceSaleTermsType> invoiceSaleTermList = new ArrayList<InvoiceSaleTermsType>();

    /** 
     * Get the list of 'DeliveryPlace' element items. ������������ ������ ��������
     * 
     * @return list
     */
    public List<String> getDeliveryPlaceList() {
        return deliveryPlaceList;
    }

    /** 
     * Set the list of 'DeliveryPlace' element items. ������������ ������ ��������
     * 
     * @param list
     */
    public void setDeliveryPlaceList(List<String> list) {
        deliveryPlaceList = list;
    }

    /** 
     * Get the 'DeliveryTermsNumericCode' element value. �������� ��� ������� ��������
     * 
     * @return value
     */
    public String getDeliveryTermsNumericCode() {
        return deliveryTermsNumericCode;
    }

    /** 
     * Set the 'DeliveryTermsNumericCode' element value. �������� ��� ������� ��������
     * 
     * @param deliveryTermsNumericCode
     */
    public void setDeliveryTermsNumericCode(String deliveryTermsNumericCode) {
        this.deliveryTermsNumericCode = deliveryTermsNumericCode;
    }

    /** 
     * Get the 'DeliveryTermsStringCode' element value. ��� ������� �������� �� ���������
     * 
     * @return value
     */
    public String getDeliveryTermsStringCode() {
        return deliveryTermsStringCode;
    }

    /** 
     * Set the 'DeliveryTermsStringCode' element value. ��� ������� �������� �� ���������
     * 
     * @param deliveryTermsStringCode
     */
    public void setDeliveryTermsStringCode(String deliveryTermsStringCode) {
        this.deliveryTermsStringCode = deliveryTermsStringCode;
    }

    /** 
     * Get the list of 'TermsDescription' element items. ��������, ����������� �� �������� ��������
     * 
     * @return list
     */
    public List<String> getTermsDescriptionList() {
        return termsDescriptionList;
    }

    /** 
     * Set the list of 'TermsDescription' element items. ��������, ����������� �� �������� ��������
     * 
     * @param list
     */
    public void setTermsDescriptionList(List<String> list) {
        termsDescriptionList = list;
    }

    /** 
     * Get the list of 'InvoiceSaleTerms' element items. ���� ������ �� �������
     * 
     * @return list
     */
    public List<InvoiceSaleTermsType> getInvoiceSaleTermList() {
        return invoiceSaleTermList;
    }

    /** 
     * Set the list of 'InvoiceSaleTerms' element items. ���� ������ �� �������
     * 
     * @param list
     */
    public void setInvoiceSaleTermList(List<InvoiceSaleTermsType> list) {
        invoiceSaleTermList = list;
    }
}
