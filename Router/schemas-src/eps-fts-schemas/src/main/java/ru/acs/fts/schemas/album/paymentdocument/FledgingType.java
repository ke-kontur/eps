
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ������������ ��
 */
public class FledgingType extends CustomsPersonType
{
    private LocalDate endDate;
    private String completionSign;

    /** 
     * Get the 'EndDate' element value. ���� ������������ ��
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ������������ ��
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'CompletionSign' element value. ������� ���������� �������� ������������ ��: "true" - ��������; "false" - �� ��������
     * 
     * @return value
     */
    public String getCompletionSign() {
        return completionSign;
    }

    /** 
     * Set the 'CompletionSign' element value. ������� ���������� �������� ������������ ��: "true" - ��������; "false" - �� ��������
     * 
     * @param completionSign
     */
    public void setCompletionSign(String completionSign) {
        this.completionSign = completionSign;
    }
}
