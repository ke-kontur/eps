
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Формирование ДУ
 */
public class FledgingType extends CustomsPersonType
{
    private LocalDate endDate;
    private String completionSign;

    /** 
     * Get the 'EndDate' element value. Дата формирования ДУ
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата формирования ДУ
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'CompletionSign' element value. Признак завершения процесса формирования ДУ: "true" - завершен; "false" - не завершен
     * 
     * @return value
     */
    public String getCompletionSign() {
        return completionSign;
    }

    /** 
     * Set the 'CompletionSign' element value. Признак завершения процесса формирования ДУ: "true" - завершен; "false" - не завершен
     * 
     * @param completionSign
     */
    public void setCompletionSign(String completionSign) {
        this.completionSign = completionSign;
    }
}
