
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Технические отметки для РБ
 */
public class RBTechMarKType extends DocumentBaseType
{
    private String delcKind;
    private String sumPayment;

    /** 
     * Get the 'DelcKind' element value. Вид корректировки в соответствии с классификатором видов корректировок
     * 
     * @return value
     */
    public String getDelcKind() {
        return delcKind;
    }

    /** 
     * Set the 'DelcKind' element value. Вид корректировки в соответствии с классификатором видов корректировок
     * 
     * @param delcKind
     */
    public void setDelcKind(String delcKind) {
        this.delcKind = delcKind;
    }

    /** 
     * Get the 'SumPayment' element value. Сумма подлежащая к уплате обеспечения. ТД
     * 
     * @return value
     */
    public String getSumPayment() {
        return sumPayment;
    }

    /** 
     * Set the 'SumPayment' element value. Сумма подлежащая к уплате обеспечения. ТД
     * 
     * @param sumPayment
     */
    public void setSumPayment(String sumPayment) {
        this.sumPayment = sumPayment;
    }
}
