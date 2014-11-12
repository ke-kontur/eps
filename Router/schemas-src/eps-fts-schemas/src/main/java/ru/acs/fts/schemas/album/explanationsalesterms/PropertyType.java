
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Когда осуществляется переход права собственности от Продавца к Покупателю
 */
public class PropertyType
{
    private String dayShipping;
    private String dayPayment;
    private String otherDay;
    private String commentsOtherDay;

    /** 
     * Get the 'DayShipping' element value. Признак перехода права собственности от продавца к покупателю на день отгрузки
     * 
     * @return value
     */
    public String getDayShipping() {
        return dayShipping;
    }

    /** 
     * Set the 'DayShipping' element value. Признак перехода права собственности от продавца к покупателю на день отгрузки
     * 
     * @param dayShipping
     */
    public void setDayShipping(String dayShipping) {
        this.dayShipping = dayShipping;
    }

    /** 
     * Get the 'DayPayment' element value. Признак перехода права собственности от продавца к покупателю на день оплаты
     * 
     * @return value
     */
    public String getDayPayment() {
        return dayPayment;
    }

    /** 
     * Set the 'DayPayment' element value. Признак перехода права собственности от продавца к покупателю на день оплаты
     * 
     * @param dayPayment
     */
    public void setDayPayment(String dayPayment) {
        this.dayPayment = dayPayment;
    }

    /** 
     * Get the 'OtherDay' element value. Признак перехода права собственности от продавца к покупателю в иной день
     * 
     * @return value
     */
    public String getOtherDay() {
        return otherDay;
    }

    /** 
     * Set the 'OtherDay' element value. Признак перехода права собственности от продавца к покупателю в иной день
     * 
     * @param otherDay
     */
    public void setOtherDay(String otherDay) {
        this.otherDay = otherDay;
    }

    /** 
     * Get the 'CommentsOtherDay' element value. Иной день(подробности)
     * 
     * @return value
     */
    public String getCommentsOtherDay() {
        return commentsOtherDay;
    }

    /** 
     * Set the 'CommentsOtherDay' element value. Иной день(подробности)
     * 
     * @param commentsOtherDay
     */
    public void setCommentsOtherDay(String commentsOtherDay) {
        this.commentsOtherDay = commentsOtherDay;
    }
}
