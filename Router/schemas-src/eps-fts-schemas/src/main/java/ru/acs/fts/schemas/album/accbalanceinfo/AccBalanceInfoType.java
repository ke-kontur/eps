
package ru.acs.fts.schemas.album.accbalanceinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� �� �������� �� ��������� ���������� ��������� ���
 */
public class AccBalanceInfoType extends BaseDocType
{
    private String INN;
    private String KPP;
    private String responseStatus;
    private List<PaymentOrderType> paymentOrderList = new ArrayList<PaymentOrderType>();
    private String documentModeID;

    /** 
     * Get the 'INN' element value. �������������� ����� ����������������� 
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. �������������� ����� ����������������� 
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ��� �����������
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� �����������
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'ResponseStatus' element value. ������ ������.
     * 
     * @return value
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /** 
     * Set the 'ResponseStatus' element value. ������ ������.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    /** 
     * Get the list of 'PaymentOrder' element items. ��������� ���������� ���������
     * 
     * @return list
     */
    public List<PaymentOrderType> getPaymentOrderList() {
        return paymentOrderList;
    }

    /** 
     * Set the list of 'PaymentOrder' element items. ��������� ���������� ���������
     * 
     * @param list
     */
    public void setPaymentOrderList(List<PaymentOrderType> list) {
        paymentOrderList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
