
package ru.acs.fts.schemas.album.chargeoffresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� �������� ������� � �������� ����� ��������� ���
 */
public class ChargeOffResultType extends BaseDocType
{
    private String customsCode;
    private ListStatusType responseStatus;
    private List<PaymentOrderType> paymentOrderList = new ArrayList<PaymentOrderType>();
    private List<CurrencyType> listCurrencyList = new ArrayList<CurrencyType>();
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ��������������� ������.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ��������������� ������.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'ResponseStatus' element value. ������ �������� ������.
     * 
     * @return value
     */
    public ListStatusType getResponseStatus() {
        return responseStatus;
    }

    /** 
     * Set the 'ResponseStatus' element value. ������ �������� ������.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(ListStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /** 
     * Get the list of 'PaymentOrder' element items. ��������� ���������
     * 
     * @return list
     */
    public List<PaymentOrderType> getPaymentOrderList() {
        return paymentOrderList;
    }

    /** 
     * Set the list of 'PaymentOrder' element items. ��������� ���������
     * 
     * @param list
     */
    public void setPaymentOrderList(List<PaymentOrderType> list) {
        paymentOrderList = list;
    }

    /** 
     * Get the list of 'ListCurrency' element items. ������ �����, �� ������� ������������ ������� ��� �������� ������� (������ ��� ������� D)
     * 
     * @return list
     */
    public List<CurrencyType> getListCurrencyList() {
        return listCurrencyList;
    }

    /** 
     * Set the list of 'ListCurrency' element items. ������ �����, �� ������� ������������ ������� ��� �������� ������� (������ ��� ������� D)
     * 
     * @param list
     */
    public void setListCurrencyList(List<CurrencyType> list) {
        listCurrencyList = list;
    }

    /** 
     * Get the 'GTDID' element value. ����� ��, ��� ������� ����������� �������� �������
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ����� ��, ��� ������� ����������� �������� �������
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
