
package ru.acs.fts.schemas.album.kdtout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUDelayPaymentsType;

/** 
 * �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
 */
public class KTDoutPaymentsType
{
    private List<KDTSectionBCustomsPaymentType> KDToutCustomsPaymentList = new ArrayList<KDTSectionBCustomsPaymentType>();
    private CUDelayPaymentsType CUDelayPayments;

    /** 
     * Get the list of 'KDToutCustomsPayment' element items. ������ ���������� ��������. ��. �
     * 
     * @return list
     */
    public List<KDTSectionBCustomsPaymentType> getKDToutCustomsPaymentList() {
        return KDToutCustomsPaymentList;
    }

    /** 
     * Set the list of 'KDToutCustomsPayment' element items. ������ ���������� ��������. ��. �
     * 
     * @param list
     */
    public void setKDToutCustomsPaymentList(
            List<KDTSectionBCustomsPaymentType> list) {
        KDToutCustomsPaymentList = list;
    }

    /** 
     * Get the 'CUDelayPayments' element value. �������� �������� ��. 48
     * 
     * @return value
     */
    public CUDelayPaymentsType getCUDelayPayments() {
        return CUDelayPayments;
    }

    /** 
     * Set the 'CUDelayPayments' element value. �������� �������� ��. 48
     * 
     * @param CUDelayPayments
     */
    public void setCUDelayPayments(CUDelayPaymentsType CUDelayPayments) {
        this.CUDelayPayments = CUDelayPayments;
    }
}
