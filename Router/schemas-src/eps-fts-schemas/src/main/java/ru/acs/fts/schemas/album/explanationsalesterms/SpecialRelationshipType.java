
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Отличие вызвано особыми отношениями Продавца и покупателя
 */
public class SpecialRelationshipType
{
    private String cooperation;
    private String prepayment;
    private String extraDuty;
    private String other;
    private String comments;

    /** 
     * Get the 'Cooperation' element value. Признак наличия длительной истории сотрудничества
     * 
     * @return value
     */
    public String getCooperation() {
        return cooperation;
    }

    /** 
     * Set the 'Cooperation' element value. Признак наличия длительной истории сотрудничества
     * 
     * @param cooperation
     */
    public void setCooperation(String cooperation) {
        this.cooperation = cooperation;
    }

    /** 
     * Get the 'Prepayment' element value. Признак того, что покупатель предоставляет продавцу предоплату
     * 
     * @return value
     */
    public String getPrepayment() {
        return prepayment;
    }

    /** 
     * Set the 'Prepayment' element value. Признак того, что покупатель предоставляет продавцу предоплату
     * 
     * @param prepayment
     */
    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    /** 
     * Get the 'ExtraDuty' element value. Покупатель принимает дополнительные обязательства по объему продажи товаров
     * 
     * @return value
     */
    public String getExtraDuty() {
        return extraDuty;
    }

    /** 
     * Set the 'ExtraDuty' element value. Покупатель принимает дополнительные обязательства по объему продажи товаров
     * 
     * @param extraDuty
     */
    public void setExtraDuty(String extraDuty) {
        this.extraDuty = extraDuty;
    }

    /** 
     * Get the 'Other' element value. Отличие вызвано иными особыми отношениями продавца и покупателя
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Отличие вызвано иными особыми отношениями продавца и покупателя
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'Comments' element value. Иные (указать подробности)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Иные (указать подробности)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
