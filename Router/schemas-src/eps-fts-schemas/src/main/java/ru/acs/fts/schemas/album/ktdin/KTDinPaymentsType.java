
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUDelayPaymentsType;

/** 
 * Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
 */
public class KTDinPaymentsType
{
    private CUDelayPaymentsType CUDelayPayments;
    private List<KDTSectionBCustomsPaymentType> KDTinCustomsPaymentList = new ArrayList<KDTSectionBCustomsPaymentType>();

    /** 
     * Get the 'CUDelayPayments' element value. Отсрочка платежей гр.48
     * 
     * @return value
     */
    public CUDelayPaymentsType getCUDelayPayments() {
        return CUDelayPayments;
    }

    /** 
     * Set the 'CUDelayPayments' element value. Отсрочка платежей гр.48
     * 
     * @param CUDelayPayments
     */
    public void setCUDelayPayments(CUDelayPaymentsType CUDelayPayments) {
        this.CUDelayPayments = CUDelayPayments;
    }

    /** 
     * Get the list of 'KDTinCustomsPayment' element items. Уплата таможенных платежей. Гр. В
     * 
     * @return list
     */
    public List<KDTSectionBCustomsPaymentType> getKDTinCustomsPaymentList() {
        return KDTinCustomsPaymentList;
    }

    /** 
     * Set the list of 'KDTinCustomsPayment' element items. Уплата таможенных платежей. Гр. В
     * 
     * @param list
     */
    public void setKDTinCustomsPaymentList(
            List<KDTSectionBCustomsPaymentType> list) {
        KDTinCustomsPaymentList = list;
    }
}
