
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * �������� � ���������/���������
 */
public class TerminalInfoType
{
    private String termenalNumber;
    private String postNumer;

    /** 
     * Get the 'TermenalNumber' element value. ����� ���������/���������
     * 
     * @return value
     */
    public String getTermenalNumber() {
        return termenalNumber;
    }

    /** 
     * Set the 'TermenalNumber' element value. ����� ���������/���������
     * 
     * @param termenalNumber
     */
    public void setTermenalNumber(String termenalNumber) {
        this.termenalNumber = termenalNumber;
    }

    /** 
     * Get the 'PostNumer' element value. ����� �����
     * 
     * @return value
     */
    public String getPostNumer() {
        return postNumer;
    }

    /** 
     * Set the 'PostNumer' element value. ����� �����
     * 
     * @param postNumer
     */
    public void setPostNumer(String postNumer) {
        this.postNumer = postNumer;
    }
}
