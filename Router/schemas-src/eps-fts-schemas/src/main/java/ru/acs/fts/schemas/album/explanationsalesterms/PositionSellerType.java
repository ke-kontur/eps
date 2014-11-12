
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Отличие вызвано положением Продавца
 */
public class PositionSellerType
{
    private String fundsAvailable;
    private String glutWarehouse;
    private String bankruptcy;
    private String other;
    private String comments;

    /** 
     * Get the 'FundsAvailable' element value. Признак необходимости наличных средств
     * 
     * @return value
     */
    public String getFundsAvailable() {
        return fundsAvailable;
    }

    /** 
     * Set the 'FundsAvailable' element value. Признак необходимости наличных средств
     * 
     * @param fundsAvailable
     */
    public void setFundsAvailable(String fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    /** 
     * Get the 'GlutWarehouse' element value. Признак затоваривания складов
     * 
     * @return value
     */
    public String getGlutWarehouse() {
        return glutWarehouse;
    }

    /** 
     * Set the 'GlutWarehouse' element value. Признак затоваривания складов
     * 
     * @param glutWarehouse
     */
    public void setGlutWarehouse(String glutWarehouse) {
        this.glutWarehouse = glutWarehouse;
    }

    /** 
     * Get the 'Bankruptcy' element value. Признак банкротства
     * 
     * @return value
     */
    public String getBankruptcy() {
        return bankruptcy;
    }

    /** 
     * Set the 'Bankruptcy' element value. Признак банкротства
     * 
     * @param bankruptcy
     */
    public void setBankruptcy(String bankruptcy) {
        this.bankruptcy = bankruptcy;
    }

    /** 
     * Get the 'Other' element value. Отличие вызвано иным положением продавца
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Отличие вызвано иным положением продавца
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
