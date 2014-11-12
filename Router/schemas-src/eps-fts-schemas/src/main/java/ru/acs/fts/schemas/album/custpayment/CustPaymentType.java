
package ru.acs.fts.schemas.album.custpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cardcommonaggregatetypes.BaseDocType;

/** 
 * �������� � ������ �������� �������, ���������� ������ �� ���������� �� ������
 */
public class CustPaymentType extends BaseDocType
{
    private String processID;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();
    private String documentModeID;

    /** 
     * Get the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. ���������� ������������� ��������� �� (GUID)
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the list of 'Payment' element items. �������� � �������
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. �������� � �������
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
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
