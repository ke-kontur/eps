
package ru.acs.fts.schemas.album.accbalanceinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Информация об остатках на платежных поручениях участника ВЭД
 */
public class AccBalanceInfoType extends BaseDocType
{
    private String INN;
    private String KPP;
    private String responseStatus;
    private List<PaymentOrderType> paymentOrderList = new ArrayList<PaymentOrderType>();
    private String documentModeID;

    /** 
     * Get the 'INN' element value. Индивидуальный номер налогоплательщика 
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. Индивидуальный номер налогоплательщика 
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. КПП плательщика
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП плательщика
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'ResponseStatus' element value. Статус ответа.
     * 
     * @return value
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /** 
     * Set the 'ResponseStatus' element value. Статус ответа.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    /** 
     * Get the list of 'PaymentOrder' element items. Реквизиты платежного поручения
     * 
     * @return list
     */
    public List<PaymentOrderType> getPaymentOrderList() {
        return paymentOrderList;
    }

    /** 
     * Set the list of 'PaymentOrder' element items. Реквизиты платежного поручения
     * 
     * @param list
     */
    public void setPaymentOrderList(List<PaymentOrderType> list) {
        paymentOrderList = list;
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
