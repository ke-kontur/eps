
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;

/** 
 * ���. ���������� ���������� ��������
 */
public class CUKTSCustomsPaymentCalculationType
        extends
            CUCustomsPaymentCalculationType
{
    private String precedingPaymentAmount;
    private String changeAmount;
    private String precedingPaymentCurrencyCode;
    private List<KTSPaymentDocumentType> paymentDocumentList = new ArrayList<KTSPaymentDocumentType>();

    /** 
     * Get the 'PrecedingPaymentAmount' element value. ���������� ����� �������
     * 
     * @return value
     */
    public String getPrecedingPaymentAmount() {
        return precedingPaymentAmount;
    }

    /** 
     * Set the 'PrecedingPaymentAmount' element value. ���������� ����� �������
     * 
     * @param precedingPaymentAmount
     */
    public void setPrecedingPaymentAmount(String precedingPaymentAmount) {
        this.precedingPaymentAmount = precedingPaymentAmount;
    }

    /** 
     * Get the 'ChangeAmount' element value. ��������� 
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. ��������� 
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the 'PrecedingPaymentCurrencyCode' element value. ��� ������ ���������� ����� �������
     * 
     * @return value
     */
    public String getPrecedingPaymentCurrencyCode() {
        return precedingPaymentCurrencyCode;
    }

    /** 
     * Set the 'PrecedingPaymentCurrencyCode' element value. ��� ������ ���������� ����� �������
     * 
     * @param precedingPaymentCurrencyCode
     */
    public void setPrecedingPaymentCurrencyCode(
            String precedingPaymentCurrencyCode) {
        this.precedingPaymentCurrencyCode = precedingPaymentCurrencyCode;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @return list
     */
    public List<KTSPaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<KTSPaymentDocumentType> list) {
        paymentDocumentList = list;
    }
}
