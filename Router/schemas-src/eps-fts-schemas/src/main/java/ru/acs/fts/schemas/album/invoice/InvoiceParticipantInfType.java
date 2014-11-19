
package ru.acs.fts.schemas.album.invoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.InvoiceParticipantType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PaymentRequisitionsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �� ���������� ������ ��  �����-������� (�������� ��� ����������)
 */
public class InvoiceParticipantInfType extends InvoiceParticipantType
{
    private List<PaymentRequisitionsType> paymentRequisitionList = new ArrayList<PaymentRequisitionsType>();
    private AddressType postalAddress;

    /** 
     * Get the list of 'PaymentRequisitions' element items. ��������� ��������� �����������
     * 
     * @return list
     */
    public List<PaymentRequisitionsType> getPaymentRequisitionList() {
        return paymentRequisitionList;
    }

    /** 
     * Set the list of 'PaymentRequisitions' element items. ��������� ��������� �����������
     * 
     * @param list
     */
    public void setPaymentRequisitionList(List<PaymentRequisitionsType> list) {
        paymentRequisitionList = list;
    }

    /** 
     * Get the 'PostalAddress' element value. �������� ������ ��������� (����� �������� �������� ���������������)
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� ������ ��������� (����� �������� �������� ���������������)
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
