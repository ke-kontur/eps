
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Сведения о плательщике
 */
public class InfoPayerType
{
    private String payerName;
    private String payerCode;

    /** 
     * Get the 'PayerName' element value. Наименование плательщика
     * 
     * @return value
     */
    public String getPayerName() {
        return payerName;
    }

    /** 
     * Set the 'PayerName' element value. Наименование плательщика
     * 
     * @param payerName
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    /** 
     * Get the 'PayerCode' element value. Код плательщика
     * 
     * @return value
     */
    public String getPayerCode() {
        return payerCode;
    }

    /** 
     * Set the 'PayerCode' element value. Код плательщика
     * 
     * @param payerCode
     */
    public void setPayerCode(String payerCode) {
        this.payerCode = payerCode;
    }
}
