
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUDelayPaymentsType;

/** 
 * �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
 */
public class ESADoutCUPaymentsType
{
    private List<CustomsPaymentType> ESADoutCUCustomsPaymentList = new ArrayList<CustomsPaymentType>();
    private List<CUDelayPaymentsType> CUDelayPaymentList = new ArrayList<CUDelayPaymentsType>();

    /** 
     * Get the list of 'ESADout_CUCustomsPayment' element items. �������� �� ������. ��. �
     * 
     * @return list
     */
    public List<CustomsPaymentType> getESADoutCUCustomsPaymentList() {
        return ESADoutCUCustomsPaymentList;
    }

    /** 
     * Set the list of 'ESADout_CUCustomsPayment' element items. �������� �� ������. ��. �
     * 
     * @param list
     */
    public void setESADoutCUCustomsPaymentList(List<CustomsPaymentType> list) {
        ESADoutCUCustomsPaymentList = list;
    }

    /** 
     * Get the list of 'CUDelayPayments' element items. �������� �������� ��.48
     * 
     * @return list
     */
    public List<CUDelayPaymentsType> getCUDelayPaymentList() {
        return CUDelayPaymentList;
    }

    /** 
     * Set the list of 'CUDelayPayments' element items. �������� �������� ��.48
     * 
     * @param list
     */
    public void setCUDelayPaymentList(List<CUDelayPaymentsType> list) {
        CUDelayPaymentList = list;
    }
}
