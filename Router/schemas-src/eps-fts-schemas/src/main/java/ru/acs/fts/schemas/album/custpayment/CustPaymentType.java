
package ru.acs.fts.schemas.album.custpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * Сведения о суммах денежных средств, подлежащих уплате по декларации на товары
 */
public class CustPaymentType extends BaseDocType
{
    private String processID;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();
    private String documentModeID;

    /** 
     * Get the 'ProcessID' element value. Уникальный идентификатор процедуры ЭД (GUID)
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. Уникальный идентификатор процедуры ЭД (GUID)
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the list of 'Payment' element items. Сведения о платеже
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. Сведения о платеже
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
