
package ru.acs.fts.schemas.album.custpaymentsdk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Документ контроля платежей
 */
public class CustPaymentsDKType extends BaseDocType
{
    private List<PaymentDocumentType> paymentDocumentList = new ArrayList<PaymentDocumentType>();
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();
    private List<FineType> fineList = new ArrayList<FineType>();
    private List<PaymentDelayType> paymentDelayList = new ArrayList<PaymentDelayType>();
    private PrimaryListType primaryList;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the list of 'PaymentDocument' element items. Платежные поручения
     * 
     * @return list
     */
    public List<PaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. Платежные поручения
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<PaymentDocumentType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the list of 'Payment' element items. Платежи к уплате
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. Платежи к уплате
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }

    /** 
     * Get the list of 'Fine' element items. Пени
     * 
     * @return list
     */
    public List<FineType> getFineList() {
        return fineList;
    }

    /** 
     * Set the list of 'Fine' element items. Пени
     * 
     * @param list
     */
    public void setFineList(List<FineType> list) {
        fineList = list;
    }

    /** 
     * Get the list of 'PaymentDelay' element items. Отсрочки, рассрочки
     * 
     * @return list
     */
    public List<PaymentDelayType> getPaymentDelayList() {
        return paymentDelayList;
    }

    /** 
     * Set the list of 'PaymentDelay' element items. Отсрочки, рассрочки
     * 
     * @param list
     */
    public void setPaymentDelayList(List<PaymentDelayType> list) {
        paymentDelayList = list;
    }

    /** 
     * Get the 'PrimaryList' element value. Основные листы
     * 
     * @return value
     */
    public PrimaryListType getPrimaryList() {
        return primaryList;
    }

    /** 
     * Set the 'PrimaryList' element value. Основные листы
     * 
     * @param primaryList
     */
    public void setPrimaryList(PrimaryListType primaryList) {
        this.primaryList = primaryList;
    }

    /** 
     * Get the list of 'Goods' element items. Товар
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Номер ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
