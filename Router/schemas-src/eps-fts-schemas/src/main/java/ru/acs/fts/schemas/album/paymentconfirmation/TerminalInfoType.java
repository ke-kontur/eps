
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * Сведения о терминале/банкомате
 */
public class TerminalInfoType
{
    private String termenalNumber;
    private String postNumer;

    /** 
     * Get the 'TermenalNumber' element value. Номер терминала/банкомата
     * 
     * @return value
     */
    public String getTermenalNumber() {
        return termenalNumber;
    }

    /** 
     * Set the 'TermenalNumber' element value. Номер терминала/банкомата
     * 
     * @param termenalNumber
     */
    public void setTermenalNumber(String termenalNumber) {
        this.termenalNumber = termenalNumber;
    }

    /** 
     * Get the 'PostNumer' element value. Номер поста
     * 
     * @return value
     */
    public String getPostNumer() {
        return postNumer;
    }

    /** 
     * Set the 'PostNumer' element value. Номер поста
     * 
     * @param postNumer
     */
    public void setPostNumer(String postNumer) {
        this.postNumer = postNumer;
    }
}
