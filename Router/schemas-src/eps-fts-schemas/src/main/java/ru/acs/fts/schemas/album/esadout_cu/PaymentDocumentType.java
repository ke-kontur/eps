
package ru.acs.fts.schemas.album.esadout_cu;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� ��������
 */
public class PaymentDocumentType extends DocumentBaseType
{
    private LocalDate paymentDate;

    /** 
     * Get the 'PaymentDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /** 
     * Set the 'PaymentDate' element value. ���� ������
     * 
     * @param paymentDate
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
