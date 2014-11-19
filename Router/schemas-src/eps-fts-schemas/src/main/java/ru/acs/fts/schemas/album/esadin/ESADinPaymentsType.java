
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUDelayPaymentsType;

/** 
 * �� � ��. ���������� ������. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �.
 */
public class ESADinPaymentsType
{
    private List<CustomsPaymentType> ESADinCustomsPaymentList = new ArrayList<CustomsPaymentType>();
    private List<CUDelayPaymentsType> delayPaymentList = new ArrayList<CUDelayPaymentsType>();

    /** 
     * Get the list of 'ESADinCustomsPayment' element items. �� � ��. ���������� ������. ������ ���������� ��������. ��. �.
     * 
     * @return list
     */
    public List<CustomsPaymentType> getESADinCustomsPaymentList() {
        return ESADinCustomsPaymentList;
    }

    /** 
     * Set the list of 'ESADinCustomsPayment' element items. �� � ��. ���������� ������. ������ ���������� ��������. ��. �.
     * 
     * @param list
     */
    public void setESADinCustomsPaymentList(List<CustomsPaymentType> list) {
        ESADinCustomsPaymentList = list;
    }

    /** 
     * Get the list of 'DelayPayments' element items. �������� �������� ��.48
     * 
     * @return list
     */
    public List<CUDelayPaymentsType> getDelayPaymentList() {
        return delayPaymentList;
    }

    /** 
     * Set the list of 'DelayPayments' element items. �������� �������� ��.48
     * 
     * @param list
     */
    public void setDelayPaymentList(List<CUDelayPaymentsType> list) {
        delayPaymentList = list;
    }
}
