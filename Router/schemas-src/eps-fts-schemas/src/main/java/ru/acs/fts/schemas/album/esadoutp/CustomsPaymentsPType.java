
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADoutCUCustomsPaymentType;

/** 
 * Таможенные платежи к уплате
 */
public class CustomsPaymentsPType
{
    private List<ESADoutCUCustomsPaymentType> customsPaymentList = new ArrayList<ESADoutCUCustomsPaymentType>();

    /** 
     * Get the list of 'CustomsPayment' element items. Таможенные платежи
     * 
     * @return list
     */
    public List<ESADoutCUCustomsPaymentType> getCustomsPaymentList() {
        return customsPaymentList;
    }

    /** 
     * Set the list of 'CustomsPayment' element items. Таможенные платежи
     * 
     * @param list
     */
    public void setCustomsPaymentList(List<ESADoutCUCustomsPaymentType> list) {
        customsPaymentList = list;
    }
}
