
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� �� ������������� ���������������� ������������� � ������� �������� ����� ������ ��������. ��.9
 */
public class DTSAdditionalPaymentsType
{
    private String column9A;
    private String column9B;
    private List<String> paymentDescriptionList = new ArrayList<String>();
    private List<String> paymentConditionDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'Column9A' element value. ����� 9�
     * 
     * @return value
     */
    public String getColumn9A() {
        return column9A;
    }

    /** 
     * Set the 'Column9A' element value. ����� 9�
     * 
     * @param column9A
     */
    public void setColumn9A(String column9A) {
        this.column9A = column9A;
    }

    /** 
     * Get the 'Column9B' element value. ����� 9�
     * 
     * @return value
     */
    public String getColumn9B() {
        return column9B;
    }

    /** 
     * Set the 'Column9B' element value. ����� 9�
     * 
     * @param column9B
     */
    public void setColumn9B(String column9B) {
        this.column9B = column9B;
    }

    /** 
     * Get the list of 'PaymentDescription' element items. ����������� �������� �� ������������� ���������������� �������������. ��.9�
     * 
     * @return list
     */
    public List<String> getPaymentDescriptionList() {
        return paymentDescriptionList;
    }

    /** 
     * Set the list of 'PaymentDescription' element items. ����������� �������� �� ������������� ���������������� �������������. ��.9�
     * 
     * @param list
     */
    public void setPaymentDescriptionList(List<String> list) {
        paymentDescriptionList = list;
    }

    /** 
     * Get the list of 'PaymentConditionDescription' element items. ����������� ������� �������� ����� ������ ����� ��� �������� ��������. ��.9�
     * 
     * @return list
     */
    public List<String> getPaymentConditionDescriptionList() {
        return paymentConditionDescriptionList;
    }

    /** 
     * Set the list of 'PaymentConditionDescription' element items. ����������� ������� �������� ����� ������ ����� ��� �������� ��������. ��.9�
     * 
     * @param list
     */
    public void setPaymentConditionDescriptionList(List<String> list) {
        paymentConditionDescriptionList = list;
    }
}
