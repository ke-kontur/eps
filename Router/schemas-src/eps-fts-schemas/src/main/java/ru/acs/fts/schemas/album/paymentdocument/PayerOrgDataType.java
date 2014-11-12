
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * Сведения о плательщике по платежному документу
 */
public class PayerOrgDataType
{
    private String payerITN;
    private String payerINN;
    private String payerKPP;

    /** 
     * Get the 'PayerITN' element value. ИТН плательщика по платежному документу
     * 
     * @return value
     */
    public String getPayerITN() {
        return payerITN;
    }

    /** 
     * Set the 'PayerITN' element value. ИТН плательщика по платежному документу
     * 
     * @param payerITN
     */
    public void setPayerITN(String payerITN) {
        this.payerITN = payerITN;
    }

    /** 
     * Get the 'PayerINN' element value. ИНН плательщика по платежному документу
     * 
     * @return value
     */
    public String getPayerINN() {
        return payerINN;
    }

    /** 
     * Set the 'PayerINN' element value. ИНН плательщика по платежному документу
     * 
     * @param payerINN
     */
    public void setPayerINN(String payerINN) {
        this.payerINN = payerINN;
    }

    /** 
     * Get the 'PayerKPP' element value. КПП плательщика по платежному документу
     * 
     * @return value
     */
    public String getPayerKPP() {
        return payerKPP;
    }

    /** 
     * Set the 'PayerKPP' element value. КПП плательщика по платежному документу
     * 
     * @param payerKPP
     */
    public void setPayerKPP(String payerKPP) {
        this.payerKPP = payerKPP;
    }
}
