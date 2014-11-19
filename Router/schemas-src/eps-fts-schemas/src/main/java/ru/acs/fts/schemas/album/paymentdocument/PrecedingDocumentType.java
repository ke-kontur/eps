
package ru.acs.fts.schemas.album.paymentdocument;

import java.util.ArrayList;
import java.util.List;

/** 
 * "�� - �������������� ��/�������������� ���/ �������������� ��"
 */
public class PrecedingDocumentType
{
    private String BCC;
    private RegistrationNumberType precedingRegistrationNumber;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();

    /** 
     * Get the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

    /** 
     * Get the 'PrecedingRegistrationNumber' element value. ��������������� ����� �������������� ��/���������� ����� ��������������� ��������������� ���/���������� ����� �������������� �������������� ��
     * 
     * @return value
     */
    public RegistrationNumberType getPrecedingRegistrationNumber() {
        return precedingRegistrationNumber;
    }

    /** 
     * Set the 'PrecedingRegistrationNumber' element value. ��������������� ����� �������������� ��/���������� ����� ��������������� ��������������� ���/���������� ����� �������������� �������������� ��
     * 
     * @param precedingRegistrationNumber
     */
    public void setPrecedingRegistrationNumber(
            RegistrationNumberType precedingRegistrationNumber) {
        this.precedingRegistrationNumber = precedingRegistrationNumber;
    }

    /** 
     * Get the list of 'Payment' element items. �������
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. �������
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }
}
