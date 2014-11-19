
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUDelayPaymentsType;

/** 
 * ДТ и ТД. Внутренний формат. Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
 */
public class ESADinPaymentsType
{
    private List<CustomsPaymentType> ESADinCustomsPaymentList = new ArrayList<CustomsPaymentType>();
    private List<CUDelayPaymentsType> delayPaymentList = new ArrayList<CUDelayPaymentsType>();

    /** 
     * Get the list of 'ESADinCustomsPayment' element items. ДТ и ТД. Внутренний формат. Уплата таможенных платежей. Гр. В.
     * 
     * @return list
     */
    public List<CustomsPaymentType> getESADinCustomsPaymentList() {
        return ESADinCustomsPaymentList;
    }

    /** 
     * Set the list of 'ESADinCustomsPayment' element items. ДТ и ТД. Внутренний формат. Уплата таможенных платежей. Гр. В.
     * 
     * @param list
     */
    public void setESADinCustomsPaymentList(List<CustomsPaymentType> list) {
        ESADinCustomsPaymentList = list;
    }

    /** 
     * Get the list of 'DelayPayments' element items. Отсрочка платежей гр.48
     * 
     * @return list
     */
    public List<CUDelayPaymentsType> getDelayPaymentList() {
        return delayPaymentList;
    }

    /** 
     * Set the list of 'DelayPayments' element items. Отсрочка платежей гр.48
     * 
     * @param list
     */
    public void setDelayPaymentList(List<CUDelayPaymentsType> list) {
        delayPaymentList = list;
    }
}
