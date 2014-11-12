
package ru.acs.fts.schemas.album.receiptpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��� ������ ���������� ��������
 */
public class ReceiptPaymentType extends BaseDocType
{
    private String checkNumber;
    private List<PaymentDocumentType> paymentDocumentList = new ArrayList<PaymentDocumentType>();
    private String documentModeID;

    /** 
     * Get the 'CheckNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /** 
     * Set the 'CheckNumber' element value. ����� ����
     * 
     * @param checkNumber
     */
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @return list
     */
    public List<PaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<PaymentDocumentType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
