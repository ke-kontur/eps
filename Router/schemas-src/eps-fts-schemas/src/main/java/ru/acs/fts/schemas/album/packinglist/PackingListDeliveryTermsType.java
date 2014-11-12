
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ������� ��������
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
     * Get the 'TermsDescription' element value. ��������, ����������� �� �������� ��������
     * 
     * @return value
     */
    public String getTermsDescription() {
        return termsDescription;
    }

    /** 
     * Set the 'TermsDescription' element value. ��������, ����������� �� �������� ��������
     * 
     * @param termsDescription
     */
    public void setTermsDescription(String termsDescription) {
        this.termsDescription = termsDescription;
    }

    /** 
     * Get the 'Contract' element value. ���� � ����� ���������, � �������� ��������� ����������� ����.
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ���� � ����� ���������, � �������� ��������� ����������� ����.
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Invoice' element value. ���� � ����� �������, � �������� ����� ����������� ����. 
     * 
     * @return value
     */
    public DocumentBaseType getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. ���� � ����� �������, � �������� ����� ����������� ����. 
     * 
     * @param invoice
     */
    public void setInvoice(DocumentBaseType invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'Registration' element value. ���� � ����� ������������ �����.
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ���� � ����� ������������ �����.
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }
}
